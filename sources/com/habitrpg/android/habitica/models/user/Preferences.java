package com.habitrpg.android.habitica.models.user;

import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;
import com.habitrpg.android.habitica.models.BaseObject;
import com.habitrpg.shared.habitica.models.AvatarPreferences;
import fa.c;
import io.realm.d1;
import io.realm.h7;
import io.realm.internal.o;
import qc.q;
import yc.w;

/* compiled from: Preferences.kt */
/* loaded from: classes4.dex */
public class Preferences extends d1 implements AvatarPreferences, BaseObject, h7 {
    public static final int $stable = 8;
    private String allocationMode;
    private boolean autoEquip;
    private boolean automaticAllocation;
    private String background;
    private String chair;
    private boolean costume;
    private boolean dailyDueDefaultView;
    private int dayStart;
    @c("disableClasses")
    private boolean disableClasses;
    private EmailNotificationsPreference emailNotifications;
    private Hair hair;
    private String language;
    private PushNotificationsPreference pushNotifications;
    private String shirt;
    private String size;
    private String skin;
    @c("sleep")
    private boolean sleep;
    private String sound;
    private SuppressedModals suppressModals;
    private UserTaskPreferences tasks;
    private int timezoneOffset;
    private int timezoneOffsetAtLastCron;

    public Preferences() {
        if (this instanceof o) {
            ((o) this).a();
        }
        realmSet$autoEquip(true);
    }

    public final String getAllocationMode() {
        return realmGet$allocationMode();
    }

    public final boolean getAutoEquip() {
        return realmGet$autoEquip();
    }

    public final boolean getAutomaticAllocation() {
        return realmGet$automaticAllocation();
    }

    @Override // com.habitrpg.shared.habitica.models.AvatarPreferences
    public String getBackground() {
        return realmGet$background();
    }

    @Override // com.habitrpg.shared.habitica.models.AvatarPreferences
    public String getChair() {
        boolean K;
        if (realmGet$chair() != null && !q.d(realmGet$chair(), DevicePublicKeyStringDef.NONE)) {
            String realmGet$chair = realmGet$chair();
            boolean z10 = false;
            if (realmGet$chair != null) {
                K = w.K(realmGet$chair, "chair_", false, 2, null);
                if (K) {
                    z10 = true;
                }
            }
            if (z10) {
                return realmGet$chair();
            }
            String realmGet$chair2 = realmGet$chair();
            q.f(realmGet$chair2);
            return "chair_" + realmGet$chair2;
        }
        return "chair_none";
    }

    @Override // com.habitrpg.shared.habitica.models.AvatarPreferences
    public boolean getCostume() {
        return realmGet$costume();
    }

    public final boolean getDailyDueDefaultView() {
        return realmGet$dailyDueDefaultView();
    }

    public final int getDayStart() {
        return realmGet$dayStart();
    }

    @Override // com.habitrpg.shared.habitica.models.AvatarPreferences
    public boolean getDisableClasses() {
        return realmGet$disableClasses();
    }

    public final EmailNotificationsPreference getEmailNotifications() {
        return realmGet$emailNotifications();
    }

    public final String getLanguage() {
        return realmGet$language();
    }

    public final PushNotificationsPreference getPushNotifications() {
        return realmGet$pushNotifications();
    }

    @Override // com.habitrpg.shared.habitica.models.AvatarPreferences
    public String getShirt() {
        return realmGet$shirt();
    }

    @Override // com.habitrpg.shared.habitica.models.AvatarPreferences
    public String getSize() {
        return realmGet$size();
    }

    @Override // com.habitrpg.shared.habitica.models.AvatarPreferences
    public String getSkin() {
        return realmGet$skin();
    }

    @Override // com.habitrpg.shared.habitica.models.AvatarPreferences
    public boolean getSleep() {
        return realmGet$sleep();
    }

    public final String getSound() {
        return realmGet$sound();
    }

    public final SuppressedModals getSuppressModals() {
        return realmGet$suppressModals();
    }

