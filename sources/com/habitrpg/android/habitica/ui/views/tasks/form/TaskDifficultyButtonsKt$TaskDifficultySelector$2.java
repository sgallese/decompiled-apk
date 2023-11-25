package com.habitrpg.android.habitica.ui.views.tasks.form;

import com.habitrpg.shared.habitica.models.tasks.TaskDifficulty;
import dc.w;
import j0.z1;
import pc.p;
import qc.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TaskDifficultyButtons.kt */
/* loaded from: classes4.dex */
public final class TaskDifficultyButtonsKt$TaskDifficultySelector$2 extends r implements p<j0.l, Integer, w> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ androidx.compose.ui.e $modifier;
    final /* synthetic */ pc.l<TaskDifficulty, w> $onSelect;
    final /* synthetic */ TaskDifficulty $selected;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TaskDifficultyButtonsKt$TaskDifficultySelector$2(TaskDifficulty taskDifficulty, pc.l<? super TaskDifficulty, w> lVar, androidx.compose.ui.e eVar, int i10, int i11) {
        super(2);
        this.$selected = taskDifficulty;
        this.$onSelect = lVar;
        this.$modifier = eVar;
        this.$$changed = i10;
        this.$$default = i11;
    }

    @Override // pc.p
    public /* bridge */ /* synthetic */ w invoke(j0.l lVar, Integer num) {
        invoke(lVar, num.intValue());
        return w.f13270a;
    }

    public final void invoke(j0.l lVar, int i10) {
        TaskDifficultyButtonsKt.TaskDifficultySelector(this.$selected, this.$onSelect, this.$modifier, lVar, z1.a(this.$$changed | 1), this.$$default);
    }
}
