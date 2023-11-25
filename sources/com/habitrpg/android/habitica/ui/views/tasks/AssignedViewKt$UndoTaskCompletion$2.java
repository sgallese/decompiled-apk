package com.habitrpg.android.habitica.ui.views.tasks;

import dc.w;
import j0.l;
import j0.z1;
import pc.p;
import qc.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AssignedView.kt */
/* loaded from: classes4.dex */
public final class AssignedViewKt$UndoTaskCompletion$2 extends r implements p<l, Integer, w> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ androidx.compose.ui.e $modifier;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssignedViewKt$UndoTaskCompletion$2(androidx.compose.ui.e eVar, int i10, int i11) {
        super(2);
        this.$modifier = eVar;
        this.$$changed = i10;
        this.$$default = i11;
    }

    @Override // pc.p
    public /* bridge */ /* synthetic */ w invoke(l lVar, Integer num) {
        invoke(lVar, num.intValue());
        return w.f13270a;
    }

    public final void invoke(l lVar, int i10) {
        AssignedViewKt.UndoTaskCompletion(this.$modifier, lVar, z1.a(this.$$changed | 1), this.$$default);
    }
}
