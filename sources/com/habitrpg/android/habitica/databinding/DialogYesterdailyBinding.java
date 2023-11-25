package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.habitrpg.android.habitica.R;
import e4.a;

/* loaded from: classes4.dex */
public final class DialogYesterdailyBinding implements a {
    private final LinearLayout rootView;
    public final LinearLayout yesterdailiesList;

    private DialogYesterdailyBinding(LinearLayout linearLayout, LinearLayout linearLayout2) {
        this.rootView = linearLayout;
        this.yesterdailiesList = linearLayout2;
    }

    public static DialogYesterdailyBinding bind(View view) {
        if (view != null) {
            LinearLayout linearLayout = (LinearLayout) view;
            return new DialogYesterdailyBinding(linearLayout, linearLayout);
        }
        throw new NullPointerException("rootView");
    }

    public static DialogYesterdailyBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static DialogYesterdailyBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.dialog_yesterdaily, viewGroup, false);
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
