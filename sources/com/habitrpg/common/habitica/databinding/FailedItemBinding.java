package com.habitrpg.common.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import com.habitrpg.common.habitica.R;
import e4.a;
import e4.b;

/* loaded from: classes4.dex */
public final class FailedItemBinding implements a {
    public final Button refreshButton;
    private final LinearLayout rootView;

    private FailedItemBinding(LinearLayout linearLayout, Button button) {
        this.rootView = linearLayout;
        this.refreshButton = button;
    }

    public static FailedItemBinding bind(View view) {
        int i10 = R.id.refresh_button;
        Button button = (Button) b.a(view, i10);
        if (button != null) {
            return new FailedItemBinding((LinearLayout) view, button);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static FailedItemBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FailedItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.failed_item, viewGroup, false);
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
