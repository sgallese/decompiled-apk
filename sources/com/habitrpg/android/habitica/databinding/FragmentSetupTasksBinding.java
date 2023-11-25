package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.ui.SpeechBubbleView;
import com.habitrpg.common.habitica.views.AvatarView;
import e4.a;
import e4.b;

/* loaded from: classes4.dex */
public final class FragmentSetupTasksBinding implements a {
    public final ImageView avatarBackground;
    public final AvatarView avatarView;
    public final ImageView heartIcon;
    public final RecyclerView recyclerView;
    private final LinearLayout rootView;
    public final SpeechBubbleView speechBubble;

    private FragmentSetupTasksBinding(LinearLayout linearLayout, ImageView imageView, AvatarView avatarView, ImageView imageView2, RecyclerView recyclerView, SpeechBubbleView speechBubbleView) {
        this.rootView = linearLayout;
        this.avatarBackground = imageView;
        this.avatarView = avatarView;
        this.heartIcon = imageView2;
        this.recyclerView = recyclerView;
        this.speechBubble = speechBubbleView;
    }

    public static FragmentSetupTasksBinding bind(View view) {
        int i10 = R.id.avatar_background;
        ImageView imageView = (ImageView) b.a(view, R.id.avatar_background);
        if (imageView != null) {
            i10 = R.id.avatarView;
            AvatarView avatarView = (AvatarView) b.a(view, R.id.avatarView);
            if (avatarView != null) {
                i10 = R.id.heart_icon;
                ImageView imageView2 = (ImageView) b.a(view, R.id.heart_icon);
                if (imageView2 != null) {
                    i10 = R.id.recyclerView;
                    RecyclerView recyclerView = (RecyclerView) b.a(view, R.id.recyclerView);
                    if (recyclerView != null) {
                        i10 = R.id.speech_bubble;
                        SpeechBubbleView speechBubbleView = (SpeechBubbleView) b.a(view, R.id.speech_bubble);
                        if (speechBubbleView != null) {
                            return new FragmentSetupTasksBinding((LinearLayout) view, imageView, avatarView, imageView2, recyclerView, speechBubbleView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static FragmentSetupTasksBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentSetupTasksBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.fragment_setup_tasks, viewGroup, false);
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
