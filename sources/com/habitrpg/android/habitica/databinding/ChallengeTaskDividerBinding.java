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
public final class ChallengeTaskDividerBinding implements a {
    public final TextView dividerName;
    private final LinearLayout rootView;

    private ChallengeTaskDividerBinding(LinearLayout linearLayout, TextView textView) {
        this.rootView = linearLayout;
        this.dividerName = textView;
    }

    public static ChallengeTaskDividerBinding bind(View view) {
        TextView textView = (TextView) b.a(view, R.id.divider_name);
        if (textView != null) {
            return new ChallengeTaskDividerBinding((LinearLayout) view, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.divider_name)));
    }

    public static ChallengeTaskDividerBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ChallengeTaskDividerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.challenge_task_divider, viewGroup, false);
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
