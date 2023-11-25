package com.habitrpg.android.habitica.ui.viewmodels;

import androidx.lifecycle.v0;

/* loaded from: classes4.dex */
public final class PartyViewModel_HiltModules {

    /* loaded from: classes4.dex */
    public static abstract class BindsModule {
        private BindsModule() {
        }

        public abstract v0 binds(PartyViewModel partyViewModel);
    }

    /* loaded from: classes4.dex */
    public static final class KeyModule {
        private KeyModule() {
        }

        public static String provide() {
            return "com.habitrpg.android.habitica.ui.viewmodels.PartyViewModel";
        }
    }

    private PartyViewModel_HiltModules() {
    }
}
