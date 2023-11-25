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
public final class ChallengeItemBinding implements a {
    public final TextView challengeName;
    public final TextView challengeShorttext;
    public final ImageView gemIcon;
    public final TextView gemPrizeTextView;
    public final TextView isJoinedLabel;
    public final TextView officialChallengeView;
    public final TextView participantCount;
    private final LinearLayout rootView;

    private ChallengeItemBinding(LinearLayout linearLayout, TextView textView, TextView textView2, ImageView imageView, TextView textView3, TextView textView4, TextView textView5, TextView textView6) {
        this.rootView = linearLayout;
        this.challengeName = textView;
        this.challengeShorttext = textView2;
        this.gemIcon = imageView;
        this.gemPrizeTextView = textView3;
        this.isJoinedLabel = textView4;
        this.officialChallengeView = textView5;
        this.participantCount = textView6;
    }

    public static ChallengeItemBinding bind(View view) {
        int i10 = R.id.challenge_name;
        TextView textView = (TextView) b.a(view, R.id.challenge_name);
        if (textView != null) {
            i10 = R.id.challenge_shorttext;
            TextView textView2 = (TextView) b.a(view, R.id.challenge_shorttext);
            if (textView2 != null) {
                i10 = R.id.gem_icon;
                ImageView imageView = (ImageView) b.a(view, R.id.gem_icon);
                if (imageView != null) {
                    i10 = R.id.gemPrizeTextView;
                    TextView textView3 = (TextView) b.a(view, R.id.gemPrizeTextView);
                    if (textView3 != null) {
                        i10 = R.id.is_joined_label;
                        TextView textView4 = (TextView) b.a(view, R.id.is_joined_label);
                        if (textView4 != null) {
                            i10 = R.id.official_challenge_view;
                            TextView textView5 = (TextView) b.a(view, R.id.official_challenge_view);
                            if (textView5 != null) {
                                i10 = R.id.participantCount;
                                TextView textView6 = (TextView) b.a(view, R.id.participantCount);
                                if (textView6 != null) {
                                    return new ChallengeItemBinding((LinearLayout) view, textView, textView2, imageView, textView3, textView4, textView5, textView6);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static ChallengeItemBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ChallengeItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.challenge_item, viewGroup, false);
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
