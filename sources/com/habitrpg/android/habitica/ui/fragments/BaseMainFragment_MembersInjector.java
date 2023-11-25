package com.habitrpg.android.habitica.ui.fragments;

import com.habitrpg.android.habitica.data.TutorialRepository;
import com.habitrpg.android.habitica.data.UserRepository;
import com.habitrpg.android.habitica.helpers.SoundManager;
import e4.a;

/* loaded from: classes4.dex */
public final class BaseMainFragment_MembersInjector<VB extends e4.a> implements qa.a<BaseMainFragment<VB>> {
    private final cc.a<SoundManager> soundManagerProvider;
    private final cc.a<TutorialRepository> tutorialRepositoryProvider;
    private final cc.a<UserRepository> userRepositoryProvider;

    public BaseMainFragment_MembersInjector(cc.a<TutorialRepository> aVar, cc.a<UserRepository> aVar2, cc.a<SoundManager> aVar3) {
        this.tutorialRepositoryProvider = aVar;
        this.userRepositoryProvider = aVar2;
        this.soundManagerProvider = aVar3;
    }

    public static <VB extends e4.a> qa.a<BaseMainFragment<VB>> create(cc.a<TutorialRepository> aVar, cc.a<UserRepository> aVar2, cc.a<SoundManager> aVar3) {
        return new BaseMainFragment_MembersInjector(aVar, aVar2, aVar3);
    }

    public static <VB extends e4.a> void injectSoundManager(BaseMainFragment<VB> baseMainFragment, SoundManager soundManager) {
        baseMainFragment.soundManager = soundManager;
    }

    public static <VB extends e4.a> void injectUserRepository(BaseMainFragment<VB> baseMainFragment, UserRepository userRepository) {
        baseMainFragment.userRepository = userRepository;
    }

    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        injectMembers((BaseMainFragment) ((BaseMainFragment) obj));
    }

    public void injectMembers(BaseMainFragment<VB> baseMainFragment) {
        BaseFragment_MembersInjector.injectTutorialRepository(baseMainFragment, this.tutorialRepositoryProvider.get());
        injectUserRepository(baseMainFragment, this.userRepositoryProvider.get());
        injectSoundManager(baseMainFragment, this.soundManagerProvider.get());
    }
}
