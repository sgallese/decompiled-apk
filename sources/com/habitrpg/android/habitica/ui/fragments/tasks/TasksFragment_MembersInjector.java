package com.habitrpg.android.habitica.ui.fragments.tasks;

import com.habitrpg.android.habitica.data.TagRepository;
import com.habitrpg.android.habitica.data.TutorialRepository;
import com.habitrpg.android.habitica.data.UserRepository;
import com.habitrpg.android.habitica.helpers.SoundManager;
import com.habitrpg.android.habitica.ui.fragments.BaseFragment_MembersInjector;
import com.habitrpg.android.habitica.ui.fragments.BaseMainFragment_MembersInjector;

/* loaded from: classes4.dex */
public final class TasksFragment_MembersInjector implements qa.a<TasksFragment> {
    private final cc.a<SoundManager> soundManagerProvider;
    private final cc.a<TagRepository> tagRepositoryProvider;
    private final cc.a<TutorialRepository> tutorialRepositoryProvider;
    private final cc.a<UserRepository> userRepositoryProvider;

    public TasksFragment_MembersInjector(cc.a<TutorialRepository> aVar, cc.a<UserRepository> aVar2, cc.a<SoundManager> aVar3, cc.a<TagRepository> aVar4) {
        this.tutorialRepositoryProvider = aVar;
        this.userRepositoryProvider = aVar2;
        this.soundManagerProvider = aVar3;
        this.tagRepositoryProvider = aVar4;
    }

    public static qa.a<TasksFragment> create(cc.a<TutorialRepository> aVar, cc.a<UserRepository> aVar2, cc.a<SoundManager> aVar3, cc.a<TagRepository> aVar4) {
        return new TasksFragment_MembersInjector(aVar, aVar2, aVar3, aVar4);
    }

    public static void injectTagRepository(TasksFragment tasksFragment, TagRepository tagRepository) {
        tasksFragment.tagRepository = tagRepository;
    }

    public void injectMembers(TasksFragment tasksFragment) {
        BaseFragment_MembersInjector.injectTutorialRepository(tasksFragment, this.tutorialRepositoryProvider.get());
        BaseMainFragment_MembersInjector.injectUserRepository(tasksFragment, this.userRepositoryProvider.get());
        BaseMainFragment_MembersInjector.injectSoundManager(tasksFragment, this.soundManagerProvider.get());
        injectTagRepository(tasksFragment, this.tagRepositoryProvider.get());
    }
}
