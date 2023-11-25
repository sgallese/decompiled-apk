package androidx.core.content.res;

import android.content.res.TypedArray;

/* compiled from: TypedArray.kt */
/* loaded from: classes.dex */
public final class k {
    private static final void a(TypedArray typedArray, int i10) {
        if (typedArray.hasValue(i10)) {
            return;
        }
        throw new IllegalArgumentException("Attribute not defined in set.");
    }

    public static final int b(TypedArray typedArray, int i10) {
        a(typedArray, i10);
        return typedArray.getColor(i10, 0);
    }

    public static final int c(TypedArray typedArray, int i10) {
        a(typedArray, i10);
        return typedArray.getResourceId(i10, 0);
    }
}
