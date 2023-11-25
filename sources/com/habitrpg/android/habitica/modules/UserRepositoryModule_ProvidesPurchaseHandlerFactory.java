package com.habitrpg.android.habitica.modules;

import android.content.Context;
import bb.b;
import cc.a;
import com.habitrpg.android.habitica.data.ApiClient;
import com.habitrpg.android.habitica.helpers.PurchaseHandler;
import com.habitrpg.android.habitica.ui.viewmodels.MainUserViewModel;

/* loaded from: classes4.dex */
public final class UserRepositoryModule_ProvidesPurchaseHandlerFactory implements a {
    private final a<ApiClient> apiClientProvider;
    private final a<Context> contextProvider;
    private final UserRepositoryModule module;
    private final a<MainUserViewModel> userViewModelProvider;

    public UserRepositoryModule_ProvidesPurchaseHandlerFactory(UserRepositoryModule userRepositoryModule, a<Context> aVar, a<ApiClient> aVar2, a<MainUserViewModel> aVar3) {
        this.module = userRepositoryModule;
        this.contextProvider = aVar;
        this.apiClientProvider = aVar2;
        this.userViewModelProvider = aVar3;
    }

    public static UserRepositoryModule_ProvidesPurchaseHandlerFactory create(UserRepositoryModule userRepositoryModule, a<Context> aVar, a<ApiClient> aVar2, a<MainUserViewModel> aVar3) {
        return new UserRepositoryModule_ProvidesPurchaseHandlerFactory(userRepositoryModule, aVar, aVar2, aVar3);
    }

    public static PurchaseHandler providesPurchaseHandler(UserRepositoryModule userRepositoryModule, Context context, ApiClient apiClient, MainUserViewModel mainUserViewModel) {
        return (PurchaseHandler) b.d(userRepositoryModule.providesPurchaseHandler(context, apiClient, mainUserViewModel));
    }

    @Override // cc.a
    public PurchaseHandler get() {
        return providesPurchaseHandler(this.module, this.contextProvider.get(), this.apiClientProvider.get(), this.userViewModelProvider.get());
    }
}
