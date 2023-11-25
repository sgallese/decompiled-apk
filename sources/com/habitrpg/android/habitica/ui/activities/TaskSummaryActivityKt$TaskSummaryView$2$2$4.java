package com.habitrpg.android.habitica.ui.activities;

import com.habitrpg.android.habitica.models.tasks.GroupAssignedDetails;
import com.habitrpg.android.habitica.ui.views.CompletedAtKt;

/* compiled from: TaskSummaryActivity.kt */
/* loaded from: classes4.dex */
final class TaskSummaryActivityKt$TaskSummaryView$2$2$4 extends qc.r implements pc.p<j0.l, Integer, dc.w> {
    final /* synthetic */ GroupAssignedDetails $item;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaskSummaryActivityKt$TaskSummaryView$2$2$4(GroupAssignedDetails groupAssignedDetails) {
        super(2);
        this.$item = groupAssignedDetails;
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
            j0.n.V(1618266459, i10, -1, "com.habitrpg.android.habitica.ui.activities.TaskSummaryView.<anonymous>.<anonymous>.<anonymous> (TaskSummaryActivity.kt:294)");
        }
        CompletedAtKt.CompletedAt(this.$item.getCompletedDate(), lVar, 8);
        if (j0.n.K()) {
            j0.n.U();
        }
    }
}
