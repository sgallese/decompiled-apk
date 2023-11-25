package n0;

import java.util.Arrays;

/* compiled from: TrieNode.kt */
/* loaded from: classes.dex */
public final class x {
    public static final /* synthetic */ Object[] a(Object[] objArr, int i10, Object obj, Object obj2) {
        return g(objArr, i10, obj, obj2);
    }

    public static final /* synthetic */ Object[] b(Object[] objArr, int i10) {
        return h(objArr, i10);
    }

    public static final /* synthetic */ Object[] c(Object[] objArr, int i10) {
        return i(objArr, i10);
    }

    public static final /* synthetic */ Object[] d(Object[] objArr, int i10, int i11, t tVar) {
        return j(objArr, i10, i11, tVar);
    }

    public static final /* synthetic */ Object[] e(Object[] objArr, int i10, int i11, Object obj, Object obj2) {
        return k(objArr, i10, i11, obj, obj2);
    }

    public static final int f(int i10, int i11) {
        return (i10 >> i11) & 31;
    }

    public static final <K, V> Object[] g(Object[] objArr, int i10, K k10, V v10) {
        Object[] objArr2 = new Object[objArr.length + 2];
        ec.o.m(objArr, objArr2, 0, 0, i10, 6, null);
        ec.o.i(objArr, objArr2, i10 + 2, i10, objArr.length);
        objArr2[i10] = k10;
        objArr2[i10 + 1] = v10;
        return objArr2;
    }

    public static final Object[] h(Object[] objArr, int i10) {
        Object[] objArr2 = new Object[objArr.length - 2];
        ec.o.m(objArr, objArr2, 0, 0, i10, 6, null);
        ec.o.i(objArr, objArr2, i10, i10 + 2, objArr.length);
        return objArr2;
    }

    public static final Object[] i(Object[] objArr, int i10) {
        Object[] objArr2 = new Object[objArr.length - 1];
        ec.o.m(objArr, objArr2, 0, 0, i10, 6, null);
        ec.o.i(objArr, objArr2, i10, i10 + 1, objArr.length);
        return objArr2;
    }

    public static final Object[] j(Object[] objArr, int i10, int i11, t<?, ?> tVar) {
        int i12 = i11 - 2;
        Object[] objArr2 = new Object[(objArr.length - 2) + 1];
        ec.o.m(objArr, objArr2, 0, 0, i10, 6, null);
        ec.o.i(objArr, objArr2, i10, i10 + 2, i11);
        objArr2[i12] = tVar;
        ec.o.i(objArr, objArr2, i12 + 1, i11, objArr.length);
        return objArr2;
    }

    public static final <K, V> Object[] k(Object[] objArr, int i10, int i11, K k10, V v10) {
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length + 1);
        qc.q.h(copyOf, "copyOf(this, newSize)");
        ec.o.i(copyOf, copyOf, i10 + 2, i10 + 1, objArr.length);
        ec.o.i(copyOf, copyOf, i11 + 2, i11, i10);
        copyOf[i11] = k10;
        copyOf[i11 + 1] = v10;
        return copyOf;
    }
}
