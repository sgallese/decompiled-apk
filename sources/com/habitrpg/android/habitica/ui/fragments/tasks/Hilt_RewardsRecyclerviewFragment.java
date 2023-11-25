package com.habitrpg.android.habitica.ui.fragments.tasks;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;

/* loaded from: classes4.dex */
public abstract class Hilt_RewardsRecyclerviewFragment extends TaskRecyclerViewFragment {
    private ContextWrapper componentContext;
    private boolean disableGetContextFix;
    private boolean injected = false;

    private void initializeComponentContext() {
        if (this.componentContext == null) {
            this.componentContext = dagger.hilt.android.internal.managers.g.b(super.getContext(), this);
            this.disableGetContextFix = ua.a.a(super.getContext());
        }
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.tasks.Hilt_TaskRecyclerViewFragment, androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() == null && !this.disableGetContextFix) {
            return null;
        }
        initializeComponentContext();
        return this.componentContext;
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.tasks.Hilt_TaskRecyclerViewFragment
    protected void inject() {
        if (!this.injected) {
            this.injected = true;
            ((RewardsRecyclerviewFragment_GeneratedInjector) ((ab.c) ab.e.a(this)).generatedComponent()).injectRewardsRecyclerviewFragment((RewardsRecyclerviewFragment) ab.e.a(this));
        }
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.tasks.Hilt_TaskRecyclerViewFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        initializeComponentContext();
        inject();
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.tasks.Hilt_TaskRecyclerViewFragment, androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(dagger.hilt.android.internal.managers.g.c(onGetLayoutInflater, this));
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.tasks.Hilt_TaskRecyclerViewFragment, androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.componentContext;
        ab.d.d(contextWrapper == null || dagger.hilt.android.internal.managers.g.d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        initializeComponentContext();
        inject();
    }
}
