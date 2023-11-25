package okhttp3.internal.cache;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import okhttp3.Cache;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.Util;
import okhttp3.internal.cache.CacheStrategy;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http.HttpMethod;
import okhttp3.internal.http.RealResponseBody;
import okio.Source;
import okio.a1;
import okio.c;
import okio.d;
import okio.e;
import okio.l0;
import okio.y0;
import qc.h;
import qc.q;
import yc.v;

/* compiled from: CacheInterceptor.kt */
/* loaded from: classes4.dex */
public final class CacheInterceptor implements Interceptor {
    public static final Companion Companion = new Companion(null);
    private final Cache cache;

    /* compiled from: CacheInterceptor.kt */
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Headers combine(Headers headers, Headers headers2) {
            boolean r10;
            boolean F;
            Headers.Builder builder = new Headers.Builder();
            int size = headers.size();
            int i10 = 0;
            int i11 = 0;
            while (i11 < size) {
                int i12 = i11 + 1;
                String name = headers.name(i11);
                String value = headers.value(i11);
                r10 = v.r("Warning", name, true);
                if (r10) {
                    F = v.F(value, "1", false, 2, null);
                    if (F) {
                        i11 = i12;
                    }
                }
                if (isContentSpecificHeader(name) || !isEndToEnd(name) || headers2.get(name) == null) {
                    builder.addLenient$okhttp(name, value);
                }
                i11 = i12;
            }
            int size2 = headers2.size();
            while (i10 < size2) {
                int i13 = i10 + 1;
                String name2 = headers2.name(i10);
                if (!isContentSpecificHeader(name2) && isEndToEnd(name2)) {
                    builder.addLenient$okhttp(name2, headers2.value(i10));
                }
                i10 = i13;
            }
            return builder.build();
        }

        private final boolean isContentSpecificHeader(String str) {
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

        private final boolean isEndToEnd(String str) {
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

        /* JADX INFO: Access modifiers changed from: private */
        public final Response stripBody(Response response) {
            ResponseBody body;
            if (response == null) {
                body = null;
            } else {
                body = response.body();
            }
            if (body != null) {
                return response.newBuilder().body(null).build();
            }
            return response;
        }
    }

    public CacheInterceptor(Cache cache) {
        this.cache = cache;
    }

    private final Response cacheWritingResponse(final CacheRequest cacheRequest, Response response) throws IOException {
        if (cacheRequest == null) {
            return response;
        }
        y0 body = cacheRequest.body();
        ResponseBody body2 = response.body();
        q.f(body2);
        final e source = body2.source();
        final d c10 = l0.c(body);
        Source source2 = new Source() { // from class: okhttp3.internal.cache.CacheInterceptor$cacheWritingResponse$cacheWritingSource$1
            private boolean cacheRequestClosed;

            @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                if (!this.cacheRequestClosed && !Util.discard(this, 100, TimeUnit.MILLISECONDS)) {
                    this.cacheRequestClosed = true;
                    cacheRequest.abort();
                }
                e.this.close();
            }

            @Override // okio.Source
            public long read(c cVar, long j10) throws IOException {
                q.i(cVar, "sink");
                try {
                    long read = e.this.read(cVar, j10);
                    if (read == -1) {
                        if (!this.cacheRequestClosed) {
                            this.cacheRequestClosed = true;
                            c10.close();
                        }
                        return -1L;
                    }
                    cVar.j(c10.a(), cVar.s0() - read, read);
                    c10.J();
                    return read;
                } catch (IOException e10) {
                    if (!this.cacheRequestClosed) {
                        this.cacheRequestClosed = true;
                        cacheRequest.abort();
                    }
                    throw e10;
                }
            }

            @Override // okio.Source
            public a1 timeout() {
                return e.this.timeout();
            }
        };
        return response.newBuilder().body(new RealResponseBody(Response.header$default(response, "Content-Type", null, 2, null), response.body().contentLength(), l0.d(source2))).build();
    }

