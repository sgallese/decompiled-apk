package f0;

import kotlin.coroutines.Continuation;

/* compiled from: ModalBottomSheet.kt */
/* loaded from: classes.dex */
public final class y0 {

    /* renamed from: e  reason: collision with root package name */
    public static final a f15289e = new a(null);

    /* renamed from: f  reason: collision with root package name */
    public static final int f15290f = 8;

    /* renamed from: a  reason: collision with root package name */
    private final s.j<Float> f15291a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f15292b;

    /* renamed from: c  reason: collision with root package name */
    private final e<z0> f15293c;

    /* renamed from: d  reason: collision with root package name */
    private j2.e f15294d;

    /* compiled from: ModalBottomSheet.kt */
    /* loaded from: classes.dex */
    public static final class a {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ModalBottomSheet.kt */
        /* renamed from: f0.y0$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0366a extends qc.r implements pc.p<s0.k, y0, z0> {

            /* renamed from: f  reason: collision with root package name */
            public static final C0366a f15295f = new C0366a();

            C0366a() {
                super(2);
            }

            @Override // pc.p
            /* renamed from: a  reason: merged with bridge method [inline-methods] */
            public final z0 invoke(s0.k kVar, y0 y0Var) {
                qc.q.i(kVar, "$this$Saver");
                qc.q.i(y0Var, "it");
                return y0Var.f();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ModalBottomSheet.kt */
        /* loaded from: classes.dex */
        public static final class b extends qc.r implements pc.l<z0, y0> {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ j2.e f15296f;

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ s.j<Float> f15297m;

            /* renamed from: p  reason: collision with root package name */
            final /* synthetic */ pc.l<z0, Boolean> f15298p;

            /* renamed from: q  reason: collision with root package name */
            final /* synthetic */ boolean f15299q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            b(j2.e eVar, s.j<Float> jVar, pc.l<? super z0, Boolean> lVar, boolean z10) {
                super(1);
                this.f15296f = eVar;
                this.f15297m = jVar;
                this.f15298p = lVar;
                this.f15299q = z10;
            }

            @Override // pc.l
            /* renamed from: a  reason: merged with bridge method [inline-methods] */
            public final y0 invoke(z0 z0Var) {
                qc.q.i(z0Var, "it");
                return x0.d(z0Var, this.f15296f, this.f15297m, this.f15298p, this.f15299q);
            }
        }

        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }

        public final s0.i<y0, ?> a(s.j<Float> jVar, pc.l<? super z0, Boolean> lVar, boolean z10, j2.e eVar) {
            qc.q.i(jVar, "animationSpec");
            qc.q.i(lVar, "confirmValueChange");
            qc.q.i(eVar, "density");
            return s0.j.a(C0366a.f15295f, new b(eVar, jVar, lVar, z10));
        }
    }

    /* compiled from: ModalBottomSheet.kt */
    /* loaded from: classes.dex */
    static final class b extends qc.r implements pc.l<Float, Float> {
        b() {
            super(1);
        }

        public final Float a(float f10) {
            float f11;
            j2.e o10 = y0.this.o();
            f11 = x0.f15195a;
            return Float.valueOf(o10.v0(f11));
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ Float invoke(Float f10) {
            return a(f10.floatValue());
        }
    }

    /* compiled from: ModalBottomSheet.kt */
    /* loaded from: classes.dex */
    static final class c extends qc.r implements pc.a<Float> {
        c() {
            super(0);
        }

        @Override // pc.a
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final Float invoke() {
            float f10;
            j2.e o10 = y0.this.o();
            f10 = x0.f15196b;
            return Float.valueOf(o10.v0(f10));
        }
    }

