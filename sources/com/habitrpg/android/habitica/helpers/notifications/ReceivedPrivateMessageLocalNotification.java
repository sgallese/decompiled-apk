package com.habitrpg.android.habitica.helpers.notifications;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import androidx.core.app.m;
import androidx.core.app.w;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.extensions.PendingIntentExtensionsKt;
import com.habitrpg.android.habitica.receivers.LocalNotificationActionReceiver;
import java.util.Map;
import qc.q;

/* compiled from: ReceivedPrivateMessageLocalNotification.kt */
/* loaded from: classes4.dex */
public final class ReceivedPrivateMessageLocalNotification extends HabiticaLocalNotification {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReceivedPrivateMessageLocalNotification(Context context, String str) {
        super(context, str);
        q.i(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.habitrpg.android.habitica.helpers.notifications.HabiticaLocalNotification
    public void configureMainIntent(Intent intent) {
        String str;
        q.i(intent, "intent");
        super.configureMainIntent(intent);
        Map<String, String> data = getData();
        String str2 = null;
        if (data != null) {
            str = data.get("replyTo");
        } else {
            str = null;
        }
        intent.putExtra("replyToUUID", str);
        Map<String, String> data2 = getData();
        if (data2 != null) {
            str2 = data2.get("senderName");
        }
        intent.putExtra("replyToUsername", str2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0022, code lost:
    
        r0 = r0.getActiveNotifications();
     */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c4 A[LOOP:2: B:54:0x00bc->B:56:0x00c4, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0154  */
    @Override // com.habitrpg.android.habitica.helpers.notifications.HabiticaLocalNotification
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public androidx.core.app.m.e configureNotificationBuilder(java.util.Map<java.lang.String, java.lang.String> r12) {
        /*
            Method dump skipped, instructions count: 369
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.helpers.notifications.ReceivedPrivateMessageLocalNotification.configureNotificationBuilder(java.util.Map):androidx.core.app.m$e");
    }

    @Override // com.habitrpg.android.habitica.helpers.notifications.HabiticaLocalNotification
    protected int getNotificationID(Map<String, String> map) {
        q.i(map, "data");
        String str = map.get("senderName");
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.habitrpg.android.habitica.helpers.notifications.HabiticaLocalNotification
    public void setNotificationActions(int i10, Map<String, String> map) {
        q.i(map, "data");
        super.setNotificationActions(i10, map);
        String str = map.get("replyTo");
        if (str == null) {
            return;
        }
        String string = getContext().getString(R.string.inbox_message_reply);
        q.h(string, "getString(...)");
        String string2 = getContext().getString(R.string.reply);
        q.h(string2, "getString(...)");
        w.d dVar = new w.d(string);
        dVar.b(string2);
        w a10 = dVar.a();
        q.h(a10, "run(...)");
        Intent intent = new Intent(getContext(), LocalNotificationActionReceiver.class);
        intent.setAction(string);
        intent.putExtra("senderID", str);
        intent.putExtra("NOTIFICATION_ID", i10);
        PendingIntent broadcast = PendingIntent.getBroadcast(getContext(), str.hashCode(), intent, PendingIntentExtensionsKt.withMutableFlag(134217728));
        q.h(broadcast, "getBroadcast(...)");
        m.a b10 = new m.a.C0065a((int) R.drawable.ic_send_grey_600_24dp, getContext().getString(R.string.reply), broadcast).a(a10).b();
        q.h(b10, "build(...)");
        getNotificationBuilder().b(b10);
    }
}
