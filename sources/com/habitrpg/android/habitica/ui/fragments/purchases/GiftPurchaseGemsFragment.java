package com.habitrpg.android.habitica.ui.fragments.purchases;

import ad.a1;
import ad.l0;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.habitrpg.android.habitica.data.SocialRepository;
import com.habitrpg.android.habitica.databinding.FragmentGiftGemPurchaseBinding;
import com.habitrpg.android.habitica.helpers.PurchaseHandler;
import com.habitrpg.android.habitica.helpers.PurchaseTypes;
import com.habitrpg.android.habitica.models.members.Member;
import com.habitrpg.android.habitica.models.user.ContributorInfo;
import com.habitrpg.android.habitica.models.user.Profile;
import com.habitrpg.android.habitica.ui.GemPurchaseOptionsView;
import com.habitrpg.android.habitica.ui.views.UsernameLabel;
import com.habitrpg.common.habitica.helpers.ExceptionHandler;
import com.habitrpg.common.habitica.views.AvatarView;

/* compiled from: GiftPurchaseGemsFragment.kt */
/* loaded from: classes4.dex */
public final class GiftPurchaseGemsFragment extends Hilt_GiftPurchaseGemsFragment<FragmentGiftGemPurchaseBinding> {
    public static final int $stable = 8;
    private FragmentGiftGemPurchaseBinding binding;
    private Member giftedMember;
    private PurchaseHandler purchaseHandler;
    public SocialRepository socialRepository;

    private final void purchaseGems(com.android.billingclient.api.e eVar) {
        String id2;
        androidx.fragment.app.q activity;
        PurchaseHandler purchaseHandler;
        String str;
        Member member = this.giftedMember;
        if (member != null && (id2 = member.getId()) != null && (activity = getActivity()) != null && (purchaseHandler = this.purchaseHandler) != null) {
            qc.q.f(activity);
            Member member2 = this.giftedMember;
            if (member2 != null) {
                str = member2.getUsername();
            } else {
                str = null;
            }
            PurchaseHandler.purchase$default(purchaseHandler, activity, eVar, id2, str, false, 16, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateButtonLabel(final com.android.billingclient.api.e eVar, String str) {
        String b10 = eVar.b();
        GemPurchaseOptionsView gemPurchaseOptionsView = null;
        switch (b10.hashCode()) {
            case -709112814:
                if (b10.equals(PurchaseTypes.Purchase4Gems)) {
                    FragmentGiftGemPurchaseBinding binding = getBinding();
                    if (binding != null) {
                        gemPurchaseOptionsView = binding.gems4View;
                        break;
                    }
                } else {
                    return;
                }
                break;
            case -614737367:
                if (b10.equals(PurchaseTypes.Purchase21Gems)) {
                    FragmentGiftGemPurchaseBinding binding2 = getBinding();
                    if (binding2 != null) {
                        gemPurchaseOptionsView = binding2.gems21View;
                        break;
                    }
                } else {
                    return;
                }
                break;
            case -556555544:
                if (b10.equals(PurchaseTypes.Purchase42Gems)) {
                    FragmentGiftGemPurchaseBinding binding3 = getBinding();
                    if (binding3 != null) {
                        gemPurchaseOptionsView = binding3.gems42View;
                        break;
                    }
                } else {
                    return;
                }
                break;
            case -440191898:
                if (b10.equals(PurchaseTypes.Purchase84Gems)) {
                    FragmentGiftGemPurchaseBinding binding4 = getBinding();
                    if (binding4 != null) {
                        gemPurchaseOptionsView = binding4.gems84View;
                        break;
                    }
                } else {
                    return;
                }
                break;
            default:
                return;
        }
        if (gemPurchaseOptionsView != null) {
            gemPurchaseOptionsView.setPurchaseButtonText(str);
            gemPurchaseOptionsView.setOnPurchaseClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.fragments.purchases.i
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    GiftPurchaseGemsFragment.updateButtonLabel$lambda$1(GiftPurchaseGemsFragment.this, eVar, view);
                }
            });
            gemPurchaseOptionsView.setSku(eVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateButtonLabel$lambda$1(GiftPurchaseGemsFragment giftPurchaseGemsFragment, com.android.billingclient.api.e eVar, View view) {
        qc.q.i(giftPurchaseGemsFragment, "this$0");
        qc.q.i(eVar, "$sku");
        giftPurchaseGemsFragment.purchaseGems(eVar);
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

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        qc.q.i(view, "view");
        super.onViewCreated(view, bundle);
    }

    @SuppressLint({"SetTextI18n"})
    public final void setGiftedMember(Member member) {
        UsernameLabel usernameLabel;
        UsernameLabel usernameLabel2;
        int i10;
        String str;
        AvatarView avatarView;
        this.giftedMember = member;
        if (member != null) {
            FragmentGiftGemPurchaseBinding binding = getBinding();
            TextView textView = null;
            if (binding != null && (avatarView = binding.avatarView) != null) {
                qc.q.f(avatarView);
                AvatarView.setAvatar$default(avatarView, member, null, 2, null);
            }
            FragmentGiftGemPurchaseBinding binding2 = getBinding();
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
            FragmentGiftGemPurchaseBinding binding3 = getBinding();
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
            FragmentGiftGemPurchaseBinding binding4 = getBinding();
            if (binding4 != null) {
                textView = binding4.usernameTextview;
            }
            if (textView != null) {
                textView.setText("@" + member.getUsername());
            }
        }
    }

    public final void setPurchaseHandler(PurchaseHandler purchaseHandler) {
        this.purchaseHandler = purchaseHandler;
    }

    public final void setSocialRepository(SocialRepository socialRepository) {
        qc.q.i(socialRepository, "<set-?>");
        this.socialRepository = socialRepository;
    }

    public final void setupCheckout() {
        ad.i.d(l0.a(a1.b()), ExceptionHandler.Companion.coroutine$default(ExceptionHandler.Companion, null, 1, null), null, new GiftPurchaseGemsFragment$setupCheckout$1(this, null), 2, null);
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseFragment
    public FragmentGiftGemPurchaseBinding createBinding(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        qc.q.i(layoutInflater, "inflater");
        FragmentGiftGemPurchaseBinding inflate = FragmentGiftGemPurchaseBinding.inflate(layoutInflater, viewGroup, false);
        qc.q.h(inflate, "inflate(...)");
        return inflate;
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseFragment
    public FragmentGiftGemPurchaseBinding getBinding() {
        return this.binding;
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseFragment
    public void setBinding(FragmentGiftGemPurchaseBinding fragmentGiftGemPurchaseBinding) {
        this.binding = fragmentGiftGemPurchaseBinding;
    }
}
