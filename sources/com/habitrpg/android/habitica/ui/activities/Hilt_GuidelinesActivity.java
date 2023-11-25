package com.habitrpg.android.habitica.ui.activities;

import android.content.Context;
import androidx.lifecycle.y0;

/* loaded from: classes4.dex */
public abstract class Hilt_GuidelinesActivity extends BaseActivity implements ab.c {
    private volatile dagger.hilt.android.internal.managers.a componentManager;
    private final Object componentManagerLock = new Object();
    private boolean injected = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Hilt_GuidelinesActivity() {
        _initHiltInternal();
    }

    private void _initHiltInternal() {
        addOnContextAvailableListener(new e.b() { // from class: com.habitrpg.android.habitica.ui.activities.Hilt_GuidelinesActivity.1
            @Override // e.b
            public void onContextAvailable(Context context) {
                Hilt_GuidelinesActivity.this.inject();
            }
        });
    }

    protected dagger.hilt.android.internal.managers.a createComponentManager() {
        return new dagger.hilt.android.internal.managers.a(this);
    }

    @Override // ab.b
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @Override // androidx.activity.ComponentActivity, androidx.lifecycle.o
    public y0.b getDefaultViewModelProviderFactory() {
        return xa.a.a(this, super.getDefaultViewModelProviderFactory());
    }

    protected void inject() {
        if (!this.injected) {
            this.injected = true;
            ((GuidelinesActivity_GeneratedInjector) generatedComponent()).injectGuidelinesActivity((GuidelinesActivity) ab.e.a(this));
        }
    }

    public final dagger.hilt.android.internal.managers.a componentManager() {
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
