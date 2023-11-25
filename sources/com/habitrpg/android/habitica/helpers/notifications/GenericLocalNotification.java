package com.habitrpg.android.habitica.helpers.notifications;

import android.content.Context;
import qc.q;

/* compiled from: GenericLocalNotification.kt */
/* loaded from: classes4.dex */
public final class GenericLocalNotification extends HabiticaLocalNotification {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GenericLocalNotification(Context context, String str) {
        super(context, str);
        q.i(context, "context");
    }
}
