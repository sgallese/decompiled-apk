package com.habitrpg.android.habitica.ui.fragments.social.party;

import a1.q1;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.ui.theme.HabiticaTheme;
import dc.w;
import j0.g3;
import t.u;
import w.a0;

/* compiled from: PartyInviteFragment.kt */
/* loaded from: classes4.dex */
final class PartyInviteFragmentKt$PartyInviteView$1$1$1$2 extends qc.r implements pc.q<a0, j0.l, Integer, w> {
    final /* synthetic */ g3<Float> $rotation;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PartyInviteFragmentKt$PartyInviteView$1$1$1$2(g3<Float> g3Var) {
        super(3);
        this.$rotation = g3Var;
    }

    @Override // pc.q
    public /* bridge */ /* synthetic */ w invoke(a0 a0Var, j0.l lVar, Integer num) {
        invoke(a0Var, lVar, num.intValue());
        return w.f13270a;
    }

    public final void invoke(a0 a0Var, j0.l lVar, int i10) {
        qc.q.i(a0Var, "$this$Button");
        if ((i10 & 81) == 16 && lVar.t()) {
            lVar.z();
            return;
        }
        if (j0.n.K()) {
            j0.n.V(2129655487, i10, -1, "com.habitrpg.android.habitica.ui.fragments.social.party.PartyInviteView.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PartyInviteFragment.kt:210)");
        }
        u.a(s1.f.d(R.drawable.ic_close_white_24dp, lVar, 6), null, androidx.compose.foundation.layout.m.o(x0.k.a(androidx.compose.ui.e.f2335a, this.$rotation.getValue().floatValue()), j2.h.j(32)), null, null, 0.0f, q1.a.b(q1.f163b, HabiticaTheme.INSTANCE.getColors(lVar, HabiticaTheme.$stable).m134getTextPrimary0d7_KjU(), 0, 2, null), lVar, 56, 56);
        if (j0.n.K()) {
            j0.n.U();
        }
    }
}
