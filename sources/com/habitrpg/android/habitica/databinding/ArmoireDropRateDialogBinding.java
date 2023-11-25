package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.habitrpg.android.habitica.R;
import e4.a;

/* loaded from: classes4.dex */
public final class ArmoireDropRateDialogBinding implements a {
    private final LinearLayout rootView;

    private ArmoireDropRateDialogBinding(LinearLayout linearLayout) {
        this.rootView = linearLayout;
    }

    public static ArmoireDropRateDialogBinding bind(View view) {
        if (view != null) {
            return new ArmoireDropRateDialogBinding((LinearLayout) view);
        }
        throw new NullPointerException("rootView");
    }

    public static ArmoireDropRateDialogBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ArmoireDropRateDialogBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.armoire_drop_rate_dialog, viewGroup, false);
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
