package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.habitrpg.android.habitica.R;
import e4.a;
import e4.b;

/* loaded from: classes4.dex */
public final class DialogChallengeDetailTaskGroupBinding implements a {
    private final LinearLayout rootView;
    public final TextView taskCountView;
    public final TextView taskGroupName;
    public final LinearLayout tasksLayout;

    private DialogChallengeDetailTaskGroupBinding(LinearLayout linearLayout, TextView textView, TextView textView2, LinearLayout linearLayout2) {
        this.rootView = linearLayout;
        this.taskCountView = textView;
        this.taskGroupName = textView2;
        this.tasksLayout = linearLayout2;
    }

    public static DialogChallengeDetailTaskGroupBinding bind(View view) {
        int i10 = R.id.task_count_view;
        TextView textView = (TextView) b.a(view, R.id.task_count_view);
        if (textView != null) {
            i10 = R.id.task_group_name;
            TextView textView2 = (TextView) b.a(view, R.id.task_group_name);
            if (textView2 != null) {
                i10 = R.id.tasks_layout;
                LinearLayout linearLayout = (LinearLayout) b.a(view, R.id.tasks_layout);
                if (linearLayout != null) {
                    return new DialogChallengeDetailTaskGroupBinding((LinearLayout) view, textView, textView2, linearLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static DialogChallengeDetailTaskGroupBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static DialogChallengeDetailTaskGroupBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.dialog_challenge_detail_task_group, viewGroup, false);
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
