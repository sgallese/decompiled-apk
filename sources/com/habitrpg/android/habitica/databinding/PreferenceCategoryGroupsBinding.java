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
public final class PreferenceCategoryGroupsBinding implements a {
    private final LinearLayout rootView;
    public final TextView title;

    private PreferenceCategoryGroupsBinding(LinearLayout linearLayout, TextView textView) {
        this.rootView = linearLayout;
        this.title = textView;
    }

    public static PreferenceCategoryGroupsBinding bind(View view) {
        TextView textView = (TextView) b.a(view, 16908310);
        if (textView != null) {
            return new PreferenceCategoryGroupsBinding((LinearLayout) view, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(16908310)));
    }

    public static PreferenceCategoryGroupsBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static PreferenceCategoryGroupsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.preference_category_groups, viewGroup, false);
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
