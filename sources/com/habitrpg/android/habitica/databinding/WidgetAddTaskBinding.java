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
public final class WidgetAddTaskBinding implements a {
    public final ImageView addTaskIcon;
    public final TextView addTaskText;
    private final LinearLayout rootView;

    private WidgetAddTaskBinding(LinearLayout linearLayout, ImageView imageView, TextView textView) {
        this.rootView = linearLayout;
        this.addTaskIcon = imageView;
        this.addTaskText = textView;
    }

    public static WidgetAddTaskBinding bind(View view) {
        int i10 = R.id.add_task_icon;
        ImageView imageView = (ImageView) b.a(view, R.id.add_task_icon);
        if (imageView != null) {
            i10 = R.id.add_task_text;
            TextView textView = (TextView) b.a(view, R.id.add_task_text);
            if (textView != null) {
                return new WidgetAddTaskBinding((LinearLayout) view, imageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static WidgetAddTaskBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static WidgetAddTaskBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.widget_add_task, viewGroup, false);
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
