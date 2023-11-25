package com.habitrpg.android.habitica.modules;

import android.content.Context;
import com.habitrpg.android.habitica.data.ApiClient;
import com.habitrpg.android.habitica.data.ContentRepository;
import com.habitrpg.android.habitica.data.implementation.ContentRepositoryImpl;
import com.habitrpg.android.habitica.data.local.ContentLocalRepository;
import com.habitrpg.android.habitica.data.local.implementation.RealmContentLocalRepository;
import io.realm.o0;
import qc.q;

/* compiled from: RepositoryModule.kt */
/* loaded from: classes4.dex */
public class RepositoryModule {
    public static final int $stable = 0;

    public final ContentLocalRepository providesContentLocalRepository(o0 o0Var) {
        q.i(o0Var, "realm");
        return new RealmContentLocalRepository(o0Var);
    }

    public final ContentRepository providesContentRepository(ContentLocalRepository contentLocalRepository, ApiClient apiClient, Context context, AuthenticationHandler authenticationHandler) {
        q.i(contentLocalRepository, "contentLocalRepository");
        q.i(apiClient, "apiClient");
        q.i(context, "context");
        q.i(authenticationHandler, "authenticationHandler");
        return new ContentRepositoryImpl(contentLocalRepository, apiClient, context, authenticationHandler);
    }

    public o0 providesRealm() {
        o0 Z0 = o0.Z0();
        q.h(Z0, "getDefaultInstance(...)");
        return Z0;
    }
}
