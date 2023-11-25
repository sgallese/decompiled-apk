package p1;

import java.util.Comparator;

/* compiled from: OnPositionedDispatcher.kt */
/* loaded from: classes.dex */
public final class f1 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f20787b = new a(null);

    /* renamed from: a  reason: collision with root package name */
    private final k0.f<j0> f20788a = new k0.f<>(new j0[16], 0);

    /* compiled from: OnPositionedDispatcher.kt */
    /* loaded from: classes.dex */
    public static final class a {

        /* compiled from: OnPositionedDispatcher.kt */
        /* renamed from: p1.f1$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        private static final class C0466a implements Comparator<j0> {

            /* renamed from: f  reason: collision with root package name */
            public static final C0466a f20789f = new C0466a();

            private C0466a() {
            }

            @Override // java.util.Comparator
            /* renamed from: a  reason: merged with bridge method [inline-methods] */
            public int compare(j0 j0Var, j0 j0Var2) {
                qc.q.i(j0Var, "a");
                qc.q.i(j0Var2, "b");
                int k10 = qc.q.k(j0Var2.J(), j0Var.J());
                if (k10 != 0) {
                    return k10;
                }
                return qc.q.k(j0Var.hashCode(), j0Var2.hashCode());
            }
        }

        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }
    }

    private final void b(j0 j0Var) {
        j0Var.z();
        int i10 = 0;
        j0Var.s1(false);
        k0.f<j0> t02 = j0Var.t0();
        int o10 = t02.o();
        if (o10 > 0) {
            j0[] n10 = t02.n();
            do {
                b(n10[i10]);
                i10++;
            } while (i10 < o10);
        }
    }

    public final void a() {
        this.f20788a.B(a.C0466a.f20789f);
        k0.f<j0> fVar = this.f20788a;
        int o10 = fVar.o();
        if (o10 > 0) {
            int i10 = o10 - 1;
            j0[] n10 = fVar.n();
            do {
                j0 j0Var = n10[i10];
                if (j0Var.h0()) {
                    b(j0Var);
                }
                i10--;
            } while (i10 >= 0);
        }
        this.f20788a.i();
    }

    public final boolean c() {
        return this.f20788a.s();
    }

    public final void d(j0 j0Var) {
        qc.q.i(j0Var, "node");
        this.f20788a.d(j0Var);
        j0Var.s1(true);
    }

    public final void e(j0 j0Var) {
        qc.q.i(j0Var, "rootNode");
        this.f20788a.i();
        this.f20788a.d(j0Var);
        j0Var.s1(true);
    }
}
