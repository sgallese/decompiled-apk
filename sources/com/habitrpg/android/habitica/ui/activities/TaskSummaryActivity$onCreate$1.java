package com.habitrpg.android.habitica.ui.activities;

import com.habitrpg.android.habitica.ui.theme.HabiticaThemeKt;

/* compiled from: TaskSummaryActivity.kt */
/* loaded from: classes4.dex */
final class TaskSummaryActivity$onCreate$1 extends qc.r implements pc.p<j0.l, Integer, dc.w> {
    final /* synthetic */ TaskSummaryActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TaskSummaryActivity.kt */
    /* renamed from: com.habitrpg.android.habitica.ui.activities.TaskSummaryActivity$onCreate$1$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends qc.r implements pc.p<j0.l, Integer, dc.w> {
        final /* synthetic */ TaskSummaryActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(TaskSummaryActivity taskSummaryActivity) {
            super(2);
            this.this$0 = taskSummaryActivity;
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ dc.w invoke(j0.l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return dc.w.f13270a;
        }

        public final void invoke(j0.l lVar, int i10) {
            TaskSummaryViewModel viewModel;
            if ((i10 & 11) == 2 && lVar.t()) {
                lVar.z();
                return;
            }
            if (j0.n.K()) {
                j0.n.V(1247041368, i10, -1, "com.habitrpg.android.habitica.ui.activities.TaskSummaryActivity.onCreate.<anonymous>.<anonymous> (TaskSummaryActivity.kt:93)");
            }
            viewModel = this.this$0.getViewModel();
            TaskSummaryActivityKt.TaskSummaryView(viewModel, lVar, 8);
            if (j0.n.K()) {
                j0.n.U();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaskSummaryActivity$onCreate$1(TaskSummaryActivity taskSummaryActivity) {
        super(2);
        this.this$0 = taskSummaryActivity;
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
            j0.n.V(985813763, i10, -1, "com.habitrpg.android.habitica.ui.activities.TaskSummaryActivity.onCreate.<anonymous> (TaskSummaryActivity.kt:92)");
        }
        HabiticaThemeKt.HabiticaTheme(q0.c.b(lVar, 1247041368, true, new AnonymousClass1(this.this$0)), lVar, 6);
        if (j0.n.K()) {
            j0.n.U();
        }
    }
}
