package com.habitrpg.android.habitica.ui.fragments.purchases;

import com.habitrpg.android.habitica.data.SocialRepository;
import com.habitrpg.android.habitica.data.TutorialRepository;
import com.habitrpg.android.habitica.data.UserRepository;
import com.habitrpg.android.habitica.ui.fragments.BaseFragment_MembersInjector;

/* loaded from: classes4.dex */
public final class GiftBalanceGemsFragment_MembersInjector implements qa.a<GiftBalanceGemsFragment> {
    private final cc.a<SocialRepository> socialRepositoryProvider;
    private final cc.a<TutorialRepository> tutorialRepositoryProvider;
    private final cc.a<UserRepository> userRepositoryProvider;

    public GiftBalanceGemsFragment_MembersInjector(cc.a<TutorialRepository> aVar, cc.a<SocialRepository> aVar2, cc.a<UserRepository> aVar3) {
        this.tutorialRepositoryProvider = aVar;
        this.socialRepositoryProvider = aVar2;
        this.userRepositoryProvider = aVar3;
    }

    public static qa.a<GiftBalanceGemsFragment> create(cc.a<TutorialRepository> aVar, cc.a<SocialRepository> aVar2, cc.a<UserRepository> aVar3) {
        return new GiftBalanceGemsFragment_MembersInjector(aVar, aVar2, aVar3);
    }

    public static void injectSocialRepository(GiftBalanceGemsFragment giftBalanceGemsFragment, SocialRepository socialRepository) {
        giftBalanceGemsFragment.socialRepository = socialRepository;
    }

    public static void injectUserRepository(GiftBalanceGemsFragment giftBalanceGemsFragment, UserRepository userRepository) {
        giftBalanceGemsFragment.userRepository = userRepository;
    }

    public void injectMembers(GiftBalanceGemsFragment giftBalanceGemsFragment) {
        BaseFragment_MembersInjector.injectTutorialRepository(giftBalanceGemsFragment, this.tutorialRepositoryProvider.get());
        injectSocialRepository(giftBalanceGemsFragment, this.socialRepositoryProvider.get());
        injectUserRepository(giftBalanceGemsFragment, this.userRepositoryProvider.get());
    }
}
