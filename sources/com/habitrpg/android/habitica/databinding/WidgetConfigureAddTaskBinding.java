package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.habitrpg.android.habitica.R;
import e4.a;
import e4.b;

/* loaded from: classes4.dex */
public final class WidgetConfigureAddTaskBinding implements a {
    public final LinearLayout addDailyButton;
    public final LinearLayout addHabitButton;
    public final LinearLayout addRewardButton;
    public final LinearLayout addTodoButton;
    private final LinearLayout rootView;

    private WidgetConfigureAddTaskBinding(LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, LinearLayout linearLayout5) {
        this.rootView = linearLayout;
        this.addDailyButton = linearLayout2;
        this.addHabitButton = linearLayout3;
        this.addRewardButton = linearLayout4;
        this.addTodoButton = linearLayout5;
    }

    public static WidgetConfigureAddTaskBinding bind(View view) {
        int i10 = R.id.add_daily_button;
        LinearLayout linearLayout = (LinearLayout) b.a(view, R.id.add_daily_button);
        if (linearLayout != null) {
            i10 = R.id.add_habit_button;
            LinearLayout linearLayout2 = (LinearLayout) b.a(view, R.id.add_habit_button);
            if (linearLayout2 != null) {
                i10 = R.id.add_reward_button;
                LinearLayout linearLayout3 = (LinearLayout) b.a(view, R.id.add_reward_button);
                if (linearLayout3 != null) {
                    i10 = R.id.add_todo_button;
                    LinearLayout linearLayout4 = (LinearLayout) b.a(view, R.id.add_todo_button);
                    if (linearLayout4 != null) {
                        return new WidgetConfigureAddTaskBinding((LinearLayout) view, linearLayout, linearLayout2, linearLayout3, linearLayout4);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static WidgetConfigureAddTaskBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static WidgetConfigureAddTaskBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.widget_configure_add_task, viewGroup, false);
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
