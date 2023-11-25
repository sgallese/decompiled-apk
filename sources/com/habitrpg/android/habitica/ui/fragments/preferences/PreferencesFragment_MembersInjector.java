package com.habitrpg.android.habitica.ui.fragments.preferences;

import com.habitrpg.android.habitica.data.ApiClient;
import com.habitrpg.android.habitica.data.ContentRepository;
import com.habitrpg.android.habitica.data.UserRepository;
import com.habitrpg.android.habitica.helpers.AppConfigManager;
import com.habitrpg.android.habitica.helpers.SoundManager;
import com.habitrpg.android.habitica.helpers.notifications.PushNotificationManager;
import com.habitrpg.android.habitica.ui.viewmodels.MainUserViewModel;

/* loaded from: classes4.dex */
public final class PreferencesFragment_MembersInjector implements qa.a<PreferencesFragment> {
    private final cc.a<ApiClient> apiClientProvider;
    private final cc.a<AppConfigManager> configManagerProvider;
    private final cc.a<ContentRepository> contentRepositoryProvider;
    private final cc.a<PushNotificationManager> pushNotificationManagerProvider;
    private final cc.a<SoundManager> soundManagerProvider;
    private final cc.a<UserRepository> userRepositoryProvider;
    private final cc.a<MainUserViewModel> userViewModelProvider;

    public PreferencesFragment_MembersInjector(cc.a<UserRepository> aVar, cc.a<MainUserViewModel> aVar2, cc.a<ContentRepository> aVar3, cc.a<SoundManager> aVar4, cc.a<PushNotificationManager> aVar5, cc.a<AppConfigManager> aVar6, cc.a<ApiClient> aVar7) {
        this.userRepositoryProvider = aVar;
        this.userViewModelProvider = aVar2;
        this.contentRepositoryProvider = aVar3;
        this.soundManagerProvider = aVar4;
        this.pushNotificationManagerProvider = aVar5;
        this.configManagerProvider = aVar6;
        this.apiClientProvider = aVar7;
    }

    public static qa.a<PreferencesFragment> create(cc.a<UserRepository> aVar, cc.a<MainUserViewModel> aVar2, cc.a<ContentRepository> aVar3, cc.a<SoundManager> aVar4, cc.a<PushNotificationManager> aVar5, cc.a<AppConfigManager> aVar6, cc.a<ApiClient> aVar7) {
        return new PreferencesFragment_MembersInjector(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7);
    }

    public static void injectApiClient(PreferencesFragment preferencesFragment, ApiClient apiClient) {
        preferencesFragment.apiClient = apiClient;
    }

    public static void injectConfigManager(PreferencesFragment preferencesFragment, AppConfigManager appConfigManager) {
        preferencesFragment.configManager = appConfigManager;
    }

    public static void injectContentRepository(PreferencesFragment preferencesFragment, ContentRepository contentRepository) {
        preferencesFragment.contentRepository = contentRepository;
    }

    public static void injectPushNotificationManager(PreferencesFragment preferencesFragment, PushNotificationManager pushNotificationManager) {
        preferencesFragment.pushNotificationManager = pushNotificationManager;
    }

    public static void injectSoundManager(PreferencesFragment preferencesFragment, SoundManager soundManager) {
        preferencesFragment.soundManager = soundManager;
    }

    public void injectMembers(PreferencesFragment preferencesFragment) {
        BasePreferencesFragment_MembersInjector.injectUserRepository(preferencesFragment, this.userRepositoryProvider.get());
        BasePreferencesFragment_MembersInjector.injectUserViewModel(preferencesFragment, this.userViewModelProvider.get());
        injectContentRepository(preferencesFragment, this.contentRepositoryProvider.get());
        injectSoundManager(preferencesFragment, this.soundManagerProvider.get());
        injectPushNotificationManager(preferencesFragment, this.pushNotificationManagerProvider.get());
        injectConfigManager(preferencesFragment, this.configManagerProvider.get());
        injectApiClient(preferencesFragment, this.apiClientProvider.get());
    }
}
