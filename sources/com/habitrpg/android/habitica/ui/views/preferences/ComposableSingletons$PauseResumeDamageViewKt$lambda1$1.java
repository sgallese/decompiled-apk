package com.habitrpg.android.habitica.ui.views.preferences;

import com.habitrpg.android.habitica.R;
import dc.w;
import f0.f2;
import j0.l;
import j0.n;
import pc.p;
import qc.r;
import s1.h;

/* compiled from: PauseResumeDamageView.kt */
/* renamed from: com.habitrpg.android.habitica.ui.views.preferences.ComposableSingletons$PauseResumeDamageViewKt$lambda-1$1  reason: invalid class name */
/* loaded from: classes4.dex */
final class ComposableSingletons$PauseResumeDamageViewKt$lambda1$1 extends r implements p<l, Integer, w> {
    public static final ComposableSingletons$PauseResumeDamageViewKt$lambda1$1 INSTANCE = new ComposableSingletons$PauseResumeDamageViewKt$lambda1$1();

    ComposableSingletons$PauseResumeDamageViewKt$lambda1$1() {
        super(2);
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
            n.V(-498076744, i10, -1, "com.habitrpg.android.habitica.ui.views.preferences.ComposableSingletons$PauseResumeDamageViewKt.lambda-1.<anonymous> (PauseResumeDamageView.kt:79)");
        }
        f2.b(h.a(R.string.resume_damage, lVar, 6), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, lVar, 0, 0, 131070);
        if (n.K()) {
            n.U();
        }
    }
}
