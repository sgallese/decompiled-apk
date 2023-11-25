package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.habitrpg.android.habitica.R;
import e4.a;
import e4.b;

/* loaded from: classes4.dex */
public final class SimpleTextviewBinding implements a {
    private final FrameLayout rootView;
    public final TextView textView;

    private SimpleTextviewBinding(FrameLayout frameLayout, TextView textView) {
        this.rootView = frameLayout;
        this.textView = textView;
    }

    public static SimpleTextviewBinding bind(View view) {
        TextView textView = (TextView) b.a(view, R.id.textView);
        if (textView != null) {
            return new SimpleTextviewBinding((FrameLayout) view, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.textView)));
    }

    public static SimpleTextviewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static SimpleTextviewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.simple_textview, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // e4.a
    public FrameLayout getRoot() {
        return this.rootView;
    }
}
