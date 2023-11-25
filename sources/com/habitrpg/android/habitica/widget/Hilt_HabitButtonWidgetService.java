package com.habitrpg.android.habitica.widget;

import ab.c;
import ab.e;
import android.app.Service;
import dagger.hilt.android.internal.managers.h;

/* loaded from: classes4.dex */
public abstract class Hilt_HabitButtonWidgetService extends Service implements c {
    private volatile h componentManager;
    private final Object componentManagerLock = new Object();
    private boolean injected = false;

    protected h createComponentManager() {
        return new h(this);
    }

    @Override // ab.b
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    protected void inject() {
        if (!this.injected) {
            this.injected = true;
            ((HabitButtonWidgetService_GeneratedInjector) generatedComponent()).injectHabitButtonWidgetService((HabitButtonWidgetService) e.a(this));
        }
    }

    @Override // android.app.Service
    public void onCreate() {
        inject();
        super.onCreate();
    }

    public final h componentManager() {
        if (this.componentManager == null) {
            synchronized (this.componentManagerLock) {
                if (this.componentManager == null) {
                    this.componentManager = createComponentManager();
                }
            }
        }
        return this.componentManager;
    }
}
