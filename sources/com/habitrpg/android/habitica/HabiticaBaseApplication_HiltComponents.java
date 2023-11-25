package com.habitrpg.android.habitica;

import android.app.Activity;
import android.app.Service;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.n0;
import com.habitrpg.android.habitica.helpers.notifications.HabiticaFirebaseMessagingService_GeneratedInjector;
import com.habitrpg.android.habitica.receivers.DeviceCommunicationService_GeneratedInjector;
import com.habitrpg.android.habitica.receivers.LocalNotificationActionReceiver_GeneratedInjector;
import com.habitrpg.android.habitica.receivers.NotificationPublisher_GeneratedInjector;
import com.habitrpg.android.habitica.receivers.TaskAlarmBootReceiver_GeneratedInjector;
import com.habitrpg.android.habitica.receivers.TaskReceiver_GeneratedInjector;
import com.habitrpg.android.habitica.ui.activities.AddTaskWidgetActivity_GeneratedInjector;
import com.habitrpg.android.habitica.ui.activities.AdventureGuideActivity_GeneratedInjector;
import com.habitrpg.android.habitica.ui.activities.ArmoireActivity_GeneratedInjector;
import com.habitrpg.android.habitica.ui.activities.BirthdayActivity_GeneratedInjector;
import com.habitrpg.android.habitica.ui.activities.ChallengeFormActivity_GeneratedInjector;
import com.habitrpg.android.habitica.ui.activities.ClassSelectionActivity_GeneratedInjector;
import com.habitrpg.android.habitica.ui.activities.DeathActivity_GeneratedInjector;
import com.habitrpg.android.habitica.ui.activities.FixCharacterValuesActivity_GeneratedInjector;
import com.habitrpg.android.habitica.ui.activities.FullProfileActivity_GeneratedInjector;
import com.habitrpg.android.habitica.ui.activities.GemPurchaseActivity_GeneratedInjector;
import com.habitrpg.android.habitica.ui.activities.GiftGemsActivity_GeneratedInjector;
import com.habitrpg.android.habitica.ui.activities.GiftSubscriptionActivity_GeneratedInjector;
import com.habitrpg.android.habitica.ui.activities.GroupFormActivity_GeneratedInjector;
import com.habitrpg.android.habitica.ui.activities.GroupInviteActivity_GeneratedInjector;
import com.habitrpg.android.habitica.ui.activities.GuidelinesActivity_GeneratedInjector;
import com.habitrpg.android.habitica.ui.activities.HabitButtonWidgetActivity_GeneratedInjector;
import com.habitrpg.android.habitica.ui.activities.IntroActivity_GeneratedInjector;
import com.habitrpg.android.habitica.ui.activities.LoginActivity_GeneratedInjector;
import com.habitrpg.android.habitica.ui.activities.MainActivity_GeneratedInjector;
import com.habitrpg.android.habitica.ui.activities.MaintenanceActivity_GeneratedInjector;
import com.habitrpg.android.habitica.ui.activities.NotificationsActivity_GeneratedInjector;
import com.habitrpg.android.habitica.ui.activities.PrefsActivity_GeneratedInjector;
import com.habitrpg.android.habitica.ui.activities.ReportMessageActivity_GeneratedInjector;
import com.habitrpg.android.habitica.ui.activities.SetupActivity_GeneratedInjector;
import com.habitrpg.android.habitica.ui.activities.SkillMemberActivity_GeneratedInjector;
import com.habitrpg.android.habitica.ui.activities.SkillTasksActivity_GeneratedInjector;
import com.habitrpg.android.habitica.ui.activities.TaskFormActivity_GeneratedInjector;
import com.habitrpg.android.habitica.ui.activities.TaskSummaryActivity_GeneratedInjector;
import com.habitrpg.android.habitica.ui.fragments.AboutFragment_GeneratedInjector;
import com.habitrpg.android.habitica.ui.fragments.AchievementsFragment_GeneratedInjector;
import com.habitrpg.android.habitica.ui.fragments.NavigationDrawerFragment_GeneratedInjector;
import com.habitrpg.android.habitica.ui.fragments.NewsFragment_GeneratedInjector;
import com.habitrpg.android.habitica.ui.fragments.PromoInfoFragment_GeneratedInjector;
import com.habitrpg.android.habitica.ui.fragments.PromoWebFragment_GeneratedInjector;
import com.habitrpg.android.habitica.ui.fragments.ReportBottomSheetFragment_GeneratedInjector;
import com.habitrpg.android.habitica.ui.fragments.StatsFragment_GeneratedInjector;
import com.habitrpg.android.habitica.ui.fragments.inventory.customization.AvatarCustomizationFragment_GeneratedInjector;
import com.habitrpg.android.habitica.ui.fragments.inventory.customization.AvatarEquipmentFragment_GeneratedInjector;
import com.habitrpg.android.habitica.ui.fragments.inventory.customization.AvatarOverviewFragment_GeneratedInjector;
import com.habitrpg.android.habitica.ui.fragments.inventory.customization.EquipmentOverviewFragment_GeneratedInjector;
import com.habitrpg.android.habitica.ui.fragments.inventory.equipment.EquipmentDetailFragment_GeneratedInjector;
import com.habitrpg.android.habitica.ui.fragments.inventory.items.ItemDialogFragment_GeneratedInjector;
import com.habitrpg.android.habitica.ui.fragments.inventory.items.ItemRecyclerFragment_GeneratedInjector;
import com.habitrpg.android.habitica.ui.fragments.inventory.items.ItemsFragment_GeneratedInjector;
import com.habitrpg.android.habitica.ui.fragments.inventory.shops.MarketFragment_GeneratedInjector;
import com.habitrpg.android.habitica.ui.fragments.inventory.shops.QuestShopFragment_GeneratedInjector;
import com.habitrpg.android.habitica.ui.fragments.inventory.shops.SeasonalShopFragment_GeneratedInjector;
import com.habitrpg.android.habitica.ui.fragments.inventory.shops.TimeTravelersShopFragment_GeneratedInjector;
import com.habitrpg.android.habitica.ui.fragments.inventory.stable.MountDetailRecyclerFragment_GeneratedInjector;
import com.habitrpg.android.habitica.ui.fragments.inventory.stable.PetDetailRecyclerFragment_GeneratedInjector;
import com.habitrpg.android.habitica.ui.fragments.inventory.stable.StableFragment_GeneratedInjector;
import com.habitrpg.android.habitica.ui.fragments.inventory.stable.StableRecyclerFragment_GeneratedInjector;
import com.habitrpg.android.habitica.ui.fragments.preferences.AccountPreferenceFragment_GeneratedInjector;
import com.habitrpg.android.habitica.ui.fragments.preferences.EmailNotificationsPreferencesFragment_GeneratedInjector;
import com.habitrpg.android.habitica.ui.fragments.preferences.HabiticaAccountDialog_GeneratedInjector;
import com.habitrpg.android.habitica.ui.fragments.preferences.PreferencesFragment_GeneratedInjector;
import com.habitrpg.android.habitica.ui.fragments.preferences.PushNotificationsPreferencesFragment_GeneratedInjector;
import com.habitrpg.android.habitica.ui.fragments.preferences.TimePreferenceDialogFragment_GeneratedInjector;
import com.habitrpg.android.habitica.ui.fragments.purchases.GemsPurchaseFragment_GeneratedInjector;
import com.habitrpg.android.habitica.ui.fragments.purchases.GiftBalanceGemsFragment_GeneratedInjector;
import com.habitrpg.android.habitica.ui.fragments.purchases.GiftPurchaseGemsFragment_GeneratedInjector;
import com.habitrpg.android.habitica.ui.fragments.purchases.SubscriptionBottomSheetFragment_GeneratedInjector;
import com.habitrpg.android.habitica.ui.fragments.purchases.SubscriptionFragment_GeneratedInjector;
import com.habitrpg.android.habitica.ui.fragments.setup.AvatarSetupFragment_GeneratedInjector;
import com.habitrpg.android.habitica.ui.fragments.setup.IntroFragment_GeneratedInjector;
import com.habitrpg.android.habitica.ui.fragments.setup.TaskSetupFragment_GeneratedInjector;
import com.habitrpg.android.habitica.ui.fragments.setup.WelcomeFragment_GeneratedInjector;
import com.habitrpg.android.habitica.ui.fragments.skills.SkillTasksRecyclerViewFragment_GeneratedInjector;
import com.habitrpg.android.habitica.ui.fragments.skills.SkillsFragment_GeneratedInjector;
import com.habitrpg.android.habitica.ui.fragments.social.ChatFragment_GeneratedInjector;
import com.habitrpg.android.habitica.ui.fragments.social.InboxMessageListFragment_GeneratedInjector;
import com.habitrpg.android.habitica.ui.fragments.social.InboxOverviewFragment_GeneratedInjector;
import com.habitrpg.android.habitica.ui.fragments.social.QuestDetailFragment_GeneratedInjector;
import com.habitrpg.android.habitica.ui.fragments.social.challenges.ChallengeDetailFragment_GeneratedInjector;
import com.habitrpg.android.habitica.ui.fragments.social.challenges.ChallengeListFragment_GeneratedInjector;
import com.habitrpg.android.habitica.ui.fragments.social.challenges.ChallengesOverviewFragment_GeneratedInjector;
import com.habitrpg.android.habitica.ui.fragments.social.guilds.GuildDetailFragment_GeneratedInjector;
import com.habitrpg.android.habitica.ui.fragments.social.guilds.GuildFragment_GeneratedInjector;
import com.habitrpg.android.habitica.ui.fragments.social.party.NoPartyFragmentFragment_GeneratedInjector;
import com.habitrpg.android.habitica.ui.fragments.social.party.PartyDetailFragment_GeneratedInjector;
import com.habitrpg.android.habitica.ui.fragments.social.party.PartyFragment_GeneratedInjector;
import com.habitrpg.android.habitica.ui.fragments.social.party.PartyInviteFragment_GeneratedInjector;
import com.habitrpg.android.habitica.ui.fragments.social.party.PartyInvitePagerFragment_GeneratedInjector;
import com.habitrpg.android.habitica.ui.fragments.social.party.PartySeekingFragment_GeneratedInjector;
import com.habitrpg.android.habitica.ui.fragments.support.BugFixFragment_GeneratedInjector;
import com.habitrpg.android.habitica.ui.fragments.support.FAQDetailFragment_GeneratedInjector;
import com.habitrpg.android.habitica.ui.fragments.support.FAQOverviewFragment_GeneratedInjector;
import com.habitrpg.android.habitica.ui.fragments.support.SupportMainFragment_GeneratedInjector;
import com.habitrpg.android.habitica.ui.fragments.tasks.RewardsRecyclerviewFragment_GeneratedInjector;
import com.habitrpg.android.habitica.ui.fragments.tasks.TaskRecyclerViewFragment_GeneratedInjector;
import com.habitrpg.android.habitica.ui.fragments.tasks.TasksFragment_GeneratedInjector;
import com.habitrpg.android.habitica.ui.views.dialogs.PetSuggestHatchDialog;
import com.habitrpg.android.habitica.ui.views.insufficientCurrency.InsufficientGemsDialog;
import com.habitrpg.android.habitica.ui.views.subscriptions.SubscriberBenefitView;
import com.habitrpg.android.habitica.widget.AddTaskWidgetProvider_GeneratedInjector;
import com.habitrpg.android.habitica.widget.AvatarStatsWidgetProvider_GeneratedInjector;
import com.habitrpg.android.habitica.widget.DailiesWidgetService_GeneratedInjector;
import com.habitrpg.android.habitica.widget.HabitButtonWidgetProvider_GeneratedInjector;
import com.habitrpg.android.habitica.widget.HabitButtonWidgetService_GeneratedInjector;
import com.habitrpg.android.habitica.widget.TaskListWidgetProvider_GeneratedInjector;
import com.habitrpg.android.habitica.widget.TodosWidgetService_GeneratedInjector;
import dagger.hilt.android.internal.managers.a;
import dagger.hilt.android.internal.managers.b;
import dagger.hilt.android.internal.managers.g;
import dagger.hilt.android.internal.managers.h;
import java.util.Map;
import java.util.Set;
import ua.a;
import xa.a;
import xa.d;

