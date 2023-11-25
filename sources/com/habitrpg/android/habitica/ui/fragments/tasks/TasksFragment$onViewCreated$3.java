package com.habitrpg.android.habitica.ui.fragments.tasks;

import dc.w;
import pc.l;
import qc.r;

/* compiled from: TasksFragment.kt */
/* loaded from: classes4.dex */
final class TasksFragment$onViewCreated$3 extends r implements l<Boolean, w> {
    final /* synthetic */ TasksFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TasksFragment$onViewCreated$3(TasksFragment tasksFragment) {
        super(1);
        this.this$0 = tasksFragment;
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ w invoke(Boolean bool) {
        invoke2(bool);
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Boolean bool) {
        this.this$0.setTitleInteractive(bool != null ? bool.booleanValue() : false);
        this.this$0.updateToolbarInteractivity();
    }
}
