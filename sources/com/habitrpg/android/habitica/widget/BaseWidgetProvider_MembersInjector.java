package com.habitrpg.android.habitica.widget;

import com.habitrpg.android.habitica.data.UserRepository;
import qa.a;

/* loaded from: classes4.dex */
public final class BaseWidgetProvider_MembersInjector implements a<BaseWidgetProvider> {
    private final cc.a<UserRepository> userRepositoryProvider;

    public BaseWidgetProvider_MembersInjector(cc.a<UserRepository> aVar) {
        this.userRepositoryProvider = aVar;
    }

    public static a<BaseWidgetProvider> create(cc.a<UserRepository> aVar) {
        return new BaseWidgetProvider_MembersInjector(aVar);
    }

    public static void injectUserRepository(BaseWidgetProvider baseWidgetProvider, UserRepository userRepository) {
        baseWidgetProvider.userRepository = userRepository;
    }

    public void injectMembers(BaseWidgetProvider baseWidgetProvider) {
        injectUserRepository(baseWidgetProvider, this.userRepositoryProvider.get());
    }
}
