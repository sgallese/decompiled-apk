package com.habitrpg.android.habitica.ui.activities;

/* loaded from: classes4.dex */
public final class TaskSummaryViewModel_HiltModules {

    /* loaded from: classes4.dex */
    public static abstract class BindsModule {
        private BindsModule() {
        }

        public abstract androidx.lifecycle.v0 binds(TaskSummaryViewModel taskSummaryViewModel);
    }

    /* loaded from: classes4.dex */
    public static final class KeyModule {
        private KeyModule() {
        }

        public static String provide() {
            return "com.habitrpg.android.habitica.ui.activities.TaskSummaryViewModel";
        }
    }

    private TaskSummaryViewModel_HiltModules() {
    }
}
