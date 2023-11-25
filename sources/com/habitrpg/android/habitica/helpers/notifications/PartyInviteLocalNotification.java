package com.habitrpg.android.habitica.helpers.notifications;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.extensions.PendingIntentExtensionsKt;
import com.habitrpg.android.habitica.receivers.LocalNotificationActionReceiver;
import java.util.Map;
import qc.q;

/* compiled from: PartyInviteLocalNotification.kt */
/* loaded from: classes4.dex */
public final class PartyInviteLocalNotification extends HabiticaLocalNotification {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PartyInviteLocalNotification(Context context, String str) {
        super(context, str);
        q.i(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.habitrpg.android.habitica.helpers.notifications.HabiticaLocalNotification
    public void setNotificationActions(int i10, Map<String, String> map) {
        int i11;
        int i12;
        q.i(map, "data");
        super.setNotificationActions(i10, map);
        Resources resources = getContext().getResources();
        Intent intent = new Intent(getContext(), LocalNotificationActionReceiver.class);
        intent.setAction(resources.getString(R.string.accept_party_invite));
        String str = map.get("groupID");
        intent.putExtra("groupID", str);
        intent.putExtra("NOTIFICATION_ID", i10);
        Context context = getContext();
        if (str != null) {
            i11 = str.hashCode();
        } else {
            i11 = 0;
        }
        getNotificationBuilder().a(0, getContext().getString(R.string.accept), PendingIntent.getBroadcast(context, i11, intent, PendingIntentExtensionsKt.withImmutableFlag(134217728)));
        Intent intent2 = new Intent(getContext(), LocalNotificationActionReceiver.class);
        intent2.setAction(resources.getString(R.string.reject_party_invite));
        intent2.putExtra("groupID", str);
        intent2.putExtra("NOTIFICATION_ID", i10);
        Context context2 = getContext();
        if (str != null) {
            i12 = str.hashCode();
        } else {
            i12 = 0;
        }
        getNotificationBuilder().a(0, getContext().getString(R.string.reject), PendingIntent.getBroadcast(context2, i12 + 1, intent2, PendingIntentExtensionsKt.withImmutableFlag(134217728)));
    }
}
