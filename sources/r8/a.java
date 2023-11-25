package r8;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.habitrpg.android.habitica.ui.activities.TaskFormActivity;
import java.io.IOException;
import r8.b0;

/* compiled from: AutoCrashlyticsReportEncoder.java */
/* loaded from: classes3.dex */
public final class a implements c9.a {

    /* renamed from: a  reason: collision with root package name */
    public static final c9.a f22181a = new a();

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* renamed from: r8.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    private static final class C0501a implements b9.c<b0.a.AbstractC0503a> {

        /* renamed from: a  reason: collision with root package name */
        static final C0501a f22182a = new C0501a();

        /* renamed from: b  reason: collision with root package name */
        private static final b9.b f22183b = b9.b.d("arch");

        /* renamed from: c  reason: collision with root package name */
        private static final b9.b f22184c = b9.b.d("libraryName");

        /* renamed from: d  reason: collision with root package name */
        private static final b9.b f22185d = b9.b.d("buildId");

        private C0501a() {
        }

        @Override // b9.c
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void a(b0.a.AbstractC0503a abstractC0503a, b9.d dVar) throws IOException {
            dVar.a(f22183b, abstractC0503a.b());
            dVar.a(f22184c, abstractC0503a.d());
            dVar.a(f22185d, abstractC0503a.c());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* loaded from: classes3.dex */
    private static final class b implements b9.c<b0.a> {

        /* renamed from: a  reason: collision with root package name */
        static final b f22186a = new b();

        /* renamed from: b  reason: collision with root package name */
        private static final b9.b f22187b = b9.b.d("pid");

        /* renamed from: c  reason: collision with root package name */
        private static final b9.b f22188c = b9.b.d("processName");

        /* renamed from: d  reason: collision with root package name */
        private static final b9.b f22189d = b9.b.d("reasonCode");

        /* renamed from: e  reason: collision with root package name */
        private static final b9.b f22190e = b9.b.d("importance");

        /* renamed from: f  reason: collision with root package name */
        private static final b9.b f22191f = b9.b.d("pss");

        /* renamed from: g  reason: collision with root package name */
        private static final b9.b f22192g = b9.b.d("rss");

        /* renamed from: h  reason: collision with root package name */
        private static final b9.b f22193h = b9.b.d("timestamp");

        /* renamed from: i  reason: collision with root package name */
        private static final b9.b f22194i = b9.b.d("traceFile");

        /* renamed from: j  reason: collision with root package name */
        private static final b9.b f22195j = b9.b.d("buildIdMappingForArch");

        private b() {
        }

        @Override // b9.c
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void a(b0.a aVar, b9.d dVar) throws IOException {
            dVar.c(f22187b, aVar.d());
            dVar.a(f22188c, aVar.e());
            dVar.c(f22189d, aVar.g());
            dVar.c(f22190e, aVar.c());
            dVar.e(f22191f, aVar.f());
            dVar.e(f22192g, aVar.h());
            dVar.e(f22193h, aVar.i());
            dVar.a(f22194i, aVar.j());
            dVar.a(f22195j, aVar.b());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* loaded from: classes3.dex */
    private static final class c implements b9.c<b0.c> {

        /* renamed from: a  reason: collision with root package name */
        static final c f22196a = new c();

        /* renamed from: b  reason: collision with root package name */
        private static final b9.b f22197b = b9.b.d("key");

        /* renamed from: c  reason: collision with root package name */
        private static final b9.b f22198c = b9.b.d(AppMeasurementSdk.ConditionalUserProperty.VALUE);

        private c() {
        }

        @Override // b9.c
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void a(b0.c cVar, b9.d dVar) throws IOException {
            dVar.a(f22197b, cVar.b());
            dVar.a(f22198c, cVar.c());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* loaded from: classes3.dex */
    private static final class d implements b9.c<b0> {

        /* renamed from: a  reason: collision with root package name */
        static final d f22199a = new d();

        /* renamed from: b  reason: collision with root package name */
        private static final b9.b f22200b = b9.b.d("sdkVersion");

        /* renamed from: c  reason: collision with root package name */
        private static final b9.b f22201c = b9.b.d("gmpAppId");

        /* renamed from: d  reason: collision with root package name */
        private static final b9.b f22202d = b9.b.d("platform");

        /* renamed from: e  reason: collision with root package name */
        private static final b9.b f22203e = b9.b.d("installationUuid");

        /* renamed from: f  reason: collision with root package name */
        private static final b9.b f22204f = b9.b.d("buildVersion");

        /* renamed from: g  reason: collision with root package name */
        private static final b9.b f22205g = b9.b.d("displayVersion");

        /* renamed from: h  reason: collision with root package name */
        private static final b9.b f22206h = b9.b.d("session");

        /* renamed from: i  reason: collision with root package name */
        private static final b9.b f22207i = b9.b.d("ndkPayload");

        /* renamed from: j  reason: collision with root package name */
        private static final b9.b f22208j = b9.b.d("appExitInfo");

        private d() {
        }

        @Override // b9.c
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void a(b0 b0Var, b9.d dVar) throws IOException {
            dVar.a(f22200b, b0Var.j());
            dVar.a(f22201c, b0Var.f());
            dVar.c(f22202d, b0Var.i());
            dVar.a(f22203e, b0Var.g());
            dVar.a(f22204f, b0Var.d());
            dVar.a(f22205g, b0Var.e());
            dVar.a(f22206h, b0Var.k());
            dVar.a(f22207i, b0Var.h());
            dVar.a(f22208j, b0Var.c());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* loaded from: classes3.dex */
    private static final class e implements b9.c<b0.d> {

        /* renamed from: a  reason: collision with root package name */
        static final e f22209a = new e();

        /* renamed from: b  reason: collision with root package name */
        private static final b9.b f22210b = b9.b.d("files");

        /* renamed from: c  reason: collision with root package name */
        private static final b9.b f22211c = b9.b.d("orgId");

        private e() {
        }

        @Override // b9.c
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void a(b0.d dVar, b9.d dVar2) throws IOException {
            dVar2.a(f22210b, dVar.b());
            dVar2.a(f22211c, dVar.c());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* loaded from: classes3.dex */
    private static final class f implements b9.c<b0.d.b> {

        /* renamed from: a  reason: collision with root package name */
        static final f f22212a = new f();

        /* renamed from: b  reason: collision with root package name */
        private static final b9.b f22213b = b9.b.d("filename");

        /* renamed from: c  reason: collision with root package name */
        private static final b9.b f22214c = b9.b.d("contents");

        private f() {
        }

        @Override // b9.c
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void a(b0.d.b bVar, b9.d dVar) throws IOException {
            dVar.a(f22213b, bVar.c());
            dVar.a(f22214c, bVar.b());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* loaded from: classes3.dex */
    private static final class g implements b9.c<b0.e.a> {

        /* renamed from: a  reason: collision with root package name */
        static final g f22215a = new g();

        /* renamed from: b  reason: collision with root package name */
        private static final b9.b f22216b = b9.b.d("identifier");

        /* renamed from: c  reason: collision with root package name */
        private static final b9.b f22217c = b9.b.d("version");

        /* renamed from: d  reason: collision with root package name */
        private static final b9.b f22218d = b9.b.d("displayVersion");

        /* renamed from: e  reason: collision with root package name */
        private static final b9.b f22219e = b9.b.d("organization");

        /* renamed from: f  reason: collision with root package name */
        private static final b9.b f22220f = b9.b.d("installationUuid");

        /* renamed from: g  reason: collision with root package name */
        private static final b9.b f22221g = b9.b.d("developmentPlatform");

        /* renamed from: h  reason: collision with root package name */
        private static final b9.b f22222h = b9.b.d("developmentPlatformVersion");

        private g() {
        }

        @Override // b9.c
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void a(b0.e.a aVar, b9.d dVar) throws IOException {
            dVar.a(f22216b, aVar.e());
            dVar.a(f22217c, aVar.h());
            dVar.a(f22218d, aVar.d());
            dVar.a(f22219e, aVar.g());
            dVar.a(f22220f, aVar.f());
            dVar.a(f22221g, aVar.b());
            dVar.a(f22222h, aVar.c());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* loaded from: classes3.dex */
    private static final class h implements b9.c<b0.e.a.b> {

        /* renamed from: a  reason: collision with root package name */
        static final h f22223a = new h();

        /* renamed from: b  reason: collision with root package name */
        private static final b9.b f22224b = b9.b.d("clsId");

        private h() {
        }

        @Override // b9.c
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void a(b0.e.a.b bVar, b9.d dVar) throws IOException {
            dVar.a(f22224b, bVar.a());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* loaded from: classes3.dex */
    private static final class i implements b9.c<b0.e.c> {

        /* renamed from: a  reason: collision with root package name */
        static final i f22225a = new i();

        /* renamed from: b  reason: collision with root package name */
        private static final b9.b f22226b = b9.b.d("arch");

        /* renamed from: c  reason: collision with root package name */
        private static final b9.b f22227c = b9.b.d("model");

        /* renamed from: d  reason: collision with root package name */
        private static final b9.b f22228d = b9.b.d("cores");

        /* renamed from: e  reason: collision with root package name */
        private static final b9.b f22229e = b9.b.d("ram");

        /* renamed from: f  reason: collision with root package name */
        private static final b9.b f22230f = b9.b.d("diskSpace");

        /* renamed from: g  reason: collision with root package name */
        private static final b9.b f22231g = b9.b.d("simulator");

        /* renamed from: h  reason: collision with root package name */
        private static final b9.b f22232h = b9.b.d("state");

        /* renamed from: i  reason: collision with root package name */
        private static final b9.b f22233i = b9.b.d("manufacturer");

        /* renamed from: j  reason: collision with root package name */
        private static final b9.b f22234j = b9.b.d("modelClass");

        private i() {
        }

        @Override // b9.c
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void a(b0.e.c cVar, b9.d dVar) throws IOException {
            dVar.c(f22226b, cVar.b());
            dVar.a(f22227c, cVar.f());
            dVar.c(f22228d, cVar.c());
            dVar.e(f22229e, cVar.h());
            dVar.e(f22230f, cVar.d());
            dVar.f(f22231g, cVar.j());
            dVar.c(f22232h, cVar.i());
            dVar.a(f22233i, cVar.e());
            dVar.a(f22234j, cVar.g());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* loaded from: classes3.dex */
    private static final class j implements b9.c<b0.e> {

        /* renamed from: a  reason: collision with root package name */
        static final j f22235a = new j();

        /* renamed from: b  reason: collision with root package name */
        private static final b9.b f22236b = b9.b.d("generator");

        /* renamed from: c  reason: collision with root package name */
        private static final b9.b f22237c = b9.b.d("identifier");

        /* renamed from: d  reason: collision with root package name */
        private static final b9.b f22238d = b9.b.d("startedAt");

        /* renamed from: e  reason: collision with root package name */
        private static final b9.b f22239e = b9.b.d("endedAt");

        /* renamed from: f  reason: collision with root package name */
        private static final b9.b f22240f = b9.b.d("crashed");

        /* renamed from: g  reason: collision with root package name */
        private static final b9.b f22241g = b9.b.d("app");

        /* renamed from: h  reason: collision with root package name */
        private static final b9.b f22242h = b9.b.d("user");

        /* renamed from: i  reason: collision with root package name */
        private static final b9.b f22243i = b9.b.d("os");

        /* renamed from: j  reason: collision with root package name */
        private static final b9.b f22244j = b9.b.d("device");

        /* renamed from: k  reason: collision with root package name */
        private static final b9.b f22245k = b9.b.d("events");

        /* renamed from: l  reason: collision with root package name */
        private static final b9.b f22246l = b9.b.d("generatorType");

        private j() {
        }

        @Override // b9.c
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void a(b0.e eVar, b9.d dVar) throws IOException {
            dVar.a(f22236b, eVar.f());
            dVar.a(f22237c, eVar.i());
            dVar.e(f22238d, eVar.k());
            dVar.a(f22239e, eVar.d());
            dVar.f(f22240f, eVar.m());
            dVar.a(f22241g, eVar.b());
            dVar.a(f22242h, eVar.l());
            dVar.a(f22243i, eVar.j());
            dVar.a(f22244j, eVar.c());
            dVar.a(f22245k, eVar.e());
            dVar.c(f22246l, eVar.g());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* loaded from: classes3.dex */
    private static final class k implements b9.c<b0.e.d.a> {

        /* renamed from: a  reason: collision with root package name */
        static final k f22247a = new k();

        /* renamed from: b  reason: collision with root package name */
        private static final b9.b f22248b = b9.b.d("execution");

        /* renamed from: c  reason: collision with root package name */
        private static final b9.b f22249c = b9.b.d("customAttributes");

        /* renamed from: d  reason: collision with root package name */
        private static final b9.b f22250d = b9.b.d("internalKeys");

        /* renamed from: e  reason: collision with root package name */
        private static final b9.b f22251e = b9.b.d("background");

        /* renamed from: f  reason: collision with root package name */
        private static final b9.b f22252f = b9.b.d("uiOrientation");

        private k() {
        }

        @Override // b9.c
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void a(b0.e.d.a aVar, b9.d dVar) throws IOException {
            dVar.a(f22248b, aVar.d());
            dVar.a(f22249c, aVar.c());
            dVar.a(f22250d, aVar.e());
            dVar.a(f22251e, aVar.b());
            dVar.c(f22252f, aVar.f());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* loaded from: classes3.dex */
    private static final class l implements b9.c<b0.e.d.a.b.AbstractC0507a> {

        /* renamed from: a  reason: collision with root package name */
        static final l f22253a = new l();

        /* renamed from: b  reason: collision with root package name */
        private static final b9.b f22254b = b9.b.d("baseAddress");

        /* renamed from: c  reason: collision with root package name */
        private static final b9.b f22255c = b9.b.d("size");

        /* renamed from: d  reason: collision with root package name */
        private static final b9.b f22256d = b9.b.d(AppMeasurementSdk.ConditionalUserProperty.NAME);

        /* renamed from: e  reason: collision with root package name */
        private static final b9.b f22257e = b9.b.d("uuid");

        private l() {
        }

        @Override // b9.c
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void a(b0.e.d.a.b.AbstractC0507a abstractC0507a, b9.d dVar) throws IOException {
            dVar.e(f22254b, abstractC0507a.b());
            dVar.e(f22255c, abstractC0507a.d());
            dVar.a(f22256d, abstractC0507a.c());
            dVar.a(f22257e, abstractC0507a.f());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* loaded from: classes3.dex */
    private static final class m implements b9.c<b0.e.d.a.b> {

        /* renamed from: a  reason: collision with root package name */
        static final m f22258a = new m();

        /* renamed from: b  reason: collision with root package name */
        private static final b9.b f22259b = b9.b.d("threads");

        /* renamed from: c  reason: collision with root package name */
        private static final b9.b f22260c = b9.b.d("exception");

        /* renamed from: d  reason: collision with root package name */
        private static final b9.b f22261d = b9.b.d("appExitInfo");

        /* renamed from: e  reason: collision with root package name */
        private static final b9.b f22262e = b9.b.d("signal");

        /* renamed from: f  reason: collision with root package name */
        private static final b9.b f22263f = b9.b.d("binaries");

        private m() {
        }

        @Override // b9.c
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void a(b0.e.d.a.b bVar, b9.d dVar) throws IOException {
            dVar.a(f22259b, bVar.f());
            dVar.a(f22260c, bVar.d());
            dVar.a(f22261d, bVar.b());
            dVar.a(f22262e, bVar.e());
            dVar.a(f22263f, bVar.c());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* loaded from: classes3.dex */
    private static final class n implements b9.c<b0.e.d.a.b.c> {

        /* renamed from: a  reason: collision with root package name */
        static final n f22264a = new n();

        /* renamed from: b  reason: collision with root package name */
        private static final b9.b f22265b = b9.b.d(TaskFormActivity.TASK_TYPE_KEY);

        /* renamed from: c  reason: collision with root package name */
        private static final b9.b f22266c = b9.b.d("reason");

        /* renamed from: d  reason: collision with root package name */
        private static final b9.b f22267d = b9.b.d("frames");

        /* renamed from: e  reason: collision with root package name */
        private static final b9.b f22268e = b9.b.d("causedBy");

        /* renamed from: f  reason: collision with root package name */
        private static final b9.b f22269f = b9.b.d("overflowCount");

        private n() {
        }

        @Override // b9.c
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void a(b0.e.d.a.b.c cVar, b9.d dVar) throws IOException {
            dVar.a(f22265b, cVar.f());
            dVar.a(f22266c, cVar.e());
            dVar.a(f22267d, cVar.c());
            dVar.a(f22268e, cVar.b());
            dVar.c(f22269f, cVar.d());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* loaded from: classes3.dex */
    private static final class o implements b9.c<b0.e.d.a.b.AbstractC0511d> {

        /* renamed from: a  reason: collision with root package name */
        static final o f22270a = new o();

        /* renamed from: b  reason: collision with root package name */
        private static final b9.b f22271b = b9.b.d(AppMeasurementSdk.ConditionalUserProperty.NAME);

        /* renamed from: c  reason: collision with root package name */
        private static final b9.b f22272c = b9.b.d("code");

        /* renamed from: d  reason: collision with root package name */
        private static final b9.b f22273d = b9.b.d("address");

        private o() {
        }

        @Override // b9.c
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void a(b0.e.d.a.b.AbstractC0511d abstractC0511d, b9.d dVar) throws IOException {
            dVar.a(f22271b, abstractC0511d.d());
            dVar.a(f22272c, abstractC0511d.c());
            dVar.e(f22273d, abstractC0511d.b());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* loaded from: classes3.dex */
    private static final class p implements b9.c<b0.e.d.a.b.AbstractC0513e> {

        /* renamed from: a  reason: collision with root package name */
        static final p f22274a = new p();

        /* renamed from: b  reason: collision with root package name */
        private static final b9.b f22275b = b9.b.d(AppMeasurementSdk.ConditionalUserProperty.NAME);

        /* renamed from: c  reason: collision with root package name */
        private static final b9.b f22276c = b9.b.d("importance");

        /* renamed from: d  reason: collision with root package name */
        private static final b9.b f22277d = b9.b.d("frames");

        private p() {
        }

        @Override // b9.c
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void a(b0.e.d.a.b.AbstractC0513e abstractC0513e, b9.d dVar) throws IOException {
            dVar.a(f22275b, abstractC0513e.d());
            dVar.c(f22276c, abstractC0513e.c());
            dVar.a(f22277d, abstractC0513e.b());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* loaded from: classes3.dex */
    private static final class q implements b9.c<b0.e.d.a.b.AbstractC0513e.AbstractC0515b> {

        /* renamed from: a  reason: collision with root package name */
        static final q f22278a = new q();

        /* renamed from: b  reason: collision with root package name */
        private static final b9.b f22279b = b9.b.d("pc");

        /* renamed from: c  reason: collision with root package name */
        private static final b9.b f22280c = b9.b.d("symbol");

        /* renamed from: d  reason: collision with root package name */
        private static final b9.b f22281d = b9.b.d("file");

        /* renamed from: e  reason: collision with root package name */
        private static final b9.b f22282e = b9.b.d("offset");

        /* renamed from: f  reason: collision with root package name */
        private static final b9.b f22283f = b9.b.d("importance");

        private q() {
        }

        @Override // b9.c
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void a(b0.e.d.a.b.AbstractC0513e.AbstractC0515b abstractC0515b, b9.d dVar) throws IOException {
            dVar.e(f22279b, abstractC0515b.e());
            dVar.a(f22280c, abstractC0515b.f());
            dVar.a(f22281d, abstractC0515b.b());
            dVar.e(f22282e, abstractC0515b.d());
            dVar.c(f22283f, abstractC0515b.c());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* loaded from: classes3.dex */
    private static final class r implements b9.c<b0.e.d.c> {

        /* renamed from: a  reason: collision with root package name */
        static final r f22284a = new r();

        /* renamed from: b  reason: collision with root package name */
        private static final b9.b f22285b = b9.b.d("batteryLevel");

        /* renamed from: c  reason: collision with root package name */
        private static final b9.b f22286c = b9.b.d("batteryVelocity");

        /* renamed from: d  reason: collision with root package name */
        private static final b9.b f22287d = b9.b.d("proximityOn");

        /* renamed from: e  reason: collision with root package name */
        private static final b9.b f22288e = b9.b.d("orientation");

        /* renamed from: f  reason: collision with root package name */
        private static final b9.b f22289f = b9.b.d("ramUsed");

        /* renamed from: g  reason: collision with root package name */
        private static final b9.b f22290g = b9.b.d("diskUsed");

        private r() {
        }

        @Override // b9.c
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void a(b0.e.d.c cVar, b9.d dVar) throws IOException {
            dVar.a(f22285b, cVar.b());
            dVar.c(f22286c, cVar.c());
            dVar.f(f22287d, cVar.g());
            dVar.c(f22288e, cVar.e());
            dVar.e(f22289f, cVar.f());
            dVar.e(f22290g, cVar.d());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* loaded from: classes3.dex */
    private static final class s implements b9.c<b0.e.d> {

        /* renamed from: a  reason: collision with root package name */
        static final s f22291a = new s();

        /* renamed from: b  reason: collision with root package name */
        private static final b9.b f22292b = b9.b.d("timestamp");

        /* renamed from: c  reason: collision with root package name */
        private static final b9.b f22293c = b9.b.d(TaskFormActivity.TASK_TYPE_KEY);

        /* renamed from: d  reason: collision with root package name */
        private static final b9.b f22294d = b9.b.d("app");

        /* renamed from: e  reason: collision with root package name */
        private static final b9.b f22295e = b9.b.d("device");

        /* renamed from: f  reason: collision with root package name */
        private static final b9.b f22296f = b9.b.d("log");

        private s() {
        }

        @Override // b9.c
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void a(b0.e.d dVar, b9.d dVar2) throws IOException {
            dVar2.e(f22292b, dVar.e());
            dVar2.a(f22293c, dVar.f());
            dVar2.a(f22294d, dVar.b());
            dVar2.a(f22295e, dVar.c());
            dVar2.a(f22296f, dVar.d());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* loaded from: classes3.dex */
    private static final class t implements b9.c<b0.e.d.AbstractC0517d> {

        /* renamed from: a  reason: collision with root package name */
        static final t f22297a = new t();

        /* renamed from: b  reason: collision with root package name */
        private static final b9.b f22298b = b9.b.d("content");

        private t() {
        }

        @Override // b9.c
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void a(b0.e.d.AbstractC0517d abstractC0517d, b9.d dVar) throws IOException {
            dVar.a(f22298b, abstractC0517d.b());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* loaded from: classes3.dex */
    private static final class u implements b9.c<b0.e.AbstractC0518e> {

        /* renamed from: a  reason: collision with root package name */
        static final u f22299a = new u();

        /* renamed from: b  reason: collision with root package name */
        private static final b9.b f22300b = b9.b.d("platform");

        /* renamed from: c  reason: collision with root package name */
        private static final b9.b f22301c = b9.b.d("version");

        /* renamed from: d  reason: collision with root package name */
        private static final b9.b f22302d = b9.b.d("buildVersion");

        /* renamed from: e  reason: collision with root package name */
        private static final b9.b f22303e = b9.b.d("jailbroken");

        private u() {
        }

        @Override // b9.c
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void a(b0.e.AbstractC0518e abstractC0518e, b9.d dVar) throws IOException {
            dVar.c(f22300b, abstractC0518e.c());
            dVar.a(f22301c, abstractC0518e.d());
            dVar.a(f22302d, abstractC0518e.b());
            dVar.f(f22303e, abstractC0518e.e());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* loaded from: classes3.dex */
    private static final class v implements b9.c<b0.e.f> {

        /* renamed from: a  reason: collision with root package name */
        static final v f22304a = new v();

        /* renamed from: b  reason: collision with root package name */
        private static final b9.b f22305b = b9.b.d("identifier");

        private v() {
        }

        @Override // b9.c
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void a(b0.e.f fVar, b9.d dVar) throws IOException {
            dVar.a(f22305b, fVar.b());
        }
    }

    private a() {
    }

    @Override // c9.a
    public void a(c9.b<?> bVar) {
        d dVar = d.f22199a;
        bVar.a(b0.class, dVar);
        bVar.a(r8.b.class, dVar);
        j jVar = j.f22235a;
        bVar.a(b0.e.class, jVar);
        bVar.a(r8.h.class, jVar);
        g gVar = g.f22215a;
        bVar.a(b0.e.a.class, gVar);
        bVar.a(r8.i.class, gVar);
        h hVar = h.f22223a;
        bVar.a(b0.e.a.b.class, hVar);
        bVar.a(r8.j.class, hVar);
        v vVar = v.f22304a;
        bVar.a(b0.e.f.class, vVar);
        bVar.a(w.class, vVar);
        u uVar = u.f22299a;
        bVar.a(b0.e.AbstractC0518e.class, uVar);
        bVar.a(r8.v.class, uVar);
        i iVar = i.f22225a;
        bVar.a(b0.e.c.class, iVar);
        bVar.a(r8.k.class, iVar);
        s sVar = s.f22291a;
        bVar.a(b0.e.d.class, sVar);
        bVar.a(r8.l.class, sVar);
        k kVar = k.f22247a;
        bVar.a(b0.e.d.a.class, kVar);
        bVar.a(r8.m.class, kVar);
        m mVar = m.f22258a;
        bVar.a(b0.e.d.a.b.class, mVar);
        bVar.a(r8.n.class, mVar);
        p pVar = p.f22274a;
        bVar.a(b0.e.d.a.b.AbstractC0513e.class, pVar);
        bVar.a(r8.r.class, pVar);
        q qVar = q.f22278a;
        bVar.a(b0.e.d.a.b.AbstractC0513e.AbstractC0515b.class, qVar);
        bVar.a(r8.s.class, qVar);
        n nVar = n.f22264a;
        bVar.a(b0.e.d.a.b.c.class, nVar);
        bVar.a(r8.p.class, nVar);
        b bVar2 = b.f22186a;
        bVar.a(b0.a.class, bVar2);
        bVar.a(r8.c.class, bVar2);
        C0501a c0501a = C0501a.f22182a;
        bVar.a(b0.a.AbstractC0503a.class, c0501a);
        bVar.a(r8.d.class, c0501a);
        o oVar = o.f22270a;
        bVar.a(b0.e.d.a.b.AbstractC0511d.class, oVar);
        bVar.a(r8.q.class, oVar);
        l lVar = l.f22253a;
        bVar.a(b0.e.d.a.b.AbstractC0507a.class, lVar);
        bVar.a(r8.o.class, lVar);
        c cVar = c.f22196a;
        bVar.a(b0.c.class, cVar);
        bVar.a(r8.e.class, cVar);
        r rVar = r.f22284a;
        bVar.a(b0.e.d.c.class, rVar);
        bVar.a(r8.t.class, rVar);
        t tVar = t.f22297a;
        bVar.a(b0.e.d.AbstractC0517d.class, tVar);
        bVar.a(r8.u.class, tVar);
        e eVar = e.f22209a;
        bVar.a(b0.d.class, eVar);
        bVar.a(r8.f.class, eVar);
        f fVar = f.f22212a;
        bVar.a(b0.d.b.class, fVar);
        bVar.a(r8.g.class, fVar);
    }
}
