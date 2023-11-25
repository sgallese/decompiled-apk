package androidx.compose.ui.platform;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import androidx.compose.ui.platform.AndroidComposeView;
import j0.l;
import kotlin.KotlinNothingValueException;

/* compiled from: AndroidCompositionLocals.android.kt */
/* loaded from: classes.dex */
public final class j0 {

    /* renamed from: a  reason: collision with root package name */
    private static final j0.v1<Configuration> f2705a = j0.u.c(null, a.f2711f, 1, null);

    /* renamed from: b  reason: collision with root package name */
    private static final j0.v1<Context> f2706b = j0.u.d(b.f2712f);

    /* renamed from: c  reason: collision with root package name */
    private static final j0.v1<s1.e> f2707c = j0.u.d(c.f2713f);

    /* renamed from: d  reason: collision with root package name */
    private static final j0.v1<androidx.lifecycle.v> f2708d = j0.u.d(d.f2714f);

    /* renamed from: e  reason: collision with root package name */
    private static final j0.v1<w3.d> f2709e = j0.u.d(e.f2715f);

    /* renamed from: f  reason: collision with root package name */
    private static final j0.v1<View> f2710f = j0.u.d(f.f2716f);

    /* compiled from: AndroidCompositionLocals.android.kt */
    /* loaded from: classes.dex */
    static final class a extends qc.r implements pc.a<Configuration> {

        /* renamed from: f  reason: collision with root package name */
        public static final a f2711f = new a();

        a() {
            super(0);
        }

        @Override // pc.a
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final Configuration invoke() {
            j0.l("LocalConfiguration");
            throw new KotlinNothingValueException();
        }
    }

    /* compiled from: AndroidCompositionLocals.android.kt */
    /* loaded from: classes.dex */
    static final class b extends qc.r implements pc.a<Context> {

        /* renamed from: f  reason: collision with root package name */
        public static final b f2712f = new b();

        b() {
            super(0);
        }

        @Override // pc.a
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final Context invoke() {
            j0.l("LocalContext");
            throw new KotlinNothingValueException();
        }
    }

    /* compiled from: AndroidCompositionLocals.android.kt */
    /* loaded from: classes.dex */
    static final class c extends qc.r implements pc.a<s1.e> {

        /* renamed from: f  reason: collision with root package name */
        public static final c f2713f = new c();

        c() {
            super(0);
        }

        @Override // pc.a
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final s1.e invoke() {
            j0.l("LocalImageVectorCache");
            throw new KotlinNothingValueException();
        }
    }

    /* compiled from: AndroidCompositionLocals.android.kt */
    /* loaded from: classes.dex */
    static final class d extends qc.r implements pc.a<androidx.lifecycle.v> {

        /* renamed from: f  reason: collision with root package name */
        public static final d f2714f = new d();

        d() {
            super(0);
        }

        @Override // pc.a
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final androidx.lifecycle.v invoke() {
            j0.l("LocalLifecycleOwner");
            throw new KotlinNothingValueException();
        }
    }

    /* compiled from: AndroidCompositionLocals.android.kt */
    /* loaded from: classes.dex */
    static final class e extends qc.r implements pc.a<w3.d> {

        /* renamed from: f  reason: collision with root package name */
        public static final e f2715f = new e();

        e() {
            super(0);
        }

        @Override // pc.a
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final w3.d invoke() {
            j0.l("LocalSavedStateRegistryOwner");
            throw new KotlinNothingValueException();
        }
    }

    /* compiled from: AndroidCompositionLocals.android.kt */
    /* loaded from: classes.dex */
    static final class f extends qc.r implements pc.a<View> {

        /* renamed from: f  reason: collision with root package name */
        public static final f f2716f = new f();

        f() {
            super(0);
        }

