package com.habitrpg.android.habitica.receivers;

import com.habitrpg.android.habitica.data.ApiClient;
import com.habitrpg.android.habitica.data.SocialRepository;
import com.habitrpg.android.habitica.data.TaskRepository;
import com.habitrpg.android.habitica.data.UserRepository;
import qa.a;

/* loaded from: classes4.dex */
public final class LocalNotificationActionReceiver_MembersInjector implements a<LocalNotificationActionReceiver> {
    private final cc.a<ApiClient> apiClientProvider;
    private final cc.a<SocialRepository> socialRepositoryProvider;
    private final cc.a<TaskRepository> taskRepositoryProvider;
    private final cc.a<UserRepository> userRepositoryProvider;

    public LocalNotificationActionReceiver_MembersInjector(cc.a<UserRepository> aVar, cc.a<SocialRepository> aVar2, cc.a<TaskRepository> aVar3, cc.a<ApiClient> aVar4) {
        this.userRepositoryProvider = aVar;
        this.socialRepositoryProvider = aVar2;
        this.taskRepositoryProvider = aVar3;
        this.apiClientProvider = aVar4;
    }

    public static a<LocalNotificationActionReceiver> create(cc.a<UserRepository> aVar, cc.a<SocialRepository> aVar2, cc.a<TaskRepository> aVar3, cc.a<ApiClient> aVar4) {
        return new LocalNotificationActionReceiver_MembersInjector(aVar, aVar2, aVar3, aVar4);
    }

    public static void injectApiClient(LocalNotificationActionReceiver localNotificationActionReceiver, ApiClient apiClient) {
        localNotificationActionReceiver.apiClient = apiClient;
    }

    public static void injectSocialRepository(LocalNotificationActionReceiver localNotificationActionReceiver, SocialRepository socialRepository) {
        localNotificationActionReceiver.socialRepository = socialRepository;
    }

    public static void injectTaskRepository(LocalNotificationActionReceiver localNotificationActionReceiver, TaskRepository taskRepository) {
        localNotificationActionReceiver.taskRepository = taskRepository;
    }

    public static void injectUserRepository(LocalNotificationActionReceiver localNotificationActionReceiver, UserRepository userRepository) {
        localNotificationActionReceiver.userRepository = userRepository;
    }

    public void injectMembers(LocalNotificationActionReceiver localNotificationActionReceiver) {
        injectUserRepository(localNotificationActionReceiver, this.userRepositoryProvider.get());
        injectSocialRepository(localNotificationActionReceiver, this.socialRepositoryProvider.get());
        injectTaskRepository(localNotificationActionReceiver, this.taskRepositoryProvider.get());
        injectApiClient(localNotificationActionReceiver, this.apiClientProvider.get());
    }
}
