package io.realm;

import com.habitrpg.android.habitica.models.user.EmailNotificationsPreference;
import com.habitrpg.android.habitica.models.user.Hair;
import com.habitrpg.android.habitica.models.user.PushNotificationsPreference;
import com.habitrpg.android.habitica.models.user.SuppressedModals;
import com.habitrpg.android.habitica.models.user.UserTaskPreferences;

/* compiled from: com_habitrpg_android_habitica_models_user_PreferencesRealmProxyInterface.java */
/* loaded from: classes4.dex */
public interface h7 {
    String realmGet$allocationMode();

    boolean realmGet$autoEquip();

    boolean realmGet$automaticAllocation();

    String realmGet$background();

    String realmGet$chair();

    boolean realmGet$costume();

    boolean realmGet$dailyDueDefaultView();

    int realmGet$dayStart();

    boolean realmGet$disableClasses();

    EmailNotificationsPreference realmGet$emailNotifications();

    Hair realmGet$hair();

    String realmGet$language();

    PushNotificationsPreference realmGet$pushNotifications();

    String realmGet$shirt();

    String realmGet$size();

    String realmGet$skin();

    boolean realmGet$sleep();

    String realmGet$sound();

    SuppressedModals realmGet$suppressModals();

    UserTaskPreferences realmGet$tasks();

    int realmGet$timezoneOffset();

    int realmGet$timezoneOffsetAtLastCron();

    void realmSet$allocationMode(String str);

    void realmSet$autoEquip(boolean z10);

    void realmSet$automaticAllocation(boolean z10);

    void realmSet$background(String str);

    void realmSet$chair(String str);

    void realmSet$costume(boolean z10);

    void realmSet$dailyDueDefaultView(boolean z10);

    void realmSet$dayStart(int i10);

    void realmSet$disableClasses(boolean z10);

    void realmSet$emailNotifications(EmailNotificationsPreference emailNotificationsPreference);

    void realmSet$hair(Hair hair);

    void realmSet$language(String str);

    void realmSet$pushNotifications(PushNotificationsPreference pushNotificationsPreference);

    void realmSet$shirt(String str);

    void realmSet$size(String str);

    void realmSet$skin(String str);

    void realmSet$sleep(boolean z10);

    void realmSet$sound(String str);

    void realmSet$suppressModals(SuppressedModals suppressedModals);

    void realmSet$tasks(UserTaskPreferences userTaskPreferences);

    void realmSet$timezoneOffset(int i10);

    void realmSet$timezoneOffsetAtLastCron(int i10);
}
