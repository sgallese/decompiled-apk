package com.habitrpg.android.habitica.ui.viewmodels;

import androidx.lifecycle.v0;

/* loaded from: classes4.dex */
public final class TaskFormViewModel_HiltModules {

    /* loaded from: classes4.dex */
    public static abstract class BindsModule {
        private BindsModule() {
        }

        public abstract v0 binds(TaskFormViewModel taskFormViewModel);
    }

    /* loaded from: classes4.dex */
    public static final class KeyModule {
        private KeyModule() {
        }

        public static String provide() {
            return "com.habitrpg.android.habitica.ui.viewmodels.TaskFormViewModel";
        }
    }

    private TaskFormViewModel_HiltModules() {
    }
}
