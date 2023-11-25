package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.habitrpg.android.habitica.R;
import e4.a;

/* loaded from: classes4.dex */
public final class PreferenceGroupFooterBinding implements a {
    private final TextView rootView;
    public final TextView title;

    private PreferenceGroupFooterBinding(TextView textView, TextView textView2) {
        this.rootView = textView;
        this.title = textView2;
    }

    public static PreferenceGroupFooterBinding bind(View view) {
        if (view != null) {
            TextView textView = (TextView) view;
            return new PreferenceGroupFooterBinding(textView, textView);
        }
        throw new NullPointerException("rootView");
    }

    public static PreferenceGroupFooterBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static PreferenceGroupFooterBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.preference_group_footer, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // e4.a
    public TextView getRoot() {
        return this.rootView;
    }
}
