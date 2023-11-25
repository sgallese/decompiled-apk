package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.habitrpg.android.habitica.R;
import e4.a;

/* loaded from: classes4.dex */
public final class EmptyViewSeasonalShopBinding implements a {
    private final LinearLayout rootView;

    private EmptyViewSeasonalShopBinding(LinearLayout linearLayout) {
        this.rootView = linearLayout;
    }

    public static EmptyViewSeasonalShopBinding bind(View view) {
        if (view != null) {
            return new EmptyViewSeasonalShopBinding((LinearLayout) view);
        }
        throw new NullPointerException("rootView");
    }

    public static EmptyViewSeasonalShopBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static EmptyViewSeasonalShopBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.empty_view_seasonal_shop, viewGroup, false);
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
