package com.habitrpg.android.habitica.ui.views;

import a2.c0;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.ui.theme.HabiticaTheme;
import dc.w;
import f0.f2;
import j0.n;
import j2.t;
import pc.q;
import qc.r;

/* compiled from: GroupPlanMemberList.kt */
/* renamed from: com.habitrpg.android.habitica.ui.views.ComposableSingletons$GroupPlanMemberListKt$lambda-1$1  reason: invalid class name */
/* loaded from: classes4.dex */
final class ComposableSingletons$GroupPlanMemberListKt$lambda1$1 extends r implements q<x.d, j0.l, Integer, w> {
    public static final ComposableSingletons$GroupPlanMemberListKt$lambda1$1 INSTANCE = new ComposableSingletons$GroupPlanMemberListKt$lambda1$1();

    ComposableSingletons$GroupPlanMemberListKt$lambda1$1() {
        super(3);
    }

    @Override // pc.q
    public /* bridge */ /* synthetic */ w invoke(x.d dVar, j0.l lVar, Integer num) {
        invoke(dVar, lVar, num.intValue());
        return w.f13270a;
    }

    public final void invoke(x.d dVar, j0.l lVar, int i10) {
        qc.q.i(dVar, "$this$item");
        if ((i10 & 81) == 16 && lVar.t()) {
            lVar.z();
            return;
        }
        if (n.K()) {
            n.V(2112104672, i10, -1, "com.habitrpg.android.habitica.ui.views.ComposableSingletons$GroupPlanMemberListKt.lambda-1.<anonymous> (GroupPlanMemberList.kt:46)");
        }
        f2.b(s1.h.a(R.string.member_list, lVar, 6), androidx.compose.foundation.layout.j.m(androidx.compose.foundation.layout.m.h(androidx.compose.ui.e.f2335a, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, j2.h.j(20), 7, null), HabiticaTheme.INSTANCE.getColors(lVar, HabiticaTheme.$stable).m137getTextTertiary0d7_KjU(), t.g(16), null, c0.f239m.d(), null, 0L, null, g2.j.g(g2.j.f16057b.a()), 0L, 0, false, 0, 0, null, null, lVar, 199728, 0, 130512);
        if (n.K()) {
            n.U();
        }
    }
}
