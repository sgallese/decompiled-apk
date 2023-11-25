package com.habitrpg.android.habitica.ui.views;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.b0;
import com.habitrpg.android.habitica.R;
import com.habitrpg.common.habitica.extensions.ContextExtensionsKt;
import qc.q;

/* compiled from: DayNightTextView.kt */
/* loaded from: classes4.dex */
public final class DayNightTextView extends b0 {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DayNightTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArray;
        int c10;
        q.i(context, "context");
        Resources.Theme theme = context.getTheme();
        Integer num = null;
        if (theme != null) {
            typedArray = theme.obtainStyledAttributes(attributeSet, R.styleable.DayNightTextView, 0, 0);
        } else {
            typedArray = null;
        }
        if (ContextExtensionsKt.isUsingNightModeResources(context)) {
            if (typedArray != null) {
                num = Integer.valueOf(typedArray.getColor(1, androidx.core.content.a.c(context, R.color.text_primary)));
            }
        } else if (typedArray != null) {
            num = Integer.valueOf(typedArray.getColor(0, androidx.core.content.a.c(context, R.color.text_primary)));
        }
        if (num != null) {
            c10 = num.intValue();
        } else {
            c10 = androidx.core.content.a.c(context, R.color.text_primary);
        }
        setTextColor(c10);
    }
}
