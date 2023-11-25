package com.habitrpg.android.habitica.widget;

import com.habitrpg.android.habitica.data.TaskRepository;
import com.habitrpg.android.habitica.data.UserRepository;
import qa.a;

/* loaded from: classes4.dex */
public final class DailiesWidgetService_MembersInjector implements a<DailiesWidgetService> {
    private final cc.a<TaskRepository> taskRepositoryProvider;
    private final cc.a<UserRepository> userRepositoryProvider;

    public DailiesWidgetService_MembersInjector(cc.a<TaskRepository> aVar, cc.a<UserRepository> aVar2) {
        this.taskRepositoryProvider = aVar;
        this.userRepositoryProvider = aVar2;
    }

    public static a<DailiesWidgetService> create(cc.a<TaskRepository> aVar, cc.a<UserRepository> aVar2) {
        return new DailiesWidgetService_MembersInjector(aVar, aVar2);
    }

    public static void injectTaskRepository(DailiesWidgetService dailiesWidgetService, TaskRepository taskRepository) {
        dailiesWidgetService.taskRepository = taskRepository;
    }

    public static void injectUserRepository(DailiesWidgetService dailiesWidgetService, UserRepository userRepository) {
        dailiesWidgetService.userRepository = userRepository;
    }

    public void injectMembers(DailiesWidgetService dailiesWidgetService) {
        injectTaskRepository(dailiesWidgetService, this.taskRepositoryProvider.get());
        injectUserRepository(dailiesWidgetService, this.userRepositoryProvider.get());
    }
}
