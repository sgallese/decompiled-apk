package com.habitrpg.android.habitica.ui.fragments.social.party;

import com.habitrpg.android.habitica.data.ChallengeRepository;
import com.habitrpg.android.habitica.data.InventoryRepository;
import com.habitrpg.android.habitica.data.SocialRepository;
import com.habitrpg.android.habitica.data.TutorialRepository;
import com.habitrpg.android.habitica.data.UserRepository;
import com.habitrpg.android.habitica.ui.fragments.BaseFragment_MembersInjector;

/* loaded from: classes4.dex */
public final class PartyDetailFragment_MembersInjector implements qa.a<PartyDetailFragment> {
    private final cc.a<ChallengeRepository> challengeRepositoryProvider;
    private final cc.a<InventoryRepository> inventoryRepositoryProvider;
    private final cc.a<SocialRepository> socialRepositoryProvider;
    private final cc.a<TutorialRepository> tutorialRepositoryProvider;
    private final cc.a<UserRepository> userRepositoryProvider;

    public PartyDetailFragment_MembersInjector(cc.a<TutorialRepository> aVar, cc.a<ChallengeRepository> aVar2, cc.a<SocialRepository> aVar3, cc.a<UserRepository> aVar4, cc.a<InventoryRepository> aVar5) {
        this.tutorialRepositoryProvider = aVar;
        this.challengeRepositoryProvider = aVar2;
        this.socialRepositoryProvider = aVar3;
        this.userRepositoryProvider = aVar4;
        this.inventoryRepositoryProvider = aVar5;
    }

    public static qa.a<PartyDetailFragment> create(cc.a<TutorialRepository> aVar, cc.a<ChallengeRepository> aVar2, cc.a<SocialRepository> aVar3, cc.a<UserRepository> aVar4, cc.a<InventoryRepository> aVar5) {
        return new PartyDetailFragment_MembersInjector(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static void injectChallengeRepository(PartyDetailFragment partyDetailFragment, ChallengeRepository challengeRepository) {
        partyDetailFragment.challengeRepository = challengeRepository;
    }

    public static void injectInventoryRepository(PartyDetailFragment partyDetailFragment, InventoryRepository inventoryRepository) {
        partyDetailFragment.inventoryRepository = inventoryRepository;
    }

    public static void injectSocialRepository(PartyDetailFragment partyDetailFragment, SocialRepository socialRepository) {
        partyDetailFragment.socialRepository = socialRepository;
    }

    public static void injectUserRepository(PartyDetailFragment partyDetailFragment, UserRepository userRepository) {
        partyDetailFragment.userRepository = userRepository;
    }

    public void injectMembers(PartyDetailFragment partyDetailFragment) {
        BaseFragment_MembersInjector.injectTutorialRepository(partyDetailFragment, this.tutorialRepositoryProvider.get());
        injectChallengeRepository(partyDetailFragment, this.challengeRepositoryProvider.get());
        injectSocialRepository(partyDetailFragment, this.socialRepositoryProvider.get());
        injectUserRepository(partyDetailFragment, this.userRepositoryProvider.get());
        injectInventoryRepository(partyDetailFragment, this.inventoryRepositoryProvider.get());
    }
}
