package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import com.habitrpg.android.habitica.R;
import e4.a;
import e4.b;

/* loaded from: classes4.dex */
public final class TaskFormReminderItemBinding implements a {
    public final ImageButton button;
    private final View rootView;
    public final TextView textView;

    private TaskFormReminderItemBinding(View view, ImageButton imageButton, TextView textView) {
        this.rootView = view;
        this.button = imageButton;
        this.textView = textView;
    }

    public static TaskFormReminderItemBinding bind(View view) {
        int i10 = R.id.button;
        ImageButton imageButton = (ImageButton) b.a(view, R.id.button);
        if (imageButton != null) {
            i10 = R.id.text_view;
            TextView textView = (TextView) b.a(view, R.id.text_view);
            if (textView != null) {
                return new TaskFormReminderItemBinding(view, imageButton, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static TaskFormReminderItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.task_form_reminder_item, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // e4.a
    public View getRoot() {
        return this.rootView;
    }
}
