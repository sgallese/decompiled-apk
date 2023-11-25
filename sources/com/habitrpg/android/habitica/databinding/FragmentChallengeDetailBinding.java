package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.ui.views.UsernameLabel;
import com.habitrpg.common.habitica.views.AvatarView;
import e4.a;
import e4.b;

/* loaded from: classes4.dex */
public final class FragmentChallengeDetailBinding implements a {
    public final LinearLayout challengeCreatorWrapper;
    public final TextView challengeDescription;
    public final TextView challengeName;
    public final AvatarView creatorAvatarview;
    public final UsernameLabel creatorLabel;
    public final TextView gemAmount;
    public final ImageView gemAmountIcon;
    public final Button joinButton;
    public final FrameLayout joinButtonWrapper;
    public final Button leaveButton;
    public final FrameLayout leaveButtonWrapper;
    public final TextView participantCount;
    public final ImageView participantCountIcon;
    private final NestedScrollView rootView;
    public final LinearLayout taskGroupLayout;

    private FragmentChallengeDetailBinding(NestedScrollView nestedScrollView, LinearLayout linearLayout, TextView textView, TextView textView2, AvatarView avatarView, UsernameLabel usernameLabel, TextView textView3, ImageView imageView, Button button, FrameLayout frameLayout, Button button2, FrameLayout frameLayout2, TextView textView4, ImageView imageView2, LinearLayout linearLayout2) {
        this.rootView = nestedScrollView;
        this.challengeCreatorWrapper = linearLayout;
        this.challengeDescription = textView;
        this.challengeName = textView2;
        this.creatorAvatarview = avatarView;
        this.creatorLabel = usernameLabel;
        this.gemAmount = textView3;
        this.gemAmountIcon = imageView;
        this.joinButton = button;
        this.joinButtonWrapper = frameLayout;
        this.leaveButton = button2;
        this.leaveButtonWrapper = frameLayout2;
        this.participantCount = textView4;
        this.participantCountIcon = imageView2;
        this.taskGroupLayout = linearLayout2;
    }

    public static FragmentChallengeDetailBinding bind(View view) {
        int i10 = R.id.challenge_creator_wrapper;
        LinearLayout linearLayout = (LinearLayout) b.a(view, R.id.challenge_creator_wrapper);
        if (linearLayout != null) {
            i10 = R.id.challenge_description;
            TextView textView = (TextView) b.a(view, R.id.challenge_description);
            if (textView != null) {
                i10 = R.id.challenge_name;
                TextView textView2 = (TextView) b.a(view, R.id.challenge_name);
                if (textView2 != null) {
                    i10 = R.id.creator_avatarview;
                    AvatarView avatarView = (AvatarView) b.a(view, R.id.creator_avatarview);
                    if (avatarView != null) {
                        i10 = R.id.creator_label;
                        UsernameLabel usernameLabel = (UsernameLabel) b.a(view, R.id.creator_label);
                        if (usernameLabel != null) {
                            i10 = R.id.gem_amount;
                            TextView textView3 = (TextView) b.a(view, R.id.gem_amount);
                            if (textView3 != null) {
                                i10 = R.id.gem_amount_icon;
                                ImageView imageView = (ImageView) b.a(view, R.id.gem_amount_icon);
                                if (imageView != null) {
                                    i10 = R.id.join_button;
                                    Button button = (Button) b.a(view, R.id.join_button);
                                    if (button != null) {
                                        i10 = R.id.join_button_wrapper;
                                        FrameLayout frameLayout = (FrameLayout) b.a(view, R.id.join_button_wrapper);
                                        if (frameLayout != null) {
                                            i10 = R.id.leave_button;
                                            Button button2 = (Button) b.a(view, R.id.leave_button);
                                            if (button2 != null) {
                                                i10 = R.id.leave_button_wrapper;
                                                FrameLayout frameLayout2 = (FrameLayout) b.a(view, R.id.leave_button_wrapper);
                                                if (frameLayout2 != null) {
                                                    i10 = R.id.participant_count;
                                                    TextView textView4 = (TextView) b.a(view, R.id.participant_count);
                                                    if (textView4 != null) {
                                                        i10 = R.id.participant_count_icon;
                                                        ImageView imageView2 = (ImageView) b.a(view, R.id.participant_count_icon);
                                                        if (imageView2 != null) {
                                                            i10 = R.id.task_group_layout;
                                                            LinearLayout linearLayout2 = (LinearLayout) b.a(view, R.id.task_group_layout);
                                                            if (linearLayout2 != null) {
                                                                return new FragmentChallengeDetailBinding((NestedScrollView) view, linearLayout, textView, textView2, avatarView, usernameLabel, textView3, imageView, button, frameLayout, button2, frameLayout2, textView4, imageView2, linearLayout2);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static FragmentChallengeDetailBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentChallengeDetailBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.fragment_challenge_detail, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // e4.a
    public NestedScrollView getRoot() {
        return this.rootView;
    }
}
