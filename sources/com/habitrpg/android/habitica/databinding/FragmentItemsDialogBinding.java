package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.ui.helpers.RecyclerViewEmptySupport;
import e4.a;
import e4.b;

/* loaded from: classes4.dex */
public final class FragmentItemsDialogBinding implements a {
    public final RecyclerViewEmptySupport recyclerView;
    private final CoordinatorLayout rootView;
    public final TextView titleTextView;

    private FragmentItemsDialogBinding(CoordinatorLayout coordinatorLayout, RecyclerViewEmptySupport recyclerViewEmptySupport, TextView textView) {
        this.rootView = coordinatorLayout;
        this.recyclerView = recyclerViewEmptySupport;
        this.titleTextView = textView;
    }

    public static FragmentItemsDialogBinding bind(View view) {
        int i10 = R.id.recyclerView;
        RecyclerViewEmptySupport recyclerViewEmptySupport = (RecyclerViewEmptySupport) b.a(view, R.id.recyclerView);
        if (recyclerViewEmptySupport != null) {
            i10 = R.id.titleTextView;
            TextView textView = (TextView) b.a(view, R.id.titleTextView);
            if (textView != null) {
                return new FragmentItemsDialogBinding((CoordinatorLayout) view, recyclerViewEmptySupport, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static FragmentItemsDialogBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentItemsDialogBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.fragment_items_dialog, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // e4.a
    public CoordinatorLayout getRoot() {
        return this.rootView;
    }
}
