package p1;

/* compiled from: MyersDiff.kt */
/* loaded from: classes.dex */
public final class w0 {
    private static final void b(y yVar, o oVar) {
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i10 < yVar.c()) {
            int i13 = i10 + 2;
            int b10 = yVar.b(i10) - yVar.b(i13);
            int b11 = yVar.b(i10 + 1) - yVar.b(i13);
            int b12 = yVar.b(i13);
            i10 += 3;
            while (i11 < b10) {
                oVar.a(i12, i11);
                i11++;
            }
            while (i12 < b11) {
                oVar.d(i12);
                i12++;
            }
            while (true) {
                int i14 = b12 - 1;
                if (b12 > 0) {
                    oVar.c(i11, i12);
                    i11++;
                    i12++;
                    b12 = i14;
                }
            }
        }
    }

    private static final boolean c(int i10, int i11, int i12, int i13, o oVar, int[] iArr, int[] iArr2, int i14, int[] iArr3) {
        boolean z10;
        int b10;
        int i15;
        int i16;
        int i17;
        int i18 = (i11 - i10) - (i13 - i12);
        if (i18 % 2 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i19 = -i14;
        for (int i20 = i19; i20 <= i14; i20 += 2) {
            if (i20 != i19 && (i20 == i14 || f.b(iArr2, i20 + 1) >= f.b(iArr2, i20 - 1))) {
                b10 = f.b(iArr2, i20 - 1);
                i15 = b10 - 1;
            } else {
                b10 = f.b(iArr2, i20 + 1);
                i15 = b10;
            }
            int i21 = i13 - ((i11 - i15) - i20);
            if (i14 != 0 && i15 == b10) {
                i16 = i21 + 1;
            } else {
                i16 = i21;
            }
            while (i15 > i10 && i21 > i12) {
                if (!oVar.b(i15 - 1, i21 - 1)) {
                    break;
                }
                i15--;
                i21--;
            }
            f.d(iArr2, i20, i15);
            if (z10 && (i17 = i18 - i20) >= i19 && i17 <= i14) {
                if (f.b(iArr, i17) >= i15) {
                    f(i15, i21, b10, i16, true, iArr3);
                    return true;
                }
            }
        }
        return false;
    }

    private static final y d(int i10, int i11, o oVar) {
        int i12 = ((i10 + i11) + 1) / 2;
        y yVar = new y(i12 * 3);
        y yVar2 = new y(i12 * 4);
        yVar2.h(0, i10, 0, i11);
        int i13 = (i12 * 2) + 1;
        int[] a10 = f.a(new int[i13]);
        int[] a11 = f.a(new int[i13]);
        int[] b10 = u1.b(new int[5]);
        while (yVar2.d()) {
            int f10 = yVar2.f();
            int f11 = yVar2.f();
            int f12 = yVar2.f();
            int f13 = yVar2.f();
            int[] iArr = a10;
            int[] iArr2 = a11;
            if (h(f13, f12, f11, f10, oVar, a10, a11, b10)) {
                if (u1.c(b10) > 0) {
                    u1.a(b10, yVar);
                }
                yVar2.h(f13, u1.h(b10), f11, u1.i(b10));
                yVar2.h(u1.d(b10), f12, u1.e(b10), f10);
            }
            a10 = iArr;
            a11 = iArr2;
        }
        yVar.j();
        yVar.g(i10, i11, 0);
        return yVar;
    }

    public static final void e(int i10, int i11, o oVar) {
        qc.q.i(oVar, "callback");
        b(d(i10, i11, oVar), oVar);
    }

    public static final void f(int i10, int i11, int i12, int i13, boolean z10, int[] iArr) {
        qc.q.i(iArr, "data");
        iArr[0] = i10;
        iArr[1] = i11;
        iArr[2] = i12;
        iArr[3] = i13;
        iArr[4] = z10 ? 1 : 0;
    }

    private static final boolean g(int i10, int i11, int i12, int i13, o oVar, int[] iArr, int[] iArr2, int i14, int[] iArr3) {
        boolean z10;
        int b10;
        int i15;
        int i16;
        int i17 = (i11 - i10) - (i13 - i12);
        if (Math.abs(i17) % 2 == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i18 = -i14;
        for (int i19 = i18; i19 <= i14; i19 += 2) {
            if (i19 != i18 && (i19 == i14 || f.b(iArr, i19 + 1) <= f.b(iArr, i19 - 1))) {
                b10 = f.b(iArr, i19 - 1);
                i15 = b10 + 1;
            } else {
                b10 = f.b(iArr, i19 + 1);
                i15 = b10;
            }
            int i20 = (i12 + (i15 - i10)) - i19;
            int i21 = (i14 != 0 && i15 == b10) ? i20 - 1 : i20;
            while (i15 < i11 && i20 < i13) {
                if (!oVar.b(i15, i20)) {
                    break;
                }
                i15++;
                i20++;
            }
            f.d(iArr, i19, i15);
            if (z10 && (i16 = i17 - i19) >= i18 + 1 && i16 <= i14 - 1) {
                if (f.b(iArr2, i16) <= i15) {
                    f(b10, i21, i15, i20, false, iArr3);
                    return true;
                }
            }
        }
        return false;
    }

    private static final boolean h(int i10, int i11, int i12, int i13, o oVar, int[] iArr, int[] iArr2, int[] iArr3) {
        int i14 = i11 - i10;
        int i15 = i13 - i12;
        if (i14 >= 1 && i15 >= 1) {
            int i16 = ((i14 + i15) + 1) / 2;
            f.d(iArr, 1, i10);
            f.d(iArr2, 1, i11);
            int i17 = 0;
            while (i17 < i16) {
                int i18 = i17;
                if (g(i10, i11, i12, i13, oVar, iArr, iArr2, i17, iArr3) || c(i10, i11, i12, i13, oVar, iArr, iArr2, i18, iArr3)) {
                    return true;
                }
                i17 = i18 + 1;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(int[] iArr, int i10, int i11) {
        int i12 = iArr[i10];
        iArr[i10] = iArr[i11];
        iArr[i11] = i12;
    }
}
