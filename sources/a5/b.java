package a5;

import g5.l;
import g5.x;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import okhttp3.CacheControl;
import okhttp3.Headers;
import okhttp3.Request;
import okhttp3.Response;
import qc.h;
import qc.q;
import yc.v;

/* compiled from: CacheStrategy.kt */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: c  reason: collision with root package name */
    public static final a f376c = new a(null);

    /* renamed from: a  reason: collision with root package name */
    private final Request f377a;

    /* renamed from: b  reason: collision with root package name */
    private final a5.a f378b;

    /* compiled from: CacheStrategy.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }

        private final boolean d(String str) {
            boolean r10;
            boolean r11;
            boolean r12;
            r10 = v.r("Content-Length", str, true);
            if (!r10) {
                r11 = v.r("Content-Encoding", str, true);
                if (!r11) {
                    r12 = v.r("Content-Type", str, true);
                    if (r12) {
                        return true;
                    }
                    return false;
                }
                return true;
            }
            return true;
        }

        private final boolean e(String str) {
            boolean r10;
            boolean r11;
            boolean r12;
            boolean r13;
            boolean r14;
            boolean r15;
            boolean r16;
            boolean r17;
            r10 = v.r("Connection", str, true);
            if (!r10) {
                r11 = v.r("Keep-Alive", str, true);
                if (!r11) {
                    r12 = v.r("Proxy-Authenticate", str, true);
                    if (!r12) {
                        r13 = v.r("Proxy-Authorization", str, true);
                        if (!r13) {
                            r14 = v.r("TE", str, true);
                            if (!r14) {
                                r15 = v.r("Trailers", str, true);
                                if (!r15) {
                                    r16 = v.r("Transfer-Encoding", str, true);
                                    if (!r16) {
                                        r17 = v.r("Upgrade", str, true);
                                        if (!r17) {
                                            return true;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }

        public final Headers a(Headers headers, Headers headers2) {
            boolean r10;
            boolean F;
            Headers.Builder builder = new Headers.Builder();
            int size = headers.size();
            for (int i10 = 0; i10 < size; i10++) {
                String name = headers.name(i10);
                String value = headers.value(i10);
                r10 = v.r("Warning", name, true);
                if (r10) {
                    F = v.F(value, "1", false, 2, null);
                    if (F) {
                    }
                }
                if (d(name) || !e(name) || headers2.get(name) == null) {
                    builder.add(name, value);
                }
            }
            int size2 = headers2.size();
            for (int i11 = 0; i11 < size2; i11++) {
                String name2 = headers2.name(i11);
                if (!d(name2) && e(name2)) {
                    builder.add(name2, headers2.value(i11));
                }
            }
            return builder.build();
        }

        public final boolean b(Request request, a5.a aVar) {
            if (!request.cacheControl().noStore() && !aVar.a().noStore() && !q.d(aVar.d().get("Vary"), "*")) {
                return true;
            }
            return false;
        }

        public final boolean c(Request request, Response response) {
            if (!request.cacheControl().noStore() && !response.cacheControl().noStore() && !q.d(response.headers().get("Vary"), "*")) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: CacheStrategy.kt */
    /* renamed from: a5.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0004b {

        /* renamed from: a  reason: collision with root package name */
        private final Request f379a;

        /* renamed from: b  reason: collision with root package name */
        private final a5.a f380b;

        /* renamed from: c  reason: collision with root package name */
        private Date f381c;

        /* renamed from: d  reason: collision with root package name */
        private String f382d;

        /* renamed from: e  reason: collision with root package name */
        private Date f383e;

        /* renamed from: f  reason: collision with root package name */
        private String f384f;

        /* renamed from: g  reason: collision with root package name */
        private Date f385g;

        /* renamed from: h  reason: collision with root package name */
        private long f386h;

        /* renamed from: i  reason: collision with root package name */
        private long f387i;

        /* renamed from: j  reason: collision with root package name */
        private String f388j;

        /* renamed from: k  reason: collision with root package name */
        private int f389k;

        public C0004b(Request request, a5.a aVar) {
            boolean r10;
            boolean r11;
            boolean r12;
            boolean r13;
            boolean r14;
            this.f379a = request;
            this.f380b = aVar;
            this.f389k = -1;
            if (aVar != null) {
                this.f386h = aVar.e();
                this.f387i = aVar.c();
                Headers d10 = aVar.d();
                int size = d10.size();
                for (int i10 = 0; i10 < size; i10++) {
                    String name = d10.name(i10);
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
                                        this.f389k = l.z(d10.value(i10), -1);
                                    }
                                } else {
                                    this.f388j = d10.value(i10);
                                }
                            } else {
                                this.f383e = d10.getDate("Last-Modified");
                                this.f384f = d10.value(i10);
                            }
                        } else {
                            this.f385g = d10.getDate("Expires");
                        }
                    } else {
                        this.f381c = d10.getDate("Date");
                        this.f382d = d10.value(i10);
                    }
                }
            }
        }

        private final long a() {
            Date date = this.f381c;
            long j10 = 0;
            if (date != null) {
                j10 = Math.max(0L, this.f387i - date.getTime());
            }
            int i10 = this.f389k;
            if (i10 != -1) {
                j10 = Math.max(j10, TimeUnit.SECONDS.toMillis(i10));
            }
            return j10 + (this.f387i - this.f386h) + (x.f16220a.a() - this.f387i);
        }

        private final long c() {
            long j10;
            long j11;
            a5.a aVar = this.f380b;
            q.f(aVar);
            if (aVar.a().maxAgeSeconds() != -1) {
                return TimeUnit.SECONDS.toMillis(r0.maxAgeSeconds());
            }
            Date date = this.f385g;
            if (date != null) {
                Date date2 = this.f381c;
                if (date2 != null) {
                    j11 = date2.getTime();
                } else {
                    j11 = this.f387i;
                }
                long time = date.getTime() - j11;
                if (time <= 0) {
                    return 0L;
                }
                return time;
            } else if (this.f383e == null || this.f379a.url().query() != null) {
                return 0L;
            } else {
                Date date3 = this.f381c;
                if (date3 != null) {
                    j10 = date3.getTime();
                } else {
                    j10 = this.f386h;
                }
                Date date4 = this.f383e;
                q.f(date4);
                long time2 = j10 - date4.getTime();
                if (time2 <= 0) {
                    return 0L;
                }
                return time2 / 10;
            }
        }

        private final boolean d(Request request) {
            if (request.header("If-Modified-Since") == null && request.header("If-None-Match") == null) {
                return false;
            }
            return true;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [okhttp3.Request, qc.h, a5.a] */
        public final b b() {
            long j10;
            String str;
            ?? r12 = 0;
            if (this.f380b == null) {
                return new b(this.f379a, r12, r12);
            }
            if (this.f379a.isHttps() && !this.f380b.f()) {
                return new b(this.f379a, r12, r12);
            }
            CacheControl a10 = this.f380b.a();
            if (!b.f376c.b(this.f379a, this.f380b)) {
                return new b(this.f379a, r12, r12);
            }
            CacheControl cacheControl = this.f379a.cacheControl();
            if (!cacheControl.noCache() && !d(this.f379a)) {
                long a11 = a();
                long c10 = c();
                if (cacheControl.maxAgeSeconds() != -1) {
                    c10 = Math.min(c10, TimeUnit.SECONDS.toMillis(cacheControl.maxAgeSeconds()));
                }
                long j11 = 0;
                if (cacheControl.minFreshSeconds() != -1) {
                    j10 = TimeUnit.SECONDS.toMillis(cacheControl.minFreshSeconds());
                } else {
                    j10 = 0;
                }
                if (!a10.mustRevalidate() && cacheControl.maxStaleSeconds() != -1) {
                    j11 = TimeUnit.SECONDS.toMillis(cacheControl.maxStaleSeconds());
                }
                if (!a10.noCache() && a11 + j10 < c10 + j11) {
                    return new b(r12, this.f380b, r12);
                }
                String str2 = this.f388j;
                if (str2 != null) {
                    q.f(str2);
                    str = "If-None-Match";
                } else {
                    str = "If-Modified-Since";
                    if (this.f383e != null) {
                        str2 = this.f384f;
                        q.f(str2);
                    } else if (this.f381c != null) {
                        str2 = this.f382d;
                        q.f(str2);
                    } else {
                        return new b(this.f379a, r12, r12);
                    }
                }
                return new b(this.f379a.newBuilder().addHeader(str, str2).build(), this.f380b, r12);
            }
            return new b(this.f379a, r12, r12);
        }
    }

    public /* synthetic */ b(Request request, a5.a aVar, h hVar) {
        this(request, aVar);
    }

    public final a5.a a() {
        return this.f378b;
    }

    public final Request b() {
        return this.f377a;
    }

    private b(Request request, a5.a aVar) {
        this.f377a = request;
        this.f378b = aVar;
    }
}
