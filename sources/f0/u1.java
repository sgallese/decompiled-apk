package f0;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;

/* compiled from: Switch.kt */
/* loaded from: classes.dex */
public final class u1 {

    /* renamed from: a  reason: collision with root package name */
    public static final u1 f15100a = new u1();

    private u1() {
    }

    public final t1 a(long j10, long j11, float f10, long j12, long j13, float f11, long j14, long j15, long j16, long j17, j0.l lVar, int i10, int i11, int i12) {
        float f12;
        long j18;
        long j19;
        long j20;
        long j21;
        int i13;
        long j22;
        lVar.e(-1032127534);
        long m10 = (i12 & 1) != 0 ? s0.f15068a.a(lVar, 6).m() : j10;
        long j23 = (i12 & 2) != 0 ? m10 : j11;
        float f13 = (i12 & 4) != 0 ? 0.54f : f10;
        long n10 = (i12 & 8) != 0 ? s0.f15068a.a(lVar, 6).n() : j12;
        long i14 = (i12 & 16) != 0 ? s0.f15068a.a(lVar, 6).i() : j13;
        float f14 = (i12 & 32) != 0 ? 0.38f : f11;
        if ((i12 & 64) != 0) {
            f12 = f13;
            j18 = a1.r1.g(a1.p1.o(m10, n.f14905a.b(lVar, 6), 0.0f, 0.0f, 0.0f, 14, null), s0.f15068a.a(lVar, 6).n());
        } else {
            f12 = f13;
            j18 = j14;
        }
        if ((i12 & 128) != 0) {
            j19 = m10;
            j20 = a1.r1.g(a1.p1.o(j23, n.f14905a.b(lVar, 6), 0.0f, 0.0f, 0.0f, 14, null), s0.f15068a.a(lVar, 6).n());
        } else {
            j19 = m10;
            j20 = j15;
        }
        if ((i12 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0) {
            i13 = 6;
            j21 = j18;
            j22 = a1.r1.g(a1.p1.o(n10, n.f14905a.b(lVar, 6), 0.0f, 0.0f, 0.0f, 14, null), s0.f15068a.a(lVar, 6).n());
        } else {
            j21 = j18;
            i13 = 6;
            j22 = j16;
        }
        long g10 = (i12 & 512) != 0 ? a1.r1.g(a1.p1.o(i14, n.f14905a.b(lVar, i13), 0.0f, 0.0f, 0.0f, 14, null), s0.f15068a.a(lVar, 6).n()) : j17;
        if (j0.n.K()) {
            j0.n.V(-1032127534, i10, i11, "androidx.compose.material.SwitchDefaults.colors (Switch.kt:320)");
        }
        v vVar = new v(j19, a1.p1.o(j23, f12, 0.0f, 0.0f, 0.0f, 14, null), n10, a1.p1.o(i14, f14, 0.0f, 0.0f, 0.0f, 14, null), j21, a1.p1.o(j20, f12, 0.0f, 0.0f, 0.0f, 14, null), j22, a1.p1.o(g10, f14, 0.0f, 0.0f, 0.0f, 14, null), null);
        if (j0.n.K()) {
            j0.n.U();
        }
        lVar.N();
        return vVar;
    }
}
