package f0;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ElevationOverlay.kt */
/* loaded from: classes.dex */
public final class s implements e0 {

    /* renamed from: a  reason: collision with root package name */
    public static final s f15067a = new s();

    private s() {
    }

    @Override // f0.e0
    public long a(long j10, float f10, j0.l lVar, int i10) {
        long b10;
        if (j0.n.K()) {
            j0.n.V(-1687113661, i10, -1, "androidx.compose.material.DefaultElevationOverlay.apply (ElevationOverlay.kt:68)");
        }
        j a10 = s0.f15068a.a(lVar, 6);
        if (j2.h.i(f10, j2.h.j(0)) > 0 && !a10.o()) {
            b10 = f0.b(j10, f10, lVar, (i10 & 112) | (i10 & 14));
            j10 = a1.r1.g(b10, j10);
        }
        if (j0.n.K()) {
            j0.n.U();
        }
        return j10;
    }
}
