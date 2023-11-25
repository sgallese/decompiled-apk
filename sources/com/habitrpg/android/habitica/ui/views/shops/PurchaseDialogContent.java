package com.habitrpg.android.habitica.ui.views.shops;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.habitrpg.android.habitica.models.inventory.QuestContent;
import com.habitrpg.android.habitica.models.shops.ShopItem;
import com.habitrpg.common.habitica.extensions.DataBindingUtilsKt;
import com.habitrpg.common.habitica.extensions.IntExtensionsKt;
import com.habitrpg.common.habitica.extensions.StringExtensionsKt;
import com.habitrpg.common.habitica.views.PixelArtView;
import qc.h;
import qc.q;
import yc.v;
import yc.w;

/* compiled from: PurchaseDialogContent.kt */
/* loaded from: classes4.dex */
public abstract class PurchaseDialogContent extends LinearLayout {
    public static final int $stable = 0;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PurchaseDialogContent(Context context) {
        this(context, null, 0, 6, null);
        q.i(context, "context");
    }

    public abstract PixelArtView getImageView();

    public abstract TextView getTitleTextView();

    public void setItem(ShopItem shopItem) {
        String str;
        boolean K;
        q.i(shopItem, "item");
        String path = shopItem.getPath();
        boolean z10 = false;
        if (path != null) {
            K = w.K(path, "timeTravelBackgrounds", false, 2, null);
            if (K) {
                z10 = true;
            }
        }
        if (z10) {
            PixelArtView imageView = getImageView();
            String imageName = shopItem.getImageName();
            if (imageName != null) {
                str = v.B(imageName, "icon_", "", false, 4, null);
            } else {
                str = null;
            }
            DataBindingUtilsKt.loadImage$default(imageView, str, null, 2, null);
            ViewGroup.LayoutParams layoutParams = getImageView().getLayoutParams();
            layoutParams.height = IntExtensionsKt.dpToPx(147, getContext());
            layoutParams.width = IntExtensionsKt.dpToPx(140, getContext());
            getImageView().setLayoutParams(layoutParams);
        } else {
            DataBindingUtilsKt.loadImage$default(getImageView(), shopItem.getImageName(), null, 2, null);
        }
        getTitleTextView().setText(shopItem.getText());
    }

    public void setQuestContentItem(QuestContent questContent) {
        q.i(questContent, "questContent");
        DataBindingUtilsKt.loadImage$default(getImageView(), "inventory_quest_scroll_" + questContent.getKey(), null, 2, null);
        getTitleTextView().setText(StringExtensionsKt.fromHtml(questContent.getText()), TextView.BufferType.SPANNABLE);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PurchaseDialogContent(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        q.i(context, "context");
    }

    public /* synthetic */ PurchaseDialogContent(Context context, AttributeSet attributeSet, int i10, int i11, h hVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PurchaseDialogContent(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        q.i(context, "context");
        setOrientation(1);
        setGravity(17);
    }
}
