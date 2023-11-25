package p1;

/* compiled from: ObserverModifierNode.kt */
/* loaded from: classes.dex */
public final class e1 implements j1 {

    /* renamed from: m  reason: collision with root package name */
    public static final b f20783m = new b(null);

    /* renamed from: p  reason: collision with root package name */
    private static final pc.l<e1, dc.w> f20784p = a.f20786f;

    /* renamed from: f  reason: collision with root package name */
    private final c1 f20785f;

    /* compiled from: ObserverModifierNode.kt */
    /* loaded from: classes.dex */
    static final class a extends qc.r implements pc.l<e1, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        public static final a f20786f = new a();

        a() {
            super(1);
        }

        public final void a(e1 e1Var) {
            qc.q.i(e1Var, "it");
            if (e1Var.M()) {
                e1Var.b().E0();
            }
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ dc.w invoke(e1 e1Var) {
            a(e1Var);
            return dc.w.f13270a;
        }
    }

    /* compiled from: ObserverModifierNode.kt */
    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(qc.h hVar) {
            this();
        }

        public final pc.l<e1, dc.w> a() {
            return e1.f20784p;
        }
    }

    public e1(c1 c1Var) {
        qc.q.i(c1Var, "observerNode");
        this.f20785f = c1Var;
    }

    @Override // p1.j1
    public boolean M() {
        return this.f20785f.getNode().p1();
    }

    public final c1 b() {
        return this.f20785f;
    }
}
