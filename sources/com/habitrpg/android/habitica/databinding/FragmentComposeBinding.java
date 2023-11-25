package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.habitrpg.android.habitica.R;
import e4.a;

/* loaded from: classes4.dex */
public final class FragmentComposeBinding implements a {
    public final ComposeView composeView;
    private final ComposeView rootView;

    private FragmentComposeBinding(ComposeView composeView, ComposeView composeView2) {
        this.rootView = composeView;
        this.composeView = composeView2;
    }

    public static FragmentComposeBinding bind(View view) {
        if (view != null) {
            ComposeView composeView = (ComposeView) view;
            return new FragmentComposeBinding(composeView, composeView);
        }
        throw new NullPointerException("rootView");
    }

    public static FragmentComposeBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentComposeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.fragment_compose, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // e4.a
    public ComposeView getRoot() {
        return this.rootView;
    }
}
