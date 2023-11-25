package com.habitrpg.common.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.habitrpg.common.habitica.R;
import e4.a;
import e4.b;

/* loaded from: classes4.dex */
public final class LoadingItemBinding implements a {
    public final ProgressBar loadingIndicator;
    private final FrameLayout rootView;

    private LoadingItemBinding(FrameLayout frameLayout, ProgressBar progressBar) {
        this.rootView = frameLayout;
        this.loadingIndicator = progressBar;
    }

    public static LoadingItemBinding bind(View view) {
        int i10 = R.id.loading_indicator;
        ProgressBar progressBar = (ProgressBar) b.a(view, i10);
        if (progressBar != null) {
            return new LoadingItemBinding((FrameLayout) view, progressBar);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static LoadingItemBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static LoadingItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.loading_item, viewGroup, false);
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
