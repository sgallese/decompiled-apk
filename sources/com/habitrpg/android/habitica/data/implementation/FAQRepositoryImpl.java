package com.habitrpg.android.habitica.data.implementation;

import com.habitrpg.android.habitica.data.ApiClient;
import com.habitrpg.android.habitica.data.FAQRepository;
import com.habitrpg.android.habitica.data.local.FAQLocalRepository;
import com.habitrpg.android.habitica.models.FAQArticle;
import com.habitrpg.android.habitica.modules.AuthenticationHandler;
import dd.g;
import java.util.List;
import qc.q;

/* compiled from: FAQRepositoryImpl.kt */
/* loaded from: classes4.dex */
public final class FAQRepositoryImpl extends BaseRepositoryImpl<FAQLocalRepository> implements FAQRepository {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FAQRepositoryImpl(FAQLocalRepository fAQLocalRepository, ApiClient apiClient, AuthenticationHandler authenticationHandler) {
        super(fAQLocalRepository, apiClient, authenticationHandler);
        q.i(fAQLocalRepository, "localRepository");
        q.i(apiClient, "apiClient");
        q.i(authenticationHandler, "authenticationHandler");
    }

    @Override // com.habitrpg.android.habitica.data.FAQRepository
    public g<FAQArticle> getArticle(int i10) {
        return getLocalRepository().getArticle(i10);
    }

    @Override // com.habitrpg.android.habitica.data.FAQRepository
    public g<List<FAQArticle>> getArticles() {
        return getLocalRepository().getArticles();
    }
}
