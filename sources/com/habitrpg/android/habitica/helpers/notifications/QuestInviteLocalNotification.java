package com.habitrpg.android.habitica.helpers.notifications;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build;
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.receivers.LocalNotificationActionReceiver;
import java.util.Map;
import qc.q;

/* compiled from: QuestInviteLocalNotification.kt */
/* loaded from: classes4.dex */
public final class QuestInviteLocalNotification extends HabiticaLocalNotification {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuestInviteLocalNotification(Context context, String str) {
        super(context, str);
        q.i(context, "context");
    }

    @Override // com.habitrpg.android.habitica.helpers.notifications.HabiticaLocalNotification
    protected int getNotificationID(Map<String, String> map) {
        q.i(map, "data");
        return 1000;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.habitrpg.android.habitica.helpers.notifications.HabiticaLocalNotification
    public void setNotificationActions(int i10, Map<String, String> map) {
        int i11;
        q.i(map, "data");
        super.setNotificationActions(i10, map);
        Resources resources = getContext().getResources();
        Intent intent = new Intent(getContext(), LocalNotificationActionReceiver.class);
        intent.setAction(resources.getString(R.string.accept_quest_invite));
        intent.putExtra("NOTIFICATION_ID", i10);
        if (Build.VERSION.SDK_INT >= 23) {
            i11 = 201326592;
        } else {
            i11 = 134217728;
        }
        getNotificationBuilder().a(0, "Accept", PendingIntent.getBroadcast(getContext(), AuthApiStatusCodes.AUTH_API_ACCESS_FORBIDDEN, intent, i11));
        Intent intent2 = new Intent(getContext(), LocalNotificationActionReceiver.class);
        intent2.setAction(resources.getString(R.string.reject_quest_invite));
        intent2.putExtra("NOTIFICATION_ID", i10);
        getNotificationBuilder().a(0, "Reject", PendingIntent.getBroadcast(getContext(), 2001, intent2, i11));
    }
}
