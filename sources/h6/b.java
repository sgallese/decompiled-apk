package h6;

import java.io.IOException;

/* compiled from: AutoBatchedLogRequestEncoder.java */
/* loaded from: classes.dex */
public final class b implements c9.a {

    /* renamed from: a  reason: collision with root package name */
    public static final c9.a f16487a = new b();

    /* compiled from: AutoBatchedLogRequestEncoder.java */
    /* loaded from: classes.dex */
    private static final class a implements b9.c<h6.a> {

        /* renamed from: a  reason: collision with root package name */
        static final a f16488a = new a();

        /* renamed from: b  reason: collision with root package name */
        private static final b9.b f16489b = b9.b.d("sdkVersion");

        /* renamed from: c  reason: collision with root package name */
        private static final b9.b f16490c = b9.b.d("model");

        /* renamed from: d  reason: collision with root package name */
        private static final b9.b f16491d = b9.b.d("hardware");

        /* renamed from: e  reason: collision with root package name */
        private static final b9.b f16492e = b9.b.d("device");

        /* renamed from: f  reason: collision with root package name */
        private static final b9.b f16493f = b9.b.d("product");

        /* renamed from: g  reason: collision with root package name */
        private static final b9.b f16494g = b9.b.d("osBuild");

        /* renamed from: h  reason: collision with root package name */
        private static final b9.b f16495h = b9.b.d("manufacturer");

        /* renamed from: i  reason: collision with root package name */
        private static final b9.b f16496i = b9.b.d("fingerprint");

        /* renamed from: j  reason: collision with root package name */
        private static final b9.b f16497j = b9.b.d("locale");

        /* renamed from: k  reason: collision with root package name */
        private static final b9.b f16498k = b9.b.d("country");

        /* renamed from: l  reason: collision with root package name */
        private static final b9.b f16499l = b9.b.d("mccMnc");

        /* renamed from: m  reason: collision with root package name */
        private static final b9.b f16500m = b9.b.d("applicationBuild");

        private a() {
        }

        @Override // b9.c
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void a(h6.a aVar, b9.d dVar) throws IOException {
            dVar.a(f16489b, aVar.m());
            dVar.a(f16490c, aVar.j());
            dVar.a(f16491d, aVar.f());
            dVar.a(f16492e, aVar.d());
            dVar.a(f16493f, aVar.l());
            dVar.a(f16494g, aVar.k());
            dVar.a(f16495h, aVar.h());
            dVar.a(f16496i, aVar.e());
            dVar.a(f16497j, aVar.g());
            dVar.a(f16498k, aVar.c());
            dVar.a(f16499l, aVar.i());
            dVar.a(f16500m, aVar.b());
        }
    }

    /* compiled from: AutoBatchedLogRequestEncoder.java */
    /* renamed from: h6.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    private static final class C0391b implements b9.c<j> {

        /* renamed from: a  reason: collision with root package name */
        static final C0391b f16501a = new C0391b();

        /* renamed from: b  reason: collision with root package name */
        private static final b9.b f16502b = b9.b.d("logRequest");

        private C0391b() {
        }

