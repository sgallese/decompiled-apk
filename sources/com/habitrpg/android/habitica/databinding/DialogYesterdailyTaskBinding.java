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
public final class DialogYesterdailyTaskBinding implements a {
    public final FrameLayout checkBoxHolder;
    public final View checkboxBackground;
    public final LinearLayout checklistView;
    public final ImageView checkmark;
    private final LinearLayout rootView;
    public final LinearLayout taskHolder;
    public final TextView textView;

    private DialogYesterdailyTaskBinding(LinearLayout linearLayout, FrameLayout frameLayout, View view, LinearLayout linearLayout2, ImageView imageView, LinearLayout linearLayout3, TextView textView) {
        this.rootView = linearLayout;
        this.checkBoxHolder = frameLayout;
        this.checkboxBackground = view;
        this.checklistView = linearLayout2;
        this.checkmark = imageView;
        this.taskHolder = linearLayout3;
        this.textView = textView;
    }

    public static DialogYesterdailyTaskBinding bind(View view) {
        int i10 = R.id.checkBoxHolder;
        FrameLayout frameLayout = (FrameLayout) b.a(view, R.id.checkBoxHolder);
        if (frameLayout != null) {
            i10 = R.id.checkbox_background;
            View a10 = b.a(view, R.id.checkbox_background);
            if (a10 != null) {
                i10 = R.id.checklistView;
                LinearLayout linearLayout = (LinearLayout) b.a(view, R.id.checklistView);
                if (linearLayout != null) {
                    i10 = R.id.checkmark;
                    ImageView imageView = (ImageView) b.a(view, R.id.checkmark);
                    if (imageView != null) {
                        i10 = R.id.taskHolder;
                        LinearLayout linearLayout2 = (LinearLayout) b.a(view, R.id.taskHolder);
                        if (linearLayout2 != null) {
                            i10 = R.id.text_view;
                            TextView textView = (TextView) b.a(view, R.id.text_view);
                            if (textView != null) {
                                return new DialogYesterdailyTaskBinding((LinearLayout) view, frameLayout, a10, linearLayout, imageView, linearLayout2, textView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static DialogYesterdailyTaskBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static DialogYesterdailyTaskBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.dialog_yesterdaily_task, viewGroup, false);
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
