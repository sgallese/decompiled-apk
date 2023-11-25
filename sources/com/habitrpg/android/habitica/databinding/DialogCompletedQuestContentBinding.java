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
public final class DialogCompletedQuestContentBinding implements a {
    public final PixelArtView imageView;
    public final TextView notesTextView;
    public final LinearLayout ownerRewardsList;
    public final TextView ownerRewardsTitle;
    public final LinearLayout rewardsList;
    private final View rootView;
    public final TextView titleTextView;

    private DialogCompletedQuestContentBinding(View view, PixelArtView pixelArtView, TextView textView, LinearLayout linearLayout, TextView textView2, LinearLayout linearLayout2, TextView textView3) {
        this.rootView = view;
        this.imageView = pixelArtView;
        this.notesTextView = textView;
        this.ownerRewardsList = linearLayout;
        this.ownerRewardsTitle = textView2;
        this.rewardsList = linearLayout2;
        this.titleTextView = textView3;
    }

    public static DialogCompletedQuestContentBinding bind(View view) {
        int i10 = R.id.imageView;
        PixelArtView pixelArtView = (PixelArtView) b.a(view, R.id.imageView);
        if (pixelArtView != null) {
            i10 = R.id.notesTextView;
            TextView textView = (TextView) b.a(view, R.id.notesTextView);
            if (textView != null) {
                i10 = R.id.ownerRewardsList;
                LinearLayout linearLayout = (LinearLayout) b.a(view, R.id.ownerRewardsList);
                if (linearLayout != null) {
                    i10 = R.id.ownerRewardsTitle;
                    TextView textView2 = (TextView) b.a(view, R.id.ownerRewardsTitle);
                    if (textView2 != null) {
                        i10 = R.id.rewardsList;
                        LinearLayout linearLayout2 = (LinearLayout) b.a(view, R.id.rewardsList);
                        if (linearLayout2 != null) {
                            i10 = R.id.titleTextView;
                            TextView textView3 = (TextView) b.a(view, R.id.titleTextView);
                            if (textView3 != null) {
                                return new DialogCompletedQuestContentBinding(view, pixelArtView, textView, linearLayout, textView2, linearLayout2, textView3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static DialogCompletedQuestContentBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.dialog_completed_quest_content, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // e4.a
    public View getRoot() {
        return this.rootView;
    }
}