    public y0(z0 z0Var, s.j<Float> jVar, boolean z10, pc.l<? super z0, Boolean> lVar) {
        boolean z11;
        qc.q.i(z0Var, "initialValue");
        qc.q.i(jVar, "animationSpec");
        qc.q.i(lVar, "confirmStateChange");
        this.f15291a = jVar;
        this.f15292b = z10;
        this.f15293c = new e<>(z0Var, new b(), new c(), jVar, lVar);
        if (z10) {
            if (z0Var != z0.HalfExpanded) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11) {
                throw new IllegalArgumentException("The initial value must not be set to HalfExpanded if skipHalfExpanded is set to true.".toString());
            }
        }
    }

    public static /* synthetic */ Object c(y0 y0Var, z0 z0Var, float f10, Continuation continuation, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f10 = y0Var.f15293c.x();
        }
        return y0Var.b(z0Var, f10, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final j2.e o() {
        j2.e eVar = this.f15294d;
        if (eVar != null) {
            return eVar;
        }
        throw new IllegalArgumentException(("The density on ModalBottomSheetState (" + this + ") was not set. Did you use ModalBottomSheetState with the ModalBottomSheetLayout composable?").toString());
    }

    public final Object b(z0 z0Var, float f10, Continuation<? super dc.w> continuation) {
        Object d10;
        Object f11 = d.f(this.f15293c, z0Var, f10, continuation);
        d10 = ic.d.d();
        if (f11 == d10) {
            return f11;
        }
        return dc.w.f13270a;
    }

    public final Object d(Continuation<? super dc.w> continuation) {
        Object d10;
        e<z0> eVar = this.f15293c;
        z0 z0Var = z0.Expanded;
        if (!eVar.C(z0Var)) {
            return dc.w.f13270a;
        }
        Object c10 = c(this, z0Var, 0.0f, continuation, 2, null);
        d10 = ic.d.d();
        if (c10 == d10) {
            return c10;
        }
        return dc.w.f13270a;
    }

    public final e<z0> e() {
        return this.f15293c;
    }

    public final z0 f() {
        return this.f15293c.v();
    }

    public final j2.e g() {
        return this.f15294d;
    }

    public final boolean h() {
        return this.f15293c.C(z0.HalfExpanded);
    }

    public final float i() {
        return this.f15293c.x();
    }

    public final Object j(Continuation<? super dc.w> continuation) {
        Object d10;
        if (!h()) {
            return dc.w.f13270a;
        }
        Object c10 = c(this, z0.HalfExpanded, 0.0f, continuation, 2, null);
        d10 = ic.d.d();
        if (c10 == d10) {
            return c10;
        }
        return dc.w.f13270a;
    }

    public final Object k(Continuation<? super dc.w> continuation) {
        Object d10;
        Object c10 = c(this, z0.Hidden, 0.0f, continuation, 2, null);
        d10 = ic.d.d();
        if (c10 == d10) {
            return c10;
        }
        return dc.w.f13270a;
    }

    public final boolean l() {
        return this.f15293c.D();
    }

    public final boolean m() {
        return this.f15292b;
    }

    public final boolean n() {
        if (this.f15293c.v() != z0.Hidden) {
            return true;
        }
        return false;
    }

    public final void p(j2.e eVar) {
        this.f15294d = eVar;
    }

    public final Object q(Continuation<? super dc.w> continuation) {
        z0 z0Var;
        Object d10;
        if (h()) {
            z0Var = z0.HalfExpanded;
        } else {
            z0Var = z0.Expanded;
        }
        Object c10 = c(this, z0Var, 0.0f, continuation, 2, null);
        d10 = ic.d.d();
        if (c10 == d10) {
            return c10;
        }
        return dc.w.f13270a;
    }

    public final Object r(z0 z0Var, Continuation<? super dc.w> continuation) {
        Object d10;
        Object k10 = d.k(this.f15293c, z0Var, continuation);
        d10 = ic.d.d();
        if (k10 == d10) {
            return k10;
        }
        return dc.w.f13270a;
    }

    public final boolean s(z0 z0Var) {
        qc.q.i(z0Var, "target");
        return this.f15293c.M(z0Var);
    }
}
