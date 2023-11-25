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
public final class SkillTaskItemCardBinding implements a {
    public final TextView notesTextView;
    public final View rightBorderView;
    private final LinearLayout rootView;
    public final TextView titleTextView;

    private SkillTaskItemCardBinding(LinearLayout linearLayout, TextView textView, View view, TextView textView2) {
        this.rootView = linearLayout;
        this.notesTextView = textView;
        this.rightBorderView = view;
        this.titleTextView = textView2;
    }

    public static SkillTaskItemCardBinding bind(View view) {
        int i10 = R.id.notesTextView;
        TextView textView = (TextView) b.a(view, R.id.notesTextView);
        if (textView != null) {
            i10 = R.id.rightBorderView;
            View a10 = b.a(view, R.id.rightBorderView);
            if (a10 != null) {
                i10 = R.id.titleTextView;
                TextView textView2 = (TextView) b.a(view, R.id.titleTextView);
                if (textView2 != null) {
                    return new SkillTaskItemCardBinding((LinearLayout) view, textView, a10, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static SkillTaskItemCardBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static SkillTaskItemCardBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.skill_task_item_card, viewGroup, false);
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
