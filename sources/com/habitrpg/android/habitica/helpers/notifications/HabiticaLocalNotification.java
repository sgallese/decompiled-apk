package com.habitrpg.android.habitica.helpers.notifications;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.media.RingtoneManager;
import androidx.core.app.m;
import androidx.core.app.r;
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.extensions.PendingIntentExtensionsKt;
import com.habitrpg.android.habitica.ui.activities.MainActivity;
import java.util.Date;
import java.util.Map;
import qc.q;

/* compiled from: HabiticaLocalNotification.kt */
/* loaded from: classes4.dex */
public abstract class HabiticaLocalNotification {
    public static final int $stable = 8;
    private Context context;
    private Map<String, String> data;
    private String identifier;
    private String message;
    private m.e notificationBuilder;
    private String title;

    public HabiticaLocalNotification(Context context, String str) {
        q.i(context, "context");
        this.context = context;
        this.identifier = str;
        m.e g10 = new m.e(context, "default").x(R.drawable.ic_gryphon_white).g(true);
        q.h(g10, "setAutoCancel(...)");
        this.notificationBuilder = g10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void configureMainIntent(Intent intent) {
        String str;
        q.i(intent, "intent");
        intent.putExtra("notificationIdentifier", this.identifier);
        intent.putExtra("notificationTimeStamp", new Date().getTime());
        Map<String, String> map = this.data;
        boolean z10 = false;
        if (map != null && map.containsKey("openURL")) {
            z10 = true;
        }
        if (z10) {
            Map<String, String> map2 = this.data;
            if (map2 != null) {
                str = map2.get("openURL");
            } else {
                str = null;
            }
            intent.putExtra("openURL", str);
        }
    }

    public m.e configureNotificationBuilder(Map<String, String> map) {
        q.i(map, "data");
        m.e j10 = this.notificationBuilder.y(RingtoneManager.getDefaultUri(2)).j(androidx.core.content.a.c(this.context, R.color.brand_300));
        q.h(j10, "setColor(...)");
        return j10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Context getContext() {
        return this.context;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Map<String, String> getData() {
        return this.data;
    }

    protected final String getIdentifier() {
        return this.identifier;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String getMessage() {
        return this.message;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final m.e getNotificationBuilder() {
        return this.notificationBuilder;
    }

    protected int getNotificationID(Map<String, String> map) {
        q.i(map, "data");
        return (int) new Date().getTime();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String getTitle() {
        return this.title;
    }

    public void notifyLocally(String str, String str2, Map<String, String> map) {
        q.i(map, "data");
        this.title = str;
        this.message = str2;
        m.e configureNotificationBuilder = configureNotificationBuilder(map);
        if (this.title != null) {
            configureNotificationBuilder = configureNotificationBuilder.m(str);
            q.h(configureNotificationBuilder, "setContentTitle(...)");
        }
        if (this.message != null) {
            configureNotificationBuilder = configureNotificationBuilder.l(str2);
            q.h(configureNotificationBuilder, "setContentText(...)");
        }
        int notificationID = getNotificationID(map);
        setNotificationActions(notificationID, map);
        r d10 = r.d(this.context);
        q.h(d10, "from(...)");
        d10.f(notificationID, configureNotificationBuilder.c());
    }

    protected final void setContext(Context context) {
        q.i(context, "<set-?>");
        this.context = context;
    }

    protected final void setData(Map<String, String> map) {
        this.data = map;
    }

    public final void setExtras(Map<String, String> map) {
        q.i(map, "data");
        this.data = map;
    }

    protected final void setIdentifier(String str) {
        this.identifier = str;
    }

    protected final void setMessage(String str) {
        this.message = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setNotificationActions(int i10, Map<String, String> map) {
        q.i(map, "data");
        Intent intent = new Intent(this.context, MainActivity.class);
        configureMainIntent(intent);
        intent.putExtra("NOTIFICATION_ID", i10);
        this.notificationBuilder.k(PendingIntent.getActivity(this.context, AuthApiStatusCodes.AUTH_API_INVALID_CREDENTIALS, intent, PendingIntentExtensionsKt.withImmutableFlag(134217728)));
    }

    protected final void setNotificationBuilder(m.e eVar) {
        q.i(eVar, "<set-?>");
        this.notificationBuilder = eVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void setTitle(String str) {
        this.title = str;
    }
}
