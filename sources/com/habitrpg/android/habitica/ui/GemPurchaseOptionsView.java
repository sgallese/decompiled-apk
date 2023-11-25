package com.habitrpg.android.habitica.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.databinding.PurchaseGemViewBinding;
import com.habitrpg.common.habitica.extensions.ContextExtensionsKt;
import qc.q;

/* compiled from: GemPurchaseOptionsView.kt */
/* loaded from: classes4.dex */
public final class GemPurchaseOptionsView extends FrameLayout {
    public static final int $stable = 8;
    private PurchaseGemViewBinding binding;
    private com.android.billingclient.api.e sku;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GemPurchaseOptionsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        q.i(context, "context");
        q.i(attributeSet, "attrs");
        PurchaseGemViewBinding inflate = PurchaseGemViewBinding.inflate(ContextExtensionsKt.getLayoutInflater(context), this, true);
        q.h(inflate, "inflate(...)");
        this.binding = inflate;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.GemPurchaseOptionsView, 0, 0);
        q.h(obtainStyledAttributes, "obtainStyledAttributes(...)");
        this.binding.gemAmount.setText(obtainStyledAttributes.getText(0));
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        if (drawable != null) {
            this.binding.gemImage.setImageDrawable(drawable);
        }
    }

    public final PurchaseGemViewBinding getBinding() {
        return this.binding;
    }

    public final com.android.billingclient.api.e getSku() {
        return this.sku;
    }

    public final void setBinding(PurchaseGemViewBinding purchaseGemViewBinding) {
        q.i(purchaseGemViewBinding, "<set-?>");
        this.binding = purchaseGemViewBinding;
    }

    public final void setOnPurchaseClickListener(View.OnClickListener onClickListener) {
        q.i(onClickListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.binding.purchaseButton.setOnClickListener(onClickListener);
    }

    public final void setPurchaseButtonText(String str) {
        q.i(str, "price");
        this.binding.purchaseButton.setText(str);
    }

    public final void setSku(com.android.billingclient.api.e eVar) {
        this.sku = eVar;
    }
}
