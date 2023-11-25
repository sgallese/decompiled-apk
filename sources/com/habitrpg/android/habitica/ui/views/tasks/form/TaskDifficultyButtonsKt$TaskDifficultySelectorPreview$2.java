package com.habitrpg.android.habitica.ui.views.tasks.form;

import com.habitrpg.shared.habitica.models.tasks.TaskDifficulty;
import dc.w;
import j0.z1;
import pc.p;
import qc.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TaskDifficultyButtons.kt */
/* loaded from: classes4.dex */
public final class TaskDifficultyButtonsKt$TaskDifficultySelectorPreview$2 extends r implements p<j0.l, Integer, w> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ TaskDifficulty $difficulty;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaskDifficultyButtonsKt$TaskDifficultySelectorPreview$2(TaskDifficulty taskDifficulty, int i10) {
        super(2);
        this.$difficulty = taskDifficulty;
        this.$$changed = i10;
    }

    @Override // pc.p
    public /* bridge */ /* synthetic */ w invoke(j0.l lVar, Integer num) {
        invoke(lVar, num.intValue());
        return w.f13270a;
    }

    public final void invoke(j0.l lVar, int i10) {
        TaskDifficultyButtonsKt.TaskDifficultySelectorPreview(this.$difficulty, lVar, z1.a(this.$$changed | 1));
    }
}
