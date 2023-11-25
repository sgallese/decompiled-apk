package com.habitrpg.android.habitica.ui.views.tasks;

import com.habitrpg.android.habitica.models.members.Member;
import dc.w;
import j0.l;
import j0.z1;
import java.util.List;
import pc.p;
import qc.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AssignSheet.kt */
/* loaded from: classes4.dex */
public final class AssignSheetKt$AssignSheet$2 extends r implements p<l, Integer, w> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ List<String> $assignedMembers;
    final /* synthetic */ List<Member> $members;
    final /* synthetic */ androidx.compose.ui.e $modifier;
    final /* synthetic */ pc.l<String, w> $onAssignClick;
    final /* synthetic */ pc.a<w> $onCloseClick;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AssignSheetKt$AssignSheet$2(List<? extends Member> list, List<String> list2, pc.l<? super String, w> lVar, pc.a<w> aVar, androidx.compose.ui.e eVar, int i10, int i11) {
        super(2);
        this.$members = list;
        this.$assignedMembers = list2;
        this.$onAssignClick = lVar;
        this.$onCloseClick = aVar;
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
        AssignSheetKt.AssignSheet(this.$members, this.$assignedMembers, this.$onAssignClick, this.$onCloseClick, this.$modifier, lVar, z1.a(this.$$changed | 1), this.$$default);
    }
}