    public final Cache getCache$okhttp() {
        return this.cache;
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
        Response response;
        RealCall realCall;
        ResponseBody body;
        ResponseBody body2;
        q.i(chain, "chain");
        Call call = chain.call();
        Cache cache = this.cache;
        EventListener eventListener = null;
        if (cache == null) {
            response = null;
        } else {
            response = cache.get$okhttp(chain.request());
        }
        CacheStrategy compute = new CacheStrategy.Factory(System.currentTimeMillis(), chain.request(), response).compute();
        Request networkRequest = compute.getNetworkRequest();
        Response cacheResponse = compute.getCacheResponse();
        Cache cache2 = this.cache;
        if (cache2 != null) {
            cache2.trackResponse$okhttp(compute);
        }
        if (call instanceof RealCall) {
            realCall = (RealCall) call;
        } else {
            realCall = null;
        }
        if (realCall != null) {
            eventListener = realCall.getEventListener$okhttp();
        }
        if (eventListener == null) {
            eventListener = EventListener.NONE;
        }
        if (response != null && cacheResponse == null && (body2 = response.body()) != null) {
            Util.closeQuietly(body2);
        }
        if (networkRequest == null && cacheResponse == null) {
            Response build = new Response.Builder().request(chain.request()).protocol(Protocol.HTTP_1_1).code(504).message("Unsatisfiable Request (only-if-cached)").body(Util.EMPTY_RESPONSE).sentRequestAtMillis(-1L).receivedResponseAtMillis(System.currentTimeMillis()).build();
            eventListener.satisfactionFailure(call, build);
            return build;
        } else if (networkRequest == null) {
            q.f(cacheResponse);
            Response build2 = cacheResponse.newBuilder().cacheResponse(Companion.stripBody(cacheResponse)).build();
            eventListener.cacheHit(call, build2);
            return build2;
        } else {
            if (cacheResponse != null) {
                eventListener.cacheConditionalHit(call, cacheResponse);
            } else if (this.cache != null) {
                eventListener.cacheMiss(call);
            }
            try {
                Response proceed = chain.proceed(networkRequest);
                if (proceed == null && response != null && body != null) {
                }
                if (cacheResponse != null) {
                    boolean z10 = false;
                    if (proceed != null && proceed.code() == 304) {
                        z10 = true;
                    }
                    if (z10) {
                        Response.Builder newBuilder = cacheResponse.newBuilder();
                        Companion companion = Companion;
                        Response build3 = newBuilder.headers(companion.combine(cacheResponse.headers(), proceed.headers())).sentRequestAtMillis(proceed.sentRequestAtMillis()).receivedResponseAtMillis(proceed.receivedResponseAtMillis()).cacheResponse(companion.stripBody(cacheResponse)).networkResponse(companion.stripBody(proceed)).build();
                        ResponseBody body3 = proceed.body();
                        q.f(body3);
                        body3.close();
                        Cache cache3 = this.cache;
                        q.f(cache3);
                        cache3.trackConditionalCacheHit$okhttp();
                        this.cache.update$okhttp(cacheResponse, build3);
                        eventListener.cacheHit(call, build3);
                        return build3;
                    }
                    ResponseBody body4 = cacheResponse.body();
                    if (body4 != null) {
                        Util.closeQuietly(body4);
                    }
                }
                q.f(proceed);
                Response.Builder newBuilder2 = proceed.newBuilder();
                Companion companion2 = Companion;
                Response build4 = newBuilder2.cacheResponse(companion2.stripBody(cacheResponse)).networkResponse(companion2.stripBody(proceed)).build();
                if (this.cache != null) {
                    if (HttpHeaders.promisesBody(build4) && CacheStrategy.Companion.isCacheable(build4, networkRequest)) {
                        Response cacheWritingResponse = cacheWritingResponse(this.cache.put$okhttp(build4), build4);
                        if (cacheResponse != null) {
                            eventListener.cacheMiss(call);
                        }
                        return cacheWritingResponse;
                    } else if (HttpMethod.INSTANCE.invalidatesCache(networkRequest.method())) {
                        try {
                            this.cache.remove$okhttp(networkRequest);
                        } catch (IOException unused) {
                        }
                    }
                }
                return build4;
            } finally {
                if (response != null && (body = response.body()) != null) {
                    Util.closeQuietly(body);
                }
            }
        }
    }
}
