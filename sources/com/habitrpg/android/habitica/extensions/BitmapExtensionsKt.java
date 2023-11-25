package com.habitrpg.android.habitica.extensions;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import qc.q;

/* compiled from: BitmapExtensions.kt */
/* loaded from: classes4.dex */
public final class BitmapExtensionsKt {
    public static final Drawable asDrawable(Bitmap bitmap, Resources resources) {
        q.i(bitmap, "<this>");
        q.i(resources, "resources");
        return new BitmapDrawable(resources, bitmap);
    }
}
