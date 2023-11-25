package e0;

import v1.g0;
import v1.i0;
import v1.j0;

/* compiled from: SelectionAdjustment.kt */
/* loaded from: classes.dex */
public interface k {

    /* renamed from: a  reason: collision with root package name */
    public static final a f13641a = a.f13642a;

    /* compiled from: SelectionAdjustment.kt */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f13642a = new a();

        /* renamed from: b  reason: collision with root package name */
        private static final k f13643b = new c();

        /* renamed from: c  reason: collision with root package name */
        private static final k f13644c = new C0322a();

        /* renamed from: d  reason: collision with root package name */
        private static final k f13645d = new e();

        /* renamed from: e  reason: collision with root package name */
        private static final k f13646e = new d();

        /* renamed from: f  reason: collision with root package name */
        private static final k f13647f = new b();

        /* compiled from: SelectionAdjustment.kt */
        /* renamed from: e0.k$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0322a implements k {
            C0322a() {
            }

            @Override // e0.k
            public long a(g0 g0Var, long j10, int i10, boolean z10, i0 i0Var) {
                boolean z11;
                int R;
                qc.q.i(g0Var, "textLayoutResult");
                if (i0.h(j10)) {
                    if (i0Var != null) {
                        z11 = i0.m(i0Var.r());
                    } else {
                        z11 = false;
                    }
                    String i11 = g0Var.k().j().i();
                    int n10 = i0.n(j10);
                    R = yc.w.R(g0Var.k().j());
                    return l.a(i11, n10, R, z10, z11);
                }
                return j10;
            }
        }

        /* compiled from: SelectionAdjustment.kt */
        /* loaded from: classes.dex */
        public static final class b implements k {
            b() {
            }

            private final boolean b(g0 g0Var, int i10) {
                long B = g0Var.B(i10);
                if (i10 != i0.n(B) && i10 != i0.i(B)) {
                    return false;
                }
                return true;
            }

            private final boolean c(int i10, int i11, boolean z10, boolean z11) {
                if (i11 == -1) {
                    return true;
                }
                if (i10 == i11) {
                    return false;
                }
                if (z10 ^ z11) {
                    if (i10 < i11) {
                        return true;
                    }
                } else if (i10 > i11) {
                    return true;
                }
                return false;
            }

            private final int d(g0 g0Var, int i10, int i11, int i12, boolean z10, boolean z11) {
                int t10;
                int o10;
                long B = g0Var.B(i10);
                if (g0Var.p(i0.n(B)) == i11) {
                    t10 = i0.n(B);
                } else {
                    t10 = g0Var.t(i11);
                }
                if (g0Var.p(i0.i(B)) == i11) {
                    o10 = i0.i(B);
                } else {
                    o10 = g0.o(g0Var, i11, false, 2, null);
                }
                if (t10 == i12) {
                    return o10;
                }
                if (o10 == i12) {
                    return t10;
                }
                int i13 = (t10 + o10) / 2;
                if (z10 ^ z11) {
                    if (i10 <= i13) {
                        return t10;
                    }
                } else if (i10 < i13) {
                    return t10;
                }
                return o10;
            }

            private final int e(g0 g0Var, int i10, int i11, int i12, int i13, boolean z10, boolean z11) {
                if (i10 == i11) {
                    return i12;
                }
                int p10 = g0Var.p(i10);
                if (p10 != g0Var.p(i12)) {
                    return d(g0Var, i10, p10, i13, z10, z11);
                }
                if (!c(i10, i11, z10, z11)) {
                    return i10;
                }
                if (!b(g0Var, i12)) {
                    return i10;
                }
                return d(g0Var, i10, p10, i13, z10, z11);
            }

            @Override // e0.k
            public long a(g0 g0Var, long j10, int i10, boolean z10, i0 i0Var) {
                int e10;
                int i11;
                int R;
                qc.q.i(g0Var, "textLayoutResult");
                if (i0Var == null) {
                    return a.f13642a.g().a(g0Var, j10, i10, z10, i0Var);
                }
                if (i0.h(j10)) {
                    String i12 = g0Var.k().j().i();
                    int n10 = i0.n(j10);
                    R = yc.w.R(g0Var.k().j());
                    return l.a(i12, n10, R, z10, i0.m(i0Var.r()));
                }
                if (z10) {
                    i11 = e(g0Var, i0.n(j10), i10, i0.n(i0Var.r()), i0.i(j10), true, i0.m(j10));
                    e10 = i0.i(j10);
                } else {
                    int n11 = i0.n(j10);
                    e10 = e(g0Var, i0.i(j10), i10, i0.i(i0Var.r()), i0.n(j10), false, i0.m(j10));
                    i11 = n11;
                }
                return j0.b(i11, e10);
            }
        }

