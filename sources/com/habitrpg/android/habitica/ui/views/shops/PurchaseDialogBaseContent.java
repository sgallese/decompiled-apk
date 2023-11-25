package com.habitrpg.android.habitica.ui.views.shops;

import android.content.Context;
import android.widget.TextView;
import com.habitrpg.android.habitica.databinding.DialogPurchaseContentItemBinding;
import com.habitrpg.common.habitica.extensions.ContextExtensionsKt;
import com.habitrpg.common.habitica.views.PixelArtView;
import qc.q;

/* compiled from: PurchaseDialogBaseContent.kt */
/* loaded from: classes4.dex */
public final class PurchaseDialogBaseContent extends PurchaseDialogContent {
    public static final int $stable = 8;
    private final DialogPurchaseContentItemBinding binding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PurchaseDialogBaseContent(Context context) {
        super(context, null, 0, 6, null);
        q.i(context, "context");
        DialogPurchaseContentItemBinding inflate = DialogPurchaseContentItemBinding.inflate(ContextExtensionsKt.getLayoutInflater(context), this);
        q.h(inflate, "inflate(...)");
        this.binding = inflate;
    }

    public final DialogPurchaseContentItemBinding getBinding() {
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
}
