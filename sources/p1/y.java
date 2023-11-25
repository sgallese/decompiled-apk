package p1;

import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MyersDiff.kt */
/* loaded from: classes.dex */
public final class y {

    /* renamed from: a  reason: collision with root package name */
    private int[] f20988a;

    /* renamed from: b  reason: collision with root package name */
    private int f20989b;

    public y(int i10) {
        this.f20988a = new int[i10];
    }

    private final boolean a(int i10, int i11) {
        int[] iArr = this.f20988a;
        int i12 = iArr[i10];
        int i13 = iArr[i11];
        if (i12 < i13) {
            return true;
        }
        if (i12 == i13 && iArr[i10 + 1] <= iArr[i11 + 1]) {
            return true;
        }
        return false;
    }

    private final int e(int i10, int i11, int i12) {
        int i13 = i10 - i12;
        while (i10 < i11) {
            if (a(i10, i11)) {
                i13 += i12;
                k(i13, i10);
            }
            i10 += i12;
        }
        int i14 = i13 + i12;
        k(i14, i11);
        return i14;
    }

    private final void i(int i10, int i11, int i12) {
        if (i10 < i11) {
            int e10 = e(i10, i11, i12);
            i(i10, e10 - i12, i12);
            i(e10 + i12, i11, i12);
        }
    }

    private final void k(int i10, int i11) {
        int[] iArr = this.f20988a;
        w0.i(iArr, i10, i11);
        w0.i(iArr, i10 + 1, i11 + 1);
        w0.i(iArr, i10 + 2, i11 + 2);
    }

    public final int b(int i10) {
        return this.f20988a[i10];
    }

    public final int c() {
        return this.f20989b;
    }

    public final boolean d() {
        if (this.f20989b != 0) {
            return true;
        }
        return false;
    }

    public final int f() {
        int[] iArr = this.f20988a;
        int i10 = this.f20989b - 1;
        this.f20989b = i10;
        return iArr[i10];
    }

    public final void g(int i10, int i11, int i12) {
        int i13 = this.f20989b;
        int i14 = i13 + 3;
        int[] iArr = this.f20988a;
        if (i14 >= iArr.length) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length * 2);
            qc.q.h(copyOf, "copyOf(this, newSize)");
            this.f20988a = copyOf;
        }
        int[] iArr2 = this.f20988a;
        iArr2[i13 + 0] = i10 + i12;
        iArr2[i13 + 1] = i11 + i12;
        iArr2[i13 + 2] = i12;
        this.f20989b = i14;
    }

    public final void h(int i10, int i11, int i12, int i13) {
        int i14 = this.f20989b;
        int i15 = i14 + 4;
        int[] iArr = this.f20988a;
        if (i15 >= iArr.length) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length * 2);
            qc.q.h(copyOf, "copyOf(this, newSize)");
            this.f20988a = copyOf;
        }
        int[] iArr2 = this.f20988a;
        iArr2[i14 + 0] = i10;
        iArr2[i14 + 1] = i11;
        iArr2[i14 + 2] = i12;
        iArr2[i14 + 3] = i13;
        this.f20989b = i15;
    }

    public final void j() {
        boolean z10;
        int i10 = this.f20989b;
        if (i10 % 3 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (i10 > 3) {
                i(0, i10 - 3, 3);
                return;
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }
}
