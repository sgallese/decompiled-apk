package com.habitrpg.android.habitica.modules;

import bb.b;
import cc.a;
import io.realm.o0;

/* loaded from: classes4.dex */
public final class RepositoryModule_ProvidesRealmFactory implements a {
    private final RepositoryModule module;

    public RepositoryModule_ProvidesRealmFactory(RepositoryModule repositoryModule) {
        this.module = repositoryModule;
    }

    public static RepositoryModule_ProvidesRealmFactory create(RepositoryModule repositoryModule) {
        return new RepositoryModule_ProvidesRealmFactory(repositoryModule);
    }

    public static o0 providesRealm(RepositoryModule repositoryModule) {
        return (o0) b.d(repositoryModule.providesRealm());
    }

    @Override // cc.a
    public o0 get() {
        return providesRealm(this.module);
    }
}
