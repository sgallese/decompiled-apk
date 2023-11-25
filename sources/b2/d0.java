package b2;

import j0.g1;
import j0.o2;
import j0.y2;

/* compiled from: PlatformTextInputAdapter.kt */
/* loaded from: classes.dex */
public final class d0 implements c0 {

    /* renamed from: a  reason: collision with root package name */
    private final pc.p<b0<?>, z, a0> f7744a;

    /* renamed from: b  reason: collision with root package name */
    private final t0.t<b0<?>, c<?>> f7745b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f7746c;

    /* renamed from: d  reason: collision with root package name */
    private b0<?> f7747d;

    /* compiled from: PlatformTextInputAdapter.kt */
    /* loaded from: classes.dex */
    public static final class a<T extends a0> {

        /* renamed from: a  reason: collision with root package name */
        private final T f7748a;

        /* renamed from: b  reason: collision with root package name */
        private final pc.a<Boolean> f7749b;

        public a(T t10, pc.a<Boolean> aVar) {
            qc.q.i(t10, "adapter");
            qc.q.i(aVar, "onDispose");
            this.f7748a = t10;
            this.f7749b = aVar;
        }

        public final T a() {
            return this.f7748a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: PlatformTextInputAdapter.kt */
    /* loaded from: classes.dex */
    public final class b implements z {

        /* renamed from: a  reason: collision with root package name */
        private final b0<?> f7750a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d0 f7751b;

        public b(d0 d0Var, b0<?> b0Var) {
            qc.q.i(b0Var, "plugin");
            this.f7751b = d0Var;
            this.f7750a = b0Var;
        }

        @Override // b2.z
        public void a() {
            this.f7751b.f7747d = this.f7750a;
        }

        @Override // b2.z
        public void b() {
            if (qc.q.d(this.f7751b.f7747d, this.f7750a)) {
                this.f7751b.f7747d = null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: PlatformTextInputAdapter.kt */
    /* loaded from: classes.dex */
    public final class c<T extends a0> {

        /* renamed from: a  reason: collision with root package name */
        private final T f7752a;

        /* renamed from: b  reason: collision with root package name */
        private final g1 f7753b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ d0 f7754c;

        public c(d0 d0Var, T t10) {
            qc.q.i(t10, "adapter");
            this.f7754c = d0Var;
            this.f7752a = t10;
            this.f7753b = o2.a(0);
        }

        private final int c() {
            return this.f7753b.d();
        }

        private final void e(int i10) {
            this.f7753b.i(i10);
        }

        public final boolean a() {
            boolean z10;
            e(c() - 1);
            if (c() >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                if (c() == 0) {
                    this.f7754c.f7746c = true;
                    return true;
                }
                return false;
            }
            throw new IllegalStateException(("AdapterWithRefCount.decrementRefCount called too many times (refCount=" + c() + ')').toString());
        }

        public final T b() {
            return this.f7752a;
        }

        public final void d() {
            e(c() + 1);
        }
    }

    /* compiled from: PlatformTextInputAdapter.kt */
    /* loaded from: classes.dex */
    static final class d extends qc.r implements pc.a<Boolean> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ c<T> f7755f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(c<T> cVar) {
            super(0);
            this.f7755f = cVar;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // pc.a
        public final Boolean invoke() {
            return Boolean.valueOf(this.f7755f.a());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d0(pc.p<? super b0<?>, ? super z, ? extends a0> pVar) {
        qc.q.i(pVar, "factory");
        this.f7744a = pVar;
        this.f7745b = y2.g();
    }

    private final <T extends a0> c<T> f(b0<T> b0Var) {
        a0 invoke = this.f7744a.invoke(b0Var, new b(this, b0Var));
        qc.q.g(invoke, "null cannot be cast to non-null type T of androidx.compose.ui.text.input.PlatformTextInputPluginRegistryImpl.instantiateAdapter");
        c<T> cVar = new c<>(this, invoke);
        this.f7745b.put(b0Var, cVar);
        return cVar;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [b2.a0] */
    public final a0 d() {
        c<?> cVar = this.f7745b.get(this.f7747d);
        if (cVar != null) {
            return cVar.b();
        }
        return null;
    }

    public final <T extends a0> a<T> e(b0<T> b0Var) {
        qc.q.i(b0Var, "plugin");
        c<?> cVar = this.f7745b.get(b0Var);
        if (cVar == null) {
            cVar = f(b0Var);
        }
        cVar.d();
        return new a<>(cVar.b(), new d(cVar));
    }
}
