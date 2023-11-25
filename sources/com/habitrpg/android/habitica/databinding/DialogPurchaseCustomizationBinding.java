package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.habitrpg.android.habitica.R;
import com.habitrpg.common.habitica.views.PixelArtView;
import e4.a;
import e4.b;

/* loaded from: classes4.dex */
public final class DialogPurchaseCustomizationBinding implements a {
    public final PixelArtView imageView;
    private final View rootView;
    public final TextView titleTextView;

    private DialogPurchaseCustomizationBinding(View view, PixelArtView pixelArtView, TextView textView) {
        this.rootView = view;
        this.imageView = pixelArtView;
        this.titleTextView = textView;
    }

    public static DialogPurchaseCustomizationBinding bind(View view) {
        int i10 = R.id.imageView;
        PixelArtView pixelArtView = (PixelArtView) b.a(view, R.id.imageView);
        if (pixelArtView != null) {
            i10 = R.id.titleTextView;
            TextView textView = (TextView) b.a(view, R.id.titleTextView);
            if (textView != null) {
                return new DialogPurchaseCustomizationBinding(view, pixelArtView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static DialogPurchaseCustomizationBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.dialog_purchase_customization, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // e4.a
    public View getRoot() {
        return this.rootView;
    }
}
