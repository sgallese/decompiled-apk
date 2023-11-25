package com.habitrpg.android.habitica.ui.fragments.social;

import com.habitrpg.android.habitica.data.SocialRepository;
import com.habitrpg.android.habitica.data.TutorialRepository;
import com.habitrpg.android.habitica.data.UserRepository;
import com.habitrpg.android.habitica.helpers.AppConfigManager;
import com.habitrpg.android.habitica.helpers.SoundManager;
import com.habitrpg.android.habitica.ui.fragments.BaseFragment_MembersInjector;
import com.habitrpg.android.habitica.ui.fragments.BaseMainFragment_MembersInjector;

/* loaded from: classes4.dex */
public final class InboxMessageListFragment_MembersInjector implements qa.a<InboxMessageListFragment> {
    private final cc.a<AppConfigManager> configManagerProvider;
    private final cc.a<SocialRepository> socialRepositoryProvider;
    private final cc.a<SoundManager> soundManagerProvider;
    private final cc.a<TutorialRepository> tutorialRepositoryProvider;
    private final cc.a<UserRepository> userRepositoryProvider;

    public InboxMessageListFragment_MembersInjector(cc.a<TutorialRepository> aVar, cc.a<UserRepository> aVar2, cc.a<SoundManager> aVar3, cc.a<SocialRepository> aVar4, cc.a<AppConfigManager> aVar5) {
        this.tutorialRepositoryProvider = aVar;
        this.userRepositoryProvider = aVar2;
        this.soundManagerProvider = aVar3;
        this.socialRepositoryProvider = aVar4;
        this.configManagerProvider = aVar5;
    }

    public static qa.a<InboxMessageListFragment> create(cc.a<TutorialRepository> aVar, cc.a<UserRepository> aVar2, cc.a<SoundManager> aVar3, cc.a<SocialRepository> aVar4, cc.a<AppConfigManager> aVar5) {
        return new InboxMessageListFragment_MembersInjector(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static void injectConfigManager(InboxMessageListFragment inboxMessageListFragment, AppConfigManager appConfigManager) {
        inboxMessageListFragment.configManager = appConfigManager;
    }

    public static void injectSocialRepository(InboxMessageListFragment inboxMessageListFragment, SocialRepository socialRepository) {
        inboxMessageListFragment.socialRepository = socialRepository;
    }

    public void injectMembers(InboxMessageListFragment inboxMessageListFragment) {
        BaseFragment_MembersInjector.injectTutorialRepository(inboxMessageListFragment, this.tutorialRepositoryProvider.get());
        BaseMainFragment_MembersInjector.injectUserRepository(inboxMessageListFragment, this.userRepositoryProvider.get());
        BaseMainFragment_MembersInjector.injectSoundManager(inboxMessageListFragment, this.soundManagerProvider.get());
        injectSocialRepository(inboxMessageListFragment, this.socialRepositoryProvider.get());
        injectConfigManager(inboxMessageListFragment, this.configManagerProvider.get());
    }
}
