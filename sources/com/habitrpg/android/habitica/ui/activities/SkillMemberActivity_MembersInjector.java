package com.habitrpg.android.habitica.ui.activities;

import com.habitrpg.android.habitica.data.SocialRepository;
import com.habitrpg.android.habitica.data.UserRepository;
import com.habitrpg.android.habitica.helpers.NotificationsManager;
import com.habitrpg.android.habitica.ui.viewmodels.MainUserViewModel;

/* loaded from: classes4.dex */
public final class SkillMemberActivity_MembersInjector implements qa.a<SkillMemberActivity> {
    private final cc.a<NotificationsManager> notificationsManagerProvider;
    private final cc.a<SocialRepository> socialRepositoryProvider;
    private final cc.a<UserRepository> userRepositoryProvider;
    private final cc.a<MainUserViewModel> userViewModelProvider;

    public SkillMemberActivity_MembersInjector(cc.a<NotificationsManager> aVar, cc.a<UserRepository> aVar2, cc.a<SocialRepository> aVar3, cc.a<MainUserViewModel> aVar4) {
        this.notificationsManagerProvider = aVar;
        this.userRepositoryProvider = aVar2;
        this.socialRepositoryProvider = aVar3;
        this.userViewModelProvider = aVar4;
    }

    public static qa.a<SkillMemberActivity> create(cc.a<NotificationsManager> aVar, cc.a<UserRepository> aVar2, cc.a<SocialRepository> aVar3, cc.a<MainUserViewModel> aVar4) {
        return new SkillMemberActivity_MembersInjector(aVar, aVar2, aVar3, aVar4);
    }

    public static void injectSocialRepository(SkillMemberActivity skillMemberActivity, SocialRepository socialRepository) {
        skillMemberActivity.socialRepository = socialRepository;
    }

    public static void injectUserViewModel(SkillMemberActivity skillMemberActivity, MainUserViewModel mainUserViewModel) {
        skillMemberActivity.userViewModel = mainUserViewModel;
    }

    public void injectMembers(SkillMemberActivity skillMemberActivity) {
        BaseActivity_MembersInjector.injectNotificationsManager(skillMemberActivity, this.notificationsManagerProvider.get());
        BaseActivity_MembersInjector.injectUserRepository(skillMemberActivity, this.userRepositoryProvider.get());
        injectSocialRepository(skillMemberActivity, this.socialRepositoryProvider.get());
        injectUserViewModel(skillMemberActivity, this.userViewModelProvider.get());
    }
}
