package com.habitrpg.android.habitica.interactors;

import ad.a1;
import ad.i;
import android.app.Activity;
import androidx.lifecycle.q;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.habitrpg.android.habitica.models.user.User;
import com.habitrpg.common.habitica.helpers.ExceptionHandler;
import com.habitrpg.common.habitica.models.Notification;
import com.habitrpg.common.habitica.models.notifications.AchievementData;
import com.habitrpg.common.habitica.models.notifications.FirstDropData;
import com.habitrpg.common.habitica.models.notifications.NotificationData;

/* compiled from: ShowNotificationInteractor.kt */
/* loaded from: classes4.dex */
public final class ShowNotificationInteractor {
    public static final int $stable = 8;
    private final Activity activity;
    private final q lifecycleScope;

    public ShowNotificationInteractor(Activity activity, q qVar) {
        qc.q.i(activity, "activity");
        qc.q.i(qVar, "lifecycleScope");
        this.activity = activity;
        this.lifecycleScope = qVar;
    }

    private final void logOnboardingEvents(String str) {
        if (User.Companion.getONBOARDING_ACHIEVEMENT_KEYS().contains(str)) {
            FirebaseAnalytics.getInstance(this.activity).a(str, null);
        } else if (qc.q.d(str, Notification.Type.ACHIEVEMENT_ONBOARDING_COMPLETE.getType())) {
            FirebaseAnalytics.getInstance(this.activity).a(str, null);
        }
    }

    private final void showFirstDropDialog(Notification notification) {
        FirstDropData firstDropData;
        NotificationData data = notification.getData();
        if (data instanceof FirstDropData) {
            firstDropData = (FirstDropData) data;
        } else {
            firstDropData = null;
        }
        if (firstDropData != null) {
            i.d(this.lifecycleScope, a1.c(), null, new ShowNotificationInteractor$showFirstDropDialog$1(this, firstDropData, null), 2, null);
        }
    }

    private final void showWonChallengeDialog(Notification notification) {
        i.d(this.lifecycleScope, a1.c(), null, new ShowNotificationInteractor$showWonChallengeDialog$1(this, notification, null), 2, null);
    }