        @Override // pc.a
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final View invoke() {
            j0.l("LocalView");
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AndroidCompositionLocals.android.kt */
    /* loaded from: classes.dex */
    public static final class g extends qc.r implements pc.l<Configuration, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ j0.j1<Configuration> f2717f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(j0.j1<Configuration> j1Var) {
            super(1);
            this.f2717f = j1Var;
        }

        public final void a(Configuration configuration) {
            qc.q.i(configuration, "it");
            j0.c(this.f2717f, new Configuration(configuration));
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ dc.w invoke(Configuration configuration) {
            a(configuration);
            return dc.w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AndroidCompositionLocals.android.kt */
    /* loaded from: classes.dex */
    public static final class h extends qc.r implements pc.l<j0.f0, j0.e0> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ c1 f2718f;

        /* compiled from: Effects.kt */
        /* loaded from: classes.dex */
        public static final class a implements j0.e0 {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ c1 f2719a;

            public a(c1 c1Var) {
                this.f2719a = c1Var;
            }

            @Override // j0.e0
            public void dispose() {
                this.f2719a.e();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(c1 c1Var) {
            super(1);
            this.f2718f = c1Var;
        }

        @Override // pc.l
        public final j0.e0 invoke(j0.f0 f0Var) {
            qc.q.i(f0Var, "$this$DisposableEffect");
            return new a(this.f2718f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AndroidCompositionLocals.android.kt */
    /* loaded from: classes.dex */
    public static final class i extends qc.r implements pc.p<j0.l, Integer, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ AndroidComposeView f2720f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ p0 f2721m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ pc.p<j0.l, Integer, dc.w> f2722p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ int f2723q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        i(AndroidComposeView androidComposeView, p0 p0Var, pc.p<? super j0.l, ? super Integer, dc.w> pVar, int i10) {
            super(2);
            this.f2720f = androidComposeView;
            this.f2721m = p0Var;
            this.f2722p = pVar;
            this.f2723q = i10;
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ dc.w invoke(j0.l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return dc.w.f13270a;
        }

        public final void invoke(j0.l lVar, int i10) {
            if ((i10 & 11) == 2 && lVar.t()) {
                lVar.z();
                return;
            }
            if (j0.n.K()) {
                j0.n.V(1471621628, i10, -1, "androidx.compose.ui.platform.ProvideAndroidCompositionLocals.<anonymous> (AndroidCompositionLocals.android.kt:117)");
            }
            z0.a(this.f2720f, this.f2721m, this.f2722p, lVar, ((this.f2723q << 3) & 896) | 72);
            if (j0.n.K()) {
                j0.n.U();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AndroidCompositionLocals.android.kt */
    /* loaded from: classes.dex */
    public static final class j extends qc.r implements pc.p<j0.l, Integer, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ AndroidComposeView f2724f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ pc.p<j0.l, Integer, dc.w> f2725m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ int f2726p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        j(AndroidComposeView androidComposeView, pc.p<? super j0.l, ? super Integer, dc.w> pVar, int i10) {
            super(2);
            this.f2724f = androidComposeView;
            this.f2725m = pVar;
            this.f2726p = i10;
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ dc.w invoke(j0.l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return dc.w.f13270a;
        }

        public final void invoke(j0.l lVar, int i10) {
            j0.a(this.f2724f, this.f2725m, lVar, j0.z1.a(this.f2726p | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AndroidCompositionLocals.android.kt */
    /* loaded from: classes.dex */
    public static final class k extends qc.r implements pc.l<j0.f0, j0.e0> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ Context f2727f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ l f2728m;

        /* compiled from: Effects.kt */
        /* loaded from: classes.dex */
        public static final class a implements j0.e0 {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Context f2729a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ l f2730b;

            public a(Context context, l lVar) {
                this.f2729a = context;
                this.f2730b = lVar;
            }

            @Override // j0.e0
            public void dispose() {
                this.f2729a.getApplicationContext().unregisterComponentCallbacks(this.f2730b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(Context context, l lVar) {
            super(1);
            this.f2727f = context;
            this.f2728m = lVar;
        }

        @Override // pc.l
        public final j0.e0 invoke(j0.f0 f0Var) {
            qc.q.i(f0Var, "$this$DisposableEffect");
            this.f2727f.getApplicationContext().registerComponentCallbacks(this.f2728m);
            return new a(this.f2727f, this.f2728m);
        }
    }

    /* compiled from: AndroidCompositionLocals.android.kt */
    /* loaded from: classes.dex */
    public static final class l implements ComponentCallbacks2 {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ Configuration f2731f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ s1.e f2732m;

        l(Configuration configuration, s1.e eVar) {
            this.f2731f = configuration;
            this.f2732m = eVar;
        }

        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(Configuration configuration) {
            qc.q.i(configuration, "configuration");
            this.f2732m.c(this.f2731f.updateFrom(configuration));
            this.f2731f.setTo(configuration);
        }

        @Override // android.content.ComponentCallbacks
        public void onLowMemory() {
            this.f2732m.a();
        }

        @Override // android.content.ComponentCallbacks2
        public void onTrimMemory(int i10) {
            this.f2732m.a();
        }
    }

    public static final void a(AndroidComposeView androidComposeView, pc.p<? super j0.l, ? super Integer, dc.w> pVar, j0.l lVar, int i10) {
        qc.q.i(androidComposeView, "owner");
        qc.q.i(pVar, "content");
        j0.l q10 = lVar.q(1396852028);
        if (j0.n.K()) {
            j0.n.V(1396852028, i10, -1, "androidx.compose.ui.platform.ProvideAndroidCompositionLocals (AndroidCompositionLocals.android.kt:80)");
        }
        Context context = androidComposeView.getContext();
        q10.e(-492369756);
        Object f10 = q10.f();
        l.a aVar = j0.l.f18688a;
        if (f10 == aVar.a()) {
            f10 = j0.d3.e(new Configuration(context.getResources().getConfiguration()), null, 2, null);
            q10.J(f10);
        }
        q10.N();
        j0.j1 j1Var = (j0.j1) f10;
        q10.e(1157296644);
        boolean Q = q10.Q(j1Var);
        Object f11 = q10.f();
        if (Q || f11 == aVar.a()) {
            f11 = new g(j1Var);
            q10.J(f11);
        }
        q10.N();
        androidComposeView.setConfigurationChangeObserver((pc.l) f11);
        q10.e(-492369756);
        Object f12 = q10.f();
        if (f12 == aVar.a()) {
            qc.q.h(context, "context");
            f12 = new p0(context);
            q10.J(f12);
        }
        q10.N();
        p0 p0Var = (p0) f12;
        AndroidComposeView.b viewTreeOwners = androidComposeView.getViewTreeOwners();
        if (viewTreeOwners != null) {
            q10.e(-492369756);
            Object f13 = q10.f();
            if (f13 == aVar.a()) {
                f13 = d1.a(androidComposeView, viewTreeOwners.b());
                q10.J(f13);
            }
            q10.N();
            c1 c1Var = (c1) f13;
            j0.h0.b(dc.w.f13270a, new h(c1Var), q10, 6);
            qc.q.h(context, "context");
            j0.u.a(new j0.w1[]{f2705a.c(b(j1Var)), f2706b.c(context), f2708d.c(viewTreeOwners.a()), f2709e.c(viewTreeOwners.b()), s0.h.b().c(c1Var), f2710f.c(androidComposeView.getView()), f2707c.c(m(context, b(j1Var), q10, 72))}, q0.c.b(q10, 1471621628, true, new i(androidComposeView, p0Var, pVar, i10)), q10, 56);
            if (j0.n.K()) {
                j0.n.U();
            }
            j0.g2 w10 = q10.w();
            if (w10 != null) {
                w10.a(new j(androidComposeView, pVar, i10));
                return;
            }
            return;
        }
        throw new IllegalStateException("Called when the ViewTreeOwnersAvailability is not yet in Available state");
    }

    private static final Configuration b(j0.j1<Configuration> j1Var) {
        return j1Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(j0.j1<Configuration> j1Var, Configuration configuration) {
        j1Var.setValue(configuration);
    }

    public static final j0.v1<Configuration> f() {
        return f2705a;
    }

    public static final j0.v1<Context> g() {
        return f2706b;
    }

    public static final j0.v1<s1.e> h() {
        return f2707c;
    }

    public static final j0.v1<androidx.lifecycle.v> i() {
        return f2708d;
    }

    public static final j0.v1<w3.d> j() {
        return f2709e;
    }

    public static final j0.v1<View> k() {
        return f2710f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void l(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }

    private static final s1.e m(Context context, Configuration configuration, j0.l lVar, int i10) {
        lVar.e(-485908294);
        if (j0.n.K()) {
            j0.n.V(-485908294, i10, -1, "androidx.compose.ui.platform.obtainImageVectorCache (AndroidCompositionLocals.android.kt:128)");
        }
        lVar.e(-492369756);
        Object f10 = lVar.f();
        l.a aVar = j0.l.f18688a;
        if (f10 == aVar.a()) {
            f10 = new s1.e();
            lVar.J(f10);
        }
        lVar.N();
        s1.e eVar = (s1.e) f10;
        lVar.e(-492369756);
        Object f11 = lVar.f();
        Object obj = f11;
        if (f11 == aVar.a()) {
            Configuration configuration2 = new Configuration();
            if (configuration != null) {
                configuration2.setTo(configuration);
            }
            lVar.J(configuration2);
            obj = configuration2;
        }
        lVar.N();
        Configuration configuration3 = (Configuration) obj;
        lVar.e(-492369756);
        Object f12 = lVar.f();
        if (f12 == aVar.a()) {
            f12 = new l(configuration3, eVar);
            lVar.J(f12);
        }
        lVar.N();
        j0.h0.b(eVar, new k(context, (l) f12), lVar, 8);
        if (j0.n.K()) {
            j0.n.U();
        }
        lVar.N();
        return eVar;
    }
}
