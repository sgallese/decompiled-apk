package com.habitrpg.android.habitica.ui.activities;

import androidx.activity.ComponentActivity;

/* compiled from: ActivityViewModelLazy.kt */
/* loaded from: classes4.dex */
public final class TaskSummaryActivity$special$$inlined$viewModels$default$3 extends qc.r implements pc.a<j3.a> {
    final /* synthetic */ pc.a $extrasProducer;
    final /* synthetic */ ComponentActivity $this_viewModels;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaskSummaryActivity$special$$inlined$viewModels$default$3(pc.a aVar, ComponentActivity componentActivity) {
        super(0);
        this.$extrasProducer = aVar;
        this.$this_viewModels = componentActivity;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // pc.a
    public final j3.a invoke() {
        j3.a aVar;
        pc.a aVar2 = this.$extrasProducer;
        if (aVar2 == null || (aVar = (j3.a) aVar2.invoke()) == null) {
            j3.a defaultViewModelCreationExtras = this.$this_viewModels.getDefaultViewModelCreationExtras();
            qc.q.h(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
        return aVar;
    }
}
