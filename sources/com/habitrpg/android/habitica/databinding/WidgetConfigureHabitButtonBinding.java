package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.habitrpg.android.habitica.R;
import e4.a;

/* loaded from: classes4.dex */
public final class WidgetConfigureHabitButtonBinding implements a {
    public final RecyclerView recyclerView;
    private final RecyclerView rootView;

    private WidgetConfigureHabitButtonBinding(RecyclerView recyclerView, RecyclerView recyclerView2) {
        this.rootView = recyclerView;
        this.recyclerView = recyclerView2;
    }

    public static WidgetConfigureHabitButtonBinding bind(View view) {
        if (view != null) {
            RecyclerView recyclerView = (RecyclerView) view;
            return new WidgetConfigureHabitButtonBinding(recyclerView, recyclerView);
        }
        throw new NullPointerException("rootView");
    }

    public static WidgetConfigureHabitButtonBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static WidgetConfigureHabitButtonBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.widget_configure_habit_button, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // e4.a
    public RecyclerView getRoot() {
        return this.rootView;
    }
}
