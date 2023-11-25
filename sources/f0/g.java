package f0;

/* compiled from: Button.kt */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final g f14733a = new g();

    /* renamed from: b  reason: collision with root package name */
    private static final float f14734b;

    /* renamed from: c  reason: collision with root package name */
    private static final float f14735c;

    /* renamed from: d  reason: collision with root package name */
    private static final w.s f14736d;

    /* renamed from: e  reason: collision with root package name */
    private static final float f14737e;

    /* renamed from: f  reason: collision with root package name */
    private static final float f14738f;

    /* renamed from: g  reason: collision with root package name */
    private static final float f14739g;

    /* renamed from: h  reason: collision with root package name */
    private static final float f14740h;

    /* renamed from: i  reason: collision with root package name */
    private static final float f14741i;

    /* renamed from: j  reason: collision with root package name */
    private static final float f14742j;

    /* renamed from: k  reason: collision with root package name */
    private static final w.s f14743k;

    /* renamed from: l  reason: collision with root package name */
    public static final int f14744l = 0;

    static {
        float j10 = j2.h.j(16);
        f14734b = j10;
        float f10 = 8;
        float j11 = j2.h.j(f10);
        f14735c = j11;
        w.s d10 = androidx.compose.foundation.layout.j.d(j10, j11, j10, j11);
        f14736d = d10;
        f14737e = j2.h.j(64);
        f14738f = j2.h.j(36);
        f14739g = j2.h.j(18);
        f14740h = j2.h.j(f10);
        f14741i = j2.h.j(1);
        float j12 = j2.h.j(f10);
        f14742j = j12;
        f14743k = androidx.compose.foundation.layout.j.d(j12, d10.d(), j12, d10.a());
    }

    private g() {
    }

    public final f a(long j10, long j11, long j12, long j13, j0.l lVar, int i10, int i11) {
        long j14;
        long j15;
        long j16;
        long j17;
        lVar.e(1870371134);
        if ((i11 & 1) != 0) {
            j14 = s0.f15068a.a(lVar, 6).j();
        } else {
            j14 = j10;
        }
        if ((i11 & 2) != 0) {
            j15 = k.b(j14, lVar, i10 & 14);
        } else {
            j15 = j11;
        }
        if ((i11 & 4) != 0) {
            s0 s0Var = s0.f15068a;
            j16 = a1.r1.g(a1.p1.o(s0Var.a(lVar, 6).i(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), s0Var.a(lVar, 6).n());
        } else {
            j16 = j12;
        }
        if ((i11 & 8) != 0) {
            j17 = a1.p1.o(s0.f15068a.a(lVar, 6).i(), n.f14905a.b(lVar, 6), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j17 = j13;
        }
        if (j0.n.K()) {
            j0.n.V(1870371134, i10, -1, "androidx.compose.material.ButtonDefaults.buttonColors (Button.kt:405)");
        }
        q qVar = new q(j14, j15, j16, j17, null);
        if (j0.n.K()) {
            j0.n.U();
        }
        lVar.N();
        return qVar;
    }

    public final h b(float f10, float f11, float f12, float f13, float f14, j0.l lVar, int i10, int i11) {
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        lVar.e(-737170518);
        if ((i11 & 1) != 0) {
            f15 = j2.h.j(2);
        } else {
            f15 = f10;
        }
        if ((i11 & 2) != 0) {
            f16 = j2.h.j(8);
        } else {
            f16 = f11;
        }
        if ((i11 & 4) != 0) {
            f17 = j2.h.j(0);
        } else {
            f17 = f12;
        }
        if ((i11 & 8) != 0) {
            f18 = j2.h.j(4);
        } else {
            f18 = f13;
        }
        if ((i11 & 16) != 0) {
            f19 = j2.h.j(4);
        } else {
            f19 = f14;
        }
        if (j0.n.K()) {
            j0.n.V(-737170518, i10, -1, "androidx.compose.material.ButtonDefaults.elevation (Button.kt:371)");
        }
        Object[] objArr = {j2.h.f(f15), j2.h.f(f16), j2.h.f(f17), j2.h.f(f18), j2.h.f(f19)};
        lVar.e(-568225417);
        boolean z10 = false;
        for (int i12 = 0; i12 < 5; i12++) {
            z10 |= lVar.Q(objArr[i12]);
        }
        Object f20 = lVar.f();
        if (z10 || f20 == j0.l.f18688a.a()) {
            f20 = new r(f15, f16, f17, f18, f19, null);
            lVar.J(f20);
        }
        lVar.N();
        r rVar = (r) f20;
        if (j0.n.K()) {
            j0.n.U();
        }
        lVar.N();
        return rVar;
    }

    public final w.s c() {
        return f14736d;
    }

    public final float d() {
        return f14738f;
    }

    public final float e() {
        return f14737e;
    }

    public final t.g f(j0.l lVar, int i10) {
        lVar.e(-2091313033);
        if (j0.n.K()) {
            j0.n.V(-2091313033, i10, -1, "androidx.compose.material.ButtonDefaults.<get-outlinedBorder> (Button.kt:476)");
        }
        t.g a10 = t.h.a(f14741i, a1.p1.o(s0.f15068a.a(lVar, 6).i(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null));
        if (j0.n.K()) {
            j0.n.U();
        }
        lVar.N();
        return a10;
    }

    public final w.s g() {
        return f14743k;
    }

    public final f h(long j10, long j11, long j12, j0.l lVar, int i10, int i11) {
        long j13;
        long j14;
        long j15;
        lVar.e(-2124406093);
        if ((i11 & 1) != 0) {
            j13 = s0.f15068a.a(lVar, 6).n();
        } else {
            j13 = j10;
        }
        if ((i11 & 2) != 0) {
            j14 = s0.f15068a.a(lVar, 6).j();
        } else {
            j14 = j11;
        }
        if ((i11 & 4) != 0) {
            j15 = a1.p1.o(s0.f15068a.a(lVar, 6).i(), n.f14905a.b(lVar, 6), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j15 = j12;
        }
        if (j0.n.K()) {
            j0.n.V(-2124406093, i10, -1, "androidx.compose.material.ButtonDefaults.outlinedButtonColors (Button.kt:428)");
        }
        q qVar = new q(j13, j14, j13, j15, null);
        if (j0.n.K()) {
            j0.n.U();
        }
        lVar.N();
        return qVar;
    }

    public final f i(long j10, long j11, long j12, j0.l lVar, int i10, int i11) {
        long j13;
        long j14;
        long j15;
        lVar.e(182742216);
        if ((i11 & 1) != 0) {
            j13 = a1.p1.f146b.d();
        } else {
            j13 = j10;
        }
        if ((i11 & 2) != 0) {
            j14 = s0.f15068a.a(lVar, 6).j();
        } else {
            j14 = j11;
        }
        if ((i11 & 4) != 0) {
            j15 = a1.p1.o(s0.f15068a.a(lVar, 6).i(), n.f14905a.b(lVar, 6), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j15 = j12;
        }
        if (j0.n.K()) {
            j0.n.V(182742216, i10, -1, "androidx.compose.material.ButtonDefaults.textButtonColors (Button.kt:449)");
        }
        q qVar = new q(j13, j14, j13, j15, null);
        if (j0.n.K()) {
            j0.n.U();
        }
        lVar.N();
        return qVar;
    }
}
