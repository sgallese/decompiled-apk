package com.habitrpg.android.habitica.helpers;

/* loaded from: classes4.dex */
public final class SoundManager_Factory implements cc.a {
    private final cc.a<SoundFileLoader> soundFileLoaderProvider;

    public SoundManager_Factory(cc.a<SoundFileLoader> aVar) {
        this.soundFileLoaderProvider = aVar;
    }

    public static SoundManager_Factory create(cc.a<SoundFileLoader> aVar) {
        return new SoundManager_Factory(aVar);
    }

    public static SoundManager newInstance(SoundFileLoader soundFileLoader) {
        return new SoundManager(soundFileLoader);
    }

    @Override // cc.a
    public SoundManager get() {
        return newInstance(this.soundFileLoaderProvider.get());
    }
}
