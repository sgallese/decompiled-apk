package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.habitrpg.android.habitica.R;
import e4.a;

/* loaded from: classes4.dex */
public final class PlainListItemBinding implements a {
    private final TextView rootView;
    public final TextView textView;

    private PlainListItemBinding(TextView textView, TextView textView2) {
        this.rootView = textView;
        this.textView = textView2;
    }

    public static PlainListItemBinding bind(View view) {
        if (view != null) {
            TextView textView = (TextView) view;
            return new PlainListItemBinding(textView, textView);
        }
        throw new NullPointerException("rootView");
    }

    public static PlainListItemBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static PlainListItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.plain_list_item, viewGroup, false);
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
