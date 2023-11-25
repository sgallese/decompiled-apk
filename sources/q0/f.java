package q0;

import qc.q;

/* compiled from: ThreadMap.kt */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    private final int f21335a;

    /* renamed from: b  reason: collision with root package name */
    private final long[] f21336b;

    /* renamed from: c  reason: collision with root package name */
    private final Object[] f21337c;

    public f(int i10, long[] jArr, Object[] objArr) {
        q.i(jArr, "keys");
        q.i(objArr, "values");
        this.f21335a = i10;
        this.f21336b = jArr;
        this.f21337c = objArr;
    }

    private final int a(long j10) {
        int i10 = this.f21335a - 1;
        if (i10 == -1) {
            return -1;
        }
        int i11 = 0;
        if (i10 != 0) {
            while (i11 <= i10) {
                int i12 = (i11 + i10) >>> 1;
                long j11 = this.f21336b[i12] - j10;
                if (j11 < 0) {
                    i11 = i12 + 1;
                } else if (j11 > 0) {
                    i10 = i12 - 1;
                } else {
                    return i12;
                }
            }
            return -(i11 + 1);
        }
        long j12 = this.f21336b[0];
        if (j12 == j10) {
            return 0;
        }
        if (j12 <= j10) {
            return -1;
        }
        return -2;
    }

    public final Object b(long j10) {
        int a10 = a(j10);
        if (a10 >= 0) {
            return this.f21337c[a10];
        }
        return null;
    }

    public final f c(long j10, Object obj) {
        int i10 = this.f21335a;
        Object[] objArr = this.f21337c;
        int length = objArr.length;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            boolean z10 = true;
            if (i12 >= length) {
                break;
            }
            if (objArr[i12] == null) {
                z10 = false;
            }
            if (z10) {
                i13++;
            }
            i12++;
        }
        int i14 = i13 + 1;
        long[] jArr = new long[i14];
        Object[] objArr2 = new Object[i14];
        if (i14 > 1) {
            int i15 = 0;
            while (true) {
                if (i11 >= i14 || i15 >= i10) {
                    break;
                }
                long j11 = this.f21336b[i15];
                Object obj2 = this.f21337c[i15];
                if (j11 > j10) {
                    jArr[i11] = j10;
                    objArr2[i11] = obj;
                    i11++;
                    break;
                }
                if (obj2 != null) {
                    jArr[i11] = j11;
                    objArr2[i11] = obj2;
                    i11++;
                }
                i15++;
            }
            if (i15 == i10) {
                int i16 = i14 - 1;
                jArr[i16] = j10;
                objArr2[i16] = obj;
            } else {
                while (i11 < i14) {
                    long j12 = this.f21336b[i15];
                    Object obj3 = this.f21337c[i15];
                    if (obj3 != null) {
                        jArr[i11] = j12;
                        objArr2[i11] = obj3;
                        i11++;
                    }
                    i15++;
                }
            }
        } else {
            jArr[0] = j10;
            objArr2[0] = obj;
        }
        return new f(i14, jArr, objArr2);
    }

    public final boolean d(long j10, Object obj) {
        int a10 = a(j10);
        if (a10 < 0) {
            return false;
        }
        this.f21337c[a10] = obj;
        return true;
    }
}
