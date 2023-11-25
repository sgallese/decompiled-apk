package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.habitrpg.android.habitica.R;
import e4.a;
import e4.b;

/* loaded from: classes4.dex */
public final class FixvaluesEdittextBinding implements a {
    public final TextInputEditText editText;
    public final TextInputLayout editTextWrapper;
    public final View iconBackgroundView;
    public final ImageView iconView;
    private final View rootView;

    private FixvaluesEdittextBinding(View view, TextInputEditText textInputEditText, TextInputLayout textInputLayout, View view2, ImageView imageView) {
        this.rootView = view;
        this.editText = textInputEditText;
        this.editTextWrapper = textInputLayout;
        this.iconBackgroundView = view2;
        this.iconView = imageView;
    }

    public static FixvaluesEdittextBinding bind(View view) {
        int i10 = R.id.editText;
        TextInputEditText textInputEditText = (TextInputEditText) b.a(view, R.id.editText);
        if (textInputEditText != null) {
            i10 = R.id.editTextWrapper;
            TextInputLayout textInputLayout = (TextInputLayout) b.a(view, R.id.editTextWrapper);
            if (textInputLayout != null) {
                i10 = R.id.iconBackgroundView;
                View a10 = b.a(view, R.id.iconBackgroundView);
                if (a10 != null) {
                    i10 = R.id.iconView;
                    ImageView imageView = (ImageView) b.a(view, R.id.iconView);
                    if (imageView != null) {
                        return new FixvaluesEdittextBinding(view, textInputEditText, textInputLayout, a10, imageView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static FixvaluesEdittextBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.fixvalues_edittext, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // e4.a
    public View getRoot() {
        return this.rootView;
    }
}
