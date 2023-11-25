package com.habitrpg.android.habitica.ui.viewmodels.inventory.equipment;

import androidx.lifecycle.v0;

/* loaded from: classes4.dex */
public final class EquipmentOverviewViewModel_HiltModules {

    /* loaded from: classes4.dex */
    public static abstract class BindsModule {
        private BindsModule() {
        }

        public abstract v0 binds(EquipmentOverviewViewModel equipmentOverviewViewModel);
    }

    /* loaded from: classes4.dex */
    public static final class KeyModule {
        private KeyModule() {
        }

        public static String provide() {
            return "com.habitrpg.android.habitica.ui.viewmodels.inventory.equipment.EquipmentOverviewViewModel";
        }
    }

    private EquipmentOverviewViewModel_HiltModules() {
    }
}
