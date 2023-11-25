package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.habitrpg.android.habitica.R;
import e4.a;
import e4.b;

/* loaded from: classes4.dex */
public final class FilterMenuItemBinding implements a {
    public final TextView badgeTextview;
    private final RelativeLayout rootView;

    private FilterMenuItemBinding(RelativeLayout relativeLayout, TextView textView) {
        this.rootView = relativeLayout;
        this.badgeTextview = textView;
    }

    public static FilterMenuItemBinding bind(View view) {
        TextView textView = (TextView) b.a(view, R.id.badge_textview);
        if (textView != null) {
            return new FilterMenuItemBinding((RelativeLayout) view, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.badge_textview)));
    }

    public static FilterMenuItemBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FilterMenuItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.filter_menu_item, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // e4.a
    public RelativeLayout getRoot() {
        return this.rootView;
    }
}
