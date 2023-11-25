package androidx.compose.ui.platform;

import android.graphics.Rect;

/* compiled from: AccessibilityIterators.android.kt */
/* loaded from: classes.dex */
public final class e extends b {

    /* renamed from: h  reason: collision with root package name */
    private static e f2649h;

    /* renamed from: c  reason: collision with root package name */
    private v1.g0 f2652c;

    /* renamed from: d  reason: collision with root package name */
    private t1.p f2653d;

    /* renamed from: e  reason: collision with root package name */
    private Rect f2654e;

    /* renamed from: f  reason: collision with root package name */
    public static final a f2647f = new a(null);

    /* renamed from: g  reason: collision with root package name */
    public static final int f2648g = 8;

    /* renamed from: i  reason: collision with root package name */
    private static final g2.i f2650i = g2.i.Rtl;

    /* renamed from: j  reason: collision with root package name */
    private static final g2.i f2651j = g2.i.Ltr;

    /* compiled from: AccessibilityIterators.android.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }

        public final e a() {
            if (e.f2649h == null) {
                e.f2649h = new e(null);
            }
            e eVar = e.f2649h;
            qc.q.g(eVar, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.PageTextSegmentIterator");
            return eVar;
        }
    }

    public /* synthetic */ e(qc.h hVar) {
        this();
    }

    private final int i(int i10, g2.i iVar) {
        v1.g0 g0Var = this.f2652c;
        v1.g0 g0Var2 = null;
        if (g0Var == null) {
            qc.q.z("layoutResult");
            g0Var = null;
        }
        int t10 = g0Var.t(i10);
        v1.g0 g0Var3 = this.f2652c;
        if (g0Var3 == null) {
            qc.q.z("layoutResult");
            g0Var3 = null;
        }
        if (iVar != g0Var3.x(t10)) {
            v1.g0 g0Var4 = this.f2652c;
            if (g0Var4 == null) {
                qc.q.z("layoutResult");
            } else {
                g0Var2 = g0Var4;
            }
            return g0Var2.t(i10);
        }
        v1.g0 g0Var5 = this.f2652c;
        if (g0Var5 == null) {
            qc.q.z("layoutResult");
            g0Var5 = null;
        }
        return v1.g0.o(g0Var5, i10, false, 2, null) - 1;
    }

    @Override // androidx.compose.ui.platform.g
    public int[] a(int i10) {
        int d10;
        int d11;
        int m10;
        v1.g0 g0Var = null;
        if (d().length() <= 0 || i10 >= d().length()) {
            return null;
        }
        try {
            t1.p pVar = this.f2653d;
            if (pVar == null) {
                qc.q.z("node");
                pVar = null;
            }
            d10 = sc.c.d(pVar.h().h());
            d11 = vc.l.d(0, i10);
            v1.g0 g0Var2 = this.f2652c;
            if (g0Var2 == null) {
                qc.q.z("layoutResult");
                g0Var2 = null;
            }
            int p10 = g0Var2.p(d11);
            v1.g0 g0Var3 = this.f2652c;
            if (g0Var3 == null) {
                qc.q.z("layoutResult");
                g0Var3 = null;
            }
            float u10 = g0Var3.u(p10) + d10;
            v1.g0 g0Var4 = this.f2652c;
            if (g0Var4 == null) {
                qc.q.z("layoutResult");
                g0Var4 = null;
            }
            v1.g0 g0Var5 = this.f2652c;
            if (g0Var5 == null) {
                qc.q.z("layoutResult");
                g0Var5 = null;
            }
            if (u10 < g0Var4.u(g0Var5.m() - 1)) {
                v1.g0 g0Var6 = this.f2652c;
                if (g0Var6 == null) {
                    qc.q.z("layoutResult");
                } else {
                    g0Var = g0Var6;
                }
                m10 = g0Var.q(u10);
            } else {
                v1.g0 g0Var7 = this.f2652c;
                if (g0Var7 == null) {
                    qc.q.z("layoutResult");
                } else {
                    g0Var = g0Var7;
                }
                m10 = g0Var.m();
            }
            return c(d11, i(m10 - 1, f2651j) + 1);
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    @Override // androidx.compose.ui.platform.g
    public int[] b(int i10) {
        int d10;
        int h10;
        int i11;
        v1.g0 g0Var = null;
        if (d().length() <= 0 || i10 <= 0) {
            return null;
        }
        try {
            t1.p pVar = this.f2653d;
            if (pVar == null) {
                qc.q.z("node");
                pVar = null;
            }
            d10 = sc.c.d(pVar.h().h());
            h10 = vc.l.h(d().length(), i10);
            v1.g0 g0Var2 = this.f2652c;
            if (g0Var2 == null) {
                qc.q.z("layoutResult");
                g0Var2 = null;
            }
            int p10 = g0Var2.p(h10);
            v1.g0 g0Var3 = this.f2652c;
            if (g0Var3 == null) {
                qc.q.z("layoutResult");
                g0Var3 = null;
            }
            float u10 = g0Var3.u(p10) - d10;
            if (u10 > 0.0f) {
                v1.g0 g0Var4 = this.f2652c;
                if (g0Var4 == null) {
                    qc.q.z("layoutResult");
                } else {
                    g0Var = g0Var4;
                }
                i11 = g0Var.q(u10);
            } else {
                i11 = 0;
            }
            if (h10 == d().length() && i11 < p10) {
                i11++;
            }
            return c(i(i11, f2650i), h10);
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    public final void j(String str, v1.g0 g0Var, t1.p pVar) {
        qc.q.i(str, "text");
        qc.q.i(g0Var, "layoutResult");
        qc.q.i(pVar, "node");
        f(str);
        this.f2652c = g0Var;
        this.f2653d = pVar;
    }

    private e() {
        this.f2654e = new Rect();
    }
}
