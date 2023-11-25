package com.habitrpg.android.habitica.ui.views.tasks;

import com.habitrpg.android.habitica.models.members.Member;
import dc.w;
import pc.l;
import qc.r;

/* compiled from: AssignSheet.kt */
/* loaded from: classes4.dex */
final class AssignSheetKt$AssignSheetRow$1 extends r implements pc.a<w> {
    final /* synthetic */ Member $member;
    final /* synthetic */ l<String, w> $onAssignClick;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AssignSheetKt$AssignSheetRow$1(Member member, l<? super String, w> lVar) {
        super(0);
        this.$member = member;
        this.$onAssignClick = lVar;
    }

    @Override // pc.a
    public /* bridge */ /* synthetic */ w invoke() {
        invoke2();
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$onAssignClick.invoke(this.$member.getId());
    }
}
