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
public final class PreferenceChildSummaryErrorBinding implements a {
    private final LinearLayout rootView;
    public final TextView title;

    private PreferenceChildSummaryErrorBinding(LinearLayout linearLayout, TextView textView) {
        this.rootView = linearLayout;
        this.title = textView;
    }

    public static PreferenceChildSummaryErrorBinding bind(View view) {
        TextView textView = (TextView) b.a(view, R.id.title);
        if (textView != null) {
            return new PreferenceChildSummaryErrorBinding((LinearLayout) view, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.title)));
    }

    public static PreferenceChildSummaryErrorBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static PreferenceChildSummaryErrorBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.preference_child_summary_error, viewGroup, false);
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
