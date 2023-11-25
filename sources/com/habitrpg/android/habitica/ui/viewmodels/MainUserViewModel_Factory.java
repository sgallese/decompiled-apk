package com.habitrpg.android.habitica.ui.viewmodels;

import com.habitrpg.android.habitica.data.SocialRepository;
import com.habitrpg.android.habitica.data.UserRepository;
import com.habitrpg.android.habitica.modules.AuthenticationHandler;

/* loaded from: classes4.dex */
public final class MainUserViewModel_Factory implements cc.a {
    private final cc.a<AuthenticationHandler> authenticationHandlerProvider;
    private final cc.a<SocialRepository> socialRepositoryProvider;
    private final cc.a<UserRepository> userRepositoryProvider;

    public MainUserViewModel_Factory(cc.a<AuthenticationHandler> aVar, cc.a<UserRepository> aVar2, cc.a<SocialRepository> aVar3) {
        this.authenticationHandlerProvider = aVar;
        this.userRepositoryProvider = aVar2;
        this.socialRepositoryProvider = aVar3;
    }

    public static MainUserViewModel_Factory create(cc.a<AuthenticationHandler> aVar, cc.a<UserRepository> aVar2, cc.a<SocialRepository> aVar3) {
        return new MainUserViewModel_Factory(aVar, aVar2, aVar3);
    }

    public static MainUserViewModel newInstance(AuthenticationHandler authenticationHandler, UserRepository userRepository, SocialRepository socialRepository) {
        return new MainUserViewModel(authenticationHandler, userRepository, socialRepository);
    }

    @Override // cc.a
    public MainUserViewModel get() {
        return newInstance(this.authenticationHandlerProvider.get(), this.userRepositoryProvider.get(), this.socialRepositoryProvider.get());
    }
}
