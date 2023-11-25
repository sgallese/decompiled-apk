package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.ui.views.stats.StatsSliderView;
import e4.a;
import e4.b;

/* loaded from: classes4.dex */
public final class DialogBulkAllocateBinding implements a {
    public final TextView allocatedTitle;
    public final StatsSliderView constitutionSliderView;
    public final StatsSliderView intelligenceSliderView;
    public final StatsSliderView perceptionSliderView;
    private final LinearLayout rootView;
    public final StatsSliderView strengthSliderView;
    public final LinearLayout titleView;

    private DialogBulkAllocateBinding(LinearLayout linearLayout, TextView textView, StatsSliderView statsSliderView, StatsSliderView statsSliderView2, StatsSliderView statsSliderView3, StatsSliderView statsSliderView4, LinearLayout linearLayout2) {
        this.rootView = linearLayout;
        this.allocatedTitle = textView;
        this.constitutionSliderView = statsSliderView;
        this.intelligenceSliderView = statsSliderView2;
        this.perceptionSliderView = statsSliderView3;
        this.strengthSliderView = statsSliderView4;
        this.titleView = linearLayout2;
    }

    public static DialogBulkAllocateBinding bind(View view) {
        int i10 = R.id.allocatedTitle;
        TextView textView = (TextView) b.a(view, R.id.allocatedTitle);
        if (textView != null) {
            i10 = R.id.constitutionSliderView;
            StatsSliderView statsSliderView = (StatsSliderView) b.a(view, R.id.constitutionSliderView);
            if (statsSliderView != null) {
                i10 = R.id.intelligenceSliderView;
                StatsSliderView statsSliderView2 = (StatsSliderView) b.a(view, R.id.intelligenceSliderView);
                if (statsSliderView2 != null) {
                    i10 = R.id.perceptionSliderView;
                    StatsSliderView statsSliderView3 = (StatsSliderView) b.a(view, R.id.perceptionSliderView);
                    if (statsSliderView3 != null) {
                        i10 = R.id.strengthSliderView;
                        StatsSliderView statsSliderView4 = (StatsSliderView) b.a(view, R.id.strengthSliderView);
                        if (statsSliderView4 != null) {
                            i10 = R.id.titleView;
                            LinearLayout linearLayout = (LinearLayout) b.a(view, R.id.titleView);
                            if (linearLayout != null) {
                                return new DialogBulkAllocateBinding((LinearLayout) view, textView, statsSliderView, statsSliderView2, statsSliderView3, statsSliderView4, linearLayout);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static DialogBulkAllocateBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static DialogBulkAllocateBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.dialog_bulk_allocate, viewGroup, false);
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
