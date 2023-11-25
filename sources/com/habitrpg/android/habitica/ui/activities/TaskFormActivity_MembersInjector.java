package com.habitrpg.android.habitica.ui.activities;

import android.content.SharedPreferences;
import com.habitrpg.android.habitica.data.ChallengeRepository;
import com.habitrpg.android.habitica.data.SocialRepository;
import com.habitrpg.android.habitica.data.TagRepository;
import com.habitrpg.android.habitica.data.TaskRepository;
import com.habitrpg.android.habitica.data.UserRepository;
import com.habitrpg.android.habitica.helpers.NotificationsManager;
import com.habitrpg.android.habitica.helpers.TaskAlarmManager;
import com.habitrpg.android.habitica.helpers.notifications.PushNotificationManager;
import com.habitrpg.android.habitica.ui.viewmodels.MainUserViewModel;

/* loaded from: classes4.dex */
public final class TaskFormActivity_MembersInjector implements qa.a<TaskFormActivity> {
    private final cc.a<ChallengeRepository> challengeRepositoryProvider;
    private final cc.a<NotificationsManager> notificationsManagerProvider;
    private final cc.a<PushNotificationManager> pushNotificationManagerProvider;
    private final cc.a<SharedPreferences> sharedPreferencesProvider;
    private final cc.a<SocialRepository> socialRepositoryProvider;
    private final cc.a<TagRepository> tagRepositoryProvider;
    private final cc.a<TaskAlarmManager> taskAlarmManagerProvider;
    private final cc.a<TaskRepository> taskRepositoryProvider;
    private final cc.a<UserRepository> userRepositoryProvider;
    private final cc.a<MainUserViewModel> userViewModelProvider;

    public TaskFormActivity_MembersInjector(cc.a<NotificationsManager> aVar, cc.a<UserRepository> aVar2, cc.a<TaskRepository> aVar3, cc.a<TagRepository> aVar4, cc.a<TaskAlarmManager> aVar5, cc.a<PushNotificationManager> aVar6, cc.a<ChallengeRepository> aVar7, cc.a<SharedPreferences> aVar8, cc.a<MainUserViewModel> aVar9, cc.a<SocialRepository> aVar10) {
        this.notificationsManagerProvider = aVar;
        this.userRepositoryProvider = aVar2;
        this.taskRepositoryProvider = aVar3;
        this.tagRepositoryProvider = aVar4;
        this.taskAlarmManagerProvider = aVar5;
        this.pushNotificationManagerProvider = aVar6;
        this.challengeRepositoryProvider = aVar7;
        this.sharedPreferencesProvider = aVar8;
        this.userViewModelProvider = aVar9;
        this.socialRepositoryProvider = aVar10;
    }

    public static qa.a<TaskFormActivity> create(cc.a<NotificationsManager> aVar, cc.a<UserRepository> aVar2, cc.a<TaskRepository> aVar3, cc.a<TagRepository> aVar4, cc.a<TaskAlarmManager> aVar5, cc.a<PushNotificationManager> aVar6, cc.a<ChallengeRepository> aVar7, cc.a<SharedPreferences> aVar8, cc.a<MainUserViewModel> aVar9, cc.a<SocialRepository> aVar10) {
        return new TaskFormActivity_MembersInjector(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10);
    }

    public static void injectChallengeRepository(TaskFormActivity taskFormActivity, ChallengeRepository challengeRepository) {
        taskFormActivity.challengeRepository = challengeRepository;
    }

    public static void injectPushNotificationManager(TaskFormActivity taskFormActivity, PushNotificationManager pushNotificationManager) {
        taskFormActivity.pushNotificationManager = pushNotificationManager;
    }

    public static void injectSharedPreferences(TaskFormActivity taskFormActivity, SharedPreferences sharedPreferences) {
        taskFormActivity.sharedPreferences = sharedPreferences;
    }

    public static void injectSocialRepository(TaskFormActivity taskFormActivity, SocialRepository socialRepository) {
        taskFormActivity.socialRepository = socialRepository;
    }

    public static void injectTagRepository(TaskFormActivity taskFormActivity, TagRepository tagRepository) {
        taskFormActivity.tagRepository = tagRepository;
    }

    public static void injectTaskAlarmManager(TaskFormActivity taskFormActivity, TaskAlarmManager taskAlarmManager) {
        taskFormActivity.taskAlarmManager = taskAlarmManager;
    }

    public static void injectTaskRepository(TaskFormActivity taskFormActivity, TaskRepository taskRepository) {
        taskFormActivity.taskRepository = taskRepository;
    }

    public static void injectUserViewModel(TaskFormActivity taskFormActivity, MainUserViewModel mainUserViewModel) {
        taskFormActivity.userViewModel = mainUserViewModel;
    }

    public void injectMembers(TaskFormActivity taskFormActivity) {
        BaseActivity_MembersInjector.injectNotificationsManager(taskFormActivity, this.notificationsManagerProvider.get());
        BaseActivity_MembersInjector.injectUserRepository(taskFormActivity, this.userRepositoryProvider.get());
        injectTaskRepository(taskFormActivity, this.taskRepositoryProvider.get());
        injectTagRepository(taskFormActivity, this.tagRepositoryProvider.get());
        injectTaskAlarmManager(taskFormActivity, this.taskAlarmManagerProvider.get());
        injectPushNotificationManager(taskFormActivity, this.pushNotificationManagerProvider.get());
        injectChallengeRepository(taskFormActivity, this.challengeRepositoryProvider.get());
        injectSharedPreferences(taskFormActivity, this.sharedPreferencesProvider.get());
        injectUserViewModel(taskFormActivity, this.userViewModelProvider.get());
        injectSocialRepository(taskFormActivity, this.socialRepositoryProvider.get());
    }
}
