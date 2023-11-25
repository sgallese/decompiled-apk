package com.habitrpg.android.habitica.modules;

import android.content.Context;
import bb.b;
import cc.a;
import com.habitrpg.android.habitica.data.ApiClient;
import com.habitrpg.android.habitica.data.ContentRepository;
import com.habitrpg.android.habitica.data.local.ContentLocalRepository;

/* loaded from: classes4.dex */
public final class RepositoryModule_ProvidesContentRepositoryFactory implements a {
    private final a<ApiClient> apiClientProvider;
    private final a<AuthenticationHandler> authenticationHandlerProvider;
    private final a<ContentLocalRepository> contentLocalRepositoryProvider;
    private final a<Context> contextProvider;
    private final RepositoryModule module;

    public RepositoryModule_ProvidesContentRepositoryFactory(RepositoryModule repositoryModule, a<ContentLocalRepository> aVar, a<ApiClient> aVar2, a<Context> aVar3, a<AuthenticationHandler> aVar4) {
        this.module = repositoryModule;
        this.contentLocalRepositoryProvider = aVar;
        this.apiClientProvider = aVar2;
        this.contextProvider = aVar3;
        this.authenticationHandlerProvider = aVar4;
    }

    public static RepositoryModule_ProvidesContentRepositoryFactory create(RepositoryModule repositoryModule, a<ContentLocalRepository> aVar, a<ApiClient> aVar2, a<Context> aVar3, a<AuthenticationHandler> aVar4) {
        return new RepositoryModule_ProvidesContentRepositoryFactory(repositoryModule, aVar, aVar2, aVar3, aVar4);
    }

    public static ContentRepository providesContentRepository(RepositoryModule repositoryModule, ContentLocalRepository contentLocalRepository, ApiClient apiClient, Context context, AuthenticationHandler authenticationHandler) {
        return (ContentRepository) b.d(repositoryModule.providesContentRepository(contentLocalRepository, apiClient, context, authenticationHandler));
    }

    @Override // cc.a
    public ContentRepository get() {
        return providesContentRepository(this.module, this.contentLocalRepositoryProvider.get(), this.apiClientProvider.get(), this.contextProvider.get(), this.authenticationHandlerProvider.get());
    }
}
