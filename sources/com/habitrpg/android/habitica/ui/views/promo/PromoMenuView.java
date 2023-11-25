package com.habitrpg.android.habitica.ui.views.promo;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.databinding.PromoMenuBinding;
import com.habitrpg.common.habitica.extensions.ContextExtensionsKt;
import qc.h;
import qc.q;

/* compiled from: PromoMenuView.kt */
/* loaded from: classes4.dex */
public final class PromoMenuView extends RelativeLayout {
    public static final int $stable = 8;
    private PromoMenuBinding binding;
    private boolean canClose;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PromoMenuView(Context context) {
        this(context, null, 0, 6, null);
        q.i(context, "context");
    }

    private final void setImage(ImageView imageView, Drawable drawable) {
        if (drawable != null) {
            imageView.setImageDrawable(drawable);
            imageView.setVisibility(0);
            return;
        }
        imageView.setVisibility(8);
    }

    private final void setText(TextView textView, String str) {
        if (str != null) {
            textView.setText(str);
            textView.setVisibility(0);
            return;
        }
        textView.setVisibility(8);
    }

    public final PromoMenuBinding getBinding() {
        return this.binding;
    }

    public final boolean getCanClose() {
        return this.canClose;
    }

    public final void setBinding(PromoMenuBinding promoMenuBinding) {
        q.i(promoMenuBinding, "<set-?>");
        this.binding = promoMenuBinding;
    }

    public final void setCanClose(boolean z10) {
        int i10;
        this.canClose = z10;
        ImageButton imageButton = this.binding.closeButton;
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        imageButton.setVisibility(i10);
    }

    public final void setDecoration(Drawable drawable, Drawable drawable2) {
        this.binding.leftImageView.setImageDrawable(drawable);
        this.binding.rightImageView.setImageDrawable(drawable2);
    }

    public final void setSubtitleImage(Drawable drawable) {
        ImageView imageView = this.binding.descriptionImageView;
        q.h(imageView, "descriptionImageView");
        setImage(imageView, drawable);
    }

    public final void setSubtitleText(String str) {
        TextView textView = this.binding.descriptionView;
        q.h(textView, "descriptionView");
        setText(textView, str);
    }

    public final void setTitleImage(Drawable drawable) {
        ImageView imageView = this.binding.titleImageView;
        q.h(imageView, "titleImageView");
        setImage(imageView, drawable);
    }

    public final void setTitleText(String str) {
        TextView textView = this.binding.titleTextView;
        q.h(textView, "titleTextView");
        setText(textView, str);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PromoMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        q.i(context, "context");
    }

    public /* synthetic */ PromoMenuView(Context context, AttributeSet attributeSet, int i10, int i11, h hVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PromoMenuView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        q.i(context, "context");
        PromoMenuBinding inflate = PromoMenuBinding.inflate(ContextExtensionsKt.getLayoutInflater(context), this);
        q.h(inflate, "inflate(...)");
        this.binding = inflate;
        setBackgroundColor(ContextExtensionsKt.getThemeColor(context, R.attr.colorWindowBackground));
        setClipToPadding(false);
        setClipChildren(false);
        setClipToOutline(false);
    }
}
