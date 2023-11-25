package com.habitrpg.android.habitica.ui.views.shops;

import android.content.Context;
import android.widget.TextView;
import com.google.android.flexbox.FlexboxLayout;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.databinding.DialogPurchaseCustomizationsetBinding;
import com.habitrpg.android.habitica.models.shops.ShopItem;
import com.habitrpg.common.habitica.extensions.ContextExtensionsKt;
import com.habitrpg.common.habitica.extensions.DataBindingUtilsKt;
import com.habitrpg.common.habitica.extensions.IntExtensionsKt;
import com.habitrpg.common.habitica.views.PixelArtView;
import qc.q;

/* compiled from: PurchaseDialogCustomizationSetContent.kt */
/* loaded from: classes4.dex */
public final class PurchaseDialogCustomizationSetContent extends PurchaseDialogContent {
    public static final int $stable = 8;
    private final DialogPurchaseCustomizationsetBinding binding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PurchaseDialogCustomizationSetContent(Context context) {
        super(context, null, 0, 6, null);
        q.i(context, "context");
        DialogPurchaseCustomizationsetBinding inflate = DialogPurchaseCustomizationsetBinding.inflate(ContextExtensionsKt.getLayoutInflater(context), this);
        q.h(inflate, "inflate(...)");
        this.binding = inflate;
    }

    public final DialogPurchaseCustomizationsetBinding getBinding() {
        return this.binding;
    }

    @Override // com.habitrpg.android.habitica.ui.views.shops.PurchaseDialogContent
    public PixelArtView getImageView() {
        Context context = getContext();
        q.h(context, "getContext(...)");
        return new PixelArtView(context, null, 0, 6, null);
    }

    @Override // com.habitrpg.android.habitica.ui.views.shops.PurchaseDialogContent
    public TextView getTitleTextView() {
        TextView textView = this.binding.titleTextView;
        q.h(textView, "titleTextView");
        return textView;
    }

    @Override // com.habitrpg.android.habitica.ui.views.shops.PurchaseDialogContent
    public void setItem(ShopItem shopItem) {
        q.i(shopItem, "item");
        getTitleTextView().setText(shopItem.getText());
        this.binding.imageViewWrapper.removeAllViews();
        for (String str : shopItem.getSetImageNames()) {
            Context context = getContext();
            q.h(context, "getContext(...)");
            PixelArtView pixelArtView = new PixelArtView(context, null, 0, 6, null);
            pixelArtView.setBackgroundResource(R.drawable.layout_rounded_bg_window);
            DataBindingUtilsKt.loadImage$default(pixelArtView, str, null, 2, null);
            pixelArtView.setLayoutParams(new FlexboxLayout.LayoutParams(IntExtensionsKt.dpToPx(76, getContext()), IntExtensionsKt.dpToPx(76, getContext())));
            this.binding.imageViewWrapper.addView(pixelArtView);
        }
        if (q.d(shopItem.getKey(), "facialHair")) {
            this.binding.notesTextView.setText(getContext().getString(R.string.facial_hair_notes));
        } else {
            this.binding.notesTextView.setText(shopItem.getNotes());
        }
    }
}
