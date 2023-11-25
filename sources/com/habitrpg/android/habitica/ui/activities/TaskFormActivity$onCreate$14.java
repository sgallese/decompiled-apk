package com.habitrpg.android.habitica.ui.activities;

import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.ui.theme.HabiticaThemeKt;
import com.habitrpg.android.habitica.ui.viewmodels.TaskFormViewModel;
import com.habitrpg.android.habitica.ui.views.tasks.form.LabeledValue;
import com.habitrpg.android.habitica.ui.views.tasks.form.TaskFormSelectorKt;
import com.habitrpg.shared.habitica.models.tasks.HabitResetOption;
import java.util.List;

/* compiled from: TaskFormActivity.kt */
/* loaded from: classes4.dex */
final class TaskFormActivity$onCreate$14 extends qc.r implements pc.p<j0.l, Integer, dc.w> {
    final /* synthetic */ TaskFormActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TaskFormActivity.kt */
    /* renamed from: com.habitrpg.android.habitica.ui.activities.TaskFormActivity$onCreate$14$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends qc.r implements pc.p<j0.l, Integer, dc.w> {
        final /* synthetic */ TaskFormActivity this$0;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: TaskFormActivity.kt */
        /* renamed from: com.habitrpg.android.habitica.ui.activities.TaskFormActivity$onCreate$14$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C02741 extends qc.r implements pc.l<HabitResetOption, dc.w> {
            final /* synthetic */ TaskFormActivity this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C02741(TaskFormActivity taskFormActivity) {
                super(1);
                this.this$0 = taskFormActivity;
            }

            @Override // pc.l
            public /* bridge */ /* synthetic */ dc.w invoke(HabitResetOption habitResetOption) {
                invoke2(habitResetOption);
                return dc.w.f13270a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(HabitResetOption habitResetOption) {
                TaskFormViewModel viewModel;
                qc.q.i(habitResetOption, "it");
                viewModel = this.this$0.getViewModel();
                viewModel.getHabitResetOption().setValue(habitResetOption);
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
            List l10;
            if ((i10 & 11) == 2 && lVar.t()) {
                lVar.z();
                return;
            }
            if (j0.n.K()) {
                j0.n.V(-1450093811, i10, -1, "com.habitrpg.android.habitica.ui.activities.TaskFormActivity.onCreate.<anonymous>.<anonymous> (TaskFormActivity.kt:366)");
            }
            viewModel = this.this$0.getViewModel();
            HabitResetOption value = viewModel.getHabitResetOption().getValue();
            String string = this.this$0.getString(R.string.repeat_daily);
            qc.q.h(string, "getString(...)");
            String string2 = this.this$0.getString(R.string.weekly);
            qc.q.h(string2, "getString(...)");
            String string3 = this.this$0.getString(R.string.monthly);
            qc.q.h(string3, "getString(...)");
            l10 = ec.t.l(new LabeledValue(string, HabitResetOption.DAILY), new LabeledValue(string2, HabitResetOption.WEEKLY), new LabeledValue(string3, HabitResetOption.MONTHLY));
            TaskFormSelectorKt.m183TaskFormSelectorHYR8e34(value, l10, new C02741(this.this$0), null, 3, 0.0f, lVar, ((LabeledValue.$stable | 0) << 3) | 24576, 40);
            if (j0.n.K()) {
                j0.n.U();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaskFormActivity$onCreate$14(TaskFormActivity taskFormActivity) {
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
            j0.n.V(-7703624, i10, -1, "com.habitrpg.android.habitica.ui.activities.TaskFormActivity.onCreate.<anonymous> (TaskFormActivity.kt:365)");
        }
        HabiticaThemeKt.HabiticaTheme(q0.c.b(lVar, -1450093811, true, new AnonymousClass1(this.this$0)), lVar, 6);
        if (j0.n.K()) {
            j0.n.U();
        }
    }
}
