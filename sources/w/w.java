package w;

import ec.h0;
import java.util.Iterator;
import java.util.List;
import n1.g0;
import n1.l0;
import n1.y0;

/* compiled from: RowColumnMeasurementHelper.kt */
/* loaded from: classes.dex */
public final class w {

    /* renamed from: a  reason: collision with root package name */
    private final p f25237a;

    /* renamed from: b  reason: collision with root package name */
    private final pc.s<Integer, int[], j2.r, j2.e, int[], dc.w> f25238b;

    /* renamed from: c  reason: collision with root package name */
    private final float f25239c;

    /* renamed from: d  reason: collision with root package name */
    private final c0 f25240d;

    /* renamed from: e  reason: collision with root package name */
    private final l f25241e;

    /* renamed from: f  reason: collision with root package name */
    private final List<g0> f25242f;

    /* renamed from: g  reason: collision with root package name */
    private final y0[] f25243g;

    /* renamed from: h  reason: collision with root package name */
    private final x[] f25244h;

    public /* synthetic */ w(p pVar, pc.s sVar, float f10, c0 c0Var, l lVar, List list, y0[] y0VarArr, qc.h hVar) {
        this(pVar, sVar, f10, c0Var, lVar, list, y0VarArr);
    }

    private final int b(y0 y0Var, x xVar, int i10, j2.r rVar, int i11) {
        l lVar;
        if (xVar == null || (lVar = xVar.a()) == null) {
            lVar = this.f25241e;
        }
        int a10 = i10 - a(y0Var);
        if (this.f25237a == p.Horizontal) {
            rVar = j2.r.Ltr;
        }
        return lVar.a(a10, rVar, y0Var, i11);
    }

    private final int[] c(int i10, int[] iArr, int[] iArr2, l0 l0Var) {
        this.f25238b.D0(Integer.valueOf(i10), iArr, l0Var.getLayoutDirection(), l0Var, iArr2);
        return iArr2;
    }

    public final int a(y0 y0Var) {
        qc.q.i(y0Var, "<this>");
        if (this.f25237a == p.Horizontal) {
            return y0Var.l0();
        }
        return y0Var.A0();
    }

    public final int d(y0 y0Var) {
        qc.q.i(y0Var, "<this>");
        if (this.f25237a == p.Horizontal) {
            return y0Var.A0();
        }
        return y0Var.l0();
    }

