package com.habitrpg.android.habitica.ui.activities;

import com.habitrpg.android.habitica.models.tasks.Task;
import com.habitrpg.shared.habitica.models.tasks.TaskType;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChallengeFormActivity.kt */
/* loaded from: classes4.dex */
public final class ChallengeFormActivity$fillControls$4 extends qc.r implements pc.l<Task, dc.w> {
    final /* synthetic */ ChallengeFormActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengeFormActivity$fillControls$4(ChallengeFormActivity challengeFormActivity) {
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
        Task task2;
        Task task3;
        Task task4;
        Task task5;
        qc.q.i(task, "t");
        String text = task.getText();
        task2 = this.this$0.addHabit;
        if (task2 == null) {
            qc.q.z("addHabit");
            task2 = null;
        }
        if (qc.q.d(text, task2.getText())) {
            this.this$0.openNewTaskActivity(TaskType.HABIT, null);
            return;
        }
        task3 = this.this$0.addDaily;
        if (task3 == null) {
            qc.q.z("addDaily");
            task3 = null;
        }
        if (qc.q.d(text, task3.getText())) {
            this.this$0.openNewTaskActivity(TaskType.DAILY, null);
            return;
        }
        task4 = this.this$0.addTodo;
        if (task4 == null) {
            qc.q.z("addTodo");
            task4 = null;
        }
        if (qc.q.d(text, task4.getText())) {
            this.this$0.openNewTaskActivity(TaskType.TODO, null);
            return;
        }
        task5 = this.this$0.addReward;
        if (task5 == null) {
            qc.q.z("addReward");
            task5 = null;
        }
        if (qc.q.d(text, task5.getText())) {
            this.this$0.openNewTaskActivity(TaskType.REWARD, null);
        }
    }
}
