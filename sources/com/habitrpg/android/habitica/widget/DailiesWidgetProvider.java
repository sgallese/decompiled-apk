package com.habitrpg.android.habitica.widget;

import com.habitrpg.android.habitica.R;

/* compiled from: DailiesWidgetProvider.kt */
/* loaded from: classes4.dex */
public final class DailiesWidgetProvider extends TaskListWidgetProvider {
    public static final int $stable = 0;

    @Override // com.habitrpg.android.habitica.widget.TaskListWidgetProvider
    protected Class<?> getProviderClass() {
        return DailiesWidgetProvider.class;
    }

    @Override // com.habitrpg.android.habitica.widget.TaskListWidgetProvider
    protected Class<?> getServiceClass() {
        return DailiesWidgetService.class;
    }

    @Override // com.habitrpg.android.habitica.widget.TaskListWidgetProvider
    protected int getTitleResId() {
        return R.string.dailies;
    }
}
