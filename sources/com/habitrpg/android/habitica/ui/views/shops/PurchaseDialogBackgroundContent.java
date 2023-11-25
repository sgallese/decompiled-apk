package com.habitrpg.android.habitica.ui.views.shops;

import android.content.Context;
import android.widget.TextView;
import com.habitrpg.android.habitica.databinding.PurchaseDialogBackgroundBinding;
import com.habitrpg.android.habitica.models.shops.ShopItem;
import com.habitrpg.android.habitica.ui.fragments.NavigationDrawerFragment;
import com.habitrpg.common.habitica.extensions.ContextExtensionsKt;
import com.habitrpg.common.habitica.views.AvatarView;
import com.habitrpg.common.habitica.views.PixelArtView;
import com.habitrpg.shared.habitica.models.Avatar;
import java.util.EnumMap;
import qc.q;
import yc.w;

/* compiled from: PurchaseDialogBackgroundContent.kt */
/* loaded from: classes4.dex */
public final class PurchaseDialogBackgroundContent extends PurchaseDialogContent {
    public static final int $stable = 8;
    private final PurchaseDialogBackgroundBinding binding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PurchaseDialogBackgroundContent(Context context) {
        super(context, null, 0, 6, null);
        q.i(context, "context");
        PurchaseDialogBackgroundBinding inflate = PurchaseDialogBackgroundBinding.inflate(ContextExtensionsKt.getLayoutInflater(context), this);
        q.h(inflate, "inflate(...)");
        this.binding = inflate;
    }

    public final PurchaseDialogBackgroundBinding getBinding() {
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

    public final void setAvatarWithBackgroundPreview(Avatar avatar, ShopItem shopItem) {
        String str;
        q.i(avatar, NavigationDrawerFragment.SIDEBAR_AVATAR);
        q.i(shopItem, "item");
        EnumMap enumMap = new EnumMap(AvatarView.LayerType.class);
        AvatarView.LayerType layerType = AvatarView.LayerType.BACKGROUND;
        String imageName = shopItem.getImageName();
        if (imageName != null) {
            str = w.n0(imageName, "icon_");
        } else {
            str = null;
        }
        enumMap.put((EnumMap) layerType, (AvatarView.LayerType) str);
        this.binding.avatarView.setAvatar(avatar, enumMap);
    }

    @Override // com.habitrpg.android.habitica.ui.views.shops.PurchaseDialogContent
    public void setItem(ShopItem shopItem) {
        q.i(shopItem, "item");
        this.binding.titleTextView.setText(shopItem.getText());
        this.binding.notesTextView.setText(shopItem.getNotes());
    }
}
