package com.habitrpg.android.habitica.ui.activities;

import com.habitrpg.android.habitica.data.UserRepository;
import com.habitrpg.android.habitica.helpers.NotificationsManager;

/* loaded from: classes4.dex */
public final class BaseActivity_MembersInjector implements qa.a<BaseActivity> {
    private final cc.a<NotificationsManager> notificationsManagerProvider;
    private final cc.a<UserRepository> userRepositoryProvider;

    public BaseActivity_MembersInjector(cc.a<NotificationsManager> aVar, cc.a<UserRepository> aVar2) {
        this.notificationsManagerProvider = aVar;
        this.userRepositoryProvider = aVar2;
    }

    public static qa.a<BaseActivity> create(cc.a<NotificationsManager> aVar, cc.a<UserRepository> aVar2) {
        return new BaseActivity_MembersInjector(aVar, aVar2);
    }

    public static void injectNotificationsManager(BaseActivity baseActivity, NotificationsManager notificationsManager) {
        baseActivity.notificationsManager = notificationsManager;
    }

    public static void injectUserRepository(BaseActivity baseActivity, UserRepository userRepository) {
        baseActivity.userRepository = userRepository;
    }

    public void injectMembers(BaseActivity baseActivity) {
        injectNotificationsManager(baseActivity, this.notificationsManagerProvider.get());
        injectUserRepository(baseActivity, this.userRepositoryProvider.get());
    }
}
