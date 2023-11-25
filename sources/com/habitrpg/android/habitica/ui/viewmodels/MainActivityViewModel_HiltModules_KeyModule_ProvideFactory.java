package com.habitrpg.android.habitica.ui.viewmodels;

import bb.b;
import com.habitrpg.android.habitica.ui.viewmodels.MainActivityViewModel_HiltModules;

/* loaded from: classes4.dex */
public final class MainActivityViewModel_HiltModules_KeyModule_ProvideFactory implements cc.a {

    /* loaded from: classes4.dex */
    private static final class InstanceHolder {
        private static final MainActivityViewModel_HiltModules_KeyModule_ProvideFactory INSTANCE = new MainActivityViewModel_HiltModules_KeyModule_ProvideFactory();

        private InstanceHolder() {
        }
    }

    public static MainActivityViewModel_HiltModules_KeyModule_ProvideFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static String provide() {
        return (String) b.d(MainActivityViewModel_HiltModules.KeyModule.provide());
    }

    @Override // cc.a
    public String get() {
        return provide();
    }
}
