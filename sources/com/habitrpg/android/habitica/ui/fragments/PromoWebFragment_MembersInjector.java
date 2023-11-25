package com.habitrpg.android.habitica.ui.fragments;

import com.habitrpg.android.habitica.data.TutorialRepository;
import com.habitrpg.android.habitica.data.UserRepository;
import com.habitrpg.android.habitica.helpers.SoundManager;
import com.habitrpg.android.habitica.ui.viewmodels.MainUserViewModel;

/* loaded from: classes4.dex */
public final class PromoWebFragment_MembersInjector implements qa.a<PromoWebFragment> {
    private final cc.a<SoundManager> soundManagerProvider;
    private final cc.a<TutorialRepository> tutorialRepositoryProvider;
    private final cc.a<UserRepository> userRepositoryProvider;
    private final cc.a<MainUserViewModel> userViewModelProvider;

    public PromoWebFragment_MembersInjector(cc.a<TutorialRepository> aVar, cc.a<UserRepository> aVar2, cc.a<SoundManager> aVar3, cc.a<MainUserViewModel> aVar4) {
        this.tutorialRepositoryProvider = aVar;
        this.userRepositoryProvider = aVar2;
        this.soundManagerProvider = aVar3;
        this.userViewModelProvider = aVar4;
    }

    public static qa.a<PromoWebFragment> create(cc.a<TutorialRepository> aVar, cc.a<UserRepository> aVar2, cc.a<SoundManager> aVar3, cc.a<MainUserViewModel> aVar4) {
        return new PromoWebFragment_MembersInjector(aVar, aVar2, aVar3, aVar4);
    }

    public static void injectUserViewModel(PromoWebFragment promoWebFragment, MainUserViewModel mainUserViewModel) {
        promoWebFragment.userViewModel = mainUserViewModel;
    }

    public void injectMembers(PromoWebFragment promoWebFragment) {
        BaseFragment_MembersInjector.injectTutorialRepository(promoWebFragment, this.tutorialRepositoryProvider.get());
        BaseMainFragment_MembersInjector.injectUserRepository(promoWebFragment, this.userRepositoryProvider.get());
        BaseMainFragment_MembersInjector.injectSoundManager(promoWebFragment, this.soundManagerProvider.get());
        injectUserViewModel(promoWebFragment, this.userViewModelProvider.get());
    }
}
