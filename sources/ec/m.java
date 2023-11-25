package ec;

import java.lang.reflect.Array;

/* compiled from: ArraysJVM.kt */
/* loaded from: classes4.dex */
class m {
    public static final <T> T[] a(T[] tArr, int i10) {
        qc.q.i(tArr, "reference");
        Object newInstance = Array.newInstance(tArr.getClass().getComponentType(), i10);
        qc.q.g(newInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
        return (T[]) ((Object[]) newInstance);
    }

    public static final void b(int i10, int i11) {
        if (i10 <= i11) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i10 + ") is greater than size (" + i11 + ").");
    }
}
