package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import com.habitrpg.android.habitica.R;
import e4.a;
import e4.b;

/* loaded from: classes4.dex */
public final class DailyItemCardBinding implements a {
    public final View checkBoxBackground;
    public final FrameLayout checkBoxHolder;
    public final LinearLayout checklistView;
    public final ImageView checkmark;
    public final ImageButton errorIcon;
    public final ImageView lockView;
    public final LinearLayout mainTaskWrapper;
    private final FrameLayout rootView;
    public final ProgressBar syncingView;

    private DailyItemCardBinding(FrameLayout frameLayout, View view, FrameLayout frameLayout2, LinearLayout linearLayout, ImageView imageView, ImageButton imageButton, ImageView imageView2, LinearLayout linearLayout2, ProgressBar progressBar) {
        this.rootView = frameLayout;
        this.checkBoxBackground = view;
        this.checkBoxHolder = frameLayout2;
        this.checklistView = linearLayout;
        this.checkmark = imageView;
        this.errorIcon = imageButton;
        this.lockView = imageView2;
        this.mainTaskWrapper = linearLayout2;
        this.syncingView = progressBar;
    }

    public static DailyItemCardBinding bind(View view) {
        int i10 = R.id.checkBoxBackground;
        View a10 = b.a(view, R.id.checkBoxBackground);
        if (a10 != null) {
            i10 = R.id.checkBoxHolder;
            FrameLayout frameLayout = (FrameLayout) b.a(view, R.id.checkBoxHolder);
            if (frameLayout != null) {
                i10 = R.id.checklistView;
                LinearLayout linearLayout = (LinearLayout) b.a(view, R.id.checklistView);
                if (linearLayout != null) {
                    i10 = R.id.checkmark;
                    ImageView imageView = (ImageView) b.a(view, R.id.checkmark);
                    if (imageView != null) {
                        i10 = R.id.error_icon;
                        ImageButton imageButton = (ImageButton) b.a(view, R.id.error_icon);
                        if (imageButton != null) {
                            i10 = R.id.lock_view;
                            ImageView imageView2 = (ImageView) b.a(view, R.id.lock_view);
                            if (imageView2 != null) {
                                i10 = R.id.main_task_wrapper;
                                LinearLayout linearLayout2 = (LinearLayout) b.a(view, R.id.main_task_wrapper);
                                if (linearLayout2 != null) {
                                    i10 = R.id.syncing_view;
                                    ProgressBar progressBar = (ProgressBar) b.a(view, R.id.syncing_view);
                                    if (progressBar != null) {
                                        return new DailyItemCardBinding((FrameLayout) view, a10, frameLayout, linearLayout, imageView, imageButton, imageView2, linearLayout2, progressBar);
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

    public static DailyItemCardBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static DailyItemCardBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.daily_item_card, viewGroup, false);
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
