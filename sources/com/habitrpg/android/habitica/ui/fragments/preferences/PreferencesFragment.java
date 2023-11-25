package com.habitrpg.android.habitica.ui.fragments.preferences;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.activity.result.ActivityResult;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.w;
import androidx.preference.CheckBoxPreference;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.data.ApiClient;
import com.habitrpg.android.habitica.data.ContentRepository;
import com.habitrpg.android.habitica.extensions.AlertDialogExtensionsKt;
import com.habitrpg.android.habitica.helpers.Analytics;
import com.habitrpg.android.habitica.helpers.AppConfigManager;
import com.habitrpg.android.habitica.helpers.EventCategory;
import com.habitrpg.android.habitica.helpers.HitType;
import com.habitrpg.android.habitica.helpers.SoundManager;
import com.habitrpg.android.habitica.helpers.TaskAlarmManager;
import com.habitrpg.android.habitica.helpers.notifications.PushNotificationManager;
import com.habitrpg.android.habitica.models.user.Flags;
import com.habitrpg.android.habitica.models.user.Inbox;
import com.habitrpg.android.habitica.models.user.Preferences;
import com.habitrpg.android.habitica.models.user.User;
import com.habitrpg.android.habitica.prefs.TimePreference;
import com.habitrpg.android.habitica.ui.activities.ClassSelectionActivity;
import com.habitrpg.android.habitica.ui.activities.MainActivity;
import com.habitrpg.android.habitica.ui.activities.PrefsActivity;
import com.habitrpg.android.habitica.ui.fragments.preferences.TimePreferenceDialogFragment;
import com.habitrpg.android.habitica.ui.views.BottomSheetUtilsKt;
import com.habitrpg.android.habitica.ui.views.SnackbarActivity;
import com.habitrpg.android.habitica.ui.views.dialogs.HabiticaAlertDialog;
import com.habitrpg.android.habitica.ui.views.insufficientCurrency.InsufficientGemsDialog;
import com.habitrpg.common.habitica.helpers.ExceptionHandler;
import com.habitrpg.common.habitica.helpers.ExceptionHandlerKt;
import com.habitrpg.common.habitica.helpers.LanguageHelper;
import dc.r;
import ec.m0;
import java.util.Locale;
import java.util.Map;
import pc.p;
import qc.q;

/* compiled from: PreferencesFragment.kt */
/* loaded from: classes4.dex */
public final class PreferencesFragment extends Hilt_PreferencesFragment implements SharedPreferences.OnSharedPreferenceChangeListener {
    public static final int $stable = 8;
    public ApiClient apiClient;
    private Preference classSelectionPreference;
    private final androidx.activity.result.b<Intent> classSelectionResult;
    public AppConfigManager configManager;
    public ContentRepository contentRepository;
    private PreferenceScreen emailNotificationsPreference;
    private final androidx.activity.result.b<String> notificationPermissionLauncher;
    public PushNotificationManager pushNotificationManager;
    private PreferenceScreen pushNotificationsPreference;
    private ListPreference serverUrlPreference;
    public SoundManager soundManager;
    private ListPreference taskListPreference;
    private TimePreference timePreference;

