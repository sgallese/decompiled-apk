package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.habitrpg.android.habitica.R;
import e4.a;

/* loaded from: classes4.dex */
public final class DrawerMainSectionHeaderBinding implements a {
    private final TextView rootView;

    private DrawerMainSectionHeaderBinding(TextView textView) {
        this.rootView = textView;
    }

    public static DrawerMainSectionHeaderBinding bind(View view) {
        if (view != null) {
            return new DrawerMainSectionHeaderBinding((TextView) view);
        }
        throw new NullPointerException("rootView");
    }

    public static DrawerMainSectionHeaderBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static DrawerMainSectionHeaderBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.drawer_main_section_header, viewGroup, false);
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
