package com.habitrpg.android.habitica.ui.fragments.social.party;

import com.habitrpg.android.habitica.data.SocialRepository;
import com.habitrpg.android.habitica.data.UserRepository;
import com.habitrpg.android.habitica.ui.viewmodels.MainUserViewModel;

/* loaded from: classes4.dex */
public final class PartySeekingViewModel_Factory implements cc.a {
    private final cc.a<SocialRepository> socialRepositoryProvider;
    private final cc.a<UserRepository> userRepositoryProvider;
    private final cc.a<MainUserViewModel> userViewModelProvider;

    public PartySeekingViewModel_Factory(cc.a<UserRepository> aVar, cc.a<MainUserViewModel> aVar2, cc.a<SocialRepository> aVar3) {
        this.userRepositoryProvider = aVar;
        this.userViewModelProvider = aVar2;
        this.socialRepositoryProvider = aVar3;
    }

    public static PartySeekingViewModel_Factory create(cc.a<UserRepository> aVar, cc.a<MainUserViewModel> aVar2, cc.a<SocialRepository> aVar3) {
        return new PartySeekingViewModel_Factory(aVar, aVar2, aVar3);
    }

    public static PartySeekingViewModel newInstance(UserRepository userRepository, MainUserViewModel mainUserViewModel, SocialRepository socialRepository) {
        return new PartySeekingViewModel(userRepository, mainUserViewModel, socialRepository);
    }

    @Override // cc.a
    public PartySeekingViewModel get() {
        return newInstance(this.userRepositoryProvider.get(), this.userViewModelProvider.get(), this.socialRepositoryProvider.get());
    }
}
