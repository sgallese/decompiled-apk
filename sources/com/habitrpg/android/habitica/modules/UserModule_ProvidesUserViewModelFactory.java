package com.habitrpg.android.habitica.modules;

import bb.b;
import cc.a;
import com.habitrpg.android.habitica.data.SocialRepository;
import com.habitrpg.android.habitica.data.UserRepository;
import com.habitrpg.android.habitica.ui.viewmodels.MainUserViewModel;

/* loaded from: classes4.dex */
public final class UserModule_ProvidesUserViewModelFactory implements a {
    private final a<AuthenticationHandler> authenticationHandlerProvider;
    private final UserModule module;
    private final a<SocialRepository> socialRepositoryProvider;
    private final a<UserRepository> userRepositoryProvider;

    public UserModule_ProvidesUserViewModelFactory(UserModule userModule, a<AuthenticationHandler> aVar, a<UserRepository> aVar2, a<SocialRepository> aVar3) {
        this.module = userModule;
        this.authenticationHandlerProvider = aVar;
        this.userRepositoryProvider = aVar2;
        this.socialRepositoryProvider = aVar3;
    }

    public static UserModule_ProvidesUserViewModelFactory create(UserModule userModule, a<AuthenticationHandler> aVar, a<UserRepository> aVar2, a<SocialRepository> aVar3) {
        return new UserModule_ProvidesUserViewModelFactory(userModule, aVar, aVar2, aVar3);
    }

    public static MainUserViewModel providesUserViewModel(UserModule userModule, AuthenticationHandler authenticationHandler, UserRepository userRepository, SocialRepository socialRepository) {
        return (MainUserViewModel) b.d(userModule.providesUserViewModel(authenticationHandler, userRepository, socialRepository));
    }

    @Override // cc.a
    public MainUserViewModel get() {
        return providesUserViewModel(this.module, this.authenticationHandlerProvider.get(), this.userRepositoryProvider.get(), this.socialRepositoryProvider.get());
    }
}
