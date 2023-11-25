package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.habitrpg.android.habitica.R;
import e4.a;

/* loaded from: classes4.dex */
public final class SpinnerItemBinding implements a {
    private final TextView rootView;
    public final TextView text1;

    private SpinnerItemBinding(TextView textView, TextView textView2) {
        this.rootView = textView;
        this.text1 = textView2;
    }

    public static SpinnerItemBinding bind(View view) {
        if (view != null) {
            TextView textView = (TextView) view;
            return new SpinnerItemBinding(textView, textView);
        }
        throw new NullPointerException("rootView");
    }

    public static SpinnerItemBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static SpinnerItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.spinner_item, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // e4.a
    public TextView getRoot() {
        return this.rootView;
    }
}
