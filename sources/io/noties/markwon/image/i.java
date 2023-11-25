package io.noties.markwon.image;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* compiled from: DrawableUtils.java */
/* loaded from: classes4.dex */
public abstract class i {
    public static void a(Drawable drawable) {
        drawable.setBounds(b(drawable));
    }

    public static Rect b(Drawable drawable) {
        return new Rect(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
    }
}
