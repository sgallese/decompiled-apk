package com.habitrpg.android.habitica.ui.fragments.inventory.items;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.y0;
import com.habitrpg.android.habitica.ui.fragments.BaseDialogFragment;
import dagger.hilt.android.internal.managers.g;
import e4.a;

/* loaded from: classes4.dex */
public abstract class Hilt_ItemDialogFragment<VB extends e4.a> extends BaseDialogFragment<VB> implements ab.c {
    private ContextWrapper componentContext;
    private volatile g componentManager;
    private boolean disableGetContextFix;
    private final Object componentManagerLock = new Object();
    private boolean injected = false;

    private void initializeComponentContext() {
        if (this.componentContext == null) {
            this.componentContext = g.b(super.getContext(), this);
            this.disableGetContextFix = ua.a.a(super.getContext());
        }
    }

    protected g createComponentManager() {
        return new g(this);
    }

    @Override // ab.b
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() == null && !this.disableGetContextFix) {
            return null;
        }
        initializeComponentContext();
        return this.componentContext;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.o
    public y0.b getDefaultViewModelProviderFactory() {
        return xa.a.b(this, super.getDefaultViewModelProviderFactory());
    }

    protected void inject() {
        if (!this.injected) {
            this.injected = true;
            ((ItemDialogFragment_GeneratedInjector) generatedComponent()).injectItemDialogFragment((ItemDialogFragment) ab.e.a(this));
        }
    }

    @Override // androidx.fragment.app.k, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        initializeComponentContext();
        inject();
    }

    @Override // androidx.fragment.app.k, androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(g.c(onGetLayoutInflater, this));
    }

    public final g componentManager() {
        if (this.componentManager == null) {
            synchronized (this.componentManagerLock) {
                if (this.componentManager == null) {
                    this.componentManager = createComponentManager();
                }
            }
        }
        return this.componentManager;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.componentContext;
        ab.d.d(contextWrapper == null || g.d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        initializeComponentContext();
        inject();
    }
}
