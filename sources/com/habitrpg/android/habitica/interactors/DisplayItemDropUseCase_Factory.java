package com.habitrpg.android.habitica.interactors;

import cc.a;
import com.habitrpg.android.habitica.helpers.SoundManager;

/* loaded from: classes4.dex */
public final class DisplayItemDropUseCase_Factory implements a {
    private final a<SoundManager> soundManagerProvider;

    public DisplayItemDropUseCase_Factory(a<SoundManager> aVar) {
        this.soundManagerProvider = aVar;
    }

    public static DisplayItemDropUseCase_Factory create(a<SoundManager> aVar) {
        return new DisplayItemDropUseCase_Factory(aVar);
    }

    public static DisplayItemDropUseCase newInstance(SoundManager soundManager) {
        return new DisplayItemDropUseCase(soundManager);
    }

    @Override // cc.a
    public DisplayItemDropUseCase get() {
        return newInstance(this.soundManagerProvider.get());
    }
}