/* loaded from: classes4.dex */
public final class HabiticaBaseApplication_HiltComponents {

    /* loaded from: classes4.dex */
    public static abstract class ActivityC implements AddTaskWidgetActivity_GeneratedInjector, AdventureGuideActivity_GeneratedInjector, ArmoireActivity_GeneratedInjector, BirthdayActivity_GeneratedInjector, ChallengeFormActivity_GeneratedInjector, ClassSelectionActivity_GeneratedInjector, DeathActivity_GeneratedInjector, FixCharacterValuesActivity_GeneratedInjector, FullProfileActivity_GeneratedInjector, GemPurchaseActivity_GeneratedInjector, GiftGemsActivity_GeneratedInjector, GiftSubscriptionActivity_GeneratedInjector, GroupFormActivity_GeneratedInjector, GroupInviteActivity_GeneratedInjector, GuidelinesActivity_GeneratedInjector, HabitButtonWidgetActivity_GeneratedInjector, IntroActivity_GeneratedInjector, LoginActivity_GeneratedInjector, MainActivity_GeneratedInjector, MaintenanceActivity_GeneratedInjector, NotificationsActivity_GeneratedInjector, PrefsActivity_GeneratedInjector, ReportMessageActivity_GeneratedInjector, SetupActivity_GeneratedInjector, SkillMemberActivity_GeneratedInjector, SkillTasksActivity_GeneratedInjector, TaskFormActivity_GeneratedInjector, TaskSummaryActivity_GeneratedInjector, ta.a, a.InterfaceC0588a, g.a, ab.a {

