package com.habitrpg.android.habitica.utils;

import com.google.gson.JsonParseException;
import com.google.gson.j;
import com.google.gson.k;
import com.google.gson.l;
import com.google.gson.n;
import com.habitrpg.android.habitica.ui.activities.TaskFormActivity;
import com.habitrpg.common.habitica.models.Notification;
import com.habitrpg.common.habitica.models.notifications.NotificationData;
import java.lang.reflect.Type;
import qc.q;

/* compiled from: NotificationDeserializer.kt */
/* loaded from: classes4.dex */
public final class NotificationDeserializer implements k<Notification> {
    public static final int $stable = 0;

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.gson.k
    public Notification deserialize(l lVar, Type type, j jVar) throws JsonParseException {
        q.i(lVar, "json");
        q.i(type, "typeOfT");
        q.i(jVar, "context");
        Notification notification = new Notification();
        n i10 = lVar.i();
        if (i10.D("id")) {
            String l10 = i10.x("id").l();
            q.h(l10, "getAsString(...)");
            notification.setId(l10);
        }
        if (i10.D(TaskFormActivity.TASK_TYPE_KEY)) {
            notification.setType(i10.x(TaskFormActivity.TASK_TYPE_KEY).l());
        }
        if (i10.D("seen")) {
            notification.setSeen(Boolean.valueOf(i10.x("seen").a()));
        }
        Type dataType = notification.getDataType();
        if (i10.D("data") && dataType != null) {
            notification.setData((NotificationData) jVar.a(i10.A("data"), dataType));
        }
        return notification;
    }
}
