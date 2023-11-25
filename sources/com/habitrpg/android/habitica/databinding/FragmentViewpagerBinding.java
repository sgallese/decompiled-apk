package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager2.widget.ViewPager2;
import com.habitrpg.android.habitica.R;
import e4.a;

/* loaded from: classes4.dex */
public final class FragmentViewpagerBinding implements a {
    private final ViewPager2 rootView;
    public final ViewPager2 viewPager;

    private FragmentViewpagerBinding(ViewPager2 viewPager2, ViewPager2 viewPager22) {
        this.rootView = viewPager2;
        this.viewPager = viewPager22;
    }

    public static FragmentViewpagerBinding bind(View view) {
        if (view != null) {
            ViewPager2 viewPager2 = (ViewPager2) view;
            return new FragmentViewpagerBinding(viewPager2, viewPager2);
        }
        throw new NullPointerException("rootView");
    }

    public static FragmentViewpagerBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentViewpagerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.fragment_viewpager, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // e4.a
    public ViewPager2 getRoot() {
        return this.rootView;
    }
}
