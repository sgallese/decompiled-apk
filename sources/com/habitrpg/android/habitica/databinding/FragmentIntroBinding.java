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
public final class FragmentIntroBinding implements a {
    public final LinearLayout containerView;
    public final TextView descriptionTextView;
    public final ImageView imageView;
    private final LinearLayout rootView;
    public final TextView subtitleTextView;
    public final ImageView titleImageView;
    public final TextView titleTextView;

    private FragmentIntroBinding(LinearLayout linearLayout, LinearLayout linearLayout2, TextView textView, ImageView imageView, TextView textView2, ImageView imageView2, TextView textView3) {
        this.rootView = linearLayout;
        this.containerView = linearLayout2;
        this.descriptionTextView = textView;
        this.imageView = imageView;
        this.subtitleTextView = textView2;
        this.titleImageView = imageView2;
        this.titleTextView = textView3;
    }

    public static FragmentIntroBinding bind(View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i10 = R.id.descriptionTextView;
        TextView textView = (TextView) b.a(view, R.id.descriptionTextView);
        if (textView != null) {
            i10 = R.id.imageView;
            ImageView imageView = (ImageView) b.a(view, R.id.imageView);
            if (imageView != null) {
                i10 = R.id.subtitleTextView;
                TextView textView2 = (TextView) b.a(view, R.id.subtitleTextView);
                if (textView2 != null) {
                    i10 = R.id.titleImageView;
                    ImageView imageView2 = (ImageView) b.a(view, R.id.titleImageView);
                    if (imageView2 != null) {
                        i10 = R.id.titleTextView;
                        TextView textView3 = (TextView) b.a(view, R.id.titleTextView);
                        if (textView3 != null) {
                            return new FragmentIntroBinding(linearLayout, linearLayout, textView, imageView, textView2, imageView2, textView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static FragmentIntroBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentIntroBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.fragment_intro, viewGroup, false);
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
