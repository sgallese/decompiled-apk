package com.habitrpg.android.habitica.ui.activities;

import androidx.activity.ComponentActivity;
import androidx.lifecycle.y0;

/* compiled from: ActivityViewModelLazy.kt */
/* loaded from: classes4.dex */
public final class MainActivity$special$$inlined$viewModels$default$1 extends qc.r implements pc.a<y0.b> {
    final /* synthetic */ ComponentActivity $this_viewModels;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainActivity$special$$inlined$viewModels$default$1(ComponentActivity componentActivity) {
        super(0);
        this.$this_viewModels = componentActivity;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // pc.a
    public final y0.b invoke() {
        y0.b defaultViewModelProviderFactory = this.$this_viewModels.getDefaultViewModelProviderFactory();
        qc.q.h(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
        return defaultViewModelProviderFactory;
    }
}
