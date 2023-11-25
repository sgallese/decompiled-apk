package androidx.lifecycle;

/* compiled from: Transformations.kt */
/* loaded from: classes.dex */
public final class u0 {

    /* JADX INFO: Add missing generic type declarations: [X] */
    /* compiled from: Transformations.kt */
    /* loaded from: classes.dex */
    static final class a<X> extends qc.r implements pc.l<X, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ d0<X> f5053f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ qc.b0 f5054m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(d0<X> d0Var, qc.b0 b0Var) {
            super(1);
            this.f5053f = d0Var;
            this.f5054m = b0Var;
        }

        public final void a(X x10) {
            X f10 = this.f5053f.f();
            if (this.f5054m.f21657f || ((f10 == null && x10 != null) || (f10 != null && !qc.q.d(f10, x10)))) {
                this.f5054m.f21657f = false;
                this.f5053f.p(x10);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // pc.l
        public /* bridge */ /* synthetic */ dc.w invoke(Object obj) {
            a(obj);
            return dc.w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [X] */
    /* compiled from: Transformations.kt */
    /* loaded from: classes.dex */
    public static final class b<X> extends qc.r implements pc.l<X, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ d0<Y> f5055f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ pc.l<X, Y> f5056m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(d0<Y> d0Var, pc.l<X, Y> lVar) {
            super(1);
            this.f5055f = d0Var;
            this.f5056m = lVar;
        }

        public final void a(X x10) {
            this.f5055f.p(this.f5056m.invoke(x10));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // pc.l
        public /* bridge */ /* synthetic */ dc.w invoke(Object obj) {
            a(obj);
            return dc.w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Transformations.kt */
    /* loaded from: classes.dex */
    public static final class c implements g0, qc.k {

        /* renamed from: f  reason: collision with root package name */
        private final /* synthetic */ pc.l f5057f;

        c(pc.l lVar) {
            qc.q.i(lVar, "function");
            this.f5057f = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof g0) || !(obj instanceof qc.k)) {
                return false;
            }
            return qc.q.d(getFunctionDelegate(), ((qc.k) obj).getFunctionDelegate());
        }

        @Override // qc.k
        public final dc.c<?> getFunctionDelegate() {
            return this.f5057f;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.g0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f5057f.invoke(obj);
        }
    }

    public static final <X> LiveData<X> a(LiveData<X> liveData) {
        qc.q.i(liveData, "<this>");
        d0 d0Var = new d0();
        qc.b0 b0Var = new qc.b0();
        b0Var.f21657f = true;
        if (liveData.i()) {
            d0Var.p(liveData.f());
            b0Var.f21657f = false;
        }
        d0Var.q(liveData, new c(new a(d0Var, b0Var)));
        return d0Var;
    }

    public static final <X, Y> LiveData<Y> b(LiveData<X> liveData, pc.l<X, Y> lVar) {
        qc.q.i(liveData, "<this>");
        qc.q.i(lVar, "transform");
        d0 d0Var = new d0();
        d0Var.q(liveData, new c(new b(d0Var, lVar)));
        return d0Var;
    }
}
