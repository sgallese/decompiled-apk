package com.habitrpg.android.habitica.ui.activities;

import com.habitrpg.android.habitica.data.SocialRepository;
import com.habitrpg.android.habitica.data.UserRepository;
import com.habitrpg.android.habitica.helpers.NotificationsManager;

/* loaded from: classes4.dex */
public final class ReportMessageActivity_MembersInjector implements qa.a<ReportMessageActivity> {
    private final cc.a<NotificationsManager> notificationsManagerProvider;
    private final cc.a<SocialRepository> socialRepositoryProvider;
    private final cc.a<UserRepository> userRepositoryProvider;

    public ReportMessageActivity_MembersInjector(cc.a<NotificationsManager> aVar, cc.a<UserRepository> aVar2, cc.a<SocialRepository> aVar3) {
        this.notificationsManagerProvider = aVar;
        this.userRepositoryProvider = aVar2;
        this.socialRepositoryProvider = aVar3;
    }

    public static qa.a<ReportMessageActivity> create(cc.a<NotificationsManager> aVar, cc.a<UserRepository> aVar2, cc.a<SocialRepository> aVar3) {
        return new ReportMessageActivity_MembersInjector(aVar, aVar2, aVar3);
    }

    public static void injectSocialRepository(ReportMessageActivity reportMessageActivity, SocialRepository socialRepository) {
        reportMessageActivity.socialRepository = socialRepository;
    }

    public void injectMembers(ReportMessageActivity reportMessageActivity) {
        BaseActivity_MembersInjector.injectNotificationsManager(reportMessageActivity, this.notificationsManagerProvider.get());
        BaseActivity_MembersInjector.injectUserRepository(reportMessageActivity, this.userRepositoryProvider.get());
        injectSocialRepository(reportMessageActivity, this.socialRepositoryProvider.get());
    }
}
