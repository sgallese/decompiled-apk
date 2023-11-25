package com.habitrpg.android.habitica.modules;

import android.content.Context;
import com.habitrpg.android.habitica.data.ApiClient;
import com.habitrpg.android.habitica.data.ChallengeRepository;
import com.habitrpg.android.habitica.data.CustomizationRepository;
import com.habitrpg.android.habitica.data.FAQRepository;
import com.habitrpg.android.habitica.data.InventoryRepository;
import com.habitrpg.android.habitica.data.SetupCustomizationRepository;
import com.habitrpg.android.habitica.data.SocialRepository;
import com.habitrpg.android.habitica.data.TagRepository;
import com.habitrpg.android.habitica.data.TaskRepository;
import com.habitrpg.android.habitica.data.TutorialRepository;
import com.habitrpg.android.habitica.data.UserRepository;
import com.habitrpg.android.habitica.data.implementation.ChallengeRepositoryImpl;
import com.habitrpg.android.habitica.data.implementation.CustomizationRepositoryImpl;
import com.habitrpg.android.habitica.data.implementation.FAQRepositoryImpl;
import com.habitrpg.android.habitica.data.implementation.InventoryRepositoryImpl;
import com.habitrpg.android.habitica.data.implementation.SetupCustomizationRepositoryImpl;
import com.habitrpg.android.habitica.data.implementation.SocialRepositoryImpl;
import com.habitrpg.android.habitica.data.implementation.TagRepositoryImpl;
import com.habitrpg.android.habitica.data.implementation.TaskRepositoryImpl;
import com.habitrpg.android.habitica.data.implementation.TutorialRepositoryImpl;
import com.habitrpg.android.habitica.data.implementation.UserRepositoryImpl;
import com.habitrpg.android.habitica.data.local.ChallengeLocalRepository;
import com.habitrpg.android.habitica.data.local.CustomizationLocalRepository;
import com.habitrpg.android.habitica.data.local.FAQLocalRepository;
import com.habitrpg.android.habitica.data.local.InventoryLocalRepository;
import com.habitrpg.android.habitica.data.local.SocialLocalRepository;
import com.habitrpg.android.habitica.data.local.TagLocalRepository;
import com.habitrpg.android.habitica.data.local.TaskLocalRepository;
import com.habitrpg.android.habitica.data.local.TutorialLocalRepository;
import com.habitrpg.android.habitica.data.local.UserLocalRepository;
import com.habitrpg.android.habitica.data.local.implementation.RealmChallengeLocalRepository;
import com.habitrpg.android.habitica.data.local.implementation.RealmCustomizationLocalRepository;
import com.habitrpg.android.habitica.data.local.implementation.RealmFAQLocalRepository;
import com.habitrpg.android.habitica.data.local.implementation.RealmInventoryLocalRepository;
import com.habitrpg.android.habitica.data.local.implementation.RealmSocialLocalRepository;
import com.habitrpg.android.habitica.data.local.implementation.RealmTagLocalRepository;
import com.habitrpg.android.habitica.data.local.implementation.RealmTaskLocalRepository;
import com.habitrpg.android.habitica.data.local.implementation.RealmTutorialLocalRepository;
import com.habitrpg.android.habitica.data.local.implementation.RealmUserLocalRepository;
import com.habitrpg.android.habitica.helpers.AppConfigManager;
import com.habitrpg.android.habitica.helpers.PurchaseHandler;
import com.habitrpg.android.habitica.ui.viewmodels.MainUserViewModel;
import io.realm.o0;
import qc.q;

/* compiled from: UserRepositoryModule.kt */
/* loaded from: classes4.dex */
public final class UserRepositoryModule {
    public static final int $stable = 0;

    public final ChallengeLocalRepository provideChallengeLocalRepository(o0 o0Var) {
        q.i(o0Var, "realm");
        return new RealmChallengeLocalRepository(o0Var);
    }

    public final ChallengeRepository providesChallengeRepository(ChallengeLocalRepository challengeLocalRepository, ApiClient apiClient, AuthenticationHandler authenticationHandler) {
        q.i(challengeLocalRepository, "localRepository");
        q.i(apiClient, "apiClient");
        q.i(authenticationHandler, "authenticationHandler");
        return new ChallengeRepositoryImpl(challengeLocalRepository, apiClient, authenticationHandler);
    }

    public final CustomizationLocalRepository providesCustomizationLocalRepository(o0 o0Var) {
        q.i(o0Var, "realm");
        return new RealmCustomizationLocalRepository(o0Var);
    }

    public final CustomizationRepository providesCustomizationRepository(CustomizationLocalRepository customizationLocalRepository, ApiClient apiClient, AuthenticationHandler authenticationHandler) {
        q.i(customizationLocalRepository, "localRepository");
        q.i(apiClient, "apiClient");
        q.i(authenticationHandler, "authenticationHandler");
        return new CustomizationRepositoryImpl(customizationLocalRepository, apiClient, authenticationHandler);
    }

    public final FAQLocalRepository providesFAQLocalRepository(o0 o0Var) {
        q.i(o0Var, "realm");
        return new RealmFAQLocalRepository(o0Var);
    }

