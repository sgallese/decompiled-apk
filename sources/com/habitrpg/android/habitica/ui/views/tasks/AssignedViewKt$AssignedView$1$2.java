package com.habitrpg.android.habitica.ui.views.tasks;

import com.habitrpg.android.habitica.models.Assignable;
import dc.w;
import j0.l;
import j0.n;
import java.util.Date;
import java.util.Map;
import pc.p;
import qc.r;

/* compiled from: AssignedView.kt */
/* loaded from: classes4.dex */
final class AssignedViewKt$AssignedView$1$2 extends r implements p<l, Integer, w> {
    final /* synthetic */ Assignable $assignable;
    final /* synthetic */ Map<String, Date> $completedAt;
    final /* synthetic */ pc.l<String, w> $onUndoClick;
    final /* synthetic */ boolean $showEditButton;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AssignedViewKt$AssignedView$1$2(Map<String, ? extends Date> map, Assignable assignable, boolean z10, pc.l<? super String, w> lVar) {
        super(2);
        this.$completedAt = map;
        this.$assignable = assignable;
        this.$showEditButton = z10;
        this.$onUndoClick = lVar;
    }

    @Override // pc.p
    public /* bridge */ /* synthetic */ w invoke(l lVar, Integer num) {
        invoke(lVar, num.intValue());
        return w.f13270a;
    }

    public final void invoke(l lVar, int i10) {
        if ((i10 & 11) == 2 && lVar.t()) {
            lVar.z();
            return;
        }
        if (n.K()) {
            n.V(1496914543, i10, -1, "com.habitrpg.android.habitica.ui.views.tasks.AssignedView.<anonymous>.<anonymous> (AssignedView.kt:69)");
        }
        if (this.$completedAt.get(this.$assignable.getId()) != null) {
            boolean z10 = this.$showEditButton;
            Assignable assignable = this.$assignable;
            pc.l<String, w> lVar2 = this.$onUndoClick;
            if (z10) {
                AssignedViewKt.UndoTaskCompletion(androidx.compose.foundation.e.e(androidx.compose.ui.e.f2335a, false, null, null, new AssignedViewKt$AssignedView$1$2$1$1(assignable, lVar2), 7, null), lVar, 0, 0);
            }
        }
        if (n.K()) {
            n.U();
        }
    }
}
