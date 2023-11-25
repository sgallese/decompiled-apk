package com.habitrpg.android.habitica.ui.viewmodels.inventory.equipment;

import cc.a;
import com.habitrpg.android.habitica.data.InventoryRepository;
import com.habitrpg.android.habitica.data.UserRepository;
import com.habitrpg.android.habitica.ui.viewmodels.MainUserViewModel;

/* loaded from: classes4.dex */
public final class EquipmentOverviewViewModel_Factory implements a {
    private final a<InventoryRepository> inventoryRepositoryProvider;
    private final a<UserRepository> userRepositoryProvider;
    private final a<MainUserViewModel> userViewModelProvider;

    public EquipmentOverviewViewModel_Factory(a<UserRepository> aVar, a<MainUserViewModel> aVar2, a<InventoryRepository> aVar3) {
        this.userRepositoryProvider = aVar;
        this.userViewModelProvider = aVar2;
        this.inventoryRepositoryProvider = aVar3;
    }

    public static EquipmentOverviewViewModel_Factory create(a<UserRepository> aVar, a<MainUserViewModel> aVar2, a<InventoryRepository> aVar3) {
        return new EquipmentOverviewViewModel_Factory(aVar, aVar2, aVar3);
    }

    public static EquipmentOverviewViewModel newInstance(UserRepository userRepository, MainUserViewModel mainUserViewModel, InventoryRepository inventoryRepository) {
        return new EquipmentOverviewViewModel(userRepository, mainUserViewModel, inventoryRepository);
    }

    @Override // cc.a
    public EquipmentOverviewViewModel get() {
        return newInstance(this.userRepositoryProvider.get(), this.userViewModelProvider.get(), this.inventoryRepositoryProvider.get());
    }
}
