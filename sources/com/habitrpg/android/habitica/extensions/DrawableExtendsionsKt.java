package com.habitrpg.android.habitica.extensions;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import qc.q;

/* compiled from: DrawableExtendsions.kt */
/* loaded from: classes4.dex */
public final class DrawableExtendsionsKt {
    public static final void setTintWith(Drawable drawable, Context context, int i10, PorterDuff.Mode mode) {
        q.i(drawable, "<this>");
        q.i(context, "context");
        q.i(mode, "tintMode");
        androidx.core.graphics.drawable.a.p(drawable, mode);
        androidx.core.graphics.drawable.a.n(drawable, androidx.core.content.a.c(context, i10));
    }

    public static /* synthetic */ void setTintWith$default(Drawable drawable, Context context, int i10, PorterDuff.Mode mode, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            mode = PorterDuff.Mode.MULTIPLY;
        }
        setTintWith(drawable, context, i10, mode);
    }

    public static final void setTintWith(Drawable drawable, int i10, PorterDuff.Mode mode) {
        q.i(drawable, "<this>");
        q.i(mode, "tintMode");
        androidx.core.graphics.drawable.a.n(drawable, i10);
        androidx.core.graphics.drawable.a.p(drawable, mode);
    }

    public static /* synthetic */ void setTintWith$default(Drawable drawable, int i10, PorterDuff.Mode mode, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            mode = PorterDuff.Mode.MULTIPLY;
        }
        setTintWith(drawable, i10, mode);
    }
}
