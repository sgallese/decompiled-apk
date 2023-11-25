package com.habitrpg.android.habitica.ui.views.shops;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.widget.TextView;
import com.habitrpg.android.habitica.databinding.DialogPurchaseGemsBinding;
import com.habitrpg.android.habitica.extensions.BitmapExtensionsKt;
import com.habitrpg.android.habitica.models.shops.ShopItem;
import com.habitrpg.android.habitica.ui.views.HabiticaIconsHelper;
import com.habitrpg.android.habitica.ui.views.tasks.form.StepperValueFormView;
import com.habitrpg.common.habitica.extensions.ContextExtensionsKt;
import com.habitrpg.common.habitica.views.PixelArtView;
import qc.q;

/* compiled from: PurchaseDialogGemsContent.kt */
/* loaded from: classes4.dex */
public final class PurchaseDialogGemsContent extends PurchaseDialogContent {
    private final DialogPurchaseGemsBinding binding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PurchaseDialogGemsContent(Context context) {
        super(context, null, 0, 6, null);
        q.i(context, "context");
        DialogPurchaseGemsBinding inflate = DialogPurchaseGemsBinding.inflate(ContextExtensionsKt.getLayoutInflater(context), this);
        q.h(inflate, "inflate(...)");
        this.binding = inflate;
        StepperValueFormView stepperValueFormView = inflate.stepperView;
        Bitmap imageOfGem = HabiticaIconsHelper.imageOfGem();
        q.h(imageOfGem, "imageOfGem(...)");
        Resources resources = context.getResources();
        q.h(resources, "getResources(...)");
        stepperValueFormView.setIconDrawable(BitmapExtensionsKt.asDrawable(imageOfGem, resources));
    }

    public final DialogPurchaseGemsBinding getBinding$Habitica_2311256681_prodRelease() {
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
        q.i(shopItem, "item");
        super.setItem(shopItem);
        this.binding.notesTextView.setText(shopItem.getNotes());
    }
}
