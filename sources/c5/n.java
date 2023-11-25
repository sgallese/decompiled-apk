package c5;

import android.view.View;

/* compiled from: ViewSizeResolver.kt */
/* loaded from: classes.dex */
public final class n {
    public static final <T extends View> m<T> a(T t10, boolean z10) {
        return new g(t10, z10);
    }

    public static /* synthetic */ m b(View view, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return a(view, z10);
    }
}
