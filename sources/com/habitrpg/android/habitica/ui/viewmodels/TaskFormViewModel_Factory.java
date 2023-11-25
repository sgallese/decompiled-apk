package com.habitrpg.android.habitica.ui.viewmodels;

import com.habitrpg.android.habitica.data.UserRepository;

/* loaded from: classes4.dex */
public final class TaskFormViewModel_Factory implements cc.a {
    private final cc.a<UserRepository> userRepositoryProvider;
    private final cc.a<MainUserViewModel> userViewModelProvider;

    public TaskFormViewModel_Factory(cc.a<UserRepository> aVar, cc.a<MainUserViewModel> aVar2) {
        this.userRepositoryProvider = aVar;
        this.userViewModelProvider = aVar2;
    }

    public static TaskFormViewModel_Factory create(cc.a<UserRepository> aVar, cc.a<MainUserViewModel> aVar2) {
        return new TaskFormViewModel_Factory(aVar, aVar2);
    }

    public static TaskFormViewModel newInstance(UserRepository userRepository, MainUserViewModel mainUserViewModel) {
        return new TaskFormViewModel(userRepository, mainUserViewModel);
    }

    @Override // cc.a
    public TaskFormViewModel get() {
        return newInstance(this.userRepositoryProvider.get(), this.userViewModelProvider.get());
    }
}
