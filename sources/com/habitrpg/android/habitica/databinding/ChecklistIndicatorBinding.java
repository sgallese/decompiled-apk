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
public final class ChecklistIndicatorBinding implements a {
    public final TextView checkListAllTextView;
    public final TextView checkListCompletedTextView;
    public final View checklistDivider;
    public final LinearLayout checklistIndicatorWrapper;
    private final LinearLayout rootView;

    private ChecklistIndicatorBinding(LinearLayout linearLayout, TextView textView, TextView textView2, View view, LinearLayout linearLayout2) {
        this.rootView = linearLayout;
        this.checkListAllTextView = textView;
        this.checkListCompletedTextView = textView2;
        this.checklistDivider = view;
        this.checklistIndicatorWrapper = linearLayout2;
    }

    public static ChecklistIndicatorBinding bind(View view) {
        int i10 = R.id.checkListAllTextView;
        TextView textView = (TextView) b.a(view, R.id.checkListAllTextView);
        if (textView != null) {
            i10 = R.id.checkListCompletedTextView;
            TextView textView2 = (TextView) b.a(view, R.id.checkListCompletedTextView);
            if (textView2 != null) {
                i10 = R.id.checklistDivider;
                View a10 = b.a(view, R.id.checklistDivider);
                if (a10 != null) {
                    LinearLayout linearLayout = (LinearLayout) view;
                    return new ChecklistIndicatorBinding(linearLayout, textView, textView2, a10, linearLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static ChecklistIndicatorBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ChecklistIndicatorBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.checklist_indicator, viewGroup, false);
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
