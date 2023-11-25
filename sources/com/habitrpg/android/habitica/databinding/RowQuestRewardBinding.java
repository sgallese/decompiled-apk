package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.habitrpg.android.habitica.R;
import com.habitrpg.common.habitica.views.PixelArtView;
import e4.a;
import e4.b;

/* loaded from: classes4.dex */
public final class RowQuestRewardBinding implements a {
    public final PixelArtView imageView;
    private final LinearLayout rootView;
    public final TextView titleTextView;

    private RowQuestRewardBinding(LinearLayout linearLayout, PixelArtView pixelArtView, TextView textView) {
        this.rootView = linearLayout;
        this.imageView = pixelArtView;
        this.titleTextView = textView;
    }

    public static RowQuestRewardBinding bind(View view) {
        int i10 = R.id.imageView;
        PixelArtView pixelArtView = (PixelArtView) b.a(view, R.id.imageView);
        if (pixelArtView != null) {
            i10 = R.id.titleTextView;
            TextView textView = (TextView) b.a(view, R.id.titleTextView);
            if (textView != null) {
                return new RowQuestRewardBinding((LinearLayout) view, pixelArtView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static RowQuestRewardBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static RowQuestRewardBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.row_quest_reward, viewGroup, false);
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