    public PreferencesFragment() {
        androidx.activity.result.b<Intent> registerForActivityResult = registerForActivityResult(new f.d(), new androidx.activity.result.a() { // from class: com.habitrpg.android.habitica.ui.fragments.preferences.g
            @Override // androidx.activity.result.a
            public final void a(Object obj) {
                PreferencesFragment.classSelectionResult$lambda$0(PreferencesFragment.this, (ActivityResult) obj);
            }
        });
        q.h(registerForActivityResult, "registerForActivityResult(...)");
        this.classSelectionResult = registerForActivityResult;
        androidx.activity.result.b<String> registerForActivityResult2 = registerForActivityResult(new f.c(), new androidx.activity.result.a() { // from class: com.habitrpg.android.habitica.ui.fragments.preferences.h
            @Override // androidx.activity.result.a
            public final void a(Object obj) {
                PreferencesFragment.notificationPermissionLauncher$lambda$5(PreferencesFragment.this, (Boolean) obj);
            }
        });
        q.h(registerForActivityResult2, "registerForActivityResult(...)");
        this.notificationPermissionLauncher = registerForActivityResult2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void classSelectionResult$lambda$0(PreferencesFragment preferencesFragment, ActivityResult activityResult) {
        q.i(preferencesFragment, "this$0");
        ad.i.d(w.a(preferencesFragment), ExceptionHandler.Companion.coroutine$default(ExceptionHandler.Companion, null, 1, null), null, new PreferencesFragment$classSelectionResult$1$1(preferencesFragment, null), 2, null);
    }

    private final void logout() {
        Context context = getContext();
        if (context != null) {
            HabiticaAlertDialog habiticaAlertDialog = new HabiticaAlertDialog(context);
            habiticaAlertDialog.setTitle(R.string.are_you_sure);
            HabiticaAlertDialog.addButton$default(habiticaAlertDialog, (int) R.string.logout, true, false, false, (p) new PreferencesFragment$logout$1$1(context, this), 12, (Object) null);
            AlertDialogExtensionsKt.addCancelButton$default(habiticaAlertDialog, false, null, 3, null);
            habiticaAlertDialog.show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void notificationPermissionLauncher$lambda$5(PreferencesFragment preferencesFragment, Boolean bool) {
        q.i(preferencesFragment, "this$0");
        q.f(bool);
        HabiticaAlertDialog habiticaAlertDialog = null;
        CheckBoxPreference checkBoxPreference = null;
        if (bool.booleanValue()) {
            Preference findPreference = preferencesFragment.findPreference("usePushNotifications");
            if (findPreference instanceof CheckBoxPreference) {
                checkBoxPreference = (CheckBoxPreference) findPreference;
            }
            if (checkBoxPreference != null) {
                checkBoxPreference.d(true);
            }
            preferencesFragment.getPushNotificationManager().addPushDeviceUsingStoredToken();
            return;
        }
        Context context = preferencesFragment.getContext();
        if (context != null) {
            habiticaAlertDialog = new HabiticaAlertDialog(context);
        }
        if (habiticaAlertDialog != null) {
            habiticaAlertDialog.setTitle(R.string.push_notification_system_settings_title);
        }
        if (habiticaAlertDialog != null) {
            habiticaAlertDialog.setMessage(R.string.push_notification_system_settings_description);
        }
        if (habiticaAlertDialog != null) {
            HabiticaAlertDialog.addButton$default(habiticaAlertDialog, (int) R.string.open_settings, true, false, false, (p) new PreferencesFragment$notificationPermissionLauncher$1$1(preferencesFragment), 8, (Object) null);
        }
        if (habiticaAlertDialog != null) {
            HabiticaAlertDialog.addButton$default(habiticaAlertDialog, (int) R.string.cancel, false, false, false, (p) new PreferencesFragment$notificationPermissionLauncher$1$2(habiticaAlertDialog), 12, (Object) null);
        }
        if (habiticaAlertDialog != null) {
            habiticaAlertDialog.show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void reloadContent(boolean z10) {
        ad.i.d(w.a(this), ExceptionHandler.Companion.coroutine$default(ExceptionHandler.Companion, null, 1, null), null, new PreferencesFragment$reloadContent$1(this, z10, null), 2, null);
    }

    public final ApiClient getApiClient() {
        ApiClient apiClient = this.apiClient;
        if (apiClient != null) {
            return apiClient;
        }
        q.z("apiClient");
        return null;
    }

    public final AppConfigManager getConfigManager() {
        AppConfigManager appConfigManager = this.configManager;
        if (appConfigManager != null) {
            return appConfigManager;
        }
        q.z("configManager");
        return null;
    }

    public final ContentRepository getContentRepository() {
        ContentRepository contentRepository = this.contentRepository;
        if (contentRepository != null) {
            return contentRepository;
        }
        q.z("contentRepository");
        return null;
    }

    public final PushNotificationManager getPushNotificationManager() {
        PushNotificationManager pushNotificationManager = this.pushNotificationManager;
        if (pushNotificationManager != null) {
            return pushNotificationManager;
        }
        q.z("pushNotificationManager");
        return null;
    }

    public final SoundManager getSoundManager() {
        SoundManager soundManager = this.soundManager;
        if (soundManager != null) {
            return soundManager;
        }
        q.z("soundManager");
        return null;
    }

    @Override // androidx.preference.h, androidx.preference.k.a
    public void onDisplayPreferenceDialog(Preference preference) {
        q.i(preference, "preference");
        if (preference instanceof TimePreference) {
            FragmentManager parentFragmentManager = getParentFragmentManager();
            TimePreferenceDialogFragment.Companion companion = TimePreferenceDialogFragment.Companion;
            if (parentFragmentManager.j0(companion.getTAG()) == null) {
                String key = preference.getKey();
                q.h(key, "getKey(...)");
                companion.newInstance(this, key).show(getParentFragmentManager(), companion.getTAG());
                return;
            }
            return;
        }
        super.onDisplayPreferenceDialog(preference);
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        SharedPreferences l10 = getPreferenceManager().l();
        if (l10 != null) {
            l10.unregisterOnSharedPreferenceChangeListener(this);
        }
        super.onPause();
    }

    @Override // androidx.preference.h, androidx.preference.k.c
    public boolean onPreferenceTreeClick(Preference preference) {
        SnackbarActivity snackbarActivity;
        boolean z10;
        boolean z11;
        Map e10;
        Flags flags;
        Preferences preferences;
        q.i(preference, "preference");
        String key = preference.getKey();
        if (key != null) {
            switch (key.hashCode()) {
                case -1134119981:
                    if (key.equals("reload_content")) {
                        androidx.fragment.app.q activity = getActivity();
                        String str = null;
                        if (activity instanceof SnackbarActivity) {
                            snackbarActivity = (SnackbarActivity) activity;
                        } else {
                            snackbarActivity = null;
                        }
                        if (snackbarActivity != null) {
                            Context context = getContext();
                            if (context != null) {
                                str = context.getString(R.string.reloading_content);
                            }
                            SnackbarActivity.DefaultImpls.showSnackbar$default(snackbarActivity, null, null, str, null, null, null, null, null, false, 507, null);
                        }
                        reloadContent(true);
                        break;
                    }
                    break;
                case -1097329270:
                    if (key.equals("logout")) {
                        logout();
                        break;
                    }
                    break;
                case -589408944:
                    if (key.equals("choose_class")) {
                        User user$Habitica_2311256681_prodRelease = getUser$Habitica_2311256681_prodRelease();
                        int i10 = 0;
                        if (user$Habitica_2311256681_prodRelease != null && (preferences = user$Habitica_2311256681_prodRelease.getPreferences()) != null) {
                            z10 = preferences.getDisableClasses();
                        } else {
                            z10 = false;
                        }
                        User user$Habitica_2311256681_prodRelease2 = getUser$Habitica_2311256681_prodRelease();
                        if (user$Habitica_2311256681_prodRelease2 != null && (flags = user$Habitica_2311256681_prodRelease2.getFlags()) != null) {
                            z11 = flags.getClassSelected();
                        } else {
                            z11 = false;
                        }
                        Bundle bundle = new Bundle();
                        bundle.putBoolean("isInitialSelection", z11);
                        Intent intent = new Intent(getActivity(), ClassSelectionActivity.class);
                        intent.putExtras(bundle);
                        if (z11 && !z10) {
                            User user$Habitica_2311256681_prodRelease3 = getUser$Habitica_2311256681_prodRelease();
                            if (user$Habitica_2311256681_prodRelease3 != null) {
                                i10 = user$Habitica_2311256681_prodRelease3.getGemCount();
                            }
                            if (i10 >= 3) {
                                Context context2 = getContext();
                                if (context2 != null) {
                                    HabiticaAlertDialog habiticaAlertDialog = new HabiticaAlertDialog(context2);
                                    habiticaAlertDialog.setTitle(R.string.change_class_confirmation);
                                    habiticaAlertDialog.setMessage(R.string.change_class_message);
                                    HabiticaAlertDialog.addButton$default(habiticaAlertDialog, (int) R.string.change_class, true, true, false, (p) new PreferencesFragment$onPreferenceTreeClick$2$1(this, intent), 8, (Object) null);
                                    HabiticaAlertDialog.addButton$default(habiticaAlertDialog, (int) R.string.close, false, false, false, (p) null, 28, (Object) null);
                                    habiticaAlertDialog.enqueue();
                                }
                            } else {
                                androidx.fragment.app.q activity2 = getActivity();
                                if (activity2 != null) {
                                    InsufficientGemsDialog insufficientGemsDialog = new InsufficientGemsDialog(activity2, 3);
                                    Analytics analytics = Analytics.INSTANCE;
                                    EventCategory eventCategory = EventCategory.BEHAVIOUR;
                                    HitType hitType = HitType.EVENT;
                                    e10 = m0.e(r.a("reason", "class change"));
                                    Analytics.sendEvent$default(analytics, "show insufficient gems modal", eventCategory, hitType, e10, null, 16, null);
                                    insufficientGemsDialog.show();
                                }
                            }
                        } else {
                            this.classSelectionResult.a(intent);
                        }
                        return true;
                    }
                    break;
                case 1445192152:
                    if (key.equals("pause_damage")) {
                        BottomSheetUtilsKt.showAsBottomSheet(this, q0.c.c(-1899727427, true, new PreferencesFragment$onPreferenceTreeClick$1(this)));
                        break;
                    }
                    break;
            }
        }
        return super.onPreferenceTreeClick(preference);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        SharedPreferences l10 = getPreferenceManager().l();
        if (l10 != null) {
            l10.registerOnSharedPreferenceChangeListener(this);
        }
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        ListPreference listPreference;
        ListPreference listPreference2;
        Inbox inbox;
        String str2;
        Preferences preferences;
        Resources resources;
        DisplayMetrics displayMetrics;
        Resources resources2;
        ListPreference listPreference3;
        String string;
        q.i(sharedPreferences, "sharedPreferences");
        if (str != null) {
            boolean z10 = false;
            PrefsActivity prefsActivity = null;
            switch (str.hashCode()) {
                case -2098095496:
                    if (str.equals("launch_screen") && (listPreference = (ListPreference) findPreference(str)) != null) {
                        CharSequence entry = listPreference.getEntry();
                        if (entry == null) {
                            entry = "Habits";
                        }
                        listPreference.setSummary(entry);
                        return;
                    }
                    return;
                case -1930190840:
                    if (str.equals("task_display") && (listPreference2 = (ListPreference) findPreference(str)) != null) {
                        listPreference2.setSummary(listPreference2.getEntry());
                        return;
                    }
                    return;
                case -1825584525:
                    if (str.equals("server_url")) {
                        getApiClient().updateServerUrl(sharedPreferences.getString(str, ""));
                        Preference findPreference = findPreference(str);
                        if (findPreference != null) {
                            findPreference.setSummary(sharedPreferences.getString(str, ""));
                            return;
                        }
                        return;
                    }
                    return;
                case -1618916818:
                    if (str.equals("disablePMs")) {
                        boolean z11 = sharedPreferences.getBoolean("disablePMs", false);
                        User user$Habitica_2311256681_prodRelease = getUser$Habitica_2311256681_prodRelease();
                        if (user$Habitica_2311256681_prodRelease != null && (inbox = user$Habitica_2311256681_prodRelease.getInbox()) != null && inbox.getOptOut() == z11) {
                            z10 = true;
                        }
                        if (!z10) {
                            ExceptionHandlerKt.launchCatching$default(w.a(this), null, new PreferencesFragment$onSharedPreferenceChanged$7(this, z11, null), 1, null);
                            return;
                        }
                        return;
                    }
                    return;
                case -1615734086:
                    if (str.equals("cds_time")) {
                        String str3 = "0";
                        String string2 = sharedPreferences.getString("cds_time", "0");
                        if (string2 != null) {
                            str3 = string2;
                        }
                        ExceptionHandlerKt.launchCatching$default(w.a(this), null, new PreferencesFragment$onSharedPreferenceChanged$4(this, Integer.parseInt(str3), null), 1, null);
                        ListPreference listPreference4 = (ListPreference) findPreference(str);
                        if (listPreference4 != null) {
                            listPreference4.setSummary(listPreference4.getEntry());
                            return;
                        }
                        return;
                    }
                    return;
                case -1613589672:
                    if (str.equals("language")) {
                        LanguageHelper languageHelper = new LanguageHelper(sharedPreferences.getString(str, "en"));
                        Locale.setDefault(languageHelper.getLocale());
                        Configuration configuration = new Configuration();
                        configuration.setLocale(languageHelper.getLocale());
                        androidx.fragment.app.q activity = getActivity();
                        if (activity != null && (resources = activity.getResources()) != null) {
                            androidx.fragment.app.q activity2 = getActivity();
                            if (activity2 != null && (resources2 = activity2.getResources()) != null) {
                                displayMetrics = resources2.getDisplayMetrics();
                            } else {
                                displayMetrics = null;
                            }
                            resources.updateConfiguration(configuration, displayMetrics);
                        }
                        User user$Habitica_2311256681_prodRelease2 = getUser$Habitica_2311256681_prodRelease();
                        if (user$Habitica_2311256681_prodRelease2 != null && (preferences = user$Habitica_2311256681_prodRelease2.getPreferences()) != null) {
                            str2 = preferences.getLanguage();
                        } else {
                            str2 = null;
                        }
                        if (q.d(str2, languageHelper.getLanguageCode())) {
                            return;
                        }
                        ExceptionHandlerKt.launchCatching$default(w.a(this), null, new PreferencesFragment$onSharedPreferenceChanged$5(this, languageHelper, null), 1, null);
                        startActivity(new Intent(getActivity(), MainActivity.class));
                        androidx.fragment.app.q activity3 = getActivity();
                        if (activity3 != null) {
                            activity3.finishAffinity();
                            return;
                        }
                        return;
                    }
                    return;
                case -1369279446:
                    if (str.equals("use_reminder")) {
                        boolean z12 = sharedPreferences.getBoolean(str, false);
                        TimePreference timePreference = this.timePreference;
                        if (timePreference != null) {
                            timePreference.setEnabled(z12);
                        }
                        if (z12) {
                            TaskAlarmManager.Companion.scheduleDailyReminder(getContext());
                            return;
                        } else {
                            TaskAlarmManager.Companion.removeDailyReminder(getContext());
                            return;
                        }
                    }
                    return;
                case -1242609369:
                    if (str.equals("usePushNotifications")) {
                        boolean notificationPermissionEnabled = getPushNotificationManager().notificationPermissionEnabled();
                        boolean z13 = sharedPreferences.getBoolean(str, true);
                        PreferenceScreen preferenceScreen = this.pushNotificationsPreference;
                        if (preferenceScreen != null) {
                            preferenceScreen.setEnabled(z13);
                        }
                        ExceptionHandlerKt.launchCatching$default(w.a(this), null, new PreferencesFragment$onSharedPreferenceChanged$1(this, z13, null), 1, null);
                        if (z13) {
                            if (!notificationPermissionEnabled && Build.VERSION.SDK_INT >= 33) {
                                this.notificationPermissionLauncher.a("android.permission.POST_NOTIFICATIONS");
                                return;
                            } else {
                                getPushNotificationManager().addPushDeviceUsingStoredToken();
                                return;
                            }
                        }
                        ExceptionHandlerKt.launchCatching$default(w.a(this), null, new PreferencesFragment$onSharedPreferenceChanged$2(this, null), 1, null);
                        return;
                    }
                    return;
                case -954547590:
                    if (str.equals("reminder_time")) {
                        TaskAlarmManager.Companion companion = TaskAlarmManager.Companion;
                        companion.removeDailyReminder(getContext());
                        companion.scheduleDailyReminder(getContext());
                        return;
                    }
                    return;
                case -936421186:
                    if (str.equals("useEmails")) {
                        boolean z14 = sharedPreferences.getBoolean(str, true);
                        PreferenceScreen preferenceScreen2 = this.emailNotificationsPreference;
                        if (preferenceScreen2 != null) {
                            preferenceScreen2.setEnabled(z14);
                        }
                        ExceptionHandlerKt.launchCatching$default(w.a(this), null, new PreferencesFragment$onSharedPreferenceChanged$3(this, z14, null), 1, null);
                        return;
                    }
                    return;
                case 549040729:
                    if (str.equals("theme_mode")) {
                        androidx.fragment.app.q activity4 = getActivity();
                        if (activity4 instanceof PrefsActivity) {
                            prefsActivity = (PrefsActivity) activity4;
                        }
                        if (prefsActivity == null) {
                            return;
                        }
                        prefsActivity.reload();
                        return;
                    }
                    return;
                case 549057345:
                    if (str.equals("theme_name")) {
                        androidx.fragment.app.q activity5 = getActivity();
                        if (activity5 instanceof PrefsActivity) {
                            prefsActivity = (PrefsActivity) activity5;
                        }
                        if (prefsActivity == null) {
                            return;
                        }
                        prefsActivity.reload();
                        return;
                    }
                    return;
                case 1159501986:
                    if (str.equals("FirstDayOfTheWeek") && (listPreference3 = (ListPreference) findPreference(str)) != null) {
                        listPreference3.setSummary(listPreference3.getEntry());
                        return;
                    }
                    return;
                case 1538842515:
                    if (str.equals("audioTheme") && (string = sharedPreferences.getString(str, SoundManager.SoundThemeOff)) != null) {
                        ExceptionHandlerKt.launchCatching$default(w.a(this), null, new PreferencesFragment$onSharedPreferenceChanged$6(this, string, null), 1, null);
                        getSoundManager().setSoundTheme(string);
                        getSoundManager().preloadAllFiles();
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    @Override // androidx.preference.h, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        q.i(view, "view");
        super.onViewCreated(view, bundle);
        getListView().setItemAnimator(null);
        ExceptionHandlerKt.launchCatching$default(w.a(this), null, new PreferencesFragment$onViewCreated$1(this, null), 1, null);
    }

    public final void setApiClient(ApiClient apiClient) {
        q.i(apiClient, "<set-?>");
        this.apiClient = apiClient;
    }

    public final void setConfigManager(AppConfigManager appConfigManager) {
        q.i(appConfigManager, "<set-?>");
        this.configManager = appConfigManager;
    }

    public final void setContentRepository(ContentRepository contentRepository) {
        q.i(contentRepository, "<set-?>");
        this.contentRepository = contentRepository;
    }

    public final void setPushNotificationManager(PushNotificationManager pushNotificationManager) {
        q.i(pushNotificationManager, "<set-?>");
        this.pushNotificationManager = pushNotificationManager;
    }

    public final void setSoundManager(SoundManager soundManager) {
        q.i(soundManager, "<set-?>");
        this.soundManager = soundManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:191:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:285:? A[RETURN, SYNTHETIC] */
    @Override // com.habitrpg.android.habitica.ui.fragments.preferences.BasePreferencesFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setUser(com.habitrpg.android.habitica.models.user.User r12) {
        /*
            Method dump skipped, instructions count: 922
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.fragments.preferences.PreferencesFragment.setUser(com.habitrpg.android.habitica.models.user.User):void");
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.preferences.BasePreferencesFragment
    protected void setupPreferences() {
        TimePreference timePreference;
        Boolean bool;
        ListPreference listPreference;
        ListPreference listPreference2;
        ListPreference listPreference3;
        ListPreference listPreference4;
        ListPreference listPreference5;
        String str;
        boolean z10;
        Preference findPreference = findPreference("reminder_time");
        ListPreference listPreference6 = null;
        if (findPreference instanceof TimePreference) {
            timePreference = (TimePreference) findPreference;
        } else {
            timePreference = null;
        }
        this.timePreference = timePreference;
        SharedPreferences l10 = getPreferenceManager().l();
        if (l10 != null) {
            bool = Boolean.valueOf(l10.getBoolean("use_reminder", false));
        } else {
            bool = null;
        }
        TimePreference timePreference2 = this.timePreference;
        if (timePreference2 != null) {
            if (bool != null) {
                z10 = bool.booleanValue();
            } else {
                z10 = false;
            }
            timePreference2.setEnabled(z10);
        }
        this.classSelectionPreference = findPreference("choose_class");
        Preference findPreference2 = findPreference("FirstDayOfTheWeek");
        if (findPreference2 instanceof ListPreference) {
            listPreference = (ListPreference) findPreference2;
        } else {
            listPreference = null;
        }
        if (listPreference != null) {
            listPreference.setSummary(listPreference.getEntry());
        }
        Preference findPreference3 = findPreference("server_url");
        if (findPreference3 instanceof ListPreference) {
            listPreference2 = (ListPreference) findPreference3;
        } else {
            listPreference2 = null;
        }
        this.serverUrlPreference = listPreference2;
        if (listPreference2 != null) {
            listPreference2.setVisible(false);
        }
        ListPreference listPreference7 = this.serverUrlPreference;
        if (listPreference7 != null) {
            SharedPreferences l11 = getPreferenceManager().l();
            if (l11 != null) {
                str = l11.getString("server_url", "");
            } else {
                str = null;
            }
            listPreference7.setSummary(str);
        }
        Preference findPreference4 = findPreference("theme_name");
        if (findPreference4 instanceof ListPreference) {
            listPreference3 = (ListPreference) findPreference4;
        } else {
            listPreference3 = null;
        }
        if (listPreference3 != null) {
            CharSequence entry = listPreference3.getEntry();
            if (entry == null) {
                entry = "Default";
            }
            listPreference3.setSummary(entry);
        }
        Preference findPreference5 = findPreference("theme_mode");
        if (findPreference5 instanceof ListPreference) {
            listPreference4 = (ListPreference) findPreference5;
        } else {
            listPreference4 = null;
        }
        if (listPreference4 != null) {
            CharSequence entry2 = listPreference4.getEntry();
            if (entry2 == null) {
                entry2 = "Follow System";
            }
            listPreference4.setSummary(entry2);
        }
        Preference findPreference6 = findPreference("launch_screen");
        if (findPreference6 instanceof ListPreference) {
            listPreference5 = (ListPreference) findPreference6;
        } else {
            listPreference5 = null;
        }
        if (listPreference5 != null) {
            CharSequence entry3 = listPreference5.getEntry();
            if (entry3 == null) {
                entry3 = "Habits";
            }
            listPreference5.setSummary(entry3);
        }
        Preference findPreference7 = findPreference("task_display");
        if (findPreference7 instanceof ListPreference) {
            listPreference6 = (ListPreference) findPreference7;
        }
        if (getConfigManager().enableTaskDisplayMode()) {
            if (listPreference6 != null) {
                listPreference6.setVisible(true);
            }
            if (listPreference6 != null) {
                listPreference6.setSummary(listPreference6.getEntry());
            }
        } else if (listPreference6 != null) {
            listPreference6.setVisible(false);
        }
    }
}
