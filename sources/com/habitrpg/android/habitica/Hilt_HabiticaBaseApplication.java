package com.habitrpg.android.habitica;

import android.app.Application;

/* loaded from: classes4.dex */
public abstract class Hilt_HabiticaBaseApplication extends Application implements ab.c {
    private boolean injected = false;
    private final dagger.hilt.android.internal.managers.d componentManager = new dagger.hilt.android.internal.managers.d(new dagger.hilt.android.internal.managers.f() { // from class: com.habitrpg.android.habitica.Hilt_HabiticaBaseApplication.1
        @Override // dagger.hilt.android.internal.managers.f
        public Object get() {
            return DaggerHabiticaBaseApplication_HiltComponents_SingletonC.builder().applicationContextModule(new ya.a(Hilt_HabiticaBaseApplication.this)).build();
        }
    });

    @Override // ab.b
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    protected void hiltInternalInject() {
        if (!this.injected) {
            this.injected = true;
            ((HabiticaBaseApplication_GeneratedInjector) generatedComponent()).injectHabiticaBaseApplication((HabiticaBaseApplication) ab.e.a(this));
        }
    }

    @Override // android.app.Application
    public void onCreate() {
        hiltInternalInject();
        super.onCreate();
    }

    public final dagger.hilt.android.internal.managers.d componentManager() {
        return this.componentManager;
    }
}
