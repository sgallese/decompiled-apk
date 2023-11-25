package com.habitrpg.android.habitica.ui.fragments.skills;

import com.habitrpg.android.habitica.data.TutorialRepository;
import com.habitrpg.android.habitica.data.UserRepository;
import com.habitrpg.android.habitica.helpers.SoundManager;
import com.habitrpg.android.habitica.ui.fragments.BaseFragment_MembersInjector;
import com.habitrpg.android.habitica.ui.fragments.BaseMainFragment_MembersInjector;
import com.habitrpg.android.habitica.ui.viewmodels.MainUserViewModel;

/* loaded from: classes4.dex */
public final class SkillsFragment_MembersInjector implements qa.a<SkillsFragment> {
    private final cc.a<SoundManager> soundManagerProvider;
    private final cc.a<TutorialRepository> tutorialRepositoryProvider;
    private final cc.a<UserRepository> userRepositoryProvider;
    private final cc.a<MainUserViewModel> userViewModelProvider;

    public SkillsFragment_MembersInjector(cc.a<TutorialRepository> aVar, cc.a<UserRepository> aVar2, cc.a<SoundManager> aVar3, cc.a<MainUserViewModel> aVar4) {
        this.tutorialRepositoryProvider = aVar;
        this.userRepositoryProvider = aVar2;
        this.soundManagerProvider = aVar3;
        this.userViewModelProvider = aVar4;
    }

    public static qa.a<SkillsFragment> create(cc.a<TutorialRepository> aVar, cc.a<UserRepository> aVar2, cc.a<SoundManager> aVar3, cc.a<MainUserViewModel> aVar4) {
        return new SkillsFragment_MembersInjector(aVar, aVar2, aVar3, aVar4);
    }

    public static void injectUserViewModel(SkillsFragment skillsFragment, MainUserViewModel mainUserViewModel) {
        skillsFragment.userViewModel = mainUserViewModel;
    }

    public void injectMembers(SkillsFragment skillsFragment) {
        BaseFragment_MembersInjector.injectTutorialRepository(skillsFragment, this.tutorialRepositoryProvider.get());
        BaseMainFragment_MembersInjector.injectUserRepository(skillsFragment, this.userRepositoryProvider.get());
        BaseMainFragment_MembersInjector.injectSoundManager(skillsFragment, this.soundManagerProvider.get());
        injectUserViewModel(skillsFragment, this.userViewModelProvider.get());
    }
}
