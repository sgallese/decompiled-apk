package com.habitrpg.android.habitica.ui.viewmodels;

import bb.b;
import com.habitrpg.android.habitica.ui.viewmodels.GroupViewModel_HiltModules;

/* loaded from: classes4.dex */
public final class GroupViewModel_HiltModules_KeyModule_ProvideFactory implements cc.a {

    /* loaded from: classes4.dex */
    private static final class InstanceHolder {
        private static final GroupViewModel_HiltModules_KeyModule_ProvideFactory INSTANCE = new GroupViewModel_HiltModules_KeyModule_ProvideFactory();

        private InstanceHolder() {
        }
    }

    public static GroupViewModel_HiltModules_KeyModule_ProvideFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static String provide() {
        return (String) b.d(GroupViewModel_HiltModules.KeyModule.provide());
    }

    @Override // cc.a
    public String get() {
        return provide();
    }
}
