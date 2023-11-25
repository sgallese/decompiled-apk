package com.habitrpg.android.habitica.widget;

import android.content.Context;
import android.content.SharedPreferences;
import com.habitrpg.android.habitica.data.TaskRepository;
import qa.a;

/* loaded from: classes4.dex */
public final class HabitButtonWidgetService_MembersInjector implements a<HabitButtonWidgetService> {
    private final cc.a<Context> contextProvider;
    private final cc.a<SharedPreferences> sharedPreferencesProvider;
    private final cc.a<TaskRepository> taskRepositoryProvider;

    public HabitButtonWidgetService_MembersInjector(cc.a<SharedPreferences> aVar, cc.a<Context> aVar2, cc.a<TaskRepository> aVar3) {
        this.sharedPreferencesProvider = aVar;
        this.contextProvider = aVar2;
        this.taskRepositoryProvider = aVar3;
    }

    public static a<HabitButtonWidgetService> create(cc.a<SharedPreferences> aVar, cc.a<Context> aVar2, cc.a<TaskRepository> aVar3) {
        return new HabitButtonWidgetService_MembersInjector(aVar, aVar2, aVar3);
    }

    public static void injectContext(HabitButtonWidgetService habitButtonWidgetService, Context context) {
        habitButtonWidgetService.context = context;
    }

    public static void injectSharedPreferences(HabitButtonWidgetService habitButtonWidgetService, SharedPreferences sharedPreferences) {
        habitButtonWidgetService.sharedPreferences = sharedPreferences;
    }

    public static void injectTaskRepository(HabitButtonWidgetService habitButtonWidgetService, TaskRepository taskRepository) {
        habitButtonWidgetService.taskRepository = taskRepository;
    }

    public void injectMembers(HabitButtonWidgetService habitButtonWidgetService) {
        injectSharedPreferences(habitButtonWidgetService, this.sharedPreferencesProvider.get());
        injectContext(habitButtonWidgetService, this.contextProvider.get());
        injectTaskRepository(habitButtonWidgetService, this.taskRepositoryProvider.get());
    }
}
