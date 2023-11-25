package com.habitrpg.android.habitica.ui.views;

import ad.a1;
import ad.l0;
import ad.x1;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import androidx.appcompat.widget.b0;
import com.habitrpg.android.habitica.R;
import qc.q;

/* compiled from: Typewriter.kt */
/* loaded from: classes4.dex */
public final class Typewriter extends b0 {
    public static final int $stable = 8;
    private long delay;
    private Object hiddenSpan;
    private int index;
    private x1 job;
    private SpannableStringBuilder stringBuilder;
    private Object visibleSpan;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Typewriter(Context context) {
        super(context);
        q.i(context, "context");
        this.delay = 30L;
        setupTextColors(context);
    }

    private final void setupTextColors(Context context) {
        this.visibleSpan = new ForegroundColorSpan(androidx.core.content.a.c(context, R.color.text_primary));
        this.hiddenSpan = new ForegroundColorSpan(androidx.core.content.a.c(context, R.color.transparent));
    }

    public final void animateText(CharSequence charSequence) {
        q.i(charSequence, "text");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        this.stringBuilder = spannableStringBuilder;
        spannableStringBuilder.setSpan(this.hiddenSpan, 0, spannableStringBuilder.length(), 17);
        this.index = 0;
        setText(this.stringBuilder);
        x1 x1Var = this.job;
        if (x1Var != null) {
            x1.a.a(x1Var, null, 1, null);
        }
        this.job = ad.g.d(l0.b(), a1.c(), null, new Typewriter$animateText$1(this, null), 2, null);
    }

    public final boolean isAnimating() {
        int i10;
        int i11 = this.index;
        SpannableStringBuilder spannableStringBuilder = this.stringBuilder;
        if (spannableStringBuilder != null) {
            i10 = spannableStringBuilder.length();
        } else {
            i10 = 0;
        }
        if (i11 >= i10) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        x1 x1Var = this.job;
        if (x1Var != null) {
            x1.a.a(x1Var, null, 1, null);
        }
        super.onDetachedFromWindow();
    }

    public final void stopTextAnimation() {
        int i10;
        SpannableStringBuilder spannableStringBuilder = this.stringBuilder;
        if (spannableStringBuilder != null) {
            i10 = spannableStringBuilder.length();
        } else {
            i10 = 0;
        }
        this.index = i10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Typewriter(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        q.i(context, "context");
        q.i(attributeSet, "attrs");
        this.delay = 30L;
        setupTextColors(context);
    }
}
