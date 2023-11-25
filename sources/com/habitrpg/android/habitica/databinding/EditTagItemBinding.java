package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import com.habitrpg.android.habitica.R;
import e4.a;
import e4.b;

/* loaded from: classes4.dex */
public final class EditTagItemBinding implements a {
    public final ImageButton deleteButton;
    public final EditText editText;
    private final LinearLayout rootView;

    private EditTagItemBinding(LinearLayout linearLayout, ImageButton imageButton, EditText editText) {
        this.rootView = linearLayout;
        this.deleteButton = imageButton;
        this.editText = editText;
    }

    public static EditTagItemBinding bind(View view) {
        int i10 = R.id.delete_button;
        ImageButton imageButton = (ImageButton) b.a(view, R.id.delete_button);
        if (imageButton != null) {
            i10 = R.id.edit_text;
            EditText editText = (EditText) b.a(view, R.id.edit_text);
            if (editText != null) {
                return new EditTagItemBinding((LinearLayout) view, imageButton, editText);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static EditTagItemBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static EditTagItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.edit_tag_item, viewGroup, false);
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
