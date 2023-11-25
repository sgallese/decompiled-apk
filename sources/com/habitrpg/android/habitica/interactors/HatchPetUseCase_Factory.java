package com.habitrpg.android.habitica.interactors;

import cc.a;
import com.habitrpg.android.habitica.data.InventoryRepository;

/* loaded from: classes4.dex */
public final class HatchPetUseCase_Factory implements a {
    private final a<InventoryRepository> inventoryRepositoryProvider;

    public HatchPetUseCase_Factory(a<InventoryRepository> aVar) {
        this.inventoryRepositoryProvider = aVar;
    }

    public static HatchPetUseCase_Factory create(a<InventoryRepository> aVar) {
        return new HatchPetUseCase_Factory(aVar);
    }

    public static HatchPetUseCase newInstance(InventoryRepository inventoryRepository) {
        return new HatchPetUseCase(inventoryRepository);
    }

    @Override // cc.a
    public HatchPetUseCase get() {
        return newInstance(this.inventoryRepositoryProvider.get());
    }
}
