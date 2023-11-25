package com.habitrpg.common.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.habitrpg.common.habitica.R;
import com.habitrpg.common.habitica.views.HabiticaProgressBar;
import e4.a;
import e4.b;

/* loaded from: classes4.dex */
public final class ValueBarBinding implements a {
    public final ImageView descriptionIconView;
    public final TextView descriptionTextView;
    public final ImageView iconView;
    public final LinearLayout labelWrapper;
    public final HabiticaProgressBar progressBar;
    private final RelativeLayout rootView;
    public final ImageView secondaryIconView;
    public final TextView valueTextView;

    private ValueBarBinding(RelativeLayout relativeLayout, ImageView imageView, TextView textView, ImageView imageView2, LinearLayout linearLayout, HabiticaProgressBar habiticaProgressBar, ImageView imageView3, TextView textView2) {
        this.rootView = relativeLayout;
        this.descriptionIconView = imageView;
        this.descriptionTextView = textView;
        this.iconView = imageView2;
        this.labelWrapper = linearLayout;
        this.progressBar = habiticaProgressBar;
        this.secondaryIconView = imageView3;
        this.valueTextView = textView2;
    }

    public static ValueBarBinding bind(View view) {
        int i10 = R.id.description_icon_view;
        ImageView imageView = (ImageView) b.a(view, i10);
        if (imageView != null) {
            i10 = R.id.description_text_view;
            TextView textView = (TextView) b.a(view, i10);
            if (textView != null) {
                i10 = R.id.icon_view;
                ImageView imageView2 = (ImageView) b.a(view, i10);
                if (imageView2 != null) {
                    i10 = R.id.labelWrapper;
                    LinearLayout linearLayout = (LinearLayout) b.a(view, i10);
                    if (linearLayout != null) {
                        i10 = R.id.progressBar;
                        HabiticaProgressBar habiticaProgressBar = (HabiticaProgressBar) b.a(view, i10);
                        if (habiticaProgressBar != null) {
                            i10 = R.id.secondaryIconView;
                            ImageView imageView3 = (ImageView) b.a(view, i10);
                            if (imageView3 != null) {
                                i10 = R.id.value_text_view;
                                TextView textView2 = (TextView) b.a(view, i10);
                                if (textView2 != null) {
                                    return new ValueBarBinding((RelativeLayout) view, imageView, textView, imageView2, linearLayout, habiticaProgressBar, imageView3, textView2);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static ValueBarBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ValueBarBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.value_bar, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // e4.a
    public RelativeLayout getRoot() {
        return this.rootView;
    }
}
