package com.google.protobuf;

import com.google.protobuf.s1;
import java.io.IOException;
import java.util.Arrays;

/* compiled from: UnknownFieldSetLite.java */
/* loaded from: classes3.dex */
public final class m1 {

    /* renamed from: f  reason: collision with root package name */
    private static final m1 f12375f = new m1(0, new int[0], new Object[0], false);

    /* renamed from: a  reason: collision with root package name */
    private int f12376a;

    /* renamed from: b  reason: collision with root package name */
    private int[] f12377b;

    /* renamed from: c  reason: collision with root package name */
    private Object[] f12378c;

    /* renamed from: d  reason: collision with root package name */
    private int f12379d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f12380e;

    private m1() {
        this(0, new int[8], new Object[8], true);
    }

    private void b() {
        int i10;
        int i11 = this.f12376a;
        int[] iArr = this.f12377b;
        if (i11 == iArr.length) {
            if (i11 < 4) {
                i10 = 8;
            } else {
                i10 = i11 >> 1;
            }
            int i12 = i11 + i10;
            this.f12377b = Arrays.copyOf(iArr, i12);
            this.f12378c = Arrays.copyOf(this.f12378c, i12);
        }
    }

    public static m1 c() {
        return f12375f;
    }

    private static int f(int[] iArr, int i10) {
        int i11 = 17;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 = (i11 * 31) + iArr[i12];
        }
        return i11;
    }

    private static int g(Object[] objArr, int i10) {
        int i11 = 17;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 = (i11 * 31) + objArr[i12].hashCode();
        }
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static m1 i(m1 m1Var, m1 m1Var2) {
        int i10 = m1Var.f12376a + m1Var2.f12376a;
        int[] copyOf = Arrays.copyOf(m1Var.f12377b, i10);
        System.arraycopy(m1Var2.f12377b, 0, copyOf, m1Var.f12376a, m1Var2.f12376a);
        Object[] copyOf2 = Arrays.copyOf(m1Var.f12378c, i10);
        System.arraycopy(m1Var2.f12378c, 0, copyOf2, m1Var.f12376a, m1Var2.f12376a);
        return new m1(i10, copyOf, copyOf2, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static m1 j() {
        return new m1();
    }

    private static boolean k(Object[] objArr, Object[] objArr2, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (!objArr[i11].equals(objArr2[i11])) {
                return false;
            }
        }
        return true;
    }

    private static boolean n(int[] iArr, int[] iArr2, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (iArr[i11] != iArr2[i11]) {
                return false;
            }
        }
        return true;
    }

    private static void p(int i10, Object obj, s1 s1Var) throws IOException {
        int a10 = r1.a(i10);
        int b10 = r1.b(i10);
        if (b10 != 0) {
            if (b10 != 1) {
                if (b10 != 2) {
                    if (b10 != 3) {
                        if (b10 == 5) {
                            s1Var.f(a10, ((Integer) obj).intValue());
                            return;
                        }
                        throw new RuntimeException(InvalidProtocolBufferException.e());
                    } else if (s1Var.l() == s1.a.ASCENDING) {
                        s1Var.u(a10);
                        ((m1) obj).q(s1Var);
                        s1Var.H(a10);
                        return;
                    } else {
                        s1Var.H(a10);
                        ((m1) obj).q(s1Var);
                        s1Var.u(a10);
                        return;
                    }
                }
                s1Var.v(a10, (h) obj);
                return;
            }
            s1Var.k(a10, ((Long) obj).longValue());
            return;
        }
        s1Var.q(a10, ((Long) obj).longValue());
    }

    void a() {
        if (this.f12380e) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    public int d() {
        int X;
        int i10 = this.f12379d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f12376a; i12++) {
            int i13 = this.f12377b[i12];
            int a10 = r1.a(i13);
            int b10 = r1.b(i13);
            if (b10 != 0) {
                if (b10 != 1) {
                    if (b10 != 2) {
                        if (b10 != 3) {
                            if (b10 == 5) {
                                X = CodedOutputStream.m(a10, ((Integer) this.f12378c[i12]).intValue());
                            } else {
                                throw new IllegalStateException(InvalidProtocolBufferException.e());
                            }
                        } else {
                            X = (CodedOutputStream.U(a10) * 2) + ((m1) this.f12378c[i12]).d();
                        }
                    } else {
                        X = CodedOutputStream.g(a10, (h) this.f12378c[i12]);
                    }
                } else {
                    X = CodedOutputStream.o(a10, ((Long) this.f12378c[i12]).longValue());
                }
            } else {
                X = CodedOutputStream.X(a10, ((Long) this.f12378c[i12]).longValue());
            }
            i11 += X;
        }
        this.f12379d = i11;
        return i11;
    }

    public int e() {
        int i10 = this.f12379d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f12376a; i12++) {
            i11 += CodedOutputStream.I(r1.a(this.f12377b[i12]), (h) this.f12378c[i12]);
        }
        this.f12379d = i11;
        return i11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof m1)) {
            return false;
        }
        m1 m1Var = (m1) obj;
        int i10 = this.f12376a;
        if (i10 == m1Var.f12376a && n(this.f12377b, m1Var.f12377b, i10) && k(this.f12378c, m1Var.f12378c, this.f12376a)) {
            return true;
        }
        return false;
    }

    public void h() {
        this.f12380e = false;
    }

    public int hashCode() {
        int i10 = this.f12376a;
        return ((((527 + i10) * 31) + f(this.f12377b, i10)) * 31) + g(this.f12378c, this.f12376a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void l(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < this.f12376a; i11++) {
            s0.c(sb2, i10, String.valueOf(r1.a(this.f12377b[i11])), this.f12378c[i11]);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void m(int i10, Object obj) {
        a();
        b();
        int[] iArr = this.f12377b;
        int i11 = this.f12376a;
        iArr[i11] = i10;
        this.f12378c[i11] = obj;
        this.f12376a = i11 + 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void o(s1 s1Var) throws IOException {
        if (s1Var.l() == s1.a.DESCENDING) {
            for (int i10 = this.f12376a - 1; i10 >= 0; i10--) {
                s1Var.e(r1.a(this.f12377b[i10]), this.f12378c[i10]);
            }
            return;
        }
        for (int i11 = 0; i11 < this.f12376a; i11++) {
            s1Var.e(r1.a(this.f12377b[i11]), this.f12378c[i11]);
        }
    }

    public void q(s1 s1Var) throws IOException {
        if (this.f12376a == 0) {
            return;
        }
        if (s1Var.l() == s1.a.ASCENDING) {
            for (int i10 = 0; i10 < this.f12376a; i10++) {
                p(this.f12377b[i10], this.f12378c[i10], s1Var);
            }
            return;
        }
        for (int i11 = this.f12376a - 1; i11 >= 0; i11--) {
            p(this.f12377b[i11], this.f12378c[i11], s1Var);
        }
    }

    private m1(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.f12379d = -1;
        this.f12376a = i10;
        this.f12377b = iArr;
        this.f12378c = objArr;
        this.f12380e = z10;
    }
}
