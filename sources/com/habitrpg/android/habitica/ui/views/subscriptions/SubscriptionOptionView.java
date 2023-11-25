package com.habitrpg.android.habitica.ui.views.subscriptions;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.databinding.PurchaseSubscriptionViewBinding;
import com.habitrpg.common.habitica.extensions.ContextExtensionsKt;
import qc.q;

/* compiled from: SubscriptionOptionView.kt */
/* loaded from: classes4.dex */
public final class SubscriptionOptionView extends FrameLayout {
    public static final int $stable = 8;
    private final PurchaseSubscriptionViewBinding binding;
    private String sku;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubscriptionOptionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        q.i(context, "context");
        q.i(attributeSet, "attrs");
        PurchaseSubscriptionViewBinding inflate = PurchaseSubscriptionViewBinding.inflate(ContextExtensionsKt.getLayoutInflater(context), this, true);
        q.h(inflate, "inflate(...)");
        this.binding = inflate;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.SubscriptionOptionView, 0, 0);
        q.h(obtainStyledAttributes, "obtainStyledAttributes(...)");
        if (obtainStyledAttributes.getBoolean(3, false)) {
            inflate.descriptionTextView.setText(context.getString(R.string.subscription_duration_norenew, obtainStyledAttributes.getText(4)));
        } else {
            inflate.descriptionTextView.setText(context.getString(R.string.subscription_duration, obtainStyledAttributes.getText(4)));
        }
        inflate.gemCapTextView.setText(obtainStyledAttributes.getText(1));
        setFlagText(obtainStyledAttributes.getText(0));
        int integer = obtainStyledAttributes.getInteger(2, 0);
        inflate.hourglassTextView.setVisibility(0);
        if (integer != 0) {
            inflate.hourglassTextView.setText(context.getString(R.string.subscription_hourglasses, Integer.valueOf(integer)));
        } else {
            inflate.hourglassTextView.setText(context.getString(R.string.subscription_hourglasses_3month_timeframe));
        }
    }

    public final String getSku() {
        return this.sku;
    }

    public final void setFlagText(CharSequence charSequence) {
        int i10;
        if (charSequence != null) {
            i10 = charSequence.length();
        } else {
            i10 = 0;
        }
        if (i10 == 0) {
            this.binding.flagFlap.setVisibility(8);
            this.binding.flagTextview.setVisibility(8);
            return;
        }
        this.binding.flagFlap.setVisibility(0);
        this.binding.flagTextview.setVisibility(0);
        this.binding.flagTextview.setText(charSequence);
    }

    public final void setIsSelected(boolean z10) {
        if (z10) {
            this.binding.wrapper.setBackgroundResource(R.drawable.subscription_box_bg_selected);
            this.binding.subscriptionSelectedView.setBackgroundResource(R.drawable.subscription_selected);
            this.binding.gemCapTextView.setBackgroundResource(R.drawable.pill_bg_purple_400);
            this.binding.gemCapTextView.setTextColor(androidx.core.content.a.c(getContext(), R.color.white));
            this.binding.hourglassTextView.setBackgroundResource(R.drawable.pill_bg_purple_400);
            this.binding.hourglassTextView.setTextColor(androidx.core.content.a.c(getContext(), R.color.white));
            this.binding.priceLabel.setTextColor(androidx.core.content.a.c(getContext(), R.color.text_brand));
            this.binding.descriptionTextView.setTextColor(androidx.core.content.a.c(getContext(), R.color.text_brand));
        } else {
            this.binding.wrapper.setBackgroundResource(R.drawable.subscription_type_box_bg);
            this.binding.subscriptionSelectedView.setBackgroundResource(R.drawable.subscription_unselected);
            this.binding.gemCapTextView.setBackgroundResource(R.drawable.pill_bg_gray);
            this.binding.gemCapTextView.setTextColor(androidx.core.content.a.c(getContext(), R.color.text_secondary));
            this.binding.hourglassTextView.setBackgroundResource(R.drawable.pill_bg_gray);
            this.binding.hourglassTextView.setTextColor(androidx.core.content.a.c(getContext(), R.color.text_secondary));
            this.binding.priceLabel.setTextColor(androidx.core.content.a.c(getContext(), R.color.text_ternary));
            this.binding.descriptionTextView.setTextColor(androidx.core.content.a.c(getContext(), R.color.text_ternary));
        }
        int dimension = (int) getResources().getDimension(R.dimen.pill_horizontal_padding);
        int dimension2 = (int) getResources().getDimension(R.dimen.pill_vertical_padding);
        this.binding.gemCapTextView.setPadding(dimension, dimension2, dimension, dimension2);
        this.binding.hourglassTextView.setPadding(dimension, dimension2, dimension, dimension2);
    }

    public final void setOnPurchaseClickListener(View.OnClickListener onClickListener) {
        q.i(onClickListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        setOnClickListener(onClickListener);
    }

    public final void setPriceText(String str) {
        q.i(str, "text");
        this.binding.priceLabel.setText(str);
    }

    public final void setSku(String str) {
        this.sku = str;
    }
}
