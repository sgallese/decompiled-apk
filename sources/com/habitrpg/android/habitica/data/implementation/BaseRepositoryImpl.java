package com.habitrpg.android.habitica.data.implementation;

import com.habitrpg.android.habitica.data.ApiClient;
import com.habitrpg.android.habitica.data.BaseRepository;
import com.habitrpg.android.habitica.data.local.BaseLocalRepository;
import com.habitrpg.android.habitica.models.BaseObject;
import com.habitrpg.android.habitica.modules.AuthenticationHandler;
import java.util.List;
import qc.q;

/* compiled from: BaseRepositoryImpl.kt */
/* loaded from: classes4.dex */
public abstract class BaseRepositoryImpl<T extends BaseLocalRepository> implements BaseRepository {
    public static final int $stable = 8;
    private final ApiClient apiClient;
    private final AuthenticationHandler authenticationHandler;
    private final T localRepository;

    public BaseRepositoryImpl(T t10, ApiClient apiClient, AuthenticationHandler authenticationHandler) {
        q.i(t10, "localRepository");
        q.i(apiClient, "apiClient");
        q.i(authenticationHandler, "authenticationHandler");
        this.localRepository = t10;
        this.apiClient = apiClient;
        this.authenticationHandler = authenticationHandler;
    }

    @Override // com.habitrpg.android.habitica.data.BaseRepository
    public void close() {
        this.localRepository.close();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final ApiClient getApiClient() {
        return this.apiClient;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final AuthenticationHandler getAuthenticationHandler() {
        return this.authenticationHandler;
    }

    public final String getCurrentUserID() {
        String currentUserID = this.authenticationHandler.getCurrentUserID();
        if (currentUserID == null) {
            return "";
        }
        return currentUserID;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final T getLocalRepository() {
        return this.localRepository;
    }

    @Override // com.habitrpg.android.habitica.data.BaseRepository
    public <T extends BaseObject> List<T> getUnmanagedCopy(List<? extends T> list) {
        q.i(list, "list");
        return this.localRepository.getUnmanagedCopy(list);
    }

    @Override // com.habitrpg.android.habitica.data.BaseRepository
    public boolean isClosed() {
        return this.localRepository.isClosed();
    }

    /* JADX WARN: Incorrect return type in method signature: <T::Lcom/habitrpg/android/habitica/models/BaseObject;>(TT;)TT; */
    @Override // com.habitrpg.android.habitica.data.BaseRepository
    public BaseObject getUnmanagedCopy(BaseObject baseObject) {
        q.i(baseObject, "obj");
        return this.localRepository.getUnmanagedCopy(baseObject);
    }
}