    public final UserTaskPreferences getTasks() {
        return realmGet$tasks();
    }

    public final int getTimezoneOffset() {
        return realmGet$timezoneOffset();
    }

    public final int getTimezoneOffsetAtLastCron() {
        return realmGet$timezoneOffsetAtLastCron();
    }

    @Override // io.realm.h7
    public String realmGet$allocationMode() {
        return this.allocationMode;
    }

    @Override // io.realm.h7
    public boolean realmGet$autoEquip() {
        return this.autoEquip;
    }

    @Override // io.realm.h7
    public boolean realmGet$automaticAllocation() {
        return this.automaticAllocation;
    }

    @Override // io.realm.h7
    public String realmGet$background() {
        return this.background;
    }

    @Override // io.realm.h7
    public String realmGet$chair() {
        return this.chair;
    }

    @Override // io.realm.h7
    public boolean realmGet$costume() {
        return this.costume;
    }

    @Override // io.realm.h7
    public boolean realmGet$dailyDueDefaultView() {
        return this.dailyDueDefaultView;
    }

    @Override // io.realm.h7
    public int realmGet$dayStart() {
        return this.dayStart;
    }

    @Override // io.realm.h7
    public boolean realmGet$disableClasses() {
        return this.disableClasses;
    }

    @Override // io.realm.h7
    public EmailNotificationsPreference realmGet$emailNotifications() {
        return this.emailNotifications;
    }

    @Override // io.realm.h7
    public Hair realmGet$hair() {
        return this.hair;
    }

    @Override // io.realm.h7
    public String realmGet$language() {
        return this.language;
    }

    @Override // io.realm.h7
    public PushNotificationsPreference realmGet$pushNotifications() {
        return this.pushNotifications;
    }

    @Override // io.realm.h7
    public String realmGet$shirt() {
        return this.shirt;
    }

    @Override // io.realm.h7
    public String realmGet$size() {
        return this.size;
    }

    @Override // io.realm.h7
    public String realmGet$skin() {
        return this.skin;
    }

    @Override // io.realm.h7
    public boolean realmGet$sleep() {
        return this.sleep;
    }

    @Override // io.realm.h7
    public String realmGet$sound() {
        return this.sound;
    }

    @Override // io.realm.h7
    public SuppressedModals realmGet$suppressModals() {
        return this.suppressModals;
    }

    @Override // io.realm.h7
    public UserTaskPreferences realmGet$tasks() {
        return this.tasks;
    }

    @Override // io.realm.h7
    public int realmGet$timezoneOffset() {
        return this.timezoneOffset;
    }

    @Override // io.realm.h7
    public int realmGet$timezoneOffsetAtLastCron() {
        return this.timezoneOffsetAtLastCron;
    }

    @Override // io.realm.h7
    public void realmSet$allocationMode(String str) {
        this.allocationMode = str;
    }

    @Override // io.realm.h7
    public void realmSet$autoEquip(boolean z10) {
        this.autoEquip = z10;
    }

    @Override // io.realm.h7
    public void realmSet$automaticAllocation(boolean z10) {
        this.automaticAllocation = z10;
    }

    @Override // io.realm.h7
    public void realmSet$background(String str) {
        this.background = str;
    }

    @Override // io.realm.h7
    public void realmSet$chair(String str) {
        this.chair = str;
    }

    @Override // io.realm.h7
    public void realmSet$costume(boolean z10) {
        this.costume = z10;
    }

    @Override // io.realm.h7
    public void realmSet$dailyDueDefaultView(boolean z10) {
        this.dailyDueDefaultView = z10;
    }

    @Override // io.realm.h7
    public void realmSet$dayStart(int i10) {
        this.dayStart = i10;
    }

    @Override // io.realm.h7
    public void realmSet$disableClasses(boolean z10) {
        this.disableClasses = z10;
    }

    @Override // io.realm.h7
    public void realmSet$emailNotifications(EmailNotificationsPreference emailNotificationsPreference) {
        this.emailNotifications = emailNotificationsPreference;
    }

