package com.habitrpg.android.habitica.ui.activities;

import com.habitrpg.android.habitica.ui.theme.HabiticaThemeKt;
import com.habitrpg.android.habitica.ui.viewmodels.TaskFormViewModel;
import com.habitrpg.android.habitica.ui.views.tasks.form.TaskDifficultyButtonsKt;
import com.habitrpg.shared.habitica.models.tasks.TaskDifficulty;

/* compiled from: TaskFormActivity.kt */
/* loaded from: classes4.dex */
final class TaskFormActivity$onCreate$12 extends qc.r implements pc.p<j0.l, Integer, dc.w> {
    final /* synthetic */ TaskFormActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TaskFormActivity.kt */
    /* renamed from: com.habitrpg.android.habitica.ui.activities.TaskFormActivity$onCreate$12$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends qc.r implements pc.p<j0.l, Integer, dc.w> {
        final /* synthetic */ TaskFormActivity this$0;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: TaskFormActivity.kt */
        /* renamed from: com.habitrpg.android.habitica.ui.activities.TaskFormActivity$onCreate$12$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C02721 extends qc.r implements pc.l<TaskDifficulty, dc.w> {
            final /* synthetic */ TaskFormActivity this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C02721(TaskFormActivity taskFormActivity) {
                super(1);
                this.this$0 = taskFormActivity;
            }

            @Override // pc.l
            public /* bridge */ /* synthetic */ dc.w invoke(TaskDifficulty taskDifficulty) {
                invoke2(taskDifficulty);
                return dc.w.f13270a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(TaskDifficulty taskDifficulty) {
                TaskFormViewModel viewModel;
                qc.q.i(taskDifficulty, "it");
                viewModel = this.this$0.getViewModel();
                viewModel.getTaskDifficulty().setValue(taskDifficulty);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(TaskFormActivity taskFormActivity) {
            super(2);
            this.this$0 = taskFormActivity;
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ dc.w invoke(j0.l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return dc.w.f13270a;
        }

        public final void invoke(j0.l lVar, int i10) {
            TaskFormViewModel viewModel;
            if ((i10 & 11) == 2 && lVar.t()) {
                lVar.z();
                return;
            }
            if (j0.n.K()) {
                j0.n.V(1443762647, i10, -1, "com.habitrpg.android.habitica.ui.activities.TaskFormActivity.onCreate.<anonymous>.<anonymous> (TaskFormActivity.kt:345)");
            }
            viewModel = this.this$0.getViewModel();
            TaskDifficultyButtonsKt.TaskDifficultySelector(viewModel.getTaskDifficulty().getValue(), new C02721(this.this$0), null, lVar, 0, 4);
            if (j0.n.K()) {
                j0.n.U();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaskFormActivity$onCreate$12(TaskFormActivity taskFormActivity) {
        super(2);
        this.this$0 = taskFormActivity;
    }

    @Override // pc.p
    public /* bridge */ /* synthetic */ dc.w invoke(j0.l lVar, Integer num) {
        invoke(lVar, num.intValue());
        return dc.w.f13270a;
    }

    public final void invoke(j0.l lVar, int i10) {
        if ((i10 & 11) == 2 && lVar.t()) {
            lVar.z();
            return;
        }
        if (j0.n.K()) {
            j0.n.V(1088481730, i10, -1, "com.habitrpg.android.habitica.ui.activities.TaskFormActivity.onCreate.<anonymous> (TaskFormActivity.kt:344)");
        }
        HabiticaThemeKt.HabiticaTheme(q0.c.b(lVar, 1443762647, true, new AnonymousClass1(this.this$0)), lVar, 6);
        if (j0.n.K()) {
            j0.n.U();
        }
    }
}
