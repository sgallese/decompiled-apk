package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import com.habitrpg.android.habitica.R;
import com.habitrpg.common.habitica.views.AvatarView;
import e4.a;
import e4.b;

/* loaded from: classes4.dex */
public final class ViewInvitationBinding implements a {
    public final ImageButton acceptButton;
    public final AvatarView groupleaderAvatarView;
    public final TextView groupleaderTextView;
    public final FrameLayout partyInvitationWrapper;
    public final ImageButton rejectButton;
    private final FrameLayout rootView;

    private ViewInvitationBinding(FrameLayout frameLayout, ImageButton imageButton, AvatarView avatarView, TextView textView, FrameLayout frameLayout2, ImageButton imageButton2) {
        this.rootView = frameLayout;
        this.acceptButton = imageButton;
        this.groupleaderAvatarView = avatarView;
        this.groupleaderTextView = textView;
        this.partyInvitationWrapper = frameLayout2;
        this.rejectButton = imageButton2;
    }

    public static ViewInvitationBinding bind(View view) {
        int i10 = R.id.accept_button;
        ImageButton imageButton = (ImageButton) b.a(view, R.id.accept_button);
        if (imageButton != null) {
            i10 = R.id.groupleader_avatar_view;
            AvatarView avatarView = (AvatarView) b.a(view, R.id.groupleader_avatar_view);
            if (avatarView != null) {
                i10 = R.id.groupleader_text_view;
                TextView textView = (TextView) b.a(view, R.id.groupleader_text_view);
                if (textView != null) {
                    FrameLayout frameLayout = (FrameLayout) view;
                    i10 = R.id.reject_button;
                    ImageButton imageButton2 = (ImageButton) b.a(view, R.id.reject_button);
                    if (imageButton2 != null) {
                        return new ViewInvitationBinding(frameLayout, imageButton, avatarView, textView, frameLayout, imageButton2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static ViewInvitationBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ViewInvitationBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.view_invitation, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // e4.a
    public FrameLayout getRoot() {
        return this.rootView;
    }
}
