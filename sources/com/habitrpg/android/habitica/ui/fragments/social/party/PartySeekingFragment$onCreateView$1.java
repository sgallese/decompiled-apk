package com.habitrpg.android.habitica.ui.fragments.social.party;

import com.habitrpg.android.habitica.ui.theme.HabiticaThemeKt;
import dc.w;

/* compiled from: PartySeekingFragment.kt */
/* loaded from: classes4.dex */
final class PartySeekingFragment$onCreateView$1 extends qc.r implements pc.p<j0.l, Integer, w> {
    final /* synthetic */ PartySeekingFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PartySeekingFragment.kt */
    /* renamed from: com.habitrpg.android.habitica.ui.fragments.social.party.PartySeekingFragment$onCreateView$1$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends qc.r implements pc.p<j0.l, Integer, w> {
        final /* synthetic */ PartySeekingFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(PartySeekingFragment partySeekingFragment) {
            super(2);
            this.this$0 = partySeekingFragment;
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
                j0.n.V(1922525260, i10, -1, "com.habitrpg.android.habitica.ui.fragments.social.party.PartySeekingFragment.onCreateView.<anonymous>.<anonymous> (PartySeekingFragment.kt:135)");
            }
            PartySeekingFragmentKt.PartySeekingView(this.this$0.getViewModel(), null, lVar, 8, 2);
            if (j0.n.K()) {
                j0.n.U();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PartySeekingFragment$onCreateView$1(PartySeekingFragment partySeekingFragment) {
        super(2);
        this.this$0 = partySeekingFragment;
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
            j0.n.V(-775036543, i10, -1, "com.habitrpg.android.habitica.ui.fragments.social.party.PartySeekingFragment.onCreateView.<anonymous> (PartySeekingFragment.kt:134)");
        }
        HabiticaThemeKt.HabiticaTheme(q0.c.b(lVar, 1922525260, true, new AnonymousClass1(this.this$0)), lVar, 6);
        if (j0.n.K()) {
            j0.n.U();
        }
    }
}
