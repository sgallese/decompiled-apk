package com.habitrpg.android.habitica.ui.fragments.social.party;

import com.habitrpg.android.habitica.R;
import dc.w;
import f0.f2;
import w.a0;

/* compiled from: PartySeekingFragment.kt */
/* renamed from: com.habitrpg.android.habitica.ui.fragments.social.party.ComposableSingletons$PartySeekingFragmentKt$lambda-4$1  reason: invalid class name */
/* loaded from: classes4.dex */
final class ComposableSingletons$PartySeekingFragmentKt$lambda4$1 extends qc.r implements pc.q<a0, j0.l, Integer, w> {
    public static final ComposableSingletons$PartySeekingFragmentKt$lambda4$1 INSTANCE = new ComposableSingletons$PartySeekingFragmentKt$lambda4$1();

    ComposableSingletons$PartySeekingFragmentKt$lambda4$1() {
        super(3);
    }

    @Override // pc.q
    public /* bridge */ /* synthetic */ w invoke(a0 a0Var, j0.l lVar, Integer num) {
        invoke(a0Var, lVar, num.intValue());
        return w.f13270a;
    }

    public final void invoke(a0 a0Var, j0.l lVar, int i10) {
        qc.q.i(a0Var, "$this$LoadingButton");
        if ((i10 & 81) == 16 && lVar.t()) {
            lVar.z();
            return;
        }
        if (j0.n.K()) {
            j0.n.V(-1082557649, i10, -1, "com.habitrpg.android.habitica.ui.fragments.social.party.ComposableSingletons$PartySeekingFragmentKt.lambda-4.<anonymous> (PartySeekingFragment.kt:187)");
        }
        f2.b(s1.h.a(R.string.send_invite, lVar, 6), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, lVar, 0, 0, 131070);
        if (j0.n.K()) {
            j0.n.U();
        }
    }
}
