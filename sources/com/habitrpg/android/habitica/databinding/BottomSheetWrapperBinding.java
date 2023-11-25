package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.habitrpg.android.habitica.R;
import e4.a;
import e4.b;

/* loaded from: classes4.dex */
public final class BottomSheetWrapperBinding implements a {
    public final FrameLayout container;
    public final View grabber;
    private final LinearLayout rootView;

    private BottomSheetWrapperBinding(LinearLayout linearLayout, FrameLayout frameLayout, View view) {
        this.rootView = linearLayout;
        this.container = frameLayout;
        this.grabber = view;
    }

    public static BottomSheetWrapperBinding bind(View view) {
        int i10 = R.id.container;
        FrameLayout frameLayout = (FrameLayout) b.a(view, R.id.container);
        if (frameLayout != null) {
            i10 = R.id.grabber;
            View a10 = b.a(view, R.id.grabber);
            if (a10 != null) {
                return new BottomSheetWrapperBinding((LinearLayout) view, frameLayout, a10);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static BottomSheetWrapperBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static BottomSheetWrapperBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.bottom_sheet_wrapper, viewGroup, false);
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
