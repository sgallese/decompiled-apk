package com.habitrpg.android.habitica.ui.views.tasks;

import com.habitrpg.android.habitica.models.Assignable;
import dc.w;
import j0.l;
import j0.z1;
import java.util.Date;
import java.util.List;
import java.util.Map;
import pc.p;
import qc.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AssignedView.kt */
/* loaded from: classes4.dex */
public final class AssignedViewKt$AssignedView$2 extends r implements p<l, Integer, w> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ List<Assignable> $assigned;
    final /* synthetic */ long $backgroundColor;
    final /* synthetic */ long $color;
    final /* synthetic */ Map<String, Date> $completedAt;
    final /* synthetic */ androidx.compose.ui.e $modifier;
    final /* synthetic */ pc.a<w> $onEditClick;
    final /* synthetic */ pc.l<String, w> $onUndoClick;
    final /* synthetic */ boolean $showEditButton;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AssignedViewKt$AssignedView$2(List<? extends Assignable> list, Map<String, ? extends Date> map, long j10, long j11, pc.a<w> aVar, pc.l<? super String, w> lVar, androidx.compose.ui.e eVar, boolean z10, int i10, int i11) {
        super(2);
        this.$assigned = list;
        this.$completedAt = map;
        this.$backgroundColor = j10;
        this.$color = j11;
        this.$onEditClick = aVar;
        this.$onUndoClick = lVar;
        this.$modifier = eVar;
        this.$showEditButton = z10;
        this.$$changed = i10;
        this.$$default = i11;
    }

    @Override // pc.p
    public /* bridge */ /* synthetic */ w invoke(l lVar, Integer num) {
        invoke(lVar, num.intValue());
        return w.f13270a;
    }

    public final void invoke(l lVar, int i10) {
        AssignedViewKt.m179AssignedViewnjYn8yo(this.$assigned, this.$completedAt, this.$backgroundColor, this.$color, this.$onEditClick, this.$onUndoClick, this.$modifier, this.$showEditButton, lVar, z1.a(this.$$changed | 1), this.$$default);
    }
}