    @Override // io.realm.h7
    public void realmSet$hair(Hair hair) {
        this.hair = hair;
    }

    @Override // io.realm.h7
    public void realmSet$language(String str) {
        this.language = str;
    }

    @Override // io.realm.h7
    public void realmSet$pushNotifications(PushNotificationsPreference pushNotificationsPreference) {
        this.pushNotifications = pushNotificationsPreference;
    }

    @Override // io.realm.h7
    public void realmSet$shirt(String str) {
        this.shirt = str;
    }

    @Override // io.realm.h7
    public void realmSet$size(String str) {
        this.size = str;
    }

    @Override // io.realm.h7
    public void realmSet$skin(String str) {
        this.skin = str;
    }

    @Override // io.realm.h7
    public void realmSet$sleep(boolean z10) {
        this.sleep = z10;
    }

    @Override // io.realm.h7
    public void realmSet$sound(String str) {
        this.sound = str;
    }

    @Override // io.realm.h7
    public void realmSet$suppressModals(SuppressedModals suppressedModals) {
        this.suppressModals = suppressedModals;
    }

    @Override // io.realm.h7
    public void realmSet$tasks(UserTaskPreferences userTaskPreferences) {
        this.tasks = userTaskPreferences;
    }

    @Override // io.realm.h7
    public void realmSet$timezoneOffset(int i10) {
        this.timezoneOffset = i10;
    }

    @Override // io.realm.h7
    public void realmSet$timezoneOffsetAtLastCron(int i10) {
        this.timezoneOffsetAtLastCron = i10;
    }

    public final void setAllocationMode(String str) {
        realmSet$allocationMode(str);
    }

    public final void setAutoEquip(boolean z10) {
        realmSet$autoEquip(z10);
    }

    public final void setAutomaticAllocation(boolean z10) {
        realmSet$automaticAllocation(z10);
    }

    public void setBackground(String str) {
        realmSet$background(str);
    }

    public void setChair(String str) {
        realmSet$chair(str);
    }

    public void setCostume(boolean z10) {
        realmSet$costume(z10);
    }

    public final void setDailyDueDefaultView(boolean z10) {
        realmSet$dailyDueDefaultView(z10);
    }

    public final void setDayStart(int i10) {
        realmSet$dayStart(i10);
    }

    public void setDisableClasses(boolean z10) {
        realmSet$disableClasses(z10);
    }

    public final void setEmailNotifications(EmailNotificationsPreference emailNotificationsPreference) {
        realmSet$emailNotifications(emailNotificationsPreference);
    }

    public void setHair(Hair hair) {
        realmSet$hair(hair);
    }

    public final void setLanguage(String str) {
        realmSet$language(str);
    }

    public final void setPushNotifications(PushNotificationsPreference pushNotificationsPreference) {
        realmSet$pushNotifications(pushNotificationsPreference);
    }

    public void setShirt(String str) {
        realmSet$shirt(str);
    }

    public void setSize(String str) {
        realmSet$size(str);
    }

    public void setSkin(String str) {
        realmSet$skin(str);
    }

    public void setSleep(boolean z10) {
        realmSet$sleep(z10);
    }

    public final void setSound(String str) {
        realmSet$sound(str);
    }

    public final void setSuppressModals(SuppressedModals suppressedModals) {
        realmSet$suppressModals(suppressedModals);
    }

    public final void setTasks(UserTaskPreferences userTaskPreferences) {
        realmSet$tasks(userTaskPreferences);
    }

    public final void setTimezoneOffset(int i10) {
        realmSet$timezoneOffset(i10);
    }

    public final void setTimezoneOffsetAtLastCron(int i10) {
        realmSet$timezoneOffsetAtLastCron(i10);
    }

    @Override // com.habitrpg.shared.habitica.models.AvatarPreferences
    public Hair getHair() {
        return realmGet$hair();
    }
}
