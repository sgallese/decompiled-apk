package com.habitrpg.android.habitica.ui.views.tasks.form;

import com.habitrpg.shared.habitica.models.tasks.TaskDifficulty;
import dc.w;
import j0.j1;
import qc.q;
import qc.r;

/* compiled from: TaskDifficultyButtons.kt */
/* loaded from: classes4.dex */
final class TaskDifficultyButtonsKt$TaskDifficultySelectorPreview$1$1 extends r implements pc.l<TaskDifficulty, w> {
    final /* synthetic */ j1<TaskDifficulty> $selected;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaskDifficultyButtonsKt$TaskDifficultySelectorPreview$1$1(j1<TaskDifficulty> j1Var) {
        super(1);
        this.$selected = j1Var;
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ w invoke(TaskDifficulty taskDifficulty) {
        invoke2(taskDifficulty);
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(TaskDifficulty taskDifficulty) {
        q.i(taskDifficulty, "it");
        this.$selected.setValue(taskDifficulty);
    }
}
