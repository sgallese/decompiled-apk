package com.habitrpg.android.habitica.ui.views;

import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.ui.theme.HabiticaColors;
import com.habitrpg.android.habitica.ui.theme.HabiticaTheme;
import dc.w;
import f0.f2;
import j0.n;
import pc.p;
import qc.r;

/* compiled from: AppHeaderView.kt */
/* renamed from: com.habitrpg.android.habitica.ui.views.ComposableSingletons$AppHeaderViewKt$lambda-1$1  reason: invalid class name */
/* loaded from: classes4.dex */
final class ComposableSingletons$AppHeaderViewKt$lambda1$1 extends r implements p<j0.l, Integer, w> {
    public static final ComposableSingletons$AppHeaderViewKt$lambda1$1 INSTANCE = new ComposableSingletons$AppHeaderViewKt$lambda1$1();

    ComposableSingletons$AppHeaderViewKt$lambda1$1() {
        super(2);
    }

    @Override // pc.p
    public /* bridge */ /* synthetic */ w invoke(j0.l lVar, Integer num) {
        invoke(lVar, num.intValue());
        return w.f13270a;
    }

    public final void invoke(j0.l lVar, int i10) {
        if ((i10 & 11) == 2 && lVar.t()) {
            lVar.z();
            return;
        }
        if (n.K()) {
            n.V(-1922898339, i10, -1, "com.habitrpg.android.habitica.ui.views.ComposableSingletons$AppHeaderViewKt.lambda-1.<anonymous> (AppHeaderView.kt:191)");
        }
        f2.b(s1.h.a(R.string.choose_class, lVar, 6), null, HabiticaTheme.INSTANCE.getColors(lVar, HabiticaTheme.$stable).m123basicTextColorWaAFU9c(lVar, HabiticaColors.$stable), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, lVar, 0, 0, 131066);
        if (n.K()) {
            n.U();
        }
    }
}
