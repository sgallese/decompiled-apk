package com.habitrpg.android.habitica.ui.fragments.social.party;

import com.habitrpg.android.habitica.ui.theme.HabiticaThemeKt;
import com.habitrpg.common.habitica.helpers.MainNavigationController;
import dc.w;

/* compiled from: PartyInviteFragment.kt */
/* loaded from: classes4.dex */
final class PartyInviteFragment$onCreateView$1 extends qc.r implements pc.p<j0.l, Integer, w> {
    final /* synthetic */ PartyInviteFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PartyInviteFragment.kt */
    /* renamed from: com.habitrpg.android.habitica.ui.fragments.social.party.PartyInviteFragment$onCreateView$1$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends qc.r implements pc.p<j0.l, Integer, w> {
        final /* synthetic */ PartyInviteFragment this$0;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: PartyInviteFragment.kt */
        /* renamed from: com.habitrpg.android.habitica.ui.fragments.social.party.PartyInviteFragment$onCreateView$1$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C02881 extends qc.r implements pc.a<w> {
            public static final C02881 INSTANCE = new C02881();

            C02881() {
                super(0);
            }

            @Override // pc.a
            public /* bridge */ /* synthetic */ w invoke() {
                invoke2();
                return w.f13270a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                MainNavigationController.INSTANCE.navigateBack();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(PartyInviteFragment partyInviteFragment) {
            super(2);
            this.this$0 = partyInviteFragment;
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
                j0.n.V(982152172, i10, -1, "com.habitrpg.android.habitica.ui.fragments.social.party.PartyInviteFragment.onCreateView.<anonymous>.<anonymous> (PartyInviteFragment.kt:132)");
            }
            PartyInviteFragmentKt.PartyInviteView(this.this$0.getViewModel(), C02881.INSTANCE, lVar, 56);
            if (j0.n.K()) {
                j0.n.U();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PartyInviteFragment$onCreateView$1(PartyInviteFragment partyInviteFragment) {
        super(2);
        this.this$0 = partyInviteFragment;
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
            j0.n.V(67614305, i10, -1, "com.habitrpg.android.habitica.ui.fragments.social.party.PartyInviteFragment.onCreateView.<anonymous> (PartyInviteFragment.kt:131)");
        }
        HabiticaThemeKt.HabiticaTheme(q0.c.b(lVar, 982152172, true, new AnonymousClass1(this.this$0)), lVar, 6);
        if (j0.n.K()) {
            j0.n.U();
        }
    }
}
