package okhttp3.internal.cache;

import java.util.Date;
import java.util.concurrent.TimeUnit;
import okhttp3.CacheControl;
import okhttp3.Headers;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.http.DatesKt;
import qc.h;
import qc.q;
import yc.v;

/* compiled from: CacheStrategy.kt */
/* loaded from: classes4.dex */
public final class CacheStrategy {
    public static final Companion Companion = new Companion(null);
    private final Response cacheResponse;
    private final Request networkRequest;

    /* compiled from: CacheStrategy.kt */
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }

        public final boolean isCacheable(Response response, Request request) {
            q.i(response, "response");
            q.i(request, "request");
            int code = response.code();
            if (code != 200 && code != 410 && code != 414 && code != 501 && code != 203 && code != 204) {
                if (code != 307) {
                    if (code != 308 && code != 404 && code != 405) {
                        switch (code) {
                            case 300:
                            case 301:
                                break;
                            case 302:
                                break;
                            default:
                                return false;
                        }
                    }
                }
                if (Response.header$default(response, "Expires", null, 2, null) == null && response.cacheControl().maxAgeSeconds() == -1 && !response.cacheControl().isPublic() && !response.cacheControl().isPrivate()) {
                    return false;
                }
            }
            if (response.cacheControl().noStore() || request.cacheControl().noStore()) {
                return false;
            }
            return true;
        }
    }

    /* compiled from: CacheStrategy.kt */
    /* loaded from: classes4.dex */
    public static final class Factory {
        private int ageSeconds;
        private final Response cacheResponse;
        private String etag;
        private Date expires;
        private Date lastModified;
        private String lastModifiedString;
        private final long nowMillis;
        private long receivedResponseMillis;
        private final Request request;
        private long sentRequestMillis;
        private Date servedDate;
        private String servedDateString;

        public Factory(long j10, Request request, Response response) {
            boolean r10;
            boolean r11;
            boolean r12;
            boolean r13;
            boolean r14;
            q.i(request, "request");
            this.nowMillis = j10;
            this.request = request;
            this.cacheResponse = response;
            this.ageSeconds = -1;
            if (response != null) {
                this.sentRequestMillis = response.sentRequestAtMillis();
                this.receivedResponseMillis = response.receivedResponseAtMillis();
                Headers headers = response.headers();
                int size = headers.size();
                int i10 = 0;
                while (i10 < size) {
                    int i11 = i10 + 1;
                    String name = headers.name(i10);
                    String value = headers.value(i10);
                    r10 = v.r(name, "Date", true);
                    if (!r10) {
                        r11 = v.r(name, "Expires", true);
                        if (!r11) {
                            r12 = v.r(name, "Last-Modified", true);
                            if (!r12) {
                                r13 = v.r(name, "ETag", true);
                                if (!r13) {
                                    r14 = v.r(name, "Age", true);
                                    if (r14) {
                                        this.ageSeconds = Util.toNonNegativeInt(value, -1);
                                    }
                                } else {
                                    this.etag = value;
                                }
                            } else {
                                this.lastModified = DatesKt.toHttpDateOrNull(value);
                                this.lastModifiedString = value;
                            }
                        } else {
                            this.expires = DatesKt.toHttpDateOrNull(value);
                        }
                    } else {
                        this.servedDate = DatesKt.toHttpDateOrNull(value);
                        this.servedDateString = value;
                    }
                    i10 = i11;
                }
            }
        }

        private final long cacheResponseAge() {
            Date date = this.servedDate;
            long j10 = 0;
            if (date != null) {
                j10 = Math.max(0L, this.receivedResponseMillis - date.getTime());
            }
            int i10 = this.ageSeconds;
            if (i10 != -1) {
                j10 = Math.max(j10, TimeUnit.SECONDS.toMillis(i10));
            }
            long j11 = this.receivedResponseMillis;
            return j10 + (j11 - this.sentRequestMillis) + (this.nowMillis - j11);
        }

        private final CacheStrategy computeCandidate() {
            long j10;
            String str;
            if (this.cacheResponse == null) {
                return new CacheStrategy(this.request, null);
            }
            if (this.request.isHttps() && this.cacheResponse.handshake() == null) {
                return new CacheStrategy(this.request, null);
            }
            if (!CacheStrategy.Companion.isCacheable(this.cacheResponse, this.request)) {
                return new CacheStrategy(this.request, null);
            }
            CacheControl cacheControl = this.request.cacheControl();
            if (!cacheControl.noCache() && !hasConditions(this.request)) {
                CacheControl cacheControl2 = this.cacheResponse.cacheControl();
                long cacheResponseAge = cacheResponseAge();
                long computeFreshnessLifetime = computeFreshnessLifetime();
                if (cacheControl.maxAgeSeconds() != -1) {
                    computeFreshnessLifetime = Math.min(computeFreshnessLifetime, TimeUnit.SECONDS.toMillis(cacheControl.maxAgeSeconds()));
                }
                long j11 = 0;
                if (cacheControl.minFreshSeconds() != -1) {
                    j10 = TimeUnit.SECONDS.toMillis(cacheControl.minFreshSeconds());
                } else {
                    j10 = 0;
                }
                if (!cacheControl2.mustRevalidate() && cacheControl.maxStaleSeconds() != -1) {
                    j11 = TimeUnit.SECONDS.toMillis(cacheControl.maxStaleSeconds());
                }
                if (!cacheControl2.noCache()) {
                    long j12 = j10 + cacheResponseAge;
                    if (j12 < j11 + computeFreshnessLifetime) {
                        Response.Builder newBuilder = this.cacheResponse.newBuilder();
                        if (j12 >= computeFreshnessLifetime) {
                            newBuilder.addHeader("Warning", "110 HttpURLConnection \"Response is stale\"");
                        }
                        if (cacheResponseAge > 86400000 && isFreshnessLifetimeHeuristic()) {
                            newBuilder.addHeader("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                        }
                        return new CacheStrategy(null, newBuilder.build());
                    }
                }
                String str2 = this.etag;
                if (str2 != null) {
                    str = "If-None-Match";
                } else {
                    if (this.lastModified != null) {
                        str2 = this.lastModifiedString;
                    } else if (this.servedDate != null) {
                        str2 = this.servedDateString;
                    } else {
                        return new CacheStrategy(this.request, null);
                    }
                    str = "If-Modified-Since";
                }
                Headers.Builder newBuilder2 = this.request.headers().newBuilder();
                q.f(str2);
                newBuilder2.addLenient$okhttp(str, str2);
                return new CacheStrategy(this.request.newBuilder().headers(newBuilder2.build()).build(), this.cacheResponse);
            }
            return new CacheStrategy(this.request, null);
        }

        private final long computeFreshnessLifetime() {
            long longValue;
            long longValue2;
            Response response = this.cacheResponse;
            q.f(response);
            if (response.cacheControl().maxAgeSeconds() != -1) {
                return TimeUnit.SECONDS.toMillis(r0.maxAgeSeconds());
            }
            Date date = this.expires;
            Long l10 = null;
            if (date != null) {
                Date date2 = this.servedDate;
                if (date2 != null) {
                    l10 = Long.valueOf(date2.getTime());
                }
                if (l10 == null) {
                    longValue2 = this.receivedResponseMillis;
                } else {
                    longValue2 = l10.longValue();
                }
                long time = date.getTime() - longValue2;
                if (time <= 0) {
                    return 0L;
                }
                return time;
            } else if (this.lastModified == null || this.cacheResponse.request().url().query() != null) {
                return 0L;
            } else {
                Date date3 = this.servedDate;
                if (date3 != null) {
                    l10 = Long.valueOf(date3.getTime());
                }
                if (l10 == null) {
                    longValue = this.sentRequestMillis;
                } else {
                    longValue = l10.longValue();
                }
                Date date4 = this.lastModified;
                q.f(date4);
                long time2 = longValue - date4.getTime();
                if (time2 <= 0) {
                    return 0L;
                }
                return time2 / 10;
            }
        }

        private final boolean hasConditions(Request request) {
            if (request.header("If-Modified-Since") == null && request.header("If-None-Match") == null) {
                return false;
            }
            return true;
        }

        private final boolean isFreshnessLifetimeHeuristic() {
            Response response = this.cacheResponse;
            q.f(response);
            if (response.cacheControl().maxAgeSeconds() == -1 && this.expires == null) {
                return true;
            }
            return false;
        }

        public final CacheStrategy compute() {
            CacheStrategy computeCandidate = computeCandidate();
            if (computeCandidate.getNetworkRequest() != null && this.request.cacheControl().onlyIfCached()) {
                return new CacheStrategy(null, null);
            }
            return computeCandidate;
        }

        public final Request getRequest$okhttp() {
            return this.request;
        }
    }

    public CacheStrategy(Request request, Response response) {
        this.networkRequest = request;
        this.cacheResponse = response;
    }

    public final Response getCacheResponse() {
        return this.cacheResponse;
    }

    public final Request getNetworkRequest() {
        return this.networkRequest;
    }
}
