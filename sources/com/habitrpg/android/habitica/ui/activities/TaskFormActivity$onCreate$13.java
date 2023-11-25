package com.habitrpg.android.habitica.ui.activities;

import com.habitrpg.android.habitica.ui.theme.HabiticaThemeKt;
import com.habitrpg.android.habitica.ui.viewmodels.TaskFormViewModel;
import com.habitrpg.android.habitica.ui.views.tasks.form.HabitScoringButtonsViewKt;

/* compiled from: TaskFormActivity.kt */
/* loaded from: classes4.dex */
final class TaskFormActivity$onCreate$13 extends qc.r implements pc.p<j0.l, Integer, dc.w> {
    final /* synthetic */ TaskFormActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TaskFormActivity.kt */
    /* renamed from: com.habitrpg.android.habitica.ui.activities.TaskFormActivity$onCreate$13$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends qc.r implements pc.p<j0.l, Integer, dc.w> {
        final /* synthetic */ TaskFormActivity this$0;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: TaskFormActivity.kt */
        /* renamed from: com.habitrpg.android.habitica.ui.activities.TaskFormActivity$onCreate$13$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C02731 extends qc.r implements pc.a<dc.w> {
            final /* synthetic */ TaskFormActivity this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C02731(TaskFormActivity taskFormActivity) {
                super(0);
                this.this$0 = taskFormActivity;
            }

            @Override // pc.a
            public /* bridge */ /* synthetic */ dc.w invoke() {
                invoke2();
                return dc.w.f13270a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                TaskFormViewModel viewModel;
                TaskFormViewModel viewModel2;
                viewModel = this.this$0.getViewModel();
                j0.j1<Boolean> habitScoringPositive = viewModel.getHabitScoringPositive();
                viewModel2 = this.this$0.getViewModel();
                habitScoringPositive.setValue(Boolean.valueOf(!viewModel2.getHabitScoringPositive().getValue().booleanValue()));
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: TaskFormActivity.kt */
        /* renamed from: com.habitrpg.android.habitica.ui.activities.TaskFormActivity$onCreate$13$1$2  reason: invalid class name */
        /* loaded from: classes4.dex */
        public static final class AnonymousClass2 extends qc.r implements pc.a<dc.w> {
            final /* synthetic */ TaskFormActivity this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(TaskFormActivity taskFormActivity) {
                super(0);
                this.this$0 = taskFormActivity;
            }

            @Override // pc.a
            public /* bridge */ /* synthetic */ dc.w invoke() {
                invoke2();
                return dc.w.f13270a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                TaskFormViewModel viewModel;
                TaskFormViewModel viewModel2;
                viewModel = this.this$0.getViewModel();
                j0.j1<Boolean> habitScoringNegative = viewModel.getHabitScoringNegative();
                viewModel2 = this.this$0.getViewModel();
                habitScoringNegative.setValue(Boolean.valueOf(!viewModel2.getHabitScoringNegative().getValue().booleanValue()));
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
            TaskFormViewModel viewModel2;
            if ((i10 & 11) == 2 && lVar.t()) {
                lVar.z();
                return;
            }
            if (j0.n.K()) {
                j0.n.V(-1898117020, i10, -1, "com.habitrpg.android.habitica.ui.activities.TaskFormActivity.onCreate.<anonymous>.<anonymous> (TaskFormActivity.kt:355)");
            }
            viewModel = this.this$0.getViewModel();
            boolean booleanValue = viewModel.getHabitScoringPositive().getValue().booleanValue();
            viewModel2 = this.this$0.getViewModel();
            HabitScoringButtonsViewKt.HabitScoringSelector(booleanValue, viewModel2.getHabitScoringNegative().getValue().booleanValue(), new C02731(this.this$0), new AnonymousClass2(this.this$0), null, lVar, 0, 16);
            if (j0.n.K()) {
                j0.n.U();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaskFormActivity$onCreate$13(TaskFormActivity taskFormActivity) {
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
            j0.n.V(-882092081, i10, -1, "com.habitrpg.android.habitica.ui.activities.TaskFormActivity.onCreate.<anonymous> (TaskFormActivity.kt:354)");
        }
        HabiticaThemeKt.HabiticaTheme(q0.c.b(lVar, -1898117020, true, new AnonymousClass1(this.this$0)), lVar, 6);
        if (j0.n.K()) {
            j0.n.U();
        }
    }
}
