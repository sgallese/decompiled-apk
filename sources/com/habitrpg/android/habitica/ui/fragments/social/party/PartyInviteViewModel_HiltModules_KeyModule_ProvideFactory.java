package com.habitrpg.android.habitica.ui.fragments.social.party;

import com.habitrpg.android.habitica.ui.fragments.social.party.PartyInviteViewModel_HiltModules;

/* loaded from: classes4.dex */
public final class PartyInviteViewModel_HiltModules_KeyModule_ProvideFactory implements cc.a {

    /* loaded from: classes4.dex */
    private static final class InstanceHolder {
        private static final PartyInviteViewModel_HiltModules_KeyModule_ProvideFactory INSTANCE = new PartyInviteViewModel_HiltModules_KeyModule_ProvideFactory();

        private InstanceHolder() {
        }
    }

    public static PartyInviteViewModel_HiltModules_KeyModule_ProvideFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static String provide() {
        return (String) bb.b.d(PartyInviteViewModel_HiltModules.KeyModule.provide());
    }

    @Override // cc.a
    public String get() {
        return provide();
    }
}
