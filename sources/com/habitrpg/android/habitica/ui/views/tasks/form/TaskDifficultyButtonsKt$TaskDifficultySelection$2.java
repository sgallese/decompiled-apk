package com.habitrpg.android.habitica.ui.views.tasks.form;

import a1.t3;
import com.habitrpg.shared.habitica.models.tasks.TaskDifficulty;
import dc.w;
import j0.z1;
import pc.p;
import qc.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TaskDifficultyButtons.kt */
/* loaded from: classes4.dex */
public final class TaskDifficultyButtonsKt$TaskDifficultySelection$2 extends r implements p<j0.l, Integer, w> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ t3 $icon;
    final /* synthetic */ androidx.compose.ui.e $modifier;
    final /* synthetic */ pc.l<TaskDifficulty, w> $onSelect;
    final /* synthetic */ boolean $selected;
    final /* synthetic */ String $text;
    final /* synthetic */ TaskDifficulty $value;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TaskDifficultyButtonsKt$TaskDifficultySelection$2(TaskDifficulty taskDifficulty, boolean z10, t3 t3Var, String str, pc.l<? super TaskDifficulty, w> lVar, androidx.compose.ui.e eVar, int i10, int i11) {
        super(2);
        this.$value = taskDifficulty;
        this.$selected = z10;
        this.$icon = t3Var;
        this.$text = str;
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
        TaskDifficultyButtonsKt.TaskDifficultySelection(this.$value, this.$selected, this.$icon, this.$text, this.$onSelect, this.$modifier, lVar, z1.a(this.$$changed | 1), this.$$default);
    }
}
