package com.habitrpg.android.habitica.ui.fragments.social.party;

import a2.c0;
import ad.k0;
import androidx.compose.ui.e;
import androidx.paging.q0;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.models.members.Member;
import com.habitrpg.android.habitica.ui.theme.HabiticaTheme;
import com.habitrpg.android.habitica.ui.views.LoadingButtonState;
import com.habitrpg.android.habitica.ui.views.social.PartySeekingListItemKt;
import com.habitrpg.common.habitica.helpers.ExceptionHandlerKt;
import dc.w;
import f0.f2;
import j0.i2;
import j0.l3;
import j0.v;
import kotlin.coroutines.Continuation;
import n1.i0;
import p1.g;
import t.u;
import v0.b;
import x.x;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PartySeekingFragment.kt */
/* loaded from: classes4.dex */
public final class PartySeekingFragmentKt$PartySeekingView$1$1 extends qc.r implements pc.l<x, w> {
    final /* synthetic */ n3.a<Member> $pageData;
    final /* synthetic */ k0 $scope;
    final /* synthetic */ PartySeekingViewModel $viewModel;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PartySeekingFragment.kt */
    /* renamed from: com.habitrpg.android.habitica.ui.fragments.social.party.PartySeekingFragmentKt$PartySeekingView$1$1$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends qc.r implements pc.q<x.d, j0.l, Integer, w> {
        final /* synthetic */ n3.a<Member> $pageData;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(n3.a<Member> aVar) {
            super(3);
            this.$pageData = aVar;
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
            if (j0.n.K()) {
                j0.n.V(-1411780584, i10, -1, "com.habitrpg.android.habitica.ui.fragments.social.party.PartySeekingView.<anonymous>.<anonymous>.<anonymous> (PartySeekingFragment.kt:211)");
            }
            b.a aVar = v0.b.f24258a;
            b.InterfaceC0571b f10 = aVar.f();
            e.a aVar2 = androidx.compose.ui.e.f2335a;
            androidx.compose.ui.e m10 = androidx.compose.foundation.layout.j.m(androidx.compose.foundation.layout.m.h(aVar2, 0.0f, 1, null), 0.0f, j2.h.j(36), 0.0f, j2.h.j(14), 5, null);
            n3.a<Member> aVar3 = this.$pageData;
            lVar.e(-483455358);
            i0 a10 = w.h.a(w.a.f25135a.f(), f10, lVar, 48);
            lVar.e(-1323940314);
            int a11 = j0.j.a(lVar, 0);
            v F = lVar.F();
            g.a aVar4 = p1.g.f20790l;
            pc.a<p1.g> a12 = aVar4.a();
            pc.q<i2<p1.g>, j0.l, Integer, w> a13 = n1.x.a(m10);
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
            l3.b(a14, a10, aVar4.e());
            l3.b(a14, F, aVar4.g());
            pc.p<p1.g, Integer, w> b10 = aVar4.b();
            if (a14.n() || !qc.q.d(a14.f(), Integer.valueOf(a11))) {
                a14.J(Integer.valueOf(a11));
                a14.I(Integer.valueOf(a11), b10);
            }
            a13.invoke(i2.a(i2.b(lVar)), lVar, 0);
            lVar.e(2058660585);
            w.k kVar = w.k.f25176a;
            String a15 = s1.h.a(R.string.find_more_members, lVar, 6);
            HabiticaTheme habiticaTheme = HabiticaTheme.INSTANCE;
            int i11 = HabiticaTheme.$stable;
            long m134getTextPrimary0d7_KjU = habiticaTheme.getColors(lVar, i11).m134getTextPrimary0d7_KjU();
            long g10 = j2.t.g(16);
            c0.a aVar5 = c0.f239m;
            f2.b(a15, androidx.compose.foundation.layout.j.m(aVar2, 0.0f, 0.0f, 0.0f, j2.h.j(4), 7, null), m134getTextPrimary0d7_KjU, g10, null, aVar5.d(), null, 0L, null, null, 0L, 0, false, 0, 0, null, null, lVar, 199728, 0, 131024);
            if (aVar3.g() == 0 && (aVar3.i().d() instanceof q0.c) && (aVar3.i().a() instanceof q0.c)) {
                lVar.e(355394919);
                String a16 = s1.h.a(R.string.habiticans_looking_party_empty, lVar, 6);
                int a17 = g2.j.f16057b.a();
                f2.b(a16, kVar.b(androidx.compose.foundation.layout.m.s(aVar2, j2.h.j(320)), aVar.f()), habiticaTheme.getColors(lVar, i11).m136getTextSecondary0d7_KjU(), 0L, null, null, null, 0L, null, g2.j.g(a17), 0L, 0, false, 0, 0, null, new v1.k0(0L, j2.t.g(16), aVar5.e(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, null, 0L, null, null, null, null, null, null, 16777209, null), lVar, 0, 1572864, 65016);
                u.a(s1.f.d(R.drawable.looking_for_party_empty, lVar, 6), null, androidx.compose.foundation.layout.j.m(aVar2, 0.0f, j2.h.j(50), 0.0f, 0.0f, 13, null), null, null, 0.0f, null, lVar, 440, 120);
                lVar.N();
            } else {
                lVar.e(355395733);
                String a18 = s1.h.a(R.string.habiticans_looking_party, lVar, 6);
                int a19 = g2.j.f16057b.a();
                f2.b(a18, kVar.b(androidx.compose.foundation.layout.m.s(aVar2, j2.h.j(320)), aVar.f()), habiticaTheme.getColors(lVar, i11).m136getTextSecondary0d7_KjU(), 0L, null, null, null, 0L, null, g2.j.g(a19), 0L, 0, false, 0, 0, null, new v1.k0(0L, j2.t.g(16), aVar5.e(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, null, 0L, null, null, null, null, null, null, 16777209, null), lVar, 0, 1572864, 65016);
                lVar.N();
            }
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
    /* compiled from: PartySeekingFragment.kt */
    /* renamed from: com.habitrpg.android.habitica.ui.fragments.social.party.PartySeekingFragmentKt$PartySeekingView$1$1$2  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass2 extends qc.r implements pc.r<x.d, Integer, j0.l, Integer, w> {
        final /* synthetic */ n3.a<Member> $pageData;
        final /* synthetic */ k0 $scope;
        final /* synthetic */ PartySeekingViewModel $viewModel;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: PartySeekingFragment.kt */
        /* renamed from: com.habitrpg.android.habitica.ui.fragments.social.party.PartySeekingFragmentKt$PartySeekingView$1$1$2$1  reason: invalid class name */
        /* loaded from: classes4.dex */
        public static final class AnonymousClass1 extends qc.r implements pc.l<Member, w> {
            final /* synthetic */ k0 $scope;
            final /* synthetic */ PartySeekingViewModel $viewModel;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: PartySeekingFragment.kt */
            /* renamed from: com.habitrpg.android.habitica.ui.fragments.social.party.PartySeekingFragmentKt$PartySeekingView$1$1$2$1$1  reason: invalid class name and collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C02921 extends qc.r implements pc.l<Throwable, w> {
                final /* synthetic */ Member $member;
                final /* synthetic */ PartySeekingViewModel $viewModel;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C02921(PartySeekingViewModel partySeekingViewModel, Member member) {
                    super(1);
                    this.$viewModel = partySeekingViewModel;
                    this.$member = member;
                }

                @Override // pc.l
                public /* bridge */ /* synthetic */ w invoke(Throwable th) {
                    invoke2(th);
                    return w.f13270a;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2(Throwable th) {
                    qc.q.i(th, "it");
                    this.$viewModel.getInviteStates().put(this.$member.getId(), new dc.l<>(Boolean.FALSE, LoadingButtonState.FAILED));
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: PartySeekingFragment.kt */
            @kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.fragments.social.party.PartySeekingFragmentKt$PartySeekingView$1$1$2$1$2", f = "PartySeekingFragment.kt", l = {270, 270, 273}, m = "invokeSuspend")
            /* renamed from: com.habitrpg.android.habitica.ui.fragments.social.party.PartySeekingFragmentKt$PartySeekingView$1$1$2$1$2  reason: invalid class name and collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C02932 extends kotlin.coroutines.jvm.internal.l implements pc.p<k0, Continuation<? super w>, Object> {
                final /* synthetic */ Member $member;
                final /* synthetic */ PartySeekingViewModel $viewModel;
                int I$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C02932(PartySeekingViewModel partySeekingViewModel, Member member, Continuation<? super C02932> continuation) {
                    super(2, continuation);
                    this.$viewModel = partySeekingViewModel;
                    this.$member = member;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Continuation<w> create(Object obj, Continuation<?> continuation) {
                    return new C02932(this.$viewModel, this.$member, continuation);
                }

                @Override // pc.p
                public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
                    return ((C02932) create(k0Var, continuation)).invokeSuspend(w.f13270a);
                }

                /* JADX WARN: Removed duplicated region for block: B:34:0x00c8  */
                /* JADX WARN: Type inference failed for: r1v3 */
                /* JADX WARN: Type inference failed for: r1v4, types: [boolean, int] */
                /* JADX WARN: Type inference failed for: r1v5 */
                @Override // kotlin.coroutines.jvm.internal.a
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r11) {
                    /*
                        Method dump skipped, instructions count: 246
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.fragments.social.party.PartySeekingFragmentKt$PartySeekingView$1$1.AnonymousClass2.AnonymousClass1.C02932.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(k0 k0Var, PartySeekingViewModel partySeekingViewModel) {
                super(1);
                this.$scope = k0Var;
                this.$viewModel = partySeekingViewModel;
            }

            @Override // pc.l
            public /* bridge */ /* synthetic */ w invoke(Member member) {
                invoke2(member);
                return w.f13270a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Member member) {
                qc.q.i(member, "member");
                ExceptionHandlerKt.launchCatching(this.$scope, new C02921(this.$viewModel, member), new C02932(this.$viewModel, member, null));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(n3.a<Member> aVar, PartySeekingViewModel partySeekingViewModel, k0 k0Var) {
            super(4);
            this.$pageData = aVar;
            this.$viewModel = partySeekingViewModel;
            this.$scope = k0Var;
        }

        @Override // pc.r
        public /* bridge */ /* synthetic */ w invoke(x.d dVar, Integer num, j0.l lVar, Integer num2) {
            invoke(dVar, num.intValue(), lVar, num2.intValue());
            return w.f13270a;
        }

        public final void invoke(x.d dVar, int i10, j0.l lVar, int i11) {
            int i12;
            LoadingButtonState loadingButtonState;
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
                j0.n.V(-2087338207, i12, -1, "com.habitrpg.android.habitica.ui.fragments.social.party.PartySeekingView.<anonymous>.<anonymous>.<anonymous> (PartySeekingFragment.kt:255)");
            }
            Member f10 = this.$pageData.f(i10);
            if (f10 == null) {
                if (j0.n.K()) {
                    j0.n.U();
                    return;
                }
                return;
            }
            dc.l<Boolean, LoadingButtonState> lVar2 = this.$viewModel.getInviteStates().get(f10.getId());
            if (lVar2 == null || (loadingButtonState = lVar2.d()) == null) {
                loadingButtonState = LoadingButtonState.CONTENT;
            }
            dc.l<Boolean, LoadingButtonState> lVar3 = this.$viewModel.getInviteStates().get(f10.getId());
            PartySeekingListItemKt.PartySeekingListItem(f10, androidx.compose.foundation.layout.j.k(x.c.a(dVar, androidx.compose.ui.e.f2335a, null, 1, null), j2.h.j(14), 0.0f, 2, null), loadingButtonState, lVar3 != null ? lVar3.c().booleanValue() : false, false, false, new AnonymousClass1(this.$scope, this.$viewModel), lVar, Member.$stable, 48);
            if (j0.n.K()) {
                j0.n.U();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PartySeekingFragmentKt$PartySeekingView$1$1(n3.a<Member> aVar, PartySeekingViewModel partySeekingViewModel, k0 k0Var) {
        super(1);
        this.$pageData = aVar;
        this.$viewModel = partySeekingViewModel;
        this.$scope = k0Var;
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ w invoke(x xVar) {
        invoke2(xVar);
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(x xVar) {
        qc.q.i(xVar, "$this$LazyColumn");
        x.w.a(xVar, null, null, q0.c.c(-1411780584, true, new AnonymousClass1(this.$pageData)), 3, null);
        x.w.b(xVar, this.$pageData.g(), null, null, q0.c.c(-2087338207, true, new AnonymousClass2(this.$pageData, this.$viewModel, this.$scope)), 6, null);
        q0 d10 = this.$pageData.i().d();
        if (!(d10 instanceof q0.a) && (d10 instanceof q0.b)) {
            x.w.a(xVar, null, null, ComposableSingletons$PartySeekingFragmentKt.INSTANCE.m108getLambda5$Habitica_2311256681_prodRelease(), 3, null);
        }
        q0 a10 = this.$pageData.i().a();
        if ((a10 instanceof q0.a) || !(a10 instanceof q0.b)) {
            return;
        }
        x.w.a(xVar, null, null, ComposableSingletons$PartySeekingFragmentKt.INSTANCE.m109getLambda6$Habitica_2311256681_prodRelease(), 3, null);
    }
}
