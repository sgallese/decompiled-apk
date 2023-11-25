package com.habitrpg.android.habitica.ui.viewmodels;

import androidx.lifecycle.n0;
import com.habitrpg.android.habitica.data.InventoryRepository;
import com.habitrpg.android.habitica.data.UserRepository;

/* loaded from: classes4.dex */
public final class StableViewModel_Factory implements cc.a {
    private final cc.a<InventoryRepository> inventoryRepositoryProvider;
    private final cc.a<n0> savedStateHandleProvider;
    private final cc.a<UserRepository> userRepositoryProvider;
    private final cc.a<MainUserViewModel> userViewModelProvider;

    public StableViewModel_Factory(cc.a<n0> aVar, cc.a<UserRepository> aVar2, cc.a<MainUserViewModel> aVar3, cc.a<InventoryRepository> aVar4) {
        this.savedStateHandleProvider = aVar;
        this.userRepositoryProvider = aVar2;
        this.userViewModelProvider = aVar3;
        this.inventoryRepositoryProvider = aVar4;
    }

    public static StableViewModel_Factory create(cc.a<n0> aVar, cc.a<UserRepository> aVar2, cc.a<MainUserViewModel> aVar3, cc.a<InventoryRepository> aVar4) {
        return new StableViewModel_Factory(aVar, aVar2, aVar3, aVar4);
    }

    public static StableViewModel newInstance(n0 n0Var, UserRepository userRepository, MainUserViewModel mainUserViewModel, InventoryRepository inventoryRepository) {
        return new StableViewModel(n0Var, userRepository, mainUserViewModel, inventoryRepository);
    }

    @Override // cc.a
    public StableViewModel get() {
        return newInstance(this.savedStateHandleProvider.get(), this.userRepositoryProvider.get(), this.userViewModelProvider.get(), this.inventoryRepositoryProvider.get());
    }
}
