package com.habitrpg.android.habitica.ui.fragments.social.party;

import s.e0;
import s.e1;
import s.z0;

/* compiled from: PartyInviteFragment.kt */
/* loaded from: classes4.dex */
final class PartyInviteFragmentKt$PartyInviteView$1$1$rotation$1 extends qc.r implements pc.q<e1.b<Boolean>, j0.l, Integer, e0<Float>> {
    public static final PartyInviteFragmentKt$PartyInviteView$1$1$rotation$1 INSTANCE = new PartyInviteFragmentKt$PartyInviteView$1$1$rotation$1();

    PartyInviteFragmentKt$PartyInviteView$1$1$rotation$1() {
        super(3);
    }

    @Override // pc.q
    public /* bridge */ /* synthetic */ e0<Float> invoke(e1.b<Boolean> bVar, j0.l lVar, Integer num) {
        return invoke(bVar, lVar, num.intValue());
    }

    public final e0<Float> invoke(e1.b<Boolean> bVar, j0.l lVar, int i10) {
        qc.q.i(bVar, "$this$animateFloat");
        lVar.e(1045641843);
        if (j0.n.K()) {
            j0.n.V(1045641843, i10, -1, "com.habitrpg.android.habitica.ui.fragments.social.party.PartyInviteView.<anonymous>.<anonymous>.<anonymous> (PartyInviteFragment.kt:184)");
        }
        z0 g10 = s.k.g(0.75f, 400.0f, null, 4, null);
        if (j0.n.K()) {
            j0.n.U();
        }
        lVar.N();
        return g10;
    }
}
