package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.habitrpg.android.habitica.R;
import e4.a;

/* loaded from: classes4.dex */
public final class CircularProgressBinding implements a {
    private final FrameLayout rootView;

    private CircularProgressBinding(FrameLayout frameLayout) {
        this.rootView = frameLayout;
    }

    public static CircularProgressBinding bind(View view) {
        if (view != null) {
            return new CircularProgressBinding((FrameLayout) view);
        }
        throw new NullPointerException("rootView");
    }

    public static CircularProgressBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static CircularProgressBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.circular_progress, viewGroup, false);
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
