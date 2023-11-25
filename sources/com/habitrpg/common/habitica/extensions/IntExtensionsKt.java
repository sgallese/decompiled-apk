package com.habitrpg.common.habitica.extensions;

import android.content.Context;
import android.content.res.Resources;

/* compiled from: IntExtensions.kt */
/* loaded from: classes4.dex */
public final class IntExtensionsKt {
    public static final int dpToPx(int i10, Context context) {
        Resources resources;
        return (int) ((i10 * (((context == null || (resources = context.getResources()) == null) ? null : resources.getDisplayMetrics()) != null ? r3.density : 1.0f)) + 0.5d);
    }

    public static final float dpToPx(float f10, Context context) {
        Resources resources;
        return (float) ((f10 * (((context == null || (resources = context.getResources()) == null) ? null : resources.getDisplayMetrics()) != null ? r3.density : 1.0f)) + 0.5d);
    }

    public static final double dpToPx(double d10, Context context) {
        Resources resources;
        return (d10 * (((context == null || (resources = context.getResources()) == null) ? null : resources.getDisplayMetrics()) != null ? r4.density : 1.0f)) + 0.5d;
    }
}
