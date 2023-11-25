package com.habitrpg.android.habitica.ui.fragments.preferences;

import android.content.SharedPreferences;
import androidx.preference.CheckBoxPreference;
import androidx.preference.Preference;
import com.habitrpg.android.habitica.models.user.EmailNotificationsPreference;
import com.habitrpg.android.habitica.models.user.Preferences;
import com.habitrpg.android.habitica.models.user.User;
import qc.q;

/* compiled from: EmailNotificationsPreferencesFragment.kt */
/* loaded from: classes4.dex */
public final class EmailNotificationsPreferencesFragment extends Hilt_EmailNotificationsPreferencesFragment implements SharedPreferences.OnSharedPreferenceChangeListener {
    public static final int $stable = 8;
    private boolean isInitialSet = true;
    private boolean isSettingUser;

    private final void updatePreference(String str, Boolean bool) {
        CheckBoxPreference checkBoxPreference;
        Preference findPreference = findPreference(str);
        if (findPreference instanceof CheckBoxPreference) {
            checkBoxPreference = (CheckBoxPreference) findPreference;
        } else {
            checkBoxPreference = null;
        }
        if (checkBoxPreference != null) {
            checkBoxPreference.d(q.d(bool, Boolean.TRUE));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        SharedPreferences sharedPreferences = getPreferenceScreen().getSharedPreferences();
        if (sharedPreferences != null) {
            sharedPreferences.unregisterOnSharedPreferenceChangeListener(this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        SharedPreferences sharedPreferences = getPreferenceScreen().getSharedPreferences();
        if (sharedPreferences != null) {
            sharedPreferences.registerOnSharedPreferenceChangeListener(this);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onSharedPreferenceChanged(android.content.SharedPreferences r10, java.lang.String r11) {
        /*
            r9 = this;
            java.lang.String r0 = "sharedPreferences"
            qc.q.i(r10, r0)
            boolean r0 = r9.isSettingUser
            if (r0 == 0) goto La
            return
        La:
            r0 = 0
            if (r11 == 0) goto Lb0
            int r1 = r11.hashCode()
            switch(r1) {
                case -1938281837: goto La3;
                case -1761393018: goto L97;
                case -1349295114: goto L8b;
                case -1150461715: goto L7f;
                case -1111093044: goto L73;
                case -312055128: goto L67;
                case 295099546: goto L5b;
                case 302824333: goto L4e;
                case 304331145: goto L40;
                case 1396358530: goto L32;
                case 1737448966: goto L24;
                case 1927636918: goto L16;
                default: goto L14;
            }
        L14:
            goto Lb0
        L16:
            java.lang.String r1 = "preference_email_your_quest_has_begun"
            boolean r1 = r11.equals(r1)
            if (r1 != 0) goto L20
            goto Lb0
        L20:
            java.lang.String r1 = "questStarted"
            goto Lae
        L24:
            java.lang.String r1 = "preference_email_gifted_subscription"
            boolean r1 = r11.equals(r1)
            if (r1 != 0) goto L2e
            goto Lb0
        L2e:
            java.lang.String r1 = "giftedSubscription"
            goto Lae
        L32:
            java.lang.String r1 = "preference_email_onboarding"
            boolean r1 = r11.equals(r1)
            if (r1 != 0) goto L3c
            goto Lb0
        L3c:
            java.lang.String r1 = "onboarding"
            goto Lae
        L40:
            java.lang.String r1 = "preference_email_invited_to_quest"
            boolean r1 = r11.equals(r1)
            if (r1 != 0) goto L4a
            goto Lb0
        L4a:
            java.lang.String r1 = "invitedQuest"
            goto Lae
        L4e:
            java.lang.String r1 = "preference_email_invited_to_party"
            boolean r1 = r11.equals(r1)
            if (r1 != 0) goto L58
            goto Lb0
        L58:
            java.lang.String r1 = "invitedParty"
            goto Lae
        L5b:
            java.lang.String r1 = "preference_email_invited_to_guild"
            boolean r1 = r11.equals(r1)
            if (r1 != 0) goto L64
            goto Lb0
        L64:
            java.lang.String r1 = "invitedGuild"
            goto Lae
        L67:
            java.lang.String r1 = "preference_email_important_announcements"
            boolean r1 = r11.equals(r1)
            if (r1 != 0) goto L70
            goto Lb0
        L70:
            java.lang.String r1 = "majorUpdates"
            goto Lae
        L73:
            java.lang.String r1 = "preference_email_kicked_group"
            boolean r1 = r11.equals(r1)
            if (r1 != 0) goto L7c
            goto Lb0
        L7c:
            java.lang.String r1 = "kickedGroup"
            goto Lae
        L7f:
            java.lang.String r1 = "preference_email_gifted_gems"
            boolean r1 = r11.equals(r1)
            if (r1 != 0) goto L88
            goto Lb0
        L88:
            java.lang.String r1 = "giftedGems"
            goto Lae
        L8b:
            java.lang.String r1 = "preference_email_received_a_private_message"
            boolean r1 = r11.equals(r1)
            if (r1 != 0) goto L94
            goto Lb0
        L94:
            java.lang.String r1 = "newPM"
            goto Lae
        L97:
            java.lang.String r1 = "preference_email_subscription_reminders"
            boolean r1 = r11.equals(r1)
            if (r1 != 0) goto La0
            goto Lb0
        La0:
            java.lang.String r1 = "subscriptionReminders"
            goto Lae
        La3:
            java.lang.String r1 = "preference_email_you_won_challenge"
            boolean r1 = r11.equals(r1)
            if (r1 != 0) goto Lac
            goto Lb0
        Lac:
            java.lang.String r1 = "wonChallenge"
        Lae:
            r4 = r1
            goto Lb1
        Lb0:
            r4 = r0
        Lb1:
            if (r4 == 0) goto Lc5
            androidx.lifecycle.q r1 = androidx.lifecycle.w.a(r9)
            com.habitrpg.android.habitica.ui.fragments.preferences.EmailNotificationsPreferencesFragment$onSharedPreferenceChanged$1 r8 = new com.habitrpg.android.habitica.ui.fragments.preferences.EmailNotificationsPreferencesFragment$onSharedPreferenceChanged$1
            r7 = 0
            r2 = r8
            r3 = r9
            r5 = r10
            r6 = r11
            r2.<init>(r3, r4, r5, r6, r7)
            r10 = 1
            com.habitrpg.common.habitica.helpers.ExceptionHandlerKt.launchCatching$default(r1, r0, r8, r10, r0)
        Lc5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.fragments.preferences.EmailNotificationsPreferencesFragment.onSharedPreferenceChanged(android.content.SharedPreferences, java.lang.String):void");
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.preferences.BasePreferencesFragment
    public void setUser(User user) {
        Boolean bool;
        Boolean bool2;
        Boolean bool3;
        Boolean bool4;
        Boolean bool5;
        Boolean bool6;
        Boolean bool7;
        Boolean bool8;
        Boolean bool9;
        Boolean bool10;
        Boolean bool11;
        Preferences preferences;
        EmailNotificationsPreference emailNotifications;
        Preferences preferences2;
        EmailNotificationsPreference emailNotifications2;
        Preferences preferences3;
        EmailNotificationsPreference emailNotifications3;
        Preferences preferences4;
        EmailNotificationsPreference emailNotifications4;
        Preferences preferences5;
        EmailNotificationsPreference emailNotifications5;
        Preferences preferences6;
        EmailNotificationsPreference emailNotifications6;
        Preferences preferences7;
        EmailNotificationsPreference emailNotifications7;
        Preferences preferences8;
        EmailNotificationsPreference emailNotifications8;
        Preferences preferences9;
        EmailNotificationsPreference emailNotifications9;
        Preferences preferences10;
        EmailNotificationsPreference emailNotifications10;
        Preferences preferences11;
        EmailNotificationsPreference emailNotifications11;
        Preferences preferences12;
        EmailNotificationsPreference emailNotifications12;
        super.setUser(user);
        this.isSettingUser = !this.isInitialSet;
        Boolean bool12 = null;
        if (user != null && (preferences12 = user.getPreferences()) != null && (emailNotifications12 = preferences12.getEmailNotifications()) != null) {
            bool = Boolean.valueOf(emailNotifications12.getWonChallenge());
        } else {
            bool = null;
        }
        updatePreference("preference_email_you_won_challenge", bool);
        if (user != null && (preferences11 = user.getPreferences()) != null && (emailNotifications11 = preferences11.getEmailNotifications()) != null) {
            bool2 = Boolean.valueOf(emailNotifications11.getNewPM());
        } else {
            bool2 = null;
        }
        updatePreference("preference_email_received_a_private_message", bool2);
        if (user != null && (preferences10 = user.getPreferences()) != null && (emailNotifications10 = preferences10.getEmailNotifications()) != null) {
            bool3 = Boolean.valueOf(emailNotifications10.getGiftedGems());
        } else {
            bool3 = null;
        }
        updatePreference("preference_email_gifted_gems", bool3);
        if (user != null && (preferences9 = user.getPreferences()) != null && (emailNotifications9 = preferences9.getEmailNotifications()) != null) {
            bool4 = Boolean.valueOf(emailNotifications9.getGiftedSubscription());
        } else {
            bool4 = null;
        }
        updatePreference("preference_email_gifted_subscription", bool4);
        if (user != null && (preferences8 = user.getPreferences()) != null && (emailNotifications8 = preferences8.getEmailNotifications()) != null) {
            bool5 = Boolean.valueOf(emailNotifications8.getInvitedParty());
        } else {
            bool5 = null;
        }
        updatePreference("preference_email_invited_to_party", bool5);
        if (user != null && (preferences7 = user.getPreferences()) != null && (emailNotifications7 = preferences7.getEmailNotifications()) != null) {
            bool6 = Boolean.valueOf(emailNotifications7.getInvitedGuild());
        } else {
            bool6 = null;
        }
        updatePreference("preference_email_invited_to_guild", bool6);
        if (user != null && (preferences6 = user.getPreferences()) != null && (emailNotifications6 = preferences6.getEmailNotifications()) != null) {
            bool7 = Boolean.valueOf(emailNotifications6.getQuestStarted());
        } else {
            bool7 = null;
        }
        updatePreference("preference_email_your_quest_has_begun", bool7);
        if (user != null && (preferences5 = user.getPreferences()) != null && (emailNotifications5 = preferences5.getEmailNotifications()) != null) {
            bool8 = Boolean.valueOf(emailNotifications5.getInvitedQuest());
        } else {
            bool8 = null;
        }
        updatePreference("preference_email_invited_to_quest", bool8);
        if (user != null && (preferences4 = user.getPreferences()) != null && (emailNotifications4 = preferences4.getEmailNotifications()) != null) {
            bool9 = Boolean.valueOf(emailNotifications4.getMajorUpdates());
        } else {
            bool9 = null;
        }
        updatePreference("preference_email_important_announcements", bool9);
        if (user != null && (preferences3 = user.getPreferences()) != null && (emailNotifications3 = preferences3.getEmailNotifications()) != null) {
            bool10 = Boolean.valueOf(emailNotifications3.getKickedGroup());
        } else {
            bool10 = null;
        }
        updatePreference("preference_email_kicked_group", bool10);
        if (user != null && (preferences2 = user.getPreferences()) != null && (emailNotifications2 = preferences2.getEmailNotifications()) != null) {
            bool11 = Boolean.valueOf(emailNotifications2.getOnboarding());
        } else {
            bool11 = null;
        }
        updatePreference("preference_email_onboarding", bool11);
        if (user != null && (preferences = user.getPreferences()) != null && (emailNotifications = preferences.getEmailNotifications()) != null) {
            bool12 = Boolean.valueOf(emailNotifications.getSubscriptionReminders());
        }
        updatePreference("preference_email_subscription_reminders", bool12);
        this.isSettingUser = false;
        this.isInitialSet = false;
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.preferences.BasePreferencesFragment
    protected void setupPreferences() {
    }
}
