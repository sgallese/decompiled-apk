package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import com.habitrpg.android.habitica.R;
import e4.a;
import e4.b;

/* loaded from: classes4.dex */
public final class EmptyViewTimetravelersBinding implements a {
    private final LinearLayout rootView;
    public final Button subscribeButton;

    private EmptyViewTimetravelersBinding(LinearLayout linearLayout, Button button) {
        this.rootView = linearLayout;
        this.subscribeButton = button;
    }

    public static EmptyViewTimetravelersBinding bind(View view) {
        Button button = (Button) b.a(view, R.id.subscribeButton);
        if (button != null) {
            return new EmptyViewTimetravelersBinding((LinearLayout) view, button);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.subscribeButton)));
    }

    public static EmptyViewTimetravelersBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static EmptyViewTimetravelersBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.empty_view_timetravelers, viewGroup, false);
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
