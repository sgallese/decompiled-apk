package com.google.common.collect;

/* compiled from: ObjectArrays.java */
/* loaded from: classes3.dex */
public final class r {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object a(Object obj, int i10) {
        if (obj != null) {
            return obj;
        }
        StringBuilder sb2 = new StringBuilder(20);
        sb2.append("at index ");
        sb2.append(i10);
        throw new NullPointerException(sb2.toString());
    }

    public static <T> T[] b(T[] tArr, int i10) {
        return (T[]) t.b(tArr, i10);
    }
}
