package b1;

import b1.b;
import b1.h;

/* compiled from: ColorSpace.kt */
/* loaded from: classes.dex */
public final class d {
    public static final double a(double d10, double d11, double d12, double d13, double d14, double d15) {
        double d16;
        if (d10 < 0.0d) {
            d16 = -d10;
        } else {
            d16 = d10;
        }
        return Math.copySign(q(d16, d11, d12, d13, d14, d15), d10);
    }

    public static final double b(double d10, double d11, double d12, double d13, double d14, double d15) {
        double d16;
        if (d10 < 0.0d) {
            d16 = -d10;
        } else {
            d16 = d10;
        }
        return Math.copySign(s(d16, d11, d12, d13, d14, d15), d10);
    }

    public static final c c(c cVar, y yVar, a aVar) {
        qc.q.i(cVar, "<this>");
        qc.q.i(yVar, "whitePoint");
        qc.q.i(aVar, "adaptation");
        if (b.e(cVar.g(), b.f7632a.b())) {
            w wVar = (w) cVar;
            if (f(wVar.R(), yVar)) {
                return cVar;
            }
            return new w(wVar, k(e(aVar.b(), wVar.R().c(), yVar.c()), wVar.Q()), yVar);
        }
        return cVar;
    }

    public static /* synthetic */ c d(c cVar, y yVar, a aVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            aVar = a.f7627b.a();
        }
        return c(cVar, yVar, aVar);
    }

    public static final float[] e(float[] fArr, float[] fArr2, float[] fArr3) {
        qc.q.i(fArr, "matrix");
        qc.q.i(fArr2, "srcWhitePoint");
        qc.q.i(fArr3, "dstWhitePoint");
        float[] m10 = m(fArr, fArr2);
        float[] m11 = m(fArr, fArr3);
        return k(j(fArr), l(new float[]{m11[0] / m10[0], m11[1] / m10[1], m11[2] / m10[2]}, fArr));
    }

    public static final boolean f(y yVar, y yVar2) {
        qc.q.i(yVar, "a");
        qc.q.i(yVar2, "b");
        if (yVar == yVar2) {
            return true;
        }
        if (Math.abs(yVar.a() - yVar2.a()) < 0.001f && Math.abs(yVar.b() - yVar2.b()) < 0.001f) {
            return true;
        }
        return false;
    }

    public static final boolean g(float[] fArr, float[] fArr2) {
        qc.q.i(fArr, "a");
        qc.q.i(fArr2, "b");
        if (fArr == fArr2) {
            return true;
        }
        int length = fArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (Float.compare(fArr[i10], fArr2[i10]) != 0 && Math.abs(fArr[i10] - fArr2[i10]) > 0.001f) {
                return false;
            }
        }
        return true;
    }

    public static final h h(c cVar, c cVar2, int i10) {
        qc.q.i(cVar, "$this$connect");
        qc.q.i(cVar2, "destination");
        g gVar = g.f7641a;
        if (cVar == gVar.w()) {
            if (cVar2 == gVar.w()) {
                return h.f7665g.d();
            }
            if (cVar2 == gVar.t() && m.e(i10, m.f7695a.b())) {
                return h.f7665g.e();
            }
        } else if (cVar == gVar.t() && cVar2 == gVar.w() && m.e(i10, m.f7695a.b())) {
            return h.f7665g.c();
        }
        if (cVar == cVar2) {
            return h.f7665g.f(cVar);
        }
        long g10 = cVar.g();
        b.a aVar = b.f7632a;
        qc.h hVar = null;
        if (b.e(g10, aVar.b()) && b.e(cVar2.g(), aVar.b())) {
            return new h.b((w) cVar, (w) cVar2, i10, hVar);
        }
        return new h(cVar, cVar2, i10, hVar);
    }

    public static /* synthetic */ h i(c cVar, c cVar2, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            cVar2 = g.f7641a.w();
        }
        if ((i11 & 2) != 0) {
            i10 = m.f7695a.b();
        }
        return h(cVar, cVar2, i10);
    }

    public static final float[] j(float[] fArr) {
        qc.q.i(fArr, "m");
        float f10 = fArr[0];
        float f11 = fArr[3];
        float f12 = fArr[6];
        float f13 = fArr[1];
        float f14 = fArr[4];
        float f15 = fArr[7];
        float f16 = fArr[2];
        float f17 = fArr[5];
        float f18 = fArr[8];
        float f19 = (f14 * f18) - (f15 * f17);
        float f20 = (f15 * f16) - (f13 * f18);
        float f21 = (f13 * f17) - (f14 * f16);
        float f22 = (f10 * f19) + (f11 * f20) + (f12 * f21);
        float[] fArr2 = new float[fArr.length];
        fArr2[0] = f19 / f22;
        fArr2[1] = f20 / f22;
        fArr2[2] = f21 / f22;
        fArr2[3] = ((f12 * f17) - (f11 * f18)) / f22;
        fArr2[4] = ((f18 * f10) - (f12 * f16)) / f22;
        fArr2[5] = ((f16 * f11) - (f17 * f10)) / f22;
        fArr2[6] = ((f11 * f15) - (f12 * f14)) / f22;
        fArr2[7] = ((f12 * f13) - (f15 * f10)) / f22;
        fArr2[8] = ((f10 * f14) - (f11 * f13)) / f22;
        return fArr2;
    }

    public static final float[] k(float[] fArr, float[] fArr2) {
        qc.q.i(fArr, "lhs");
        qc.q.i(fArr2, "rhs");
        float f10 = fArr[0] * fArr2[0];
        float f11 = fArr[3];
        float f12 = fArr2[1];
        float f13 = fArr[6];
        float f14 = fArr2[2];
        float f15 = fArr[1];
        float f16 = fArr2[0];
        float f17 = fArr[4];
        float f18 = fArr[7];
        float f19 = fArr[2] * f16;
        float f20 = fArr[5];
        float f21 = f19 + (fArr2[1] * f20);
        float f22 = fArr[8];
        float f23 = fArr[0];
        float f24 = fArr2[3] * f23;
        float f25 = fArr2[4];
        float f26 = f24 + (f11 * f25);
        float f27 = fArr2[5];
        float f28 = fArr[1];
        float f29 = fArr2[3];
        float f30 = fArr[2];
        float f31 = f23 * fArr2[6];
        float f32 = fArr[3];
        float f33 = fArr2[7];
        float f34 = f31 + (f32 * f33);
        float f35 = fArr2[8];
        float f36 = fArr2[6];
        return new float[]{f10 + (f11 * f12) + (f13 * f14), (f15 * f16) + (f12 * f17) + (f18 * f14), f21 + (f14 * f22), f26 + (f13 * f27), (f28 * f29) + (f17 * f25) + (f18 * f27), (f29 * f30) + (f20 * fArr2[4]) + (f27 * f22), f34 + (f13 * f35), (f28 * f36) + (fArr[4] * f33) + (f18 * f35), (f30 * f36) + (fArr[5] * fArr2[7]) + (f22 * f35)};
    }

    public static final float[] l(float[] fArr, float[] fArr2) {
        qc.q.i(fArr, "lhs");
        qc.q.i(fArr2, "rhs");
        float f10 = fArr[0];
        float f11 = fArr[1];
        float f12 = fArr[2];
        return new float[]{fArr[0] * fArr2[0], fArr[1] * fArr2[1], fArr[2] * fArr2[2], fArr2[3] * f10, fArr2[4] * f11, fArr2[5] * f12, f10 * fArr2[6], f11 * fArr2[7], f12 * fArr2[8]};
    }

    public static final float[] m(float[] fArr, float[] fArr2) {
        qc.q.i(fArr, "lhs");
        qc.q.i(fArr2, "rhs");
        float f10 = fArr2[0];
        float f11 = fArr2[1];
        float f12 = fArr2[2];
        fArr2[0] = (fArr[0] * f10) + (fArr[3] * f11) + (fArr[6] * f12);
        fArr2[1] = (fArr[1] * f10) + (fArr[4] * f11) + (fArr[7] * f12);
        fArr2[2] = (fArr[2] * f10) + (fArr[5] * f11) + (fArr[8] * f12);
        return fArr2;
    }

    public static final float n(float[] fArr, float f10, float f11, float f12) {
        qc.q.i(fArr, "lhs");
        return (fArr[0] * f10) + (fArr[3] * f11) + (fArr[6] * f12);
    }

    public static final float o(float[] fArr, float f10, float f11, float f12) {
        qc.q.i(fArr, "lhs");
        return (fArr[1] * f10) + (fArr[4] * f11) + (fArr[7] * f12);
    }

    public static final float p(float[] fArr, float f10, float f11, float f12) {
        qc.q.i(fArr, "lhs");
        return (fArr[2] * f10) + (fArr[5] * f11) + (fArr[8] * f12);
    }

    public static final double q(double d10, double d11, double d12, double d13, double d14, double d15) {
        if (d10 >= d14 * d13) {
            return (Math.pow(d10, 1.0d / d15) - d12) / d11;
        }
        return d10 / d13;
    }

    public static final double r(double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17) {
        if (d10 >= d14 * d13) {
            return (Math.pow(d10 - d15, 1.0d / d17) - d12) / d11;
        }
        return (d10 - d16) / d13;
    }

    public static final double s(double d10, double d11, double d12, double d13, double d14, double d15) {
        if (d10 >= d14) {
            return Math.pow((d11 * d10) + d12, d15);
        }
        return d10 * d13;
    }

    public static final double t(double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17) {
        if (d10 >= d14) {
            return Math.pow((d11 * d10) + d12, d17) + d15;
        }
        return (d13 * d10) + d16;
    }
}
