package com.habitrpg.android.habitica.helpers.notifications;

import android.content.Context;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.RemoteMessage;
import com.habitrpg.android.habitica.helpers.notifications.PushNotificationManager;
import qc.q;

/* compiled from: HabiticaFirebaseMessagingService.kt */
/* loaded from: classes4.dex */
public final class HabiticaFirebaseMessagingService extends Hilt_HabiticaFirebaseMessagingService {
    public static final int $stable = 8;
    public PushNotificationManager pushNotificationManager;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onNewToken$lambda$0(HabiticaFirebaseMessagingService habiticaFirebaseMessagingService, Task task) {
        q.i(habiticaFirebaseMessagingService, "this$0");
        q.i(task, "task");
        String str = (String) task.getResult();
        if (str != null && habiticaFirebaseMessagingService.pushNotificationManager != null) {
            habiticaFirebaseMessagingService.getPushNotificationManager$Habitica_2311256681_prodRelease().setRefreshedToken(str);
        }
    }

    public final PushNotificationManager getPushNotificationManager$Habitica_2311256681_prodRelease() {
        PushNotificationManager pushNotificationManager = this.pushNotificationManager;
        if (pushNotificationManager != null) {
            return pushNotificationManager;
        }
        q.z("pushNotificationManager");
        return null;
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onMessageReceived(RemoteMessage remoteMessage) {
        q.i(remoteMessage, "remoteMessage");
        PushNotificationManager.Companion companion = PushNotificationManager.Companion;
        Context applicationContext = getApplicationContext();
        q.h(applicationContext, "getApplicationContext(...)");
        PushNotificationManager.Companion.displayNotification$default(companion, remoteMessage, applicationContext, null, 4, null);
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onNewToken(String str) {
        q.i(str, "s");
        super.onNewToken(str);
        FirebaseMessaging.l().o().addOnCompleteListener(new OnCompleteListener() { // from class: com.habitrpg.android.habitica.helpers.notifications.b
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                HabiticaFirebaseMessagingService.onNewToken$lambda$0(HabiticaFirebaseMessagingService.this, task);
            }
        });
    }

    public final void setPushNotificationManager$Habitica_2311256681_prodRelease(PushNotificationManager pushNotificationManager) {
        q.i(pushNotificationManager, "<set-?>");
        this.pushNotificationManager = pushNotificationManager;
    }
}
