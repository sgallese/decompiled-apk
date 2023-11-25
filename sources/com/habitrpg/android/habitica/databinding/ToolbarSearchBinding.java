package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.SearchView;
import com.habitrpg.android.habitica.R;
import e4.a;

/* loaded from: classes4.dex */
public final class ToolbarSearchBinding implements a {
    private final SearchView rootView;

    private ToolbarSearchBinding(SearchView searchView) {
        this.rootView = searchView;
    }

    public static ToolbarSearchBinding bind(View view) {
        if (view != null) {
            return new ToolbarSearchBinding((SearchView) view);
        }
        throw new NullPointerException("rootView");
    }

    public static ToolbarSearchBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ToolbarSearchBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.toolbar_search, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // e4.a
    public SearchView getRoot() {
        return this.rootView;
    }
}
