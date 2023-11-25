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
public final class PreferenceButtonBinding implements a {
    public final TextView extraLabel;
    private final LinearLayout rootView;
    public final TextView summary;
    public final TextView title;

    private PreferenceButtonBinding(LinearLayout linearLayout, TextView textView, TextView textView2, TextView textView3) {
        this.rootView = linearLayout;
        this.extraLabel = textView;
        this.summary = textView2;
        this.title = textView3;
    }

    public static PreferenceButtonBinding bind(View view) {
        int i10 = R.id.extra_label;
        TextView textView = (TextView) b.a(view, R.id.extra_label);
        if (textView != null) {
            i10 = 16908304;
            TextView textView2 = (TextView) b.a(view, 16908304);
            if (textView2 != null) {
                i10 = 16908310;
                TextView textView3 = (TextView) b.a(view, 16908310);
                if (textView3 != null) {
                    return new PreferenceButtonBinding((LinearLayout) view, textView, textView2, textView3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static PreferenceButtonBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static PreferenceButtonBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.preference_button, viewGroup, false);
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
