package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.ui.helpers.RecyclerViewEmptySupport;
import e4.a;

/* loaded from: classes4.dex */
public final class FragmentRecyclerviewBinding implements a {
    public final RecyclerViewEmptySupport recyclerView;
    private final RecyclerViewEmptySupport rootView;

    private FragmentRecyclerviewBinding(RecyclerViewEmptySupport recyclerViewEmptySupport, RecyclerViewEmptySupport recyclerViewEmptySupport2) {
        this.rootView = recyclerViewEmptySupport;
        this.recyclerView = recyclerViewEmptySupport2;
    }

    public static FragmentRecyclerviewBinding bind(View view) {
        if (view != null) {
            RecyclerViewEmptySupport recyclerViewEmptySupport = (RecyclerViewEmptySupport) view;
            return new FragmentRecyclerviewBinding(recyclerViewEmptySupport, recyclerViewEmptySupport);
        }
        throw new NullPointerException("rootView");
    }

    public static FragmentRecyclerviewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentRecyclerviewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.fragment_recyclerview, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // e4.a
    public RecyclerViewEmptySupport getRoot() {
        return this.rootView;
    }
}
