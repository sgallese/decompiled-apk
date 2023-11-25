package com.habitrpg.android.habitica.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.databinding.SpeechbubbleBinding;
import com.habitrpg.common.habitica.extensions.ContextExtensionsKt;
import qc.q;

/* compiled from: SpeechBubbleView.kt */
/* loaded from: classes4.dex */
public final class SpeechBubbleView extends FrameLayout implements View.OnClickListener {
    public static final int $stable = 8;
    private SpeechbubbleBinding binding;
    private ShowNextListener showNextListener;

    /* compiled from: SpeechBubbleView.kt */
    /* loaded from: classes4.dex */
    public interface ShowNextListener {
        void showNextStep();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpeechBubbleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        q.i(context, "context");
        q.i(attributeSet, "attrs");
        SpeechbubbleBinding inflate = SpeechbubbleBinding.inflate(ContextExtensionsKt.getLayoutInflater(context), this, true);
        q.h(inflate, "inflate(...)");
        this.binding = inflate;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.SpeechBubbleView, 0, 0);
        q.h(obtainStyledAttributes, "obtainStyledAttributes(...)");
        this.binding.namePlate.setText(obtainStyledAttributes.getString(0));
        this.binding.textView.setText(obtainStyledAttributes.getString(2));
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        if (drawable != null) {
            this.binding.npcImageView.setImageDrawable(drawable);
        }
        this.binding.confirmationButtons.setVisibility(8);
        setOnClickListener(this);
    }

    public final void animateText(String str) {
        q.i(str, "text");
        this.binding.textView.animateText(str);
    }

    public final SpeechbubbleBinding getBinding$Habitica_2311256681_prodRelease() {
        return this.binding;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        q.i(view, "v");
        if (this.binding.textView.isAnimating()) {
            this.binding.textView.stopTextAnimation();
            return;
        }
        ShowNextListener showNextListener = this.showNextListener;
        if (showNextListener != null) {
            showNextListener.showNextStep();
        }
    }

    public final void setBinding$Habitica_2311256681_prodRelease(SpeechbubbleBinding speechbubbleBinding) {
        q.i(speechbubbleBinding, "<set-?>");
        this.binding = speechbubbleBinding;
    }

    public final void setConfirmationButtonVisibility(int i10) {
        this.binding.confirmationButtons.setVisibility(i10);
    }

    public final void setHasMoreContent(boolean z10) {
        int i10;
        ImageView imageView = this.binding.continueIndicator;
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        imageView.setVisibility(i10);
    }

    public final void setShowNextListener(ShowNextListener showNextListener) {
        q.i(showNextListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.showNextListener = showNextListener;
    }

    public final void setText(String str) {
        q.i(str, "text");
        this.binding.textView.setText(str);
    }
}
