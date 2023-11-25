package com.habitrpg.android.habitica.interactors;

import cc.a;
import com.habitrpg.android.habitica.data.TaskRepository;
import com.habitrpg.android.habitica.helpers.SoundManager;

/* loaded from: classes4.dex */
public final class BuyRewardUseCase_Factory implements a {
    private final a<SoundManager> soundManagerProvider;
    private final a<TaskRepository> taskRepositoryProvider;

    public BuyRewardUseCase_Factory(a<TaskRepository> aVar, a<SoundManager> aVar2) {
        this.taskRepositoryProvider = aVar;
        this.soundManagerProvider = aVar2;
    }

    public static BuyRewardUseCase_Factory create(a<TaskRepository> aVar, a<SoundManager> aVar2) {
        return new BuyRewardUseCase_Factory(aVar, aVar2);
    }

    public static BuyRewardUseCase newInstance(TaskRepository taskRepository, SoundManager soundManager) {
        return new BuyRewardUseCase(taskRepository, soundManager);
    }

    @Override // cc.a
    public BuyRewardUseCase get() {
        return newInstance(this.taskRepositoryProvider.get(), this.soundManagerProvider.get());
    }
}
