package com.habitrpg.android.habitica.ui.views;

import com.habitrpg.android.habitica.models.TeamPlan;
import com.habitrpg.android.habitica.models.user.User;
import dc.w;
import j0.z1;
import pc.p;
import qc.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AppHeaderView.kt */
/* loaded from: classes4.dex */
public final class AppHeaderViewKt$Preview$2 extends r implements p<j0.l, Integer, w> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ dc.l<User, TeamPlan> $data;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AppHeaderViewKt$Preview$2(dc.l<? extends User, ? extends TeamPlan> lVar, int i10) {
        super(2);
        this.$data = lVar;
        this.$$changed = i10;
    }

    @Override // pc.p
    public /* bridge */ /* synthetic */ w invoke(j0.l lVar, Integer num) {
        invoke(lVar, num.intValue());
        return w.f13270a;
    }

    public final void invoke(j0.l lVar, int i10) {
        AppHeaderViewKt.Preview(this.$data, lVar, z1.a(this.$$changed | 1));
    }
}
