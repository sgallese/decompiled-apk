package com.habitrpg.android.habitica.ui.activities;

import com.habitrpg.android.habitica.ui.activities.TaskSummaryViewModel_HiltModules;

/* loaded from: classes4.dex */
public final class TaskSummaryViewModel_HiltModules_KeyModule_ProvideFactory implements cc.a {

    /* loaded from: classes4.dex */
    private static final class InstanceHolder {
        private static final TaskSummaryViewModel_HiltModules_KeyModule_ProvideFactory INSTANCE = new TaskSummaryViewModel_HiltModules_KeyModule_ProvideFactory();

        private InstanceHolder() {
        }
    }

    public static TaskSummaryViewModel_HiltModules_KeyModule_ProvideFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static String provide() {
        return (String) bb.b.d(TaskSummaryViewModel_HiltModules.KeyModule.provide());
    }

    @Override // cc.a
    public String get() {
        return provide();
    }
}
