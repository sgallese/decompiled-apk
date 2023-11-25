package com.habitrpg.android.habitica;

import android.app.Activity;
import android.app.Service;
import android.content.SharedPreferences;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.n0;
import androidx.lifecycle.v0;
import com.habitrpg.android.habitica.HabiticaBaseApplication_HiltComponents;
import com.habitrpg.android.habitica.api.MaintenanceApiService;
import com.habitrpg.android.habitica.data.ApiClient;
import com.habitrpg.android.habitica.data.ChallengeRepository;
import com.habitrpg.android.habitica.data.ContentRepository;
import com.habitrpg.android.habitica.data.CustomizationRepository;
import com.habitrpg.android.habitica.data.FAQRepository;
import com.habitrpg.android.habitica.data.InventoryRepository;
import com.habitrpg.android.habitica.data.SetupCustomizationRepository;
import com.habitrpg.android.habitica.data.SocialRepository;
import com.habitrpg.android.habitica.data.TagRepository;
import com.habitrpg.android.habitica.data.TaskRepository;
import com.habitrpg.android.habitica.data.TutorialRepository;
import com.habitrpg.android.habitica.data.UserRepository;
import com.habitrpg.android.habitica.data.local.ChallengeLocalRepository;
import com.habitrpg.android.habitica.data.local.ContentLocalRepository;
import com.habitrpg.android.habitica.data.local.CustomizationLocalRepository;
import com.habitrpg.android.habitica.data.local.FAQLocalRepository;
import com.habitrpg.android.habitica.data.local.InventoryLocalRepository;
import com.habitrpg.android.habitica.data.local.SocialLocalRepository;
import com.habitrpg.android.habitica.data.local.TagLocalRepository;
import com.habitrpg.android.habitica.data.local.TaskLocalRepository;
import com.habitrpg.android.habitica.data.local.TutorialLocalRepository;
import com.habitrpg.android.habitica.data.local.UserLocalRepository;
import com.habitrpg.android.habitica.helpers.AppConfigManager;
import com.habitrpg.android.habitica.helpers.NotificationsManager;
import com.habitrpg.android.habitica.helpers.PurchaseHandler;
import com.habitrpg.android.habitica.helpers.ReviewManager;
import com.habitrpg.android.habitica.helpers.SoundFileLoader;
import com.habitrpg.android.habitica.helpers.SoundManager;
import com.habitrpg.android.habitica.helpers.TaskAlarmManager;
import com.habitrpg.android.habitica.helpers.notifications.HabiticaFirebaseMessagingService;
import com.habitrpg.android.habitica.helpers.notifications.HabiticaFirebaseMessagingService_MembersInjector;
import com.habitrpg.android.habitica.helpers.notifications.PushNotificationManager;
import com.habitrpg.android.habitica.interactors.CheckClassSelectionUseCase;
import com.habitrpg.android.habitica.interactors.DisplayItemDropUseCase;
import com.habitrpg.android.habitica.interactors.FeedPetUseCase;
import com.habitrpg.android.habitica.interactors.HatchPetUseCase;
import com.habitrpg.android.habitica.interactors.InsufficientGemsUseCase;
import com.habitrpg.android.habitica.interactors.LevelUpUseCase;
import com.habitrpg.android.habitica.interactors.NotifyUserUseCase;
import com.habitrpg.android.habitica.modules.ApiModule;
import com.habitrpg.android.habitica.modules.ApiModule_ProvidesApiHelperFactory;
import com.habitrpg.android.habitica.modules.ApiModule_ProvidesGsonConverterFactoryFactory;
import com.habitrpg.android.habitica.modules.ApiModule_ProvidesHostConfigFactory;
import com.habitrpg.android.habitica.modules.ApiModule_ProvidesMaintenanceApiServiceFactory;
import com.habitrpg.android.habitica.modules.ApiModule_ProvidesPopupNotificationsManagerFactory;
import com.habitrpg.android.habitica.modules.AppModule;
import com.habitrpg.android.habitica.modules.AppModule_ProvideSharedPreferencesFactory;
import com.habitrpg.android.habitica.modules.AppModule_ProvidesAuthenticationHandlerFactory;
import com.habitrpg.android.habitica.modules.AppModule_ProvidesRemoteConfigManagerFactory;
import com.habitrpg.android.habitica.modules.AppModule_ProvidesReviewManagerFactory;
import com.habitrpg.android.habitica.modules.AppModule_ProvidesSoundFileLoaderFactory;
import com.habitrpg.android.habitica.modules.AppModule_PushNotificationManagerFactory;
import com.habitrpg.android.habitica.modules.AuthenticationHandler;
import com.habitrpg.android.habitica.modules.DeveloperModule;
import com.habitrpg.android.habitica.modules.RepositoryModule;
import com.habitrpg.android.habitica.modules.RepositoryModule_ProvidesContentLocalRepositoryFactory;
import com.habitrpg.android.habitica.modules.RepositoryModule_ProvidesContentRepositoryFactory;
import com.habitrpg.android.habitica.modules.RepositoryModule_ProvidesRealmFactory;
import com.habitrpg.android.habitica.modules.UserModule;
import com.habitrpg.android.habitica.modules.UserModule_ProvidesTaskAlarmManagerFactory;
import com.habitrpg.android.habitica.modules.UserModule_ProvidesUserViewModelFactory;
import com.habitrpg.android.habitica.modules.UserRepositoryModule;
import com.habitrpg.android.habitica.modules.UserRepositoryModule_ProvideChallengeLocalRepositoryFactory;
import com.habitrpg.android.habitica.modules.UserRepositoryModule_ProvidesChallengeRepositoryFactory;
import com.habitrpg.android.habitica.modules.UserRepositoryModule_ProvidesCustomizationLocalRepositoryFactory;
import com.habitrpg.android.habitica.modules.UserRepositoryModule_ProvidesCustomizationRepositoryFactory;
import com.habitrpg.android.habitica.modules.UserRepositoryModule_ProvidesFAQLocalRepositoryFactory;
import com.habitrpg.android.habitica.modules.UserRepositoryModule_ProvidesFAQRepositoryFactory;
import com.habitrpg.android.habitica.modules.UserRepositoryModule_ProvidesInventoryLocalRepositoryFactory;
import com.habitrpg.android.habitica.modules.UserRepositoryModule_ProvidesInventoryRepositoryFactory;
import com.habitrpg.android.habitica.modules.UserRepositoryModule_ProvidesPurchaseHandlerFactory;
import com.habitrpg.android.habitica.modules.UserRepositoryModule_ProvidesSetupCustomizationRepositoryFactory;
import com.habitrpg.android.habitica.modules.UserRepositoryModule_ProvidesSocialLocalRepositoryFactory;
import com.habitrpg.android.habitica.modules.UserRepositoryModule_ProvidesSocialRepositoryFactory;
import com.habitrpg.android.habitica.modules.UserRepositoryModule_ProvidesTagLocalRepositoryFactory;
import com.habitrpg.android.habitica.modules.UserRepositoryModule_ProvidesTagRepositoryFactory;
import com.habitrpg.android.habitica.modules.UserRepositoryModule_ProvidesTaskLocalRepositoryFactory;
import com.habitrpg.android.habitica.modules.UserRepositoryModule_ProvidesTaskRepositoryFactory;
import com.habitrpg.android.habitica.modules.UserRepositoryModule_ProvidesTutorialLocalRepositoryFactory;
import com.habitrpg.android.habitica.modules.UserRepositoryModule_ProvidesTutorialRepositoryFactory;
import com.habitrpg.android.habitica.modules.UserRepositoryModule_ProvidesUserLocalRepositoryFactory;
import com.habitrpg.android.habitica.modules.UserRepositoryModule_ProvidesUserRepositoryFactory;
import com.habitrpg.android.habitica.receivers.DeviceCommunicationService;
import com.habitrpg.android.habitica.receivers.DeviceCommunicationService_MembersInjector;
import com.habitrpg.android.habitica.receivers.LocalNotificationActionReceiver;
import com.habitrpg.android.habitica.receivers.LocalNotificationActionReceiver_MembersInjector;
import com.habitrpg.android.habitica.receivers.NotificationPublisher;
import com.habitrpg.android.habitica.receivers.NotificationPublisher_MembersInjector;
import com.habitrpg.android.habitica.receivers.TaskAlarmBootReceiver;
import com.habitrpg.android.habitica.receivers.TaskAlarmBootReceiver_MembersInjector;
import com.habitrpg.android.habitica.receivers.TaskReceiver;
import com.habitrpg.android.habitica.receivers.TaskReceiver_MembersInjector;
import com.habitrpg.android.habitica.ui.activities.AddTaskWidgetActivity;
import com.habitrpg.android.habitica.ui.activities.AdventureGuideActivity;
import com.habitrpg.android.habitica.ui.activities.AdventureGuideActivity_MembersInjector;
import com.habitrpg.android.habitica.ui.activities.ArmoireActivity;
import com.habitrpg.android.habitica.ui.activities.ArmoireActivity_MembersInjector;
import com.habitrpg.android.habitica.ui.activities.BaseActivity_MembersInjector;
import com.habitrpg.android.habitica.ui.activities.BirthdayActivity;
import com.habitrpg.android.habitica.ui.activities.BirthdayActivity_MembersInjector;
import com.habitrpg.android.habitica.ui.activities.ChallengeFormActivity;
import com.habitrpg.android.habitica.ui.activities.ChallengeFormActivity_MembersInjector;
import com.habitrpg.android.habitica.ui.activities.ClassSelectionActivity;
import com.habitrpg.android.habitica.ui.activities.ClassSelectionActivity_MembersInjector;
import com.habitrpg.android.habitica.ui.activities.DeathActivity;
import com.habitrpg.android.habitica.ui.activities.DeathActivity_MembersInjector;
import com.habitrpg.android.habitica.ui.activities.FixCharacterValuesActivity;
import com.habitrpg.android.habitica.ui.activities.FixCharacterValuesActivity_MembersInjector;
import com.habitrpg.android.habitica.ui.activities.FullProfileActivity;
import com.habitrpg.android.habitica.ui.activities.FullProfileActivity_MembersInjector;
import com.habitrpg.android.habitica.ui.activities.GemPurchaseActivity;
import com.habitrpg.android.habitica.ui.activities.GiftGemsActivity;
import com.habitrpg.android.habitica.ui.activities.GiftGemsActivity_MembersInjector;
import com.habitrpg.android.habitica.ui.activities.GiftSubscriptionActivity;
import com.habitrpg.android.habitica.ui.activities.GiftSubscriptionActivity_MembersInjector;
import com.habitrpg.android.habitica.ui.activities.GroupFormActivity;
import com.habitrpg.android.habitica.ui.activities.GroupInviteActivity;
import com.habitrpg.android.habitica.ui.activities.GroupInviteActivity_MembersInjector;
import com.habitrpg.android.habitica.ui.activities.GuidelinesActivity;
import com.habitrpg.android.habitica.ui.activities.HabitButtonWidgetActivity;
import com.habitrpg.android.habitica.ui.activities.HabitButtonWidgetActivity_MembersInjector;
import com.habitrpg.android.habitica.ui.activities.IntroActivity;
import com.habitrpg.android.habitica.ui.activities.IntroActivity_MembersInjector;
import com.habitrpg.android.habitica.ui.activities.LoginActivity;
import com.habitrpg.android.habitica.ui.activities.LoginActivity_MembersInjector;
import com.habitrpg.android.habitica.ui.activities.MainActivity;
import com.habitrpg.android.habitica.ui.activities.MainActivity_MembersInjector;
import com.habitrpg.android.habitica.ui.activities.MaintenanceActivity;
import com.habitrpg.android.habitica.ui.activities.MaintenanceActivity_MembersInjector;
import com.habitrpg.android.habitica.ui.activities.NotificationsActivity;
import com.habitrpg.android.habitica.ui.activities.NotificationsActivity_MembersInjector;
import com.habitrpg.android.habitica.ui.activities.PrefsActivity;
import com.habitrpg.android.habitica.ui.activities.ReportMessageActivity;
import com.habitrpg.android.habitica.ui.activities.ReportMessageActivity_MembersInjector;
import com.habitrpg.android.habitica.ui.activities.SetupActivity;
import com.habitrpg.android.habitica.ui.activities.SetupActivity_MembersInjector;
import com.habitrpg.android.habitica.ui.activities.SkillMemberActivity;
import com.habitrpg.android.habitica.ui.activities.SkillMemberActivity_MembersInjector;
import com.habitrpg.android.habitica.ui.activities.SkillTasksActivity;
import com.habitrpg.android.habitica.ui.activities.SkillTasksActivity_MembersInjector;
import com.habitrpg.android.habitica.ui.activities.TaskFormActivity;
import com.habitrpg.android.habitica.ui.activities.TaskFormActivity_MembersInjector;
import com.habitrpg.android.habitica.ui.activities.TaskSummaryActivity;
import com.habitrpg.android.habitica.ui.activities.TaskSummaryViewModel;
import com.habitrpg.android.habitica.ui.activities.TaskSummaryViewModel_HiltModules_KeyModule_ProvideFactory;
import com.habitrpg.android.habitica.ui.fragments.AboutFragment;
import com.habitrpg.android.habitica.ui.fragments.AboutFragment_MembersInjector;
import com.habitrpg.android.habitica.ui.fragments.AchievementsFragment;
import com.habitrpg.android.habitica.ui.fragments.AchievementsFragment_MembersInjector;
import com.habitrpg.android.habitica.ui.fragments.BaseDialogFragment_MembersInjector;
import com.habitrpg.android.habitica.ui.fragments.BaseFragment_MembersInjector;
import com.habitrpg.android.habitica.ui.fragments.BaseMainFragment_MembersInjector;
import com.habitrpg.android.habitica.ui.fragments.NavigationDrawerFragment;
import com.habitrpg.android.habitica.ui.fragments.NavigationDrawerFragment_MembersInjector;
import com.habitrpg.android.habitica.ui.fragments.NewsFragment;
import com.habitrpg.android.habitica.ui.fragments.PromoInfoFragment;
import com.habitrpg.android.habitica.ui.fragments.PromoInfoFragment_MembersInjector;
import com.habitrpg.android.habitica.ui.fragments.PromoWebFragment;
import com.habitrpg.android.habitica.ui.fragments.PromoWebFragment_MembersInjector;
import com.habitrpg.android.habitica.ui.fragments.ReportBottomSheetFragment;
import com.habitrpg.android.habitica.ui.fragments.ReportBottomSheetFragment_MembersInjector;
import com.habitrpg.android.habitica.ui.fragments.StatsFragment;
import com.habitrpg.android.habitica.ui.fragments.StatsFragment_MembersInjector;
import com.habitrpg.android.habitica.ui.fragments.inventory.customization.AvatarCustomizationFragment;
import com.habitrpg.android.habitica.ui.fragments.inventory.customization.AvatarCustomizationFragment_MembersInjector;
import com.habitrpg.android.habitica.ui.fragments.inventory.customization.AvatarEquipmentFragment;
import com.habitrpg.android.habitica.ui.fragments.inventory.customization.AvatarEquipmentFragment_MembersInjector;
import com.habitrpg.android.habitica.ui.fragments.inventory.customization.AvatarOverviewFragment;
import com.habitrpg.android.habitica.ui.fragments.inventory.customization.AvatarOverviewFragment_MembersInjector;
import com.habitrpg.android.habitica.ui.fragments.inventory.customization.EquipmentOverviewFragment;
import com.habitrpg.android.habitica.ui.fragments.inventory.equipment.EquipmentDetailFragment;
import com.habitrpg.android.habitica.ui.fragments.inventory.equipment.EquipmentDetailFragment_MembersInjector;
import com.habitrpg.android.habitica.ui.fragments.inventory.items.ItemDialogFragment;
import com.habitrpg.android.habitica.ui.fragments.inventory.items.ItemDialogFragment_MembersInjector;
import com.habitrpg.android.habitica.ui.fragments.inventory.items.ItemRecyclerFragment;
import com.habitrpg.android.habitica.ui.fragments.inventory.items.ItemRecyclerFragment_MembersInjector;
import com.habitrpg.android.habitica.ui.fragments.inventory.items.ItemsFragment;
import com.habitrpg.android.habitica.ui.fragments.inventory.shops.MarketFragment;
import com.habitrpg.android.habitica.ui.fragments.inventory.shops.QuestShopFragment;
import com.habitrpg.android.habitica.ui.fragments.inventory.shops.SeasonalShopFragment;
import com.habitrpg.android.habitica.ui.fragments.inventory.shops.ShopFragment_MembersInjector;
import com.habitrpg.android.habitica.ui.fragments.inventory.shops.TimeTravelersShopFragment;
import com.habitrpg.android.habitica.ui.fragments.inventory.stable.MountDetailRecyclerFragment;
import com.habitrpg.android.habitica.ui.fragments.inventory.stable.MountDetailRecyclerFragment_MembersInjector;
import com.habitrpg.android.habitica.ui.fragments.inventory.stable.PetDetailRecyclerFragment;
import com.habitrpg.android.habitica.ui.fragments.inventory.stable.PetDetailRecyclerFragment_MembersInjector;
import com.habitrpg.android.habitica.ui.fragments.inventory.stable.StableFragment;
import com.habitrpg.android.habitica.ui.fragments.inventory.stable.StableRecyclerFragment;
import com.habitrpg.android.habitica.ui.fragments.inventory.stable.StableRecyclerFragment_MembersInjector;
import com.habitrpg.android.habitica.ui.fragments.preferences.AccountPreferenceFragment;
import com.habitrpg.android.habitica.ui.fragments.preferences.AccountPreferenceFragment_MembersInjector;
import com.habitrpg.android.habitica.ui.fragments.preferences.BasePreferencesFragment_MembersInjector;
import com.habitrpg.android.habitica.ui.fragments.preferences.EmailNotificationsPreferencesFragment;
import com.habitrpg.android.habitica.ui.fragments.preferences.HabiticaAccountDialog;
import com.habitrpg.android.habitica.ui.fragments.preferences.PreferencesFragment;
import com.habitrpg.android.habitica.ui.fragments.preferences.PreferencesFragment_MembersInjector;
import com.habitrpg.android.habitica.ui.fragments.preferences.PushNotificationsPreferencesFragment;
import com.habitrpg.android.habitica.ui.fragments.preferences.TimePreferenceDialogFragment;
import com.habitrpg.android.habitica.ui.fragments.purchases.GemsPurchaseFragment;
import com.habitrpg.android.habitica.ui.fragments.purchases.GemsPurchaseFragment_MembersInjector;
import com.habitrpg.android.habitica.ui.fragments.purchases.GiftBalanceGemsFragment;
import com.habitrpg.android.habitica.ui.fragments.purchases.GiftBalanceGemsFragment_MembersInjector;
import com.habitrpg.android.habitica.ui.fragments.purchases.GiftPurchaseGemsFragment;
import com.habitrpg.android.habitica.ui.fragments.purchases.GiftPurchaseGemsFragment_MembersInjector;
import com.habitrpg.android.habitica.ui.fragments.purchases.SubscriptionBottomSheetFragment;
import com.habitrpg.android.habitica.ui.fragments.purchases.SubscriptionBottomSheetFragment_MembersInjector;
import com.habitrpg.android.habitica.ui.fragments.purchases.SubscriptionFragment;
import com.habitrpg.android.habitica.ui.fragments.purchases.SubscriptionFragment_MembersInjector;
import com.habitrpg.android.habitica.ui.fragments.setup.AvatarSetupFragment;
import com.habitrpg.android.habitica.ui.fragments.setup.AvatarSetupFragment_MembersInjector;
import com.habitrpg.android.habitica.ui.fragments.setup.IntroFragment;
import com.habitrpg.android.habitica.ui.fragments.setup.TaskSetupFragment;
import com.habitrpg.android.habitica.ui.fragments.setup.WelcomeFragment;
import com.habitrpg.android.habitica.ui.fragments.setup.WelcomeFragment_MembersInjector;
import com.habitrpg.android.habitica.ui.fragments.skills.SkillTasksRecyclerViewFragment;
import com.habitrpg.android.habitica.ui.fragments.skills.SkillTasksRecyclerViewFragment_MembersInjector;
import com.habitrpg.android.habitica.ui.fragments.skills.SkillsFragment;
import com.habitrpg.android.habitica.ui.fragments.skills.SkillsFragment_MembersInjector;
import com.habitrpg.android.habitica.ui.fragments.social.ChatFragment;
import com.habitrpg.android.habitica.ui.fragments.social.ChatFragment_MembersInjector;
import com.habitrpg.android.habitica.ui.fragments.social.InboxMessageListFragment;
import com.habitrpg.android.habitica.ui.fragments.social.InboxMessageListFragment_MembersInjector;
import com.habitrpg.android.habitica.ui.fragments.social.InboxOverviewFragment;
import com.habitrpg.android.habitica.ui.fragments.social.InboxOverviewFragment_MembersInjector;
import com.habitrpg.android.habitica.ui.fragments.social.QuestDetailFragment;
import com.habitrpg.android.habitica.ui.fragments.social.QuestDetailFragment_MembersInjector;
import com.habitrpg.android.habitica.ui.fragments.social.challenges.ChallengeDetailFragment;
import com.habitrpg.android.habitica.ui.fragments.social.challenges.ChallengeDetailFragment_MembersInjector;
import com.habitrpg.android.habitica.ui.fragments.social.challenges.ChallengeListFragment;
import com.habitrpg.android.habitica.ui.fragments.social.challenges.ChallengeListFragment_MembersInjector;
import com.habitrpg.android.habitica.ui.fragments.social.challenges.ChallengesOverviewFragment;
import com.habitrpg.android.habitica.ui.fragments.social.challenges.ChallengesOverviewFragment_MembersInjector;
import com.habitrpg.android.habitica.ui.fragments.social.guilds.GuildDetailFragment;
import com.habitrpg.android.habitica.ui.fragments.social.guilds.GuildDetailFragment_MembersInjector;
import com.habitrpg.android.habitica.ui.fragments.social.guilds.GuildFragment;
import com.habitrpg.android.habitica.ui.fragments.social.party.NoPartyFragmentFragment;
import com.habitrpg.android.habitica.ui.fragments.social.party.NoPartyFragmentFragment_MembersInjector;
import com.habitrpg.android.habitica.ui.fragments.social.party.PartyDetailFragment;
import com.habitrpg.android.habitica.ui.fragments.social.party.PartyDetailFragment_MembersInjector;
import com.habitrpg.android.habitica.ui.fragments.social.party.PartyFragment;
import com.habitrpg.android.habitica.ui.fragments.social.party.PartyInviteFragment;
import com.habitrpg.android.habitica.ui.fragments.social.party.PartyInvitePagerFragment;
import com.habitrpg.android.habitica.ui.fragments.social.party.PartyInviteViewModel;
import com.habitrpg.android.habitica.ui.fragments.social.party.PartyInviteViewModel_HiltModules_KeyModule_ProvideFactory;
import com.habitrpg.android.habitica.ui.fragments.social.party.PartySeekingFragment;
import com.habitrpg.android.habitica.ui.fragments.social.party.PartySeekingViewModel;
import com.habitrpg.android.habitica.ui.fragments.social.party.PartySeekingViewModel_HiltModules_KeyModule_ProvideFactory;
import com.habitrpg.android.habitica.ui.fragments.support.BugFixFragment;
import com.habitrpg.android.habitica.ui.fragments.support.BugFixFragment_MembersInjector;
import com.habitrpg.android.habitica.ui.fragments.support.FAQDetailFragment;
import com.habitrpg.android.habitica.ui.fragments.support.FAQDetailFragment_MembersInjector;
import com.habitrpg.android.habitica.ui.fragments.support.FAQOverviewFragment;
import com.habitrpg.android.habitica.ui.fragments.support.FAQOverviewFragment_MembersInjector;
import com.habitrpg.android.habitica.ui.fragments.support.SupportMainFragment;
import com.habitrpg.android.habitica.ui.fragments.support.SupportMainFragment_MembersInjector;
import com.habitrpg.android.habitica.ui.fragments.tasks.RewardsRecyclerviewFragment;
import com.habitrpg.android.habitica.ui.fragments.tasks.TaskRecyclerViewFragment;
import com.habitrpg.android.habitica.ui.fragments.tasks.TaskRecyclerViewFragment_MembersInjector;
import com.habitrpg.android.habitica.ui.fragments.tasks.TasksFragment;
import com.habitrpg.android.habitica.ui.fragments.tasks.TasksFragment_MembersInjector;
import com.habitrpg.android.habitica.ui.viewmodels.AuthenticationViewModel;
import com.habitrpg.android.habitica.ui.viewmodels.GroupViewModel;
import com.habitrpg.android.habitica.ui.viewmodels.GroupViewModel_HiltModules_KeyModule_ProvideFactory;
import com.habitrpg.android.habitica.ui.viewmodels.InboxViewModel;
import com.habitrpg.android.habitica.ui.viewmodels.InboxViewModel_HiltModules_KeyModule_ProvideFactory;
import com.habitrpg.android.habitica.ui.viewmodels.MainActivityViewModel;
import com.habitrpg.android.habitica.ui.viewmodels.MainActivityViewModel_HiltModules_KeyModule_ProvideFactory;
import com.habitrpg.android.habitica.ui.viewmodels.MainUserViewModel;
import com.habitrpg.android.habitica.ui.viewmodels.NotificationsViewModel;
import com.habitrpg.android.habitica.ui.viewmodels.NotificationsViewModel_HiltModules_KeyModule_ProvideFactory;
import com.habitrpg.android.habitica.ui.viewmodels.PartyViewModel;
import com.habitrpg.android.habitica.ui.viewmodels.PartyViewModel_HiltModules_KeyModule_ProvideFactory;
import com.habitrpg.android.habitica.ui.viewmodels.StableViewModel;
import com.habitrpg.android.habitica.ui.viewmodels.StableViewModel_HiltModules_KeyModule_ProvideFactory;
import com.habitrpg.android.habitica.ui.viewmodels.TaskFormViewModel;
import com.habitrpg.android.habitica.ui.viewmodels.TaskFormViewModel_HiltModules_KeyModule_ProvideFactory;
import com.habitrpg.android.habitica.ui.viewmodels.TasksViewModel;
import com.habitrpg.android.habitica.ui.viewmodels.TasksViewModel_HiltModules_KeyModule_ProvideFactory;
import com.habitrpg.android.habitica.ui.viewmodels.inventory.equipment.EquipmentOverviewViewModel;
import com.habitrpg.android.habitica.ui.viewmodels.inventory.equipment.EquipmentOverviewViewModel_HiltModules_KeyModule_ProvideFactory;
import com.habitrpg.android.habitica.widget.AddTaskWidgetProvider;
import com.habitrpg.android.habitica.widget.AvatarStatsWidgetProvider;
import com.habitrpg.android.habitica.widget.BaseWidgetProvider_MembersInjector;
import com.habitrpg.android.habitica.widget.DailiesWidgetService;
import com.habitrpg.android.habitica.widget.DailiesWidgetService_MembersInjector;
import com.habitrpg.android.habitica.widget.HabitButtonWidgetProvider;
import com.habitrpg.android.habitica.widget.HabitButtonWidgetProvider_MembersInjector;
import com.habitrpg.android.habitica.widget.HabitButtonWidgetService;
import com.habitrpg.android.habitica.widget.HabitButtonWidgetService_MembersInjector;
import com.habitrpg.android.habitica.widget.TaskListWidgetProvider;
import com.habitrpg.android.habitica.widget.TaskListWidgetProvider_MembersInjector;
import com.habitrpg.android.habitica.widget.TodosWidgetService;
import com.habitrpg.android.habitica.widget.TodosWidgetService_MembersInjector;
import com.habitrpg.common.habitica.api.HostConfig;
import com.habitrpg.common.habitica.helpers.KeyHelper;
import java.util.Map;
import java.util.Set;
import xa.a;

