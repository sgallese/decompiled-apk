package com.habitrpg.android.habitica.ui.viewmodels.inventory.equipment;

import bb.b;
import cc.a;
import com.habitrpg.android.habitica.ui.viewmodels.inventory.equipment.EquipmentOverviewViewModel_HiltModules;

/* loaded from: classes4.dex */
public final class EquipmentOverviewViewModel_HiltModules_KeyModule_ProvideFactory implements a {

    /* loaded from: classes4.dex */
    private static final class InstanceHolder {
        private static final EquipmentOverviewViewModel_HiltModules_KeyModule_ProvideFactory INSTANCE = new EquipmentOverviewViewModel_HiltModules_KeyModule_ProvideFactory();

        private InstanceHolder() {
        }
    }

    public static EquipmentOverviewViewModel_HiltModules_KeyModule_ProvideFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static String provide() {
        return (String) b.d(EquipmentOverviewViewModel_HiltModules.KeyModule.provide());
    }

    @Override // cc.a
    public String get() {
        return provide();
    }
}
