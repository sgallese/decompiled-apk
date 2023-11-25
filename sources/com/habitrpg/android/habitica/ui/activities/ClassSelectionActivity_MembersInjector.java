package com.habitrpg.android.habitica.ui.activities;

import com.habitrpg.android.habitica.data.UserRepository;
import com.habitrpg.android.habitica.helpers.NotificationsManager;
import com.habitrpg.android.habitica.helpers.ReviewManager;
import com.habitrpg.android.habitica.ui.viewmodels.MainUserViewModel;

/* loaded from: classes4.dex */
public final class ClassSelectionActivity_MembersInjector implements qa.a<ClassSelectionActivity> {
    private final cc.a<NotificationsManager> notificationsManagerProvider;
    private final cc.a<ReviewManager> reviewManagerProvider;
    private final cc.a<UserRepository> userRepositoryProvider;
    private final cc.a<MainUserViewModel> userViewModelProvider;

    public ClassSelectionActivity_MembersInjector(cc.a<NotificationsManager> aVar, cc.a<UserRepository> aVar2, cc.a<MainUserViewModel> aVar3, cc.a<ReviewManager> aVar4) {
        this.notificationsManagerProvider = aVar;
        this.userRepositoryProvider = aVar2;
        this.userViewModelProvider = aVar3;
        this.reviewManagerProvider = aVar4;
    }

    public static qa.a<ClassSelectionActivity> create(cc.a<NotificationsManager> aVar, cc.a<UserRepository> aVar2, cc.a<MainUserViewModel> aVar3, cc.a<ReviewManager> aVar4) {
        return new ClassSelectionActivity_MembersInjector(aVar, aVar2, aVar3, aVar4);
    }

    public static void injectReviewManager(ClassSelectionActivity classSelectionActivity, ReviewManager reviewManager) {
        classSelectionActivity.reviewManager = reviewManager;
    }

    public static void injectUserViewModel(ClassSelectionActivity classSelectionActivity, MainUserViewModel mainUserViewModel) {
        classSelectionActivity.userViewModel = mainUserViewModel;
    }

    public void injectMembers(ClassSelectionActivity classSelectionActivity) {
        BaseActivity_MembersInjector.injectNotificationsManager(classSelectionActivity, this.notificationsManagerProvider.get());
        BaseActivity_MembersInjector.injectUserRepository(classSelectionActivity, this.userRepositoryProvider.get());
        injectUserViewModel(classSelectionActivity, this.userViewModelProvider.get());
        injectReviewManager(classSelectionActivity, this.reviewManagerProvider.get());
    }
}
