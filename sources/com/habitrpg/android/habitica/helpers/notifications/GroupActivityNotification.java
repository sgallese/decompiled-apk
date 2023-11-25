package com.habitrpg.android.habitica.helpers.notifications;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import androidx.core.app.m;
import androidx.core.app.u;
import androidx.core.app.w;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.extensions.PendingIntentExtensionsKt;
import com.habitrpg.android.habitica.receivers.LocalNotificationActionReceiver;
import com.habitrpg.android.habitica.ui.activities.TaskFormActivity;
import com.habitrpg.common.habitica.helpers.EmojiParser;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import qc.q;

/* compiled from: GroupActivityNotification.kt */
/* loaded from: classes4.dex */
public final class GroupActivityNotification extends HabiticaLocalNotification {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupActivityNotification(Context context, String str) {
        super(context, str);
        q.i(context, "context");
    }

    private final m.h.e makeMessageFromData(Map<String, String> map) {
        Date date;
        int i10;
        boolean z10;
        u a10 = new u.b().f(map.get("senderName")).a();
        q.h(a10, "build(...)");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
        String str = map.get("timestamp");
        String str2 = null;
        if (str != null) {
            date = simpleDateFormat.parse(str);
        } else {
            date = null;
        }
        if (date == null) {
            date = new Date();
        }
        EmojiParser emojiParser = EmojiParser.INSTANCE;
        String str3 = map.get("message");
        if (str3 != null) {
            int length = str3.length() - 1;
            int i11 = 0;
            boolean z11 = false;
            while (i11 <= length) {
                if (!z11) {
                    i10 = i11;
                } else {
                    i10 = length;
                }
                if (q.k(str3.charAt(i10), 32) <= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z11) {
                    if (!z10) {
                        z11 = true;
                    } else {
                        i11++;
                    }
                } else if (!z10) {
                    break;
                } else {
                    length--;
                }
            }
            str2 = str3.subSequence(i11, length + 1).toString();
        }
        return new m.h.e(emojiParser.parseEmojis(str2), date.getTime(), a10);
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
            str = data.get(TaskFormActivity.TASK_TYPE_KEY);
        } else {
            str = null;
        }
        intent.putExtra(TaskFormActivity.TASK_TYPE_KEY, str);
        Map<String, String> data2 = getData();
        if (data2 != null) {
            str2 = data2.get("groupID");
        }
        intent.putExtra("groupID", str2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0054, code lost:
    
        r3 = r3.getActiveNotifications();
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b7 A[LOOP:1: B:39:0x00af->B:41:0x00b7, LOOP_END] */
    @Override // com.habitrpg.android.habitica.helpers.notifications.HabiticaLocalNotification
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public androidx.core.app.m.e configureNotificationBuilder(java.util.Map<java.lang.String, java.lang.String> r13) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.helpers.notifications.GroupActivityNotification.configureNotificationBuilder(java.util.Map):androidx.core.app.m$e");
    }

    @Override // com.habitrpg.android.habitica.helpers.notifications.HabiticaLocalNotification
    protected int getNotificationID(Map<String, String> map) {
        q.i(map, "data");
        String str = map.get("groupID");
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
        String str = map.get("groupID");
        if (str == null) {
            return;
        }
        String string = getContext().getString(R.string.group_message_reply);
        q.h(string, "getString(...)");
        String string2 = getContext().getString(R.string.reply);
        q.h(string2, "getString(...)");
        w.d dVar = new w.d(string);
        dVar.b(string2);
        w a10 = dVar.a();
        q.h(a10, "run(...)");
        Intent intent = new Intent(getContext(), LocalNotificationActionReceiver.class);
        intent.setAction(string);
        intent.putExtra("groupID", str);
        intent.putExtra("NOTIFICATION_ID", i10);
        PendingIntent broadcast = PendingIntent.getBroadcast(getContext(), str.hashCode(), intent, PendingIntentExtensionsKt.withMutableFlag(134217728));
        q.h(broadcast, "getBroadcast(...)");
        m.a b10 = new m.a.C0065a((int) R.drawable.ic_send_grey_600_24dp, getContext().getString(R.string.reply), broadcast).a(a10).b();
        q.h(b10, "build(...)");
        getNotificationBuilder().b(b10);
    }
}
