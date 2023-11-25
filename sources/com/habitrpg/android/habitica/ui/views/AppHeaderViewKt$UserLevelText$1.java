package com.habitrpg.android.habitica.ui.views;

import com.habitrpg.shared.habitica.models.Avatar;
import dc.w;
import j0.z1;
import pc.p;
import qc.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AppHeaderView.kt */
/* loaded from: classes4.dex */
public final class AppHeaderViewKt$UserLevelText$1 extends r implements p<j0.l, Integer, w> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ Avatar $user;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppHeaderViewKt$UserLevelText$1(Avatar avatar, int i10) {
        super(2);
        this.$user = avatar;
        this.$$changed = i10;
    }

    @Override // pc.p
    public /* bridge */ /* synthetic */ w invoke(j0.l lVar, Integer num) {
        invoke(lVar, num.intValue());
        return w.f13270a;
    }

    public final void invoke(j0.l lVar, int i10) {
        AppHeaderViewKt.UserLevelText(this.$user, lVar, z1.a(this.$$changed | 1));
    }
}
