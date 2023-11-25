package com.habitrpg.android.habitica.data.implementation;

import com.habitrpg.android.habitica.data.ApiClient;
import com.habitrpg.android.habitica.data.CustomizationRepository;
import com.habitrpg.android.habitica.data.local.CustomizationLocalRepository;
import com.habitrpg.android.habitica.models.inventory.Customization;
import com.habitrpg.android.habitica.modules.AuthenticationHandler;
import com.habitrpg.android.habitica.ui.activities.TaskFormActivity;
import dd.g;
import java.util.List;
import qc.q;

/* compiled from: CustomizationRepositoryImpl.kt */
/* loaded from: classes4.dex */
public final class CustomizationRepositoryImpl extends BaseRepositoryImpl<CustomizationLocalRepository> implements CustomizationRepository {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomizationRepositoryImpl(CustomizationLocalRepository customizationLocalRepository, ApiClient apiClient, AuthenticationHandler authenticationHandler) {
        super(customizationLocalRepository, apiClient, authenticationHandler);
        q.i(customizationLocalRepository, "localRepository");
        q.i(apiClient, "apiClient");
        q.i(authenticationHandler, "authenticationHandler");
    }

    @Override // com.habitrpg.android.habitica.data.CustomizationRepository
    public g<List<Customization>> getCustomizations(String str, String str2, boolean z10) {
        q.i(str, TaskFormActivity.TASK_TYPE_KEY);
        return getLocalRepository().getCustomizations(str, str2, z10);
    }
}
