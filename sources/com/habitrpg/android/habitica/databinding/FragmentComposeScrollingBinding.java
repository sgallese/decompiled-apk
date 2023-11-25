package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.core.widget.NestedScrollView;
import com.habitrpg.android.habitica.R;
import e4.a;
import e4.b;

/* loaded from: classes4.dex */
public final class FragmentComposeScrollingBinding implements a {
    public final ComposeView composeView;
    private final NestedScrollView rootView;

    private FragmentComposeScrollingBinding(NestedScrollView nestedScrollView, ComposeView composeView) {
        this.rootView = nestedScrollView;
        this.composeView = composeView;
    }

    public static FragmentComposeScrollingBinding bind(View view) {
        ComposeView composeView = (ComposeView) b.a(view, R.id.compose_view);
        if (composeView != null) {
            return new FragmentComposeScrollingBinding((NestedScrollView) view, composeView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.compose_view)));
    }

    public static FragmentComposeScrollingBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentComposeScrollingBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.fragment_compose_scrolling, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // e4.a
    public NestedScrollView getRoot() {
        return this.rootView;
    }
}
