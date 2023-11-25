package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.habitrpg.android.habitica.R;
import e4.a;

/* loaded from: classes4.dex */
public final class AvatarCategoryBinding implements a {
    private final TextView rootView;
    public final TextView textView;

    private AvatarCategoryBinding(TextView textView, TextView textView2) {
        this.rootView = textView;
        this.textView = textView2;
    }

    public static AvatarCategoryBinding bind(View view) {
        if (view != null) {
            TextView textView = (TextView) view;
            return new AvatarCategoryBinding(textView, textView);
        }
        throw new NullPointerException("rootView");
    }

    public static AvatarCategoryBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static AvatarCategoryBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.avatar_category, viewGroup, false);
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