        @Override // b9.c
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void a(j jVar, b9.d dVar) throws IOException {
            dVar.a(f16502b, jVar.c());
        }
    }

    /* compiled from: AutoBatchedLogRequestEncoder.java */
    /* loaded from: classes.dex */
    private static final class c implements b9.c<k> {

        /* renamed from: a  reason: collision with root package name */
        static final c f16503a = new c();

        /* renamed from: b  reason: collision with root package name */
        private static final b9.b f16504b = b9.b.d("clientType");

        /* renamed from: c  reason: collision with root package name */
        private static final b9.b f16505c = b9.b.d("androidClientInfo");

        private c() {
        }

        @Override // b9.c
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void a(k kVar, b9.d dVar) throws IOException {
            dVar.a(f16504b, kVar.c());
            dVar.a(f16505c, kVar.b());
        }
    }

    /* compiled from: AutoBatchedLogRequestEncoder.java */
    /* loaded from: classes.dex */
    private static final class d implements b9.c<l> {

        /* renamed from: a  reason: collision with root package name */
        static final d f16506a = new d();

        /* renamed from: b  reason: collision with root package name */
        private static final b9.b f16507b = b9.b.d("eventTimeMs");

        /* renamed from: c  reason: collision with root package name */
        private static final b9.b f16508c = b9.b.d("eventCode");

        /* renamed from: d  reason: collision with root package name */
        private static final b9.b f16509d = b9.b.d("eventUptimeMs");

        /* renamed from: e  reason: collision with root package name */
        private static final b9.b f16510e = b9.b.d("sourceExtension");

        /* renamed from: f  reason: collision with root package name */
        private static final b9.b f16511f = b9.b.d("sourceExtensionJsonProto3");

        /* renamed from: g  reason: collision with root package name */
        private static final b9.b f16512g = b9.b.d("timezoneOffsetSeconds");

        /* renamed from: h  reason: collision with root package name */
        private static final b9.b f16513h = b9.b.d("networkConnectionInfo");

        private d() {
        }

        @Override // b9.c
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void a(l lVar, b9.d dVar) throws IOException {
            dVar.e(f16507b, lVar.c());
            dVar.a(f16508c, lVar.b());
            dVar.e(f16509d, lVar.d());
            dVar.a(f16510e, lVar.f());
            dVar.a(f16511f, lVar.g());
            dVar.e(f16512g, lVar.h());
            dVar.a(f16513h, lVar.e());
        }
    }

    /* compiled from: AutoBatchedLogRequestEncoder.java */
    /* loaded from: classes.dex */
    private static final class e implements b9.c<m> {

        /* renamed from: a  reason: collision with root package name */
        static final e f16514a = new e();

        /* renamed from: b  reason: collision with root package name */
        private static final b9.b f16515b = b9.b.d("requestTimeMs");

        /* renamed from: c  reason: collision with root package name */
        private static final b9.b f16516c = b9.b.d("requestUptimeMs");

        /* renamed from: d  reason: collision with root package name */
        private static final b9.b f16517d = b9.b.d("clientInfo");

        /* renamed from: e  reason: collision with root package name */
        private static final b9.b f16518e = b9.b.d("logSource");

        /* renamed from: f  reason: collision with root package name */
        private static final b9.b f16519f = b9.b.d("logSourceName");

        /* renamed from: g  reason: collision with root package name */
        private static final b9.b f16520g = b9.b.d("logEvent");

        /* renamed from: h  reason: collision with root package name */
        private static final b9.b f16521h = b9.b.d("qosTier");

        private e() {
        }

        @Override // b9.c
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void a(m mVar, b9.d dVar) throws IOException {
            dVar.e(f16515b, mVar.g());
            dVar.e(f16516c, mVar.h());
            dVar.a(f16517d, mVar.b());
            dVar.a(f16518e, mVar.d());
            dVar.a(f16519f, mVar.e());
            dVar.a(f16520g, mVar.c());
            dVar.a(f16521h, mVar.f());
        }
    }

    /* compiled from: AutoBatchedLogRequestEncoder.java */
    /* loaded from: classes.dex */
    private static final class f implements b9.c<o> {

        /* renamed from: a  reason: collision with root package name */
        static final f f16522a = new f();

        /* renamed from: b  reason: collision with root package name */
        private static final b9.b f16523b = b9.b.d("networkType");

        /* renamed from: c  reason: collision with root package name */
        private static final b9.b f16524c = b9.b.d("mobileSubtype");

        private f() {
        }

        @Override // b9.c
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void a(o oVar, b9.d dVar) throws IOException {
            dVar.a(f16523b, oVar.c());
            dVar.a(f16524c, oVar.b());
        }
    }

    private b() {
    }

    @Override // c9.a
    public void a(c9.b<?> bVar) {
        C0391b c0391b = C0391b.f16501a;
        bVar.a(j.class, c0391b);
        bVar.a(h6.d.class, c0391b);
        e eVar = e.f16514a;
        bVar.a(m.class, eVar);
        bVar.a(g.class, eVar);
        c cVar = c.f16503a;
        bVar.a(k.class, cVar);
        bVar.a(h6.e.class, cVar);
        a aVar = a.f16488a;
        bVar.a(h6.a.class, aVar);
        bVar.a(h6.c.class, aVar);
        d dVar = d.f16506a;
        bVar.a(l.class, dVar);
        bVar.a(h6.f.class, dVar);
        f fVar = f.f16522a;
        bVar.a(o.class, fVar);
        bVar.a(i.class, fVar);
    }
}