    public final FAQRepository providesFAQRepository(FAQLocalRepository fAQLocalRepository, ApiClient apiClient, AuthenticationHandler authenticationHandler) {
        q.i(fAQLocalRepository, "localRepository");
        q.i(apiClient, "apiClient");
        q.i(authenticationHandler, "authenticationHandler");
        return new FAQRepositoryImpl(fAQLocalRepository, apiClient, authenticationHandler);
    }

    public final InventoryLocalRepository providesInventoryLocalRepository(o0 o0Var) {
        q.i(o0Var, "realm");
        return new RealmInventoryLocalRepository(o0Var);
    }

    public final InventoryRepository providesInventoryRepository(InventoryLocalRepository inventoryLocalRepository, ApiClient apiClient, AuthenticationHandler authenticationHandler, AppConfigManager appConfigManager) {
        q.i(inventoryLocalRepository, "localRepository");
        q.i(apiClient, "apiClient");
        q.i(authenticationHandler, "authenticationHandler");
        q.i(appConfigManager, "remoteConfig");
        return new InventoryRepositoryImpl(inventoryLocalRepository, apiClient, authenticationHandler, appConfigManager);
    }

    public final PurchaseHandler providesPurchaseHandler(Context context, ApiClient apiClient, MainUserViewModel mainUserViewModel) {
        q.i(context, "context");
        q.i(apiClient, "apiClient");
        q.i(mainUserViewModel, "userViewModel");
        return new PurchaseHandler(context, apiClient, mainUserViewModel);
    }

    public final SetupCustomizationRepository providesSetupCustomizationRepository(Context context) {
        q.i(context, "context");
        return new SetupCustomizationRepositoryImpl(context);
    }

    public final SocialLocalRepository providesSocialLocalRepository(o0 o0Var) {
        q.i(o0Var, "realm");
        return new RealmSocialLocalRepository(o0Var);
    }

    public final SocialRepository providesSocialRepository(SocialLocalRepository socialLocalRepository, ApiClient apiClient, AuthenticationHandler authenticationHandler) {
        q.i(socialLocalRepository, "localRepository");
        q.i(apiClient, "apiClient");
        q.i(authenticationHandler, "authenticationHandler");
        return new SocialRepositoryImpl(socialLocalRepository, apiClient, authenticationHandler);
    }

    public final TagLocalRepository providesTagLocalRepository(o0 o0Var) {
        q.i(o0Var, "realm");
        return new RealmTagLocalRepository(o0Var);
    }

    public final TagRepository providesTagRepository(TagLocalRepository tagLocalRepository, ApiClient apiClient, AuthenticationHandler authenticationHandler) {
        q.i(tagLocalRepository, "localRepository");
        q.i(apiClient, "apiClient");
        q.i(authenticationHandler, "authenticationHandler");
        return new TagRepositoryImpl(tagLocalRepository, apiClient, authenticationHandler);
    }

    public final TaskLocalRepository providesTaskLocalRepository(o0 o0Var) {
        q.i(o0Var, "realm");
        return new RealmTaskLocalRepository(o0Var);
    }

    public final TaskRepository providesTaskRepository(TaskLocalRepository taskLocalRepository, ApiClient apiClient, AuthenticationHandler authenticationHandler, AppConfigManager appConfigManager) {
        q.i(taskLocalRepository, "localRepository");
        q.i(apiClient, "apiClient");
        q.i(authenticationHandler, "authenticationHandler");
        q.i(appConfigManager, "appConfigManager");
        return new TaskRepositoryImpl(taskLocalRepository, apiClient, authenticationHandler, appConfigManager);
    }

    public final TutorialLocalRepository providesTutorialLocalRepository(o0 o0Var) {
        q.i(o0Var, "realm");
        return new RealmTutorialLocalRepository(o0Var);
    }

    public final TutorialRepository providesTutorialRepository(TutorialLocalRepository tutorialLocalRepository, ApiClient apiClient, AuthenticationHandler authenticationHandler) {
        q.i(tutorialLocalRepository, "localRepository");
        q.i(apiClient, "apiClient");
        q.i(authenticationHandler, "authenticationHandler");
        return new TutorialRepositoryImpl(tutorialLocalRepository, apiClient, authenticationHandler);
    }

    public final UserLocalRepository providesUserLocalRepository(o0 o0Var) {
        q.i(o0Var, "realm");
        return new RealmUserLocalRepository(o0Var);
    }

    public final UserRepository providesUserRepository(UserLocalRepository userLocalRepository, ApiClient apiClient, AuthenticationHandler authenticationHandler, TaskRepository taskRepository, AppConfigManager appConfigManager) {
        q.i(userLocalRepository, "localRepository");
        q.i(apiClient, "apiClient");
        q.i(authenticationHandler, "authenticationHandler");
        q.i(taskRepository, "taskRepository");
        q.i(appConfigManager, "appConfigManager");
        return new UserRepositoryImpl(userLocalRepository, apiClient, authenticationHandler, taskRepository, appConfigManager);
    }
}
