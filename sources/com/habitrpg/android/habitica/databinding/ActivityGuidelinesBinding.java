package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.habitrpg.android.habitica.R;
import e4.a;
import e4.b;

/* loaded from: classes4.dex */
public final class ActivityGuidelinesBinding implements a {
    private final LinearLayout rootView;
    public final TextView textView;
    public final Toolbar toolbar;

    private ActivityGuidelinesBinding(LinearLayout linearLayout, TextView textView, Toolbar toolbar) {
        this.rootView = linearLayout;
        this.textView = textView;
        this.toolbar = toolbar;
    }

    public static ActivityGuidelinesBinding bind(View view) {
        int i10 = R.id.text_view;
        TextView textView = (TextView) b.a(view, R.id.text_view);
        if (textView != null) {
            i10 = R.id.toolbar;
            Toolbar toolbar = (Toolbar) b.a(view, R.id.toolbar);
            if (toolbar != null) {
                return new ActivityGuidelinesBinding((LinearLayout) view, textView, toolbar);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static ActivityGuidelinesBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityGuidelinesBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.activity_guidelines, viewGroup, false);
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
