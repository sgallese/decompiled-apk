package com.habitrpg.android.habitica.data.implementation;

import com.habitrpg.android.habitica.data.ApiClient;
import com.habitrpg.android.habitica.data.TutorialRepository;
import com.habitrpg.android.habitica.data.local.TutorialLocalRepository;
import com.habitrpg.android.habitica.models.TutorialStep;
import com.habitrpg.android.habitica.modules.AuthenticationHandler;
import dd.g;
import java.util.List;
import qc.q;

/* compiled from: TutorialRepositoryImpl.kt */
/* loaded from: classes4.dex */
public final class TutorialRepositoryImpl extends BaseRepositoryImpl<TutorialLocalRepository> implements TutorialRepository {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TutorialRepositoryImpl(TutorialLocalRepository tutorialLocalRepository, ApiClient apiClient, AuthenticationHandler authenticationHandler) {
        super(tutorialLocalRepository, apiClient, authenticationHandler);
        q.i(tutorialLocalRepository, "localRepository");
        q.i(apiClient, "apiClient");
        q.i(authenticationHandler, "authenticationHandler");
    }

    @Override // com.habitrpg.android.habitica.data.TutorialRepository
    public g<TutorialStep> getTutorialStep(String str) {
        q.i(str, "key");
        return getLocalRepository().getTutorialStep(str);
    }

    @Override // com.habitrpg.android.habitica.data.TutorialRepository
    public g<List<TutorialStep>> getTutorialSteps(List<String> list) {
        q.i(list, "keys");
        return getLocalRepository().getTutorialSteps(list);
    }
}
