package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import com.habitrpg.android.habitica.R;
import e4.a;
import e4.b;

/* loaded from: classes4.dex */
public final class WidgetTaskListBinding implements a {
    public final TextView emptyView;
    public final ListView listView;
    private final LinearLayout rootView;
    public final TextView widgetTitle;

    private WidgetTaskListBinding(LinearLayout linearLayout, TextView textView, ListView listView, TextView textView2) {
        this.rootView = linearLayout;
        this.emptyView = textView;
        this.listView = listView;
        this.widgetTitle = textView2;
    }

    public static WidgetTaskListBinding bind(View view) {
        int i10 = R.id.emptyView;
        TextView textView = (TextView) b.a(view, R.id.emptyView);
        if (textView != null) {
            i10 = R.id.list_view;
            ListView listView = (ListView) b.a(view, R.id.list_view);
            if (listView != null) {
                i10 = R.id.widget_title;
                TextView textView2 = (TextView) b.a(view, R.id.widget_title);
                if (textView2 != null) {
                    return new WidgetTaskListBinding((LinearLayout) view, textView, listView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static WidgetTaskListBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static WidgetTaskListBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.widget_task_list, viewGroup, false);
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
