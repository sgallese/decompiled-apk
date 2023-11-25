package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import com.habitrpg.android.habitica.R;
import e4.a;
import e4.b;

/* loaded from: classes4.dex */
public final class FormStepperValueBinding implements a {
    public final ImageButton downButton;
    public final EditText editText;
    private final View rootView;
    public final ImageButton upButton;

    private FormStepperValueBinding(View view, ImageButton imageButton, EditText editText, ImageButton imageButton2) {
        this.rootView = view;
        this.downButton = imageButton;
        this.editText = editText;
        this.upButton = imageButton2;
    }

    public static FormStepperValueBinding bind(View view) {
        int i10 = R.id.down_button;
        ImageButton imageButton = (ImageButton) b.a(view, R.id.down_button);
        if (imageButton != null) {
            i10 = R.id.edit_text;
            EditText editText = (EditText) b.a(view, R.id.edit_text);
            if (editText != null) {
                i10 = R.id.up_button;
                ImageButton imageButton2 = (ImageButton) b.a(view, R.id.up_button);
                if (imageButton2 != null) {
                    return new FormStepperValueBinding(view, imageButton, editText, imageButton2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static FormStepperValueBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.form_stepper_value, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // e4.a
    public View getRoot() {
        return this.rootView;
    }
}
