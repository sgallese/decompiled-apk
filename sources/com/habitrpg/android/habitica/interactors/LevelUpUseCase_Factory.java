package com.habitrpg.android.habitica.interactors;

import cc.a;
import com.habitrpg.android.habitica.helpers.SoundManager;

/* loaded from: classes4.dex */
public final class LevelUpUseCase_Factory implements a {
    private final a<CheckClassSelectionUseCase> checkClassSelectionUseCaseProvider;
    private final a<SoundManager> soundManagerProvider;

    public LevelUpUseCase_Factory(a<SoundManager> aVar, a<CheckClassSelectionUseCase> aVar2) {
        this.soundManagerProvider = aVar;
        this.checkClassSelectionUseCaseProvider = aVar2;
    }

    public static LevelUpUseCase_Factory create(a<SoundManager> aVar, a<CheckClassSelectionUseCase> aVar2) {
        return new LevelUpUseCase_Factory(aVar, aVar2);
    }

    public static LevelUpUseCase newInstance(SoundManager soundManager, CheckClassSelectionUseCase checkClassSelectionUseCase) {
        return new LevelUpUseCase(soundManager, checkClassSelectionUseCase);
    }

    @Override // cc.a
    public LevelUpUseCase get() {
        return newInstance(this.soundManagerProvider.get(), this.checkClassSelectionUseCaseProvider.get());
    }
}
