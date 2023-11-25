package f0;

/* compiled from: ContentAlpha.kt */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    public static final n f14905a = new n();

    private n() {
    }

    private final float a(float f10, float f11, j0.l lVar, int i10) {
        lVar.e(-1528360391);
        if (j0.n.K()) {
            j0.n.V(-1528360391, i10, -1, "androidx.compose.material.ContentAlpha.contentAlpha (ContentAlpha.kt:70)");
        }
        long y10 = ((a1.p1) lVar.C(p.a())).y();
        if (!s0.f15068a.a(lVar, 6).o() ? a1.r1.i(y10) >= 0.5d : a1.r1.i(y10) <= 0.5d) {
            f10 = f11;
        }
        if (j0.n.K()) {
            j0.n.U();
        }
        lVar.N();
        return f10;
    }

    public final float b(j0.l lVar, int i10) {
        lVar.e(621183615);
        if (j0.n.K()) {
            j0.n.V(621183615, i10, -1, "androidx.compose.material.ContentAlpha.<get-disabled> (ContentAlpha.kt:56)");
        }
        float a10 = a(0.38f, 0.38f, lVar, ((i10 << 6) & 896) | 54);
        if (j0.n.K()) {
            j0.n.U();
        }
        lVar.N();
        return a10;
    }

    public final float c(j0.l lVar, int i10) {
        lVar.e(629162431);
        if (j0.n.K()) {
            j0.n.V(629162431, i10, -1, "androidx.compose.material.ContentAlpha.<get-high> (ContentAlpha.kt:34)");
        }
        float a10 = a(1.0f, 0.87f, lVar, ((i10 << 6) & 896) | 54);
        if (j0.n.K()) {
            j0.n.U();
        }
        lVar.N();
        return a10;
    }

    public final float d(j0.l lVar, int i10) {
        lVar.e(1999054879);
        if (j0.n.K()) {
            j0.n.V(1999054879, i10, -1, "androidx.compose.material.ContentAlpha.<get-medium> (ContentAlpha.kt:45)");
        }
        float a10 = a(0.74f, 0.6f, lVar, ((i10 << 6) & 896) | 54);
        if (j0.n.K()) {
            j0.n.U();
        }
        lVar.N();
        return a10;
    }
}
