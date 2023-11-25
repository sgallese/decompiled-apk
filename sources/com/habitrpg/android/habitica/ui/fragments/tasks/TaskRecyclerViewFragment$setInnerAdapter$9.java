package com.habitrpg.android.habitica.ui.fragments.tasks;

import dc.w;
import pc.l;
import qc.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TaskRecyclerViewFragment.kt */
/* loaded from: classes4.dex */
public final class TaskRecyclerViewFragment$setInnerAdapter$9 extends r implements l<String, w> {
    final /* synthetic */ TaskRecyclerViewFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaskRecyclerViewFragment$setInnerAdapter$9(TaskRecyclerViewFragment taskRecyclerViewFragment) {
        super(1);
        this.this$0 = taskRecyclerViewFragment;
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ w invoke(String str) {
        invoke2(str);
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        TaskRecyclerViewFragment taskRecyclerViewFragment = this.this$0;
        taskRecyclerViewFragment.setCanScoreTaks$Habitica_2311256681_prodRelease(taskRecyclerViewFragment.getViewModel().isPersonalBoard());
        this.this$0.updateTaskSubscription(str);
    }
}
