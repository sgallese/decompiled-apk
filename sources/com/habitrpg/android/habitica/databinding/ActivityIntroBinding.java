package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.viewpager.widget.ViewPager;
import com.habitrpg.android.habitica.R;
import com.viewpagerindicator.IconPageIndicator;
import e4.a;
import e4.b;

/* loaded from: classes4.dex */
public final class ActivityIntroBinding implements a {
    public final Button finishButton;
    private final FrameLayout rootView;
    public final Button skipButton;
    public final ViewPager viewPager;
    public final IconPageIndicator viewPagerIndicator;

    private ActivityIntroBinding(FrameLayout frameLayout, Button button, Button button2, ViewPager viewPager, IconPageIndicator iconPageIndicator) {
        this.rootView = frameLayout;
        this.finishButton = button;
        this.skipButton = button2;
        this.viewPager = viewPager;
        this.viewPagerIndicator = iconPageIndicator;
    }

    public static ActivityIntroBinding bind(View view) {
        int i10 = R.id.finishButton;
        Button button = (Button) b.a(view, R.id.finishButton);
        if (button != null) {
            i10 = R.id.skipButton;
            Button button2 = (Button) b.a(view, R.id.skipButton);
            if (button2 != null) {
                i10 = R.id.viewPager;
                ViewPager viewPager = (ViewPager) b.a(view, R.id.viewPager);
                if (viewPager != null) {
                    i10 = R.id.view_pager_indicator;
                    IconPageIndicator iconPageIndicator = (IconPageIndicator) b.a(view, R.id.view_pager_indicator);
                    if (iconPageIndicator != null) {
                        return new ActivityIntroBinding((FrameLayout) view, button, button2, viewPager, iconPageIndicator);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static ActivityIntroBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityIntroBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.activity_intro, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // e4.a
    public FrameLayout getRoot() {
        return this.rootView;
    }
}
