package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.habitrpg.android.habitica.R;
import com.habitrpg.common.habitica.views.AvatarView;
import e4.a;
import e4.b;

/* loaded from: classes4.dex */
public final class PurchasedEquipDialogBinding implements a {
    public final AvatarView avatarView;
    private final RelativeLayout rootView;

    private PurchasedEquipDialogBinding(RelativeLayout relativeLayout, AvatarView avatarView) {
        this.rootView = relativeLayout;
        this.avatarView = avatarView;
    }

    public static PurchasedEquipDialogBinding bind(View view) {
        AvatarView avatarView = (AvatarView) b.a(view, R.id.avatar_view);
        if (avatarView != null) {
            return new PurchasedEquipDialogBinding((RelativeLayout) view, avatarView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.avatar_view)));
    }

    public static PurchasedEquipDialogBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static PurchasedEquipDialogBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.purchased_equip_dialog, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // e4.a
    public RelativeLayout getRoot() {
        return this.rootView;
    }
}
