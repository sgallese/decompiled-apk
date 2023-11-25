package com.habitrpg.android.habitica.ui.fragments.social.party;

import a1.p1;
import androidx.compose.ui.e;
import com.habitrpg.android.habitica.ui.theme.HabiticaTheme;
import dc.w;
import f0.b2;
import f0.y1;
import j0.g3;
import j0.i2;
import j0.l3;
import j0.v;
import java.util.List;
import n1.i0;
import n1.x;
import p1.g;
import s.e1;
import s.g1;
import s.i1;
import s.k1;
import v0.b;
import v1.k0;
import w.b0;
import w.y;

/* compiled from: LazyDsl.kt */
/* loaded from: classes4.dex */
public final class PartyInviteFragmentKt$PartyInviteView$1$invoke$$inlined$items$default$4 extends qc.r implements pc.r<x.d, Integer, j0.l, Integer, w> {
    final /* synthetic */ List $items;
    final /* synthetic */ PartyInviteViewModel $viewModel$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PartyInviteFragmentKt$PartyInviteView$1$invoke$$inlined$items$default$4(List list, PartyInviteViewModel partyInviteViewModel) {
        super(4);
        this.$items = list;
        this.$viewModel$inlined = partyInviteViewModel;
    }

    @Override // pc.r
    public /* bridge */ /* synthetic */ w invoke(x.d dVar, Integer num, j0.l lVar, Integer num2) {
        invoke(dVar, num.intValue(), lVar, num2.intValue());
        return w.f13270a;
    }

