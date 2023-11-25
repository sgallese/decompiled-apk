package com.habitrpg.android.habitica.widget;

import android.content.Context;
import android.content.Intent;
import dagger.hilt.android.internal.managers.e;

/* loaded from: classes4.dex */
public abstract class Hilt_TaskListWidgetProvider extends BaseWidgetProvider {
    private volatile boolean injected = false;
    private final Object injectedLock = new Object();

    protected void inject(Context context) {
        if (!this.injected) {
            synchronized (this.injectedLock) {
                if (!this.injected) {
                    ((TaskListWidgetProvider_GeneratedInjector) e.a(context)).injectTaskListWidgetProvider((TaskListWidgetProvider) ab.e.a(this));
                    this.injected = true;
                }
            }
        }
    }

    @Override // android.appwidget.AppWidgetProvider, android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        inject(context);
        super.onReceive(context, intent);
    }
}
