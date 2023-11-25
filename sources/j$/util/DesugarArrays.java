package j$.util;

import j$.util.Spliterator;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class DesugarArrays {
    public static Spliterator.OfDouble spliterator(double[] dArr, int i10, int i11) {
        return Spliterators.spliterator(dArr, i10, i11, 1040);
    }

    public static Spliterator.OfInt spliterator(int[] iArr, int i10, int i11) {
        return Spliterators.spliterator(iArr, i10, i11, 1040);
    }

    public static Spliterator.OfLong spliterator(long[] jArr, int i10, int i11) {
        return Spliterators.spliterator(jArr, i10, i11, 1040);
    }

    public static Spliterator spliterator(Object[] objArr, int i10, int i11) {
        return Spliterators.spliterator(objArr, i10, i11, 1040);
    }
}
