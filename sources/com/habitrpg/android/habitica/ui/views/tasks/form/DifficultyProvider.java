package com.habitrpg.android.habitica.ui.views.tasks.form;

import com.habitrpg.shared.habitica.models.tasks.TaskDifficulty;
import ec.p;

/* compiled from: TaskDifficultyButtons.kt */
/* loaded from: classes4.dex */
final class DifficultyProvider implements i2.b<TaskDifficulty> {
    private final xc.g<TaskDifficulty> values;

    public DifficultyProvider() {
        xc.g<TaskDifficulty> F;
        F = p.F(TaskDifficulty.values());
        this.values = F;
    }

    @Override // i2.b
    public /* bridge */ /* synthetic */ int getCount() {
        return i2.a.a(this);
    }

    @Override // i2.b
    public xc.g<TaskDifficulty> getValues() {
        return this.values;
    }
}
