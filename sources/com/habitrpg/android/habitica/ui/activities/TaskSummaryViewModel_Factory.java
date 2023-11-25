package com.habitrpg.android.habitica.ui.activities;

import com.habitrpg.android.habitica.data.SocialRepository;
import com.habitrpg.android.habitica.data.TaskRepository;
import com.habitrpg.android.habitica.data.UserRepository;
import com.habitrpg.android.habitica.ui.viewmodels.MainUserViewModel;

/* loaded from: classes4.dex */
public final class TaskSummaryViewModel_Factory implements cc.a {
    private final cc.a<androidx.lifecycle.n0> savedStateHandleProvider;
    private final cc.a<SocialRepository> socialRepositoryProvider;
    private final cc.a<TaskRepository> taskRepositoryProvider;
    private final cc.a<UserRepository> userRepositoryProvider;
    private final cc.a<MainUserViewModel> userViewModelProvider;

    public TaskSummaryViewModel_Factory(cc.a<androidx.lifecycle.n0> aVar, cc.a<UserRepository> aVar2, cc.a<MainUserViewModel> aVar3, cc.a<TaskRepository> aVar4, cc.a<SocialRepository> aVar5) {
        this.savedStateHandleProvider = aVar;
        this.userRepositoryProvider = aVar2;
        this.userViewModelProvider = aVar3;
        this.taskRepositoryProvider = aVar4;
        this.socialRepositoryProvider = aVar5;
    }

    public static TaskSummaryViewModel_Factory create(cc.a<androidx.lifecycle.n0> aVar, cc.a<UserRepository> aVar2, cc.a<MainUserViewModel> aVar3, cc.a<TaskRepository> aVar4, cc.a<SocialRepository> aVar5) {
        return new TaskSummaryViewModel_Factory(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static TaskSummaryViewModel newInstance(androidx.lifecycle.n0 n0Var, UserRepository userRepository, MainUserViewModel mainUserViewModel, TaskRepository taskRepository, SocialRepository socialRepository) {
        return new TaskSummaryViewModel(n0Var, userRepository, mainUserViewModel, taskRepository, socialRepository);
    }

    @Override // cc.a
    public TaskSummaryViewModel get() {
        return newInstance(this.savedStateHandleProvider.get(), this.userRepositoryProvider.get(), this.userViewModelProvider.get(), this.taskRepositoryProvider.get(), this.socialRepositoryProvider.get());
    }
}
