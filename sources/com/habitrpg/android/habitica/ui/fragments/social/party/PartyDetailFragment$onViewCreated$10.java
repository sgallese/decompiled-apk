package com.habitrpg.android.habitica.ui.fragments.social.party;

import androidx.compose.ui.e;
import com.habitrpg.android.habitica.models.members.Member;
import com.habitrpg.android.habitica.ui.theme.HabiticaThemeKt;
import com.habitrpg.android.habitica.ui.views.LoadingButtonState;
import com.habitrpg.android.habitica.ui.views.social.PartySeekingListItemKt;
import dc.w;
import j$.util.Map;
import j0.i2;
import j0.l3;
import j0.v;
import java.util.Iterator;
import n1.i0;
import n1.x;
import p1.g;

/* compiled from: PartyDetailFragment.kt */
/* loaded from: classes4.dex */
final class PartyDetailFragment$onViewCreated$10 extends qc.r implements pc.p<j0.l, Integer, w> {
    final /* synthetic */ PartyDetailFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PartyDetailFragment.kt */
    /* renamed from: com.habitrpg.android.habitica.ui.fragments.social.party.PartyDetailFragment$onViewCreated$10$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends qc.r implements pc.p<j0.l, Integer, w> {
        final /* synthetic */ PartyDetailFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(PartyDetailFragment partyDetailFragment) {
            super(2);
            this.this$0 = partyDetailFragment;
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
                j0.n.V(1798147978, i10, -1, "com.habitrpg.android.habitica.ui.fragments.social.party.PartyDetailFragment.onViewCreated.<anonymous>.<anonymous> (PartyDetailFragment.kt:126)");
            }
            PartyDetailFragment partyDetailFragment = this.this$0;
            lVar.e(-483455358);
            e.a aVar = androidx.compose.ui.e.f2335a;
            i0 a10 = w.h.a(w.a.f25135a.f(), v0.b.f24258a.j(), lVar, 0);
            lVar.e(-1323940314);
            int a11 = j0.j.a(lVar, 0);
            v F = lVar.F();
            g.a aVar2 = p1.g.f20790l;
            pc.a<p1.g> a12 = aVar2.a();
            pc.q<i2<p1.g>, j0.l, Integer, w> a13 = x.a(aVar);
            if (!(lVar.u() instanceof j0.f)) {
                j0.j.c();
            }
            lVar.s();
            if (lVar.n()) {
                lVar.B(a12);
            } else {
                lVar.H();
            }
            j0.l a14 = l3.a(lVar);
            l3.b(a14, a10, aVar2.e());
            l3.b(a14, F, aVar2.g());
            pc.p<p1.g, Integer, w> b10 = aVar2.b();
            if (a14.n() || !qc.q.d(a14.f(), Integer.valueOf(a11))) {
                a14.J(Integer.valueOf(a11));
                a14.I(Integer.valueOf(a11), b10);
            }
            a13.invoke(i2.a(i2.b(lVar)), lVar, 0);
            lVar.e(2058660585);
            w.k kVar = w.k.f25176a;
            lVar.e(-1081965563);
            Iterator<Member> it = partyDetailFragment.getViewModel().getPendingInvites().iterator();
            while (it.hasNext()) {
                Member next = it.next();
                PartySeekingListItemKt.PartySeekingListItem(next, null, (LoadingButtonState) Map.EL.getOrDefault(partyDetailFragment.getViewModel().getPendingInviteStates(), next.getId(), LoadingButtonState.CONTENT), true, true, false, new PartyDetailFragment$onViewCreated$10$1$1$1(partyDetailFragment, next), lVar, Member.$stable | 224256, 2);
            }
            lVar.N();
            lVar.N();
            lVar.O();
            lVar.N();
            lVar.N();
            if (j0.n.K()) {
                j0.n.U();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PartyDetailFragment$onViewCreated$10(PartyDetailFragment partyDetailFragment) {
        super(2);
        this.this$0 = partyDetailFragment;
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
            j0.n.V(505437183, i10, -1, "com.habitrpg.android.habitica.ui.fragments.social.party.PartyDetailFragment.onViewCreated.<anonymous> (PartyDetailFragment.kt:125)");
        }
        HabiticaThemeKt.HabiticaTheme(q0.c.b(lVar, 1798147978, true, new AnonymousClass1(this.this$0)), lVar, 6);
        if (j0.n.K()) {
            j0.n.U();
        }
    }
}
