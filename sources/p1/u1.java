package p1;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MyersDiff.kt */
/* loaded from: classes.dex */
public final class u1 {
    public static final void a(int[] iArr, y yVar) {
        qc.q.i(yVar, "diagonals");
        if (f(iArr)) {
            if (g(iArr)) {
                yVar.g(h(iArr), i(iArr), c(iArr));
                return;
            } else if (j(iArr)) {
                yVar.g(h(iArr), i(iArr) + 1, c(iArr));
                return;
            } else {
                yVar.g(h(iArr) + 1, i(iArr), c(iArr));
                return;
            }
        }
        yVar.g(h(iArr), i(iArr), d(iArr) - h(iArr));
    }

    public static int[] b(int[] iArr) {
        qc.q.i(iArr, "data");
        return iArr;
    }

    public static final int c(int[] iArr) {
        return Math.min(d(iArr) - h(iArr), e(iArr) - i(iArr));
    }

    public static final int d(int[] iArr) {
        return iArr[2];
    }

    public static final int e(int[] iArr) {
        return iArr[3];
    }

    private static final boolean f(int[] iArr) {
        if (e(iArr) - i(iArr) != d(iArr) - h(iArr)) {
            return true;
        }
        return false;
    }

    public static final boolean g(int[] iArr) {
        if (iArr[4] != 0) {
            return true;
        }
        return false;
    }

    public static final int h(int[] iArr) {
        return iArr[0];
    }

    public static final int i(int[] iArr) {
        return iArr[1];
    }

    private static final boolean j(int[] iArr) {
        if (e(iArr) - i(iArr) > d(iArr) - h(iArr)) {
            return true;
        }
        return false;
    }
}
