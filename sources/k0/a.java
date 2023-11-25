package k0;

import ec.o;
import qc.q;

/* compiled from: IdentityArrayIntMap.kt */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private int f19120a;

    /* renamed from: b  reason: collision with root package name */
    private Object[] f19121b = new Object[4];

    /* renamed from: c  reason: collision with root package name */
    private int[] f19122c = new int[4];

    private final int c(Object obj) {
        int i10 = this.f19120a - 1;
        int a10 = j0.c.a(obj);
        Object[] objArr = this.f19121b;
        int i11 = 0;
        while (i11 <= i10) {
            int i12 = (i11 + i10) >>> 1;
            Object obj2 = objArr[i12];
            int a11 = j0.c.a(obj2);
            if (a11 < a10) {
                i11 = i12 + 1;
            } else if (a11 > a10) {
                i10 = i12 - 1;
            } else if (obj2 == obj) {
                return i12;
            } else {
                return d(i12, obj, a10);
            }
        }
        return -(i11 + 1);
    }

    private final int d(int i10, Object obj, int i11) {
        Object obj2;
        Object[] objArr = this.f19121b;
        int i12 = this.f19120a;
        for (int i13 = i10 - 1; -1 < i13; i13--) {
            Object obj3 = objArr[i13];
            if (obj3 == obj) {
                return i13;
            }
            if (j0.c.a(obj3) != i11) {
                break;
            }
        }
        do {
            i10++;
            if (i10 < i12) {
                obj2 = objArr[i10];
                if (obj2 == obj) {
                    return i10;
                }
            } else {
                return -(i12 + 1);
            }
        } while (j0.c.a(obj2) == i11);
        return -(i10 + 1);
    }

    public final int b(Object obj, int i10) {
        int i11;
        q.i(obj, "key");
        int[] iArr = this.f19122c;
        if (this.f19120a > 0) {
            i11 = c(obj);
            if (i11 >= 0) {
                int i12 = iArr[i11];
                iArr[i11] = i10;
                return i12;
            }
        } else {
            i11 = -1;
        }
        int i13 = -(i11 + 1);
        Object[] objArr = this.f19121b;
        int i14 = this.f19120a;
        if (i14 == objArr.length) {
            Object[] objArr2 = new Object[objArr.length * 2];
            int[] iArr2 = new int[objArr.length * 2];
            int i15 = i13 + 1;
            o.i(objArr, objArr2, i15, i13, i14);
            o.g(iArr, iArr2, i15, i13, i14);
            o.m(objArr, objArr2, 0, 0, i13, 6, null);
            o.l(iArr, iArr2, 0, 0, i13, 6, null);
            this.f19121b = objArr2;
            this.f19122c = iArr2;
        } else {
            int i16 = i13 + 1;
            o.i(objArr, objArr, i16, i13, i14);
            o.g(iArr, iArr, i16, i13, i14);
        }
        this.f19121b[i13] = obj;
        this.f19122c[i13] = i10;
        this.f19120a++;
        return -1;
    }

    public final Object[] e() {
        return this.f19121b;
    }

    public final int f() {
        return this.f19120a;
    }

    public final int[] g() {
        return this.f19122c;
    }
}
