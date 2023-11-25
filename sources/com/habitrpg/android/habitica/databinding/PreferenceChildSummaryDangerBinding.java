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
public final class PreferenceChildSummaryDangerBinding implements a {
    private final LinearLayout rootView;
    public final TextView summary;
    public final TextView title;
    public final LinearLayout widgetFrame;

    private PreferenceChildSummaryDangerBinding(LinearLayout linearLayout, TextView textView, TextView textView2, LinearLayout linearLayout2) {
        this.rootView = linearLayout;
        this.summary = textView;
        this.title = textView2;
        this.widgetFrame = linearLayout2;
    }

    public static PreferenceChildSummaryDangerBinding bind(View view) {
        int i10 = 16908304;
        TextView textView = (TextView) b.a(view, 16908304);
        if (textView != null) {
            i10 = 16908310;
            TextView textView2 = (TextView) b.a(view, 16908310);
            if (textView2 != null) {
                i10 = 16908312;
                LinearLayout linearLayout = (LinearLayout) b.a(view, 16908312);
                if (linearLayout != null) {
                    return new PreferenceChildSummaryDangerBinding((LinearLayout) view, textView, textView2, linearLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static PreferenceChildSummaryDangerBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static PreferenceChildSummaryDangerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.preference_child_summary_danger, viewGroup, false);
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
