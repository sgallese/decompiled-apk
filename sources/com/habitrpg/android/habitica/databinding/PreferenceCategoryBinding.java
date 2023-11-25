package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.habitrpg.android.habitica.R;
import e4.a;

/* loaded from: classes4.dex */
public final class PreferenceCategoryBinding implements a {
    private final TextView rootView;
    public final TextView title;

    private PreferenceCategoryBinding(TextView textView, TextView textView2) {
        this.rootView = textView;
        this.title = textView2;
    }

    public static PreferenceCategoryBinding bind(View view) {
        if (view != null) {
            TextView textView = (TextView) view;
            return new PreferenceCategoryBinding(textView, textView);
        }
        throw new NullPointerException("rootView");
    }

    public static PreferenceCategoryBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static PreferenceCategoryBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.preference_category, viewGroup, false);
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
