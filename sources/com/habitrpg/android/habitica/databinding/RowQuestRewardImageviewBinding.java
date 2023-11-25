package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.habitrpg.android.habitica.R;
import e4.a;
import e4.b;

/* loaded from: classes4.dex */
public final class RowQuestRewardImageviewBinding implements a {
    public final ImageView imageView;
    private final LinearLayout rootView;
    public final TextView titleTextView;

    private RowQuestRewardImageviewBinding(LinearLayout linearLayout, ImageView imageView, TextView textView) {
        this.rootView = linearLayout;
        this.imageView = imageView;
        this.titleTextView = textView;
    }

    public static RowQuestRewardImageviewBinding bind(View view) {
        int i10 = R.id.imageView;
        ImageView imageView = (ImageView) b.a(view, R.id.imageView);
        if (imageView != null) {
            i10 = R.id.titleTextView;
            TextView textView = (TextView) b.a(view, R.id.titleTextView);
            if (textView != null) {
                return new RowQuestRewardImageviewBinding((LinearLayout) view, imageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static RowQuestRewardImageviewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static RowQuestRewardImageviewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.row_quest_reward_imageview, viewGroup, false);
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