    public final void invoke(x.d dVar, int i10, j0.l lVar, int i11) {
        int i12;
        qc.q.i(dVar, "$this$items");
        if ((i11 & 14) == 0) {
            i12 = i11 | (lVar.Q(dVar) ? 4 : 2);
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            i12 |= lVar.i(i10) ? 32 : 16;
        }
        if ((i12 & 731) == 146 && lVar.t()) {
            lVar.z();
            return;
        }
        if (j0.n.K()) {
            j0.n.V(-632812321, i12, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:144)");
        }
        int intValue = ((Number) this.$items.get(i10)).intValue();
        if (this.$viewModel$inlined.getInvites().size() > intValue) {
            String str = this.$viewModel$inlined.getInvites().get(intValue);
            e1 d10 = g1.d(Boolean.valueOf(this.$viewModel$inlined.getInvites().size() - 1 == intValue), "isLast", lVar, 48, 0);
            PartyInviteFragmentKt$PartyInviteView$1$1$rotation$1 partyInviteFragmentKt$PartyInviteView$1$1$rotation$1 = PartyInviteFragmentKt$PartyInviteView$1$1$rotation$1.INSTANCE;
            lVar.e(-1338768149);
            i1<Float, s.n> f10 = k1.f(qc.j.f21682a);
            lVar.e(-142660079);
            boolean booleanValue = ((Boolean) d10.g()).booleanValue();
            lVar.e(1561117934);
            if (j0.n.K()) {
                j0.n.V(1561117934, 0, -1, "com.habitrpg.android.habitica.ui.fragments.social.party.PartyInviteView.<anonymous>.<anonymous>.<anonymous> (PartyInviteFragment.kt:186)");
            }
            float f11 = booleanValue ? 135.0f : 0.0f;
            if (j0.n.K()) {
                j0.n.U();
            }
            lVar.N();
            Float valueOf = Float.valueOf(f11);
            boolean booleanValue2 = ((Boolean) d10.m()).booleanValue();
            lVar.e(1561117934);
            if (j0.n.K()) {
                j0.n.V(1561117934, 0, -1, "com.habitrpg.android.habitica.ui.fragments.social.party.PartyInviteView.<anonymous>.<anonymous>.<anonymous> (PartyInviteFragment.kt:186)");
            }
            float f12 = booleanValue2 ? 135.0f : 0.0f;
            if (j0.n.K()) {
                j0.n.U();
            }
            lVar.N();
            g3 c10 = g1.c(d10, valueOf, Float.valueOf(f12), partyInviteFragmentKt$PartyInviteView$1$1$rotation$1.invoke((PartyInviteFragmentKt$PartyInviteView$1$1$rotation$1) d10.k(), (e1.b) lVar, (j0.l) 0), f10, "isAssigned", lVar, 196608);
            lVar.N();
            lVar.N();
            b.c h10 = v0.b.f24258a.h();
            e.a aVar = androidx.compose.ui.e.f2335a;
            float f13 = 0;
            float f14 = 4;
            androidx.compose.ui.e j10 = androidx.compose.foundation.layout.j.j(androidx.compose.foundation.layout.m.h(aVar, 0.0f, 1, null), j2.h.j(f13), j2.h.j(f14));
            HabiticaTheme habiticaTheme = HabiticaTheme.INSTANCE;
            int i13 = HabiticaTheme.$stable;
            androidx.compose.ui.e a10 = x.c.a(dVar, androidx.compose.foundation.layout.j.j(androidx.compose.foundation.c.c(j10, habiticaTheme.getColors(lVar, i13).m141getWindowBackground0d7_KjU(), habiticaTheme.getShapes(lVar, i13).b()), j2.h.j(f14), j2.h.j(f14)), null, 1, null);
            lVar.e(693286680);
            i0 a11 = y.a(w.a.f25135a.e(), h10, lVar, 48);
            lVar.e(-1323940314);
            int a12 = j0.j.a(lVar, 0);
            v F = lVar.F();
            g.a aVar2 = p1.g.f20790l;
            pc.a<p1.g> a13 = aVar2.a();
            pc.q<i2<p1.g>, j0.l, Integer, w> a14 = x.a(a10);
            if (!(lVar.u() instanceof j0.f)) {
                j0.j.c();
            }
            lVar.s();
            if (lVar.n()) {
                lVar.B(a13);
            } else {
                lVar.H();
            }
            j0.l a15 = l3.a(lVar);
            l3.b(a15, a11, aVar2.e());
            l3.b(a15, F, aVar2.g());
            pc.p<p1.g, Integer, w> b10 = aVar2.b();
            if (a15.n() || !qc.q.d(a15.f(), Integer.valueOf(a12))) {
                a15.J(Integer.valueOf(a12));
                a15.I(Integer.valueOf(a12), b10);
            }
            a14.invoke(i2.a(i2.b(lVar)), lVar, 0);
            lVar.e(2058660585);
            b0 b0Var = b0.f25155a;
            f0.g gVar = f0.g.f14733a;
            int i14 = f0.g.f14744l;
            f0.i.a(new PartyInviteFragmentKt$PartyInviteView$1$1$1$1(this.$viewModel$inlined, intValue), androidx.compose.foundation.layout.j.i(androidx.compose.foundation.layout.m.o(aVar, j2.h.j(32)), j2.h.j(3)), false, null, gVar.b(j2.h.j(f13), 0.0f, 0.0f, 0.0f, 0.0f, lVar, (i14 << 15) | 6, 30), null, null, gVar.i(0L, 0L, 0L, lVar, i14 << 9, 7), androidx.compose.foundation.layout.j.a(j2.h.j(f13)), q0.c.b(lVar, 2129655487, true, new PartyInviteFragmentKt$PartyInviteView$1$1$1$2(c10)), lVar, 905969712, 108);
            k0 k0Var = new k0(0L, j2.t.g(16), null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, null, 0L, null, null, null, null, null, null, 16777213, null);
            y1 y1Var = y1.f15302a;
            p1.a aVar3 = p1.f146b;
            b2.a(str, new PartyInviteFragmentKt$PartyInviteView$1$1$1$4(this.$viewModel$inlined, intValue), androidx.compose.ui.focus.b.a(aVar, new PartyInviteFragmentKt$PartyInviteView$1$1$1$3(this.$viewModel$inlined, intValue)), false, false, k0Var, null, ComposableSingletons$PartyInviteFragmentKt.INSTANCE.m103getLambda2$Habitica_2311256681_prodRelease(), null, null, false, null, null, null, true, 0, 0, null, null, y1Var.f(habiticaTheme.getColors(lVar, i13).m134getTextPrimary0d7_KjU(), 0L, aVar3.d(), 0L, 0L, aVar3.d(), aVar3.d(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, lVar, 1769856, 0, 48, 2097050), lVar, 12779520, 24576, 507736);
            lVar.N();
            lVar.O();
            lVar.N();
            lVar.N();
        }
        if (j0.n.K()) {
            j0.n.U();
        }
    }
}
