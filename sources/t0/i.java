package t0;

/* compiled from: SnapshotDoubleIndexHeap.kt */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    private int f23316a;

    /* renamed from: b  reason: collision with root package name */
    private int[] f23317b = new int[16];

    /* renamed from: c  reason: collision with root package name */
    private int[] f23318c = new int[16];

    /* renamed from: d  reason: collision with root package name */
    private int[] f23319d;

    /* renamed from: e  reason: collision with root package name */
    private int f23320e;

    public i() {
        int[] iArr = new int[16];
        int i10 = 0;
        while (i10 < 16) {
            int i11 = i10 + 1;
            iArr[i10] = i11;
            i10 = i11;
        }
        this.f23319d = iArr;
    }

    private final int b() {
        int length = this.f23319d.length;
        if (this.f23320e >= length) {
            int i10 = length * 2;
            int[] iArr = new int[i10];
            int i11 = 0;
            while (i11 < i10) {
                int i12 = i11 + 1;
                iArr[i11] = i12;
                i11 = i12;
            }
            ec.o.l(this.f23319d, iArr, 0, 0, 0, 14, null);
            this.f23319d = iArr;
        }
        int i13 = this.f23320e;
        this.f23320e = this.f23319d[i13];
        return i13;
    }

    private final void c(int i10) {
        int[] iArr = this.f23317b;
        int length = iArr.length;
        if (i10 <= length) {
            return;
        }
        int i11 = length * 2;
        int[] iArr2 = new int[i11];
        int[] iArr3 = new int[i11];
        ec.o.l(iArr, iArr2, 0, 0, 0, 14, null);
        ec.o.l(this.f23318c, iArr3, 0, 0, 0, 14, null);
        this.f23317b = iArr2;
        this.f23318c = iArr3;
    }

    private final void d(int i10) {
        this.f23319d[i10] = this.f23320e;
        this.f23320e = i10;
    }

    private final void g(int i10) {
        int i11;
        int[] iArr = this.f23317b;
        int i12 = this.f23316a >> 1;
        while (i10 < i12) {
            int i13 = (i10 + 1) << 1;
            int i14 = i13 - 1;
            if (i13 < this.f23316a && (i11 = iArr[i13]) < iArr[i14]) {
                if (i11 < iArr[i10]) {
                    i(i13, i10);
                    i10 = i13;
                } else {
                    return;
                }
            } else if (iArr[i14] < iArr[i10]) {
                i(i14, i10);
                i10 = i14;
            } else {
                return;
            }
        }
    }

    private final void h(int i10) {
        int[] iArr = this.f23317b;
        int i11 = iArr[i10];
        while (i10 > 0) {
            int i12 = ((i10 + 1) >> 1) - 1;
            if (iArr[i12] > i11) {
                i(i12, i10);
                i10 = i12;
            } else {
                return;
            }
        }
    }

    private final void i(int i10, int i11) {
        int[] iArr = this.f23317b;
        int[] iArr2 = this.f23318c;
        int[] iArr3 = this.f23319d;
        int i12 = iArr[i10];
        iArr[i10] = iArr[i11];
        iArr[i11] = i12;
        int i13 = iArr2[i10];
        iArr2[i10] = iArr2[i11];
        iArr2[i11] = i13;
        iArr3[iArr2[i10]] = i10;
        iArr3[iArr2[i11]] = i11;
    }

    public final int a(int i10) {
        c(this.f23316a + 1);
        int i11 = this.f23316a;
        this.f23316a = i11 + 1;
        int b10 = b();
        this.f23317b[i11] = i10;
        this.f23318c[i11] = b10;
        this.f23319d[b10] = i11;
        h(i11);
        return b10;
    }

    public final int e(int i10) {
        if (this.f23316a > 0) {
            return this.f23317b[0];
        }
        return i10;
    }

    public final void f(int i10) {
        int i11 = this.f23319d[i10];
        i(i11, this.f23316a - 1);
        this.f23316a--;
        h(i11);
        g(i11);
        d(i10);
    }
}
