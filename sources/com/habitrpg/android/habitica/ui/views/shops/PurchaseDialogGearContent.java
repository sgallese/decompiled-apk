package com.habitrpg.android.habitica.ui.views.shops;

import android.content.Context;
import android.widget.TextView;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.databinding.DialogPurchaseContentGearBinding;
import com.habitrpg.android.habitica.models.inventory.Equipment;
import com.habitrpg.android.habitica.models.shops.ShopItem;
import com.habitrpg.android.habitica.ui.fragments.NavigationDrawerFragment;
import com.habitrpg.common.habitica.extensions.ContextExtensionsKt;
import com.habitrpg.common.habitica.views.PixelArtView;
import qc.q;

/* compiled from: PurchaseDialogGearContent.kt */
/* loaded from: classes4.dex */
public final class PurchaseDialogGearContent extends PurchaseDialogContent {
    private final DialogPurchaseContentGearBinding binding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PurchaseDialogGearContent(Context context) {
        super(context, null, 0, 6, null);
        q.i(context, "context");
        DialogPurchaseContentGearBinding inflate = DialogPurchaseContentGearBinding.inflate(ContextExtensionsKt.getLayoutInflater(context), this);
        q.h(inflate, "inflate(...)");
        this.binding = inflate;
    }

    private final void configureFieldsForValue(TextView textView, TextView textView2, int i10) {
        if (textView2 != null) {
            textView2.setText("+" + i10);
        }
        if (i10 == 0) {
            if (textView != null) {
                textView.setTextColor(androidx.core.content.a.c(getContext(), R.color.text_dimmed));
            }
            if (textView2 != null) {
                textView2.setTextColor(androidx.core.content.a.c(getContext(), R.color.text_dimmed));
            }
        }
    }

    public final DialogPurchaseContentGearBinding getBinding() {
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

    public final void setEquipment(Equipment equipment) {
        q.i(equipment, NavigationDrawerFragment.SIDEBAR_EQUIPMENT);
        if (equipment.isValid()) {
            DialogPurchaseContentGearBinding dialogPurchaseContentGearBinding = this.binding;
            configureFieldsForValue(dialogPurchaseContentGearBinding.strLabel, dialogPurchaseContentGearBinding.strValue, equipment.getStr());
            DialogPurchaseContentGearBinding dialogPurchaseContentGearBinding2 = this.binding;
            configureFieldsForValue(dialogPurchaseContentGearBinding2.perLabel, dialogPurchaseContentGearBinding2.perValue, equipment.getPer());
            DialogPurchaseContentGearBinding dialogPurchaseContentGearBinding3 = this.binding;
            configureFieldsForValue(dialogPurchaseContentGearBinding3.conLabel, dialogPurchaseContentGearBinding3.conValue, equipment.getCon());
            DialogPurchaseContentGearBinding dialogPurchaseContentGearBinding4 = this.binding;
            configureFieldsForValue(dialogPurchaseContentGearBinding4.intLabel, dialogPurchaseContentGearBinding4.intValue, equipment.get_int());
            return;
        }
        DialogPurchaseContentGearBinding dialogPurchaseContentGearBinding5 = this.binding;
        configureFieldsForValue(dialogPurchaseContentGearBinding5.strLabel, dialogPurchaseContentGearBinding5.strValue, 0);
        DialogPurchaseContentGearBinding dialogPurchaseContentGearBinding6 = this.binding;
        configureFieldsForValue(dialogPurchaseContentGearBinding6.perLabel, dialogPurchaseContentGearBinding6.perValue, 0);
        DialogPurchaseContentGearBinding dialogPurchaseContentGearBinding7 = this.binding;
        configureFieldsForValue(dialogPurchaseContentGearBinding7.conLabel, dialogPurchaseContentGearBinding7.conValue, 0);
        DialogPurchaseContentGearBinding dialogPurchaseContentGearBinding8 = this.binding;
        configureFieldsForValue(dialogPurchaseContentGearBinding8.intLabel, dialogPurchaseContentGearBinding8.intValue, 0);
    }

    @Override // com.habitrpg.android.habitica.ui.views.shops.PurchaseDialogContent
    public void setItem(ShopItem shopItem) {
        q.i(shopItem, "item");
        super.setItem(shopItem);
        this.binding.notesTextView.setText(shopItem.getNotes());
    }
}