/* loaded from: classes4.dex */
public final class DaggerHabiticaBaseApplication_HiltComponents_SingletonC {

    /* loaded from: classes4.dex */
    private static final class ActivityCBuilder implements HabiticaBaseApplication_HiltComponents.ActivityC.Builder {
        private Activity activity;
        private final ActivityRetainedCImpl activityRetainedCImpl;
        private final SingletonCImpl singletonCImpl;

        private ActivityCBuilder(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl) {
            this.singletonCImpl = singletonCImpl;
            this.activityRetainedCImpl = activityRetainedCImpl;
        }

        @Override // com.habitrpg.android.habitica.HabiticaBaseApplication_HiltComponents.ActivityC.Builder, wa.a
        public ActivityCBuilder activity(Activity activity) {
            this.activity = (Activity) bb.b.b(activity);
            return this;
        }

        @Override // com.habitrpg.android.habitica.HabiticaBaseApplication_HiltComponents.ActivityC.Builder, wa.a
        public HabiticaBaseApplication_HiltComponents.ActivityC build() {
            bb.b.a(this.activity, Activity.class);
            return new ActivityCImpl(this.singletonCImpl, this.activityRetainedCImpl, this.activity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class ActivityCImpl extends HabiticaBaseApplication_HiltComponents.ActivityC {
        private final ActivityCImpl activityCImpl;
        private final ActivityRetainedCImpl activityRetainedCImpl;
        private final SingletonCImpl singletonCImpl;

        /* JADX INFO: Access modifiers changed from: private */
        public AuthenticationViewModel authenticationViewModel() {
            return new AuthenticationViewModel((ApiClient) this.singletonCImpl.providesApiHelperProvider.get(), this.singletonCImpl.userRepository(), (SharedPreferences) this.singletonCImpl.provideSharedPreferencesProvider.get(), (AuthenticationHandler) this.singletonCImpl.providesAuthenticationHandlerProvider.get(), (HostConfig) this.singletonCImpl.providesHostConfigProvider.get(), this.singletonCImpl.keyHelper());
        }

        private DisplayItemDropUseCase displayItemDropUseCase() {
            return new DisplayItemDropUseCase((SoundManager) this.singletonCImpl.soundManagerProvider.get());
        }

        private AdventureGuideActivity injectAdventureGuideActivity2(AdventureGuideActivity adventureGuideActivity) {
            BaseActivity_MembersInjector.injectNotificationsManager(adventureGuideActivity, (NotificationsManager) this.singletonCImpl.providesPopupNotificationsManagerProvider.get());
            BaseActivity_MembersInjector.injectUserRepository(adventureGuideActivity, this.singletonCImpl.userRepository());
            AdventureGuideActivity_MembersInjector.injectUserViewModel(adventureGuideActivity, (MainUserViewModel) this.singletonCImpl.providesUserViewModelProvider.get());
            return adventureGuideActivity;
        }

        private ArmoireActivity injectArmoireActivity2(ArmoireActivity armoireActivity) {
            BaseActivity_MembersInjector.injectNotificationsManager(armoireActivity, (NotificationsManager) this.singletonCImpl.providesPopupNotificationsManagerProvider.get());
            BaseActivity_MembersInjector.injectUserRepository(armoireActivity, this.singletonCImpl.userRepository());
            ArmoireActivity_MembersInjector.injectInventoryRepository(armoireActivity, this.singletonCImpl.inventoryRepository());
            ArmoireActivity_MembersInjector.injectAppConfigManager(armoireActivity, (AppConfigManager) this.singletonCImpl.providesRemoteConfigManagerProvider.get());
            ArmoireActivity_MembersInjector.injectUserViewModel(armoireActivity, (MainUserViewModel) this.singletonCImpl.providesUserViewModelProvider.get());
            ArmoireActivity_MembersInjector.injectReviewManager(armoireActivity, this.singletonCImpl.reviewManager());
            return armoireActivity;
        }

        private BirthdayActivity injectBirthdayActivity2(BirthdayActivity birthdayActivity) {
            BaseActivity_MembersInjector.injectNotificationsManager(birthdayActivity, (NotificationsManager) this.singletonCImpl.providesPopupNotificationsManagerProvider.get());
            BaseActivity_MembersInjector.injectUserRepository(birthdayActivity, this.singletonCImpl.userRepository());
            BirthdayActivity_MembersInjector.injectUserViewModel(birthdayActivity, (MainUserViewModel) this.singletonCImpl.providesUserViewModelProvider.get());
            BirthdayActivity_MembersInjector.injectPurchaseHandler(birthdayActivity, (PurchaseHandler) this.singletonCImpl.providesPurchaseHandlerProvider.get());
            BirthdayActivity_MembersInjector.injectInventoryRepository(birthdayActivity, this.singletonCImpl.inventoryRepository());
            BirthdayActivity_MembersInjector.injectConfigManager(birthdayActivity, (AppConfigManager) this.singletonCImpl.providesRemoteConfigManagerProvider.get());
            return birthdayActivity;
        }

        private ChallengeFormActivity injectChallengeFormActivity2(ChallengeFormActivity challengeFormActivity) {
            BaseActivity_MembersInjector.injectNotificationsManager(challengeFormActivity, (NotificationsManager) this.singletonCImpl.providesPopupNotificationsManagerProvider.get());
            BaseActivity_MembersInjector.injectUserRepository(challengeFormActivity, this.singletonCImpl.userRepository());
            ChallengeFormActivity_MembersInjector.injectChallengeRepository(challengeFormActivity, this.singletonCImpl.challengeRepository());
            ChallengeFormActivity_MembersInjector.injectSocialRepository(challengeFormActivity, this.singletonCImpl.socialRepository());
            ChallengeFormActivity_MembersInjector.injectUserViewModel(challengeFormActivity, (MainUserViewModel) this.singletonCImpl.providesUserViewModelProvider.get());
            return challengeFormActivity;
        }

        private ClassSelectionActivity injectClassSelectionActivity2(ClassSelectionActivity classSelectionActivity) {
            BaseActivity_MembersInjector.injectNotificationsManager(classSelectionActivity, (NotificationsManager) this.singletonCImpl.providesPopupNotificationsManagerProvider.get());
            BaseActivity_MembersInjector.injectUserRepository(classSelectionActivity, this.singletonCImpl.userRepository());
            ClassSelectionActivity_MembersInjector.injectUserViewModel(classSelectionActivity, (MainUserViewModel) this.singletonCImpl.providesUserViewModelProvider.get());
            ClassSelectionActivity_MembersInjector.injectReviewManager(classSelectionActivity, this.singletonCImpl.reviewManager());
            return classSelectionActivity;
        }

        private DeathActivity injectDeathActivity2(DeathActivity deathActivity) {
            BaseActivity_MembersInjector.injectNotificationsManager(deathActivity, (NotificationsManager) this.singletonCImpl.providesPopupNotificationsManagerProvider.get());
            BaseActivity_MembersInjector.injectUserRepository(deathActivity, this.singletonCImpl.userRepository());
            DeathActivity_MembersInjector.injectInventoryRepository(deathActivity, this.singletonCImpl.inventoryRepository());
            DeathActivity_MembersInjector.injectAppConfigManager(deathActivity, (AppConfigManager) this.singletonCImpl.providesRemoteConfigManagerProvider.get());
            DeathActivity_MembersInjector.injectUserViewModel(deathActivity, (MainUserViewModel) this.singletonCImpl.providesUserViewModelProvider.get());
            DeathActivity_MembersInjector.injectSharedPreferences(deathActivity, (SharedPreferences) this.singletonCImpl.provideSharedPreferencesProvider.get());
            return deathActivity;
        }

        private FixCharacterValuesActivity injectFixCharacterValuesActivity2(FixCharacterValuesActivity fixCharacterValuesActivity) {
            BaseActivity_MembersInjector.injectNotificationsManager(fixCharacterValuesActivity, (NotificationsManager) this.singletonCImpl.providesPopupNotificationsManagerProvider.get());
            BaseActivity_MembersInjector.injectUserRepository(fixCharacterValuesActivity, this.singletonCImpl.userRepository());
            FixCharacterValuesActivity_MembersInjector.injectUserViewModel(fixCharacterValuesActivity, (MainUserViewModel) this.singletonCImpl.providesUserViewModelProvider.get());
            return fixCharacterValuesActivity;
        }

        private FullProfileActivity injectFullProfileActivity2(FullProfileActivity fullProfileActivity) {
            BaseActivity_MembersInjector.injectNotificationsManager(fullProfileActivity, (NotificationsManager) this.singletonCImpl.providesPopupNotificationsManagerProvider.get());
            BaseActivity_MembersInjector.injectUserRepository(fullProfileActivity, this.singletonCImpl.userRepository());
            FullProfileActivity_MembersInjector.injectInventoryRepository(fullProfileActivity, this.singletonCImpl.inventoryRepository());
            FullProfileActivity_MembersInjector.injectApiClient(fullProfileActivity, (ApiClient) this.singletonCImpl.providesApiHelperProvider.get());
            FullProfileActivity_MembersInjector.injectSocialRepository(fullProfileActivity, this.singletonCImpl.socialRepository());
            FullProfileActivity_MembersInjector.injectSharedPrefs(fullProfileActivity, (SharedPreferences) this.singletonCImpl.provideSharedPreferencesProvider.get());
            FullProfileActivity_MembersInjector.injectReviewManager(fullProfileActivity, this.singletonCImpl.reviewManager());
            return fullProfileActivity;
        }

        private GemPurchaseActivity injectGemPurchaseActivity2(GemPurchaseActivity gemPurchaseActivity) {
            BaseActivity_MembersInjector.injectNotificationsManager(gemPurchaseActivity, (NotificationsManager) this.singletonCImpl.providesPopupNotificationsManagerProvider.get());
            BaseActivity_MembersInjector.injectUserRepository(gemPurchaseActivity, this.singletonCImpl.userRepository());
            return gemPurchaseActivity;
        }

        private GiftGemsActivity injectGiftGemsActivity2(GiftGemsActivity giftGemsActivity) {
            BaseActivity_MembersInjector.injectNotificationsManager(giftGemsActivity, (NotificationsManager) this.singletonCImpl.providesPopupNotificationsManagerProvider.get());
            BaseActivity_MembersInjector.injectUserRepository(giftGemsActivity, this.singletonCImpl.userRepository());
            GiftGemsActivity_MembersInjector.injectSocialRepository(giftGemsActivity, this.singletonCImpl.socialRepository());
            GiftGemsActivity_MembersInjector.injectAppConfigManager(giftGemsActivity, (AppConfigManager) this.singletonCImpl.providesRemoteConfigManagerProvider.get());
            GiftGemsActivity_MembersInjector.injectPurchaseHandler(giftGemsActivity, (PurchaseHandler) this.singletonCImpl.providesPurchaseHandlerProvider.get());
            return giftGemsActivity;
        }

        private GiftSubscriptionActivity injectGiftSubscriptionActivity2(GiftSubscriptionActivity giftSubscriptionActivity) {
            BaseActivity_MembersInjector.injectNotificationsManager(giftSubscriptionActivity, (NotificationsManager) this.singletonCImpl.providesPopupNotificationsManagerProvider.get());
            BaseActivity_MembersInjector.injectUserRepository(giftSubscriptionActivity, this.singletonCImpl.userRepository());
            GiftSubscriptionActivity_MembersInjector.injectSocialRepository(giftSubscriptionActivity, this.singletonCImpl.socialRepository());
            GiftSubscriptionActivity_MembersInjector.injectAppConfigManager(giftSubscriptionActivity, (AppConfigManager) this.singletonCImpl.providesRemoteConfigManagerProvider.get());
            GiftSubscriptionActivity_MembersInjector.injectPurchaseHandler(giftSubscriptionActivity, (PurchaseHandler) this.singletonCImpl.providesPurchaseHandlerProvider.get());
            return giftSubscriptionActivity;
        }

        private GroupFormActivity injectGroupFormActivity2(GroupFormActivity groupFormActivity) {
            BaseActivity_MembersInjector.injectNotificationsManager(groupFormActivity, (NotificationsManager) this.singletonCImpl.providesPopupNotificationsManagerProvider.get());
            BaseActivity_MembersInjector.injectUserRepository(groupFormActivity, this.singletonCImpl.userRepository());
            return groupFormActivity;
        }

        private GroupInviteActivity injectGroupInviteActivity2(GroupInviteActivity groupInviteActivity) {
            BaseActivity_MembersInjector.injectNotificationsManager(groupInviteActivity, (NotificationsManager) this.singletonCImpl.providesPopupNotificationsManagerProvider.get());
            BaseActivity_MembersInjector.injectUserRepository(groupInviteActivity, this.singletonCImpl.userRepository());
            GroupInviteActivity_MembersInjector.injectSocialRepository(groupInviteActivity, this.singletonCImpl.socialRepository());
            return groupInviteActivity;
        }

        private GuidelinesActivity injectGuidelinesActivity2(GuidelinesActivity guidelinesActivity) {
            BaseActivity_MembersInjector.injectNotificationsManager(guidelinesActivity, (NotificationsManager) this.singletonCImpl.providesPopupNotificationsManagerProvider.get());
            BaseActivity_MembersInjector.injectUserRepository(guidelinesActivity, this.singletonCImpl.userRepository());
            return guidelinesActivity;
        }

        private HabitButtonWidgetActivity injectHabitButtonWidgetActivity2(HabitButtonWidgetActivity habitButtonWidgetActivity) {
            BaseActivity_MembersInjector.injectNotificationsManager(habitButtonWidgetActivity, (NotificationsManager) this.singletonCImpl.providesPopupNotificationsManagerProvider.get());
            BaseActivity_MembersInjector.injectUserRepository(habitButtonWidgetActivity, this.singletonCImpl.userRepository());
            HabitButtonWidgetActivity_MembersInjector.injectTaskRepository(habitButtonWidgetActivity, this.singletonCImpl.taskRepository());
            return habitButtonWidgetActivity;
        }

        private IntroActivity injectIntroActivity2(IntroActivity introActivity) {
            BaseActivity_MembersInjector.injectNotificationsManager(introActivity, (NotificationsManager) this.singletonCImpl.providesPopupNotificationsManagerProvider.get());
            BaseActivity_MembersInjector.injectUserRepository(introActivity, this.singletonCImpl.userRepository());
            IntroActivity_MembersInjector.injectContentRepository(introActivity, this.singletonCImpl.contentRepository());
            return introActivity;
        }

        private LoginActivity injectLoginActivity2(LoginActivity loginActivity) {
            BaseActivity_MembersInjector.injectNotificationsManager(loginActivity, (NotificationsManager) this.singletonCImpl.providesPopupNotificationsManagerProvider.get());
            BaseActivity_MembersInjector.injectUserRepository(loginActivity, this.singletonCImpl.userRepository());
            LoginActivity_MembersInjector.injectApiClient(loginActivity, (ApiClient) this.singletonCImpl.providesApiHelperProvider.get());
            LoginActivity_MembersInjector.injectSharedPrefs(loginActivity, (SharedPreferences) this.singletonCImpl.provideSharedPreferencesProvider.get());
            LoginActivity_MembersInjector.injectConfigManager(loginActivity, (AppConfigManager) this.singletonCImpl.providesRemoteConfigManagerProvider.get());
            LoginActivity_MembersInjector.injectViewModel(loginActivity, authenticationViewModel());
            return loginActivity;
        }

        private MainActivity injectMainActivity2(MainActivity mainActivity) {
            BaseActivity_MembersInjector.injectNotificationsManager(mainActivity, (NotificationsManager) this.singletonCImpl.providesPopupNotificationsManagerProvider.get());
            BaseActivity_MembersInjector.injectUserRepository(mainActivity, this.singletonCImpl.userRepository());
            MainActivity_MembersInjector.injectApiClient(mainActivity, (ApiClient) this.singletonCImpl.providesApiHelperProvider.get());
            MainActivity_MembersInjector.injectSoundManager(mainActivity, (SoundManager) this.singletonCImpl.soundManagerProvider.get());
            MainActivity_MembersInjector.injectCheckClassSelectionUseCase(mainActivity, new CheckClassSelectionUseCase());
            MainActivity_MembersInjector.injectDisplayItemDropUseCase(mainActivity, displayItemDropUseCase());
            MainActivity_MembersInjector.injectNotifyUserUseCase(mainActivity, notifyUserUseCase());
            MainActivity_MembersInjector.injectTaskRepository(mainActivity, this.singletonCImpl.taskRepository());
            MainActivity_MembersInjector.injectInventoryRepository(mainActivity, this.singletonCImpl.inventoryRepository());
            MainActivity_MembersInjector.injectAppConfigManager(mainActivity, (AppConfigManager) this.singletonCImpl.providesRemoteConfigManagerProvider.get());
            MainActivity_MembersInjector.injectReviewManager(mainActivity, this.singletonCImpl.reviewManager());
            return mainActivity;
        }

        private MaintenanceActivity injectMaintenanceActivity2(MaintenanceActivity maintenanceActivity) {
            BaseActivity_MembersInjector.injectNotificationsManager(maintenanceActivity, (NotificationsManager) this.singletonCImpl.providesPopupNotificationsManagerProvider.get());
            BaseActivity_MembersInjector.injectUserRepository(maintenanceActivity, this.singletonCImpl.userRepository());
            MaintenanceActivity_MembersInjector.injectMaintenanceService(maintenanceActivity, this.singletonCImpl.maintenanceApiService());
            MaintenanceActivity_MembersInjector.injectApiClient(maintenanceActivity, (ApiClient) this.singletonCImpl.providesApiHelperProvider.get());
            return maintenanceActivity;
        }

        private NotificationsActivity injectNotificationsActivity2(NotificationsActivity notificationsActivity) {
            BaseActivity_MembersInjector.injectNotificationsManager(notificationsActivity, (NotificationsManager) this.singletonCImpl.providesPopupNotificationsManagerProvider.get());
            BaseActivity_MembersInjector.injectUserRepository(notificationsActivity, this.singletonCImpl.userRepository());
            NotificationsActivity_MembersInjector.injectInventoryRepository(notificationsActivity, this.singletonCImpl.inventoryRepository());
            NotificationsActivity_MembersInjector.injectSocialRepository(notificationsActivity, this.singletonCImpl.socialRepository());
            return notificationsActivity;
        }

        private PrefsActivity injectPrefsActivity2(PrefsActivity prefsActivity) {
            BaseActivity_MembersInjector.injectNotificationsManager(prefsActivity, (NotificationsManager) this.singletonCImpl.providesPopupNotificationsManagerProvider.get());
            BaseActivity_MembersInjector.injectUserRepository(prefsActivity, this.singletonCImpl.userRepository());
            return prefsActivity;
        }

        private ReportMessageActivity injectReportMessageActivity2(ReportMessageActivity reportMessageActivity) {
            BaseActivity_MembersInjector.injectNotificationsManager(reportMessageActivity, (NotificationsManager) this.singletonCImpl.providesPopupNotificationsManagerProvider.get());
            BaseActivity_MembersInjector.injectUserRepository(reportMessageActivity, this.singletonCImpl.userRepository());
            ReportMessageActivity_MembersInjector.injectSocialRepository(reportMessageActivity, this.singletonCImpl.socialRepository());
            return reportMessageActivity;
        }

        private SetupActivity injectSetupActivity2(SetupActivity setupActivity) {
            BaseActivity_MembersInjector.injectNotificationsManager(setupActivity, (NotificationsManager) this.singletonCImpl.providesPopupNotificationsManagerProvider.get());
            BaseActivity_MembersInjector.injectUserRepository(setupActivity, this.singletonCImpl.userRepository());
            SetupActivity_MembersInjector.injectApiClient(setupActivity, (ApiClient) this.singletonCImpl.providesApiHelperProvider.get());
            SetupActivity_MembersInjector.injectInventoryRepository(setupActivity, this.singletonCImpl.inventoryRepository());
            SetupActivity_MembersInjector.injectTaskRepository(setupActivity, this.singletonCImpl.taskRepository());
            return setupActivity;
        }

        private SkillMemberActivity injectSkillMemberActivity2(SkillMemberActivity skillMemberActivity) {
            BaseActivity_MembersInjector.injectNotificationsManager(skillMemberActivity, (NotificationsManager) this.singletonCImpl.providesPopupNotificationsManagerProvider.get());
            BaseActivity_MembersInjector.injectUserRepository(skillMemberActivity, this.singletonCImpl.userRepository());
            SkillMemberActivity_MembersInjector.injectSocialRepository(skillMemberActivity, this.singletonCImpl.socialRepository());
            SkillMemberActivity_MembersInjector.injectUserViewModel(skillMemberActivity, (MainUserViewModel) this.singletonCImpl.providesUserViewModelProvider.get());
            return skillMemberActivity;
        }

        private SkillTasksActivity injectSkillTasksActivity2(SkillTasksActivity skillTasksActivity) {
            BaseActivity_MembersInjector.injectNotificationsManager(skillTasksActivity, (NotificationsManager) this.singletonCImpl.providesPopupNotificationsManagerProvider.get());
            BaseActivity_MembersInjector.injectUserRepository(skillTasksActivity, this.singletonCImpl.userRepository());
            SkillTasksActivity_MembersInjector.injectTaskRepository(skillTasksActivity, this.singletonCImpl.taskRepository());
            return skillTasksActivity;
        }

        private TaskFormActivity injectTaskFormActivity2(TaskFormActivity taskFormActivity) {
            BaseActivity_MembersInjector.injectNotificationsManager(taskFormActivity, (NotificationsManager) this.singletonCImpl.providesPopupNotificationsManagerProvider.get());
            BaseActivity_MembersInjector.injectUserRepository(taskFormActivity, this.singletonCImpl.userRepository());
            TaskFormActivity_MembersInjector.injectTaskRepository(taskFormActivity, this.singletonCImpl.taskRepository());
            TaskFormActivity_MembersInjector.injectTagRepository(taskFormActivity, this.singletonCImpl.tagRepository());
            TaskFormActivity_MembersInjector.injectTaskAlarmManager(taskFormActivity, this.singletonCImpl.taskAlarmManager());
            TaskFormActivity_MembersInjector.injectPushNotificationManager(taskFormActivity, (PushNotificationManager) this.singletonCImpl.pushNotificationManagerProvider.get());
            TaskFormActivity_MembersInjector.injectChallengeRepository(taskFormActivity, this.singletonCImpl.challengeRepository());
            TaskFormActivity_MembersInjector.injectSharedPreferences(taskFormActivity, (SharedPreferences) this.singletonCImpl.provideSharedPreferencesProvider.get());
            TaskFormActivity_MembersInjector.injectUserViewModel(taskFormActivity, (MainUserViewModel) this.singletonCImpl.providesUserViewModelProvider.get());
            TaskFormActivity_MembersInjector.injectSocialRepository(taskFormActivity, this.singletonCImpl.socialRepository());
            return taskFormActivity;
        }

        private TaskSummaryActivity injectTaskSummaryActivity2(TaskSummaryActivity taskSummaryActivity) {
            BaseActivity_MembersInjector.injectNotificationsManager(taskSummaryActivity, (NotificationsManager) this.singletonCImpl.providesPopupNotificationsManagerProvider.get());
            BaseActivity_MembersInjector.injectUserRepository(taskSummaryActivity, this.singletonCImpl.userRepository());
            return taskSummaryActivity;
        }

        private LevelUpUseCase levelUpUseCase() {
            return new LevelUpUseCase((SoundManager) this.singletonCImpl.soundManagerProvider.get(), new CheckClassSelectionUseCase());
        }

        private NotifyUserUseCase notifyUserUseCase() {
            return new NotifyUserUseCase(levelUpUseCase(), this.singletonCImpl.userRepository());
        }

        @Override // com.habitrpg.android.habitica.HabiticaBaseApplication_HiltComponents.ActivityC, dagger.hilt.android.internal.managers.g.a
        public wa.c fragmentComponentBuilder() {
            return new FragmentCBuilder(this.singletonCImpl, this.activityRetainedCImpl, this.activityCImpl);
        }

        @Override // com.habitrpg.android.habitica.HabiticaBaseApplication_HiltComponents.ActivityC, xa.a.InterfaceC0588a
        public a.c getHiltInternalFactoryFactory() {
            return xa.b.a(getViewModelKeys(), new ViewModelCBuilder(this.singletonCImpl, this.activityRetainedCImpl));
        }

        @Override // com.habitrpg.android.habitica.HabiticaBaseApplication_HiltComponents.ActivityC
        public wa.f getViewModelComponentBuilder() {
            return new ViewModelCBuilder(this.singletonCImpl, this.activityRetainedCImpl);
        }

        @Override // com.habitrpg.android.habitica.HabiticaBaseApplication_HiltComponents.ActivityC
        public Set<String> getViewModelKeys() {
            return com.google.common.collect.k.r(EquipmentOverviewViewModel_HiltModules_KeyModule_ProvideFactory.provide(), GroupViewModel_HiltModules_KeyModule_ProvideFactory.provide(), InboxViewModel_HiltModules_KeyModule_ProvideFactory.provide(), MainActivityViewModel_HiltModules_KeyModule_ProvideFactory.provide(), NotificationsViewModel_HiltModules_KeyModule_ProvideFactory.provide(), PartyInviteViewModel_HiltModules_KeyModule_ProvideFactory.provide(), PartySeekingViewModel_HiltModules_KeyModule_ProvideFactory.provide(), PartyViewModel_HiltModules_KeyModule_ProvideFactory.provide(), StableViewModel_HiltModules_KeyModule_ProvideFactory.provide(), TaskFormViewModel_HiltModules_KeyModule_ProvideFactory.provide(), TaskSummaryViewModel_HiltModules_KeyModule_ProvideFactory.provide(), TasksViewModel_HiltModules_KeyModule_ProvideFactory.provide());
        }

        @Override // com.habitrpg.android.habitica.ui.activities.AdventureGuideActivity_GeneratedInjector
        public void injectAdventureGuideActivity(AdventureGuideActivity adventureGuideActivity) {
            injectAdventureGuideActivity2(adventureGuideActivity);
        }

        @Override // com.habitrpg.android.habitica.ui.activities.ArmoireActivity_GeneratedInjector
        public void injectArmoireActivity(ArmoireActivity armoireActivity) {
            injectArmoireActivity2(armoireActivity);
        }

        @Override // com.habitrpg.android.habitica.ui.activities.BirthdayActivity_GeneratedInjector
        public void injectBirthdayActivity(BirthdayActivity birthdayActivity) {
            injectBirthdayActivity2(birthdayActivity);
        }

        @Override // com.habitrpg.android.habitica.ui.activities.ChallengeFormActivity_GeneratedInjector
        public void injectChallengeFormActivity(ChallengeFormActivity challengeFormActivity) {
            injectChallengeFormActivity2(challengeFormActivity);
        }

        @Override // com.habitrpg.android.habitica.ui.activities.ClassSelectionActivity_GeneratedInjector
        public void injectClassSelectionActivity(ClassSelectionActivity classSelectionActivity) {
            injectClassSelectionActivity2(classSelectionActivity);
        }

        @Override // com.habitrpg.android.habitica.ui.activities.DeathActivity_GeneratedInjector
        public void injectDeathActivity(DeathActivity deathActivity) {
            injectDeathActivity2(deathActivity);
        }

        @Override // com.habitrpg.android.habitica.ui.activities.FixCharacterValuesActivity_GeneratedInjector
        public void injectFixCharacterValuesActivity(FixCharacterValuesActivity fixCharacterValuesActivity) {
            injectFixCharacterValuesActivity2(fixCharacterValuesActivity);
        }

        @Override // com.habitrpg.android.habitica.ui.activities.FullProfileActivity_GeneratedInjector
        public void injectFullProfileActivity(FullProfileActivity fullProfileActivity) {
            injectFullProfileActivity2(fullProfileActivity);
        }

        @Override // com.habitrpg.android.habitica.ui.activities.GemPurchaseActivity_GeneratedInjector
        public void injectGemPurchaseActivity(GemPurchaseActivity gemPurchaseActivity) {
            injectGemPurchaseActivity2(gemPurchaseActivity);
        }

        @Override // com.habitrpg.android.habitica.ui.activities.GiftGemsActivity_GeneratedInjector
        public void injectGiftGemsActivity(GiftGemsActivity giftGemsActivity) {
            injectGiftGemsActivity2(giftGemsActivity);
        }

        @Override // com.habitrpg.android.habitica.ui.activities.GiftSubscriptionActivity_GeneratedInjector
        public void injectGiftSubscriptionActivity(GiftSubscriptionActivity giftSubscriptionActivity) {
            injectGiftSubscriptionActivity2(giftSubscriptionActivity);
        }

        @Override // com.habitrpg.android.habitica.ui.activities.GroupFormActivity_GeneratedInjector
        public void injectGroupFormActivity(GroupFormActivity groupFormActivity) {
            injectGroupFormActivity2(groupFormActivity);
        }

        @Override // com.habitrpg.android.habitica.ui.activities.GroupInviteActivity_GeneratedInjector
        public void injectGroupInviteActivity(GroupInviteActivity groupInviteActivity) {
            injectGroupInviteActivity2(groupInviteActivity);
        }

        @Override // com.habitrpg.android.habitica.ui.activities.GuidelinesActivity_GeneratedInjector
        public void injectGuidelinesActivity(GuidelinesActivity guidelinesActivity) {
            injectGuidelinesActivity2(guidelinesActivity);
        }

        @Override // com.habitrpg.android.habitica.ui.activities.HabitButtonWidgetActivity_GeneratedInjector
        public void injectHabitButtonWidgetActivity(HabitButtonWidgetActivity habitButtonWidgetActivity) {
            injectHabitButtonWidgetActivity2(habitButtonWidgetActivity);
        }

        @Override // com.habitrpg.android.habitica.ui.activities.IntroActivity_GeneratedInjector
        public void injectIntroActivity(IntroActivity introActivity) {
            injectIntroActivity2(introActivity);
        }

        @Override // com.habitrpg.android.habitica.ui.activities.LoginActivity_GeneratedInjector
        public void injectLoginActivity(LoginActivity loginActivity) {
            injectLoginActivity2(loginActivity);
        }

        @Override // com.habitrpg.android.habitica.ui.activities.MainActivity_GeneratedInjector
        public void injectMainActivity(MainActivity mainActivity) {
            injectMainActivity2(mainActivity);
        }

        @Override // com.habitrpg.android.habitica.ui.activities.MaintenanceActivity_GeneratedInjector
        public void injectMaintenanceActivity(MaintenanceActivity maintenanceActivity) {
            injectMaintenanceActivity2(maintenanceActivity);
        }

        @Override // com.habitrpg.android.habitica.ui.activities.NotificationsActivity_GeneratedInjector
        public void injectNotificationsActivity(NotificationsActivity notificationsActivity) {
            injectNotificationsActivity2(notificationsActivity);
        }

        @Override // com.habitrpg.android.habitica.ui.activities.PrefsActivity_GeneratedInjector
        public void injectPrefsActivity(PrefsActivity prefsActivity) {
            injectPrefsActivity2(prefsActivity);
        }

        @Override // com.habitrpg.android.habitica.ui.activities.ReportMessageActivity_GeneratedInjector
        public void injectReportMessageActivity(ReportMessageActivity reportMessageActivity) {
            injectReportMessageActivity2(reportMessageActivity);
        }

        @Override // com.habitrpg.android.habitica.ui.activities.SetupActivity_GeneratedInjector
        public void injectSetupActivity(SetupActivity setupActivity) {
            injectSetupActivity2(setupActivity);
        }

        @Override // com.habitrpg.android.habitica.ui.activities.SkillMemberActivity_GeneratedInjector
        public void injectSkillMemberActivity(SkillMemberActivity skillMemberActivity) {
            injectSkillMemberActivity2(skillMemberActivity);
        }

        @Override // com.habitrpg.android.habitica.ui.activities.SkillTasksActivity_GeneratedInjector
        public void injectSkillTasksActivity(SkillTasksActivity skillTasksActivity) {
            injectSkillTasksActivity2(skillTasksActivity);
        }

        @Override // com.habitrpg.android.habitica.ui.activities.TaskFormActivity_GeneratedInjector
        public void injectTaskFormActivity(TaskFormActivity taskFormActivity) {
            injectTaskFormActivity2(taskFormActivity);
        }

        @Override // com.habitrpg.android.habitica.ui.activities.TaskSummaryActivity_GeneratedInjector
        public void injectTaskSummaryActivity(TaskSummaryActivity taskSummaryActivity) {
            injectTaskSummaryActivity2(taskSummaryActivity);
        }

        @Override // com.habitrpg.android.habitica.HabiticaBaseApplication_HiltComponents.ActivityC
        public wa.e viewComponentBuilder() {
            return new ViewCBuilder(this.singletonCImpl, this.activityRetainedCImpl, this.activityCImpl);
        }

        private ActivityCImpl(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl, Activity activity) {
            this.activityCImpl = this;
            this.singletonCImpl = singletonCImpl;
            this.activityRetainedCImpl = activityRetainedCImpl;
        }

        @Override // com.habitrpg.android.habitica.ui.activities.AddTaskWidgetActivity_GeneratedInjector
        public void injectAddTaskWidgetActivity(AddTaskWidgetActivity addTaskWidgetActivity) {
        }
    }

    /* loaded from: classes4.dex */
    private static final class ActivityRetainedCBuilder implements HabiticaBaseApplication_HiltComponents.ActivityRetainedC.Builder {
        private final SingletonCImpl singletonCImpl;

        private ActivityRetainedCBuilder(SingletonCImpl singletonCImpl) {
            this.singletonCImpl = singletonCImpl;
        }

        @Override // com.habitrpg.android.habitica.HabiticaBaseApplication_HiltComponents.ActivityRetainedC.Builder, wa.b
        public HabiticaBaseApplication_HiltComponents.ActivityRetainedC build() {
            return new ActivityRetainedCImpl(this.singletonCImpl);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class ActivityRetainedCImpl extends HabiticaBaseApplication_HiltComponents.ActivityRetainedC {
        private final ActivityRetainedCImpl activityRetainedCImpl;
        private cc.a<sa.a> provideActivityRetainedLifecycleProvider;
        private final SingletonCImpl singletonCImpl;

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes4.dex */
        public static final class SwitchingProvider<T> implements cc.a<T> {
            private final ActivityRetainedCImpl activityRetainedCImpl;

            /* renamed from: id  reason: collision with root package name */
            private final int f12485id;
            private final SingletonCImpl singletonCImpl;

            SwitchingProvider(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl, int i10) {
                this.singletonCImpl = singletonCImpl;
                this.activityRetainedCImpl = activityRetainedCImpl;
                this.f12485id = i10;
            }

            @Override // cc.a
            public T get() {
                if (this.f12485id == 0) {
                    return (T) dagger.hilt.android.internal.managers.c.a();
                }
                throw new AssertionError(this.f12485id);
            }
        }

        private void initialize() {
            this.provideActivityRetainedLifecycleProvider = bb.a.a(new SwitchingProvider(this.singletonCImpl, this.activityRetainedCImpl, 0));
        }

        @Override // com.habitrpg.android.habitica.HabiticaBaseApplication_HiltComponents.ActivityRetainedC, dagger.hilt.android.internal.managers.a.InterfaceC0302a
        public wa.a activityComponentBuilder() {
            return new ActivityCBuilder(this.singletonCImpl, this.activityRetainedCImpl);
        }

        @Override // com.habitrpg.android.habitica.HabiticaBaseApplication_HiltComponents.ActivityRetainedC, dagger.hilt.android.internal.managers.b.d
        public sa.a getActivityRetainedLifecycle() {
            return this.provideActivityRetainedLifecycleProvider.get();
        }

        private ActivityRetainedCImpl(SingletonCImpl singletonCImpl) {
            this.activityRetainedCImpl = this;
            this.singletonCImpl = singletonCImpl;
            initialize();
        }
    }

    /* loaded from: classes4.dex */
    public static final class Builder {
        private ApiModule apiModule;
        private AppModule appModule;
        private ya.a applicationContextModule;
        private RepositoryModule repositoryModule;
        private UserModule userModule;
        private UserRepositoryModule userRepositoryModule;

        public Builder apiModule(ApiModule apiModule) {
            this.apiModule = (ApiModule) bb.b.b(apiModule);
            return this;
        }

        public Builder appModule(AppModule appModule) {
            this.appModule = (AppModule) bb.b.b(appModule);
            return this;
        }

        public Builder applicationContextModule(ya.a aVar) {
            this.applicationContextModule = (ya.a) bb.b.b(aVar);
            return this;
        }

        public HabiticaBaseApplication_HiltComponents.SingletonC build() {
            if (this.apiModule == null) {
                this.apiModule = new ApiModule();
            }
            if (this.appModule == null) {
                this.appModule = new AppModule();
            }
            bb.b.a(this.applicationContextModule, ya.a.class);
            if (this.repositoryModule == null) {
                this.repositoryModule = new RepositoryModule();
            }
            if (this.userModule == null) {
                this.userModule = new UserModule();
            }
            if (this.userRepositoryModule == null) {
                this.userRepositoryModule = new UserRepositoryModule();
            }
            return new SingletonCImpl(this.apiModule, this.appModule, this.applicationContextModule, this.repositoryModule, this.userModule, this.userRepositoryModule);
        }

        @Deprecated
        public Builder developerModule(DeveloperModule developerModule) {
            bb.b.b(developerModule);
            return this;
        }

        @Deprecated
        public Builder hiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule(ua.b bVar) {
            bb.b.b(bVar);
            return this;
        }

        public Builder repositoryModule(RepositoryModule repositoryModule) {
            this.repositoryModule = (RepositoryModule) bb.b.b(repositoryModule);
            return this;
        }

        public Builder userModule(UserModule userModule) {
            this.userModule = (UserModule) bb.b.b(userModule);
            return this;
        }

        public Builder userRepositoryModule(UserRepositoryModule userRepositoryModule) {
            this.userRepositoryModule = (UserRepositoryModule) bb.b.b(userRepositoryModule);
            return this;
        }

        private Builder() {
        }
    }

    /* loaded from: classes4.dex */
    private static final class FragmentCBuilder implements HabiticaBaseApplication_HiltComponents.FragmentC.Builder {
        private final ActivityCImpl activityCImpl;
        private final ActivityRetainedCImpl activityRetainedCImpl;
        private Fragment fragment;
        private final SingletonCImpl singletonCImpl;

        private FragmentCBuilder(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl) {
            this.singletonCImpl = singletonCImpl;
            this.activityRetainedCImpl = activityRetainedCImpl;
            this.activityCImpl = activityCImpl;
        }

        @Override // com.habitrpg.android.habitica.HabiticaBaseApplication_HiltComponents.FragmentC.Builder, wa.c
        public HabiticaBaseApplication_HiltComponents.FragmentC build() {
            bb.b.a(this.fragment, Fragment.class);
            return new FragmentCImpl(this.singletonCImpl, this.activityRetainedCImpl, this.activityCImpl, this.fragment);
        }

        @Override // com.habitrpg.android.habitica.HabiticaBaseApplication_HiltComponents.FragmentC.Builder, wa.c
        public FragmentCBuilder fragment(Fragment fragment) {
            this.fragment = (Fragment) bb.b.b(fragment);
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class FragmentCImpl extends HabiticaBaseApplication_HiltComponents.FragmentC {
        private final ActivityCImpl activityCImpl;
        private final ActivityRetainedCImpl activityRetainedCImpl;
        private final FragmentCImpl fragmentCImpl;
        private final SingletonCImpl singletonCImpl;

        private FeedPetUseCase feedPetUseCase() {
            return new FeedPetUseCase(this.singletonCImpl.inventoryRepository());
        }

        private AboutFragment injectAboutFragment2(AboutFragment aboutFragment) {
            BaseFragment_MembersInjector.injectTutorialRepository(aboutFragment, this.singletonCImpl.tutorialRepository());
            BaseMainFragment_MembersInjector.injectUserRepository(aboutFragment, this.singletonCImpl.userRepository());
            BaseMainFragment_MembersInjector.injectSoundManager(aboutFragment, (SoundManager) this.singletonCImpl.soundManagerProvider.get());
            AboutFragment_MembersInjector.injectAppConfigManager(aboutFragment, (AppConfigManager) this.singletonCImpl.providesRemoteConfigManagerProvider.get());
            return aboutFragment;
        }

        private AccountPreferenceFragment injectAccountPreferenceFragment2(AccountPreferenceFragment accountPreferenceFragment) {
            BasePreferencesFragment_MembersInjector.injectUserRepository(accountPreferenceFragment, this.singletonCImpl.userRepository());
            BasePreferencesFragment_MembersInjector.injectUserViewModel(accountPreferenceFragment, (MainUserViewModel) this.singletonCImpl.providesUserViewModelProvider.get());
            AccountPreferenceFragment_MembersInjector.injectHostConfig(accountPreferenceFragment, (HostConfig) this.singletonCImpl.providesHostConfigProvider.get());
            AccountPreferenceFragment_MembersInjector.injectApiClient(accountPreferenceFragment, (ApiClient) this.singletonCImpl.providesApiHelperProvider.get());
            AccountPreferenceFragment_MembersInjector.injectViewModel(accountPreferenceFragment, this.activityCImpl.authenticationViewModel());
            return accountPreferenceFragment;
        }

        private AchievementsFragment injectAchievementsFragment2(AchievementsFragment achievementsFragment) {
            BaseFragment_MembersInjector.injectTutorialRepository(achievementsFragment, this.singletonCImpl.tutorialRepository());
            BaseMainFragment_MembersInjector.injectUserRepository(achievementsFragment, this.singletonCImpl.userRepository());
            BaseMainFragment_MembersInjector.injectSoundManager(achievementsFragment, (SoundManager) this.singletonCImpl.soundManagerProvider.get());
            AchievementsFragment_MembersInjector.injectInventoryRepository(achievementsFragment, this.singletonCImpl.inventoryRepository());
            AchievementsFragment_MembersInjector.injectUserViewModel(achievementsFragment, (MainUserViewModel) this.singletonCImpl.providesUserViewModelProvider.get());
            return achievementsFragment;
        }

        private AvatarCustomizationFragment injectAvatarCustomizationFragment2(AvatarCustomizationFragment avatarCustomizationFragment) {
            BaseFragment_MembersInjector.injectTutorialRepository(avatarCustomizationFragment, this.singletonCImpl.tutorialRepository());
            BaseMainFragment_MembersInjector.injectUserRepository(avatarCustomizationFragment, this.singletonCImpl.userRepository());
            BaseMainFragment_MembersInjector.injectSoundManager(avatarCustomizationFragment, (SoundManager) this.singletonCImpl.soundManagerProvider.get());
            AvatarCustomizationFragment_MembersInjector.injectCustomizationRepository(avatarCustomizationFragment, this.singletonCImpl.customizationRepository());
            AvatarCustomizationFragment_MembersInjector.injectInventoryRepository(avatarCustomizationFragment, this.singletonCImpl.inventoryRepository());
            AvatarCustomizationFragment_MembersInjector.injectUserViewModel(avatarCustomizationFragment, (MainUserViewModel) this.singletonCImpl.providesUserViewModelProvider.get());
            return avatarCustomizationFragment;
        }

        private AvatarEquipmentFragment injectAvatarEquipmentFragment2(AvatarEquipmentFragment avatarEquipmentFragment) {
            BaseFragment_MembersInjector.injectTutorialRepository(avatarEquipmentFragment, this.singletonCImpl.tutorialRepository());
            BaseMainFragment_MembersInjector.injectUserRepository(avatarEquipmentFragment, this.singletonCImpl.userRepository());
            BaseMainFragment_MembersInjector.injectSoundManager(avatarEquipmentFragment, (SoundManager) this.singletonCImpl.soundManagerProvider.get());
            AvatarEquipmentFragment_MembersInjector.injectInventoryRepository(avatarEquipmentFragment, this.singletonCImpl.inventoryRepository());
            AvatarEquipmentFragment_MembersInjector.injectUserViewModel(avatarEquipmentFragment, (MainUserViewModel) this.singletonCImpl.providesUserViewModelProvider.get());
            return avatarEquipmentFragment;
        }

        private AvatarOverviewFragment injectAvatarOverviewFragment2(AvatarOverviewFragment avatarOverviewFragment) {
            BaseFragment_MembersInjector.injectTutorialRepository(avatarOverviewFragment, this.singletonCImpl.tutorialRepository());
            BaseMainFragment_MembersInjector.injectUserRepository(avatarOverviewFragment, this.singletonCImpl.userRepository());
            BaseMainFragment_MembersInjector.injectSoundManager(avatarOverviewFragment, (SoundManager) this.singletonCImpl.soundManagerProvider.get());
            AvatarOverviewFragment_MembersInjector.injectUserViewModel(avatarOverviewFragment, (MainUserViewModel) this.singletonCImpl.providesUserViewModelProvider.get());
            AvatarOverviewFragment_MembersInjector.injectInventoryRepository(avatarOverviewFragment, this.singletonCImpl.inventoryRepository());
            return avatarOverviewFragment;
        }

        private AvatarSetupFragment injectAvatarSetupFragment2(AvatarSetupFragment avatarSetupFragment) {
            BaseFragment_MembersInjector.injectTutorialRepository(avatarSetupFragment, this.singletonCImpl.tutorialRepository());
            AvatarSetupFragment_MembersInjector.injectCustomizationRepository(avatarSetupFragment, this.singletonCImpl.setupCustomizationRepository());
            AvatarSetupFragment_MembersInjector.injectUserRepository(avatarSetupFragment, this.singletonCImpl.userRepository());
            AvatarSetupFragment_MembersInjector.injectInventoryRepository(avatarSetupFragment, this.singletonCImpl.inventoryRepository());
            return avatarSetupFragment;
        }

        private BugFixFragment injectBugFixFragment2(BugFixFragment bugFixFragment) {
            BaseFragment_MembersInjector.injectTutorialRepository(bugFixFragment, this.singletonCImpl.tutorialRepository());
            BaseMainFragment_MembersInjector.injectUserRepository(bugFixFragment, this.singletonCImpl.userRepository());
            BaseMainFragment_MembersInjector.injectSoundManager(bugFixFragment, (SoundManager) this.singletonCImpl.soundManagerProvider.get());
            BugFixFragment_MembersInjector.injectAppConfigManager(bugFixFragment, (AppConfigManager) this.singletonCImpl.providesRemoteConfigManagerProvider.get());
            BugFixFragment_MembersInjector.injectUserViewModel(bugFixFragment, (MainUserViewModel) this.singletonCImpl.providesUserViewModelProvider.get());
            return bugFixFragment;
        }

        private ChallengeDetailFragment injectChallengeDetailFragment2(ChallengeDetailFragment challengeDetailFragment) {
            BaseFragment_MembersInjector.injectTutorialRepository(challengeDetailFragment, this.singletonCImpl.tutorialRepository());
            BaseMainFragment_MembersInjector.injectUserRepository(challengeDetailFragment, this.singletonCImpl.userRepository());
            BaseMainFragment_MembersInjector.injectSoundManager(challengeDetailFragment, (SoundManager) this.singletonCImpl.soundManagerProvider.get());
            ChallengeDetailFragment_MembersInjector.injectChallengeRepository(challengeDetailFragment, this.singletonCImpl.challengeRepository());
            ChallengeDetailFragment_MembersInjector.injectSocialRepository(challengeDetailFragment, this.singletonCImpl.socialRepository());
            ChallengeDetailFragment_MembersInjector.injectUserViewModel(challengeDetailFragment, (MainUserViewModel) this.singletonCImpl.providesUserViewModelProvider.get());
            return challengeDetailFragment;
        }

        private ChallengeListFragment injectChallengeListFragment2(ChallengeListFragment challengeListFragment) {
            BaseFragment_MembersInjector.injectTutorialRepository(challengeListFragment, this.singletonCImpl.tutorialRepository());
            ChallengeListFragment_MembersInjector.injectChallengeRepository(challengeListFragment, this.singletonCImpl.challengeRepository());
            ChallengeListFragment_MembersInjector.injectSocialRepository(challengeListFragment, this.singletonCImpl.socialRepository());
            ChallengeListFragment_MembersInjector.injectUserRepository(challengeListFragment, this.singletonCImpl.userRepository());
            ChallengeListFragment_MembersInjector.injectUserViewModel(challengeListFragment, (MainUserViewModel) this.singletonCImpl.providesUserViewModelProvider.get());
            return challengeListFragment;
        }

        private ChallengesOverviewFragment injectChallengesOverviewFragment2(ChallengesOverviewFragment challengesOverviewFragment) {
            BaseFragment_MembersInjector.injectTutorialRepository(challengesOverviewFragment, this.singletonCImpl.tutorialRepository());
            BaseMainFragment_MembersInjector.injectUserRepository(challengesOverviewFragment, this.singletonCImpl.userRepository());
            BaseMainFragment_MembersInjector.injectSoundManager(challengesOverviewFragment, (SoundManager) this.singletonCImpl.soundManagerProvider.get());
            ChallengesOverviewFragment_MembersInjector.injectChallengeRepository(challengesOverviewFragment, this.singletonCImpl.challengeRepository());
            return challengesOverviewFragment;
        }

        private ChatFragment injectChatFragment2(ChatFragment chatFragment) {
            BaseFragment_MembersInjector.injectTutorialRepository(chatFragment, this.singletonCImpl.tutorialRepository());
            ChatFragment_MembersInjector.injectConfigManager(chatFragment, (AppConfigManager) this.singletonCImpl.providesRemoteConfigManagerProvider.get());
            ChatFragment_MembersInjector.injectSocialRepository(chatFragment, this.singletonCImpl.socialRepository());
            return chatFragment;
        }

        private EmailNotificationsPreferencesFragment injectEmailNotificationsPreferencesFragment2(EmailNotificationsPreferencesFragment emailNotificationsPreferencesFragment) {
            BasePreferencesFragment_MembersInjector.injectUserRepository(emailNotificationsPreferencesFragment, this.singletonCImpl.userRepository());
            BasePreferencesFragment_MembersInjector.injectUserViewModel(emailNotificationsPreferencesFragment, (MainUserViewModel) this.singletonCImpl.providesUserViewModelProvider.get());
            return emailNotificationsPreferencesFragment;
        }

        private EquipmentDetailFragment injectEquipmentDetailFragment2(EquipmentDetailFragment equipmentDetailFragment) {
            BaseFragment_MembersInjector.injectTutorialRepository(equipmentDetailFragment, this.singletonCImpl.tutorialRepository());
            BaseMainFragment_MembersInjector.injectUserRepository(equipmentDetailFragment, this.singletonCImpl.userRepository());
            BaseMainFragment_MembersInjector.injectSoundManager(equipmentDetailFragment, (SoundManager) this.singletonCImpl.soundManagerProvider.get());
            EquipmentDetailFragment_MembersInjector.injectInventoryRepository(equipmentDetailFragment, this.singletonCImpl.inventoryRepository());
            EquipmentDetailFragment_MembersInjector.injectUserViewModel(equipmentDetailFragment, (MainUserViewModel) this.singletonCImpl.providesUserViewModelProvider.get());
            EquipmentDetailFragment_MembersInjector.injectReviewManager(equipmentDetailFragment, this.singletonCImpl.reviewManager());
            return equipmentDetailFragment;
        }

        private EquipmentOverviewFragment injectEquipmentOverviewFragment2(EquipmentOverviewFragment equipmentOverviewFragment) {
            BaseFragment_MembersInjector.injectTutorialRepository(equipmentOverviewFragment, this.singletonCImpl.tutorialRepository());
            BaseMainFragment_MembersInjector.injectUserRepository(equipmentOverviewFragment, this.singletonCImpl.userRepository());
            BaseMainFragment_MembersInjector.injectSoundManager(equipmentOverviewFragment, (SoundManager) this.singletonCImpl.soundManagerProvider.get());
            AvatarOverviewFragment_MembersInjector.injectUserViewModel(equipmentOverviewFragment, (MainUserViewModel) this.singletonCImpl.providesUserViewModelProvider.get());
            AvatarOverviewFragment_MembersInjector.injectInventoryRepository(equipmentOverviewFragment, this.singletonCImpl.inventoryRepository());
            return equipmentOverviewFragment;
        }

        private FAQDetailFragment injectFAQDetailFragment2(FAQDetailFragment fAQDetailFragment) {
            BaseFragment_MembersInjector.injectTutorialRepository(fAQDetailFragment, this.singletonCImpl.tutorialRepository());
            BaseMainFragment_MembersInjector.injectUserRepository(fAQDetailFragment, this.singletonCImpl.userRepository());
            BaseMainFragment_MembersInjector.injectSoundManager(fAQDetailFragment, (SoundManager) this.singletonCImpl.soundManagerProvider.get());
            FAQDetailFragment_MembersInjector.injectFaqRepository(fAQDetailFragment, this.singletonCImpl.fAQRepository());
            return fAQDetailFragment;
        }

        private FAQOverviewFragment injectFAQOverviewFragment2(FAQOverviewFragment fAQOverviewFragment) {
            BaseFragment_MembersInjector.injectTutorialRepository(fAQOverviewFragment, this.singletonCImpl.tutorialRepository());
            BaseMainFragment_MembersInjector.injectUserRepository(fAQOverviewFragment, this.singletonCImpl.userRepository());
            BaseMainFragment_MembersInjector.injectSoundManager(fAQOverviewFragment, (SoundManager) this.singletonCImpl.soundManagerProvider.get());
            FAQOverviewFragment_MembersInjector.injectAppConfigManager(fAQOverviewFragment, (AppConfigManager) this.singletonCImpl.providesRemoteConfigManagerProvider.get());
            FAQOverviewFragment_MembersInjector.injectUserViewModel(fAQOverviewFragment, (MainUserViewModel) this.singletonCImpl.providesUserViewModelProvider.get());
            FAQOverviewFragment_MembersInjector.injectFaqRepository(fAQOverviewFragment, this.singletonCImpl.fAQRepository());
            FAQOverviewFragment_MembersInjector.injectConfigManager(fAQOverviewFragment, (AppConfigManager) this.singletonCImpl.providesRemoteConfigManagerProvider.get());
            return fAQOverviewFragment;
        }

        private GemsPurchaseFragment injectGemsPurchaseFragment2(GemsPurchaseFragment gemsPurchaseFragment) {
            BaseFragment_MembersInjector.injectTutorialRepository(gemsPurchaseFragment, this.singletonCImpl.tutorialRepository());
            GemsPurchaseFragment_MembersInjector.injectUserRepository(gemsPurchaseFragment, this.singletonCImpl.userRepository());
            GemsPurchaseFragment_MembersInjector.injectAppConfigManager(gemsPurchaseFragment, (AppConfigManager) this.singletonCImpl.providesRemoteConfigManagerProvider.get());
            GemsPurchaseFragment_MembersInjector.injectPurchaseHandler(gemsPurchaseFragment, (PurchaseHandler) this.singletonCImpl.providesPurchaseHandlerProvider.get());
            return gemsPurchaseFragment;
        }

        private GiftBalanceGemsFragment injectGiftBalanceGemsFragment2(GiftBalanceGemsFragment giftBalanceGemsFragment) {
            BaseFragment_MembersInjector.injectTutorialRepository(giftBalanceGemsFragment, this.singletonCImpl.tutorialRepository());
            GiftBalanceGemsFragment_MembersInjector.injectSocialRepository(giftBalanceGemsFragment, this.singletonCImpl.socialRepository());
            GiftBalanceGemsFragment_MembersInjector.injectUserRepository(giftBalanceGemsFragment, this.singletonCImpl.userRepository());
            return giftBalanceGemsFragment;
        }

        private GiftPurchaseGemsFragment injectGiftPurchaseGemsFragment2(GiftPurchaseGemsFragment giftPurchaseGemsFragment) {
            BaseFragment_MembersInjector.injectTutorialRepository(giftPurchaseGemsFragment, this.singletonCImpl.tutorialRepository());
            GiftPurchaseGemsFragment_MembersInjector.injectSocialRepository(giftPurchaseGemsFragment, this.singletonCImpl.socialRepository());
            return giftPurchaseGemsFragment;
        }

        private GuildDetailFragment injectGuildDetailFragment2(GuildDetailFragment guildDetailFragment) {
            BaseFragment_MembersInjector.injectTutorialRepository(guildDetailFragment, this.singletonCImpl.tutorialRepository());
            GuildDetailFragment_MembersInjector.injectConfigManager(guildDetailFragment, (AppConfigManager) this.singletonCImpl.providesRemoteConfigManagerProvider.get());
            GuildDetailFragment_MembersInjector.injectChallengeRepository(guildDetailFragment, this.singletonCImpl.challengeRepository());
            GuildDetailFragment_MembersInjector.injectUserRepository(guildDetailFragment, this.singletonCImpl.userRepository());
            return guildDetailFragment;
        }

        private GuildFragment injectGuildFragment2(GuildFragment guildFragment) {
            BaseFragment_MembersInjector.injectTutorialRepository(guildFragment, this.singletonCImpl.tutorialRepository());
            BaseMainFragment_MembersInjector.injectUserRepository(guildFragment, this.singletonCImpl.userRepository());
            BaseMainFragment_MembersInjector.injectSoundManager(guildFragment, (SoundManager) this.singletonCImpl.soundManagerProvider.get());
            return guildFragment;
        }

        private InboxMessageListFragment injectInboxMessageListFragment2(InboxMessageListFragment inboxMessageListFragment) {
            BaseFragment_MembersInjector.injectTutorialRepository(inboxMessageListFragment, this.singletonCImpl.tutorialRepository());
            BaseMainFragment_MembersInjector.injectUserRepository(inboxMessageListFragment, this.singletonCImpl.userRepository());
            BaseMainFragment_MembersInjector.injectSoundManager(inboxMessageListFragment, (SoundManager) this.singletonCImpl.soundManagerProvider.get());
            InboxMessageListFragment_MembersInjector.injectSocialRepository(inboxMessageListFragment, this.singletonCImpl.socialRepository());
            InboxMessageListFragment_MembersInjector.injectConfigManager(inboxMessageListFragment, (AppConfigManager) this.singletonCImpl.providesRemoteConfigManagerProvider.get());
            return inboxMessageListFragment;
        }

        private InboxOverviewFragment injectInboxOverviewFragment2(InboxOverviewFragment inboxOverviewFragment) {
            BaseFragment_MembersInjector.injectTutorialRepository(inboxOverviewFragment, this.singletonCImpl.tutorialRepository());
            BaseMainFragment_MembersInjector.injectUserRepository(inboxOverviewFragment, this.singletonCImpl.userRepository());
            BaseMainFragment_MembersInjector.injectSoundManager(inboxOverviewFragment, (SoundManager) this.singletonCImpl.soundManagerProvider.get());
            InboxOverviewFragment_MembersInjector.injectSocialRepository(inboxOverviewFragment, this.singletonCImpl.socialRepository());
            InboxOverviewFragment_MembersInjector.injectConfigManager(inboxOverviewFragment, (AppConfigManager) this.singletonCImpl.providesRemoteConfigManagerProvider.get());
            InboxOverviewFragment_MembersInjector.injectUserViewModel(inboxOverviewFragment, (MainUserViewModel) this.singletonCImpl.providesUserViewModelProvider.get());
            return inboxOverviewFragment;
        }

        private IntroFragment injectIntroFragment2(IntroFragment introFragment) {
            BaseFragment_MembersInjector.injectTutorialRepository(introFragment, this.singletonCImpl.tutorialRepository());
            return introFragment;
        }

        private ItemDialogFragment injectItemDialogFragment2(ItemDialogFragment itemDialogFragment) {
            BaseDialogFragment_MembersInjector.injectTutorialRepository(itemDialogFragment, this.singletonCImpl.tutorialRepository());
            ItemDialogFragment_MembersInjector.injectInventoryRepository(itemDialogFragment, this.singletonCImpl.inventoryRepository());
            ItemDialogFragment_MembersInjector.injectSocialRepository(itemDialogFragment, this.singletonCImpl.socialRepository());
            ItemDialogFragment_MembersInjector.injectUserRepository(itemDialogFragment, this.singletonCImpl.userRepository());
            ItemDialogFragment_MembersInjector.injectHatchPetUseCase(itemDialogFragment, this.singletonCImpl.useCase());
            ItemDialogFragment_MembersInjector.injectFeedPetUseCase(itemDialogFragment, feedPetUseCase());
            ItemDialogFragment_MembersInjector.injectUserViewModel(itemDialogFragment, (MainUserViewModel) this.singletonCImpl.providesUserViewModelProvider.get());
            return itemDialogFragment;
        }

        private ItemRecyclerFragment injectItemRecyclerFragment2(ItemRecyclerFragment itemRecyclerFragment) {
            BaseFragment_MembersInjector.injectTutorialRepository(itemRecyclerFragment, this.singletonCImpl.tutorialRepository());
            ItemRecyclerFragment_MembersInjector.injectInventoryRepository(itemRecyclerFragment, this.singletonCImpl.inventoryRepository());
            ItemRecyclerFragment_MembersInjector.injectSocialRepository(itemRecyclerFragment, this.singletonCImpl.socialRepository());
            ItemRecyclerFragment_MembersInjector.injectUserRepository(itemRecyclerFragment, this.singletonCImpl.userRepository());
            ItemRecyclerFragment_MembersInjector.injectHatchPetUseCase(itemRecyclerFragment, this.singletonCImpl.useCase());
            ItemRecyclerFragment_MembersInjector.injectUserViewModel(itemRecyclerFragment, (MainUserViewModel) this.singletonCImpl.providesUserViewModelProvider.get());
            return itemRecyclerFragment;
        }

        private ItemsFragment injectItemsFragment2(ItemsFragment itemsFragment) {
            BaseFragment_MembersInjector.injectTutorialRepository(itemsFragment, this.singletonCImpl.tutorialRepository());
            BaseMainFragment_MembersInjector.injectUserRepository(itemsFragment, this.singletonCImpl.userRepository());
            BaseMainFragment_MembersInjector.injectSoundManager(itemsFragment, (SoundManager) this.singletonCImpl.soundManagerProvider.get());
            return itemsFragment;
        }

        private MarketFragment injectMarketFragment2(MarketFragment marketFragment) {
            BaseFragment_MembersInjector.injectTutorialRepository(marketFragment, this.singletonCImpl.tutorialRepository());
            BaseMainFragment_MembersInjector.injectUserRepository(marketFragment, this.singletonCImpl.userRepository());
            BaseMainFragment_MembersInjector.injectSoundManager(marketFragment, (SoundManager) this.singletonCImpl.soundManagerProvider.get());
            ShopFragment_MembersInjector.injectInventoryRepository(marketFragment, this.singletonCImpl.inventoryRepository());
            ShopFragment_MembersInjector.injectSocialRepository(marketFragment, this.singletonCImpl.socialRepository());
            ShopFragment_MembersInjector.injectConfigManager(marketFragment, (AppConfigManager) this.singletonCImpl.providesRemoteConfigManagerProvider.get());
            ShopFragment_MembersInjector.injectUserViewModel(marketFragment, (MainUserViewModel) this.singletonCImpl.providesUserViewModelProvider.get());
            return marketFragment;
        }

        private MountDetailRecyclerFragment injectMountDetailRecyclerFragment2(MountDetailRecyclerFragment mountDetailRecyclerFragment) {
            BaseFragment_MembersInjector.injectTutorialRepository(mountDetailRecyclerFragment, this.singletonCImpl.tutorialRepository());
            BaseMainFragment_MembersInjector.injectUserRepository(mountDetailRecyclerFragment, this.singletonCImpl.userRepository());
            BaseMainFragment_MembersInjector.injectSoundManager(mountDetailRecyclerFragment, (SoundManager) this.singletonCImpl.soundManagerProvider.get());
            MountDetailRecyclerFragment_MembersInjector.injectInventoryRepository(mountDetailRecyclerFragment, this.singletonCImpl.inventoryRepository());
            MountDetailRecyclerFragment_MembersInjector.injectUserViewModel(mountDetailRecyclerFragment, (MainUserViewModel) this.singletonCImpl.providesUserViewModelProvider.get());
            return mountDetailRecyclerFragment;
        }

        private NavigationDrawerFragment injectNavigationDrawerFragment2(NavigationDrawerFragment navigationDrawerFragment) {
            NavigationDrawerFragment_MembersInjector.injectSocialRepository(navigationDrawerFragment, this.singletonCImpl.socialRepository());
            NavigationDrawerFragment_MembersInjector.injectInventoryRepository(navigationDrawerFragment, this.singletonCImpl.inventoryRepository());
            NavigationDrawerFragment_MembersInjector.injectUserRepository(navigationDrawerFragment, this.singletonCImpl.userRepository());
            NavigationDrawerFragment_MembersInjector.injectConfigManager(navigationDrawerFragment, (AppConfigManager) this.singletonCImpl.providesRemoteConfigManagerProvider.get());
            NavigationDrawerFragment_MembersInjector.injectContentRepository(navigationDrawerFragment, this.singletonCImpl.contentRepository());
            NavigationDrawerFragment_MembersInjector.injectSharedPreferences(navigationDrawerFragment, (SharedPreferences) this.singletonCImpl.provideSharedPreferencesProvider.get());
            NavigationDrawerFragment_MembersInjector.injectUserViewModel(navigationDrawerFragment, (MainUserViewModel) this.singletonCImpl.providesUserViewModelProvider.get());
            return navigationDrawerFragment;
        }

        private NewsFragment injectNewsFragment2(NewsFragment newsFragment) {
            BaseFragment_MembersInjector.injectTutorialRepository(newsFragment, this.singletonCImpl.tutorialRepository());
            BaseMainFragment_MembersInjector.injectUserRepository(newsFragment, this.singletonCImpl.userRepository());
            BaseMainFragment_MembersInjector.injectSoundManager(newsFragment, (SoundManager) this.singletonCImpl.soundManagerProvider.get());
            return newsFragment;
        }

        private NoPartyFragmentFragment injectNoPartyFragmentFragment2(NoPartyFragmentFragment noPartyFragmentFragment) {
            BaseFragment_MembersInjector.injectTutorialRepository(noPartyFragmentFragment, this.singletonCImpl.tutorialRepository());
            BaseMainFragment_MembersInjector.injectUserRepository(noPartyFragmentFragment, this.singletonCImpl.userRepository());
            BaseMainFragment_MembersInjector.injectSoundManager(noPartyFragmentFragment, (SoundManager) this.singletonCImpl.soundManagerProvider.get());
            NoPartyFragmentFragment_MembersInjector.injectSocialRepository(noPartyFragmentFragment, this.singletonCImpl.socialRepository());
            NoPartyFragmentFragment_MembersInjector.injectConfigManager(noPartyFragmentFragment, (AppConfigManager) this.singletonCImpl.providesRemoteConfigManagerProvider.get());
            NoPartyFragmentFragment_MembersInjector.injectUserViewModel(noPartyFragmentFragment, (MainUserViewModel) this.singletonCImpl.providesUserViewModelProvider.get());
            return noPartyFragmentFragment;
        }

        private PartyDetailFragment injectPartyDetailFragment2(PartyDetailFragment partyDetailFragment) {
            BaseFragment_MembersInjector.injectTutorialRepository(partyDetailFragment, this.singletonCImpl.tutorialRepository());
            PartyDetailFragment_MembersInjector.injectChallengeRepository(partyDetailFragment, this.singletonCImpl.challengeRepository());
            PartyDetailFragment_MembersInjector.injectSocialRepository(partyDetailFragment, this.singletonCImpl.socialRepository());
            PartyDetailFragment_MembersInjector.injectUserRepository(partyDetailFragment, this.singletonCImpl.userRepository());
            PartyDetailFragment_MembersInjector.injectInventoryRepository(partyDetailFragment, this.singletonCImpl.inventoryRepository());
            return partyDetailFragment;
        }

        private PartyFragment injectPartyFragment2(PartyFragment partyFragment) {
            BaseFragment_MembersInjector.injectTutorialRepository(partyFragment, this.singletonCImpl.tutorialRepository());
            BaseMainFragment_MembersInjector.injectUserRepository(partyFragment, this.singletonCImpl.userRepository());
            BaseMainFragment_MembersInjector.injectSoundManager(partyFragment, (SoundManager) this.singletonCImpl.soundManagerProvider.get());
            return partyFragment;
        }

        private PartyInviteFragment injectPartyInviteFragment2(PartyInviteFragment partyInviteFragment) {
            BaseFragment_MembersInjector.injectTutorialRepository(partyInviteFragment, this.singletonCImpl.tutorialRepository());
            return partyInviteFragment;
        }

        private PartyInvitePagerFragment injectPartyInvitePagerFragment2(PartyInvitePagerFragment partyInvitePagerFragment) {
            BaseFragment_MembersInjector.injectTutorialRepository(partyInvitePagerFragment, this.singletonCImpl.tutorialRepository());
            BaseMainFragment_MembersInjector.injectUserRepository(partyInvitePagerFragment, this.singletonCImpl.userRepository());
            BaseMainFragment_MembersInjector.injectSoundManager(partyInvitePagerFragment, (SoundManager) this.singletonCImpl.soundManagerProvider.get());
            return partyInvitePagerFragment;
        }

        private PartySeekingFragment injectPartySeekingFragment2(PartySeekingFragment partySeekingFragment) {
            BaseFragment_MembersInjector.injectTutorialRepository(partySeekingFragment, this.singletonCImpl.tutorialRepository());
            return partySeekingFragment;
        }

        private PetDetailRecyclerFragment injectPetDetailRecyclerFragment2(PetDetailRecyclerFragment petDetailRecyclerFragment) {
            BaseFragment_MembersInjector.injectTutorialRepository(petDetailRecyclerFragment, this.singletonCImpl.tutorialRepository());
            BaseMainFragment_MembersInjector.injectUserRepository(petDetailRecyclerFragment, this.singletonCImpl.userRepository());
            BaseMainFragment_MembersInjector.injectSoundManager(petDetailRecyclerFragment, (SoundManager) this.singletonCImpl.soundManagerProvider.get());
            PetDetailRecyclerFragment_MembersInjector.injectInventoryRepository(petDetailRecyclerFragment, this.singletonCImpl.inventoryRepository());
            PetDetailRecyclerFragment_MembersInjector.injectFeedPetUseCase(petDetailRecyclerFragment, feedPetUseCase());
            PetDetailRecyclerFragment_MembersInjector.injectUserViewModel(petDetailRecyclerFragment, (MainUserViewModel) this.singletonCImpl.providesUserViewModelProvider.get());
            PetDetailRecyclerFragment_MembersInjector.injectReviewManager(petDetailRecyclerFragment, this.singletonCImpl.reviewManager());
            return petDetailRecyclerFragment;
        }

        private PreferencesFragment injectPreferencesFragment2(PreferencesFragment preferencesFragment) {
            BasePreferencesFragment_MembersInjector.injectUserRepository(preferencesFragment, this.singletonCImpl.userRepository());
            BasePreferencesFragment_MembersInjector.injectUserViewModel(preferencesFragment, (MainUserViewModel) this.singletonCImpl.providesUserViewModelProvider.get());
            PreferencesFragment_MembersInjector.injectContentRepository(preferencesFragment, this.singletonCImpl.contentRepository());
            PreferencesFragment_MembersInjector.injectSoundManager(preferencesFragment, (SoundManager) this.singletonCImpl.soundManagerProvider.get());
            PreferencesFragment_MembersInjector.injectPushNotificationManager(preferencesFragment, (PushNotificationManager) this.singletonCImpl.pushNotificationManagerProvider.get());
            PreferencesFragment_MembersInjector.injectConfigManager(preferencesFragment, (AppConfigManager) this.singletonCImpl.providesRemoteConfigManagerProvider.get());
            PreferencesFragment_MembersInjector.injectApiClient(preferencesFragment, (ApiClient) this.singletonCImpl.providesApiHelperProvider.get());
            return preferencesFragment;
        }

        private PromoInfoFragment injectPromoInfoFragment2(PromoInfoFragment promoInfoFragment) {
            BaseFragment_MembersInjector.injectTutorialRepository(promoInfoFragment, this.singletonCImpl.tutorialRepository());
            BaseMainFragment_MembersInjector.injectUserRepository(promoInfoFragment, this.singletonCImpl.userRepository());
            BaseMainFragment_MembersInjector.injectSoundManager(promoInfoFragment, (SoundManager) this.singletonCImpl.soundManagerProvider.get());
            PromoInfoFragment_MembersInjector.injectConfigManager(promoInfoFragment, (AppConfigManager) this.singletonCImpl.providesRemoteConfigManagerProvider.get());
            return promoInfoFragment;
        }

        private PromoWebFragment injectPromoWebFragment2(PromoWebFragment promoWebFragment) {
            BaseFragment_MembersInjector.injectTutorialRepository(promoWebFragment, this.singletonCImpl.tutorialRepository());
            BaseMainFragment_MembersInjector.injectUserRepository(promoWebFragment, this.singletonCImpl.userRepository());
            BaseMainFragment_MembersInjector.injectSoundManager(promoWebFragment, (SoundManager) this.singletonCImpl.soundManagerProvider.get());
            PromoWebFragment_MembersInjector.injectUserViewModel(promoWebFragment, (MainUserViewModel) this.singletonCImpl.providesUserViewModelProvider.get());
            return promoWebFragment;
        }

        private PushNotificationsPreferencesFragment injectPushNotificationsPreferencesFragment2(PushNotificationsPreferencesFragment pushNotificationsPreferencesFragment) {
            BasePreferencesFragment_MembersInjector.injectUserRepository(pushNotificationsPreferencesFragment, this.singletonCImpl.userRepository());
            BasePreferencesFragment_MembersInjector.injectUserViewModel(pushNotificationsPreferencesFragment, (MainUserViewModel) this.singletonCImpl.providesUserViewModelProvider.get());
            return pushNotificationsPreferencesFragment;
        }

        private QuestDetailFragment injectQuestDetailFragment2(QuestDetailFragment questDetailFragment) {
            BaseFragment_MembersInjector.injectTutorialRepository(questDetailFragment, this.singletonCImpl.tutorialRepository());
            BaseMainFragment_MembersInjector.injectUserRepository(questDetailFragment, this.singletonCImpl.userRepository());
            BaseMainFragment_MembersInjector.injectSoundManager(questDetailFragment, (SoundManager) this.singletonCImpl.soundManagerProvider.get());
            QuestDetailFragment_MembersInjector.injectSocialRepository(questDetailFragment, this.singletonCImpl.socialRepository());
            QuestDetailFragment_MembersInjector.injectInventoryRepository(questDetailFragment, this.singletonCImpl.inventoryRepository());
            QuestDetailFragment_MembersInjector.injectUserViewModel(questDetailFragment, (MainUserViewModel) this.singletonCImpl.providesUserViewModelProvider.get());
            return questDetailFragment;
        }

        private QuestShopFragment injectQuestShopFragment2(QuestShopFragment questShopFragment) {
            BaseFragment_MembersInjector.injectTutorialRepository(questShopFragment, this.singletonCImpl.tutorialRepository());
            BaseMainFragment_MembersInjector.injectUserRepository(questShopFragment, this.singletonCImpl.userRepository());
            BaseMainFragment_MembersInjector.injectSoundManager(questShopFragment, (SoundManager) this.singletonCImpl.soundManagerProvider.get());
            ShopFragment_MembersInjector.injectInventoryRepository(questShopFragment, this.singletonCImpl.inventoryRepository());
            ShopFragment_MembersInjector.injectSocialRepository(questShopFragment, this.singletonCImpl.socialRepository());
            ShopFragment_MembersInjector.injectConfigManager(questShopFragment, (AppConfigManager) this.singletonCImpl.providesRemoteConfigManagerProvider.get());
            ShopFragment_MembersInjector.injectUserViewModel(questShopFragment, (MainUserViewModel) this.singletonCImpl.providesUserViewModelProvider.get());
            return questShopFragment;
        }

        private ReportBottomSheetFragment injectReportBottomSheetFragment2(ReportBottomSheetFragment reportBottomSheetFragment) {
            ReportBottomSheetFragment_MembersInjector.injectSocialRepository(reportBottomSheetFragment, this.singletonCImpl.socialRepository());
            return reportBottomSheetFragment;
        }

        private RewardsRecyclerviewFragment injectRewardsRecyclerviewFragment2(RewardsRecyclerviewFragment rewardsRecyclerviewFragment) {
            BaseFragment_MembersInjector.injectTutorialRepository(rewardsRecyclerviewFragment, this.singletonCImpl.tutorialRepository());
            TaskRecyclerViewFragment_MembersInjector.injectUserRepository(rewardsRecyclerviewFragment, this.singletonCImpl.userRepository());
            TaskRecyclerViewFragment_MembersInjector.injectInventoryRepository(rewardsRecyclerviewFragment, this.singletonCImpl.inventoryRepository());
            TaskRecyclerViewFragment_MembersInjector.injectTaskRepository(rewardsRecyclerviewFragment, this.singletonCImpl.taskRepository());
            TaskRecyclerViewFragment_MembersInjector.injectSoundManager(rewardsRecyclerviewFragment, (SoundManager) this.singletonCImpl.soundManagerProvider.get());
            TaskRecyclerViewFragment_MembersInjector.injectConfigManager(rewardsRecyclerviewFragment, (AppConfigManager) this.singletonCImpl.providesRemoteConfigManagerProvider.get());
            TaskRecyclerViewFragment_MembersInjector.injectSharedPreferences(rewardsRecyclerviewFragment, (SharedPreferences) this.singletonCImpl.provideSharedPreferencesProvider.get());
            TaskRecyclerViewFragment_MembersInjector.injectNotificationsManager(rewardsRecyclerviewFragment, (NotificationsManager) this.singletonCImpl.providesPopupNotificationsManagerProvider.get());
            return rewardsRecyclerviewFragment;
        }

        private SeasonalShopFragment injectSeasonalShopFragment2(SeasonalShopFragment seasonalShopFragment) {
            BaseFragment_MembersInjector.injectTutorialRepository(seasonalShopFragment, this.singletonCImpl.tutorialRepository());
            BaseMainFragment_MembersInjector.injectUserRepository(seasonalShopFragment, this.singletonCImpl.userRepository());
            BaseMainFragment_MembersInjector.injectSoundManager(seasonalShopFragment, (SoundManager) this.singletonCImpl.soundManagerProvider.get());
            ShopFragment_MembersInjector.injectInventoryRepository(seasonalShopFragment, this.singletonCImpl.inventoryRepository());
            ShopFragment_MembersInjector.injectSocialRepository(seasonalShopFragment, this.singletonCImpl.socialRepository());
            ShopFragment_MembersInjector.injectConfigManager(seasonalShopFragment, (AppConfigManager) this.singletonCImpl.providesRemoteConfigManagerProvider.get());
            ShopFragment_MembersInjector.injectUserViewModel(seasonalShopFragment, (MainUserViewModel) this.singletonCImpl.providesUserViewModelProvider.get());
            return seasonalShopFragment;
        }

        private SkillTasksRecyclerViewFragment injectSkillTasksRecyclerViewFragment2(SkillTasksRecyclerViewFragment skillTasksRecyclerViewFragment) {
            BaseFragment_MembersInjector.injectTutorialRepository(skillTasksRecyclerViewFragment, this.singletonCImpl.tutorialRepository());
            SkillTasksRecyclerViewFragment_MembersInjector.injectTaskRepository(skillTasksRecyclerViewFragment, this.singletonCImpl.taskRepository());
            SkillTasksRecyclerViewFragment_MembersInjector.injectUserViewModel(skillTasksRecyclerViewFragment, (MainUserViewModel) this.singletonCImpl.providesUserViewModelProvider.get());
            return skillTasksRecyclerViewFragment;
        }

        private SkillsFragment injectSkillsFragment2(SkillsFragment skillsFragment) {
            BaseFragment_MembersInjector.injectTutorialRepository(skillsFragment, this.singletonCImpl.tutorialRepository());
            BaseMainFragment_MembersInjector.injectUserRepository(skillsFragment, this.singletonCImpl.userRepository());
            BaseMainFragment_MembersInjector.injectSoundManager(skillsFragment, (SoundManager) this.singletonCImpl.soundManagerProvider.get());
            SkillsFragment_MembersInjector.injectUserViewModel(skillsFragment, (MainUserViewModel) this.singletonCImpl.providesUserViewModelProvider.get());
            return skillsFragment;
        }

        private StableFragment injectStableFragment2(StableFragment stableFragment) {
            BaseFragment_MembersInjector.injectTutorialRepository(stableFragment, this.singletonCImpl.tutorialRepository());
            BaseMainFragment_MembersInjector.injectUserRepository(stableFragment, this.singletonCImpl.userRepository());
            BaseMainFragment_MembersInjector.injectSoundManager(stableFragment, (SoundManager) this.singletonCImpl.soundManagerProvider.get());
            return stableFragment;
        }

        private StableRecyclerFragment injectStableRecyclerFragment2(StableRecyclerFragment stableRecyclerFragment) {
            BaseFragment_MembersInjector.injectTutorialRepository(stableRecyclerFragment, this.singletonCImpl.tutorialRepository());
            StableRecyclerFragment_MembersInjector.injectInventoryRepository(stableRecyclerFragment, this.singletonCImpl.inventoryRepository());
            StableRecyclerFragment_MembersInjector.injectUserRepository(stableRecyclerFragment, this.singletonCImpl.userRepository());
            StableRecyclerFragment_MembersInjector.injectConfigManager(stableRecyclerFragment, (AppConfigManager) this.singletonCImpl.providesRemoteConfigManagerProvider.get());
            StableRecyclerFragment_MembersInjector.injectUserViewModel(stableRecyclerFragment, (MainUserViewModel) this.singletonCImpl.providesUserViewModelProvider.get());
            return stableRecyclerFragment;
        }

        private StatsFragment injectStatsFragment2(StatsFragment statsFragment) {
            BaseFragment_MembersInjector.injectTutorialRepository(statsFragment, this.singletonCImpl.tutorialRepository());
            BaseMainFragment_MembersInjector.injectUserRepository(statsFragment, this.singletonCImpl.userRepository());
            BaseMainFragment_MembersInjector.injectSoundManager(statsFragment, (SoundManager) this.singletonCImpl.soundManagerProvider.get());
            StatsFragment_MembersInjector.injectInventoryRepository(statsFragment, this.singletonCImpl.inventoryRepository());
            StatsFragment_MembersInjector.injectUserViewModel(statsFragment, (MainUserViewModel) this.singletonCImpl.providesUserViewModelProvider.get());
            return statsFragment;
        }

        private SubscriptionBottomSheetFragment injectSubscriptionBottomSheetFragment2(SubscriptionBottomSheetFragment subscriptionBottomSheetFragment) {
            SubscriptionBottomSheetFragment_MembersInjector.injectUserRepository(subscriptionBottomSheetFragment, this.singletonCImpl.userRepository());
            SubscriptionBottomSheetFragment_MembersInjector.injectAppConfigManager(subscriptionBottomSheetFragment, (AppConfigManager) this.singletonCImpl.providesRemoteConfigManagerProvider.get());
            SubscriptionBottomSheetFragment_MembersInjector.injectInventoryRepository(subscriptionBottomSheetFragment, this.singletonCImpl.inventoryRepository());
            SubscriptionBottomSheetFragment_MembersInjector.injectPurchaseHandler(subscriptionBottomSheetFragment, (PurchaseHandler) this.singletonCImpl.providesPurchaseHandlerProvider.get());
            return subscriptionBottomSheetFragment;
        }

        private SubscriptionFragment injectSubscriptionFragment2(SubscriptionFragment subscriptionFragment) {
            BaseFragment_MembersInjector.injectTutorialRepository(subscriptionFragment, this.singletonCImpl.tutorialRepository());
            SubscriptionFragment_MembersInjector.injectUserRepository(subscriptionFragment, this.singletonCImpl.userRepository());
            SubscriptionFragment_MembersInjector.injectAppConfigManager(subscriptionFragment, (AppConfigManager) this.singletonCImpl.providesRemoteConfigManagerProvider.get());
            SubscriptionFragment_MembersInjector.injectInventoryRepository(subscriptionFragment, this.singletonCImpl.inventoryRepository());
            SubscriptionFragment_MembersInjector.injectPurchaseHandler(subscriptionFragment, (PurchaseHandler) this.singletonCImpl.providesPurchaseHandlerProvider.get());
            return subscriptionFragment;
        }

        private SupportMainFragment injectSupportMainFragment2(SupportMainFragment supportMainFragment) {
            BaseFragment_MembersInjector.injectTutorialRepository(supportMainFragment, this.singletonCImpl.tutorialRepository());
            BaseMainFragment_MembersInjector.injectUserRepository(supportMainFragment, this.singletonCImpl.userRepository());
            BaseMainFragment_MembersInjector.injectSoundManager(supportMainFragment, (SoundManager) this.singletonCImpl.soundManagerProvider.get());
            SupportMainFragment_MembersInjector.injectFaqRepository(supportMainFragment, this.singletonCImpl.fAQRepository());
            SupportMainFragment_MembersInjector.injectAppConfigManager(supportMainFragment, (AppConfigManager) this.singletonCImpl.providesRemoteConfigManagerProvider.get());
            return supportMainFragment;
        }

        private TaskRecyclerViewFragment injectTaskRecyclerViewFragment2(TaskRecyclerViewFragment taskRecyclerViewFragment) {
            BaseFragment_MembersInjector.injectTutorialRepository(taskRecyclerViewFragment, this.singletonCImpl.tutorialRepository());
            TaskRecyclerViewFragment_MembersInjector.injectUserRepository(taskRecyclerViewFragment, this.singletonCImpl.userRepository());
            TaskRecyclerViewFragment_MembersInjector.injectInventoryRepository(taskRecyclerViewFragment, this.singletonCImpl.inventoryRepository());
            TaskRecyclerViewFragment_MembersInjector.injectTaskRepository(taskRecyclerViewFragment, this.singletonCImpl.taskRepository());
            TaskRecyclerViewFragment_MembersInjector.injectSoundManager(taskRecyclerViewFragment, (SoundManager) this.singletonCImpl.soundManagerProvider.get());
            TaskRecyclerViewFragment_MembersInjector.injectConfigManager(taskRecyclerViewFragment, (AppConfigManager) this.singletonCImpl.providesRemoteConfigManagerProvider.get());
            TaskRecyclerViewFragment_MembersInjector.injectSharedPreferences(taskRecyclerViewFragment, (SharedPreferences) this.singletonCImpl.provideSharedPreferencesProvider.get());
            TaskRecyclerViewFragment_MembersInjector.injectNotificationsManager(taskRecyclerViewFragment, (NotificationsManager) this.singletonCImpl.providesPopupNotificationsManagerProvider.get());
            return taskRecyclerViewFragment;
        }

        private TaskSetupFragment injectTaskSetupFragment2(TaskSetupFragment taskSetupFragment) {
            BaseFragment_MembersInjector.injectTutorialRepository(taskSetupFragment, this.singletonCImpl.tutorialRepository());
            return taskSetupFragment;
        }

        private TasksFragment injectTasksFragment2(TasksFragment tasksFragment) {
            BaseFragment_MembersInjector.injectTutorialRepository(tasksFragment, this.singletonCImpl.tutorialRepository());
            BaseMainFragment_MembersInjector.injectUserRepository(tasksFragment, this.singletonCImpl.userRepository());
            BaseMainFragment_MembersInjector.injectSoundManager(tasksFragment, (SoundManager) this.singletonCImpl.soundManagerProvider.get());
            TasksFragment_MembersInjector.injectTagRepository(tasksFragment, this.singletonCImpl.tagRepository());
            return tasksFragment;
        }

        private TimeTravelersShopFragment injectTimeTravelersShopFragment2(TimeTravelersShopFragment timeTravelersShopFragment) {
            BaseFragment_MembersInjector.injectTutorialRepository(timeTravelersShopFragment, this.singletonCImpl.tutorialRepository());
            BaseMainFragment_MembersInjector.injectUserRepository(timeTravelersShopFragment, this.singletonCImpl.userRepository());
            BaseMainFragment_MembersInjector.injectSoundManager(timeTravelersShopFragment, (SoundManager) this.singletonCImpl.soundManagerProvider.get());
            ShopFragment_MembersInjector.injectInventoryRepository(timeTravelersShopFragment, this.singletonCImpl.inventoryRepository());
            ShopFragment_MembersInjector.injectSocialRepository(timeTravelersShopFragment, this.singletonCImpl.socialRepository());
            ShopFragment_MembersInjector.injectConfigManager(timeTravelersShopFragment, (AppConfigManager) this.singletonCImpl.providesRemoteConfigManagerProvider.get());
            ShopFragment_MembersInjector.injectUserViewModel(timeTravelersShopFragment, (MainUserViewModel) this.singletonCImpl.providesUserViewModelProvider.get());
            return timeTravelersShopFragment;
        }

        private WelcomeFragment injectWelcomeFragment2(WelcomeFragment welcomeFragment) {
            BaseFragment_MembersInjector.injectTutorialRepository(welcomeFragment, this.singletonCImpl.tutorialRepository());
            WelcomeFragment_MembersInjector.injectUserRepository(welcomeFragment, this.singletonCImpl.userRepository());
            return welcomeFragment;
        }

        @Override // com.habitrpg.android.habitica.HabiticaBaseApplication_HiltComponents.FragmentC, xa.a.b
        public a.c getHiltInternalFactoryFactory() {
            return this.activityCImpl.getHiltInternalFactoryFactory();
        }

        @Override // com.habitrpg.android.habitica.ui.fragments.AboutFragment_GeneratedInjector
        public void injectAboutFragment(AboutFragment aboutFragment) {
            injectAboutFragment2(aboutFragment);
        }

        @Override // com.habitrpg.android.habitica.ui.fragments.preferences.AccountPreferenceFragment_GeneratedInjector
        public void injectAccountPreferenceFragment(AccountPreferenceFragment accountPreferenceFragment) {
            injectAccountPreferenceFragment2(accountPreferenceFragment);
        }

        @Override // com.habitrpg.android.habitica.ui.fragments.AchievementsFragment_GeneratedInjector
        public void injectAchievementsFragment(AchievementsFragment achievementsFragment) {
            injectAchievementsFragment2(achievementsFragment);
        }

        @Override // com.habitrpg.android.habitica.ui.fragments.inventory.customization.AvatarCustomizationFragment_GeneratedInjector
        public void injectAvatarCustomizationFragment(AvatarCustomizationFragment avatarCustomizationFragment) {
            injectAvatarCustomizationFragment2(avatarCustomizationFragment);
        }

        @Override // com.habitrpg.android.habitica.ui.fragments.inventory.customization.AvatarEquipmentFragment_GeneratedInjector
        public void injectAvatarEquipmentFragment(AvatarEquipmentFragment avatarEquipmentFragment) {
            injectAvatarEquipmentFragment2(avatarEquipmentFragment);
        }

        @Override // com.habitrpg.android.habitica.ui.fragments.inventory.customization.AvatarOverviewFragment_GeneratedInjector
        public void injectAvatarOverviewFragment(AvatarOverviewFragment avatarOverviewFragment) {
            injectAvatarOverviewFragment2(avatarOverviewFragment);
        }

        @Override // com.habitrpg.android.habitica.ui.fragments.setup.AvatarSetupFragment_GeneratedInjector
        public void injectAvatarSetupFragment(AvatarSetupFragment avatarSetupFragment) {
            injectAvatarSetupFragment2(avatarSetupFragment);
        }

        @Override // com.habitrpg.android.habitica.ui.fragments.support.BugFixFragment_GeneratedInjector
        public void injectBugFixFragment(BugFixFragment bugFixFragment) {
            injectBugFixFragment2(bugFixFragment);
        }

        @Override // com.habitrpg.android.habitica.ui.fragments.social.challenges.ChallengeDetailFragment_GeneratedInjector
        public void injectChallengeDetailFragment(ChallengeDetailFragment challengeDetailFragment) {
            injectChallengeDetailFragment2(challengeDetailFragment);
        }

        @Override // com.habitrpg.android.habitica.ui.fragments.social.challenges.ChallengeListFragment_GeneratedInjector
        public void injectChallengeListFragment(ChallengeListFragment challengeListFragment) {
            injectChallengeListFragment2(challengeListFragment);
        }

        @Override // com.habitrpg.android.habitica.ui.fragments.social.challenges.ChallengesOverviewFragment_GeneratedInjector
        public void injectChallengesOverviewFragment(ChallengesOverviewFragment challengesOverviewFragment) {
            injectChallengesOverviewFragment2(challengesOverviewFragment);
        }

        @Override // com.habitrpg.android.habitica.ui.fragments.social.ChatFragment_GeneratedInjector
        public void injectChatFragment(ChatFragment chatFragment) {
            injectChatFragment2(chatFragment);
        }

        @Override // com.habitrpg.android.habitica.ui.fragments.preferences.EmailNotificationsPreferencesFragment_GeneratedInjector
        public void injectEmailNotificationsPreferencesFragment(EmailNotificationsPreferencesFragment emailNotificationsPreferencesFragment) {
            injectEmailNotificationsPreferencesFragment2(emailNotificationsPreferencesFragment);
        }

        @Override // com.habitrpg.android.habitica.ui.fragments.inventory.equipment.EquipmentDetailFragment_GeneratedInjector
        public void injectEquipmentDetailFragment(EquipmentDetailFragment equipmentDetailFragment) {
            injectEquipmentDetailFragment2(equipmentDetailFragment);
        }

        @Override // com.habitrpg.android.habitica.ui.fragments.inventory.customization.EquipmentOverviewFragment_GeneratedInjector
        public void injectEquipmentOverviewFragment(EquipmentOverviewFragment equipmentOverviewFragment) {
            injectEquipmentOverviewFragment2(equipmentOverviewFragment);
        }

        @Override // com.habitrpg.android.habitica.ui.fragments.support.FAQDetailFragment_GeneratedInjector
        public void injectFAQDetailFragment(FAQDetailFragment fAQDetailFragment) {
            injectFAQDetailFragment2(fAQDetailFragment);
        }

        @Override // com.habitrpg.android.habitica.ui.fragments.support.FAQOverviewFragment_GeneratedInjector
        public void injectFAQOverviewFragment(FAQOverviewFragment fAQOverviewFragment) {
            injectFAQOverviewFragment2(fAQOverviewFragment);
        }

        @Override // com.habitrpg.android.habitica.ui.fragments.purchases.GemsPurchaseFragment_GeneratedInjector
        public void injectGemsPurchaseFragment(GemsPurchaseFragment gemsPurchaseFragment) {
            injectGemsPurchaseFragment2(gemsPurchaseFragment);
        }

        @Override // com.habitrpg.android.habitica.ui.fragments.purchases.GiftBalanceGemsFragment_GeneratedInjector
        public void injectGiftBalanceGemsFragment(GiftBalanceGemsFragment giftBalanceGemsFragment) {
            injectGiftBalanceGemsFragment2(giftBalanceGemsFragment);
        }

        @Override // com.habitrpg.android.habitica.ui.fragments.purchases.GiftPurchaseGemsFragment_GeneratedInjector
        public void injectGiftPurchaseGemsFragment(GiftPurchaseGemsFragment giftPurchaseGemsFragment) {
            injectGiftPurchaseGemsFragment2(giftPurchaseGemsFragment);
        }

        @Override // com.habitrpg.android.habitica.ui.fragments.social.guilds.GuildDetailFragment_GeneratedInjector
        public void injectGuildDetailFragment(GuildDetailFragment guildDetailFragment) {
            injectGuildDetailFragment2(guildDetailFragment);
        }

        @Override // com.habitrpg.android.habitica.ui.fragments.social.guilds.GuildFragment_GeneratedInjector
        public void injectGuildFragment(GuildFragment guildFragment) {
            injectGuildFragment2(guildFragment);
        }

        @Override // com.habitrpg.android.habitica.ui.fragments.social.InboxMessageListFragment_GeneratedInjector
        public void injectInboxMessageListFragment(InboxMessageListFragment inboxMessageListFragment) {
            injectInboxMessageListFragment2(inboxMessageListFragment);
        }

        @Override // com.habitrpg.android.habitica.ui.fragments.social.InboxOverviewFragment_GeneratedInjector
        public void injectInboxOverviewFragment(InboxOverviewFragment inboxOverviewFragment) {
            injectInboxOverviewFragment2(inboxOverviewFragment);
        }

        @Override // com.habitrpg.android.habitica.ui.fragments.setup.IntroFragment_GeneratedInjector
        public void injectIntroFragment(IntroFragment introFragment) {
            injectIntroFragment2(introFragment);
        }

        @Override // com.habitrpg.android.habitica.ui.fragments.inventory.items.ItemDialogFragment_GeneratedInjector
        public void injectItemDialogFragment(ItemDialogFragment itemDialogFragment) {
            injectItemDialogFragment2(itemDialogFragment);
        }

        @Override // com.habitrpg.android.habitica.ui.fragments.inventory.items.ItemRecyclerFragment_GeneratedInjector
        public void injectItemRecyclerFragment(ItemRecyclerFragment itemRecyclerFragment) {
            injectItemRecyclerFragment2(itemRecyclerFragment);
        }

        @Override // com.habitrpg.android.habitica.ui.fragments.inventory.items.ItemsFragment_GeneratedInjector
        public void injectItemsFragment(ItemsFragment itemsFragment) {
            injectItemsFragment2(itemsFragment);
        }

        @Override // com.habitrpg.android.habitica.ui.fragments.inventory.shops.MarketFragment_GeneratedInjector
        public void injectMarketFragment(MarketFragment marketFragment) {
            injectMarketFragment2(marketFragment);
        }

        @Override // com.habitrpg.android.habitica.ui.fragments.inventory.stable.MountDetailRecyclerFragment_GeneratedInjector
        public void injectMountDetailRecyclerFragment(MountDetailRecyclerFragment mountDetailRecyclerFragment) {
            injectMountDetailRecyclerFragment2(mountDetailRecyclerFragment);
        }

        @Override // com.habitrpg.android.habitica.ui.fragments.NavigationDrawerFragment_GeneratedInjector
        public void injectNavigationDrawerFragment(NavigationDrawerFragment navigationDrawerFragment) {
            injectNavigationDrawerFragment2(navigationDrawerFragment);
        }

        @Override // com.habitrpg.android.habitica.ui.fragments.NewsFragment_GeneratedInjector
        public void injectNewsFragment(NewsFragment newsFragment) {
            injectNewsFragment2(newsFragment);
        }

        @Override // com.habitrpg.android.habitica.ui.fragments.social.party.NoPartyFragmentFragment_GeneratedInjector
        public void injectNoPartyFragmentFragment(NoPartyFragmentFragment noPartyFragmentFragment) {
            injectNoPartyFragmentFragment2(noPartyFragmentFragment);
        }

        @Override // com.habitrpg.android.habitica.ui.fragments.social.party.PartyDetailFragment_GeneratedInjector
        public void injectPartyDetailFragment(PartyDetailFragment partyDetailFragment) {
            injectPartyDetailFragment2(partyDetailFragment);
        }

        @Override // com.habitrpg.android.habitica.ui.fragments.social.party.PartyFragment_GeneratedInjector
        public void injectPartyFragment(PartyFragment partyFragment) {
            injectPartyFragment2(partyFragment);
        }

        @Override // com.habitrpg.android.habitica.ui.fragments.social.party.PartyInviteFragment_GeneratedInjector
        public void injectPartyInviteFragment(PartyInviteFragment partyInviteFragment) {
            injectPartyInviteFragment2(partyInviteFragment);
        }

        @Override // com.habitrpg.android.habitica.ui.fragments.social.party.PartyInvitePagerFragment_GeneratedInjector
        public void injectPartyInvitePagerFragment(PartyInvitePagerFragment partyInvitePagerFragment) {
            injectPartyInvitePagerFragment2(partyInvitePagerFragment);
        }

        @Override // com.habitrpg.android.habitica.ui.fragments.social.party.PartySeekingFragment_GeneratedInjector
        public void injectPartySeekingFragment(PartySeekingFragment partySeekingFragment) {
            injectPartySeekingFragment2(partySeekingFragment);
        }

        @Override // com.habitrpg.android.habitica.ui.fragments.inventory.stable.PetDetailRecyclerFragment_GeneratedInjector
        public void injectPetDetailRecyclerFragment(PetDetailRecyclerFragment petDetailRecyclerFragment) {
            injectPetDetailRecyclerFragment2(petDetailRecyclerFragment);
        }

        @Override // com.habitrpg.android.habitica.ui.fragments.preferences.PreferencesFragment_GeneratedInjector
        public void injectPreferencesFragment(PreferencesFragment preferencesFragment) {
            injectPreferencesFragment2(preferencesFragment);
        }

        @Override // com.habitrpg.android.habitica.ui.fragments.PromoInfoFragment_GeneratedInjector
        public void injectPromoInfoFragment(PromoInfoFragment promoInfoFragment) {
            injectPromoInfoFragment2(promoInfoFragment);
        }

        @Override // com.habitrpg.android.habitica.ui.fragments.PromoWebFragment_GeneratedInjector
        public void injectPromoWebFragment(PromoWebFragment promoWebFragment) {
            injectPromoWebFragment2(promoWebFragment);
        }

        @Override // com.habitrpg.android.habitica.ui.fragments.preferences.PushNotificationsPreferencesFragment_GeneratedInjector
        public void injectPushNotificationsPreferencesFragment(PushNotificationsPreferencesFragment pushNotificationsPreferencesFragment) {
            injectPushNotificationsPreferencesFragment2(pushNotificationsPreferencesFragment);
        }

        @Override // com.habitrpg.android.habitica.ui.fragments.social.QuestDetailFragment_GeneratedInjector
        public void injectQuestDetailFragment(QuestDetailFragment questDetailFragment) {
            injectQuestDetailFragment2(questDetailFragment);
        }

        @Override // com.habitrpg.android.habitica.ui.fragments.inventory.shops.QuestShopFragment_GeneratedInjector
        public void injectQuestShopFragment(QuestShopFragment questShopFragment) {
            injectQuestShopFragment2(questShopFragment);
        }

        @Override // com.habitrpg.android.habitica.ui.fragments.ReportBottomSheetFragment_GeneratedInjector
        public void injectReportBottomSheetFragment(ReportBottomSheetFragment reportBottomSheetFragment) {
            injectReportBottomSheetFragment2(reportBottomSheetFragment);
        }

        @Override // com.habitrpg.android.habitica.ui.fragments.tasks.RewardsRecyclerviewFragment_GeneratedInjector
        public void injectRewardsRecyclerviewFragment(RewardsRecyclerviewFragment rewardsRecyclerviewFragment) {
            injectRewardsRecyclerviewFragment2(rewardsRecyclerviewFragment);
        }

        @Override // com.habitrpg.android.habitica.ui.fragments.inventory.shops.SeasonalShopFragment_GeneratedInjector
        public void injectSeasonalShopFragment(SeasonalShopFragment seasonalShopFragment) {
            injectSeasonalShopFragment2(seasonalShopFragment);
        }

        @Override // com.habitrpg.android.habitica.ui.fragments.skills.SkillTasksRecyclerViewFragment_GeneratedInjector
        public void injectSkillTasksRecyclerViewFragment(SkillTasksRecyclerViewFragment skillTasksRecyclerViewFragment) {
            injectSkillTasksRecyclerViewFragment2(skillTasksRecyclerViewFragment);
        }

        @Override // com.habitrpg.android.habitica.ui.fragments.skills.SkillsFragment_GeneratedInjector
        public void injectSkillsFragment(SkillsFragment skillsFragment) {
            injectSkillsFragment2(skillsFragment);
        }

        @Override // com.habitrpg.android.habitica.ui.fragments.inventory.stable.StableFragment_GeneratedInjector
        public void injectStableFragment(StableFragment stableFragment) {
            injectStableFragment2(stableFragment);
        }

        @Override // com.habitrpg.android.habitica.ui.fragments.inventory.stable.StableRecyclerFragment_GeneratedInjector
        public void injectStableRecyclerFragment(StableRecyclerFragment stableRecyclerFragment) {
            injectStableRecyclerFragment2(stableRecyclerFragment);
        }

        @Override // com.habitrpg.android.habitica.ui.fragments.StatsFragment_GeneratedInjector
        public void injectStatsFragment(StatsFragment statsFragment) {
            injectStatsFragment2(statsFragment);
        }

        @Override // com.habitrpg.android.habitica.ui.fragments.purchases.SubscriptionBottomSheetFragment_GeneratedInjector
        public void injectSubscriptionBottomSheetFragment(SubscriptionBottomSheetFragment subscriptionBottomSheetFragment) {
            injectSubscriptionBottomSheetFragment2(subscriptionBottomSheetFragment);
        }

        @Override // com.habitrpg.android.habitica.ui.fragments.purchases.SubscriptionFragment_GeneratedInjector
        public void injectSubscriptionFragment(SubscriptionFragment subscriptionFragment) {
            injectSubscriptionFragment2(subscriptionFragment);
        }

        @Override // com.habitrpg.android.habitica.ui.fragments.support.SupportMainFragment_GeneratedInjector
        public void injectSupportMainFragment(SupportMainFragment supportMainFragment) {
            injectSupportMainFragment2(supportMainFragment);
        }

        @Override // com.habitrpg.android.habitica.ui.fragments.tasks.TaskRecyclerViewFragment_GeneratedInjector
        public void injectTaskRecyclerViewFragment(TaskRecyclerViewFragment taskRecyclerViewFragment) {
            injectTaskRecyclerViewFragment2(taskRecyclerViewFragment);
        }

        @Override // com.habitrpg.android.habitica.ui.fragments.setup.TaskSetupFragment_GeneratedInjector
        public void injectTaskSetupFragment(TaskSetupFragment taskSetupFragment) {
            injectTaskSetupFragment2(taskSetupFragment);
        }

        @Override // com.habitrpg.android.habitica.ui.fragments.tasks.TasksFragment_GeneratedInjector
        public void injectTasksFragment(TasksFragment tasksFragment) {
            injectTasksFragment2(tasksFragment);
        }

        @Override // com.habitrpg.android.habitica.ui.fragments.inventory.shops.TimeTravelersShopFragment_GeneratedInjector
        public void injectTimeTravelersShopFragment(TimeTravelersShopFragment timeTravelersShopFragment) {
            injectTimeTravelersShopFragment2(timeTravelersShopFragment);
        }

        @Override // com.habitrpg.android.habitica.ui.fragments.setup.WelcomeFragment_GeneratedInjector
        public void injectWelcomeFragment(WelcomeFragment welcomeFragment) {
            injectWelcomeFragment2(welcomeFragment);
        }

        @Override // com.habitrpg.android.habitica.HabiticaBaseApplication_HiltComponents.FragmentC
        public wa.g viewWithFragmentComponentBuilder() {
            return new ViewWithFragmentCBuilder(this.singletonCImpl, this.activityRetainedCImpl, this.activityCImpl, this.fragmentCImpl);
        }

        private FragmentCImpl(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl, Fragment fragment) {
            this.fragmentCImpl = this;
            this.singletonCImpl = singletonCImpl;
            this.activityRetainedCImpl = activityRetainedCImpl;
            this.activityCImpl = activityCImpl;
        }

        @Override // com.habitrpg.android.habitica.ui.fragments.preferences.HabiticaAccountDialog_GeneratedInjector
        public void injectHabiticaAccountDialog(HabiticaAccountDialog habiticaAccountDialog) {
        }

        @Override // com.habitrpg.android.habitica.ui.fragments.preferences.TimePreferenceDialogFragment_GeneratedInjector
        public void injectTimePreferenceDialogFragment(TimePreferenceDialogFragment timePreferenceDialogFragment) {
        }
    }

    /* loaded from: classes4.dex */
    private static final class ServiceCBuilder implements HabiticaBaseApplication_HiltComponents.ServiceC.Builder {
        private Service service;
        private final SingletonCImpl singletonCImpl;

        private ServiceCBuilder(SingletonCImpl singletonCImpl) {
            this.singletonCImpl = singletonCImpl;
        }

        @Override // com.habitrpg.android.habitica.HabiticaBaseApplication_HiltComponents.ServiceC.Builder, wa.d
        public HabiticaBaseApplication_HiltComponents.ServiceC build() {
            bb.b.a(this.service, Service.class);
            return new ServiceCImpl(this.singletonCImpl, this.service);
        }

        @Override // com.habitrpg.android.habitica.HabiticaBaseApplication_HiltComponents.ServiceC.Builder, wa.d
        public ServiceCBuilder service(Service service) {
            this.service = (Service) bb.b.b(service);
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class ServiceCImpl extends HabiticaBaseApplication_HiltComponents.ServiceC {
        private final ServiceCImpl serviceCImpl;
        private final SingletonCImpl singletonCImpl;

        private DailiesWidgetService injectDailiesWidgetService2(DailiesWidgetService dailiesWidgetService) {
            DailiesWidgetService_MembersInjector.injectTaskRepository(dailiesWidgetService, this.singletonCImpl.taskRepository());
            DailiesWidgetService_MembersInjector.injectUserRepository(dailiesWidgetService, this.singletonCImpl.userRepository());
            return dailiesWidgetService;
        }

        private DeviceCommunicationService injectDeviceCommunicationService2(DeviceCommunicationService deviceCommunicationService) {
            DeviceCommunicationService_MembersInjector.injectHostConfig(deviceCommunicationService, (HostConfig) this.singletonCImpl.providesHostConfigProvider.get());
            return deviceCommunicationService;
        }

        private HabitButtonWidgetService injectHabitButtonWidgetService2(HabitButtonWidgetService habitButtonWidgetService) {
            HabitButtonWidgetService_MembersInjector.injectSharedPreferences(habitButtonWidgetService, (SharedPreferences) this.singletonCImpl.provideSharedPreferencesProvider.get());
            HabitButtonWidgetService_MembersInjector.injectContext(habitButtonWidgetService, ya.b.a(this.singletonCImpl.applicationContextModule));
            HabitButtonWidgetService_MembersInjector.injectTaskRepository(habitButtonWidgetService, this.singletonCImpl.taskRepository());
            return habitButtonWidgetService;
        }

        private HabiticaFirebaseMessagingService injectHabiticaFirebaseMessagingService2(HabiticaFirebaseMessagingService habiticaFirebaseMessagingService) {
            HabiticaFirebaseMessagingService_MembersInjector.injectPushNotificationManager(habiticaFirebaseMessagingService, (PushNotificationManager) this.singletonCImpl.pushNotificationManagerProvider.get());
            return habiticaFirebaseMessagingService;
        }

        private TodosWidgetService injectTodosWidgetService2(TodosWidgetService todosWidgetService) {
            TodosWidgetService_MembersInjector.injectTaskRepository(todosWidgetService, this.singletonCImpl.taskRepository());
            TodosWidgetService_MembersInjector.injectUserRepository(todosWidgetService, this.singletonCImpl.userRepository());
            return todosWidgetService;
        }

        @Override // com.habitrpg.android.habitica.widget.DailiesWidgetService_GeneratedInjector
        public void injectDailiesWidgetService(DailiesWidgetService dailiesWidgetService) {
            injectDailiesWidgetService2(dailiesWidgetService);
        }

        @Override // com.habitrpg.android.habitica.receivers.DeviceCommunicationService_GeneratedInjector
        public void injectDeviceCommunicationService(DeviceCommunicationService deviceCommunicationService) {
            injectDeviceCommunicationService2(deviceCommunicationService);
        }

        @Override // com.habitrpg.android.habitica.widget.HabitButtonWidgetService_GeneratedInjector
        public void injectHabitButtonWidgetService(HabitButtonWidgetService habitButtonWidgetService) {
            injectHabitButtonWidgetService2(habitButtonWidgetService);
        }

        @Override // com.habitrpg.android.habitica.helpers.notifications.HabiticaFirebaseMessagingService_GeneratedInjector
        public void injectHabiticaFirebaseMessagingService(HabiticaFirebaseMessagingService habiticaFirebaseMessagingService) {
            injectHabiticaFirebaseMessagingService2(habiticaFirebaseMessagingService);
        }

        @Override // com.habitrpg.android.habitica.widget.TodosWidgetService_GeneratedInjector
        public void injectTodosWidgetService(TodosWidgetService todosWidgetService) {
            injectTodosWidgetService2(todosWidgetService);
        }

        private ServiceCImpl(SingletonCImpl singletonCImpl, Service service) {
            this.serviceCImpl = this;
            this.singletonCImpl = singletonCImpl;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class SingletonCImpl extends HabiticaBaseApplication_HiltComponents.SingletonC {
        private final ApiModule apiModule;
        private final AppModule appModule;
        private final ya.a applicationContextModule;
        private cc.a<SharedPreferences> provideSharedPreferencesProvider;
        private cc.a<ApiClient> providesApiHelperProvider;
        private cc.a<AuthenticationHandler> providesAuthenticationHandlerProvider;
        private cc.a<HostConfig> providesHostConfigProvider;
        private cc.a<NotificationsManager> providesPopupNotificationsManagerProvider;
        private cc.a<PurchaseHandler> providesPurchaseHandlerProvider;
        private cc.a<AppConfigManager> providesRemoteConfigManagerProvider;
        private cc.a<MainUserViewModel> providesUserViewModelProvider;
        private cc.a<PushNotificationManager> pushNotificationManagerProvider;
        private final RepositoryModule repositoryModule;
        private final SingletonCImpl singletonCImpl;
        private cc.a<SoundManager> soundManagerProvider;
        private final UserModule userModule;
        private final UserRepositoryModule userRepositoryModule;

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes4.dex */
        public static final class SwitchingProvider<T> implements cc.a<T> {

            /* renamed from: id  reason: collision with root package name */
            private final int f12486id;
            private final SingletonCImpl singletonCImpl;

            SwitchingProvider(SingletonCImpl singletonCImpl, int i10) {
                this.singletonCImpl = singletonCImpl;
                this.f12486id = i10;
            }

            @Override // cc.a
            public T get() {
                switch (this.f12486id) {
                    case 0:
                        return (T) ApiModule_ProvidesApiHelperFactory.providesApiHelper(this.singletonCImpl.apiModule, ApiModule_ProvidesGsonConverterFactoryFactory.providesGsonConverterFactory(this.singletonCImpl.apiModule), (HostConfig) this.singletonCImpl.providesHostConfigProvider.get(), (NotificationsManager) this.singletonCImpl.providesPopupNotificationsManagerProvider.get(), ya.b.a(this.singletonCImpl.applicationContextModule));
                    case 1:
                        return (T) ApiModule_ProvidesHostConfigFactory.providesHostConfig(this.singletonCImpl.apiModule, (SharedPreferences) this.singletonCImpl.provideSharedPreferencesProvider.get(), this.singletonCImpl.keyHelper(), ya.b.a(this.singletonCImpl.applicationContextModule));
                    case 2:
                        return (T) AppModule_ProvideSharedPreferencesFactory.provideSharedPreferences(this.singletonCImpl.appModule, ya.b.a(this.singletonCImpl.applicationContextModule));
                    case 3:
                        return (T) ApiModule_ProvidesPopupNotificationsManagerFactory.providesPopupNotificationsManager(this.singletonCImpl.apiModule);
                    case 4:
                        return (T) AppModule_PushNotificationManagerFactory.pushNotificationManager(this.singletonCImpl.appModule, (ApiClient) this.singletonCImpl.providesApiHelperProvider.get(), (SharedPreferences) this.singletonCImpl.provideSharedPreferencesProvider.get(), ya.b.a(this.singletonCImpl.applicationContextModule));
                    case 5:
                        return (T) AppModule_ProvidesAuthenticationHandlerFactory.providesAuthenticationHandler(this.singletonCImpl.appModule, (SharedPreferences) this.singletonCImpl.provideSharedPreferencesProvider.get());
                    case 6:
                        return (T) AppModule_ProvidesRemoteConfigManagerFactory.providesRemoteConfigManager(this.singletonCImpl.appModule, this.singletonCImpl.contentRepository());
                    case 7:
                        return (T) UserModule_ProvidesUserViewModelFactory.providesUserViewModel(this.singletonCImpl.userModule, (AuthenticationHandler) this.singletonCImpl.providesAuthenticationHandlerProvider.get(), this.singletonCImpl.userRepository(), this.singletonCImpl.socialRepository());
                    case 8:
                        return (T) UserRepositoryModule_ProvidesPurchaseHandlerFactory.providesPurchaseHandler(this.singletonCImpl.userRepositoryModule, ya.b.a(this.singletonCImpl.applicationContextModule), (ApiClient) this.singletonCImpl.providesApiHelperProvider.get(), (MainUserViewModel) this.singletonCImpl.providesUserViewModelProvider.get());
                    case 9:
                        return (T) new SoundManager(this.singletonCImpl.soundFileLoader());
                    default:
                        throw new AssertionError(this.f12486id);
                }
            }
        }

        private ChallengeLocalRepository challengeLocalRepository() {
            return UserRepositoryModule_ProvideChallengeLocalRepositoryFactory.provideChallengeLocalRepository(this.userRepositoryModule, RepositoryModule_ProvidesRealmFactory.providesRealm(this.repositoryModule));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public ChallengeRepository challengeRepository() {
            return UserRepositoryModule_ProvidesChallengeRepositoryFactory.providesChallengeRepository(this.userRepositoryModule, challengeLocalRepository(), this.providesApiHelperProvider.get(), this.providesAuthenticationHandlerProvider.get());
        }

        private ContentLocalRepository contentLocalRepository() {
            RepositoryModule repositoryModule = this.repositoryModule;
            return RepositoryModule_ProvidesContentLocalRepositoryFactory.providesContentLocalRepository(repositoryModule, RepositoryModule_ProvidesRealmFactory.providesRealm(repositoryModule));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public ContentRepository contentRepository() {
            return RepositoryModule_ProvidesContentRepositoryFactory.providesContentRepository(this.repositoryModule, contentLocalRepository(), this.providesApiHelperProvider.get(), ya.b.a(this.applicationContextModule), this.providesAuthenticationHandlerProvider.get());
        }

        private CustomizationLocalRepository customizationLocalRepository() {
            return UserRepositoryModule_ProvidesCustomizationLocalRepositoryFactory.providesCustomizationLocalRepository(this.userRepositoryModule, RepositoryModule_ProvidesRealmFactory.providesRealm(this.repositoryModule));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public CustomizationRepository customizationRepository() {
            return UserRepositoryModule_ProvidesCustomizationRepositoryFactory.providesCustomizationRepository(this.userRepositoryModule, customizationLocalRepository(), this.providesApiHelperProvider.get(), this.providesAuthenticationHandlerProvider.get());
        }

        private FAQLocalRepository fAQLocalRepository() {
            return UserRepositoryModule_ProvidesFAQLocalRepositoryFactory.providesFAQLocalRepository(this.userRepositoryModule, RepositoryModule_ProvidesRealmFactory.providesRealm(this.repositoryModule));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public FAQRepository fAQRepository() {
            return UserRepositoryModule_ProvidesFAQRepositoryFactory.providesFAQRepository(this.userRepositoryModule, fAQLocalRepository(), this.providesApiHelperProvider.get(), this.providesAuthenticationHandlerProvider.get());
        }

        private void initialize(ApiModule apiModule, AppModule appModule, ya.a aVar, RepositoryModule repositoryModule, UserModule userModule, UserRepositoryModule userRepositoryModule) {
            this.provideSharedPreferencesProvider = bb.a.a(new SwitchingProvider(this.singletonCImpl, 2));
            this.providesHostConfigProvider = bb.a.a(new SwitchingProvider(this.singletonCImpl, 1));
            this.providesPopupNotificationsManagerProvider = bb.a.a(new SwitchingProvider(this.singletonCImpl, 3));
            this.providesApiHelperProvider = bb.a.a(new SwitchingProvider(this.singletonCImpl, 0));
            this.pushNotificationManagerProvider = bb.a.a(new SwitchingProvider(this.singletonCImpl, 4));
            this.providesAuthenticationHandlerProvider = bb.a.a(new SwitchingProvider(this.singletonCImpl, 5));
            this.providesRemoteConfigManagerProvider = bb.a.a(new SwitchingProvider(this.singletonCImpl, 6));
            this.providesUserViewModelProvider = bb.a.a(new SwitchingProvider(this.singletonCImpl, 7));
            this.providesPurchaseHandlerProvider = bb.a.a(new SwitchingProvider(this.singletonCImpl, 8));
            this.soundManagerProvider = bb.a.a(new SwitchingProvider(this.singletonCImpl, 9));
        }

        private AddTaskWidgetProvider injectAddTaskWidgetProvider2(AddTaskWidgetProvider addTaskWidgetProvider) {
            BaseWidgetProvider_MembersInjector.injectUserRepository(addTaskWidgetProvider, userRepository());
            return addTaskWidgetProvider;
        }

        private AvatarStatsWidgetProvider injectAvatarStatsWidgetProvider2(AvatarStatsWidgetProvider avatarStatsWidgetProvider) {
            BaseWidgetProvider_MembersInjector.injectUserRepository(avatarStatsWidgetProvider, userRepository());
            return avatarStatsWidgetProvider;
        }

        private HabitButtonWidgetProvider injectHabitButtonWidgetProvider2(HabitButtonWidgetProvider habitButtonWidgetProvider) {
            BaseWidgetProvider_MembersInjector.injectUserRepository(habitButtonWidgetProvider, userRepository());
            HabitButtonWidgetProvider_MembersInjector.injectTaskRepository(habitButtonWidgetProvider, taskRepository());
            return habitButtonWidgetProvider;
        }

        private HabiticaBaseApplication injectHabiticaBaseApplication2(HabiticaBaseApplication habiticaBaseApplication) {
            HabiticaBaseApplication_MembersInjector.injectLazyApiHelper(habiticaBaseApplication, this.providesApiHelperProvider.get());
            HabiticaBaseApplication_MembersInjector.injectSharedPrefs(habiticaBaseApplication, this.provideSharedPreferencesProvider.get());
            HabiticaBaseApplication_MembersInjector.injectPushNotificationManager(habiticaBaseApplication, this.pushNotificationManagerProvider.get());
            HabiticaBaseApplication_MembersInjector.injectAuthenticationHandler(habiticaBaseApplication, this.providesAuthenticationHandlerProvider.get());
            return habiticaBaseApplication;
        }

        private LocalNotificationActionReceiver injectLocalNotificationActionReceiver2(LocalNotificationActionReceiver localNotificationActionReceiver) {
            LocalNotificationActionReceiver_MembersInjector.injectUserRepository(localNotificationActionReceiver, userRepository());
            LocalNotificationActionReceiver_MembersInjector.injectSocialRepository(localNotificationActionReceiver, socialRepository());
            LocalNotificationActionReceiver_MembersInjector.injectTaskRepository(localNotificationActionReceiver, taskRepository());
            LocalNotificationActionReceiver_MembersInjector.injectApiClient(localNotificationActionReceiver, this.providesApiHelperProvider.get());
            return localNotificationActionReceiver;
        }

        private NotificationPublisher injectNotificationPublisher2(NotificationPublisher notificationPublisher) {
            NotificationPublisher_MembersInjector.injectTaskRepository(notificationPublisher, taskRepository());
            NotificationPublisher_MembersInjector.injectUserRepository(notificationPublisher, userRepository());
            NotificationPublisher_MembersInjector.injectSharedPreferences(notificationPublisher, this.provideSharedPreferencesProvider.get());
            return notificationPublisher;
        }

        private TaskAlarmBootReceiver injectTaskAlarmBootReceiver2(TaskAlarmBootReceiver taskAlarmBootReceiver) {
            TaskAlarmBootReceiver_MembersInjector.injectTaskAlarmManager(taskAlarmBootReceiver, taskAlarmManager());
            TaskAlarmBootReceiver_MembersInjector.injectSharedPreferences(taskAlarmBootReceiver, this.provideSharedPreferencesProvider.get());
            return taskAlarmBootReceiver;
        }

        private TaskListWidgetProvider injectTaskListWidgetProvider2(TaskListWidgetProvider taskListWidgetProvider) {
            BaseWidgetProvider_MembersInjector.injectUserRepository(taskListWidgetProvider, userRepository());
            TaskListWidgetProvider_MembersInjector.injectTaskRepository(taskListWidgetProvider, taskRepository());
            return taskListWidgetProvider;
        }

        private TaskReceiver injectTaskReceiver2(TaskReceiver taskReceiver) {
            TaskReceiver_MembersInjector.injectTaskAlarmManager(taskReceiver, taskAlarmManager());
            TaskReceiver_MembersInjector.injectTaskRepository(taskReceiver, taskRepository());
            return taskReceiver;
        }

        private InventoryLocalRepository inventoryLocalRepository() {
            return UserRepositoryModule_ProvidesInventoryLocalRepositoryFactory.providesInventoryLocalRepository(this.userRepositoryModule, RepositoryModule_ProvidesRealmFactory.providesRealm(this.repositoryModule));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public KeyHelper keyHelper() {
            return this.appModule.provideKeyHelper(ya.b.a(this.applicationContextModule), this.provideSharedPreferencesProvider.get(), this.appModule.provideKeyStore());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public MaintenanceApiService maintenanceApiService() {
            ApiModule apiModule = this.apiModule;
            return ApiModule_ProvidesMaintenanceApiServiceFactory.providesMaintenanceApiService(apiModule, ApiModule_ProvidesGsonConverterFactoryFactory.providesGsonConverterFactory(apiModule));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public ReviewManager reviewManager() {
            return AppModule_ProvidesReviewManagerFactory.providesReviewManager(this.appModule, ya.b.a(this.applicationContextModule), this.providesRemoteConfigManagerProvider.get());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public SetupCustomizationRepository setupCustomizationRepository() {
            return UserRepositoryModule_ProvidesSetupCustomizationRepositoryFactory.providesSetupCustomizationRepository(this.userRepositoryModule, ya.b.a(this.applicationContextModule));
        }

        private SocialLocalRepository socialLocalRepository() {
            return UserRepositoryModule_ProvidesSocialLocalRepositoryFactory.providesSocialLocalRepository(this.userRepositoryModule, RepositoryModule_ProvidesRealmFactory.providesRealm(this.repositoryModule));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public SocialRepository socialRepository() {
            return UserRepositoryModule_ProvidesSocialRepositoryFactory.providesSocialRepository(this.userRepositoryModule, socialLocalRepository(), this.providesApiHelperProvider.get(), this.providesAuthenticationHandlerProvider.get());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public SoundFileLoader soundFileLoader() {
            return AppModule_ProvidesSoundFileLoaderFactory.providesSoundFileLoader(this.appModule, ya.b.a(this.applicationContextModule));
        }

        private TagLocalRepository tagLocalRepository() {
            return UserRepositoryModule_ProvidesTagLocalRepositoryFactory.providesTagLocalRepository(this.userRepositoryModule, RepositoryModule_ProvidesRealmFactory.providesRealm(this.repositoryModule));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public TagRepository tagRepository() {
            return UserRepositoryModule_ProvidesTagRepositoryFactory.providesTagRepository(this.userRepositoryModule, tagLocalRepository(), this.providesApiHelperProvider.get(), this.providesAuthenticationHandlerProvider.get());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public TaskAlarmManager taskAlarmManager() {
            return UserModule_ProvidesTaskAlarmManagerFactory.providesTaskAlarmManager(this.userModule, ya.b.a(this.applicationContextModule), taskRepository(), this.providesAuthenticationHandlerProvider.get());
        }

        private TaskLocalRepository taskLocalRepository() {
            return UserRepositoryModule_ProvidesTaskLocalRepositoryFactory.providesTaskLocalRepository(this.userRepositoryModule, RepositoryModule_ProvidesRealmFactory.providesRealm(this.repositoryModule));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public TaskRepository taskRepository() {
            return UserRepositoryModule_ProvidesTaskRepositoryFactory.providesTaskRepository(this.userRepositoryModule, taskLocalRepository(), this.providesApiHelperProvider.get(), this.providesAuthenticationHandlerProvider.get(), this.providesRemoteConfigManagerProvider.get());
        }

        private TutorialLocalRepository tutorialLocalRepository() {
            return UserRepositoryModule_ProvidesTutorialLocalRepositoryFactory.providesTutorialLocalRepository(this.userRepositoryModule, RepositoryModule_ProvidesRealmFactory.providesRealm(this.repositoryModule));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public TutorialRepository tutorialRepository() {
            return UserRepositoryModule_ProvidesTutorialRepositoryFactory.providesTutorialRepository(this.userRepositoryModule, tutorialLocalRepository(), this.providesApiHelperProvider.get(), this.providesAuthenticationHandlerProvider.get());
        }

        private UserLocalRepository userLocalRepository() {
            return UserRepositoryModule_ProvidesUserLocalRepositoryFactory.providesUserLocalRepository(this.userRepositoryModule, RepositoryModule_ProvidesRealmFactory.providesRealm(this.repositoryModule));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public UserRepository userRepository() {
            return UserRepositoryModule_ProvidesUserRepositoryFactory.providesUserRepository(this.userRepositoryModule, userLocalRepository(), this.providesApiHelperProvider.get(), this.providesAuthenticationHandlerProvider.get(), taskRepository(), this.providesRemoteConfigManagerProvider.get());
        }

        @Override // com.habitrpg.android.habitica.ui.views.insufficientCurrency.InsufficientGemsDialog.InsufficientGemsDialogEntryPoint, com.habitrpg.android.habitica.ui.views.subscriptions.SubscriberBenefitView.ThisEntryPoint
        public AppConfigManager configManager() {
            return this.providesRemoteConfigManagerProvider.get();
        }

        @Override // com.habitrpg.android.habitica.HabiticaBaseApplication_HiltComponents.SingletonC, ua.a.InterfaceC0567a
        public Set<Boolean> getDisableFragmentGetContextFix() {
            return com.google.common.collect.k.n();
        }

        @Override // com.habitrpg.android.habitica.widget.AddTaskWidgetProvider_GeneratedInjector
        public void injectAddTaskWidgetProvider(AddTaskWidgetProvider addTaskWidgetProvider) {
            injectAddTaskWidgetProvider2(addTaskWidgetProvider);
        }

        @Override // com.habitrpg.android.habitica.widget.AvatarStatsWidgetProvider_GeneratedInjector
        public void injectAvatarStatsWidgetProvider(AvatarStatsWidgetProvider avatarStatsWidgetProvider) {
            injectAvatarStatsWidgetProvider2(avatarStatsWidgetProvider);
        }

        @Override // com.habitrpg.android.habitica.widget.HabitButtonWidgetProvider_GeneratedInjector
        public void injectHabitButtonWidgetProvider(HabitButtonWidgetProvider habitButtonWidgetProvider) {
            injectHabitButtonWidgetProvider2(habitButtonWidgetProvider);
        }

        @Override // com.habitrpg.android.habitica.HabiticaBaseApplication_GeneratedInjector
        public void injectHabiticaBaseApplication(HabiticaBaseApplication habiticaBaseApplication) {
            injectHabiticaBaseApplication2(habiticaBaseApplication);
        }

        @Override // com.habitrpg.android.habitica.receivers.LocalNotificationActionReceiver_GeneratedInjector
        public void injectLocalNotificationActionReceiver(LocalNotificationActionReceiver localNotificationActionReceiver) {
            injectLocalNotificationActionReceiver2(localNotificationActionReceiver);
        }

        @Override // com.habitrpg.android.habitica.receivers.NotificationPublisher_GeneratedInjector
        public void injectNotificationPublisher(NotificationPublisher notificationPublisher) {
            injectNotificationPublisher2(notificationPublisher);
        }

        @Override // com.habitrpg.android.habitica.receivers.TaskAlarmBootReceiver_GeneratedInjector
        public void injectTaskAlarmBootReceiver(TaskAlarmBootReceiver taskAlarmBootReceiver) {
            injectTaskAlarmBootReceiver2(taskAlarmBootReceiver);
        }

        @Override // com.habitrpg.android.habitica.widget.TaskListWidgetProvider_GeneratedInjector
        public void injectTaskListWidgetProvider(TaskListWidgetProvider taskListWidgetProvider) {
            injectTaskListWidgetProvider2(taskListWidgetProvider);
        }

        @Override // com.habitrpg.android.habitica.receivers.TaskReceiver_GeneratedInjector
        public void injectTaskReceiver(TaskReceiver taskReceiver) {
            injectTaskReceiver2(taskReceiver);
        }

        @Override // com.habitrpg.android.habitica.ui.views.insufficientCurrency.InsufficientGemsDialog.InsufficientGemsDialogEntryPoint
        public InsufficientGemsUseCase insufficientGemsUseCase() {
            return new InsufficientGemsUseCase(this.providesPurchaseHandlerProvider.get());
        }

        @Override // com.habitrpg.android.habitica.ui.views.subscriptions.SubscriberBenefitView.ThisEntryPoint
        public InventoryRepository inventoryRepository() {
            return UserRepositoryModule_ProvidesInventoryRepositoryFactory.providesInventoryRepository(this.userRepositoryModule, inventoryLocalRepository(), this.providesApiHelperProvider.get(), this.providesAuthenticationHandlerProvider.get(), this.providesRemoteConfigManagerProvider.get());
        }

        @Override // com.habitrpg.android.habitica.ui.views.dialogs.PetSuggestHatchDialog.PetSuggestHatchDialogEntryPoint
        public MainUserViewModel mainUserViewModel() {
            return this.providesUserViewModelProvider.get();
        }

        @Override // com.habitrpg.android.habitica.ui.views.insufficientCurrency.InsufficientGemsDialog.InsufficientGemsDialogEntryPoint
        public PurchaseHandler purchaseHandler() {
            return this.providesPurchaseHandlerProvider.get();
        }

        @Override // com.habitrpg.android.habitica.HabiticaBaseApplication_HiltComponents.SingletonC, dagger.hilt.android.internal.managers.b.InterfaceC0303b
        public wa.b retainedComponentBuilder() {
            return new ActivityRetainedCBuilder(this.singletonCImpl);
        }

        @Override // com.habitrpg.android.habitica.HabiticaBaseApplication_HiltComponents.SingletonC, dagger.hilt.android.internal.managers.h.a
        public wa.d serviceComponentBuilder() {
            return new ServiceCBuilder(this.singletonCImpl);
        }

        @Override // com.habitrpg.android.habitica.ui.views.dialogs.PetSuggestHatchDialog.PetSuggestHatchDialogEntryPoint
        public HatchPetUseCase useCase() {
            return new HatchPetUseCase(inventoryRepository());
        }

        private SingletonCImpl(ApiModule apiModule, AppModule appModule, ya.a aVar, RepositoryModule repositoryModule, UserModule userModule, UserRepositoryModule userRepositoryModule) {
            this.singletonCImpl = this;
            this.apiModule = apiModule;
            this.appModule = appModule;
            this.applicationContextModule = aVar;
            this.userRepositoryModule = userRepositoryModule;
            this.repositoryModule = repositoryModule;
            this.userModule = userModule;
            initialize(apiModule, appModule, aVar, repositoryModule, userModule, userRepositoryModule);
        }
    }

    /* loaded from: classes4.dex */
    private static final class ViewCBuilder implements HabiticaBaseApplication_HiltComponents.ViewC.Builder {
        private final ActivityCImpl activityCImpl;
        private final ActivityRetainedCImpl activityRetainedCImpl;
        private final SingletonCImpl singletonCImpl;
        private View view;

        private ViewCBuilder(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl) {
            this.singletonCImpl = singletonCImpl;
            this.activityRetainedCImpl = activityRetainedCImpl;
            this.activityCImpl = activityCImpl;
        }

        @Override // com.habitrpg.android.habitica.HabiticaBaseApplication_HiltComponents.ViewC.Builder
        public HabiticaBaseApplication_HiltComponents.ViewC build() {
            bb.b.a(this.view, View.class);
            return new ViewCImpl(this.singletonCImpl, this.activityRetainedCImpl, this.activityCImpl, this.view);
        }

        @Override // com.habitrpg.android.habitica.HabiticaBaseApplication_HiltComponents.ViewC.Builder
        public ViewCBuilder view(View view) {
            this.view = (View) bb.b.b(view);
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class ViewCImpl extends HabiticaBaseApplication_HiltComponents.ViewC {
        private final ActivityCImpl activityCImpl;
        private final ActivityRetainedCImpl activityRetainedCImpl;
        private final SingletonCImpl singletonCImpl;
        private final ViewCImpl viewCImpl;

        private ViewCImpl(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl, View view) {
            this.viewCImpl = this;
            this.singletonCImpl = singletonCImpl;
            this.activityRetainedCImpl = activityRetainedCImpl;
            this.activityCImpl = activityCImpl;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class ViewModelCBuilder implements HabiticaBaseApplication_HiltComponents.ViewModelC.Builder {
        private final ActivityRetainedCImpl activityRetainedCImpl;
        private n0 savedStateHandle;
        private final SingletonCImpl singletonCImpl;
        private sa.c viewModelLifecycle;

        private ViewModelCBuilder(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl) {
            this.singletonCImpl = singletonCImpl;
            this.activityRetainedCImpl = activityRetainedCImpl;
        }

        @Override // com.habitrpg.android.habitica.HabiticaBaseApplication_HiltComponents.ViewModelC.Builder, wa.f
        public HabiticaBaseApplication_HiltComponents.ViewModelC build() {
            bb.b.a(this.savedStateHandle, n0.class);
            bb.b.a(this.viewModelLifecycle, sa.c.class);
            return new ViewModelCImpl(this.singletonCImpl, this.activityRetainedCImpl, this.savedStateHandle, this.viewModelLifecycle);
        }

        @Override // com.habitrpg.android.habitica.HabiticaBaseApplication_HiltComponents.ViewModelC.Builder, wa.f
        public ViewModelCBuilder savedStateHandle(n0 n0Var) {
            this.savedStateHandle = (n0) bb.b.b(n0Var);
            return this;
        }

        @Override // com.habitrpg.android.habitica.HabiticaBaseApplication_HiltComponents.ViewModelC.Builder, wa.f
        public ViewModelCBuilder viewModelLifecycle(sa.c cVar) {
            this.viewModelLifecycle = (sa.c) bb.b.b(cVar);
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class ViewModelCImpl extends HabiticaBaseApplication_HiltComponents.ViewModelC {
        private final ActivityRetainedCImpl activityRetainedCImpl;
        private cc.a<EquipmentOverviewViewModel> equipmentOverviewViewModelProvider;
        private cc.a<GroupViewModel> groupViewModelProvider;
        private cc.a<InboxViewModel> inboxViewModelProvider;
        private cc.a<MainActivityViewModel> mainActivityViewModelProvider;
        private cc.a<NotificationsViewModel> notificationsViewModelProvider;
        private cc.a<PartyInviteViewModel> partyInviteViewModelProvider;
        private cc.a<PartySeekingViewModel> partySeekingViewModelProvider;
        private cc.a<PartyViewModel> partyViewModelProvider;
        private final n0 savedStateHandle;
        private final SingletonCImpl singletonCImpl;
        private cc.a<StableViewModel> stableViewModelProvider;
        private cc.a<TaskFormViewModel> taskFormViewModelProvider;
        private cc.a<TaskSummaryViewModel> taskSummaryViewModelProvider;
        private cc.a<TasksViewModel> tasksViewModelProvider;
        private final ViewModelCImpl viewModelCImpl;

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes4.dex */
        public static final class SwitchingProvider<T> implements cc.a<T> {
            private final ActivityRetainedCImpl activityRetainedCImpl;

            /* renamed from: id  reason: collision with root package name */
            private final int f12487id;
            private final SingletonCImpl singletonCImpl;
            private final ViewModelCImpl viewModelCImpl;

            SwitchingProvider(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl, ViewModelCImpl viewModelCImpl, int i10) {
                this.singletonCImpl = singletonCImpl;
                this.activityRetainedCImpl = activityRetainedCImpl;
                this.viewModelCImpl = viewModelCImpl;
                this.f12487id = i10;
            }

            @Override // cc.a
            public T get() {
                switch (this.f12487id) {
                    case 0:
                        return (T) new EquipmentOverviewViewModel(this.singletonCImpl.userRepository(), (MainUserViewModel) this.singletonCImpl.providesUserViewModelProvider.get(), this.singletonCImpl.inventoryRepository());
                    case 1:
                        return (T) new GroupViewModel(this.singletonCImpl.userRepository(), (MainUserViewModel) this.singletonCImpl.providesUserViewModelProvider.get(), this.singletonCImpl.challengeRepository(), this.singletonCImpl.socialRepository(), (NotificationsManager) this.singletonCImpl.providesPopupNotificationsManagerProvider.get());
                    case 2:
                        return (T) new InboxViewModel(this.viewModelCImpl.savedStateHandle, this.singletonCImpl.userRepository(), (MainUserViewModel) this.singletonCImpl.providesUserViewModelProvider.get(), this.singletonCImpl.socialRepository());
                    case 3:
                        return (T) new MainActivityViewModel(this.singletonCImpl.userRepository(), (MainUserViewModel) this.singletonCImpl.providesUserViewModelProvider.get(), (HostConfig) this.singletonCImpl.providesHostConfigProvider.get(), (PushNotificationManager) this.singletonCImpl.pushNotificationManagerProvider.get(), (SharedPreferences) this.singletonCImpl.provideSharedPreferencesProvider.get(), this.singletonCImpl.contentRepository(), this.singletonCImpl.taskRepository(), this.singletonCImpl.inventoryRepository(), this.singletonCImpl.taskAlarmManager(), this.singletonCImpl.maintenanceApiService());
                    case 4:
                        return (T) new NotificationsViewModel(this.singletonCImpl.userRepository(), (MainUserViewModel) this.singletonCImpl.providesUserViewModelProvider.get(), (NotificationsManager) this.singletonCImpl.providesPopupNotificationsManagerProvider.get(), this.singletonCImpl.socialRepository());
                    case 5:
                        return (T) new PartyInviteViewModel(this.singletonCImpl.userRepository(), (MainUserViewModel) this.singletonCImpl.providesUserViewModelProvider.get(), this.singletonCImpl.socialRepository());
                    case 6:
                        return (T) new PartySeekingViewModel(this.singletonCImpl.userRepository(), (MainUserViewModel) this.singletonCImpl.providesUserViewModelProvider.get(), this.singletonCImpl.socialRepository());
                    case 7:
                        return (T) new PartyViewModel(this.singletonCImpl.userRepository(), (MainUserViewModel) this.singletonCImpl.providesUserViewModelProvider.get(), this.singletonCImpl.challengeRepository(), this.singletonCImpl.socialRepository(), (NotificationsManager) this.singletonCImpl.providesPopupNotificationsManagerProvider.get());
                    case 8:
                        return (T) new StableViewModel(this.viewModelCImpl.savedStateHandle, this.singletonCImpl.userRepository(), (MainUserViewModel) this.singletonCImpl.providesUserViewModelProvider.get(), this.singletonCImpl.inventoryRepository());
                    case 9:
                        return (T) new TaskFormViewModel(this.singletonCImpl.userRepository(), (MainUserViewModel) this.singletonCImpl.providesUserViewModelProvider.get());
                    case 10:
                        return (T) new TaskSummaryViewModel(this.viewModelCImpl.savedStateHandle, this.singletonCImpl.userRepository(), (MainUserViewModel) this.singletonCImpl.providesUserViewModelProvider.get(), this.singletonCImpl.taskRepository(), this.singletonCImpl.socialRepository());
                    case 11:
                        return (T) new TasksViewModel(this.singletonCImpl.userRepository(), (MainUserViewModel) this.singletonCImpl.providesUserViewModelProvider.get(), this.singletonCImpl.taskRepository(), this.singletonCImpl.tagRepository(), (AppConfigManager) this.singletonCImpl.providesRemoteConfigManagerProvider.get(), (SharedPreferences) this.singletonCImpl.provideSharedPreferencesProvider.get());
                    default:
                        throw new AssertionError(this.f12487id);
                }
            }
        }

        private void initialize(n0 n0Var, sa.c cVar) {
            this.equipmentOverviewViewModelProvider = new SwitchingProvider(this.singletonCImpl, this.activityRetainedCImpl, this.viewModelCImpl, 0);
            this.groupViewModelProvider = new SwitchingProvider(this.singletonCImpl, this.activityRetainedCImpl, this.viewModelCImpl, 1);
            this.inboxViewModelProvider = new SwitchingProvider(this.singletonCImpl, this.activityRetainedCImpl, this.viewModelCImpl, 2);
            this.mainActivityViewModelProvider = new SwitchingProvider(this.singletonCImpl, this.activityRetainedCImpl, this.viewModelCImpl, 3);
            this.notificationsViewModelProvider = new SwitchingProvider(this.singletonCImpl, this.activityRetainedCImpl, this.viewModelCImpl, 4);
            this.partyInviteViewModelProvider = new SwitchingProvider(this.singletonCImpl, this.activityRetainedCImpl, this.viewModelCImpl, 5);
            this.partySeekingViewModelProvider = new SwitchingProvider(this.singletonCImpl, this.activityRetainedCImpl, this.viewModelCImpl, 6);
            this.partyViewModelProvider = new SwitchingProvider(this.singletonCImpl, this.activityRetainedCImpl, this.viewModelCImpl, 7);
            this.stableViewModelProvider = new SwitchingProvider(this.singletonCImpl, this.activityRetainedCImpl, this.viewModelCImpl, 8);
            this.taskFormViewModelProvider = new SwitchingProvider(this.singletonCImpl, this.activityRetainedCImpl, this.viewModelCImpl, 9);
            this.taskSummaryViewModelProvider = new SwitchingProvider(this.singletonCImpl, this.activityRetainedCImpl, this.viewModelCImpl, 10);
            this.tasksViewModelProvider = new SwitchingProvider(this.singletonCImpl, this.activityRetainedCImpl, this.viewModelCImpl, 11);
        }

        @Override // com.habitrpg.android.habitica.HabiticaBaseApplication_HiltComponents.ViewModelC, xa.d.b
        public Map<String, cc.a<v0>> getHiltViewModelMap() {
            return com.google.common.collect.j.a(12).f("com.habitrpg.android.habitica.ui.viewmodels.inventory.equipment.EquipmentOverviewViewModel", this.equipmentOverviewViewModelProvider).f("com.habitrpg.android.habitica.ui.viewmodels.GroupViewModel", this.groupViewModelProvider).f("com.habitrpg.android.habitica.ui.viewmodels.InboxViewModel", this.inboxViewModelProvider).f("com.habitrpg.android.habitica.ui.viewmodels.MainActivityViewModel", this.mainActivityViewModelProvider).f("com.habitrpg.android.habitica.ui.viewmodels.NotificationsViewModel", this.notificationsViewModelProvider).f("com.habitrpg.android.habitica.ui.fragments.social.party.PartyInviteViewModel", this.partyInviteViewModelProvider).f("com.habitrpg.android.habitica.ui.fragments.social.party.PartySeekingViewModel", this.partySeekingViewModelProvider).f("com.habitrpg.android.habitica.ui.viewmodels.PartyViewModel", this.partyViewModelProvider).f("com.habitrpg.android.habitica.ui.viewmodels.StableViewModel", this.stableViewModelProvider).f("com.habitrpg.android.habitica.ui.viewmodels.TaskFormViewModel", this.taskFormViewModelProvider).f("com.habitrpg.android.habitica.ui.activities.TaskSummaryViewModel", this.taskSummaryViewModelProvider).f("com.habitrpg.android.habitica.ui.viewmodels.TasksViewModel", this.tasksViewModelProvider).a();
        }

        private ViewModelCImpl(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl, n0 n0Var, sa.c cVar) {
            this.viewModelCImpl = this;
            this.singletonCImpl = singletonCImpl;
            this.activityRetainedCImpl = activityRetainedCImpl;
            this.savedStateHandle = n0Var;
            initialize(n0Var, cVar);
        }
    }

    /* loaded from: classes4.dex */
    private static final class ViewWithFragmentCBuilder implements HabiticaBaseApplication_HiltComponents.ViewWithFragmentC.Builder {
        private final ActivityCImpl activityCImpl;
        private final ActivityRetainedCImpl activityRetainedCImpl;
        private final FragmentCImpl fragmentCImpl;
        private final SingletonCImpl singletonCImpl;
        private View view;

        private ViewWithFragmentCBuilder(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl, FragmentCImpl fragmentCImpl) {
            this.singletonCImpl = singletonCImpl;
            this.activityRetainedCImpl = activityRetainedCImpl;
            this.activityCImpl = activityCImpl;
            this.fragmentCImpl = fragmentCImpl;
        }

        @Override // com.habitrpg.android.habitica.HabiticaBaseApplication_HiltComponents.ViewWithFragmentC.Builder
        public HabiticaBaseApplication_HiltComponents.ViewWithFragmentC build() {
            bb.b.a(this.view, View.class);
            return new ViewWithFragmentCImpl(this.singletonCImpl, this.activityRetainedCImpl, this.activityCImpl, this.fragmentCImpl, this.view);
        }

        @Override // com.habitrpg.android.habitica.HabiticaBaseApplication_HiltComponents.ViewWithFragmentC.Builder
        public ViewWithFragmentCBuilder view(View view) {
            this.view = (View) bb.b.b(view);
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class ViewWithFragmentCImpl extends HabiticaBaseApplication_HiltComponents.ViewWithFragmentC {
        private final ActivityCImpl activityCImpl;
        private final ActivityRetainedCImpl activityRetainedCImpl;
        private final FragmentCImpl fragmentCImpl;
        private final SingletonCImpl singletonCImpl;
        private final ViewWithFragmentCImpl viewWithFragmentCImpl;

        private ViewWithFragmentCImpl(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl, FragmentCImpl fragmentCImpl, View view) {
            this.viewWithFragmentCImpl = this;
            this.singletonCImpl = singletonCImpl;
            this.activityRetainedCImpl = activityRetainedCImpl;
            this.activityCImpl = activityCImpl;
            this.fragmentCImpl = fragmentCImpl;
        }
    }

    private DaggerHabiticaBaseApplication_HiltComponents_SingletonC() {
    }

    public static Builder builder() {
        return new Builder();
    }
}
