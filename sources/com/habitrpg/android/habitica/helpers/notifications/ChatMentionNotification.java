package com.habitrpg.android.habitica.helpers.notifications;

import android.content.Context;
import android.content.Intent;
import androidx.core.app.m;
import com.habitrpg.android.habitica.ui.activities.TaskFormActivity;
import java.util.Map;
import qc.q;

/* compiled from: ChatMentionNotification.kt */
/* loaded from: classes4.dex */
public final class ChatMentionNotification extends HabiticaLocalNotification {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatMentionNotification(Context context, String str) {
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

    @Override // com.habitrpg.android.habitica.helpers.notifications.HabiticaLocalNotification
    public m.e configureNotificationBuilder(Map<String, String> map) {
        q.i(map, "data");
        m.c h10 = new m.c().i(getTitle()).h(getMessage());
        q.h(h10, "bigText(...)");
        m.e z10 = super.configureNotificationBuilder(map).z(h10);
        q.h(z10, "setStyle(...)");
        return z10;
    }
}
