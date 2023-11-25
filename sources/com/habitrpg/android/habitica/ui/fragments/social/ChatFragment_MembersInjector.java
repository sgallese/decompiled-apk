package com.habitrpg.android.habitica.ui.fragments.social;

import com.habitrpg.android.habitica.data.SocialRepository;
import com.habitrpg.android.habitica.data.TutorialRepository;
import com.habitrpg.android.habitica.helpers.AppConfigManager;
import com.habitrpg.android.habitica.ui.fragments.BaseFragment_MembersInjector;

/* loaded from: classes4.dex */
public final class ChatFragment_MembersInjector implements qa.a<ChatFragment> {
    private final cc.a<AppConfigManager> configManagerProvider;
    private final cc.a<SocialRepository> socialRepositoryProvider;
    private final cc.a<TutorialRepository> tutorialRepositoryProvider;

    public ChatFragment_MembersInjector(cc.a<TutorialRepository> aVar, cc.a<AppConfigManager> aVar2, cc.a<SocialRepository> aVar3) {
        this.tutorialRepositoryProvider = aVar;
        this.configManagerProvider = aVar2;
        this.socialRepositoryProvider = aVar3;
    }

    public static qa.a<ChatFragment> create(cc.a<TutorialRepository> aVar, cc.a<AppConfigManager> aVar2, cc.a<SocialRepository> aVar3) {
        return new ChatFragment_MembersInjector(aVar, aVar2, aVar3);
    }

    public static void injectConfigManager(ChatFragment chatFragment, AppConfigManager appConfigManager) {
        chatFragment.configManager = appConfigManager;
    }

    public static void injectSocialRepository(ChatFragment chatFragment, SocialRepository socialRepository) {
        chatFragment.socialRepository = socialRepository;
    }

    public void injectMembers(ChatFragment chatFragment) {
        BaseFragment_MembersInjector.injectTutorialRepository(chatFragment, this.tutorialRepositoryProvider.get());
        injectConfigManager(chatFragment, this.configManagerProvider.get());
        injectSocialRepository(chatFragment, this.socialRepositoryProvider.get());
    }
}
