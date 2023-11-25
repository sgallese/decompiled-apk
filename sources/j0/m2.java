package j0;

import java.util.ArrayList;

/* compiled from: SlotTable.kt */
/* loaded from: classes.dex */
public final class m2 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final int A(int[] iArr, int i10) {
        int i11 = i10 * 5;
        if (i11 >= iArr.length) {
            return iArr.length;
        }
        return D(iArr[i11 + 1] >> 29) + iArr[i11 + 4];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean B(int[] iArr, int i10) {
        if ((iArr[(i10 * 5) + 1] & 201326592) != 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean C(int[] iArr, int i10) {
        if ((iArr[(i10 * 5) + 1] & 67108864) != 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int D(int i10) {
        switch (i10) {
            case 0:
                return 0;
            case 1:
            case 2:
            case 4:
                return 1;
            case 3:
            case 5:
            case 6:
                return 2;
            default:
                return 3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int E(int[] iArr, int i10) {
        return iArr[(i10 * 5) + 4];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int F(int[] iArr, int i10) {
        return iArr[(i10 * 5) + 1];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int G(int[] iArr, int i10) {
        return iArr[(i10 * 5) + 3];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean H(int[] iArr, int i10) {
        if ((iArr[(i10 * 5) + 1] & 268435456) != 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean I(int[] iArr, int i10) {
        if ((iArr[(i10 * 5) + 1] & 134217728) != 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean J(int[] iArr, int i10) {
        if ((iArr[(i10 * 5) + 1] & 536870912) != 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K(int[] iArr, int i10, int i11, boolean z10, boolean z11, boolean z12, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        if (z10) {
            i14 = 1073741824;
        } else {
            i14 = 0;
        }
        if (z11) {
            i15 = 536870912;
        } else {
            i15 = 0;
        }
        if (z12) {
            i16 = 268435456;
        } else {
            i16 = 0;
        }
        int i17 = i10 * 5;
        iArr[i17 + 0] = i11;
        iArr[i17 + 1] = i14 | i15 | i16;
        iArr[i17 + 2] = i12;
        iArr[i17 + 3] = 0;
        iArr[i17 + 4] = i13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean L(int[] iArr, int i10) {
        if ((iArr[(i10 * 5) + 1] & 1073741824) != 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int M(int[] iArr, int i10) {
        return iArr[i10 * 5];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int N(ArrayList<d> arrayList, int i10, int i11) {
        int S = S(arrayList, i10, i11);
        if (S < 0) {
            return -(S + 1);
        }
        return S;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int O(int[] iArr, int i10) {
        return iArr[(i10 * 5) + 1] & 67108863;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int P(int[] iArr, int i10) {
        return iArr[(i10 * 5) + 4];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int Q(int[] iArr, int i10) {
        int i11 = i10 * 5;
        return iArr[i11 + 4] + D(iArr[i11 + 1] >> 30);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int R(int[] iArr, int i10) {
        return iArr[(i10 * 5) + 2];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int S(ArrayList<d> arrayList, int i10, int i11) {
        int size = arrayList.size() - 1;
        int i12 = 0;
        while (i12 <= size) {
            int i13 = (i12 + size) >>> 1;
            int a10 = arrayList.get(i13).a();
            if (a10 < 0) {
                a10 += i11;
            }
            int k10 = qc.q.k(a10, i10);
            if (k10 < 0) {
                i12 = i13 + 1;
            } else if (k10 > 0) {
                size = i13 - 1;
            } else {
                return i13;
            }
        }
        return -(i12 + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int T(int[] iArr, int i10) {
        int i11 = i10 * 5;
        return iArr[i11 + 4] + D(iArr[i11 + 1] >> 28);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void U(int[] iArr, int i10, boolean z10) {
        int i11 = (i10 * 5) + 1;
        if (z10) {
            iArr[i11] = iArr[i11] | 67108864;
        } else {
            iArr[i11] = iArr[i11] & (-67108865);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void V(int[] iArr, int i10, int i11) {
        iArr[(i10 * 5) + 4] = i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void W(int[] iArr, int i10, int i11) {
        boolean z10;
        if (i11 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        n.T(z10);
        iArr[(i10 * 5) + 3] = i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void X(int[] iArr, int i10, boolean z10) {
        int i11 = (i10 * 5) + 1;
        if (z10) {
            iArr[i11] = iArr[i11] | 134217728;
        } else {
            iArr[i11] = iArr[i11] & (-134217729);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Y(int[] iArr, int i10, int i11) {
        boolean z10;
        if (i11 >= 0 && i11 < 67108863) {
            z10 = true;
        } else {
            z10 = false;
        }
        n.T(z10);
        int i12 = (i10 * 5) + 1;
        iArr[i12] = i11 | (iArr[i12] & (-67108864));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Z(int[] iArr, int i10, int i11) {
        iArr[(i10 * 5) + 2] = i11;
    }

    public static final /* synthetic */ int a(int[] iArr, int i10) {
        return A(iArr, i10);
    }

    public static final /* synthetic */ boolean b(int[] iArr, int i10) {
        return B(iArr, i10);
    }

    public static final /* synthetic */ boolean c(int[] iArr, int i10) {
        return C(iArr, i10);
    }

    public static final /* synthetic */ int d(int i10) {
        return D(i10);
    }

    public static final /* synthetic */ int e(int[] iArr, int i10) {
        return E(iArr, i10);
    }

    public static final /* synthetic */ int f(int[] iArr, int i10) {
        return F(iArr, i10);
    }

    public static final /* synthetic */ int g(int[] iArr, int i10) {
        return G(iArr, i10);
    }

    public static final /* synthetic */ boolean h(int[] iArr, int i10) {
        return H(iArr, i10);
    }

    public static final /* synthetic */ boolean i(int[] iArr, int i10) {
        return I(iArr, i10);
    }

    public static final /* synthetic */ boolean j(int[] iArr, int i10) {
        return J(iArr, i10);
    }

    public static final /* synthetic */ void k(int[] iArr, int i10, int i11, boolean z10, boolean z11, boolean z12, int i12, int i13) {
        K(iArr, i10, i11, z10, z11, z12, i12, i13);
    }

    public static final /* synthetic */ boolean l(int[] iArr, int i10) {
        return L(iArr, i10);
    }

    public static final /* synthetic */ int m(int[] iArr, int i10) {
        return M(iArr, i10);
    }

    public static final /* synthetic */ int n(ArrayList arrayList, int i10, int i11) {
        return N(arrayList, i10, i11);
    }

    public static final /* synthetic */ int o(int[] iArr, int i10) {
        return O(iArr, i10);
    }

    public static final /* synthetic */ int p(int[] iArr, int i10) {
        return P(iArr, i10);
    }

    public static final /* synthetic */ int q(int[] iArr, int i10) {
        return Q(iArr, i10);
    }

    public static final /* synthetic */ int r(int[] iArr, int i10) {
        return R(iArr, i10);
    }

    public static final /* synthetic */ int s(ArrayList arrayList, int i10, int i11) {
        return S(arrayList, i10, i11);
    }

    public static final /* synthetic */ int t(int[] iArr, int i10) {
        return T(iArr, i10);
    }

    public static final /* synthetic */ void u(int[] iArr, int i10, boolean z10) {
        U(iArr, i10, z10);
    }

    public static final /* synthetic */ void v(int[] iArr, int i10, int i11) {
        V(iArr, i10, i11);
    }

    public static final /* synthetic */ void w(int[] iArr, int i10, int i11) {
        W(iArr, i10, i11);
    }

    public static final /* synthetic */ void x(int[] iArr, int i10, boolean z10) {
        X(iArr, i10, z10);
    }

    public static final /* synthetic */ void y(int[] iArr, int i10, int i11) {
        Y(iArr, i10, i11);
    }

    public static final /* synthetic */ void z(int[] iArr, int i10, int i11) {
        Z(iArr, i10, i11);
    }
}
