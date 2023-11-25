package com.habitrpg.android.habitica.ui.views.tasks;

import dc.w;
import j0.l;
import j0.n;
import pc.p;
import qc.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AssignSheet.kt */
/* loaded from: classes4.dex */
public final class AssignSheetKt$AssignSheetRow$3 extends r implements p<l, Integer, w> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ boolean $isAssigned;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssignSheetKt$AssignSheetRow$3(boolean z10, int i10) {
        super(2);
        this.$isAssigned = z10;
        this.$$dirty = i10;
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
            n.V(433313313, i10, -1, "com.habitrpg.android.habitica.ui.views.tasks.AssignSheetRow.<anonymous> (AssignSheet.kt:96)");
        }
        AssignSheetKt.IsAssignedIndicator(this.$isAssigned, null, lVar, (this.$$dirty >> 3) & 14, 2);
        if (n.K()) {
            n.U();
        }
    }
}
