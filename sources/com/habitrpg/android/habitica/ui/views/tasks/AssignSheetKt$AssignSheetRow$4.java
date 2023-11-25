package com.habitrpg.android.habitica.ui.views.tasks;

import com.habitrpg.android.habitica.models.members.Member;
import dc.w;
import j0.l;
import j0.z1;
import pc.p;
import qc.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AssignSheet.kt */
/* loaded from: classes4.dex */
public final class AssignSheetKt$AssignSheetRow$4 extends r implements p<l, Integer, w> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ boolean $isAssigned;
    final /* synthetic */ Member $member;
    final /* synthetic */ androidx.compose.ui.e $modifier;
    final /* synthetic */ pc.l<String, w> $onAssignClick;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AssignSheetKt$AssignSheetRow$4(Member member, boolean z10, pc.l<? super String, w> lVar, androidx.compose.ui.e eVar, int i10, int i11) {
        super(2);
        this.$member = member;
        this.$isAssigned = z10;
        this.$onAssignClick = lVar;
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
        AssignSheetKt.AssignSheetRow(this.$member, this.$isAssigned, this.$onAssignClick, this.$modifier, lVar, z1.a(this.$$changed | 1), this.$$default);
    }
}
