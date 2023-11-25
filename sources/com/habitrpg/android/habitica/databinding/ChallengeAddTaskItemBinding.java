package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.material.button.MaterialButton;
import com.habitrpg.android.habitica.R;
import e4.a;
import e4.b;

/* loaded from: classes4.dex */
public final class ChallengeAddTaskItemBinding implements a {
    public final MaterialButton btnAddTask;
    private final LinearLayout rootView;

    private ChallengeAddTaskItemBinding(LinearLayout linearLayout, MaterialButton materialButton) {
        this.rootView = linearLayout;
        this.btnAddTask = materialButton;
    }

    public static ChallengeAddTaskItemBinding bind(View view) {
        MaterialButton materialButton = (MaterialButton) b.a(view, R.id.btn_add_task);
        if (materialButton != null) {
            return new ChallengeAddTaskItemBinding((LinearLayout) view, materialButton);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.btn_add_task)));
    }

    public static ChallengeAddTaskItemBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ChallengeAddTaskItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.challenge_add_task_item, viewGroup, false);
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
