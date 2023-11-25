package a1;

/* compiled from: Color.kt */
/* loaded from: classes.dex */
public final class r1 {
    /* JADX WARN: Removed duplicated region for block: B:34:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x014d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long a(float r9, float r10, float r11, float r12, b1.c r13) {
        /*
            Method dump skipped, instructions count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a1.r1.a(float, float, float, float, b1.c):long");
    }

    public static final long b(int i10) {
        return p1.l(dc.t.d(dc.t.d(i10) << 32));
    }

    public static final long c(int i10, int i11, int i12, int i13) {
        return b(((i10 & 255) << 16) | ((i13 & 255) << 24) | ((i11 & 255) << 8) | (i12 & 255));
    }

    public static final long d(long j10) {
        return p1.l(dc.t.d(dc.t.d(dc.t.d(j10) & 4294967295L) << 32));
    }

    public static /* synthetic */ long e(float f10, float f11, float f12, float f13, b1.c cVar, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            f13 = 1.0f;
        }
        if ((i10 & 16) != 0) {
            cVar = b1.g.f7641a.w();
        }
        return a(f10, f11, f12, f13, cVar);
    }

    public static /* synthetic */ long f(int i10, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 8) != 0) {
            i13 = 255;
        }
        return c(i10, i11, i12, i13);
    }

    public static final long g(long j10, long j11) {
        boolean z10;
        float f10;
        boolean z11;
        float f11;
        long m10 = p1.m(j10, p1.t(j11));
        float r10 = p1.r(j11);
        float r11 = p1.r(m10);
        float f12 = 1.0f - r11;
        float f13 = (r10 * f12) + r11;
        float v10 = p1.v(m10);
        float v11 = p1.v(j11);
        boolean z12 = true;
        float f14 = 0.0f;
        if (f13 == 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            f10 = 0.0f;
        } else {
            f10 = ((v10 * r11) + ((v11 * r10) * f12)) / f13;
        }
        float u10 = p1.u(m10);
        float u11 = p1.u(j11);
        if (f13 == 0.0f) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            f11 = 0.0f;
        } else {
            f11 = ((u10 * r11) + ((u11 * r10) * f12)) / f13;
        }
        float s10 = p1.s(m10);
        float s11 = p1.s(j11);
        if (f13 != 0.0f) {
            z12 = false;
        }
        if (!z12) {
            f14 = ((s10 * r11) + ((s11 * r10) * f12)) / f13;
        }
        return a(f10, f11, f14, f13, p1.t(j11));
    }

    public static final long h(long j10, long j11, float f10) {
        b1.c t10 = b1.g.f7641a.t();
        long m10 = p1.m(j10, t10);
        long m11 = p1.m(j11, t10);
        float r10 = p1.r(m10);
        float v10 = p1.v(m10);
        float u10 = p1.u(m10);
        float s10 = p1.s(m10);
        float r11 = p1.r(m11);
        float v11 = p1.v(m11);
        float u11 = p1.u(m11);
        float s11 = p1.s(m11);
        return p1.m(a(k2.a.a(v10, v11, f10), k2.a.a(u10, u11, f10), k2.a.a(s10, s11, f10), k2.a.a(r10, r11, f10), t10), p1.t(j11));
    }

    public static final float i(long j10) {
        b1.c t10 = p1.t(j10);
        if (b1.b.e(t10.g(), b1.b.f7632a.b())) {
            qc.q.g(t10, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
            b1.i I = ((b1.w) t10).I();
            return j((float) ((I.a(p1.v(j10)) * 0.2126d) + (I.a(p1.u(j10)) * 0.7152d) + (I.a(p1.s(j10)) * 0.0722d)));
        }
        throw new IllegalArgumentException(("The specified color must be encoded in an RGB color space. The supplied color space is " + ((Object) b1.b.h(t10.g()))).toString());
    }

    private static final float j(float f10) {
        if (f10 <= 0.0f) {
            return 0.0f;
        }
        if (f10 >= 1.0f) {
            return 1.0f;
        }
        return f10;
    }

    public static final int k(long j10) {
        return (int) dc.t.d(p1.m(j10, b1.g.f7641a.w()) >>> 32);
    }
}
