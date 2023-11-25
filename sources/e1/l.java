package e1;

import a1.e4;
import e1.i;
import java.util.List;

/* compiled from: PathParser.kt */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    private static final float[] f13873a = new float[0];

    private static final void a(e4 e4Var, double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17, double d18) {
        double d19 = d12;
        double d20 = 4;
        int ceil = (int) Math.ceil(Math.abs((d18 * d20) / 3.141592653589793d));
        double cos = Math.cos(d16);
        double sin = Math.sin(d16);
        double cos2 = Math.cos(d17);
        double sin2 = Math.sin(d17);
        double d21 = -d19;
        double d22 = d21 * cos;
        double d23 = d13 * sin;
        double d24 = (d22 * sin2) - (d23 * cos2);
        double d25 = d21 * sin;
        double d26 = d13 * cos;
        double d27 = (sin2 * d25) + (cos2 * d26);
        double d28 = d18 / ceil;
        double d29 = d14;
        double d30 = d17;
        double d31 = d27;
        double d32 = d24;
        int i10 = 0;
        double d33 = d15;
        while (i10 < ceil) {
            double d34 = d30 + d28;
            double sin3 = Math.sin(d34);
            double cos3 = Math.cos(d34);
            int i11 = ceil;
            double d35 = (d10 + ((d19 * cos) * cos3)) - (d23 * sin3);
            double d36 = d11 + (d19 * sin * cos3) + (d26 * sin3);
            double d37 = (d22 * sin3) - (d23 * cos3);
            double d38 = (sin3 * d25) + (cos3 * d26);
            double d39 = d34 - d30;
            double tan = Math.tan(d39 / 2);
            double sin4 = (Math.sin(d39) * (Math.sqrt(d20 + ((3.0d * tan) * tan)) - 1)) / 3;
            e4Var.m((float) (d29 + (d32 * sin4)), (float) (d33 + (d31 * sin4)), (float) (d35 - (sin4 * d37)), (float) (d36 - (sin4 * d38)), (float) d35, (float) d36);
            i10++;
            d28 = d28;
            sin = sin;
            d29 = d35;
            d25 = d25;
            d30 = d34;
            d31 = d38;
            d20 = d20;
            d32 = d37;
            cos = cos;
            ceil = i11;
            d33 = d36;
            d19 = d12;
        }
    }

    private static final void b(e4 e4Var, double d10, double d11, double d12, double d13, double d14, double d15, double d16, boolean z10, boolean z11) {
        boolean z12;
        double d17;
        double d18;
        boolean z13;
        double d19 = (d16 / 180) * 3.141592653589793d;
        double cos = Math.cos(d19);
        double sin = Math.sin(d19);
        double d20 = ((d10 * cos) + (d11 * sin)) / d14;
        double d21 = (((-d10) * sin) + (d11 * cos)) / d15;
        double d22 = ((d12 * cos) + (d13 * sin)) / d14;
        double d23 = (((-d12) * sin) + (d13 * cos)) / d15;
        double d24 = d20 - d22;
        double d25 = d21 - d23;
        double d26 = 2;
        double d27 = (d20 + d22) / d26;
        double d28 = (d21 + d23) / d26;
        double d29 = (d24 * d24) + (d25 * d25);
        if (d29 == 0.0d) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z12) {
            return;
        }
        double d30 = (1.0d / d29) - 0.25d;
        if (d30 < 0.0d) {
            double sqrt = (float) (Math.sqrt(d29) / 1.99999d);
            b(e4Var, d10, d11, d12, d13, d14 * sqrt, d15 * sqrt, d16, z10, z11);
            return;
        }
        double sqrt2 = Math.sqrt(d30);
        double d31 = d24 * sqrt2;
        double d32 = sqrt2 * d25;
        if (z10 == z11) {
            d17 = d27 - d32;
            d18 = d28 + d31;
        } else {
            d17 = d27 + d32;
            d18 = d28 - d31;
        }
        double atan2 = Math.atan2(d21 - d18, d20 - d17);
        double atan22 = Math.atan2(d23 - d18, d22 - d17) - atan2;
        if (atan22 >= 0.0d) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (z11 != z13) {
            if (atan22 > 0.0d) {
                atan22 -= 6.283185307179586d;
            } else {
                atan22 += 6.283185307179586d;
            }
        }
        double d33 = d17 * d14;
        double d34 = d18 * d15;
        a(e4Var, (d33 * cos) - (d34 * sin), (d33 * sin) + (d34 * cos), d14, d15, d10, d11, d19, atan2, atan22);
    }

    public static final e4 c(List<? extends i> list, e4 e4Var) {
        i iVar;
        i iVar2;
        int i10;
        int i11;
        i iVar3;
        float f10;
        float f11;
        float f12;
        float f13;
        float d10;
        float e10;
        float d11;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float c10;
        List<? extends i> list2 = list;
        e4 e4Var2 = e4Var;
        qc.q.i(list2, "<this>");
        qc.q.i(e4Var2, "target");
        int j10 = e4Var.j();
        e4Var.n();
        e4Var2.g(j10);
        if (list.isEmpty()) {
            iVar = i.b.f13818c;
        } else {
            iVar = list2.get(0);
        }
        int size = list.size();
        float f19 = 0.0f;
        float f20 = 0.0f;
        float f21 = 0.0f;
        float f22 = 0.0f;
        float f23 = 0.0f;
        float f24 = 0.0f;
        float f25 = 0.0f;
        int i12 = 0;
        while (i12 < size) {
            i iVar4 = list2.get(i12);
            if (iVar4 instanceof i.b) {
                e4Var.close();
                e4Var2.l(f24, f25);
                iVar3 = iVar4;
                f20 = f24;
                f22 = f20;
                f21 = f25;
                f23 = f21;
            } else if (iVar4 instanceof i.n) {
                i.n nVar = (i.n) iVar4;
                f22 += nVar.c();
                f23 += nVar.d();
                e4Var2.c(nVar.c(), nVar.d());
                iVar3 = iVar4;
                f24 = f22;
                f25 = f23;
            } else {
                if (iVar4 instanceof i.f) {
                    i.f fVar = (i.f) iVar4;
                    float c11 = fVar.c();
                    float d12 = fVar.d();
                    e4Var2.l(fVar.c(), fVar.d());
                    f22 = c11;
                    f24 = f22;
                    f23 = d12;
                    f25 = f23;
                } else {
                    if (iVar4 instanceof i.m) {
                        i.m mVar = (i.m) iVar4;
                        e4Var2.q(mVar.c(), mVar.d());
                        f22 += mVar.c();
                        c10 = mVar.d();
                    } else if (iVar4 instanceof i.e) {
                        i.e eVar = (i.e) iVar4;
                        e4Var2.r(eVar.c(), eVar.d());
                        float c12 = eVar.c();
                        f23 = eVar.d();
                        f22 = c12;
                    } else if (iVar4 instanceof i.l) {
                        i.l lVar = (i.l) iVar4;
                        e4Var2.q(lVar.c(), f19);
                        f22 += lVar.c();
                    } else if (iVar4 instanceof i.d) {
                        i.d dVar = (i.d) iVar4;
                        e4Var2.r(dVar.c(), f23);
                        f22 = dVar.c();
                    } else if (iVar4 instanceof i.r) {
                        i.r rVar = (i.r) iVar4;
                        e4Var2.q(f19, rVar.c());
                        c10 = rVar.c();
                    } else if (iVar4 instanceof i.s) {
                        i.s sVar = (i.s) iVar4;
                        e4Var2.r(f22, sVar.c());
                        f23 = sVar.c();
                    } else {
                        if (iVar4 instanceof i.k) {
                            i.k kVar = (i.k) iVar4;
                            iVar2 = iVar4;
                            e4Var.d(kVar.c(), kVar.f(), kVar.d(), kVar.g(), kVar.e(), kVar.h());
                            f12 = kVar.d() + f22;
                            f13 = kVar.g() + f23;
                            f22 += kVar.e();
                            d10 = kVar.h();
                        } else {
                            iVar2 = iVar4;
                            if (iVar2 instanceof i.c) {
                                i.c cVar = (i.c) iVar2;
                                e4Var.m(cVar.c(), cVar.f(), cVar.d(), cVar.g(), cVar.e(), cVar.h());
                                f12 = cVar.d();
                                e10 = cVar.g();
                                d11 = cVar.e();
                                f14 = cVar.h();
                            } else if (iVar2 instanceof i.p) {
                                if (iVar.a()) {
                                    f18 = f23 - f21;
                                    f17 = f22 - f20;
                                } else {
                                    f17 = 0.0f;
                                    f18 = 0.0f;
                                }
                                i.p pVar = (i.p) iVar2;
                                e4Var.d(f17, f18, pVar.c(), pVar.e(), pVar.d(), pVar.f());
                                f12 = pVar.c() + f22;
                                f13 = pVar.e() + f23;
                                f22 += pVar.d();
                                d10 = pVar.f();
                            } else if (iVar2 instanceof i.h) {
                                if (iVar.a()) {
                                    float f26 = 2;
                                    f16 = (f26 * f23) - f21;
                                    f15 = (f22 * f26) - f20;
                                } else {
                                    f15 = f22;
                                    f16 = f23;
                                }
                                i.h hVar = (i.h) iVar2;
                                e4Var.m(f15, f16, hVar.c(), hVar.e(), hVar.d(), hVar.f());
                                f12 = hVar.c();
                                e10 = hVar.e();
                                d11 = hVar.d();
                                f14 = hVar.f();
                            } else if (iVar2 instanceof i.o) {
                                i.o oVar = (i.o) iVar2;
                                e4Var2.f(oVar.c(), oVar.e(), oVar.d(), oVar.f());
                                f12 = oVar.c() + f22;
                                f13 = oVar.e() + f23;
                                f22 += oVar.d();
                                d10 = oVar.f();
                            } else if (iVar2 instanceof i.g) {
                                i.g gVar = (i.g) iVar2;
                                e4Var2.e(gVar.c(), gVar.e(), gVar.d(), gVar.f());
                                f12 = gVar.c();
                                e10 = gVar.e();
                                d11 = gVar.d();
                                f14 = gVar.f();
                            } else if (iVar2 instanceof i.q) {
                                if (iVar.b()) {
                                    f10 = f22 - f20;
                                    f11 = f23 - f21;
                                } else {
                                    f10 = 0.0f;
                                    f11 = 0.0f;
                                }
                                i.q qVar = (i.q) iVar2;
                                e4Var2.f(f10, f11, qVar.c(), qVar.d());
                                f12 = f10 + f22;
                                f13 = f11 + f23;
                                f22 += qVar.c();
                                d10 = qVar.d();
                            } else {
                                if (iVar2 instanceof i.C0330i) {
                                    if (iVar.b()) {
                                        float f27 = 2;
                                        f22 = (f22 * f27) - f20;
                                        f23 = (f27 * f23) - f21;
                                    }
                                    i.C0330i c0330i = (i.C0330i) iVar2;
                                    e4Var2.e(f22, f23, c0330i.c(), c0330i.d());
                                    float c13 = c0330i.c();
                                    iVar3 = iVar2;
                                    f21 = f23;
                                    i10 = i12;
                                    i11 = size;
                                    f23 = c0330i.d();
                                    f20 = f22;
                                    f22 = c13;
                                } else if (iVar2 instanceof i.j) {
                                    i.j jVar = (i.j) iVar2;
                                    float c14 = jVar.c() + f22;
                                    float d13 = jVar.d() + f23;
                                    iVar3 = iVar2;
                                    i10 = i12;
                                    i11 = size;
                                    b(e4Var, f22, f23, c14, d13, jVar.e(), jVar.g(), jVar.f(), jVar.h(), jVar.i());
                                    f20 = c14;
                                    f22 = f20;
                                    f24 = f24;
                                    f25 = f25;
                                    f21 = d13;
                                    f23 = f21;
                                } else {
                                    float f28 = f24;
                                    float f29 = f25;
                                    i10 = i12;
                                    i11 = size;
                                    if (iVar2 instanceof i.a) {
                                        i.a aVar = (i.a) iVar2;
                                        iVar3 = iVar2;
                                        b(e4Var, f22, f23, aVar.c(), aVar.d(), aVar.e(), aVar.g(), aVar.f(), aVar.h(), aVar.i());
                                        f22 = aVar.c();
                                        f21 = aVar.d();
                                        f23 = f21;
                                        f24 = f28;
                                        f25 = f29;
                                        f20 = f22;
                                    } else {
                                        iVar3 = iVar2;
                                        f24 = f28;
                                        f25 = f29;
                                    }
                                }
                                i12 = i10 + 1;
                                e4Var2 = e4Var;
                                size = i11;
                                iVar = iVar3;
                                f19 = 0.0f;
                                list2 = list;
                            }
                            iVar3 = iVar2;
                            f22 = d11;
                            f23 = f14;
                            i10 = i12;
                            i11 = size;
                            f21 = e10;
                            f20 = f12;
                            i12 = i10 + 1;
                            e4Var2 = e4Var;
                            size = i11;
                            iVar = iVar3;
                            f19 = 0.0f;
                            list2 = list;
                        }
                        f23 += d10;
                        iVar3 = iVar2;
                        f21 = f13;
                        i10 = i12;
                        i11 = size;
                        f20 = f12;
                        i12 = i10 + 1;
                        e4Var2 = e4Var;
                        size = i11;
                        iVar = iVar3;
                        f19 = 0.0f;
                        list2 = list;
                    }
                    f23 += c10;
                }
                iVar3 = iVar4;
            }
            i10 = i12;
            i11 = size;
            i12 = i10 + 1;
            e4Var2 = e4Var;
            size = i11;
            iVar = iVar3;
            f19 = 0.0f;
            list2 = list;
        }
        return e4Var;
    }
}
