package w4;

import android.net.Uri;
import androidx.recyclerview.widget.RecyclerView;
import dc.w;
import java.io.IOException;
import java.util.Map;
import kotlin.coroutines.Continuation;
import okhttp3.CacheControl;
import okhttp3.Call;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.l0;
import qc.q;
import t4.o0;
import t4.p0;
import u4.a;
import w4.i;

/* compiled from: HttpUriFetcher.kt */
/* loaded from: classes.dex */
public final class k implements i {

    /* renamed from: f  reason: collision with root package name */
    public static final a f25380f = new a(null);

    /* renamed from: g  reason: collision with root package name */
    private static final CacheControl f25381g = new CacheControl.Builder().noCache().noStore().build();

    /* renamed from: h  reason: collision with root package name */
    private static final CacheControl f25382h = new CacheControl.Builder().noCache().onlyIfCached().build();

    /* renamed from: a  reason: collision with root package name */
    private final String f25383a;

    /* renamed from: b  reason: collision with root package name */
    private final b5.l f25384b;

    /* renamed from: c  reason: collision with root package name */
    private final dc.f<Call.Factory> f25385c;

    /* renamed from: d  reason: collision with root package name */
    private final dc.f<u4.a> f25386d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f25387e;

    /* compiled from: HttpUriFetcher.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }
    }

    /* compiled from: HttpUriFetcher.kt */
    /* loaded from: classes.dex */
    public static final class b implements i.a<Uri> {

        /* renamed from: a  reason: collision with root package name */
        private final dc.f<Call.Factory> f25388a;

        /* renamed from: b  reason: collision with root package name */
        private final dc.f<u4.a> f25389b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f25390c;

        /* JADX WARN: Multi-variable type inference failed */
        public b(dc.f<? extends Call.Factory> fVar, dc.f<? extends u4.a> fVar2, boolean z10) {
            this.f25388a = fVar;
            this.f25389b = fVar2;
            this.f25390c = z10;
        }

        private final boolean c(Uri uri) {
            if (!q.d(uri.getScheme(), "http") && !q.d(uri.getScheme(), "https")) {
                return false;
            }
            return true;
        }