    public final v e(l0 l0Var, long j10, int i10, int i11) {
        int p10;
        long e10;
        float f10;
        vc.f s10;
        int i12;
        int i13;
        long n10;
        int i14;
        int i15;
        float f11;
        boolean z10;
        int b10;
        int d10;
        int i16;
        boolean z11;
        int d11;
        int i17;
        int i18;
        long e11;
        int max;
        Integer num;
        int i19;
        int i20;
        int i21;
        long j11;
        long e12;
        long e13;
        int i22;
        int i23 = i11;
        qc.q.i(l0Var, "measureScope");
        long c10 = r.c(j10, this.f25237a);
        long K0 = l0Var.K0(this.f25239c);
        int i24 = i23 - i10;
        long j12 = 0;
        int i25 = i10;
        long j13 = 0;
        int i26 = 0;
        int i27 = 0;
        int i28 = 0;
        float f12 = 0.0f;
        boolean z12 = false;
        while (true) {
            boolean z13 = true;
            if (i25 >= i23) {
                break;
            }
            g0 g0Var = this.f25242f.get(i25);
            x xVar = this.f25244h[i25];
            float m10 = u.m(xVar);
            if (m10 > 0.0f) {
                f12 += m10;
                i28++;
                i20 = i25;
                j11 = j12;
            } else {
                int n11 = j2.b.n(c10);
                y0 y0Var = this.f25243g[i25];
                if (y0Var == null) {
                    if (n11 != Integer.MAX_VALUE) {
                        e13 = vc.l.e(n11 - j13, j12);
                        i22 = (int) e13;
                    } else {
                        i22 = Integer.MAX_VALUE;
                    }
                    i19 = i27;
                    i20 = i25;
                    i21 = n11;
                    y0Var = g0Var.w(r.f(r.e(c10, 0, i22, 0, 0, 8, null), this.f25237a));
                } else {
                    i19 = i27;
                    i20 = i25;
                    i21 = n11;
                }
                j11 = 0;
                e12 = vc.l.e((i21 - j13) - d(y0Var), 0L);
                int min = Math.min((int) K0, (int) e12);
                j13 += d(y0Var) + min;
                int max2 = Math.max(i19, a(y0Var));
                if (!z12 && !u.q(xVar)) {
                    z13 = false;
                }
                this.f25243g[i20] = y0Var;
                i26 = min;
                i27 = max2;
                z12 = z13;
            }
            j12 = j11;
            i25 = i20 + 1;
        }
        long j14 = j12;
        if (i28 == 0) {
            j13 -= i26;
            i12 = i24;
            i13 = 0;
            i14 = 0;
        } else {
            if (f12 > 0.0f && j2.b.n(c10) != Integer.MAX_VALUE) {
                p10 = j2.b.n(c10);
            } else {
                p10 = j2.b.p(c10);
            }
            long j15 = K0 * ((long) (i28 - 1));
            e10 = vc.l.e((p10 - j13) - j15, j14);
            if (f12 > 0.0f) {
                f10 = ((float) e10) / f12;
            } else {
                f10 = 0.0f;
            }
            s10 = vc.l.s(i10, i11);
            Iterator<Integer> it = s10.iterator();
            int i29 = 0;
            while (it.hasNext()) {
                d11 = sc.c.d(u.m(this.f25244h[((h0) it).a()]) * f10);
                i29 += d11;
            }
            long j16 = e10 - i29;
            int i30 = i10;
            int i31 = 0;
            while (i30 < i23) {
                if (this.f25243g[i30] == null) {
                    g0 g0Var2 = this.f25242f.get(i30);
                    x xVar2 = this.f25244h[i30];
                    float m11 = u.m(xVar2);
                    if (m11 > 0.0f) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        b10 = sc.c.b(j16);
                        i15 = i24;
                        j16 -= b10;
                        d10 = sc.c.d(m11 * f10);
                        int max3 = Math.max(0, d10 + b10);
                        if (u.k(xVar2) && max3 != Integer.MAX_VALUE) {
                            i16 = max3;
                            f11 = f10;
                        } else {
                            f11 = f10;
                            i16 = 0;
                        }
                        y0 w10 = g0Var2.w(r.f(r.a(i16, max3, 0, j2.b.m(c10)), this.f25237a));
                        i31 += d(w10);
                        i27 = Math.max(i27, a(w10));
                        if (!z12 && !u.q(xVar2)) {
                            z11 = false;
                        } else {
                            z11 = true;
                        }
                        this.f25243g[i30] = w10;
                        z12 = z11;
                    } else {
                        throw new IllegalStateException("All weights <= 0 should have placeables".toString());
                    }
                } else {
                    i15 = i24;
                    f11 = f10;
                }
                i30++;
                i24 = i15;
                i23 = i11;
                f10 = f11;
            }
            i12 = i24;
            i13 = 0;
            n10 = vc.l.n(i31 + j15, 0L, j2.b.n(c10) - j13);
            i14 = (int) n10;
        }
        if (z12) {
            int i32 = 0;
            i17 = 0;
            for (int i33 = i10; i33 < i11; i33++) {
                y0 y0Var2 = this.f25243g[i33];
                qc.q.f(y0Var2);
                l j17 = u.j(this.f25244h[i33]);
                if (j17 != null) {
                    num = j17.b(y0Var2);
                } else {
                    num = null;
                }
                if (num != null) {
                    int intValue = num.intValue();
                    if (intValue == Integer.MIN_VALUE) {
                        intValue = 0;
                    }
                    i32 = Math.max(i32, intValue);
                    int a10 = a(y0Var2);
                    int intValue2 = num.intValue();
                    if (intValue2 == Integer.MIN_VALUE) {
                        intValue2 = a(y0Var2);
                    }
                    i17 = Math.max(i17, a10 - intValue2);
                }
            }
            i18 = i32;
        } else {
            i17 = 0;
            i18 = 0;
        }
        e11 = vc.l.e(j13 + i14, 0L);
        int max4 = Math.max((int) e11, j2.b.p(c10));
        if (j2.b.m(c10) != Integer.MAX_VALUE && this.f25240d == c0.Expand) {
            max = j2.b.m(c10);
        } else {
            max = Math.max(i27, Math.max(j2.b.o(c10), i17 + i18));
        }
        int i34 = i12;
        int[] iArr = new int[i34];
        for (int i35 = 0; i35 < i34; i35++) {
            iArr[i35] = i13;
        }
        int[] iArr2 = new int[i34];
        for (int i36 = 0; i36 < i34; i36++) {
            y0 y0Var3 = this.f25243g[i36 + i10];
            qc.q.f(y0Var3);
            iArr2[i36] = d(y0Var3);
        }
        return new v(max, max4, i10, i11, i18, c(max4, iArr2, iArr, l0Var));
    }

    public final void f(y0.a aVar, v vVar, int i10, j2.r rVar) {
        x xVar;
        qc.q.i(aVar, "placeableScope");
        qc.q.i(vVar, "measureResult");
        qc.q.i(rVar, "layoutDirection");
        int c10 = vVar.c();
        for (int f10 = vVar.f(); f10 < c10; f10++) {
            y0 y0Var = this.f25243g[f10];
            qc.q.f(y0Var);
            int[] d10 = vVar.d();
            Object A = this.f25242f.get(f10).A();
            if (A instanceof x) {
                xVar = (x) A;
            } else {
                xVar = null;
            }
            int b10 = b(y0Var, xVar, vVar.b(), rVar, vVar.a()) + i10;
            if (this.f25237a == p.Horizontal) {
                y0.a.n(aVar, y0Var, d10[f10 - vVar.f()], b10, 0.0f, 4, null);
            } else {
                y0.a.n(aVar, y0Var, b10, d10[f10 - vVar.f()], 0.0f, 4, null);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private w(p pVar, pc.s<? super Integer, ? super int[], ? super j2.r, ? super j2.e, ? super int[], dc.w> sVar, float f10, c0 c0Var, l lVar, List<? extends g0> list, y0[] y0VarArr) {
        qc.q.i(pVar, "orientation");
        qc.q.i(sVar, "arrangement");
        qc.q.i(c0Var, "crossAxisSize");
        qc.q.i(lVar, "crossAxisAlignment");
        qc.q.i(list, "measurables");
        qc.q.i(y0VarArr, "placeables");
        this.f25237a = pVar;
        this.f25238b = sVar;
        this.f25239c = f10;
        this.f25240d = c0Var;
        this.f25241e = lVar;
        this.f25242f = list;
        this.f25243g = y0VarArr;
        int size = list.size();
        x[] xVarArr = new x[size];
        for (int i10 = 0; i10 < size; i10++) {
            xVarArr[i10] = u.l(this.f25242f.get(i10));
        }
        this.f25244h = xVarArr;
    }
}
