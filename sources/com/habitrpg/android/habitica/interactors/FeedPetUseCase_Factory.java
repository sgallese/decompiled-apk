package com.habitrpg.android.habitica.interactors;

import cc.a;
import com.habitrpg.android.habitica.data.InventoryRepository;

/* loaded from: classes4.dex */
public final class FeedPetUseCase_Factory implements a {
    private final a<InventoryRepository> inventoryRepositoryProvider;

    public FeedPetUseCase_Factory(a<InventoryRepository> aVar) {
        this.inventoryRepositoryProvider = aVar;
    }

    public static FeedPetUseCase_Factory create(a<InventoryRepository> aVar) {
        return new FeedPetUseCase_Factory(aVar);
    }

    public static FeedPetUseCase newInstance(InventoryRepository inventoryRepository) {
        return new FeedPetUseCase(inventoryRepository);
    }

    @Override // cc.a
    public FeedPetUseCase get() {
        return newInstance(this.inventoryRepositoryProvider.get());
    }
}
