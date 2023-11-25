package androidx.compose.ui.platform;

/* compiled from: AccessibilityIterators.android.kt */
/* loaded from: classes.dex */
public final class d extends b {

    /* renamed from: f  reason: collision with root package name */
    private static d f2636f;

    /* renamed from: c  reason: collision with root package name */
    private v1.g0 f2639c;

    /* renamed from: d  reason: collision with root package name */
    public static final a f2634d = new a(null);

    /* renamed from: e  reason: collision with root package name */
    public static final int f2635e = 8;

    /* renamed from: g  reason: collision with root package name */
    private static final g2.i f2637g = g2.i.Rtl;

    /* renamed from: h  reason: collision with root package name */
    private static final g2.i f2638h = g2.i.Ltr;

    /* compiled from: AccessibilityIterators.android.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }

        public final d a() {
            if (d.f2636f == null) {
                d.f2636f = new d(null);
            }
            d dVar = d.f2636f;
            qc.q.g(dVar, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.LineTextSegmentIterator");
            return dVar;
        }
    }

    public /* synthetic */ d(qc.h hVar) {
        this();
    }

    private final int i(int i10, g2.i iVar) {
        v1.g0 g0Var = this.f2639c;
        v1.g0 g0Var2 = null;
        if (g0Var == null) {
            qc.q.z("layoutResult");
            g0Var = null;
        }
        int t10 = g0Var.t(i10);
        v1.g0 g0Var3 = this.f2639c;
        if (g0Var3 == null) {
            qc.q.z("layoutResult");
            g0Var3 = null;
        }
        if (iVar != g0Var3.x(t10)) {
            v1.g0 g0Var4 = this.f2639c;
            if (g0Var4 == null) {
                qc.q.z("layoutResult");
            } else {
                g0Var2 = g0Var4;
            }
            return g0Var2.t(i10);
        }
        v1.g0 g0Var5 = this.f2639c;
        if (g0Var5 == null) {
            qc.q.z("layoutResult");
            g0Var5 = null;
        }
        return v1.g0.o(g0Var5, i10, false, 2, null) - 1;
    }

    @Override // androidx.compose.ui.platform.g
    public int[] a(int i10) {
        int i11;
        if (d().length() <= 0 || i10 >= d().length()) {
            return null;
        }
        if (i10 < 0) {
            v1.g0 g0Var = this.f2639c;
            if (g0Var == null) {
                qc.q.z("layoutResult");
                g0Var = null;
            }
            i11 = g0Var.p(0);
        } else {
            v1.g0 g0Var2 = this.f2639c;
            if (g0Var2 == null) {
                qc.q.z("layoutResult");
                g0Var2 = null;
            }
            int p10 = g0Var2.p(i10);
            if (i(p10, f2637g) == i10) {
                i11 = p10;
            } else {
                i11 = p10 + 1;
            }
        }
        v1.g0 g0Var3 = this.f2639c;
        if (g0Var3 == null) {
            qc.q.z("layoutResult");
            g0Var3 = null;
        }
        if (i11 >= g0Var3.m()) {
            return null;
        }
        return c(i(i11, f2637g), i(i11, f2638h) + 1);
    }

    @Override // androidx.compose.ui.platform.g
    public int[] b(int i10) {
        int i11;
        if (d().length() <= 0 || i10 <= 0) {
            return null;
        }
        if (i10 > d().length()) {
            v1.g0 g0Var = this.f2639c;
            if (g0Var == null) {
                qc.q.z("layoutResult");
                g0Var = null;
            }
            i11 = g0Var.p(d().length());
        } else {
            v1.g0 g0Var2 = this.f2639c;
            if (g0Var2 == null) {
                qc.q.z("layoutResult");
                g0Var2 = null;
            }
            int p10 = g0Var2.p(i10);
            if (i(p10, f2638h) + 1 == i10) {
                i11 = p10;
            } else {
                i11 = p10 - 1;
            }
        }
        if (i11 < 0) {
            return null;
        }
        return c(i(i11, f2637g), i(i11, f2638h) + 1);
    }

    public final void j(String str, v1.g0 g0Var) {
        qc.q.i(str, "text");
        qc.q.i(g0Var, "layoutResult");
        f(str);
        this.f2639c = g0Var;
    }

    private d() {
    }
}
