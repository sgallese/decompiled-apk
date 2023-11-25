package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.habitrpg.android.habitica.R;
import e4.a;
import e4.b;

/* loaded from: classes4.dex */
public final class DialogHabiticaAccountBinding implements a {
    public final ImageButton backImagebutton;
    public final TextView confirmActionTextview;
    public final TextInputEditText confirmationInputEdittext;
    public final TextInputLayout confirmationTextInputLayout;
    private final MaterialCardView rootView;
    public final TextView titleTextview;
    public final MaterialCardView toolbarCardview;
    public final TextView warningDescriptionTextview;

    private DialogHabiticaAccountBinding(MaterialCardView materialCardView, ImageButton imageButton, TextView textView, TextInputEditText textInputEditText, TextInputLayout textInputLayout, TextView textView2, MaterialCardView materialCardView2, TextView textView3) {
        this.rootView = materialCardView;
        this.backImagebutton = imageButton;
        this.confirmActionTextview = textView;
        this.confirmationInputEdittext = textInputEditText;
        this.confirmationTextInputLayout = textInputLayout;
        this.titleTextview = textView2;
        this.toolbarCardview = materialCardView2;
        this.warningDescriptionTextview = textView3;
    }

    public static DialogHabiticaAccountBinding bind(View view) {
        int i10 = R.id.back_imagebutton;
        ImageButton imageButton = (ImageButton) b.a(view, R.id.back_imagebutton);
        if (imageButton != null) {
            i10 = R.id.confirm_action_textview;
            TextView textView = (TextView) b.a(view, R.id.confirm_action_textview);
            if (textView != null) {
                i10 = R.id.confirmation_input_edittext;
                TextInputEditText textInputEditText = (TextInputEditText) b.a(view, R.id.confirmation_input_edittext);
                if (textInputEditText != null) {
                    i10 = R.id.confirmation_text_input_layout;
                    TextInputLayout textInputLayout = (TextInputLayout) b.a(view, R.id.confirmation_text_input_layout);
                    if (textInputLayout != null) {
                        i10 = R.id.title_textview;
                        TextView textView2 = (TextView) b.a(view, R.id.title_textview);
                        if (textView2 != null) {
                            i10 = R.id.toolbar_cardview;
                            MaterialCardView materialCardView = (MaterialCardView) b.a(view, R.id.toolbar_cardview);
                            if (materialCardView != null) {
                                i10 = R.id.warning_description_textview;
                                TextView textView3 = (TextView) b.a(view, R.id.warning_description_textview);
                                if (textView3 != null) {
                                    return new DialogHabiticaAccountBinding((MaterialCardView) view, imageButton, textView, textInputEditText, textInputLayout, textView2, materialCardView, textView3);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static DialogHabiticaAccountBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static DialogHabiticaAccountBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.dialog_habitica_account, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // e4.a
    public MaterialCardView getRoot() {
        return this.rootView;
    }
}
