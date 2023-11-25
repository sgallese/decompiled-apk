package f0;

/* compiled from: FloatingActionButton.kt */
/* loaded from: classes.dex */
public final class k0 {

    /* renamed from: a  reason: collision with root package name */
    public static final k0 f14819a = new k0();

    private k0() {
    }

    public final l0 a(float f10, float f11, float f12, float f13, j0.l lVar, int i10, int i11) {
        lVar.e(380403812);
        if ((i11 & 1) != 0) {
            f10 = j2.h.j(6);
        }
        float f14 = f10;
        if ((i11 & 2) != 0) {
            f11 = j2.h.j(12);
        }
        float f15 = f11;
        if ((i11 & 4) != 0) {
            f12 = j2.h.j(8);
        }
        float f16 = f12;
        if ((i11 & 8) != 0) {
            f13 = j2.h.j(8);
        }
        float f17 = f13;
        if (j0.n.K()) {
            j0.n.V(380403812, i10, -1, "androidx.compose.material.FloatingActionButtonDefaults.elevation (FloatingActionButton.kt:244)");
        }
        Object[] objArr = {j2.h.f(f14), j2.h.f(f15), j2.h.f(f16), j2.h.f(f17)};
        lVar.e(-568225417);
        boolean z10 = false;
        for (int i12 = 0; i12 < 4; i12++) {
            z10 |= lVar.Q(objArr[i12]);
        }
        Object f18 = lVar.f();
        if (z10 || f18 == j0.l.f18688a.a()) {
            f18 = new t(f14, f15, f16, f17, null);
            lVar.J(f18);
        }
        lVar.N();
        t tVar = (t) f18;
        if (j0.n.K()) {
            j0.n.U();
        }
        lVar.N();
        return tVar;
    }
}
