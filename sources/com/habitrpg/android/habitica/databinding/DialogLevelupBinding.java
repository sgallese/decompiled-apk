package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.habitrpg.android.habitica.R;
import com.habitrpg.common.habitica.views.AvatarView;
import e4.a;
import e4.b;

/* loaded from: classes4.dex */
public final class DialogLevelupBinding implements a {
    public final AvatarView avatarView;
    private final LinearLayout rootView;

    private DialogLevelupBinding(LinearLayout linearLayout, AvatarView avatarView) {
        this.rootView = linearLayout;
        this.avatarView = avatarView;
    }

    public static DialogLevelupBinding bind(View view) {
        AvatarView avatarView = (AvatarView) b.a(view, R.id.avatarView);
        if (avatarView != null) {
            return new DialogLevelupBinding((LinearLayout) view, avatarView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.avatarView)));
    }

    public static DialogLevelupBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static DialogLevelupBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.dialog_levelup, viewGroup, false);
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
