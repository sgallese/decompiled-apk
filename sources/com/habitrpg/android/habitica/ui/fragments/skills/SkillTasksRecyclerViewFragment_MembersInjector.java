package com.habitrpg.android.habitica.ui.fragments.skills;

import com.habitrpg.android.habitica.data.TaskRepository;
import com.habitrpg.android.habitica.data.TutorialRepository;
import com.habitrpg.android.habitica.ui.fragments.BaseFragment_MembersInjector;
import com.habitrpg.android.habitica.ui.viewmodels.MainUserViewModel;

/* loaded from: classes4.dex */
public final class SkillTasksRecyclerViewFragment_MembersInjector implements qa.a<SkillTasksRecyclerViewFragment> {
    private final cc.a<TaskRepository> taskRepositoryProvider;
    private final cc.a<TutorialRepository> tutorialRepositoryProvider;
    private final cc.a<MainUserViewModel> userViewModelProvider;

    public SkillTasksRecyclerViewFragment_MembersInjector(cc.a<TutorialRepository> aVar, cc.a<TaskRepository> aVar2, cc.a<MainUserViewModel> aVar3) {
        this.tutorialRepositoryProvider = aVar;
        this.taskRepositoryProvider = aVar2;
        this.userViewModelProvider = aVar3;
    }

    public static qa.a<SkillTasksRecyclerViewFragment> create(cc.a<TutorialRepository> aVar, cc.a<TaskRepository> aVar2, cc.a<MainUserViewModel> aVar3) {
        return new SkillTasksRecyclerViewFragment_MembersInjector(aVar, aVar2, aVar3);
    }

    public static void injectTaskRepository(SkillTasksRecyclerViewFragment skillTasksRecyclerViewFragment, TaskRepository taskRepository) {
        skillTasksRecyclerViewFragment.taskRepository = taskRepository;
    }

    public static void injectUserViewModel(SkillTasksRecyclerViewFragment skillTasksRecyclerViewFragment, MainUserViewModel mainUserViewModel) {
        skillTasksRecyclerViewFragment.userViewModel = mainUserViewModel;
    }

    public void injectMembers(SkillTasksRecyclerViewFragment skillTasksRecyclerViewFragment) {
        BaseFragment_MembersInjector.injectTutorialRepository(skillTasksRecyclerViewFragment, this.tutorialRepositoryProvider.get());
        injectTaskRepository(skillTasksRecyclerViewFragment, this.taskRepositoryProvider.get());
        injectUserViewModel(skillTasksRecyclerViewFragment, this.userViewModelProvider.get());
    }
}
