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
public final class ClassSpinnerDropdownItemSelectedBinding implements a {
    public final ImageView classIconView;
    private final LinearLayout rootView;
    public final TextView textView;

    private ClassSpinnerDropdownItemSelectedBinding(LinearLayout linearLayout, ImageView imageView, TextView textView) {
        this.rootView = linearLayout;
        this.classIconView = imageView;
        this.textView = textView;
    }

    public static ClassSpinnerDropdownItemSelectedBinding bind(View view) {
        int i10 = R.id.classIconView;
        ImageView imageView = (ImageView) b.a(view, R.id.classIconView);
        if (imageView != null) {
            i10 = R.id.textView;
            TextView textView = (TextView) b.a(view, R.id.textView);
            if (textView != null) {
                return new ClassSpinnerDropdownItemSelectedBinding((LinearLayout) view, imageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static ClassSpinnerDropdownItemSelectedBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ClassSpinnerDropdownItemSelectedBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.class_spinner_dropdown_item_selected, viewGroup, false);
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
