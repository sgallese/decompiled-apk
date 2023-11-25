package com.habitrpg.android.habitica.ui.fragments.purchases;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.lifecycle.w;
import com.google.android.material.textfield.TextInputEditText;
import com.habitrpg.android.habitica.data.SocialRepository;
import com.habitrpg.android.habitica.data.UserRepository;
import com.habitrpg.android.habitica.databinding.FragmentGiftGemBalanceBinding;
import com.habitrpg.android.habitica.models.members.Member;
import com.habitrpg.android.habitica.models.user.ContributorInfo;
import com.habitrpg.android.habitica.models.user.Profile;
import com.habitrpg.android.habitica.ui.views.UsernameLabel;
import com.habitrpg.common.habitica.helpers.ExceptionHandlerKt;
import com.habitrpg.common.habitica.views.AvatarView;

/* compiled from: GiftBalanceGemsFragment.kt */
/* loaded from: classes4.dex */
public final class GiftBalanceGemsFragment extends Hilt_GiftBalanceGemsFragment<FragmentGiftGemBalanceBinding> {
    public static final int $stable = 8;
    private FragmentGiftGemBalanceBinding binding;
    private Member giftedMember;
    private boolean isGifting;
    public SocialRepository socialRepository;
    public UserRepository userRepository;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$1(GiftBalanceGemsFragment giftBalanceGemsFragment, View view) {
        qc.q.i(giftBalanceGemsFragment, "this$0");
        giftBalanceGemsFragment.sendGift();
    }

    private final void sendGift() {
        Editable editable;
        String id2;
        androidx.fragment.app.q activity;
        TextInputEditText textInputEditText;
        if (this.isGifting) {
            return;
        }
        setGifting(true);
        try {
            FragmentGiftGemBalanceBinding binding = getBinding();
            if (binding != null && (textInputEditText = binding.giftEditText) != null) {
                editable = textInputEditText.getText();
            } else {
                editable = null;
            }
            String a10 = g.a(String.valueOf(editable));
            qc.q.h(a10, "strip(...)");
            int parseInt = Integer.parseInt(a10);
            Member member = this.giftedMember;
            if (member != null && (id2 = member.getId()) != null && (activity = getActivity()) != null) {
                qc.q.f(activity);
                androidx.lifecycle.q a11 = w.a(activity);
                if (a11 != null) {
                    ExceptionHandlerKt.launchCatching(a11, new GiftBalanceGemsFragment$sendGift$1$1(this), new GiftBalanceGemsFragment$sendGift$1$2(this, id2, parseInt, null));
                }
            }
        } catch (NumberFormatException unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setGifting(boolean z10) {
        Button button;
        int i10;
        this.isGifting = z10;
        FragmentGiftGemBalanceBinding binding = getBinding();
        ProgressBar progressBar = null;
        if (binding != null) {
            button = binding.giftButton;
        } else {
            button = null;
        }
        int i11 = 0;
        if (button != null) {
            if ((!this.isGifting) != false) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            button.setVisibility(i10);
        }
        FragmentGiftGemBalanceBinding binding2 = getBinding();
        if (binding2 != null) {
            progressBar = binding2.progressBar;
        }
        if (progressBar != null) {
            if (!this.isGifting) {
                i11 = 8;
            }
            progressBar.setVisibility(i11);
        }
    }

    private final void updateMemberViews() {
        UsernameLabel usernameLabel;
        UsernameLabel usernameLabel2;
        int i10;
        String str;
        AvatarView avatarView;
        Member member = this.giftedMember;
        if (member == null) {
            return;
        }
        FragmentGiftGemBalanceBinding binding = getBinding();
        TextView textView = null;
        if (binding != null && (avatarView = binding.avatarView) != null) {
            AvatarView.setAvatar$default(avatarView, member, null, 2, null);
        }
        FragmentGiftGemBalanceBinding binding2 = getBinding();
        if (binding2 != null) {
            usernameLabel = binding2.displayNameTextview;
        } else {
            usernameLabel = null;
        }
        if (usernameLabel != null) {
            Profile profile = member.getProfile();
            if (profile != null) {
                str = profile.getName();
            } else {
                str = null;
            }
            usernameLabel.setUsername(str);
        }
        FragmentGiftGemBalanceBinding binding3 = getBinding();
        if (binding3 != null) {
            usernameLabel2 = binding3.displayNameTextview;
        } else {
            usernameLabel2 = null;
        }
        if (usernameLabel2 != null) {
            ContributorInfo contributor = member.getContributor();
            if (contributor != null) {
                i10 = contributor.getLevel();
            } else {
                i10 = 0;
            }
            usernameLabel2.setTier(i10);
        }
        FragmentGiftGemBalanceBinding binding4 = getBinding();
        if (binding4 != null) {
            textView = binding4.usernameTextview;
        }
        if (textView != null) {
            textView.setText(member.getFormattedUsername());
        }
    }

    public final Member getGiftedMember() {
        return this.giftedMember;
    }

    public final SocialRepository getSocialRepository() {
        SocialRepository socialRepository = this.socialRepository;
        if (socialRepository != null) {
            return socialRepository;
        }
        qc.q.z("socialRepository");
        return null;
    }

    public final UserRepository getUserRepository() {
        UserRepository userRepository = this.userRepository;
        if (userRepository != null) {
            return userRepository;
        }
        qc.q.z("userRepository");
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Button button;
        qc.q.i(view, "view");
        super.onViewCreated(view, bundle);
        FragmentGiftGemBalanceBinding binding = getBinding();
        if (binding != null && (button = binding.giftButton) != null) {
            button.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.fragments.purchases.h
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    GiftBalanceGemsFragment.onViewCreated$lambda$1(GiftBalanceGemsFragment.this, view2);
                }
            });
        }
        updateMemberViews();
    }

    @SuppressLint({"SetTextI18n"})
    public final void setGiftedMember(Member member) {
        this.giftedMember = member;
        if (member != null) {
            updateMemberViews();
        }
    }

    public final void setSocialRepository(SocialRepository socialRepository) {
        qc.q.i(socialRepository, "<set-?>");
        this.socialRepository = socialRepository;
    }

    public final void setUserRepository(UserRepository userRepository) {
        qc.q.i(userRepository, "<set-?>");
        this.userRepository = userRepository;
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseFragment
    public FragmentGiftGemBalanceBinding createBinding(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        qc.q.i(layoutInflater, "inflater");
        FragmentGiftGemBalanceBinding inflate = FragmentGiftGemBalanceBinding.inflate(layoutInflater, viewGroup, false);
        qc.q.h(inflate, "inflate(...)");
        return inflate;
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseFragment
    public FragmentGiftGemBalanceBinding getBinding() {
        return this.binding;
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseFragment
    public void setBinding(FragmentGiftGemBalanceBinding fragmentGiftGemBalanceBinding) {
        this.binding = fragmentGiftGemBalanceBinding;
    }
}
