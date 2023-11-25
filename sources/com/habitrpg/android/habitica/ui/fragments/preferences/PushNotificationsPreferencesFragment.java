package com.habitrpg.android.habitica.ui.fragments.preferences;

import android.content.SharedPreferences;
import androidx.preference.CheckBoxPreference;
import androidx.preference.Preference;
import com.habitrpg.android.habitica.models.user.Preferences;
import com.habitrpg.android.habitica.models.user.PushNotificationsPreference;
import com.habitrpg.android.habitica.models.user.User;
import qc.q;

/* compiled from: PushNotificationsPreferencesFragment.kt */
/* loaded from: classes4.dex */
public final class PushNotificationsPreferencesFragment extends Hilt_PushNotificationsPreferencesFragment implements SharedPreferences.OnSharedPreferenceChangeListener {
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
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onSharedPreferenceChanged(android.content.SharedPreferences r10, java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.fragments.preferences.PushNotificationsPreferencesFragment.onSharedPreferenceChanged(android.content.SharedPreferences, java.lang.String):void");
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
        PushNotificationsPreference pushNotifications;
        Preferences preferences2;
        PushNotificationsPreference pushNotifications2;
        Preferences preferences3;
        PushNotificationsPreference pushNotifications3;
        Preferences preferences4;
        PushNotificationsPreference pushNotifications4;
        Preferences preferences5;
        PushNotificationsPreference pushNotifications5;
        Preferences preferences6;
        PushNotificationsPreference pushNotifications6;
        Preferences preferences7;
        PushNotificationsPreference pushNotifications7;
        Preferences preferences8;
        PushNotificationsPreference pushNotifications8;
        Preferences preferences9;
        PushNotificationsPreference pushNotifications9;
        Preferences preferences10;
        PushNotificationsPreference pushNotifications10;
        Preferences preferences11;
        PushNotificationsPreference pushNotifications11;
        Preferences preferences12;
        PushNotificationsPreference pushNotifications12;
        super.setUser(user);
        this.isSettingUser = !this.isInitialSet;
        Boolean bool12 = null;
        if (user != null && (preferences12 = user.getPreferences()) != null && (pushNotifications12 = preferences12.getPushNotifications()) != null) {
            bool = Boolean.valueOf(pushNotifications12.getWonChallenge());
        } else {
            bool = null;
        }
        updatePreference("preference_push_you_won_challenge", bool);
        if (user != null && (preferences11 = user.getPreferences()) != null && (pushNotifications11 = preferences11.getPushNotifications()) != null) {
            bool2 = Boolean.valueOf(pushNotifications11.getNewPM());
        } else {
            bool2 = null;
        }
        updatePreference("preference_push_received_a_private_message", bool2);
        if (user != null && (preferences10 = user.getPreferences()) != null && (pushNotifications10 = preferences10.getPushNotifications()) != null) {
            bool3 = Boolean.valueOf(pushNotifications10.getGiftedGems());
        } else {
            bool3 = null;
        }
        updatePreference("preference_push_gifted_gems", bool3);
        if (user != null && (preferences9 = user.getPreferences()) != null && (pushNotifications9 = preferences9.getPushNotifications()) != null) {
            bool4 = Boolean.valueOf(pushNotifications9.getGiftedSubscription());
        } else {
            bool4 = null;
        }
        updatePreference("preference_push_gifted_subscription", bool4);
        if (user != null && (preferences8 = user.getPreferences()) != null && (pushNotifications8 = preferences8.getPushNotifications()) != null) {
            bool5 = Boolean.valueOf(pushNotifications8.getInvitedParty());
        } else {
            bool5 = null;
        }
        updatePreference("preference_push_invited_to_party", bool5);
        if (user != null && (preferences7 = user.getPreferences()) != null && (pushNotifications7 = preferences7.getPushNotifications()) != null) {
            bool6 = Boolean.valueOf(pushNotifications7.getInvitedGuild());
        } else {
            bool6 = null;
        }
        updatePreference("preference_push_invited_to_guild", bool6);
        if (user != null && (preferences6 = user.getPreferences()) != null && (pushNotifications6 = preferences6.getPushNotifications()) != null) {
            bool7 = Boolean.valueOf(pushNotifications6.getQuestStarted());
        } else {
            bool7 = null;
        }
        updatePreference("preference_push_your_quest_has_begun", bool7);
        if (user != null && (preferences5 = user.getPreferences()) != null && (pushNotifications5 = preferences5.getPushNotifications()) != null) {
            bool8 = Boolean.valueOf(pushNotifications5.getInvitedQuest());
        } else {
            bool8 = null;
        }
        updatePreference("preference_push_invited_to_quest", bool8);
        if (user != null && (preferences4 = user.getPreferences()) != null && (pushNotifications4 = preferences4.getPushNotifications()) != null) {
            bool9 = Boolean.valueOf(pushNotifications4.getMajorUpdates());
        } else {
            bool9 = null;
        }
        updatePreference("preference_push_important_announcements", bool9);
        if (user != null && (preferences3 = user.getPreferences()) != null && (pushNotifications3 = preferences3.getPushNotifications()) != null) {
            bool10 = Boolean.valueOf(pushNotifications3.getPartyActivity());
        } else {
            bool10 = null;
        }
        updatePreference("preference_push_party_activity", bool10);
        if (user != null && (preferences2 = user.getPreferences()) != null && (pushNotifications2 = preferences2.getPushNotifications()) != null) {
            bool11 = Boolean.valueOf(pushNotifications2.getMentionParty());
        } else {
            bool11 = null;
        }
        updatePreference("preference_push_party_mention", bool11);
        if (user != null && (preferences = user.getPreferences()) != null && (pushNotifications = preferences.getPushNotifications()) != null) {
            bool12 = Boolean.valueOf(pushNotifications.getMentionJoinedGuild());
        }
        updatePreference("preference_push_joined_guild_mention", bool12);
        this.isSettingUser = false;
        this.isInitialSet = false;
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.preferences.BasePreferencesFragment
    protected void setupPreferences() {
    }
}
