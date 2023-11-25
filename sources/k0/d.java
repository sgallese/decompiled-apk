package k0;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import ec.o;
import java.util.Arrays;
import qc.q;

/* compiled from: IdentityScopeMap.kt */
/* loaded from: classes.dex */
public final class d<T> {

    /* renamed from: a  reason: collision with root package name */
    private int[] f19131a;

    /* renamed from: b  reason: collision with root package name */
    private Object[] f19132b;

    /* renamed from: c  reason: collision with root package name */
    private c<T>[] f19133c;

    /* renamed from: d  reason: collision with root package name */
    private int f19134d;

    public d() {
        int[] iArr = new int[50];
        for (int i10 = 0; i10 < 50; i10++) {
            iArr[i10] = i10;
        }
        this.f19131a = iArr;
        this.f19132b = new Object[50];
        this.f19133c = new c[50];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int f(Object obj) {
        int a10 = j0.c.a(obj);
        int i10 = this.f19134d - 1;
        Object[] objArr = this.f19132b;
        int[] iArr = this.f19131a;
        int i11 = 0;
        while (i11 <= i10) {
            int i12 = (i11 + i10) >>> 1;
            Object obj2 = objArr[iArr[i12]];
            int a11 = j0.c.a(obj2);
            if (a11 < a10) {
                i11 = i12 + 1;
            } else if (a11 > a10) {
                i10 = i12 - 1;
            } else if (obj == obj2) {
                return i12;
            } else {
                return g(i12, obj, a10);
            }
        }
        return -(i11 + 1);
    }

    private final int g(int i10, Object obj, int i11) {
        Object[] objArr = this.f19132b;
        int[] iArr = this.f19131a;
        for (int i12 = i10 - 1; -1 < i12; i12--) {
            Object obj2 = objArr[iArr[i12]];
            if (obj2 == obj) {
                return i12;
            }
            if (j0.c.a(obj2) != i11) {
                break;
            }
        }
        int i13 = i10 + 1;
        int i14 = this.f19134d;
        while (true) {
            if (i13 < i14) {
                Object obj3 = objArr[iArr[i13]];
                if (obj3 == obj) {
                    return i13;
                }
                if (j0.c.a(obj3) != i11) {
                    break;
                }
                i13++;
            } else {
                i13 = this.f19134d;
                break;
            }
        }
        return -(i13 + 1);
    }

    private final c<T> h(Object obj) {
        int i10;
        int i11 = this.f19134d;
        int[] iArr = this.f19131a;
        Object[] objArr = this.f19132b;
        c<T>[] cVarArr = this.f19133c;
        if (i11 > 0) {
            i10 = f(obj);
            if (i10 >= 0) {
                return o(i10);
            }
        } else {
            i10 = -1;
        }
        int i12 = -(i10 + 1);
        if (i11 < iArr.length) {
            int i13 = iArr[i11];
            objArr[i13] = obj;
            c<T> cVar = cVarArr[i13];
            if (cVar == null) {
                cVar = new c<>();
                cVarArr[i13] = cVar;
            }
            if (i12 < i11) {
                o.g(iArr, iArr, i12 + 1, i12, i11);
            }
            iArr[i12] = i13;
            this.f19134d++;
            return cVar;
        }
        int length = iArr.length * 2;
        Object[] copyOf = Arrays.copyOf(cVarArr, length);
        q.h(copyOf, "copyOf(this, newSize)");
        c<T>[] cVarArr2 = (c[]) copyOf;
        c<T> cVar2 = new c<>();
        cVarArr2[i11] = cVar2;
        Object[] copyOf2 = Arrays.copyOf(objArr, length);
        q.h(copyOf2, "copyOf(this, newSize)");
        copyOf2[i11] = obj;
        int[] iArr2 = new int[length];
        for (int i14 = i11 + 1; i14 < length; i14++) {
            iArr2[i14] = i14;
        }
        if (i12 < i11) {
            o.g(iArr, iArr2, i12 + 1, i12, i11);
        }
        iArr2[i12] = i11;
        if (i12 > 0) {
            o.l(iArr, iArr2, 0, 0, i12, 6, null);
        }
        this.f19133c = cVarArr2;
        this.f19132b = copyOf2;
        this.f19131a = iArr2;
        this.f19134d++;
        return cVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final c<T> o(int i10) {
        c<T> cVar = this.f19133c[this.f19131a[i10]];
        q.f(cVar);
        return cVar;
    }

    public final boolean c(Object obj, T t10) {
        q.i(obj, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        q.i(t10, "scope");
        return h(obj).add(t10);
    }

    public final void d() {
        c<T>[] cVarArr = this.f19133c;
        int[] iArr = this.f19131a;
        Object[] objArr = this.f19132b;
        int length = cVarArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            c<T> cVar = cVarArr[i10];
            if (cVar != null) {
                cVar.clear();
            }
            iArr[i10] = i10;
            objArr[i10] = null;
        }
        this.f19134d = 0;
    }

    public final boolean e(Object obj) {
        q.i(obj, "element");
        if (f(obj) >= 0) {
            return true;
        }
        return false;
    }

    public final c<T>[] i() {
        return this.f19133c;
    }

    public final int j() {
        return this.f19134d;
    }

    public final int[] k() {
        return this.f19131a;
    }

    public final Object[] l() {
        return this.f19132b;
    }

    public final boolean m(Object obj, T t10) {
        int i10;
        c<T> cVar;
        q.i(obj, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        q.i(t10, "scope");
        int f10 = f(obj);
        int[] iArr = this.f19131a;
        c<T>[] cVarArr = this.f19133c;
        Object[] objArr = this.f19132b;
        int i11 = this.f19134d;
        if (f10 < 0 || (cVar = cVarArr[(i10 = iArr[f10])]) == null) {
            return false;
        }
        boolean remove = cVar.remove(t10);
        if (cVar.size() == 0) {
            int i12 = f10 + 1;
            if (i12 < i11) {
                o.g(iArr, iArr, f10, i12, i11);
            }
            int i13 = i11 - 1;
            iArr[i13] = i10;
            objArr[i10] = null;
            this.f19134d = i13;
        }
        return remove;
    }

    public final void n(T t10) {
        q.i(t10, "scope");
        int[] k10 = k();
        c<T>[] i10 = i();
        Object[] l10 = l();
        int j10 = j();
        int i11 = 0;
        for (int i12 = 0; i12 < j10; i12++) {
            int i13 = k10[i12];
            c<T> cVar = i10[i13];
            q.f(cVar);
            cVar.remove(t10);
            if (cVar.size() > 0) {
                if (i11 != i12) {
                    int i14 = k10[i11];
                    k10[i11] = i13;
                    k10[i12] = i14;
                }
                i11++;
            }
        }
        int j11 = j();
        for (int i15 = i11; i15 < j11; i15++) {
            l10[k10[i15]] = null;
        }
        p(i11);
    }

    public final void p(int i10) {
        this.f19134d = i10;
    }
}
