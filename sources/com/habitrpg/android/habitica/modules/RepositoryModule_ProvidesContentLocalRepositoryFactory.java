package com.habitrpg.android.habitica.modules;

import bb.b;
import cc.a;
import com.habitrpg.android.habitica.data.local.ContentLocalRepository;
import io.realm.o0;

/* loaded from: classes4.dex */
public final class RepositoryModule_ProvidesContentLocalRepositoryFactory implements a {
    private final RepositoryModule module;
    private final a<o0> realmProvider;

    public RepositoryModule_ProvidesContentLocalRepositoryFactory(RepositoryModule repositoryModule, a<o0> aVar) {
        this.module = repositoryModule;
        this.realmProvider = aVar;
    }

    public static RepositoryModule_ProvidesContentLocalRepositoryFactory create(RepositoryModule repositoryModule, a<o0> aVar) {
        return new RepositoryModule_ProvidesContentLocalRepositoryFactory(repositoryModule, aVar);
    }

    public static ContentLocalRepository providesContentLocalRepository(RepositoryModule repositoryModule, o0 o0Var) {
        return (ContentLocalRepository) b.d(repositoryModule.providesContentLocalRepository(o0Var));
    }

    @Override // cc.a
    public ContentLocalRepository get() {
        return providesContentLocalRepository(this.module, this.realmProvider.get());
    }
}
