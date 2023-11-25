package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.ui.views.FadingViewPager;
import com.viewpagerindicator.IconPageIndicator;
import e4.a;
import e4.b;

/* loaded from: classes4.dex */
public final class ActivitySetupBinding implements a {
    public final RelativeLayout bottomBar;
    public final Button nextButton;
    public final Button previousButton;
    private final LinearLayout rootView;
    public final FadingViewPager viewPager;
    public final IconPageIndicator viewPagerIndicator;

    private ActivitySetupBinding(LinearLayout linearLayout, RelativeLayout relativeLayout, Button button, Button button2, FadingViewPager fadingViewPager, IconPageIndicator iconPageIndicator) {
        this.rootView = linearLayout;
        this.bottomBar = relativeLayout;
        this.nextButton = button;
        this.previousButton = button2;
        this.viewPager = fadingViewPager;
        this.viewPagerIndicator = iconPageIndicator;
    }

    public static ActivitySetupBinding bind(View view) {
        int i10 = R.id.bottomBar;
        RelativeLayout relativeLayout = (RelativeLayout) b.a(view, R.id.bottomBar);
        if (relativeLayout != null) {
            i10 = R.id.nextButton;
            Button button = (Button) b.a(view, R.id.nextButton);
            if (button != null) {
                i10 = R.id.previousButton;
                Button button2 = (Button) b.a(view, R.id.previousButton);
                if (button2 != null) {
                    i10 = R.id.viewPager;
                    FadingViewPager fadingViewPager = (FadingViewPager) b.a(view, R.id.viewPager);
                    if (fadingViewPager != null) {
                        i10 = R.id.view_pager_indicator;
                        IconPageIndicator iconPageIndicator = (IconPageIndicator) b.a(view, R.id.view_pager_indicator);
                        if (iconPageIndicator != null) {
                            return new ActivitySetupBinding((LinearLayout) view, relativeLayout, button, button2, fadingViewPager, iconPageIndicator);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static ActivitySetupBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivitySetupBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.activity_setup, viewGroup, false);
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
