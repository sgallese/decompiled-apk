package com.habitrpg.android.habitica.ui.fragments.social.party;

import androidx.lifecycle.v0;

/* loaded from: classes4.dex */
public final class PartySeekingViewModel_HiltModules {

    /* loaded from: classes4.dex */
    public static abstract class BindsModule {
        private BindsModule() {
        }

        public abstract v0 binds(PartySeekingViewModel partySeekingViewModel);
    }

    /* loaded from: classes4.dex */
    public static final class KeyModule {
        private KeyModule() {
        }

        public static String provide() {
            return "com.habitrpg.android.habitica.ui.fragments.social.party.PartySeekingViewModel";
        }
    }

    private PartySeekingViewModel_HiltModules() {
    }
}
