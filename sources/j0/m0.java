package j0;

import java.util.Arrays;

/* compiled from: Stack.kt */
/* loaded from: classes.dex */
public final class m0 {

    /* renamed from: a  reason: collision with root package name */
    private int[] f18801a = new int[10];

    /* renamed from: b  reason: collision with root package name */
    private int f18802b;

    public final void a() {
        this.f18802b = 0;
    }

    public final int b() {
        return this.f18802b;
    }

    public final int c(int i10) {
        int i11 = this.f18802b;
        for (int i12 = 0; i12 < i11; i12++) {
            if (this.f18801a[i12] == i10) {
                return i12;
            }
        }
        return -1;
    }

    public final boolean d() {
        if (this.f18802b == 0) {
            return true;
        }
        return false;
    }

    public final int e() {
        return this.f18801a[this.f18802b - 1];
    }

    public final int f(int i10) {
        return this.f18801a[i10];
    }

    public final int g(int i10) {
        if (this.f18802b > 0) {
            return e();
        }
        return i10;
    }

    public final int h() {
        int[] iArr = this.f18801a;
        int i10 = this.f18802b - 1;
        this.f18802b = i10;
        return iArr[i10];
    }

    public final void i(int i10) {
        int i11 = this.f18802b;
        int[] iArr = this.f18801a;
        if (i11 >= iArr.length) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length * 2);
            qc.q.h(copyOf, "copyOf(this, newSize)");
            this.f18801a = copyOf;
        }
        int[] iArr2 = this.f18801a;
        int i12 = this.f18802b;
        this.f18802b = i12 + 1;
        iArr2[i12] = i10;
    }
}