    public final boolean handleNotification(Notification notification) {
        qc.q.i(notification, "notification");
        String type = notification.getType();
        if (qc.q.d(type, Notification.Type.LOGIN_INCENTIVE.getType())) {
            showCheckinDialog(notification);
            return true;
        } else if (qc.q.d(type, Notification.Type.ACHIEVEMENT_PARTY_UP.getType())) {
            showAchievementDialog(notification);
            return true;
        } else if (qc.q.d(type, Notification.Type.ACHIEVEMENT_PARTY_ON.getType())) {
            showAchievementDialog(notification);
            return true;
        } else if (qc.q.d(type, Notification.Type.ACHIEVEMENT_BEAST_MASTER.getType())) {
            showAchievementDialog(notification);
            return true;
        } else if (qc.q.d(type, Notification.Type.ACHIEVEMENT_MOUNT_MASTER.getType())) {
            showAchievementDialog(notification);
            return true;
        } else if (qc.q.d(type, Notification.Type.ACHIEVEMENT_TRIAD_BINGO.getType())) {
            showAchievementDialog(notification);
            return true;
        } else if (qc.q.d(type, Notification.Type.ACHIEVEMENT_GUILD_JOINED.getType())) {
            showAchievementDialog(notification);
            return true;
        } else if (qc.q.d(type, Notification.Type.ACHIEVEMENT_CHALLENGE_JOINED.getType())) {
            showAchievementDialog(notification);
            return true;
        } else if (qc.q.d(type, Notification.Type.ACHIEVEMENT_INVITED_FRIEND.getType())) {
            showAchievementDialog(notification);
            return true;
        } else if (qc.q.d(type, Notification.Type.WON_CHALLENGE.getType())) {
            showWonChallengeDialog(notification);
            return true;
        } else if (qc.q.d(type, Notification.Type.ACHIEVEMENT_ALL_YOUR_BASE.getType())) {
            showAchievementDialog(notification);
            return true;
        } else if (qc.q.d(type, Notification.Type.ACHIEVEMENT_BACK_TO_BASICS.getType())) {
            showAchievementDialog(notification);
            return true;
        } else if (qc.q.d(type, Notification.Type.ACHIEVEMENT_JUST_ADD_WATER.getType())) {
            showAchievementDialog(notification);
            return true;
        } else if (qc.q.d(type, Notification.Type.ACHIEVEMENT_LOST_MASTERCLASSER.getType())) {
            showAchievementDialog(notification);
            return true;
        } else if (qc.q.d(type, Notification.Type.ACHIEVEMENT_MIND_OVER_MATTER.getType())) {
            showAchievementDialog(notification);
            return true;
        } else if (qc.q.d(type, Notification.Type.ACHIEVEMENT_DUST_DEVIL.getType())) {
            showAchievementDialog(notification);
            return true;
        } else if (qc.q.d(type, Notification.Type.ACHIEVEMENT_ARID_AUTHORITY.getType())) {
            showAchievementDialog(notification);
            return true;
        } else if (qc.q.d(type, Notification.Type.ACHIEVEMENT_MONSTER_MAGUS.getType())) {
            showAchievementDialog(notification);
            return true;
        } else if (qc.q.d(type, Notification.Type.ACHIEVEMENT_UNDEAD_UNDERTAKER.getType())) {
            showAchievementDialog(notification);
            return true;
        } else if (qc.q.d(type, Notification.Type.ACHIEVEMENT_PRIMED_FOR_PAINTING.getType())) {
            showAchievementDialog(notification);
            return true;
        } else if (qc.q.d(type, Notification.Type.ACHIEVEMENT_PEARLY_PRO.getType())) {
            showAchievementDialog(notification);
            return true;
        } else if (qc.q.d(type, Notification.Type.ACHIEVEMENT_TICKLED_PINK.getType())) {
            showAchievementDialog(notification);
            return true;
        } else if (qc.q.d(type, Notification.Type.ACHIEVEMENT_ROSY_OUTLOOK.getType())) {
            showAchievementDialog(notification);
            return true;
        } else if (qc.q.d(type, Notification.Type.ACHIEVEMENT_BUG_BONANZA.getType())) {
            showAchievementDialog(notification);
            return true;
        } else if (qc.q.d(type, Notification.Type.ACHIEVEMENT_BARE_NECESSITIES.getType())) {
            showAchievementDialog(notification);
            return true;
        } else if (qc.q.d(type, Notification.Type.ACHIEVEMENT_FRESHWATER_FRIENDS.getType())) {
            showAchievementDialog(notification);
            return true;
        } else {
            Notification.Type type2 = Notification.Type.ACHIEVEMENT_GOOD_AS_GOLD;
            if (qc.q.d(type, type2.getType())) {
                showAchievementDialog(notification);
                return true;
            } else if (qc.q.d(type, Notification.Type.ACHIEVEMENT_ALL_THAT_GLITTERS.getType())) {
                showAchievementDialog(notification);
                return true;
            } else if (qc.q.d(type, type2.getType())) {
                showAchievementDialog(notification);
                return true;
            } else if (qc.q.d(type, Notification.Type.ACHIEVEMENT_BONE_COLLECTOR.getType())) {
                showAchievementDialog(notification);
                return true;
            } else if (qc.q.d(type, Notification.Type.ACHIEVEMENT_SKELETON_CREW.getType())) {
                showAchievementDialog(notification);
                return true;
            } else if (qc.q.d(type, Notification.Type.ACHIEVEMENT_SEEING_RED.getType())) {
                showAchievementDialog(notification);
                return true;
            } else if (qc.q.d(type, Notification.Type.ACHIEVEMENT_RED_LETTER_DAY.getType())) {
                showAchievementDialog(notification);
                return true;
            } else if (qc.q.d(type, Notification.Type.ACHIEVEMENT_GENERIC.getType())) {
                showAchievementDialog(notification);
                return true;
            } else if (qc.q.d(type, Notification.Type.ACHIEVEMENT_ONBOARDING_COMPLETE.getType())) {
                showAchievementDialog(notification);
                return true;
            } else if (qc.q.d(type, Notification.Type.FIRST_DROP.getType())) {
                showFirstDropDialog(notification);
                return true;
            } else {
                return false;
            }
        }
    }

    public final void showAchievementDialog(Notification notification) {
        AchievementData achievementData;
        long j10;
        qc.q.i(notification, "notification");
        NotificationData data = notification.getData();
        if (data instanceof AchievementData) {
            achievementData = (AchievementData) data;
        } else {
            achievementData = null;
        }
        if (achievementData == null) {
            return;
        }
        String achievement = achievementData.getAchievement();
        if (achievement == null && (achievement = notification.getType()) == null) {
            achievement = "";
        }
        if (!qc.q.d(achievement, "createdTask") && !qc.q.d(achievement, Notification.Type.ACHIEVEMENT_ONBOARDING_COMPLETE.getType())) {
            j10 = 200;
        } else {
            j10 = 1000;
        }
        i.d(this.lifecycleScope, ExceptionHandler.Companion.coroutine$default(ExceptionHandler.Companion, null, 1, null), null, new ShowNotificationInteractor$showAchievementDialog$1(j10, this, achievementData, null), 2, null);
        logOnboardingEvents(achievement);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void showCheckinDialog(com.habitrpg.common.habitica.models.Notification r21) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.interactors.ShowNotificationInteractor.showCheckinDialog(com.habitrpg.common.habitica.models.Notification):void");
    }
}
