package com.habitrpg.android.habitica.ui.activities;

import com.habitrpg.android.habitica.models.tasks.Task;

/* compiled from: ChallengeFormActivity.kt */
/* loaded from: classes4.dex */
final class ChallengeFormActivity$onCreate$2 extends qc.r implements pc.l<Task, dc.w> {
    final /* synthetic */ ChallengeFormActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengeFormActivity$onCreate$2(ChallengeFormActivity challengeFormActivity) {
        super(1);
        this.this$0 = challengeFormActivity;
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ dc.w invoke(Task task) {
        invoke2(task);
        return dc.w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Task task) {
        qc.q.i(task, "it");
        if (task.isValid()) {
            this.this$0.openNewTaskActivity(task.getType(), task);
        }
    }
}
