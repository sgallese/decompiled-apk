package com.habitrpg.android.habitica.ui.activities;

import a1.q1;
import com.habitrpg.android.habitica.R;

/* compiled from: TaskSummaryActivity.kt */
/* loaded from: classes4.dex */
final class TaskSummaryActivityKt$TaskSummaryView$2$1$2 extends qc.r implements pc.q<w.a0, j0.l, Integer, dc.w> {
    final /* synthetic */ long $topTextColor;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaskSummaryActivityKt$TaskSummaryView$2$1$2(long j10) {
        super(3);
        this.$topTextColor = j10;
    }

    @Override // pc.q
    public /* bridge */ /* synthetic */ dc.w invoke(w.a0 a0Var, j0.l lVar, Integer num) {
        invoke(a0Var, lVar, num.intValue());
        return dc.w.f13270a;
    }

    public final void invoke(w.a0 a0Var, j0.l lVar, int i10) {
        qc.q.i(a0Var, "$this$Button");
        if ((i10 & 81) == 16 && lVar.t()) {
            lVar.z();
            return;
        }
        if (j0.n.K()) {
            j0.n.V(-1605872881, i10, -1, "com.habitrpg.android.habitica.ui.activities.TaskSummaryView.<anonymous>.<anonymous>.<anonymous> (TaskSummaryActivity.kt:140)");
        }
        t.u.a(s1.f.d(R.drawable.arrow_back, lVar, 6), s1.h.a(R.string.action_back, lVar, 6), null, null, null, 0.0f, q1.a.b(a1.q1.f163b, this.$topTextColor, 0, 2, null), lVar, 8, 60);
        if (j0.n.K()) {
            j0.n.U();
        }
    }
}
