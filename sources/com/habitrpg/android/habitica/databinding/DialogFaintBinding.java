package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.habitrpg.android.habitica.R;
import com.habitrpg.common.habitica.views.AvatarView;
import com.habitrpg.common.habitica.views.ValueBar;
import e4.a;
import e4.b;

/* loaded from: classes4.dex */
public final class DialogFaintBinding implements a {
    public final AvatarView avatarView;
    public final ValueBar hpBar;
    private final LinearLayout rootView;

    private DialogFaintBinding(LinearLayout linearLayout, AvatarView avatarView, ValueBar valueBar) {
        this.rootView = linearLayout;
        this.avatarView = avatarView;
        this.hpBar = valueBar;
    }

    public static DialogFaintBinding bind(View view) {
        int i10 = R.id.avatarView;
        AvatarView avatarView = (AvatarView) b.a(view, R.id.avatarView);
        if (avatarView != null) {
            i10 = R.id.hpBar;
            ValueBar valueBar = (ValueBar) b.a(view, R.id.hpBar);
            if (valueBar != null) {
                return new DialogFaintBinding((LinearLayout) view, avatarView, valueBar);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static DialogFaintBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static DialogFaintBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.dialog_faint, viewGroup, false);
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
