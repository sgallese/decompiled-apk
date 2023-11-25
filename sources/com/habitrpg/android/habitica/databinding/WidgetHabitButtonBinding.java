package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.habitrpg.android.habitica.R;
import e4.a;
import e4.b;

/* loaded from: classes4.dex */
public final class WidgetHabitButtonBinding implements a {
    public final ImageView btnMinus;
    public final FrameLayout btnMinusWrapper;
    public final ImageView btnPlus;
    public final FrameLayout btnPlusWrapper;
    public final TextView habitTitle;
    private final LinearLayout rootView;
    public final LinearLayout widget;

    private WidgetHabitButtonBinding(LinearLayout linearLayout, ImageView imageView, FrameLayout frameLayout, ImageView imageView2, FrameLayout frameLayout2, TextView textView, LinearLayout linearLayout2) {
        this.rootView = linearLayout;
        this.btnMinus = imageView;
        this.btnMinusWrapper = frameLayout;
        this.btnPlus = imageView2;
        this.btnPlusWrapper = frameLayout2;
        this.habitTitle = textView;
        this.widget = linearLayout2;
    }

    public static WidgetHabitButtonBinding bind(View view) {
        int i10 = R.id.btnMinus;
        ImageView imageView = (ImageView) b.a(view, R.id.btnMinus);
        if (imageView != null) {
            i10 = R.id.btnMinusWrapper;
            FrameLayout frameLayout = (FrameLayout) b.a(view, R.id.btnMinusWrapper);
            if (frameLayout != null) {
                i10 = R.id.btnPlus;
                ImageView imageView2 = (ImageView) b.a(view, R.id.btnPlus);
                if (imageView2 != null) {
                    i10 = R.id.btnPlusWrapper;
                    FrameLayout frameLayout2 = (FrameLayout) b.a(view, R.id.btnPlusWrapper);
                    if (frameLayout2 != null) {
                        i10 = R.id.habit_title;
                        TextView textView = (TextView) b.a(view, R.id.habit_title);
                        if (textView != null) {
                            LinearLayout linearLayout = (LinearLayout) view;
                            return new WidgetHabitButtonBinding(linearLayout, imageView, frameLayout, imageView2, frameLayout2, textView, linearLayout);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static WidgetHabitButtonBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static WidgetHabitButtonBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.widget_habit_button, viewGroup, false);
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
