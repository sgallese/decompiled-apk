package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.ui.helpers.RecyclerViewEmptySupport;
import e4.a;
import e4.b;

/* loaded from: classes4.dex */
public final class FragmentRefreshRecyclerviewBinding implements a {
    public final RecyclerViewEmptySupport recyclerView;
    public final SwipeRefreshLayout refreshLayout;
    private final LinearLayout rootView;

    private FragmentRefreshRecyclerviewBinding(LinearLayout linearLayout, RecyclerViewEmptySupport recyclerViewEmptySupport, SwipeRefreshLayout swipeRefreshLayout) {
        this.rootView = linearLayout;
        this.recyclerView = recyclerViewEmptySupport;
        this.refreshLayout = swipeRefreshLayout;
    }

    public static FragmentRefreshRecyclerviewBinding bind(View view) {
        int i10 = R.id.recyclerView;
        RecyclerViewEmptySupport recyclerViewEmptySupport = (RecyclerViewEmptySupport) b.a(view, R.id.recyclerView);
        if (recyclerViewEmptySupport != null) {
            i10 = R.id.refreshLayout;
            SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) b.a(view, R.id.refreshLayout);
            if (swipeRefreshLayout != null) {
                return new FragmentRefreshRecyclerviewBinding((LinearLayout) view, recyclerViewEmptySupport, swipeRefreshLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static FragmentRefreshRecyclerviewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentRefreshRecyclerviewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.fragment_refresh_recyclerview, viewGroup, false);
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
