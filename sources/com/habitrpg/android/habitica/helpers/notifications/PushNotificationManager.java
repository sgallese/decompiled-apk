package com.habitrpg.android.habitica.helpers.notifications;

import ad.l0;
import android.content.Context;
import android.content.SharedPreferences;
import androidx.core.app.r;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.RemoteMessage;
import com.habitrpg.android.habitica.data.ApiClient;
import com.habitrpg.android.habitica.helpers.Analytics;
import com.habitrpg.android.habitica.helpers.EventCategory;
import com.habitrpg.android.habitica.helpers.HitType;
import com.habitrpg.android.habitica.models.PushDevice;
import com.habitrpg.android.habitica.models.user.User;
import com.habitrpg.android.habitica.ui.activities.TaskFormActivity;
import com.habitrpg.common.habitica.helpers.ExceptionHandlerKt;
import dc.w;
import ec.t;
import ic.d;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.Continuation;
import qc.h;
import qc.q;
import yc.v;

/* compiled from: PushNotificationManager.kt */
/* loaded from: classes4.dex */
public final class PushNotificationManager {
    public static final String CHANGE_USERNAME_PUSH_NOTIFICATION_KEY = "changeUsername";
    public static final String CHAT_MENTION_NOTIFICATION_KEY = "chatMention";
    private static final String DEVICE_TOKEN_PREFERENCE_KEY = "device-token-preference";
    public static final String G1G1_PROMO_KEY = "g1g1Promo";
    public static final String GIFT_ONE_GET_ONE_PUSH_NOTIFICATION_KEY = "gift1get1";
    public static final String GROUP_ACTIVITY_NOTIFICATION_KEY = "groupActivity";
    public static final String GUILD_INVITE_PUSH_NOTIFICATION_KEY = "invitedGuild";
    public static final String PARTY_INVITE_PUSH_NOTIFICATION_KEY = "invitedParty";
    public static final String QUEST_BEGUN_PUSH_NOTIFICATION_KEY = "questStarted";
    public static final String QUEST_INVITE_PUSH_NOTIFICATION_KEY = "questInvitation";
    public static final String RECEIVED_GEMS_PUSH_NOTIFICATION_KEY = "giftedGems";
    public static final String RECEIVED_PRIVATE_MESSAGE_PUSH_NOTIFICATION_KEY = "newPM";
    public static final String RECEIVED_SUBSCRIPTION_GIFT_PUSH_NOTIFICATION_KEY = "giftedSubscription";
    public static final String WON_CHALLENGE_PUSH_NOTIFICATION_KEY = "wonChallenge";
    private ApiClient apiClient;
    private final Context context;
    private String refreshedToken;
    private final SharedPreferences sharedPreferences;
    private User user;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: PushNotificationManager.kt */
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }

        public static /* synthetic */ void displayNotification$default(Companion companion, RemoteMessage remoteMessage, Context context, PushNotificationManager pushNotificationManager, int i10, Object obj) {
            if ((i10 & 4) != 0) {
                pushNotificationManager = null;
            }
            companion.displayNotification(remoteMessage, context, pushNotificationManager);
        }

        public final void displayNotification(RemoteMessage remoteMessage, Context context, PushNotificationManager pushNotificationManager) {
            q.i(remoteMessage, "remoteMessage");
            q.i(context, "context");
            String str = remoteMessage.getData().get("identifier");
            HabiticaLocalNotification build = new HabiticaLocalNotificationFactory().build(str, context);
            boolean z10 = false;
            if (pushNotificationManager != null && !pushNotificationManager.userIsSubscribedToNotificationType(str)) {
                z10 = true;
            }
            if (!z10) {
                if (remoteMessage.getData().containsKey("sendAnalytics")) {
                    HashMap hashMap = new HashMap();
                    if (str == null) {
                        str = "";
                    }
                    hashMap.put("identifier", str);
                    Analytics.sendEvent$default(Analytics.INSTANCE, "receive notification", EventCategory.BEHAVIOUR, HitType.EVENT, hashMap, null, 16, null);
                }
                Map<String, String> data = remoteMessage.getData();
                q.h(data, "getData(...)");
                build.setExtras(data);
                String str2 = remoteMessage.getData().get("title");
                String str3 = remoteMessage.getData().get("body");
                Map<String, String> data2 = remoteMessage.getData();
                q.h(data2, "getData(...)");
                build.notifyLocally(str2, str3, data2);
            }
        }
    }

    public PushNotificationManager(ApiClient apiClient, SharedPreferences sharedPreferences, Context context) {
        q.i(apiClient, "apiClient");
        q.i(sharedPreferences, "sharedPreferences");
        q.i(context, "context");
        this.apiClient = apiClient;
        this.sharedPreferences = sharedPreferences;
        this.context = context;
        this.refreshedToken = "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addPushDeviceUsingStoredToken$lambda$1(PushNotificationManager pushNotificationManager, Task task) {
        q.i(pushNotificationManager, "this$0");
        q.i(task, "it");
        try {
            Object result = task.getResult();
            q.h(result, "getResult(...)");
            pushNotificationManager.setRefreshedToken((String) result);
            pushNotificationManager.addRefreshToken();
        } catch (IOException | Exception unused) {
        }
    }

    private final void addRefreshToken() {
        boolean z10;
        if (this.refreshedToken.length() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 && this.user != null && !userHasPushDevice()) {
            HashMap hashMap = new HashMap();
            hashMap.put("regId", this.refreshedToken);
            hashMap.put(TaskFormActivity.TASK_TYPE_KEY, "android");
            ExceptionHandlerKt.launchCatching$default(l0.b(), null, new PushNotificationManager$addRefreshToken$1(this, hashMap, null), 1, null);
        }
    }

    private final boolean userHasPushDevice() {
        List<PushDevice> i10;
        List<PushDevice> list;
        User user = this.user;
        if (user == null || (i10 = user.getPushDevices()) == null) {
            i10 = t.i();
        }
        Iterator<PushDevice> it = i10.iterator();
        while (it.hasNext()) {
            if (q.d(it.next().getRegId(), this.refreshedToken)) {
                return true;
            }
        }
        User user2 = this.user;
        if (user2 != null) {
            list = user2.getPushDevices();
        } else {
            list = null;
        }
        if (list == null) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean userIsSubscribedToNotificationType(java.lang.String r6) {
        /*
            r5 = this;
            java.lang.String r0 = "invitedParty"
            boolean r0 = qc.q.d(r6, r0)
            r1 = 1
            if (r0 == 0) goto Ld
            java.lang.String r6 = "preference_push_invited_to_party"
            goto L8c
        Ld:
            r0 = 0
            r2 = 2
            r3 = 0
            if (r6 == 0) goto L1c
            java.lang.String r4 = "newPM"
            boolean r4 = yc.m.K(r6, r4, r3, r2, r0)
            if (r4 != r1) goto L1c
            r4 = 1
            goto L1d
        L1c:
            r4 = 0
        L1d:
            if (r4 == 0) goto L23
            java.lang.String r6 = "preference_push_received_a_private_message"
            goto L8c
        L23:
            if (r6 == 0) goto L2f
            java.lang.String r4 = "giftedGems"
            boolean r4 = yc.m.K(r6, r4, r3, r2, r0)
            if (r4 != r1) goto L2f
            r4 = 1
            goto L30
        L2f:
            r4 = 0
        L30:
            if (r4 == 0) goto L35
            java.lang.String r6 = "preference_push_gifted_gems"
            goto L8c
        L35:
            if (r6 == 0) goto L41
            java.lang.String r4 = "giftedSubscription"
            boolean r4 = yc.m.K(r6, r4, r3, r2, r0)
            if (r4 != r1) goto L41
            r4 = 1
            goto L42
        L41:
            r4 = 0
        L42:
            if (r4 == 0) goto L47
            java.lang.String r6 = "preference_push_gifted_subscription"
            goto L8c
        L47:
            if (r6 == 0) goto L53
            java.lang.String r4 = "invitedGuild"
            boolean r4 = yc.m.K(r6, r4, r3, r2, r0)
            if (r4 != r1) goto L53
            r4 = 1
            goto L54
        L53:
            r4 = 0
        L54:
            if (r4 == 0) goto L59
            java.lang.String r6 = "preference_push_invited_to_guild"
            goto L8c
        L59:
            if (r6 == 0) goto L65
            java.lang.String r4 = "questInvitation"
            boolean r4 = yc.m.K(r6, r4, r3, r2, r0)
            if (r4 != r1) goto L65
            r4 = 1
            goto L66
        L65:
            r4 = 0
        L66:
            if (r4 == 0) goto L6b
            java.lang.String r6 = "preference_push_invited_to_quest"
            goto L8c
        L6b:
            if (r6 == 0) goto L77
            java.lang.String r4 = "questStarted"
            boolean r4 = yc.m.K(r6, r4, r3, r2, r0)
            if (r4 != r1) goto L77
            r4 = 1
            goto L78
        L77:
            r4 = 0
        L78:
            if (r4 == 0) goto L7d
            java.lang.String r6 = "preference_push_your_quest_has_begun"
            goto L8c
        L7d:
            if (r6 == 0) goto L88
            java.lang.String r4 = "wonChallenge"
            boolean r6 = yc.m.K(r6, r4, r3, r2, r0)
            if (r6 != r1) goto L88
            r3 = 1
        L88:
            if (r3 == 0) goto L93
            java.lang.String r6 = "preference_push_you_won_challenge"
        L8c:
            android.content.SharedPreferences r0 = r5.sharedPreferences
            boolean r6 = r0.getBoolean(r6, r1)
            return r6
        L93:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.helpers.notifications.PushNotificationManager.userIsSubscribedToNotificationType(java.lang.String):boolean");
    }

    public final void addPushDeviceUsingStoredToken() {
        boolean u10;
        u10 = v.u(this.refreshedToken);
        if ((!u10) != false) {
            addRefreshToken();
            return;
        }
        try {
            FirebaseMessaging.l().o().addOnCompleteListener(new OnCompleteListener() { // from class: com.habitrpg.android.habitica.helpers.notifications.c
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    PushNotificationManager.addPushDeviceUsingStoredToken$lambda$1(PushNotificationManager.this, task);
                }
            });
        } catch (Exception unused) {
        }
    }

    public final ApiClient getApiClient() {
        return this.apiClient;
    }

    public final String getRefreshedToken() {
        return this.refreshedToken;
    }

    public final boolean notificationPermissionEnabled() {
        r d10 = r.d(this.context);
        q.h(d10, "from(...)");
        return d10.a();
    }

    public final Object removePushDeviceUsingStoredToken(Continuation<? super w> continuation) {
        boolean z10;
        Object d10;
        if (this.refreshedToken.length() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 && userHasPushDevice()) {
            Object deletePushDevice = this.apiClient.deletePushDevice(this.refreshedToken, continuation);
            d10 = d.d();
            if (deletePushDevice == d10) {
                return deletePushDevice;
            }
            return w.f13270a;
        }
        return w.f13270a;
    }

    public final void setApiClient(ApiClient apiClient) {
        q.i(apiClient, "<set-?>");
        this.apiClient = apiClient;
    }

    public final void setRefreshedToken(String str) {
        boolean z10;
        q.i(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        if (str.length() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return;
        }
        this.refreshedToken = str;
        SharedPreferences.Editor edit = this.sharedPreferences.edit();
        edit.putString(DEVICE_TOKEN_PREFERENCE_KEY, str);
        edit.apply();
    }

    public final void setUser(User user) {
        q.i(user, "user");
        this.user = user;
    }
}
