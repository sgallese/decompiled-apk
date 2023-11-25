package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.flexbox.FlexboxLayout;
import com.habitrpg.android.habitica.R;
import e4.a;
import e4.b;

/* loaded from: classes4.dex */
public final class DialogPurchaseCustomizationsetBinding implements a {
    public final FlexboxLayout imageViewWrapper;
    public final TextView notesTextView;
    private final View rootView;
    public final TextView titleTextView;

    private DialogPurchaseCustomizationsetBinding(View view, FlexboxLayout flexboxLayout, TextView textView, TextView textView2) {
        this.rootView = view;
        this.imageViewWrapper = flexboxLayout;
        this.notesTextView = textView;
        this.titleTextView = textView2;
    }

    public static DialogPurchaseCustomizationsetBinding bind(View view) {
        int i10 = R.id.image_view_wrapper;
        FlexboxLayout flexboxLayout = (FlexboxLayout) b.a(view, R.id.image_view_wrapper);
        if (flexboxLayout != null) {
            i10 = R.id.notesTextView;
            TextView textView = (TextView) b.a(view, R.id.notesTextView);
            if (textView != null) {
                i10 = R.id.titleTextView;
                TextView textView2 = (TextView) b.a(view, R.id.titleTextView);
                if (textView2 != null) {
                    return new DialogPurchaseCustomizationsetBinding(view, flexboxLayout, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static DialogPurchaseCustomizationsetBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.dialog_purchase_customizationset, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // e4.a
    public View getRoot() {
        return this.rootView;
    }
}
