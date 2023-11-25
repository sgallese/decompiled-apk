package com.habitrpg.android.habitica.ui.fragments.purchases;

import com.habitrpg.android.habitica.data.SocialRepository;
import com.habitrpg.android.habitica.data.TutorialRepository;
import com.habitrpg.android.habitica.ui.fragments.BaseFragment_MembersInjector;

/* loaded from: classes4.dex */
public final class GiftPurchaseGemsFragment_MembersInjector implements qa.a<GiftPurchaseGemsFragment> {
    private final cc.a<SocialRepository> socialRepositoryProvider;
    private final cc.a<TutorialRepository> tutorialRepositoryProvider;

    public GiftPurchaseGemsFragment_MembersInjector(cc.a<TutorialRepository> aVar, cc.a<SocialRepository> aVar2) {
        this.tutorialRepositoryProvider = aVar;
        this.socialRepositoryProvider = aVar2;
    }

    public static qa.a<GiftPurchaseGemsFragment> create(cc.a<TutorialRepository> aVar, cc.a<SocialRepository> aVar2) {
        return new GiftPurchaseGemsFragment_MembersInjector(aVar, aVar2);
    }

    public static void injectSocialRepository(GiftPurchaseGemsFragment giftPurchaseGemsFragment, SocialRepository socialRepository) {
        giftPurchaseGemsFragment.socialRepository = socialRepository;
    }

    public void injectMembers(GiftPurchaseGemsFragment giftPurchaseGemsFragment) {
        BaseFragment_MembersInjector.injectTutorialRepository(giftPurchaseGemsFragment, this.tutorialRepositoryProvider.get());
        injectSocialRepository(giftPurchaseGemsFragment, this.socialRepositoryProvider.get());
    }
}
