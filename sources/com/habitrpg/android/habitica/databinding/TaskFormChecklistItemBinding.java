package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatEditText;
import com.habitrpg.android.habitica.R;
import e4.a;
import e4.b;

/* loaded from: classes4.dex */
public final class TaskFormChecklistItemBinding implements a {
    public final ImageButton button;
    public final ImageView dragGrip;
    public final AppCompatEditText editText;
    private final View rootView;

    private TaskFormChecklistItemBinding(View view, ImageButton imageButton, ImageView imageView, AppCompatEditText appCompatEditText) {
        this.rootView = view;
        this.button = imageButton;
        this.dragGrip = imageView;
        this.editText = appCompatEditText;
    }

    public static TaskFormChecklistItemBinding bind(View view) {
        int i10 = R.id.button;
        ImageButton imageButton = (ImageButton) b.a(view, R.id.button);
        if (imageButton != null) {
            i10 = R.id.drag_grip;
            ImageView imageView = (ImageView) b.a(view, R.id.drag_grip);
            if (imageView != null) {
                i10 = R.id.edit_text;
                AppCompatEditText appCompatEditText = (AppCompatEditText) b.a(view, R.id.edit_text);
                if (appCompatEditText != null) {
                    return new TaskFormChecklistItemBinding(view, imageButton, imageView, appCompatEditText);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static TaskFormChecklistItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.task_form_checklist_item, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // e4.a
    public View getRoot() {
        return this.rootView;
    }
}
