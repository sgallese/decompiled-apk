package k0;

import ec.o;
import qc.h;
import qc.q;

/* compiled from: IdentityArrayMap.kt */
/* loaded from: classes.dex */
public final class b<Key, Value> {

    /* renamed from: a  reason: collision with root package name */
    private Object[] f19123a;

    /* renamed from: b  reason: collision with root package name */
    private Object[] f19124b;

    /* renamed from: c  reason: collision with root package name */
    private int f19125c;

    public b(int i10) {
        this.f19123a = new Object[i10];
        this.f19124b = new Object[i10];
    }

    private final int d(Object obj) {
        int a10 = j0.c.a(obj);
        int i10 = this.f19125c - 1;
        Object[] objArr = this.f19123a;
        int i11 = 0;
        while (i11 <= i10) {
            int i12 = (i11 + i10) >>> 1;
            Object obj2 = objArr[i12];
            int a11 = j0.c.a(obj2);
            if (a11 < a10) {
                i11 = i12 + 1;
            } else if (a11 > a10) {
                i10 = i12 - 1;
            } else if (obj == obj2) {
                return i12;
            } else {
                return e(i12, obj, a10);
            }
        }
        return -(i11 + 1);
    }

    private final int e(int i10, Object obj, int i11) {
        Object obj2;
        Object[] objArr = this.f19123a;
        int i12 = this.f19125c;
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

    public final void b() {
        this.f19125c = 0;
        o.t(this.f19123a, null, 0, 0, 6, null);
        o.t(this.f19124b, null, 0, 0, 6, null);
    }

    public final boolean c(Key key) {
        q.i(key, "key");
        if (d(key) >= 0) {
            return true;
        }
        return false;
    }

    public final Value f(Key key) {
        q.i(key, "key");
        int d10 = d(key);
        if (d10 >= 0) {
            return (Value) this.f19124b[d10];
        }
        return null;
    }

    public final Object[] g() {
        return this.f19123a;
    }

    public final int h() {
        return this.f19125c;
    }

    public final Object[] i() {
        return this.f19124b;
    }

    public final boolean j() {
        if (this.f19125c > 0) {
            return true;
        }
        return false;
    }

    public final Value k(Key key) {
        q.i(key, "key");
        int d10 = d(key);
        if (d10 < 0) {
            return null;
        }
        Object[] objArr = this.f19124b;
        Value value = (Value) objArr[d10];
        int i10 = this.f19125c;
        Object[] objArr2 = this.f19123a;
        int i11 = d10 + 1;
        o.i(objArr2, objArr2, d10, i11, i10);
        o.i(objArr, objArr, d10, i11, i10);
        int i12 = i10 - 1;
        objArr2[i12] = null;
        objArr[i12] = null;
        this.f19125c = i12;
        return value;
    }

    public final void l(Key key, Value value) {
        boolean z10;
        Object[] objArr;
        Object[] objArr2;
        q.i(key, "key");
        Object[] objArr3 = this.f19123a;
        Object[] objArr4 = this.f19124b;
        int i10 = this.f19125c;
        int d10 = d(key);
        if (d10 >= 0) {
            objArr4[d10] = value;
            return;
        }
        int i11 = -(d10 + 1);
        if (i10 == objArr3.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            objArr = new Object[i10 * 2];
        } else {
            objArr = objArr3;
        }
        int i12 = i11 + 1;
        o.i(objArr3, objArr, i12, i11, i10);
        if (z10) {
            o.m(objArr3, objArr, 0, 0, i11, 6, null);
        }
        objArr[i11] = key;
        this.f19123a = objArr;
        if (z10) {
            objArr2 = new Object[i10 * 2];
        } else {
            objArr2 = objArr4;
        }
        o.i(objArr4, objArr2, i12, i11, i10);
        if (z10) {
            o.m(objArr4, objArr2, 0, 0, i11, 6, null);
        }
        objArr2[i11] = value;
        this.f19124b = objArr2;
        this.f19125c++;
    }

    public /* synthetic */ b(int i10, int i11, h hVar) {
        this((i11 & 1) != 0 ? 16 : i10);
    }
}
