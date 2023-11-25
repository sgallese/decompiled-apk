package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.ui.views.ValidatingEditText;
import e4.a;
import e4.b;

/* loaded from: classes4.dex */
public final class DialogEdittextBinding implements a {
    public final ValidatingEditText editText;
    private final LinearLayout rootView;

    private DialogEdittextBinding(LinearLayout linearLayout, ValidatingEditText validatingEditText) {
        this.rootView = linearLayout;
        this.editText = validatingEditText;
    }

    public static DialogEdittextBinding bind(View view) {
        ValidatingEditText validatingEditText = (ValidatingEditText) b.a(view, R.id.edit_text);
        if (validatingEditText != null) {
            return new DialogEdittextBinding((LinearLayout) view, validatingEditText);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.edit_text)));
    }

    public static DialogEdittextBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static DialogEdittextBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.dialog_edittext, viewGroup, false);
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
