package a1;

import android.graphics.ColorSpace;
import j$.util.function.DoubleUnaryOperator$CC;
import java.util.function.DoubleUnaryOperator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AndroidColorSpace.android.kt */
/* loaded from: classes.dex */
public final class p3 {

    /* renamed from: a  reason: collision with root package name */
    public static final p3 f161a = new p3();

    private p3() {
    }

    public static final ColorSpace e(b1.c cVar) {
        ColorSpace.Named named;
        ColorSpace colorSpace;
        ColorSpace.Rgb.TransferParameters transferParameters;
        ColorSpace.Rgb a10;
        ColorSpace.Named named2;
        ColorSpace colorSpace2;
        ColorSpace.Named named3;
        ColorSpace colorSpace3;
        ColorSpace.Named named4;
        ColorSpace colorSpace4;
        ColorSpace.Named named5;
        ColorSpace colorSpace5;
        ColorSpace.Named named6;
        ColorSpace colorSpace6;
        ColorSpace.Named named7;
        ColorSpace colorSpace7;
        ColorSpace.Named named8;
        ColorSpace colorSpace8;
        ColorSpace.Named named9;
        ColorSpace colorSpace9;
        ColorSpace.Named named10;
        ColorSpace colorSpace10;
        ColorSpace.Named named11;
        ColorSpace colorSpace11;
        ColorSpace.Named named12;
        ColorSpace colorSpace12;
        ColorSpace.Named named13;
        ColorSpace colorSpace13;
        ColorSpace.Named named14;
        ColorSpace colorSpace14;
        ColorSpace.Named named15;
        ColorSpace colorSpace15;
        ColorSpace.Named named16;
        ColorSpace colorSpace16;
        ColorSpace.Named named17;
        ColorSpace colorSpace17;
        qc.q.i(cVar, "<this>");
        b1.g gVar = b1.g.f7641a;
        if (qc.q.d(cVar, gVar.w())) {
            named17 = ColorSpace.Named.SRGB;
            colorSpace17 = ColorSpace.get(named17);
            qc.q.h(colorSpace17, "get(android.graphics.ColorSpace.Named.SRGB)");
            return colorSpace17;
        } else if (qc.q.d(cVar, gVar.e())) {
            named16 = ColorSpace.Named.ACES;
            colorSpace16 = ColorSpace.get(named16);
            qc.q.h(colorSpace16, "get(android.graphics.ColorSpace.Named.ACES)");
            return colorSpace16;
        } else if (qc.q.d(cVar, gVar.f())) {
            named15 = ColorSpace.Named.ACESCG;
            colorSpace15 = ColorSpace.get(named15);
            qc.q.h(colorSpace15, "get(android.graphics.ColorSpace.Named.ACESCG)");
            return colorSpace15;
        } else if (qc.q.d(cVar, gVar.g())) {
            named14 = ColorSpace.Named.ADOBE_RGB;
            colorSpace14 = ColorSpace.get(named14);
            qc.q.h(colorSpace14, "get(android.graphics.ColorSpace.Named.ADOBE_RGB)");
            return colorSpace14;
        } else if (qc.q.d(cVar, gVar.h())) {
            named13 = ColorSpace.Named.BT2020;
            colorSpace13 = ColorSpace.get(named13);
            qc.q.h(colorSpace13, "get(android.graphics.ColorSpace.Named.BT2020)");
            return colorSpace13;
        } else if (qc.q.d(cVar, gVar.i())) {
            named12 = ColorSpace.Named.BT709;
            colorSpace12 = ColorSpace.get(named12);
            qc.q.h(colorSpace12, "get(android.graphics.ColorSpace.Named.BT709)");
            return colorSpace12;
        } else if (qc.q.d(cVar, gVar.j())) {
            named11 = ColorSpace.Named.CIE_LAB;
            colorSpace11 = ColorSpace.get(named11);
            qc.q.h(colorSpace11, "get(android.graphics.ColorSpace.Named.CIE_LAB)");
            return colorSpace11;
        } else if (qc.q.d(cVar, gVar.k())) {
            named10 = ColorSpace.Named.CIE_XYZ;
            colorSpace10 = ColorSpace.get(named10);
            qc.q.h(colorSpace10, "get(android.graphics.ColorSpace.Named.CIE_XYZ)");
            return colorSpace10;
        } else if (qc.q.d(cVar, gVar.m())) {
            named9 = ColorSpace.Named.DCI_P3;
            colorSpace9 = ColorSpace.get(named9);
            qc.q.h(colorSpace9, "get(android.graphics.ColorSpace.Named.DCI_P3)");
            return colorSpace9;
        } else if (qc.q.d(cVar, gVar.n())) {
            named8 = ColorSpace.Named.DISPLAY_P3;
            colorSpace8 = ColorSpace.get(named8);
            qc.q.h(colorSpace8, "get(android.graphics.ColorSpace.Named.DISPLAY_P3)");
            return colorSpace8;
        } else if (qc.q.d(cVar, gVar.o())) {
            named7 = ColorSpace.Named.EXTENDED_SRGB;
            colorSpace7 = ColorSpace.get(named7);
            qc.q.h(colorSpace7, "get(android.graphics.Col…pace.Named.EXTENDED_SRGB)");
            return colorSpace7;
        } else if (qc.q.d(cVar, gVar.p())) {
            named6 = ColorSpace.Named.LINEAR_EXTENDED_SRGB;
            colorSpace6 = ColorSpace.get(named6);
            qc.q.h(colorSpace6, "get(android.graphics.Col…med.LINEAR_EXTENDED_SRGB)");
            return colorSpace6;
        } else if (qc.q.d(cVar, gVar.q())) {
            named5 = ColorSpace.Named.LINEAR_SRGB;
            colorSpace5 = ColorSpace.get(named5);
            qc.q.h(colorSpace5, "get(android.graphics.ColorSpace.Named.LINEAR_SRGB)");
            return colorSpace5;
        } else if (qc.q.d(cVar, gVar.r())) {
            named4 = ColorSpace.Named.NTSC_1953;
            colorSpace4 = ColorSpace.get(named4);
            qc.q.h(colorSpace4, "get(android.graphics.ColorSpace.Named.NTSC_1953)");
            return colorSpace4;
        } else if (qc.q.d(cVar, gVar.u())) {
            named3 = ColorSpace.Named.PRO_PHOTO_RGB;
            colorSpace3 = ColorSpace.get(named3);
            qc.q.h(colorSpace3, "get(android.graphics.Col…pace.Named.PRO_PHOTO_RGB)");
            return colorSpace3;
        } else if (qc.q.d(cVar, gVar.v())) {
            named2 = ColorSpace.Named.SMPTE_C;
            colorSpace2 = ColorSpace.get(named2);
            qc.q.h(colorSpace2, "get(android.graphics.ColorSpace.Named.SMPTE_C)");
            return colorSpace2;
        } else {
            if (!(cVar instanceof b1.w)) {
                named = ColorSpace.Named.SRGB;
                colorSpace = ColorSpace.get(named);
            } else {
                b1.w wVar = (b1.w) cVar;
                float[] c10 = wVar.R().c();
                b1.x P = wVar.P();
                if (P != null) {
                    a3.a();
                    transferParameters = t1.a(P.a(), P.b(), P.c(), P.d(), P.e(), P.f(), P.g());
                } else {
                    transferParameters = null;
                }
                if (transferParameters != null) {
                    f3.a();
                    a10 = p2.a(cVar.h(), ((b1.w) cVar).O(), c10, transferParameters);
                } else {
                    f3.a();
                    String h10 = cVar.h();
                    b1.w wVar2 = (b1.w) cVar;
                    float[] O = wVar2.O();
                    final pc.l<Double, Double> L = wVar2.L();
                    DoubleUnaryOperator doubleUnaryOperator = new DoubleUnaryOperator() { // from class: a1.l3
                        public /* synthetic */ DoubleUnaryOperator andThen(DoubleUnaryOperator doubleUnaryOperator2) {
                            return DoubleUnaryOperator$CC.$default$andThen(this, doubleUnaryOperator2);
                        }

                        @Override // java.util.function.DoubleUnaryOperator
                        public final double applyAsDouble(double d10) {
                            double f10;
                            f10 = p3.f(pc.l.this, d10);
                            return f10;
                        }

                        public /* synthetic */ DoubleUnaryOperator compose(DoubleUnaryOperator doubleUnaryOperator2) {
                            return DoubleUnaryOperator$CC.$default$compose(this, doubleUnaryOperator2);
                        }
                    };
                    final pc.l<Double, Double> H = wVar2.H();
                    a10 = e2.a(h10, O, c10, doubleUnaryOperator, new DoubleUnaryOperator() { // from class: a1.m3
                        public /* synthetic */ DoubleUnaryOperator andThen(DoubleUnaryOperator doubleUnaryOperator2) {
                            return DoubleUnaryOperator$CC.$default$andThen(this, doubleUnaryOperator2);
                        }

                        @Override // java.util.function.DoubleUnaryOperator
                        public final double applyAsDouble(double d10) {
                            double g10;
                            g10 = p3.g(pc.l.this, d10);
                            return g10;
                        }

                        public /* synthetic */ DoubleUnaryOperator compose(DoubleUnaryOperator doubleUnaryOperator2) {
                            return DoubleUnaryOperator$CC.$default$compose(this, doubleUnaryOperator2);
                        }
                    }, cVar.f(0), cVar.e(0));
                }
                colorSpace = d2.a(a10);
            }
            qc.q.h(colorSpace, "{\n                if (th…          }\n            }");
            return colorSpace;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double f(pc.l lVar, double d10) {
        qc.q.i(lVar, "$tmp0");
        return ((Number) lVar.invoke(Double.valueOf(d10))).doubleValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double g(pc.l lVar, double d10) {
        qc.q.i(lVar, "$tmp0");
        return ((Number) lVar.invoke(Double.valueOf(d10))).doubleValue();
    }

    public static final b1.c h(final ColorSpace colorSpace) {
        int id2;
        ColorSpace.Named named;
        int ordinal;
        ColorSpace.Named named2;
        int ordinal2;
        ColorSpace.Named named3;
        int ordinal3;
        ColorSpace.Named named4;
        int ordinal4;
        ColorSpace.Named named5;
        int ordinal5;
        ColorSpace.Named named6;
        int ordinal6;
        ColorSpace.Named named7;
        int ordinal7;
        ColorSpace.Named named8;
        int ordinal8;
        ColorSpace.Named named9;
        int ordinal9;
        ColorSpace.Named named10;
        int ordinal10;
        ColorSpace.Named named11;
        int ordinal11;
        ColorSpace.Named named12;
        int ordinal12;
        ColorSpace.Named named13;
        int ordinal13;
        ColorSpace.Named named14;
        int ordinal14;
        ColorSpace.Named named15;
        int ordinal15;
        ColorSpace.Named named16;
        int ordinal16;
        ColorSpace.Rgb.TransferParameters transferParameters;
        float[] whitePoint;
        b1.y yVar;
        float[] whitePoint2;
        float[] whitePoint3;
        b1.x xVar;
        String name;
        float[] primaries;
        float[] transform;
        float minValue;
        float maxValue;
        int id3;
        double d10;
        double d11;
        double d12;
        double d13;
        double d14;
        double d15;
        double d16;
        float[] whitePoint4;
        float[] whitePoint5;
        float[] whitePoint6;
        qc.q.i(colorSpace, "<this>");
        id2 = colorSpace.getId();
        named = ColorSpace.Named.SRGB;
        ordinal = named.ordinal();
        if (id2 != ordinal) {
            named2 = ColorSpace.Named.ACES;
            ordinal2 = named2.ordinal();
            if (id2 != ordinal2) {
                named3 = ColorSpace.Named.ACESCG;
                ordinal3 = named3.ordinal();
                if (id2 != ordinal3) {
                    named4 = ColorSpace.Named.ADOBE_RGB;
                    ordinal4 = named4.ordinal();
                    if (id2 != ordinal4) {
                        named5 = ColorSpace.Named.BT2020;
                        ordinal5 = named5.ordinal();
                        if (id2 != ordinal5) {
                            named6 = ColorSpace.Named.BT709;
                            ordinal6 = named6.ordinal();
                            if (id2 != ordinal6) {
                                named7 = ColorSpace.Named.CIE_LAB;
                                ordinal7 = named7.ordinal();
                                if (id2 != ordinal7) {
                                    named8 = ColorSpace.Named.CIE_XYZ;
                                    ordinal8 = named8.ordinal();
                                    if (id2 != ordinal8) {
                                        named9 = ColorSpace.Named.DCI_P3;
                                        ordinal9 = named9.ordinal();
                                        if (id2 != ordinal9) {
                                            named10 = ColorSpace.Named.DISPLAY_P3;
                                            ordinal10 = named10.ordinal();
                                            if (id2 != ordinal10) {
                                                named11 = ColorSpace.Named.EXTENDED_SRGB;
                                                ordinal11 = named11.ordinal();
                                                if (id2 != ordinal11) {
                                                    named12 = ColorSpace.Named.LINEAR_EXTENDED_SRGB;
                                                    ordinal12 = named12.ordinal();
                                                    if (id2 != ordinal12) {
                                                        named13 = ColorSpace.Named.LINEAR_SRGB;
                                                        ordinal13 = named13.ordinal();
                                                        if (id2 != ordinal13) {
                                                            named14 = ColorSpace.Named.NTSC_1953;
                                                            ordinal14 = named14.ordinal();
                                                            if (id2 != ordinal14) {
                                                                named15 = ColorSpace.Named.PRO_PHOTO_RGB;
                                                                ordinal15 = named15.ordinal();
                                                                if (id2 != ordinal15) {
                                                                    named16 = ColorSpace.Named.SMPTE_C;
                                                                    ordinal16 = named16.ordinal();
                                                                    if (id2 == ordinal16) {
                                                                        return b1.g.f7641a.v();
                                                                    }
                                                                    if (k2.a(colorSpace)) {
                                                                        transferParameters = l2.a(colorSpace).getTransferParameters();
                                                                        whitePoint = l2.a(colorSpace).getWhitePoint();
                                                                        if (whitePoint.length == 3) {
                                                                            whitePoint4 = l2.a(colorSpace).getWhitePoint();
                                                                            float f10 = whitePoint4[0];
                                                                            whitePoint5 = l2.a(colorSpace).getWhitePoint();
                                                                            float f11 = whitePoint5[1];
                                                                            whitePoint6 = l2.a(colorSpace).getWhitePoint();
                                                                            yVar = new b1.y(f10, f11, whitePoint6[2]);
                                                                        } else {
                                                                            whitePoint2 = l2.a(colorSpace).getWhitePoint();
                                                                            float f12 = whitePoint2[0];
                                                                            whitePoint3 = l2.a(colorSpace).getWhitePoint();
                                                                            yVar = new b1.y(f12, whitePoint3[1]);
                                                                        }
                                                                        b1.y yVar2 = yVar;
                                                                        if (transferParameters != null) {
                                                                            d10 = transferParameters.g;
                                                                            d11 = transferParameters.a;
                                                                            d12 = transferParameters.b;
                                                                            d13 = transferParameters.c;
                                                                            d14 = transferParameters.d;
                                                                            d15 = transferParameters.e;
                                                                            d16 = transferParameters.f;
                                                                            xVar = new b1.x(d10, d11, d12, d13, d14, d15, d16);
                                                                        } else {
                                                                            xVar = null;
                                                                        }
                                                                        name = l2.a(colorSpace).getName();
                                                                        qc.q.h(name, "this.name");
                                                                        primaries = l2.a(colorSpace).getPrimaries();
                                                                        qc.q.h(primaries, "this.primaries");
                                                                        transform = l2.a(colorSpace).getTransform();
                                                                        b1.i iVar = new b1.i() { // from class: a1.n3
                                                                            @Override // b1.i
                                                                            public final double a(double d17) {
                                                                                double i10;
                                                                                i10 = p3.i(colorSpace, d17);
                                                                                return i10;
                                                                            }
                                                                        };
                                                                        b1.i iVar2 = new b1.i() { // from class: a1.o3
                                                                            @Override // b1.i
                                                                            public final double a(double d17) {
                                                                                double j10;
                                                                                j10 = p3.j(colorSpace, d17);
                                                                                return j10;
                                                                            }
                                                                        };
                                                                        minValue = colorSpace.getMinValue(0);
                                                                        maxValue = colorSpace.getMaxValue(0);
                                                                        id3 = l2.a(colorSpace).getId();
                                                                        return new b1.w(name, primaries, yVar2, transform, iVar, iVar2, minValue, maxValue, xVar, id3);
                                                                    }
                                                                    return b1.g.f7641a.w();
                                                                }
                                                                return b1.g.f7641a.u();
                                                            }
                                                            return b1.g.f7641a.r();
                                                        }
                                                        return b1.g.f7641a.q();
                                                    }
                                                    return b1.g.f7641a.p();
                                                }
                                                return b1.g.f7641a.o();
                                            }
                                            return b1.g.f7641a.n();
                                        }
                                        return b1.g.f7641a.m();
                                    }
                                    return b1.g.f7641a.k();
                                }
                                return b1.g.f7641a.j();
                            }
                            return b1.g.f7641a.i();
                        }
                        return b1.g.f7641a.h();
                    }
                    return b1.g.f7641a.g();
                }
                return b1.g.f7641a.f();
            }
            return b1.g.f7641a.e();
        }
        return b1.g.f7641a.w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double i(ColorSpace colorSpace, double d10) {
        DoubleUnaryOperator oetf;
        qc.q.i(colorSpace, "$this_composeColorSpace");
        oetf = l2.a(colorSpace).getOetf();
        return oetf.applyAsDouble(d10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double j(ColorSpace colorSpace, double d10) {
        DoubleUnaryOperator eotf;
        qc.q.i(colorSpace, "$this_composeColorSpace");
        eotf = l2.a(colorSpace).getEotf();
        return eotf.applyAsDouble(d10);
    }
}
