package com.habitrpg.android.habitica.ui.viewmodels.inventory.equipment;

import androidx.lifecycle.w0;
import com.habitrpg.android.habitica.data.InventoryRepository;
import com.habitrpg.android.habitica.data.UserRepository;
import com.habitrpg.android.habitica.models.inventory.Equipment;
import com.habitrpg.android.habitica.models.user.Preferences;
import com.habitrpg.android.habitica.models.user.User;
import com.habitrpg.android.habitica.ui.viewmodels.BaseViewModel;
import com.habitrpg.android.habitica.ui.viewmodels.MainUserViewModel;
import com.habitrpg.common.habitica.helpers.ExceptionHandlerKt;
import dc.w;
import pc.l;
import qc.q;

/* compiled from: EquipmentOverviewViewModel.kt */
/* loaded from: classes4.dex */
public final class EquipmentOverviewViewModel extends BaseViewModel {
    public static final int $stable = 8;
    private final InventoryRepository inventoryRepository;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EquipmentOverviewViewModel(UserRepository userRepository, MainUserViewModel mainUserViewModel, InventoryRepository inventoryRepository) {
        super(userRepository, mainUserViewModel);
        q.i(userRepository, "userRepository");
        q.i(mainUserViewModel, "userViewModel");
        q.i(inventoryRepository, "inventoryRepository");
        this.inventoryRepository = inventoryRepository;
    }

    public final void getGear(String str, l<? super Equipment, w> lVar) {
        q.i(str, "key");
        q.i(lVar, "onSuccess");
        ExceptionHandlerKt.launchCatching$default(w0.a(this), null, new EquipmentOverviewViewModel$getGear$1(this, str, lVar, null), 1, null);
    }

    public final InventoryRepository getInventoryRepository() {
        return this.inventoryRepository;
    }

    public final boolean getUsesAutoEquip() {
        Preferences preferences;
        User f10 = getUser().f();
        if (f10 == null || (preferences = f10.getPreferences()) == null || !preferences.getAutoEquip()) {
            return false;
        }
        return true;
    }

    public final boolean getUsesCostume() {
        Preferences preferences;
        User f10 = getUser().f();
        if (f10 == null || (preferences = f10.getPreferences()) == null || !preferences.getCostume()) {
            return false;
        }
        return true;
    }
}
