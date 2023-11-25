package f0;

import kotlin.coroutines.Continuation;

/* compiled from: Drawer.kt */
/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: c  reason: collision with root package name */
    public static final b f14304c = new b(null);

    /* renamed from: a  reason: collision with root package name */
    private final e<b0> f14305a;

    /* renamed from: b  reason: collision with root package name */
    private j2.e f14306b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Drawer.kt */
    /* loaded from: classes.dex */
    public static final class a extends qc.r implements pc.l<b0, Boolean> {

        /* renamed from: f  reason: collision with root package name */
        public static final a f14307f = new a();

        a() {
            super(1);
        }

        @Override // pc.l
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(b0 b0Var) {
            qc.q.i(b0Var, "it");
            return Boolean.TRUE;
        }
    }

    /* compiled from: Drawer.kt */
    /* loaded from: classes.dex */
    public static final class b {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Drawer.kt */
        /* loaded from: classes.dex */
        public static final class a extends qc.r implements pc.p<s0.k, a0, b0> {

            /* renamed from: f  reason: collision with root package name */
            public static final a f14308f = new a();

            a() {
                super(2);
            }

            @Override // pc.p
            /* renamed from: a  reason: merged with bridge method [inline-methods] */
            public final b0 invoke(s0.k kVar, a0 a0Var) {
                qc.q.i(kVar, "$this$Saver");
                qc.q.i(a0Var, "it");
                return a0Var.d();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Drawer.kt */
        /* renamed from: f0.a0$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0344b extends qc.r implements pc.l<b0, a0> {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ pc.l<b0, Boolean> f14309f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0344b(pc.l<? super b0, Boolean> lVar) {
                super(1);
                this.f14309f = lVar;
            }

            @Override // pc.l
            /* renamed from: a  reason: merged with bridge method [inline-methods] */
            public final a0 invoke(b0 b0Var) {
                qc.q.i(b0Var, "it");
                return new a0(b0Var, this.f14309f);
            }
        }

        private b() {
        }

        public /* synthetic */ b(qc.h hVar) {
            this();
        }

        public final s0.i<a0, b0> a(pc.l<? super b0, Boolean> lVar) {
            qc.q.i(lVar, "confirmStateChange");
            return s0.j.a(a.f14308f, new C0344b(lVar));
        }
    }

    /* compiled from: Drawer.kt */
    /* loaded from: classes.dex */
    static final class c extends qc.r implements pc.l<Float, Float> {
        c() {
            super(1);
        }

        public final Float a(float f10) {
            float f11;
            j2.e f12 = a0.this.f();
            f11 = z.f15333b;
            return Float.valueOf(f12.v0(f11));
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ Float invoke(Float f10) {
            return a(f10.floatValue());
        }
    }

    /* compiled from: Drawer.kt */
    /* loaded from: classes.dex */
    static final class d extends qc.r implements pc.a<Float> {
        d() {
            super(0);
        }

        @Override // pc.a
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final Float invoke() {
            float f10;
            j2.e f11 = a0.this.f();
            f10 = z.f15334c;
            return Float.valueOf(f11.v0(f10));
        }
    }

    public a0(b0 b0Var, pc.l<? super b0, Boolean> lVar) {
        s.h1 h1Var;
        qc.q.i(b0Var, "initialValue");
        qc.q.i(lVar, "confirmStateChange");
        h1Var = z.f15335d;
        this.f14305a = new e<>(b0Var, new c(), new d(), h1Var, lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final j2.e f() {
        j2.e eVar = this.f14306b;
        if (eVar != null) {
            return eVar;
        }
        throw new IllegalArgumentException(("The density on DrawerState (" + this + ") was not set. Did you use DrawerState with the Drawer composable?").toString());
    }

    public final Object b(Continuation<? super dc.w> continuation) {
        Object d10;
        Object g10 = f0.d.g(this.f14305a, b0.Closed, 0.0f, continuation, 2, null);
        d10 = ic.d.d();
        if (g10 == d10) {
            return g10;
        }
        return dc.w.f13270a;
    }

    public final e<b0> c() {
        return this.f14305a;
    }

    public final b0 d() {
        return this.f14305a.v();
    }

    public final boolean e() {
        if (d() == b0.Open) {
            return true;
        }
        return false;
    }

    public final float g() {
        return this.f14305a.F();
    }

    public final void h(j2.e eVar) {
        this.f14306b = eVar;
    }

    public /* synthetic */ a0(b0 b0Var, pc.l lVar, int i10, qc.h hVar) {
        this(b0Var, (i10 & 2) != 0 ? a.f14307f : lVar);
    }
}
