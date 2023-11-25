package com.habitrpg.android.habitica.ui.views.tasks.form;

import com.habitrpg.shared.habitica.models.tasks.TaskDifficulty;
import dc.w;
import qc.r;

/* compiled from: TaskDifficultyButtons.kt */
/* loaded from: classes4.dex */
final class TaskDifficultyButtonsKt$TaskDifficultySelection$1$1$1 extends r implements pc.a<w> {
    final /* synthetic */ pc.l<TaskDifficulty, w> $onSelect;
    final /* synthetic */ TaskDifficulty $value;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TaskDifficultyButtonsKt$TaskDifficultySelection$1$1$1(pc.l<? super TaskDifficulty, w> lVar, TaskDifficulty taskDifficulty) {
        super(0);
        this.$onSelect = lVar;
        this.$value = taskDifficulty;
    }

    @Override // pc.a
    public /* bridge */ /* synthetic */ w invoke() {
        invoke2();
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$onSelect.invoke(this.$value);
    }
}
