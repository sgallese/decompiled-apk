package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.habitrpg.android.habitica.R;
import e4.a;

/* loaded from: classes4.dex */
public final class KnownIssueBinding implements a {
    private final TextView rootView;

    private KnownIssueBinding(TextView textView) {
        this.rootView = textView;
    }

    public static KnownIssueBinding bind(View view) {
        if (view != null) {
            return new KnownIssueBinding((TextView) view);
        }
        throw new NullPointerException("rootView");
    }

    public static KnownIssueBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static KnownIssueBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.known_issue, viewGroup, false);
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
