package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatButton;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.ui.SpeechBubbleView;
import com.habitrpg.android.habitica.ui.views.setup.AvatarCustomizationDrawer;
import com.habitrpg.common.habitica.views.AvatarView;
import e4.a;
import e4.b;

/* loaded from: classes4.dex */
public final class FragmentSetupAvatarBinding implements a {
    public final ImageView avatarBackground;
    public final AvatarView avatarView;
    public final AvatarCustomizationDrawer customizationDrawer;
    public final AppCompatButton randomizeButton;
    private final LinearLayout rootView;
    public final SpeechBubbleView speechBubble;

    private FragmentSetupAvatarBinding(LinearLayout linearLayout, ImageView imageView, AvatarView avatarView, AvatarCustomizationDrawer avatarCustomizationDrawer, AppCompatButton appCompatButton, SpeechBubbleView speechBubbleView) {
        this.rootView = linearLayout;
        this.avatarBackground = imageView;
        this.avatarView = avatarView;
        this.customizationDrawer = avatarCustomizationDrawer;
        this.randomizeButton = appCompatButton;
        this.speechBubble = speechBubbleView;
    }

    public static FragmentSetupAvatarBinding bind(View view) {
        int i10 = R.id.avatar_background;
        ImageView imageView = (ImageView) b.a(view, R.id.avatar_background);
        if (imageView != null) {
            i10 = R.id.avatarView;
            AvatarView avatarView = (AvatarView) b.a(view, R.id.avatarView);
            if (avatarView != null) {
                i10 = R.id.customization_drawer;
                AvatarCustomizationDrawer avatarCustomizationDrawer = (AvatarCustomizationDrawer) b.a(view, R.id.customization_drawer);
                if (avatarCustomizationDrawer != null) {
                    i10 = R.id.randomize_button;
                    AppCompatButton appCompatButton = (AppCompatButton) b.a(view, R.id.randomize_button);
                    if (appCompatButton != null) {
                        i10 = R.id.speech_bubble;
                        SpeechBubbleView speechBubbleView = (SpeechBubbleView) b.a(view, R.id.speech_bubble);
                        if (speechBubbleView != null) {
                            return new FragmentSetupAvatarBinding((LinearLayout) view, imageView, avatarView, avatarCustomizationDrawer, appCompatButton, speechBubbleView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static FragmentSetupAvatarBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentSetupAvatarBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.fragment_setup_avatar, viewGroup, false);
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
