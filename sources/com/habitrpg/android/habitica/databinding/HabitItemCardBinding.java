package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import com.habitrpg.android.habitica.R;
import e4.a;
import e4.b;

/* loaded from: classes4.dex */
public final class HabitItemCardBinding implements a {
    public final Button btnMinus;
    public final ImageView btnMinusIconView;
    public final FrameLayout btnMinusWrapper;
    public final Button btnPlus;
    public final ImageView btnPlusIconView;
    public final FrameLayout btnPlusWrapper;
    public final View buttonMinusCircleView;
    public final View buttonPlusCircleView;
    public final ImageButton errorIcon;
    public final LinearLayout mainTaskWrapper;
    private final FrameLayout rootView;
    public final ProgressBar syncingView;

    private HabitItemCardBinding(FrameLayout frameLayout, Button button, ImageView imageView, FrameLayout frameLayout2, Button button2, ImageView imageView2, FrameLayout frameLayout3, View view, View view2, ImageButton imageButton, LinearLayout linearLayout, ProgressBar progressBar) {
        this.rootView = frameLayout;
        this.btnMinus = button;
        this.btnMinusIconView = imageView;
        this.btnMinusWrapper = frameLayout2;
        this.btnPlus = button2;
        this.btnPlusIconView = imageView2;
        this.btnPlusWrapper = frameLayout3;
        this.buttonMinusCircleView = view;
        this.buttonPlusCircleView = view2;
        this.errorIcon = imageButton;
        this.mainTaskWrapper = linearLayout;
        this.syncingView = progressBar;
    }

    public static HabitItemCardBinding bind(View view) {
        int i10 = R.id.btnMinus;
        Button button = (Button) b.a(view, R.id.btnMinus);
        if (button != null) {
            i10 = R.id.btnMinusIconView;
            ImageView imageView = (ImageView) b.a(view, R.id.btnMinusIconView);
            if (imageView != null) {
                i10 = R.id.btnMinusWrapper;
                FrameLayout frameLayout = (FrameLayout) b.a(view, R.id.btnMinusWrapper);
                if (frameLayout != null) {
                    i10 = R.id.btnPlus;
                    Button button2 = (Button) b.a(view, R.id.btnPlus);
                    if (button2 != null) {
                        i10 = R.id.btnPlusIconView;
                        ImageView imageView2 = (ImageView) b.a(view, R.id.btnPlusIconView);
                        if (imageView2 != null) {
                            i10 = R.id.btnPlusWrapper;
                            FrameLayout frameLayout2 = (FrameLayout) b.a(view, R.id.btnPlusWrapper);
                            if (frameLayout2 != null) {
                                i10 = R.id.button_minus_circle_view;
                                View a10 = b.a(view, R.id.button_minus_circle_view);
                                if (a10 != null) {
                                    i10 = R.id.button_plus_circle_view;
                                    View a11 = b.a(view, R.id.button_plus_circle_view);
                                    if (a11 != null) {
                                        i10 = R.id.error_icon;
                                        ImageButton imageButton = (ImageButton) b.a(view, R.id.error_icon);
                                        if (imageButton != null) {
                                            i10 = R.id.main_task_wrapper;
                                            LinearLayout linearLayout = (LinearLayout) b.a(view, R.id.main_task_wrapper);
                                            if (linearLayout != null) {
                                                i10 = R.id.syncing_view;
                                                ProgressBar progressBar = (ProgressBar) b.a(view, R.id.syncing_view);
                                                if (progressBar != null) {
                                                    return new HabitItemCardBinding((FrameLayout) view, button, imageView, frameLayout, button2, imageView2, frameLayout2, a10, a11, imageButton, linearLayout, progressBar);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static HabitItemCardBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static HabitItemCardBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.habit_item_card, viewGroup, false);
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
