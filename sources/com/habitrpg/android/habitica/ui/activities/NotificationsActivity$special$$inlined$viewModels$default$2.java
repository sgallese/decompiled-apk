package com.habitrpg.android.habitica.ui.activities;

import androidx.activity.ComponentActivity;

/* compiled from: ActivityViewModelLazy.kt */
/* loaded from: classes4.dex */
public final class NotificationsActivity$special$$inlined$viewModels$default$2 extends qc.r implements pc.a<androidx.lifecycle.b1> {
    final /* synthetic */ ComponentActivity $this_viewModels;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationsActivity$special$$inlined$viewModels$default$2(ComponentActivity componentActivity) {
        super(0);
        this.$this_viewModels = componentActivity;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // pc.a
    public final androidx.lifecycle.b1 invoke() {
        androidx.lifecycle.b1 viewModelStore = this.$this_viewModels.getViewModelStore();
        qc.q.h(viewModelStore, "viewModelStore");
        return viewModelStore;
    }
}
