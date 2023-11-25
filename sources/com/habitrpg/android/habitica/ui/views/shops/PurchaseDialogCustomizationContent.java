package com.habitrpg.android.habitica.ui.views.shops;

import android.content.Context;
import android.widget.TextView;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.databinding.DialogPurchaseCustomizationBinding;
import com.habitrpg.android.habitica.models.shops.ShopItem;
import com.habitrpg.common.habitica.extensions.ContextExtensionsKt;
import com.habitrpg.common.habitica.views.PixelArtView;
import qc.q;
import yc.v;
import yc.w;

/* compiled from: PurchaseDialogCustomizationContent.kt */
/* loaded from: classes4.dex */
public final class PurchaseDialogCustomizationContent extends PurchaseDialogContent {
    public static final int $stable = 8;
    private final DialogPurchaseCustomizationBinding binding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PurchaseDialogCustomizationContent(Context context) {
        super(context, null, 0, 6, null);
        q.i(context, "context");
        DialogPurchaseCustomizationBinding inflate = DialogPurchaseCustomizationBinding.inflate(ContextExtensionsKt.getLayoutInflater(context), this);
        q.h(inflate, "inflate(...)");
        this.binding = inflate;
    }

    private final CharSequence buildCustomizationTitle(ShopItem shopItem) {
        boolean K;
        boolean K2;
        boolean K3;
        boolean K4;
        boolean K5;
        boolean K6;
        boolean K7;
        String unlockPath = shopItem.getUnlockPath();
        if (unlockPath != null) {
            K = w.K(unlockPath, "skin", false, 2, null);
            if (!K) {
                K2 = w.K(unlockPath, "shirt", false, 2, null);
                if (!K2) {
                    K3 = w.K(unlockPath, "color", false, 2, null);
                    if (!K3) {
                        K4 = w.K(unlockPath, "base", false, 2, null);
                        if (!K4) {
                            K5 = w.K(unlockPath, "bangs", false, 2, null);
                            if (!K5) {
                                K6 = w.K(unlockPath, "beard", false, 2, null);
                                if (!K6) {
                                    K7 = w.K(unlockPath, "mustache", false, 2, null);
                                    if (!K7) {
                                        return null;
                                    }
                                    return getContext().getString(R.string.avatar_mustache_customization);
                                }
                                return getContext().getString(R.string.avatar_beard_customization);
                            }
                            return getContext().getString(R.string.avatar_bangs_customization);
                        }
                        return getContext().getString(R.string.avatar_hair_style_customization);
                    }
                    return getContext().getString(R.string.avatar_hair_color_customization);
                }
                return getContext().getString(R.string.avatar_shirt_customization);
            }
            return getContext().getString(R.string.avatar_skin_customization);
        }
        return null;
    }

    public final DialogPurchaseCustomizationBinding getBinding() {
        return this.binding;
    }

    @Override // com.habitrpg.android.habitica.ui.views.shops.PurchaseDialogContent
    public PixelArtView getImageView() {
        PixelArtView pixelArtView = this.binding.imageView;
        q.h(pixelArtView, "imageView");
        return pixelArtView;
    }

    @Override // com.habitrpg.android.habitica.ui.views.shops.PurchaseDialogContent
    public TextView getTitleTextView() {
        TextView textView = this.binding.titleTextView;
        q.h(textView, "titleTextView");
        return textView;
    }

    @Override // com.habitrpg.android.habitica.ui.views.shops.PurchaseDialogContent
    public void setItem(ShopItem shopItem) {
        boolean u10;
        q.i(shopItem, "item");
        super.setItem(shopItem);
        String text = shopItem.getText();
        boolean z10 = false;
        if (text != null) {
            u10 = v.u(text);
            if ((!u10) == true) {
                z10 = true;
            }
        }
        if (!z10) {
            getTitleTextView().setText(buildCustomizationTitle(shopItem));
        }
    }
}