        @Override // w4.i.a
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public i a(Uri uri, b5.l lVar, q4.g gVar) {
            if (!c(uri)) {
                return null;
            }
            return new k(uri.toString(), lVar, this.f25388a, this.f25389b, this.f25390c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: HttpUriFetcher.kt */
    @kotlin.coroutines.jvm.internal.f(c = "coil.fetch.HttpUriFetcher", f = "HttpUriFetcher.kt", l = {224}, m = "executeNetworkRequest")
    /* loaded from: classes.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f25391f;

        /* renamed from: p  reason: collision with root package name */
        int f25393p;

        c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f25391f = obj;
            this.f25393p |= RecyclerView.UNDEFINED_DURATION;
            return k.this.c(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: HttpUriFetcher.kt */
    @kotlin.coroutines.jvm.internal.f(c = "coil.fetch.HttpUriFetcher", f = "HttpUriFetcher.kt", l = {77, 106}, m = "fetch")
    /* loaded from: classes.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: f  reason: collision with root package name */
        Object f25394f;

        /* renamed from: m  reason: collision with root package name */
        Object f25395m;

        /* renamed from: p  reason: collision with root package name */
        Object f25396p;

        /* renamed from: q  reason: collision with root package name */
        /* synthetic */ Object f25397q;

        /* renamed from: s  reason: collision with root package name */
        int f25399s;

        d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f25397q = obj;
            this.f25399s |= RecyclerView.UNDEFINED_DURATION;
            return k.this.a(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public k(String str, b5.l lVar, dc.f<? extends Call.Factory> fVar, dc.f<? extends u4.a> fVar2, boolean z10) {
        this.f25383a = str;
        this.f25384b = lVar;
        this.f25385c = fVar;
        this.f25386d = fVar2;
        this.f25387e = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(okhttp3.Request r5, kotlin.coroutines.Continuation<? super okhttp3.Response> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof w4.k.c
            if (r0 == 0) goto L13
            r0 = r6
            w4.k$c r0 = (w4.k.c) r0
            int r1 = r0.f25393p
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25393p = r1
            goto L18
        L13:
            w4.k$c r0 = new w4.k$c
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f25391f
            java.lang.Object r1 = ic.b.d()
            int r2 = r0.f25393p
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            dc.n.b(r6)
            goto L72
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            dc.n.b(r6)
            boolean r6 = g5.l.r()
            if (r6 == 0) goto L5d
            b5.l r6 = r4.f25384b
            b5.a r6 = r6.k()
            boolean r6 = r6.getReadEnabled()
            if (r6 != 0) goto L57
            dc.f<okhttp3.Call$Factory> r6 = r4.f25385c
            java.lang.Object r6 = r6.getValue()
            okhttp3.Call$Factory r6 = (okhttp3.Call.Factory) r6
            okhttp3.Call r5 = r6.newCall(r5)
            okhttp3.Response r5 = com.google.firebase.perf.network.FirebasePerfOkHttpClient.execute(r5)
            goto L75
        L57:
            android.os.NetworkOnMainThreadException r5 = new android.os.NetworkOnMainThreadException
            r5.<init>()
            throw r5
        L5d:
            dc.f<okhttp3.Call$Factory> r6 = r4.f25385c
            java.lang.Object r6 = r6.getValue()
            okhttp3.Call$Factory r6 = (okhttp3.Call.Factory) r6
            okhttp3.Call r5 = r6.newCall(r5)
            r0.f25393p = r3
            java.lang.Object r6 = g5.b.a(r5, r0)
            if (r6 != r1) goto L72
            return r1
        L72:
            r5 = r6
            okhttp3.Response r5 = (okhttp3.Response) r5
        L75:
            boolean r6 = r5.isSuccessful()
            if (r6 != 0) goto L92
            int r6 = r5.code()
            r0 = 304(0x130, float:4.26E-43)
            if (r6 == r0) goto L92
            okhttp3.ResponseBody r6 = r5.body()
            if (r6 == 0) goto L8c
            g5.l.d(r6)
        L8c:
            coil.network.HttpException r6 = new coil.network.HttpException
            r6.<init>(r5)
            throw r6
        L92:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: w4.k.c(okhttp3.Request, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final String d() {
        String h10 = this.f25384b.h();
        if (h10 == null) {
            return this.f25383a;
        }
        return h10;
    }

    private final okio.j e() {
        u4.a value = this.f25386d.getValue();
        q.f(value);
        return value.c();
    }

    private final boolean g(Request request, Response response) {
        if (this.f25384b.i().getWriteEnabled() && (!this.f25387e || a5.b.f376c.c(request, response))) {
            return true;
        }
        return false;
    }

    private final Request h() {
        Request.Builder headers = new Request.Builder().url(this.f25383a).headers(this.f25384b.j());
        for (Map.Entry<Class<?>, Object> entry : this.f25384b.p().a().entrySet()) {
            Class<?> key = entry.getKey();
            q.g(key, "null cannot be cast to non-null type java.lang.Class<kotlin.Any>");
            headers.tag(key, entry.getValue());
        }
        boolean readEnabled = this.f25384b.i().getReadEnabled();
        boolean readEnabled2 = this.f25384b.k().getReadEnabled();
        if (!readEnabled2 && readEnabled) {
            headers.cacheControl(CacheControl.FORCE_CACHE);
        } else if (readEnabled2 && !readEnabled) {
            if (this.f25384b.i().getWriteEnabled()) {
                headers.cacheControl(CacheControl.FORCE_NETWORK);
            } else {
                headers.cacheControl(f25381g);
            }
        } else if (!readEnabled2 && !readEnabled) {
            headers.cacheControl(f25382h);
        }
        return headers.build();
    }

    private final a.c i() {
        u4.a value;
        if (!this.f25384b.i().getReadEnabled() || (value = this.f25386d.getValue()) == null) {
            return null;
        }
        return value.b(d());
    }

    private final a5.a j(a.c cVar) {
        Throwable th;
        a5.a aVar;
        try {
            okio.e d10 = l0.d(e().q(cVar.getMetadata()));
            try {
                aVar = new a5.a(d10);
                if (d10 != null) {
                    try {
                        d10.close();
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                th = null;
            } catch (Throwable th3) {
                if (d10 != null) {
                    try {
                        d10.close();
                    } catch (Throwable th4) {
                        dc.b.a(th3, th4);
                    }
                }
                th = th3;
                aVar = null;
            }
            if (th == null) {
                q.f(aVar);
                return aVar;
            }
            throw th;
        } catch (IOException unused) {
            return null;
        }
    }

    private final t4.f k(Response response) {
        if (response.networkResponse() != null) {
            return t4.f.NETWORK;
        }
        return t4.f.DISK;
    }

    private final o0 l(ResponseBody responseBody) {
        return p0.a(responseBody.source(), this.f25384b.g());
    }

    private final o0 m(a.c cVar) {
        return p0.c(cVar.getData(), e(), d(), cVar);
    }

    private final a.c n(a.c cVar, Request request, Response response, a5.a aVar) {
        a.b bVar;
        Throwable th;
        w wVar;
        Long l10;
        w wVar2;
        Throwable th2 = null;
        if (!g(request, response)) {
            if (cVar != null) {
                g5.l.d(cVar);
            }
            return null;
        }
        if (cVar != null) {
            bVar = cVar.S();
        } else {
            u4.a value = this.f25386d.getValue();
            if (value != null) {
                bVar = value.a(d());
            } else {
                bVar = null;
            }
        }
        try {
            if (bVar == null) {
                return null;
            }
            try {
                if (response.code() == 304 && aVar != null) {
                    Response build = response.newBuilder().headers(a5.b.f376c.a(aVar.d(), response.headers())).build();
                    okio.d c10 = l0.c(e().p(bVar.getMetadata(), false));
                    try {
                        new a5.a(build).g(c10);
                        wVar2 = w.f13270a;
                        if (c10 != null) {
                            try {
                                c10.close();
                            } catch (Throwable th3) {
                                th2 = th3;
                            }
                        }
                    } catch (Throwable th4) {
                        if (c10 != null) {
                            try {
                                c10.close();
                            } catch (Throwable th5) {
                                dc.b.a(th4, th5);
                            }
                        }
                        th2 = th4;
                        wVar2 = null;
                    }
                    if (th2 == null) {
                        q.f(wVar2);
                    } else {
                        throw th2;
                    }
                } else {
                    okio.d c11 = l0.c(e().p(bVar.getMetadata(), false));
                    try {
                        new a5.a(response).g(c11);
                        wVar = w.f13270a;
                        if (c11 != null) {
                            try {
                                c11.close();
                            } catch (Throwable th6) {
                                th = th6;
                            }
                        }
                        th = null;
                    } catch (Throwable th7) {
                        if (c11 != null) {
                            try {
                                c11.close();
                            } catch (Throwable th8) {
                                dc.b.a(th7, th8);
                            }
                        }
                        th = th7;
                        wVar = null;
                    }
                    if (th == null) {
                        q.f(wVar);
                        okio.d c12 = l0.c(e().p(bVar.getData(), false));
                        try {
                            ResponseBody body = response.body();
                            q.f(body);
                            l10 = Long.valueOf(body.source().H0(c12));
                            if (c12 != null) {
                                try {
                                    c12.close();
                                } catch (Throwable th9) {
                                    th2 = th9;
                                }
                            }
                        } catch (Throwable th10) {
                            if (c12 != null) {
                                try {
                                    c12.close();
                                } catch (Throwable th11) {
                                    dc.b.a(th10, th11);
                                }
                            }
                            th2 = th10;
                            l10 = null;
                        }
                        if (th2 == null) {
                            q.f(l10);
                        } else {
                            throw th2;
                        }
                    } else {
                        throw th;
                    }
                }
                return bVar.a();
            } catch (Exception e10) {
                g5.l.a(bVar);
                throw e10;
            }
        } finally {
            g5.l.d(response);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0127 A[Catch: Exception -> 0x019a, TryCatch #2 {Exception -> 0x019a, blocks: (B:68:0x017e, B:52:0x0119, B:54:0x0127, B:56:0x0135, B:57:0x0139, B:59:0x0143, B:61:0x014b, B:63:0x0163), top: B:85:0x0119 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0143 A[Catch: Exception -> 0x019a, TryCatch #2 {Exception -> 0x019a, blocks: (B:68:0x017e, B:52:0x0119, B:54:0x0127, B:56:0x0135, B:57:0x0139, B:59:0x0143, B:61:0x014b, B:63:0x0163), top: B:85:0x0119 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01a9  */
    @Override // w4.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(kotlin.coroutines.Continuation<? super w4.h> r13) {
        /*
            Method dump skipped, instructions count: 429
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w4.k.a(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0013, code lost:
    
        if (r2 != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String f(java.lang.String r5, okhttp3.MediaType r6) {
        /*
            r4 = this;
            r0 = 0
            if (r6 == 0) goto L8
            java.lang.String r6 = r6.toString()
            goto L9
        L8:
            r6 = r0
        L9:
            r1 = 2
            if (r6 == 0) goto L15
            java.lang.String r2 = "text/plain"
            r3 = 0
            boolean r2 = yc.m.F(r6, r2, r3, r1, r0)
            if (r2 == 0) goto L20
        L15:
            android.webkit.MimeTypeMap r2 = android.webkit.MimeTypeMap.getSingleton()
            java.lang.String r5 = g5.l.j(r2, r5)
            if (r5 == 0) goto L20
            return r5
        L20:
            if (r6 == 0) goto L28
            r5 = 59
            java.lang.String r0 = yc.m.N0(r6, r5, r0, r1, r0)
        L28:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: w4.k.f(java.lang.String, okhttp3.MediaType):java.lang.String");
    }
}
