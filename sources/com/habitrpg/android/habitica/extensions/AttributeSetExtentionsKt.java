package com.habitrpg.android.habitica.extensions;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import qc.q;

/* compiled from: AttributeSetExtentions.kt */
/* loaded from: classes4.dex */
public final class AttributeSetExtentionsKt {
    public static final TypedArray styledAttributes(AttributeSet attributeSet, Context context, int[] iArr) {
        Resources.Theme theme;
        q.i(attributeSet, "<this>");
        q.i(iArr, "style");
        if (context != null && (theme = context.getTheme()) != null) {
            return theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        }
        return null;
    }
}