        /* loaded from: classes4.dex */
        interface Builder extends wa.a {
            @Override // wa.a
            /* synthetic */ wa.a activity(Activity activity);

            @Override // wa.a
            /* synthetic */ ta.a build();
        }

        public abstract /* synthetic */ wa.c fragmentComponentBuilder();

        public abstract /* synthetic */ a.c getHiltInternalFactoryFactory();

        public abstract /* synthetic */ wa.f getViewModelComponentBuilder();

        public abstract /* synthetic */ Set getViewModelKeys();

        public abstract /* synthetic */ wa.e viewComponentBuilder();
    }

    /* loaded from: classes4.dex */
    interface ActivityCBuilderModule {
        wa.a bind(ActivityC.Builder builder);
    }

    /* loaded from: classes4.dex */
    public static abstract class ActivityRetainedC implements ta.b, a.InterfaceC0302a, b.d, ab.a {

        /* loaded from: classes4.dex */
        interface Builder extends wa.b {
            @Override // wa.b
            /* synthetic */ ta.b build();
        }

        public abstract /* synthetic */ wa.a activityComponentBuilder();

        public abstract /* synthetic */ sa.a getActivityRetainedLifecycle();
    }

    /* loaded from: classes4.dex */
    interface ActivityRetainedCBuilderModule {
        wa.b bind(ActivityRetainedC.Builder builder);
    }

