package com.habitrpg.android.habitica.ui.viewmodels;

import androidx.lifecycle.n0;
import com.habitrpg.android.habitica.data.SocialRepository;
import com.habitrpg.android.habitica.data.UserRepository;

/* loaded from: classes4.dex */
public final class InboxViewModel_Factory implements cc.a {
    private final cc.a<n0> savedStateHandleProvider;
    private final cc.a<SocialRepository> socialRepositoryProvider;
    private final cc.a<UserRepository> userRepositoryProvider;
    private final cc.a<MainUserViewModel> userViewModelProvider;

    public InboxViewModel_Factory(cc.a<n0> aVar, cc.a<UserRepository> aVar2, cc.a<MainUserViewModel> aVar3, cc.a<SocialRepository> aVar4) {
        this.savedStateHandleProvider = aVar;
        this.userRepositoryProvider = aVar2;
        this.userViewModelProvider = aVar3;
        this.socialRepositoryProvider = aVar4;
    }

    public static InboxViewModel_Factory create(cc.a<n0> aVar, cc.a<UserRepository> aVar2, cc.a<MainUserViewModel> aVar3, cc.a<SocialRepository> aVar4) {
        return new InboxViewModel_Factory(aVar, aVar2, aVar3, aVar4);
    }

    public static InboxViewModel newInstance(n0 n0Var, UserRepository userRepository, MainUserViewModel mainUserViewModel, SocialRepository socialRepository) {
        return new InboxViewModel(n0Var, userRepository, mainUserViewModel, socialRepository);
    }

    @Override // cc.a
    public InboxViewModel get() {
        return newInstance(this.savedStateHandleProvider.get(), this.userRepositoryProvider.get(), this.userViewModelProvider.get(), this.socialRepositoryProvider.get());
    }
}
