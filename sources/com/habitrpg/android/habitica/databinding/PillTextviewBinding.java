package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.habitrpg.android.habitica.R;
import e4.a;

/* loaded from: classes4.dex */
public final class PillTextviewBinding implements a {
    private final TextView rootView;

    private PillTextviewBinding(TextView textView) {
        this.rootView = textView;
    }

    public static PillTextviewBinding bind(View view) {
        if (view != null) {
            return new PillTextviewBinding((TextView) view);
        }
        throw new NullPointerException("rootView");
    }

    public static PillTextviewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static PillTextviewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.pill_textview, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // e4.a
    public TextView getRoot() {
        return this.rootView;
    }
}
