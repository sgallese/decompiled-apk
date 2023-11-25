package com.habitrpg.android.habitica.ui.viewHolders;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.habitrpg.android.habitica.databinding.RowShopitemBinding;
import com.habitrpg.android.habitica.models.shops.ShopItem;
import com.habitrpg.android.habitica.ui.views.HabiticaIconsHelper;
import dc.w;
import pc.p;
import qc.q;

/* compiled from: ShopItemViewHolder.kt */
/* loaded from: classes4.dex */
public final class ShopItemViewHolder extends RecyclerView.f0 implements View.OnClickListener {
    public static final int $stable = 8;
    private final RowShopitemBinding binding;
    private Context context;
    private boolean isCompleted;
    private boolean isPinned;
    private ShopItem item;
    private Integer limitedNumberLeft;
    private pc.a<w> onNeedsRefresh;
    private p<? super ShopItem, ? super Boolean, w> onShowPurchaseDialog;
    private pc.l<? super ShopItem, w> purchaseCardAction;
    private String shopIdentifier;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopItemViewHolder(View view) {
        super(view);
        q.i(view, "itemView");
        RowShopitemBinding bind = RowShopitemBinding.bind(view);
        q.h(bind, "bind(...)");
        this.binding = bind;
        Context context = view.getContext();
        q.h(context, "getContext(...)");
        this.context = context;
        view.setOnClickListener(this);
        view.setClickable(true);
        bind.pinIndicator.setImageBitmap(HabiticaIconsHelper.imageOfPinnedItem());
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void bind(com.habitrpg.android.habitica.models.shops.ShopItem r10, boolean r11, int r12) {
        /*
            Method dump skipped, instructions count: 481
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.viewHolders.ShopItemViewHolder.bind(com.habitrpg.android.habitica.models.shops.ShopItem, boolean, int):void");
    }

    public final Integer getLimitedNumberLeft() {
        return this.limitedNumberLeft;
    }

    public final pc.a<w> getOnNeedsRefresh() {
        return this.onNeedsRefresh;
    }

    public final p<ShopItem, Boolean, w> getOnShowPurchaseDialog() {
        return this.onShowPurchaseDialog;
    }

    public final pc.l<ShopItem, w> getPurchaseCardAction() {
        return this.purchaseCardAction;
    }

    public final String getShopIdentifier() {
        return this.shopIdentifier;
    }

    public final void hidePinIndicator() {
        this.binding.pinIndicator.setVisibility(8);
    }

    public final boolean isCompleted() {
        return this.isCompleted;
    }

    public final boolean isPinned() {
        return this.isPinned;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        p<? super ShopItem, ? super Boolean, w> pVar;
        q.i(view, "view");
        ShopItem shopItem = this.item;
        if (shopItem != null && shopItem.isValid() && (pVar = this.onShowPurchaseDialog) != null) {
            pVar.invoke(shopItem, Boolean.valueOf(this.isPinned));
        }
    }

    public final void setCompleted(boolean z10) {
        int i10;
        this.isCompleted = z10;
        ImageView imageView = this.binding.completedIndicator;
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        imageView.setVisibility(i10);
    }

    public final void setLimitedNumberLeft(Integer num) {
        this.limitedNumberLeft = num;
    }

    public final void setOnNeedsRefresh(pc.a<w> aVar) {
        this.onNeedsRefresh = aVar;
    }

    public final void setOnShowPurchaseDialog(p<? super ShopItem, ? super Boolean, w> pVar) {
        this.onShowPurchaseDialog = pVar;
    }

    public final void setPinned(boolean z10) {
        int i10;
        this.isPinned = z10;
        ImageView imageView = this.binding.pinIndicator;
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        imageView.setVisibility(i10);
    }

    public final void setPurchaseCardAction(pc.l<? super ShopItem, w> lVar) {
        this.purchaseCardAction = lVar;
    }

    public final void setShopIdentifier(String str) {
        this.shopIdentifier = str;
    }
}
