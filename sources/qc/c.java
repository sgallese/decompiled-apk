package qc;

import java.util.Iterator;

/* compiled from: ArrayIterator.kt */
/* loaded from: classes4.dex */
public final class c {
    public static final <T> Iterator<T> a(T[] tArr) {
        q.i(tArr, "array");
        return new b(tArr);
    }
}
