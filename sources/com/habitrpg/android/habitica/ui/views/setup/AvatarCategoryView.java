package com.habitrpg.android.habitica.ui.views.setup;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.a;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.extensions.DrawableExtendsionsKt;
import qc.q;

/* compiled from: AvatarCategoryView.kt */
/* loaded from: classes4.dex */
public final class AvatarCategoryView extends LinearLayout {
    public static final int $stable = 8;
    private final Drawable icon;
    private final TextView textView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AvatarCategoryView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        q.i(context, "context");
        View.inflate(context, R.layout.avatar_category, this);
        View findViewById = findViewById(R.id.text_view);
        q.h(findViewById, "findViewById(...)");
        TextView textView = (TextView) findViewById;
        this.textView = textView;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.AvatarCategoryView, 0, 0);
        q.h(obtainStyledAttributes, "obtainStyledAttributes(...)");
        textView.setText(obtainStyledAttributes.getText(0));
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.icon = drawable;
        if (drawable != null) {
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, drawable, (Drawable) null, (Drawable) null);
        }
        setActive(false);
    }

    public final void setActive(boolean z10) {
        int c10;
        if (z10) {
            c10 = a.c(getContext(), R.color.white);
        } else {
            c10 = a.c(getContext(), R.color.white_50_alpha);
        }
        this.textView.setTextColor(c10);
        Drawable drawable = this.icon;
        if (drawable != null) {
            DrawableExtendsionsKt.setTintWith(drawable, c10, PorterDuff.Mode.MULTIPLY);
            this.textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, this.icon, (Drawable) null, (Drawable) null);
        }
    }
}
