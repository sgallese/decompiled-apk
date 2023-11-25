package com.habitrpg.common.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.habitrpg.common.habitica.R;
import e4.a;
import e4.b;

/* loaded from: classes4.dex */
public final class EmptyItemBinding implements a {
    public final ImageView emptyIconView;
    public final LinearLayout emptyView;
    public final TextView emptyViewDescription;
    public final TextView emptyViewTitle;
    private final LinearLayout rootView;

    private EmptyItemBinding(LinearLayout linearLayout, ImageView imageView, LinearLayout linearLayout2, TextView textView, TextView textView2) {
        this.rootView = linearLayout;
        this.emptyIconView = imageView;
        this.emptyView = linearLayout2;
        this.emptyViewDescription = textView;
        this.emptyViewTitle = textView2;
    }

    public static EmptyItemBinding bind(View view) {
        int i10 = R.id.empty_icon_view;
        ImageView imageView = (ImageView) b.a(view, i10);
        if (imageView != null) {
            LinearLayout linearLayout = (LinearLayout) view;
            i10 = R.id.emptyViewDescription;
            TextView textView = (TextView) b.a(view, i10);
            if (textView != null) {
                i10 = R.id.emptyViewTitle;
                TextView textView2 = (TextView) b.a(view, i10);
                if (textView2 != null) {
                    return new EmptyItemBinding(linearLayout, imageView, linearLayout, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static EmptyItemBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static EmptyItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.empty_item, viewGroup, false);
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
