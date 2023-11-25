package com.habitrpg.android.habitica.ui.views.tasks;

import com.habitrpg.android.habitica.models.Assignable;
import com.habitrpg.android.habitica.ui.views.CompletedAtKt;
import dc.w;
import j0.l;
import j0.n;
import java.util.Date;
import java.util.Map;
import pc.p;
import qc.r;

/* compiled from: AssignedView.kt */
/* loaded from: classes4.dex */
final class AssignedViewKt$AssignedView$1$1 extends r implements p<l, Integer, w> {
    final /* synthetic */ Assignable $assignable;
    final /* synthetic */ Map<String, Date> $completedAt;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AssignedViewKt$AssignedView$1$1(Map<String, ? extends Date> map, Assignable assignable) {
        super(2);
        this.$completedAt = map;
        this.$assignable = assignable;
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
            n.V(1051377232, i10, -1, "com.habitrpg.android.habitica.ui.views.tasks.AssignedView.<anonymous>.<anonymous> (AssignedView.kt:66)");
        }
        Date date = this.$completedAt.get(this.$assignable.getId());
        if (date != null) {
            CompletedAtKt.CompletedAt(date, lVar, 8);
        }
        if (n.K()) {
            n.U();
        }
    }
}
