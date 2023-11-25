package com.habitrpg.android.habitica.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import dagger.hilt.android.internal.managers.e;

/* loaded from: classes4.dex */
public abstract class Hilt_LocalNotificationActionReceiver extends BroadcastReceiver {
    private volatile boolean injected = false;
    private final Object injectedLock = new Object();
    private final boolean onReceiveBytecodeInjectionMarker = false;

    protected void inject(Context context) {
        if (!this.injected) {
            synchronized (this.injectedLock) {
                if (!this.injected) {
                    ((LocalNotificationActionReceiver_GeneratedInjector) e.a(context)).injectLocalNotificationActionReceiver((LocalNotificationActionReceiver) ab.e.a(this));
                    this.injected = true;
                }
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        inject(context);
    }
}
