package s;

import j0.g3;
import j0.l;
import s.e1;

/* compiled from: Transition.kt */
/* loaded from: classes.dex */
public final class g1 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Transition.kt */
    /* loaded from: classes.dex */
    public static final class a extends qc.r implements pc.l<j0.f0, j0.e0> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ e1<S> f22688f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ e1<T> f22689m;

        /* compiled from: Effects.kt */
        /* renamed from: s.g1$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0523a implements j0.e0 {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ e1 f22690a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ e1 f22691b;

            public C0523a(e1 e1Var, e1 e1Var2) {
                this.f22690a = e1Var;
                this.f22691b = e1Var2;
            }

            @Override // j0.e0
            public void dispose() {
                this.f22690a.x(this.f22691b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(e1<S> e1Var, e1<T> e1Var2) {
            super(1);
            this.f22688f = e1Var;
            this.f22689m = e1Var2;
        }

        @Override // pc.l
        public final j0.e0 invoke(j0.f0 f0Var) {
            qc.q.i(f0Var, "$this$DisposableEffect");
            this.f22688f.e(this.f22689m);
            return new C0523a(this.f22688f, this.f22689m);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Transition.kt */
    /* loaded from: classes.dex */
    public static final class b extends qc.r implements pc.l<j0.f0, j0.e0> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ e1<S> f22692f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ e1<S>.a<T, V> f22693m;

        /* compiled from: Effects.kt */
        /* loaded from: classes.dex */
        public static final class a implements j0.e0 {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ e1 f22694a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ e1.a f22695b;

            public a(e1 e1Var, e1.a aVar) {
                this.f22694a = e1Var;
                this.f22695b = aVar;
            }

            @Override // j0.e0
            public void dispose() {
                this.f22694a.v(this.f22695b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(e1<S> e1Var, e1<S>.a<T, V> aVar) {
            super(1);
            this.f22692f = e1Var;
            this.f22693m = aVar;
        }

        @Override // pc.l
        public final j0.e0 invoke(j0.f0 f0Var) {
            qc.q.i(f0Var, "$this$DisposableEffect");
            return new a(this.f22692f, this.f22693m);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Transition.kt */
    /* loaded from: classes.dex */
    public static final class c extends qc.r implements pc.l<j0.f0, j0.e0> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ e1<S> f22696f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ e1<S>.d<T, V> f22697m;

        /* compiled from: Effects.kt */
        /* loaded from: classes.dex */
        public static final class a implements j0.e0 {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ e1 f22698a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ e1.d f22699b;

            public a(e1 e1Var, e1.d dVar) {
                this.f22698a = e1Var;
                this.f22699b = dVar;
            }

            @Override // j0.e0
            public void dispose() {
                this.f22698a.w(this.f22699b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(e1<S> e1Var, e1<S>.d<T, V> dVar) {
            super(1);
            this.f22696f = e1Var;
            this.f22697m = dVar;
        }

        @Override // pc.l
        public final j0.e0 invoke(j0.f0 f0Var) {
            qc.q.i(f0Var, "$this$DisposableEffect");
            this.f22696f.d(this.f22697m);
            return new a(this.f22696f, this.f22697m);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Transition.kt */
    /* loaded from: classes.dex */
    public static final class d extends qc.r implements pc.l<j0.f0, j0.e0> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ e1<T> f22700f;

        /* compiled from: Effects.kt */
        /* loaded from: classes.dex */
        public static final class a implements j0.e0 {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ e1 f22701a;

            public a(e1 e1Var) {
                this.f22701a = e1Var;
            }

            @Override // j0.e0
            public void dispose() {
                this.f22701a.t();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(e1<T> e1Var) {
            super(1);
            this.f22700f = e1Var;
        }

        @Override // pc.l
        public final j0.e0 invoke(j0.f0 f0Var) {
            qc.q.i(f0Var, "$this$DisposableEffect");
            return new a(this.f22700f);
        }
    }

    public static final <S, T> e1<T> a(e1<S> e1Var, T t10, T t11, String str, j0.l lVar, int i10) {
        qc.q.i(e1Var, "<this>");
        qc.q.i(str, "childLabel");
        lVar.e(-198307638);
        if (j0.n.K()) {
            j0.n.V(-198307638, i10, -1, "androidx.compose.animation.core.createChildTransitionInternal (Transition.kt:794)");
        }
        lVar.e(1157296644);
        boolean Q = lVar.Q(e1Var);
        Object f10 = lVar.f();
        if (Q || f10 == j0.l.f18688a.a()) {
            f10 = new e1(new q0(t10), e1Var.h() + " > " + str);
            lVar.J(f10);
        }
        lVar.N();
        e1<T> e1Var2 = (e1) f10;
        lVar.e(511388516);
        boolean Q2 = lVar.Q(e1Var) | lVar.Q(e1Var2);
        Object f11 = lVar.f();
        if (Q2 || f11 == j0.l.f18688a.a()) {
            f11 = new a(e1Var, e1Var2);
            lVar.J(f11);
        }
        lVar.N();
        j0.h0.b(e1Var2, (pc.l) f11, lVar, 0);
        if (e1Var.q()) {
            e1Var2.y(t10, t11, e1Var.i());
        } else {
            e1Var2.G(t11, lVar, ((i10 >> 3) & 8) | ((i10 >> 6) & 14));
            e1Var2.B(false);
        }
        if (j0.n.K()) {
            j0.n.U();
        }
        lVar.N();
        return e1Var2;
    }

    public static final <S, T, V extends q> e1<S>.a<T, V> b(e1<S> e1Var, i1<T, V> i1Var, String str, j0.l lVar, int i10, int i11) {
        qc.q.i(e1Var, "<this>");
        qc.q.i(i1Var, "typeConverter");
        lVar.e(-1714122528);
        if ((i11 & 2) != 0) {
            str = "DeferredAnimation";
        }
        if (j0.n.K()) {
            j0.n.V(-1714122528, i10, -1, "androidx.compose.animation.core.createDeferredAnimation (Transition.kt:749)");
        }
        lVar.e(1157296644);
        boolean Q = lVar.Q(e1Var);
        Object f10 = lVar.f();
        if (Q || f10 == j0.l.f18688a.a()) {
            f10 = new e1.a(e1Var, i1Var, str);
            lVar.J(f10);
        }
        lVar.N();
        e1<S>.a<T, V> aVar = (e1.a) f10;
        j0.h0.b(aVar, new b(e1Var, aVar), lVar, 0);
        if (e1Var.q()) {
            aVar.d();
        }
        if (j0.n.K()) {
            j0.n.U();
        }
        lVar.N();
        return aVar;
    }

    public static final <S, T, V extends q> g3<T> c(e1<S> e1Var, T t10, T t11, e0<T> e0Var, i1<T, V> i1Var, String str, j0.l lVar, int i10) {
        qc.q.i(e1Var, "<this>");
        qc.q.i(e0Var, "animationSpec");
        qc.q.i(i1Var, "typeConverter");
        qc.q.i(str, "label");
        lVar.e(-304821198);
        if (j0.n.K()) {
            j0.n.V(-304821198, i10, -1, "androidx.compose.animation.core.createTransitionAnimation (Transition.kt:866)");
        }
        lVar.e(1157296644);
        boolean Q = lVar.Q(e1Var);
        Object f10 = lVar.f();
        if (Q || f10 == j0.l.f18688a.a()) {
            f10 = new e1.d(e1Var, t10, m.e(i1Var, t11), i1Var, str);
            lVar.J(f10);
        }
        lVar.N();
        e1.d dVar = (e1.d) f10;
        if (e1Var.q()) {
            dVar.F(t10, t11, e0Var);
        } else {
            dVar.G(t11, e0Var);
        }
        lVar.e(511388516);
        boolean Q2 = lVar.Q(e1Var) | lVar.Q(dVar);
        Object f11 = lVar.f();
        if (Q2 || f11 == j0.l.f18688a.a()) {
            f11 = new c(e1Var, dVar);
            lVar.J(f11);
        }
        lVar.N();
        j0.h0.b(dVar, (pc.l) f11, lVar, 0);
        if (j0.n.K()) {
            j0.n.U();
        }
        lVar.N();
        return dVar;
    }

    public static final <T> e1<T> d(T t10, String str, j0.l lVar, int i10, int i11) {
        lVar.e(2029166765);
        if ((i11 & 2) != 0) {
            str = null;
        }
        if (j0.n.K()) {
            j0.n.V(2029166765, i10, -1, "androidx.compose.animation.core.updateTransition (Transition.kt:67)");
        }
        lVar.e(-492369756);
        Object f10 = lVar.f();
        l.a aVar = j0.l.f18688a;
        if (f10 == aVar.a()) {
            f10 = new e1(t10, str);
            lVar.J(f10);
        }
        lVar.N();
        e1<T> e1Var = (e1) f10;
        e1Var.f(t10, lVar, (i10 & 8) | 48 | (i10 & 14));
        lVar.e(1157296644);
        boolean Q = lVar.Q(e1Var);
        Object f11 = lVar.f();
        if (Q || f11 == aVar.a()) {
            f11 = new d(e1Var);
            lVar.J(f11);
        }
        lVar.N();
        j0.h0.b(e1Var, (pc.l) f11, lVar, 6);
        if (j0.n.K()) {
            j0.n.U();
        }
        lVar.N();
        return e1Var;
    }
}