    /* loaded from: classes4.dex */
    public static abstract class FragmentC implements AboutFragment_GeneratedInjector, AchievementsFragment_GeneratedInjector, NavigationDrawerFragment_GeneratedInjector, NewsFragment_GeneratedInjector, PromoInfoFragment_GeneratedInjector, PromoWebFragment_GeneratedInjector, ReportBottomSheetFragment_GeneratedInjector, StatsFragment_GeneratedInjector, AvatarCustomizationFragment_GeneratedInjector, AvatarEquipmentFragment_GeneratedInjector, AvatarOverviewFragment_GeneratedInjector, EquipmentOverviewFragment_GeneratedInjector, EquipmentDetailFragment_GeneratedInjector, ItemDialogFragment_GeneratedInjector, ItemRecyclerFragment_GeneratedInjector, ItemsFragment_GeneratedInjector, MarketFragment_GeneratedInjector, QuestShopFragment_GeneratedInjector, SeasonalShopFragment_GeneratedInjector, TimeTravelersShopFragment_GeneratedInjector, MountDetailRecyclerFragment_GeneratedInjector, PetDetailRecyclerFragment_GeneratedInjector, StableFragment_GeneratedInjector, StableRecyclerFragment_GeneratedInjector, AccountPreferenceFragment_GeneratedInjector, EmailNotificationsPreferencesFragment_GeneratedInjector, HabiticaAccountDialog_GeneratedInjector, PreferencesFragment_GeneratedInjector, PushNotificationsPreferencesFragment_GeneratedInjector, TimePreferenceDialogFragment_GeneratedInjector, GemsPurchaseFragment_GeneratedInjector, GiftBalanceGemsFragment_GeneratedInjector, GiftPurchaseGemsFragment_GeneratedInjector, SubscriptionBottomSheetFragment_GeneratedInjector, SubscriptionFragment_GeneratedInjector, AvatarSetupFragment_GeneratedInjector, IntroFragment_GeneratedInjector, TaskSetupFragment_GeneratedInjector, WelcomeFragment_GeneratedInjector, SkillTasksRecyclerViewFragment_GeneratedInjector, SkillsFragment_GeneratedInjector, ChatFragment_GeneratedInjector, InboxMessageListFragment_GeneratedInjector, InboxOverviewFragment_GeneratedInjector, QuestDetailFragment_GeneratedInjector, ChallengeDetailFragment_GeneratedInjector, ChallengeListFragment_GeneratedInjector, ChallengesOverviewFragment_GeneratedInjector, GuildDetailFragment_GeneratedInjector, GuildFragment_GeneratedInjector, NoPartyFragmentFragment_GeneratedInjector, PartyDetailFragment_GeneratedInjector, PartyFragment_GeneratedInjector, PartyInviteFragment_GeneratedInjector, PartyInvitePagerFragment_GeneratedInjector, PartySeekingFragment_GeneratedInjector, BugFixFragment_GeneratedInjector, FAQDetailFragment_GeneratedInjector, FAQOverviewFragment_GeneratedInjector, SupportMainFragment_GeneratedInjector, RewardsRecyclerviewFragment_GeneratedInjector, TaskRecyclerViewFragment_GeneratedInjector, TasksFragment_GeneratedInjector, ta.c, a.b, ab.a {