        /* compiled from: SelectionAdjustment.kt */
        /* loaded from: classes.dex */
        public static final class c implements k {
            c() {
            }

            @Override // e0.k
            public long a(g0 g0Var, long j10, int i10, boolean z10, i0 i0Var) {
                qc.q.i(g0Var, "textLayoutResult");
                return j10;
            }
        }

        /* compiled from: SelectionAdjustment.kt */
        /* loaded from: classes.dex */
        public static final class d implements k {

            /* compiled from: SelectionAdjustment.kt */
            /* renamed from: e0.k$a$d$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            /* synthetic */ class C0323a extends qc.n implements pc.l<Integer, i0> {
                C0323a(Object obj) {
                    super(1, obj, c0.a0.class, "getParagraphBoundary", "getParagraphBoundary(Ljava/lang/CharSequence;I)J", 1);
                }

                public final long h(int i10) {
                    return c0.a0.c((CharSequence) this.f21661m, i10);
                }

                @Override // pc.l
                public /* bridge */ /* synthetic */ i0 invoke(Integer num) {
                    return i0.b(h(num.intValue()));
                }
            }

            d() {
            }

            @Override // e0.k
            public long a(g0 g0Var, long j10, int i10, boolean z10, i0 i0Var) {
                qc.q.i(g0Var, "textLayoutResult");
                return a.f13642a.b(g0Var, j10, new C0323a(g0Var.k().j()));
            }
        }

        /* compiled from: SelectionAdjustment.kt */
        /* loaded from: classes.dex */
        public static final class e implements k {

            /* compiled from: SelectionAdjustment.kt */
            /* renamed from: e0.k$a$e$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            /* synthetic */ class C0324a extends qc.n implements pc.l<Integer, i0> {
                C0324a(Object obj) {
                    super(1, obj, g0.class, "getWordBoundary", "getWordBoundary--jx7JFs(I)J", 0);
                }

                public final long h(int i10) {
                    return ((g0) this.f21661m).B(i10);
                }

                @Override // pc.l
                public /* bridge */ /* synthetic */ i0 invoke(Integer num) {
                    return i0.b(h(num.intValue()));
                }
            }

            e() {
            }

            @Override // e0.k
            public long a(g0 g0Var, long j10, int i10, boolean z10, i0 i0Var) {
                qc.q.i(g0Var, "textLayoutResult");
                return a.f13642a.b(g0Var, j10, new C0324a(g0Var));
            }
        }

        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final long b(g0 g0Var, long j10, pc.l<? super Integer, i0> lVar) {
            boolean z10;
            int R;
            int l10;
            int l11;
            int n10;
            int i10;
            if (g0Var.k().j().length() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                R = yc.w.R(g0Var.k().j());
                l10 = vc.l.l(i0.n(j10), 0, R);
                long r10 = lVar.invoke(Integer.valueOf(l10)).r();
                l11 = vc.l.l(i0.i(j10), 0, R);
                long r11 = lVar.invoke(Integer.valueOf(l11)).r();
                if (i0.m(j10)) {
                    n10 = i0.i(r10);
                } else {
                    n10 = i0.n(r10);
                }
                if (i0.m(j10)) {
                    i10 = i0.n(r11);
                } else {
                    i10 = i0.i(r11);
                }
                return j0.b(n10, i10);
            }
            return i0.f24470b.a();
        }

        public final k c() {
            return f13644c;
        }

        public final k d() {
            return f13647f;
        }

        public final k e() {
            return f13643b;
        }

        public final k f() {
            return f13646e;
        }

        public final k g() {
            return f13645d;
        }
    }

    long a(g0 g0Var, long j10, int i10, boolean z10, i0 i0Var);
}
