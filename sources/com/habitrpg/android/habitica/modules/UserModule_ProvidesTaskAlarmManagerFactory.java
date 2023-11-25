package com.habitrpg.android.habitica.modules;

import android.content.Context;
import bb.b;
import cc.a;
import com.habitrpg.android.habitica.data.TaskRepository;
import com.habitrpg.android.habitica.helpers.TaskAlarmManager;

/* loaded from: classes4.dex */
public final class UserModule_ProvidesTaskAlarmManagerFactory implements a {
    private final a<AuthenticationHandler> authenticationHandlerProvider;
    private final a<Context> contextProvider;
    private final UserModule module;
    private final a<TaskRepository> taskRepositoryProvider;

    public UserModule_ProvidesTaskAlarmManagerFactory(UserModule userModule, a<Context> aVar, a<TaskRepository> aVar2, a<AuthenticationHandler> aVar3) {
        this.module = userModule;
        this.contextProvider = aVar;
        this.taskRepositoryProvider = aVar2;
        this.authenticationHandlerProvider = aVar3;
    }

    public static UserModule_ProvidesTaskAlarmManagerFactory create(UserModule userModule, a<Context> aVar, a<TaskRepository> aVar2, a<AuthenticationHandler> aVar3) {
        return new UserModule_ProvidesTaskAlarmManagerFactory(userModule, aVar, aVar2, aVar3);
    }

    public static TaskAlarmManager providesTaskAlarmManager(UserModule userModule, Context context, TaskRepository taskRepository, AuthenticationHandler authenticationHandler) {
        return (TaskAlarmManager) b.d(userModule.providesTaskAlarmManager(context, taskRepository, authenticationHandler));
    }

    @Override // cc.a
    public TaskAlarmManager get() {
        return providesTaskAlarmManager(this.module, this.contextProvider.get(), this.taskRepositoryProvider.get(), this.authenticationHandlerProvider.get());
    }
}
