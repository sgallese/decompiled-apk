package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.habitrpg.android.habitica.R;
import e4.a;
import e4.b;

/* loaded from: classes4.dex */
public final class DialogInsufficientCurrencyBinding implements a {
    public final ImageView imageView;
    private final LinearLayout rootView;
    public final TextView textView;

    private DialogInsufficientCurrencyBinding(LinearLayout linearLayout, ImageView imageView, TextView textView) {
        this.rootView = linearLayout;
        this.imageView = imageView;
        this.textView = textView;
    }

    public static DialogInsufficientCurrencyBinding bind(View view) {
        int i10 = R.id.imageView;
        ImageView imageView = (ImageView) b.a(view, R.id.imageView);
        if (imageView != null) {
            i10 = R.id.textView;
            TextView textView = (TextView) b.a(view, R.id.textView);
            if (textView != null) {
                return new DialogInsufficientCurrencyBinding((LinearLayout) view, imageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static DialogInsufficientCurrencyBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static DialogInsufficientCurrencyBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.dialog_insufficient_currency, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // e4.a
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
