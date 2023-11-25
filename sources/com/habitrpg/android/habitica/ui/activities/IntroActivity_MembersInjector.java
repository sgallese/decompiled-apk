package com.habitrpg.android.habitica.ui.activities;

import com.habitrpg.android.habitica.data.ContentRepository;
import com.habitrpg.android.habitica.data.UserRepository;
import com.habitrpg.android.habitica.helpers.NotificationsManager;

/* loaded from: classes4.dex */
public final class IntroActivity_MembersInjector implements qa.a<IntroActivity> {
    private final cc.a<ContentRepository> contentRepositoryProvider;
    private final cc.a<NotificationsManager> notificationsManagerProvider;
    private final cc.a<UserRepository> userRepositoryProvider;

    public IntroActivity_MembersInjector(cc.a<NotificationsManager> aVar, cc.a<UserRepository> aVar2, cc.a<ContentRepository> aVar3) {
        this.notificationsManagerProvider = aVar;
        this.userRepositoryProvider = aVar2;
        this.contentRepositoryProvider = aVar3;
    }

    public static qa.a<IntroActivity> create(cc.a<NotificationsManager> aVar, cc.a<UserRepository> aVar2, cc.a<ContentRepository> aVar3) {
        return new IntroActivity_MembersInjector(aVar, aVar2, aVar3);
    }

    public static void injectContentRepository(IntroActivity introActivity, ContentRepository contentRepository) {
        introActivity.contentRepository = contentRepository;
    }

    public void injectMembers(IntroActivity introActivity) {
        BaseActivity_MembersInjector.injectNotificationsManager(introActivity, this.notificationsManagerProvider.get());
        BaseActivity_MembersInjector.injectUserRepository(introActivity, this.userRepositoryProvider.get());
        injectContentRepository(introActivity, this.contentRepositoryProvider.get());
    }
}