        /* loaded from: classes4.dex */
        interface Builder extends wa.c {
            @Override // wa.c
            /* synthetic */ ta.c build();

            @Override // wa.c
            /* synthetic */ wa.c fragment(Fragment fragment);
        }

        public abstract /* synthetic */ a.c getHiltInternalFactoryFactory();

        public abstract /* synthetic */ wa.g viewWithFragmentComponentBuilder();
    }

    /* loaded from: classes4.dex */
    interface FragmentCBuilderModule {
        wa.c bind(FragmentC.Builder builder);
    }

    /* loaded from: classes4.dex */
    public static abstract class ServiceC implements HabiticaFirebaseMessagingService_GeneratedInjector, DeviceCommunicationService_GeneratedInjector, DailiesWidgetService_GeneratedInjector, HabitButtonWidgetService_GeneratedInjector, TodosWidgetService_GeneratedInjector, ta.d, ab.a {

        /* loaded from: classes4.dex */
        interface Builder extends wa.d {
            @Override // wa.d
            /* synthetic */ ta.d build();

            @Override // wa.d
            /* synthetic */ wa.d service(Service service);
        }
    }

    /* loaded from: classes4.dex */
    interface ServiceCBuilderModule {
        wa.d bind(ServiceC.Builder builder);
    }

    /* loaded from: classes4.dex */
    public static abstract class SingletonC implements HabiticaBaseApplication_GeneratedInjector, LocalNotificationActionReceiver_GeneratedInjector, NotificationPublisher_GeneratedInjector, TaskAlarmBootReceiver_GeneratedInjector, TaskReceiver_GeneratedInjector, PetSuggestHatchDialog.PetSuggestHatchDialogEntryPoint, InsufficientGemsDialog.InsufficientGemsDialogEntryPoint, SubscriberBenefitView.ThisEntryPoint, AddTaskWidgetProvider_GeneratedInjector, AvatarStatsWidgetProvider_GeneratedInjector, HabitButtonWidgetProvider_GeneratedInjector, TaskListWidgetProvider_GeneratedInjector, a.InterfaceC0567a, b.InterfaceC0303b, h.a, ab.a {
        public abstract /* synthetic */ Set getDisableFragmentGetContextFix();

        public abstract /* synthetic */ wa.b retainedComponentBuilder();

        public abstract /* synthetic */ wa.d serviceComponentBuilder();
    }

    /* loaded from: classes4.dex */
    public static abstract class ViewC implements ta.e, ab.a {

        /* loaded from: classes4.dex */
        interface Builder extends wa.e {
            /* synthetic */ ta.e build();

            /* synthetic */ wa.e view(View view);
        }
    }

    /* loaded from: classes4.dex */
    interface ViewCBuilderModule {
        wa.e bind(ViewC.Builder builder);
    }

    /* loaded from: classes4.dex */
    public static abstract class ViewModelC implements ta.f, d.b, ab.a {

        /* loaded from: classes4.dex */
        interface Builder extends wa.f {
            @Override // wa.f
            /* synthetic */ ta.f build();

            @Override // wa.f
            /* synthetic */ wa.f savedStateHandle(n0 n0Var);

            @Override // wa.f
            /* synthetic */ wa.f viewModelLifecycle(sa.c cVar);
        }

        public abstract /* synthetic */ Map getHiltViewModelMap();
    }

    /* loaded from: classes4.dex */
    interface ViewModelCBuilderModule {
        wa.f bind(ViewModelC.Builder builder);
    }

    /* loaded from: classes4.dex */
    public static abstract class ViewWithFragmentC implements ta.g, ab.a {

        /* loaded from: classes4.dex */
        interface Builder extends wa.g {
            /* synthetic */ ta.g build();

            /* synthetic */ wa.g view(View view);
        }
    }

    /* loaded from: classes4.dex */
    interface ViewWithFragmentCBuilderModule {
        wa.g bind(ViewWithFragmentC.Builder builder);
    }

    private HabiticaBaseApplication_HiltComponents() {
    }
}
