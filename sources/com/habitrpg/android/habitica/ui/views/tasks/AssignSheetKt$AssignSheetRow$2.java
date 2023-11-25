package com.habitrpg.android.habitica.ui.views.tasks;

import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.models.members.Member;
import dc.w;
import f0.f2;
import j0.l;
import j0.n;
import pc.p;
import qc.r;

/* compiled from: AssignSheet.kt */
/* loaded from: classes4.dex */
final class AssignSheetKt$AssignSheetRow$2 extends r implements p<l, Integer, w> {
    final /* synthetic */ Member $member;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssignSheetKt$AssignSheetRow$2(Member member) {
        super(2);
        this.$member = member;
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
            n.V(511303584, i10, -1, "com.habitrpg.android.habitica.ui.views.tasks.AssignSheetRow.<anonymous> (AssignSheet.kt:90)");
        }
        String formattedUsername = this.$member.getFormattedUsername();
        if (formattedUsername == null) {
            formattedUsername = "";
        }
        f2.b(formattedUsername, null, s1.c.a(R.color.text_ternary, lVar, 6), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, lVar, 0, 0, 131066);
        if (n.K()) {
            n.U();
        }
    }
}
