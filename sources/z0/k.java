package z0;

import qc.q;

/* compiled from: RoundRect.kt */
/* loaded from: classes.dex */
public final class k {
    public static final j a(float f10, float f11, float f12, float f13, float f14, float f15) {
        long a10 = b.a(f14, f15);
        return new j(f10, f11, f12, f13, a10, a10, a10, a10, null);
    }

    public static final j b(h hVar, long j10, long j11, long j12, long j13) {
        q.i(hVar, "rect");
        return new j(hVar.i(), hVar.l(), hVar.j(), hVar.e(), j10, j11, j12, j13, null);
    }

    public static final j c(float f10, float f11, float f12, float f13, long j10) {
        return a(f10, f11, f12, f13, a.d(j10), a.e(j10));
    }

    public static final boolean d(j jVar) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        q.i(jVar, "<this>");
        if (a.d(jVar.h()) == a.e(jVar.h())) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (a.d(jVar.h()) == a.d(jVar.i())) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                if (a.d(jVar.h()) == a.e(jVar.i())) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    if (a.d(jVar.h()) == a.d(jVar.c())) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (z13) {
                        if (a.d(jVar.h()) == a.e(jVar.c())) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (z14) {
                            if (a.d(jVar.h()) == a.d(jVar.b())) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            if (z15) {
                                if (a.d(jVar.h()) == a.e(jVar.b())) {
                                    z16 = true;
                                } else {
                                    z16 = false;
                                }
                                if (z16) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
}
