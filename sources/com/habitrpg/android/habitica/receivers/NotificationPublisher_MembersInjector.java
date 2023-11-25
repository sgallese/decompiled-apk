package com.habitrpg.android.habitica.receivers;

import android.content.SharedPreferences;
import com.habitrpg.android.habitica.data.TaskRepository;
import com.habitrpg.android.habitica.data.UserRepository;
import qa.a;

/* loaded from: classes4.dex */
public final class NotificationPublisher_MembersInjector implements a<NotificationPublisher> {
    private final cc.a<SharedPreferences> sharedPreferencesProvider;
    private final cc.a<TaskRepository> taskRepositoryProvider;
    private final cc.a<UserRepository> userRepositoryProvider;

    public NotificationPublisher_MembersInjector(cc.a<TaskRepository> aVar, cc.a<UserRepository> aVar2, cc.a<SharedPreferences> aVar3) {
        this.taskRepositoryProvider = aVar;
        this.userRepositoryProvider = aVar2;
        this.sharedPreferencesProvider = aVar3;
    }

    public static a<NotificationPublisher> create(cc.a<TaskRepository> aVar, cc.a<UserRepository> aVar2, cc.a<SharedPreferences> aVar3) {
        return new NotificationPublisher_MembersInjector(aVar, aVar2, aVar3);
    }

    public static void injectSharedPreferences(NotificationPublisher notificationPublisher, SharedPreferences sharedPreferences) {
        notificationPublisher.sharedPreferences = sharedPreferences;
    }

    public static void injectTaskRepository(NotificationPublisher notificationPublisher, TaskRepository taskRepository) {
        notificationPublisher.taskRepository = taskRepository;
    }

    public static void injectUserRepository(NotificationPublisher notificationPublisher, UserRepository userRepository) {
        notificationPublisher.userRepository = userRepository;
    }

    public void injectMembers(NotificationPublisher notificationPublisher) {
        injectTaskRepository(notificationPublisher, this.taskRepositoryProvider.get());
        injectUserRepository(notificationPublisher, this.userRepositoryProvider.get());
        injectSharedPreferences(notificationPublisher, this.sharedPreferencesProvider.get());
    }
}
