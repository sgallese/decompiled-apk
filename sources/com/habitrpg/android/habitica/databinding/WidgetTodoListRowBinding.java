package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.habitrpg.android.habitica.R;
import e4.a;
import e4.b;

/* loaded from: classes4.dex */
public final class WidgetTodoListRowBinding implements a {
    public final FrameLayout checkboxBackground;
    private final FrameLayout rootView;
    public final TextView todoText;
    public final FrameLayout widgetListRow;

    private WidgetTodoListRowBinding(FrameLayout frameLayout, FrameLayout frameLayout2, TextView textView, FrameLayout frameLayout3) {
        this.rootView = frameLayout;
        this.checkboxBackground = frameLayout2;
        this.todoText = textView;
        this.widgetListRow = frameLayout3;
    }

    public static WidgetTodoListRowBinding bind(View view) {
        int i10 = R.id.checkbox_background;
        FrameLayout frameLayout = (FrameLayout) b.a(view, R.id.checkbox_background);
        if (frameLayout != null) {
            i10 = R.id.todo_text;
            TextView textView = (TextView) b.a(view, R.id.todo_text);
            if (textView != null) {
                FrameLayout frameLayout2 = (FrameLayout) view;
                return new WidgetTodoListRowBinding(frameLayout2, frameLayout, textView, frameLayout2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static WidgetTodoListRowBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static WidgetTodoListRowBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.widget_todo_list_row, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // e4.a
    public FrameLayout getRoot() {
        return this.rootView;
    }
}
