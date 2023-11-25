package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import com.habitrpg.android.habitica.R;
import e4.a;

/* loaded from: classes4.dex */
public final class DialogChallengeFilterGroupItemBinding implements a {
    public final CheckBox challengeFilterGroupCheckbox;
    private final CheckBox rootView;

    private DialogChallengeFilterGroupItemBinding(CheckBox checkBox, CheckBox checkBox2) {
        this.rootView = checkBox;
        this.challengeFilterGroupCheckbox = checkBox2;
    }

    public static DialogChallengeFilterGroupItemBinding bind(View view) {
        if (view != null) {
            CheckBox checkBox = (CheckBox) view;
            return new DialogChallengeFilterGroupItemBinding(checkBox, checkBox);
        }
        throw new NullPointerException("rootView");
    }

    public static DialogChallengeFilterGroupItemBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static DialogChallengeFilterGroupItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.dialog_challenge_filter_group_item, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // e4.a
    public CheckBox getRoot() {
        return this.rootView;
    }
}
