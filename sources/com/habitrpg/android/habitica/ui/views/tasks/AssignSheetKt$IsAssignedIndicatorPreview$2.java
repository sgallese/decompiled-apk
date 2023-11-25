package com.habitrpg.android.habitica.ui.views.tasks;

import dc.w;
import j0.l;
import j0.z1;
import pc.p;
import qc.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AssignSheet.kt */
/* loaded from: classes4.dex */
public final class AssignSheetKt$IsAssignedIndicatorPreview$2 extends r implements p<l, Integer, w> {
    final /* synthetic */ int $$changed;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssignSheetKt$IsAssignedIndicatorPreview$2(int i10) {
        super(2);
        this.$$changed = i10;
    }

    @Override // pc.p
    public /* bridge */ /* synthetic */ w invoke(l lVar, Integer num) {
        invoke(lVar, num.intValue());
        return w.f13270a;
    }

    public final void invoke(l lVar, int i10) {
        AssignSheetKt.IsAssignedIndicatorPreview(lVar, z1.a(this.$$changed | 1));
    }
}
