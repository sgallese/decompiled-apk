package com.habitrpg.android.habitica.ui.adapter;

import com.habitrpg.android.habitica.ui.views.promo.BirthdayMenuViewKt;
import dc.w;
import j0.l;
import j0.n;
import java.util.Date;
import pc.p;
import qc.r;

/* compiled from: NavigationDrawerAdapter.kt */
/* loaded from: classes4.dex */
final class NavigationDrawerAdapter$onBindViewHolder$3$1 extends r implements p<l, Integer, w> {
    final /* synthetic */ Date $it;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationDrawerAdapter$onBindViewHolder$3$1(Date date) {
        super(2);
        this.$it = date;
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
            n.V(-1685347253, i10, -1, "com.habitrpg.android.habitica.ui.adapter.NavigationDrawerAdapter.onBindViewHolder.<anonymous>.<anonymous> (NavigationDrawerAdapter.kt:100)");
        }
        if (this.$it.before(new Date())) {
            if (n.K()) {
                n.U();
                return;
            }
            return;
        }
        BirthdayMenuViewKt.BirthdayBanner(this.$it, null, lVar, 8, 2);
        if (n.K()) {
            n.U();
        }
    }
}
