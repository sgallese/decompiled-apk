package com.habitrpg.android.habitica.ui.fragments.social.party;

import ad.k0;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.habitrpg.android.habitica.ui.views.LoadingButtonState;
import dc.w;
import j0.d3;
import j0.g2;
import j0.h0;
import j0.j1;
import j0.l;
import j0.x;
import java.util.UUID;

/* compiled from: PartyInviteFragment.kt */
/* loaded from: classes4.dex */
public final class PartyInviteFragmentKt {
    public static final void PartyInviteView(PartyInviteViewModel partyInviteViewModel, pc.a<w> aVar, j0.l lVar, int i10) {
        qc.q.i(partyInviteViewModel, "viewModel");
        qc.q.i(aVar, "dismiss");
        j0.l q10 = lVar.q(1093711822);
        if (j0.n.K()) {
            j0.n.V(1093711822, i10, -1, "com.habitrpg.android.habitica.ui.fragments.social.party.PartyInviteView (PartyInviteFragment.kt:146)");
        }
        q10.e(-492369756);
        Object f10 = q10.f();
        l.a aVar2 = j0.l.f18688a;
        if (f10 == aVar2.a()) {
            f10 = d3.e(LoadingButtonState.CONTENT, null, 2, null);
            q10.J(f10);
        }
        q10.N();
        j1 j1Var = (j1) f10;
        q10.e(773894976);
        q10.e(-492369756);
        Object f11 = q10.f();
        if (f11 == aVar2.a()) {
            x xVar = new x(h0.h(hc.g.f16601f, q10));
            q10.J(xVar);
            f11 = xVar;
        }
        q10.N();
        k0 a10 = ((x) f11).a();
        q10.N();
        x.b.a(androidx.compose.foundation.gestures.d.k(androidx.compose.foundation.layout.j.i(androidx.compose.foundation.layout.m.f(androidx.compose.ui.e.f2335a, 0.0f, 1, null), j2.h.j(14)), androidx.compose.foundation.r.a(0, q10, 0, 1), u.o.Vertical, false, false, null, null, 60, null), null, null, false, null, null, null, false, new PartyInviteFragmentKt$PartyInviteView$1(partyInviteViewModel, j1Var, a10, aVar), q10, 0, 254);
        if (j0.n.K()) {
            j0.n.U();
        }
        g2 w10 = q10.w();
        if (w10 != null) {
            w10.a(new PartyInviteFragmentKt$PartyInviteView$2(partyInviteViewModel, aVar, i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LoadingButtonState PartyInviteView$lambda$1(j1<LoadingButtonState> j1Var) {
        return j1Var.getValue();
    }

    public static final UUID uUIDFromStringOrNull(String str) {
        qc.q.i(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        try {
            return UUID.fromString(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }
}
