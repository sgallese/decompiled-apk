package com.habitrpg.android.habitica.ui.activities;

import com.habitrpg.android.habitica.data.SocialRepository;
import com.habitrpg.android.habitica.data.UserRepository;
import com.habitrpg.android.habitica.helpers.NotificationsManager;

/* loaded from: classes4.dex */
public final class GroupInviteActivity_MembersInjector implements qa.a<GroupInviteActivity> {
    private final cc.a<NotificationsManager> notificationsManagerProvider;
    private final cc.a<SocialRepository> socialRepositoryProvider;
    private final cc.a<UserRepository> userRepositoryProvider;

    public GroupInviteActivity_MembersInjector(cc.a<NotificationsManager> aVar, cc.a<UserRepository> aVar2, cc.a<SocialRepository> aVar3) {
        this.notificationsManagerProvider = aVar;
        this.userRepositoryProvider = aVar2;
        this.socialRepositoryProvider = aVar3;
    }

    public static qa.a<GroupInviteActivity> create(cc.a<NotificationsManager> aVar, cc.a<UserRepository> aVar2, cc.a<SocialRepository> aVar3) {
        return new GroupInviteActivity_MembersInjector(aVar, aVar2, aVar3);
    }

    public static void injectSocialRepository(GroupInviteActivity groupInviteActivity, SocialRepository socialRepository) {
        groupInviteActivity.socialRepository = socialRepository;
    }

    public void injectMembers(GroupInviteActivity groupInviteActivity) {
        BaseActivity_MembersInjector.injectNotificationsManager(groupInviteActivity, this.notificationsManagerProvider.get());
        BaseActivity_MembersInjector.injectUserRepository(groupInviteActivity, this.userRepositoryProvider.get());
        injectSocialRepository(groupInviteActivity, this.socialRepositoryProvider.get());
    }
}
