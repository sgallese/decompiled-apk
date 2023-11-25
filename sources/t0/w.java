package t0;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import j0.m3;

/* compiled from: SnapshotWeakSet.kt */
/* loaded from: classes.dex */
public final class w<T> {

    /* renamed from: a  reason: collision with root package name */
    private int f23392a;

    /* renamed from: b  reason: collision with root package name */
    private int[] f23393b = new int[16];

    /* renamed from: c  reason: collision with root package name */
    private m3<T>[] f23394c = new m3[16];

    private final int b(T t10, int i10) {
        T t11;
        int i11 = this.f23392a - 1;
        int i12 = 0;
        while (i12 <= i11) {
            int i13 = (i12 + i11) >>> 1;
            int i14 = this.f23393b[i13];
            if (i14 < i10) {
                i12 = i13 + 1;
            } else if (i14 > i10) {
                i11 = i13 - 1;
            } else {
                m3<T> m3Var = this.f23394c[i13];
                if (m3Var != null) {
                    t11 = m3Var.get();
                } else {
                    t11 = null;
                }
                if (t10 == t11) {
                    return i13;
                }
                return c(i13, t10, i10);
            }
        }
        return -(i12 + 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x002c, code lost:
    
        return -(r4 + 1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int c(int r4, T r5, int r6) {
        /*
            r3 = this;
            int r0 = r4 + (-1)
        L2:
            r1 = 0
            r2 = -1
            if (r2 >= r0) goto L1d
            int[] r2 = r3.f23393b
            r2 = r2[r0]
            if (r2 == r6) goto Ld
            goto L1d
        Ld:
            j0.m3<T>[] r2 = r3.f23394c
            r2 = r2[r0]
            if (r2 == 0) goto L17
            java.lang.Object r1 = r2.get()
        L17:
            if (r1 != r5) goto L1a
            return r0
        L1a:
            int r0 = r0 + (-1)
            goto L2
        L1d:
            int r4 = r4 + 1
            int r0 = r3.f23392a
        L21:
            if (r4 >= r0) goto L3f
            int[] r2 = r3.f23393b
            r2 = r2[r4]
            if (r2 == r6) goto L2d
        L29:
            int r4 = r4 + 1
            int r4 = -r4
            return r4
        L2d:
            j0.m3<T>[] r2 = r3.f23394c
            r2 = r2[r4]
            if (r2 == 0) goto L38
            java.lang.Object r2 = r2.get()
            goto L39
        L38:
            r2 = r1
        L39:
            if (r2 != r5) goto L3c
            return r4
        L3c:
            int r4 = r4 + 1
            goto L21
        L3f:
            int r4 = r3.f23392a
            goto L29
        */
        throw new UnsupportedOperationException("Method not decompiled: t0.w.c(int, java.lang.Object, int):int");
    }

    public final boolean a(T t10) {
        int i10;
        qc.q.i(t10, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        int i11 = this.f23392a;
        int a10 = j0.c.a(t10);
        if (i11 > 0) {
            i10 = b(t10, a10);
            if (i10 >= 0) {
                return false;
            }
        } else {
            i10 = -1;
        }
        int i12 = -(i10 + 1);
        m3<T>[] m3VarArr = this.f23394c;
        int length = m3VarArr.length;
        if (i11 == length) {
            int i13 = length * 2;
            m3<T>[] m3VarArr2 = new m3[i13];
            int[] iArr = new int[i13];
            int i14 = i12 + 1;
            ec.o.i(m3VarArr, m3VarArr2, i14, i12, i11);
            ec.o.m(this.f23394c, m3VarArr2, 0, 0, i12, 6, null);
            ec.o.g(this.f23393b, iArr, i14, i12, i11);
            ec.o.l(this.f23393b, iArr, 0, 0, i12, 6, null);
            this.f23394c = m3VarArr2;
            this.f23393b = iArr;
        } else {
            int i15 = i12 + 1;
            ec.o.i(m3VarArr, m3VarArr, i15, i12, i11);
            int[] iArr2 = this.f23393b;
            ec.o.g(iArr2, iArr2, i15, i12, i11);
        }
        this.f23394c[i12] = new m3<>(t10);
        this.f23393b[i12] = a10;
        this.f23392a++;
        return true;
    }

    public final int[] d() {
        return this.f23393b;
    }

    public final int e() {
        return this.f23392a;
    }

    public final m3<T>[] f() {
        return this.f23394c;
    }

    public final void g(int i10) {
        this.f23392a = i10;
    }
}
