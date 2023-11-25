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
public final class SnackbarViewBinding implements a {
    public final LinearLayout contentContainer;
    public final ImageView leftImageView;
    public final ImageView rightIconView;
    public final TextView rightTextView;
    public final LinearLayout rightView;
    private final LinearLayout rootView;
    public final TextView snackbarText;
    public final TextView snackbarTitle;
    public final LinearLayout snackbarView;

    private SnackbarViewBinding(LinearLayout linearLayout, LinearLayout linearLayout2, ImageView imageView, ImageView imageView2, TextView textView, LinearLayout linearLayout3, TextView textView2, TextView textView3, LinearLayout linearLayout4) {
        this.rootView = linearLayout;
        this.contentContainer = linearLayout2;
        this.leftImageView = imageView;
        this.rightIconView = imageView2;
        this.rightTextView = textView;
        this.rightView = linearLayout3;
        this.snackbarText = textView2;
        this.snackbarTitle = textView3;
        this.snackbarView = linearLayout4;
    }

    public static SnackbarViewBinding bind(View view) {
        int i10 = R.id.content_container;
        LinearLayout linearLayout = (LinearLayout) b.a(view, R.id.content_container);
        if (linearLayout != null) {
            i10 = R.id.leftImageView;
            ImageView imageView = (ImageView) b.a(view, R.id.leftImageView);
            if (imageView != null) {
                i10 = R.id.rightIconView;
                ImageView imageView2 = (ImageView) b.a(view, R.id.rightIconView);
                if (imageView2 != null) {
                    i10 = R.id.rightTextView;
                    TextView textView = (TextView) b.a(view, R.id.rightTextView);
                    if (textView != null) {
                        i10 = R.id.rightView;
                        LinearLayout linearLayout2 = (LinearLayout) b.a(view, R.id.rightView);
                        if (linearLayout2 != null) {
                            i10 = R.id.snackbar_text;
                            TextView textView2 = (TextView) b.a(view, R.id.snackbar_text);
                            if (textView2 != null) {
                                i10 = R.id.snackbar_title;
                                TextView textView3 = (TextView) b.a(view, R.id.snackbar_title);
                                if (textView3 != null) {
                                    LinearLayout linearLayout3 = (LinearLayout) view;
                                    return new SnackbarViewBinding(linearLayout3, linearLayout, imageView, imageView2, textView, linearLayout2, textView2, textView3, linearLayout3);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static SnackbarViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static SnackbarViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.snackbar_view, viewGroup, false);
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
