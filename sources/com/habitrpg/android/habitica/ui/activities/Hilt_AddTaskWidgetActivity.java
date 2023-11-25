package com.habitrpg.android.habitica.ui.activities;

import android.content.Context;
import androidx.lifecycle.y0;

/* loaded from: classes4.dex */
public abstract class Hilt_AddTaskWidgetActivity extends androidx.appcompat.app.d implements ab.c {
    private volatile dagger.hilt.android.internal.managers.a componentManager;
    private final Object componentManagerLock;
    private boolean injected;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Hilt_AddTaskWidgetActivity() {
        this.componentManagerLock = new Object();
        this.injected = false;
        _initHiltInternal();
    }

    private void _initHiltInternal() {
        addOnContextAvailableListener(new e.b() { // from class: com.habitrpg.android.habitica.ui.activities.Hilt_AddTaskWidgetActivity.1
            @Override // e.b
            public void onContextAvailable(Context context) {
                Hilt_AddTaskWidgetActivity.this.inject();
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
            ((AddTaskWidgetActivity_GeneratedInjector) generatedComponent()).injectAddTaskWidgetActivity((AddTaskWidgetActivity) ab.e.a(this));
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

    Hilt_AddTaskWidgetActivity(int i10) {
        super(i10);
        this.componentManagerLock = new Object();
        this.injected = false;
        _initHiltInternal();
    }
}
