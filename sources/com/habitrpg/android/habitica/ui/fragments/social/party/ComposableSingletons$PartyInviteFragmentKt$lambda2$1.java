package com.habitrpg.android.habitica.ui.fragments.social.party;

import com.habitrpg.android.habitica.R;
import dc.w;
import f0.f2;

/* compiled from: PartyInviteFragment.kt */
/* renamed from: com.habitrpg.android.habitica.ui.fragments.social.party.ComposableSingletons$PartyInviteFragmentKt$lambda-2$1  reason: invalid class name */
/* loaded from: classes4.dex */
final class ComposableSingletons$PartyInviteFragmentKt$lambda2$1 extends qc.r implements pc.p<j0.l, Integer, w> {
    public static final ComposableSingletons$PartyInviteFragmentKt$lambda2$1 INSTANCE = new ComposableSingletons$PartyInviteFragmentKt$lambda2$1();

    ComposableSingletons$PartyInviteFragmentKt$lambda2$1() {
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
        if (j0.n.K()) {
            j0.n.V(1949074826, i10, -1, "com.habitrpg.android.habitica.ui.fragments.social.party.ComposableSingletons$PartyInviteFragmentKt.lambda-2.<anonymous> (PartyInviteFragment.kt:230)");
        }
        f2.b(s1.h.a(R.string.username_or_email, lVar, 6), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, lVar, 0, 0, 131070);
        if (j0.n.K()) {
            j0.n.U();
        }
    }
}
