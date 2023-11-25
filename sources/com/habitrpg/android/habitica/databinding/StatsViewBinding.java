package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.habitrpg.android.habitica.R;
import e4.a;
import e4.b;

/* loaded from: classes4.dex */
public final class StatsViewBinding implements a {
    public final ImageButton allocateButton;
    public final TextView allocatedLabelView;
    public final TextView allocatedValueTextView;
    public final LinearLayout allocatedWrapper;
    public final TextView buffValueTextView;
    public final TextView equipmentValueTextView;
    public final TextView levelValueTextView;
    private final LinearLayout rootView;
    public final TextView titleTextView;
    public final LinearLayout titleWrapper;
    public final TextView totalValueTextView;

    private StatsViewBinding(LinearLayout linearLayout, ImageButton imageButton, TextView textView, TextView textView2, LinearLayout linearLayout2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, LinearLayout linearLayout3, TextView textView7) {
        this.rootView = linearLayout;
        this.allocateButton = imageButton;
        this.allocatedLabelView = textView;
        this.allocatedValueTextView = textView2;
        this.allocatedWrapper = linearLayout2;
        this.buffValueTextView = textView3;
        this.equipmentValueTextView = textView4;
        this.levelValueTextView = textView5;
        this.titleTextView = textView6;
        this.titleWrapper = linearLayout3;
        this.totalValueTextView = textView7;
    }

    public static StatsViewBinding bind(View view) {
        int i10 = R.id.allocateButton;
        ImageButton imageButton = (ImageButton) b.a(view, R.id.allocateButton);
        if (imageButton != null) {
            i10 = R.id.allocatedLabelView;
            TextView textView = (TextView) b.a(view, R.id.allocatedLabelView);
            if (textView != null) {
                i10 = R.id.allocatedValueTextView;
                TextView textView2 = (TextView) b.a(view, R.id.allocatedValueTextView);
                if (textView2 != null) {
                    i10 = R.id.allocatedWrapper;
                    LinearLayout linearLayout = (LinearLayout) b.a(view, R.id.allocatedWrapper);
                    if (linearLayout != null) {
                        i10 = R.id.buffValueTextView;
                        TextView textView3 = (TextView) b.a(view, R.id.buffValueTextView);
                        if (textView3 != null) {
                            i10 = R.id.equipmentValueTextView;
                            TextView textView4 = (TextView) b.a(view, R.id.equipmentValueTextView);
                            if (textView4 != null) {
                                i10 = R.id.levelValueTextView;
                                TextView textView5 = (TextView) b.a(view, R.id.levelValueTextView);
                                if (textView5 != null) {
                                    i10 = R.id.titleTextView;
                                    TextView textView6 = (TextView) b.a(view, R.id.titleTextView);
                                    if (textView6 != null) {
                                        i10 = R.id.titleWrapper;
                                        LinearLayout linearLayout2 = (LinearLayout) b.a(view, R.id.titleWrapper);
                                        if (linearLayout2 != null) {
                                            i10 = R.id.totalValueTextView;
                                            TextView textView7 = (TextView) b.a(view, R.id.totalValueTextView);
                                            if (textView7 != null) {
                                                return new StatsViewBinding((LinearLayout) view, imageButton, textView, textView2, linearLayout, textView3, textView4, textView5, textView6, linearLayout2, textView7);
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

    public static StatsViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static StatsViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.stats_view, viewGroup, false);
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
