package f0;

/* compiled from: Snackbar.kt */
/* loaded from: classes.dex */
public final class k1 {

    /* renamed from: a  reason: collision with root package name */
    public static final k1 f14820a = new k1();

    private k1() {
    }

    public final long a(j0.l lVar, int i10) {
        lVar.e(1630911716);
        if (j0.n.K()) {
            j0.n.V(1630911716, i10, -1, "androidx.compose.material.SnackbarDefaults.<get-backgroundColor> (Snackbar.kt:200)");
        }
        s0 s0Var = s0.f15068a;
        long g10 = a1.r1.g(a1.p1.o(s0Var.a(lVar, 6).i(), 0.8f, 0.0f, 0.0f, 0.0f, 14, null), s0Var.a(lVar, 6).n());
        if (j0.n.K()) {
            j0.n.U();
        }
        lVar.N();
        return g10;
    }

    public final long b(j0.l lVar, int i10) {
        long k10;
        lVar.e(-810329402);
        if (j0.n.K()) {
            j0.n.V(-810329402, i10, -1, "androidx.compose.material.SnackbarDefaults.<get-primaryActionColor> (Snackbar.kt:221)");
        }
        j a10 = s0.f15068a.a(lVar, 6);
        if (a10.o()) {
            k10 = a1.r1.g(a1.p1.o(a10.n(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null), a10.j());
        } else {
            k10 = a10.k();
        }
        if (j0.n.K()) {
            j0.n.U();
        }
        lVar.N();
        return k10;
    }
}
