package com.habitrpg.android.habitica.ui.fragments.setup;

import com.habitrpg.android.habitica.data.TutorialRepository;
import com.habitrpg.android.habitica.data.UserRepository;
import com.habitrpg.android.habitica.ui.fragments.BaseFragment_MembersInjector;

/* loaded from: classes4.dex */
public final class WelcomeFragment_MembersInjector implements qa.a<WelcomeFragment> {
    private final cc.a<TutorialRepository> tutorialRepositoryProvider;
    private final cc.a<UserRepository> userRepositoryProvider;

    public WelcomeFragment_MembersInjector(cc.a<TutorialRepository> aVar, cc.a<UserRepository> aVar2) {
        this.tutorialRepositoryProvider = aVar;
        this.userRepositoryProvider = aVar2;
    }

    public static qa.a<WelcomeFragment> create(cc.a<TutorialRepository> aVar, cc.a<UserRepository> aVar2) {
        return new WelcomeFragment_MembersInjector(aVar, aVar2);
    }

    public static void injectUserRepository(WelcomeFragment welcomeFragment, UserRepository userRepository) {
        welcomeFragment.userRepository = userRepository;
    }

    public void injectMembers(WelcomeFragment welcomeFragment) {
        BaseFragment_MembersInjector.injectTutorialRepository(welcomeFragment, this.tutorialRepositoryProvider.get());
        injectUserRepository(welcomeFragment, this.userRepositoryProvider.get());
    }
}
