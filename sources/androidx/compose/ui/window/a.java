package androidx.compose.ui.window;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import dc.w;
import j0.e0;
import j0.f0;
import j0.g3;
import j0.i2;
import j0.l3;
import j0.u;
import j0.v1;
import j0.z1;
import java.util.List;
import java.util.UUID;
import kotlin.coroutines.Continuation;
import n1.g0;
import n1.h0;
import n1.i0;
import n1.j0;
import n1.k0;
import n1.l0;
import n1.n;
import n1.s;
import n1.t0;
import n1.y0;
import p1.g;
import pc.p;
import qc.q;
import qc.r;
import t1.o;
import t1.v;
import t1.x;

/* compiled from: AndroidPopup.android.kt */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a */
    private static final v1<String> f3110a = u.c(null, C0051a.f3111f, 1, null);

    /* compiled from: AndroidPopup.android.kt */
    /* renamed from: androidx.compose.ui.window.a$a */
    /* loaded from: classes.dex */
    static final class C0051a extends r implements pc.a<String> {

        /* renamed from: f */
        public static final C0051a f3111f = new C0051a();

        C0051a() {
            super(0);
        }

        @Override // pc.a
        public final String invoke() {
            return "DEFAULT_TEST_TAG";
        }
    }

    /* compiled from: AndroidPopup.android.kt */
    /* loaded from: classes.dex */
    public static final class b extends r implements pc.l<f0, e0> {

        /* renamed from: f */
        final /* synthetic */ androidx.compose.ui.window.e f3112f;

        /* renamed from: m */
        final /* synthetic */ pc.a<w> f3113m;

        /* renamed from: p */
        final /* synthetic */ k f3114p;

        /* renamed from: q */
        final /* synthetic */ String f3115q;

        /* renamed from: r */
        final /* synthetic */ j2.r f3116r;

        /* compiled from: Effects.kt */
        /* renamed from: androidx.compose.ui.window.a$b$a */
        /* loaded from: classes.dex */
        public static final class C0052a implements e0 {

            /* renamed from: a */
            final /* synthetic */ androidx.compose.ui.window.e f3117a;

            public C0052a(androidx.compose.ui.window.e eVar) {
                this.f3117a = eVar;
            }

            @Override // j0.e0
            public void dispose() {
                this.f3117a.e();
                this.f3117a.n();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(androidx.compose.ui.window.e eVar, pc.a<w> aVar, k kVar, String str, j2.r rVar) {
            super(1);
            this.f3112f = eVar;
            this.f3113m = aVar;
            this.f3114p = kVar;
            this.f3115q = str;
            this.f3116r = rVar;
        }

        @Override // pc.l
        public final e0 invoke(f0 f0Var) {
            q.i(f0Var, "$this$DisposableEffect");
            this.f3112f.q();
            this.f3112f.s(this.f3113m, this.f3114p, this.f3115q, this.f3116r);
            return new C0052a(this.f3112f);
        }
    }

    /* compiled from: AndroidPopup.android.kt */
    /* loaded from: classes.dex */
    public static final class c extends r implements pc.a<w> {

        /* renamed from: f */
        final /* synthetic */ androidx.compose.ui.window.e f3118f;

        /* renamed from: m */
        final /* synthetic */ pc.a<w> f3119m;

        /* renamed from: p */
        final /* synthetic */ k f3120p;

        /* renamed from: q */
        final /* synthetic */ String f3121q;

        /* renamed from: r */
        final /* synthetic */ j2.r f3122r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(androidx.compose.ui.window.e eVar, pc.a<w> aVar, k kVar, String str, j2.r rVar) {
            super(0);
            this.f3118f = eVar;
            this.f3119m = aVar;
            this.f3120p = kVar;
            this.f3121q = str;
            this.f3122r = rVar;
        }

        @Override // pc.a
        public /* bridge */ /* synthetic */ w invoke() {
            invoke2();
            return w.f13270a;
        }

        /* renamed from: invoke */
        public final void invoke2() {
            this.f3118f.s(this.f3119m, this.f3120p, this.f3121q, this.f3122r);
        }
    }

    /* compiled from: AndroidPopup.android.kt */
    /* loaded from: classes.dex */
    public static final class d extends r implements pc.l<f0, e0> {

        /* renamed from: f */
        final /* synthetic */ androidx.compose.ui.window.e f3123f;

        /* renamed from: m */
        final /* synthetic */ androidx.compose.ui.window.j f3124m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(androidx.compose.ui.window.e eVar, androidx.compose.ui.window.j jVar) {
            super(1);
            this.f3123f = eVar;
            this.f3124m = jVar;
        }

        @Override // pc.l
        public final e0 invoke(f0 f0Var) {
            q.i(f0Var, "$this$DisposableEffect");
            this.f3123f.setPositionProvider(this.f3124m);
            this.f3123f.v();
            return new C0053a();
        }

        /* compiled from: Effects.kt */
        /* renamed from: androidx.compose.ui.window.a$d$a */
        /* loaded from: classes.dex */
        public static final class C0053a implements e0 {
            @Override // j0.e0
            public void dispose() {
            }
        }
    }

    /* compiled from: AndroidPopup.android.kt */
    /* loaded from: classes.dex */
    public static final class f extends r implements pc.l<s, w> {

        /* renamed from: f */
        final /* synthetic */ androidx.compose.ui.window.e f3129f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(androidx.compose.ui.window.e eVar) {
            super(1);
            this.f3129f = eVar;
        }

        public final void a(s sVar) {
            q.i(sVar, "childCoordinates");
            s H = sVar.H();
            q.f(H);
            this.f3129f.u(H);
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ w invoke(s sVar) {
            a(sVar);
            return w.f13270a;
        }
    }

    /* compiled from: AndroidPopup.android.kt */
    /* loaded from: classes.dex */
    public static final class g implements i0 {

        /* renamed from: a */
        final /* synthetic */ androidx.compose.ui.window.e f3130a;

        /* renamed from: b */
        final /* synthetic */ j2.r f3131b;

        /* compiled from: AndroidPopup.android.kt */
        /* renamed from: androidx.compose.ui.window.a$g$a */
        /* loaded from: classes.dex */
        static final class C0055a extends r implements pc.l<y0.a, w> {

            /* renamed from: f */
            public static final C0055a f3132f = new C0055a();

            C0055a() {
                super(1);
            }

            /* renamed from: invoke */
            public final void invoke2(y0.a aVar) {
                q.i(aVar, "$this$layout");
            }

            @Override // pc.l
            public /* bridge */ /* synthetic */ w invoke(y0.a aVar) {
                invoke2(aVar);
                return w.f13270a;
            }
        }

        g(androidx.compose.ui.window.e eVar, j2.r rVar) {
            this.f3130a = eVar;
            this.f3131b = rVar;
        }

        @Override // n1.i0
        public /* synthetic */ int maxIntrinsicHeight(n nVar, List list, int i10) {
            return h0.a(this, nVar, list, i10);
        }

        @Override // n1.i0
        public /* synthetic */ int maxIntrinsicWidth(n nVar, List list, int i10) {
            return h0.b(this, nVar, list, i10);
        }

        @Override // n1.i0
        /* renamed from: measure-3p2s80s */
        public final j0 mo0measure3p2s80s(l0 l0Var, List<? extends g0> list, long j10) {
            q.i(l0Var, "$this$Layout");
            q.i(list, "<anonymous parameter 0>");
            this.f3130a.setParentLayoutDirection(this.f3131b);
            return k0.b(l0Var, 0, 0, null, C0055a.f3132f, 4, null);
        }

        @Override // n1.i0
        public /* synthetic */ int minIntrinsicHeight(n nVar, List list, int i10) {
            return h0.c(this, nVar, list, i10);
        }

        @Override // n1.i0
        public /* synthetic */ int minIntrinsicWidth(n nVar, List list, int i10) {
            return h0.d(this, nVar, list, i10);
        }
    }

    /* compiled from: AndroidPopup.android.kt */
    /* loaded from: classes.dex */
    public static final class h extends r implements p<j0.l, Integer, w> {

        /* renamed from: f */
        final /* synthetic */ androidx.compose.ui.window.j f3133f;

        /* renamed from: m */
        final /* synthetic */ pc.a<w> f3134m;

        /* renamed from: p */
        final /* synthetic */ k f3135p;

        /* renamed from: q */
        final /* synthetic */ p<j0.l, Integer, w> f3136q;

        /* renamed from: r */
        final /* synthetic */ int f3137r;

        /* renamed from: s */
        final /* synthetic */ int f3138s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        h(androidx.compose.ui.window.j jVar, pc.a<w> aVar, k kVar, p<? super j0.l, ? super Integer, w> pVar, int i10, int i11) {
            super(2);
            this.f3133f = jVar;
            this.f3134m = aVar;
            this.f3135p = kVar;
            this.f3136q = pVar;
            this.f3137r = i10;
            this.f3138s = i11;
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ w invoke(j0.l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return w.f13270a;
        }

        public final void invoke(j0.l lVar, int i10) {
            a.a(this.f3133f, this.f3134m, this.f3135p, this.f3136q, lVar, z1.a(this.f3137r | 1), this.f3138s);
        }
    }

    /* compiled from: AndroidPopup.android.kt */
    /* loaded from: classes.dex */
    public static final class i extends r implements pc.a<UUID> {

        /* renamed from: f */
        public static final i f3139f = new i();

        i() {
            super(0);
        }

        @Override // pc.a
        /* renamed from: a */
        public final UUID invoke() {
            return UUID.randomUUID();
        }
    }

    /* compiled from: AndroidPopup.android.kt */
    /* loaded from: classes.dex */
    public static final class j extends r implements p<j0.l, Integer, w> {

        /* renamed from: f */
        final /* synthetic */ androidx.compose.ui.window.e f3140f;

        /* renamed from: m */
        final /* synthetic */ g3<p<j0.l, Integer, w>> f3141m;

        /* compiled from: AndroidPopup.android.kt */
        /* renamed from: androidx.compose.ui.window.a$j$a */
        /* loaded from: classes.dex */
        public static final class C0056a extends r implements pc.l<x, w> {

            /* renamed from: f */
            public static final C0056a f3142f = new C0056a();

            C0056a() {
                super(1);
            }

            public final void a(x xVar) {
                q.i(xVar, "$this$semantics");
                v.A(xVar);
            }

            @Override // pc.l
            public /* bridge */ /* synthetic */ w invoke(x xVar) {
                a(xVar);
                return w.f13270a;
            }
        }

        /* compiled from: AndroidPopup.android.kt */
        /* loaded from: classes.dex */
        public static final class b extends r implements pc.l<j2.p, w> {

            /* renamed from: f */
            final /* synthetic */ androidx.compose.ui.window.e f3143f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(androidx.compose.ui.window.e eVar) {
                super(1);
                this.f3143f = eVar;
            }

            public final void a(long j10) {
                this.f3143f.m2setPopupContentSizefhxjrPA(j2.p.b(j10));
                this.f3143f.v();
            }

            @Override // pc.l
            public /* bridge */ /* synthetic */ w invoke(j2.p pVar) {
                a(pVar.j());
                return w.f13270a;
            }
        }

        /* compiled from: AndroidPopup.android.kt */
        /* loaded from: classes.dex */
        public static final class c extends r implements p<j0.l, Integer, w> {

            /* renamed from: f */
            final /* synthetic */ g3<p<j0.l, Integer, w>> f3144f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            c(g3<? extends p<? super j0.l, ? super Integer, w>> g3Var) {
                super(2);
                this.f3144f = g3Var;
            }

            @Override // pc.p
            public /* bridge */ /* synthetic */ w invoke(j0.l lVar, Integer num) {
                invoke(lVar, num.intValue());
                return w.f13270a;
            }

            public final void invoke(j0.l lVar, int i10) {
                if ((i10 & 11) == 2 && lVar.t()) {
                    lVar.z();
                    return;
                }
                if (j0.n.K()) {
                    j0.n.V(606497925, i10, -1, "androidx.compose.ui.window.Popup.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AndroidPopup.android.kt:255)");
                }
                a.b(this.f3144f).invoke(lVar, 0);
                if (j0.n.K()) {
                    j0.n.U();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        j(androidx.compose.ui.window.e eVar, g3<? extends p<? super j0.l, ? super Integer, w>> g3Var) {
            super(2);
            this.f3140f = eVar;
            this.f3141m = g3Var;
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ w invoke(j0.l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return w.f13270a;
        }

        public final void invoke(j0.l lVar, int i10) {
            if ((i10 & 11) == 2 && lVar.t()) {
                lVar.z();
                return;
            }
            if (j0.n.K()) {
                j0.n.V(1302892335, i10, -1, "androidx.compose.ui.window.Popup.<anonymous>.<anonymous>.<anonymous> (AndroidPopup.android.kt:244)");
            }
            androidx.compose.ui.e a10 = x0.a.a(t0.a(o.c(androidx.compose.ui.e.f2335a, false, C0056a.f3142f, 1, null), new b(this.f3140f)), this.f3140f.getCanCalculatePosition() ? 1.0f : 0.0f);
            q0.a b10 = q0.c.b(lVar, 606497925, true, new c(this.f3141m));
            lVar.e(1406149896);
            androidx.compose.ui.window.b bVar = androidx.compose.ui.window.b.f3145a;
            lVar.e(-1323940314);
            int a11 = j0.j.a(lVar, 0);
            j0.v F = lVar.F();
            g.a aVar = p1.g.f20790l;
            pc.a<p1.g> a12 = aVar.a();
            pc.q<i2<p1.g>, j0.l, Integer, w> a13 = n1.x.a(a10);
            if (!(lVar.u() instanceof j0.f)) {
                j0.j.c();
            }
            lVar.s();
            if (lVar.n()) {
                lVar.B(a12);
            } else {
                lVar.H();
            }
            j0.l a14 = l3.a(lVar);
            l3.b(a14, bVar, aVar.e());
            l3.b(a14, F, aVar.g());
            p<p1.g, Integer, w> b11 = aVar.b();
            if (a14.n() || !q.d(a14.f(), Integer.valueOf(a11))) {
                a14.J(Integer.valueOf(a11));
                a14.I(Integer.valueOf(a11), b11);
            }
            a13.invoke(i2.a(i2.b(lVar)), lVar, 0);
            lVar.e(2058660585);
            b10.invoke(lVar, 6);
            lVar.N();
            lVar.O();
            lVar.N();
            lVar.N();
            if (j0.n.K()) {
                j0.n.U();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:173:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(androidx.compose.ui.window.j r35, pc.a<dc.w> r36, androidx.compose.ui.window.k r37, pc.p<? super j0.l, ? super java.lang.Integer, dc.w> r38, j0.l r39, int r40, int r41) {
        /*
            Method dump skipped, instructions count: 617
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.window.a.a(androidx.compose.ui.window.j, pc.a, androidx.compose.ui.window.k, pc.p, j0.l, int, int):void");
    }

    public static final p<j0.l, Integer, w> b(g3<? extends p<? super j0.l, ? super Integer, w>> g3Var) {
        return (p) g3Var.getValue();
    }

    public static final boolean e(View view) {
        WindowManager.LayoutParams layoutParams;
        q.i(view, "<this>");
        ViewGroup.LayoutParams layoutParams2 = view.getRootView().getLayoutParams();
        if (layoutParams2 instanceof WindowManager.LayoutParams) {
            layoutParams = (WindowManager.LayoutParams) layoutParams2;
        } else {
            layoutParams = null;
        }
        if (layoutParams == null || (layoutParams.flags & 8192) == 0) {
            return false;
        }
        return true;
    }

    public static final j2.n f(Rect rect) {
        return new j2.n(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* compiled from: AndroidPopup.android.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5", f = "AndroidPopup.android.kt", l = {301}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class e extends kotlin.coroutines.jvm.internal.l implements p<ad.k0, Continuation<? super w>, Object> {

        /* renamed from: f */
        int f3125f;

        /* renamed from: m */
        private /* synthetic */ Object f3126m;

        /* renamed from: p */
        final /* synthetic */ androidx.compose.ui.window.e f3127p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(androidx.compose.ui.window.e eVar, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f3127p = eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<w> create(Object obj, Continuation<?> continuation) {
            e eVar = new e(this.f3127p, continuation);
            eVar.f3126m = obj;
            return eVar;
        }

        @Override // pc.p
        public final Object invoke(ad.k0 k0Var, Continuation<? super w> continuation) {
            return ((e) create(k0Var, continuation)).invokeSuspend(w.f13270a);
        }

        /* JADX WARN: Removed duplicated region for block: B:28:0x002b  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x003e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0035 -> B:31:0x0038). Please submit an issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = ic.b.d()
                int r1 = r4.f3125f
                r2 = 1
                if (r1 == 0) goto L1c
                if (r1 != r2) goto L14
                java.lang.Object r1 = r4.f3126m
                ad.k0 r1 = (ad.k0) r1
                dc.n.b(r5)
                r5 = r4
                goto L38
            L14:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1c:
                dc.n.b(r5)
                java.lang.Object r5 = r4.f3126m
                ad.k0 r5 = (ad.k0) r5
                r1 = r5
                r5 = r4
            L25:
                boolean r3 = ad.l0.g(r1)
                if (r3 == 0) goto L3e
                androidx.compose.ui.window.a$e$a r3 = androidx.compose.ui.window.a.e.C0054a.f3128f
                r5.f3126m = r1
                r5.f3125f = r2
                java.lang.Object r3 = androidx.compose.ui.platform.i1.a(r3, r5)
                if (r3 != r0) goto L38
                return r0
            L38:
                androidx.compose.ui.window.e r3 = r5.f3127p
                r3.o()
                goto L25
            L3e:
                dc.w r5 = dc.w.f13270a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.window.a.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* compiled from: AndroidPopup.android.kt */
        /* renamed from: androidx.compose.ui.window.a$e$a */
        /* loaded from: classes.dex */
        public static final class C0054a extends r implements pc.l<Long, w> {

            /* renamed from: f */
            public static final C0054a f3128f = new C0054a();

            C0054a() {
                super(1);
            }

            @Override // pc.l
            public /* bridge */ /* synthetic */ w invoke(Long l10) {
                a(l10.longValue());
                return w.f13270a;
            }

            public final void a(long j10) {
            }
        }
    }
}
