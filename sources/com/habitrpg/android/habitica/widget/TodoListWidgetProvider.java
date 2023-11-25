package com.habitrpg.android.habitica.widget;

import com.habitrpg.android.habitica.R;

/* compiled from: TodoListWidgetProvider.kt */
/* loaded from: classes4.dex */
public final class TodoListWidgetProvider extends TaskListWidgetProvider {
    public static final int $stable = 0;

    @Override // com.habitrpg.android.habitica.widget.TaskListWidgetProvider
    protected Class<?> getProviderClass() {
        return TodoListWidgetProvider.class;
    }

    @Override // com.habitrpg.android.habitica.widget.TaskListWidgetProvider
    protected Class<?> getServiceClass() {
        return TodosWidgetService.class;
    }

    @Override // com.habitrpg.android.habitica.widget.TaskListWidgetProvider
    protected int getTitleResId() {
        return R.string.todos;
    }
}
