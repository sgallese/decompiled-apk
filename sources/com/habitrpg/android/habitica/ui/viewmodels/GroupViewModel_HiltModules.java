package com.habitrpg.android.habitica.ui.viewmodels;

import androidx.lifecycle.v0;

/* loaded from: classes4.dex */
public final class GroupViewModel_HiltModules {

    /* loaded from: classes4.dex */
    public static abstract class BindsModule {
        private BindsModule() {
        }

        public abstract v0 binds(GroupViewModel groupViewModel);
    }

    /* loaded from: classes4.dex */
    public static final class KeyModule {
        private KeyModule() {
        }

        public static String provide() {
            return "com.habitrpg.android.habitica.ui.viewmodels.GroupViewModel";
        }
    }

    private GroupViewModel_HiltModules() {
    }
}
