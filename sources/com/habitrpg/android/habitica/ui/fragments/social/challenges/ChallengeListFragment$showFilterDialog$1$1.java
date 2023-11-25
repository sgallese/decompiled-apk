package com.habitrpg.android.habitica.ui.fragments.social.challenges;

import dc.w;
import qc.q;
import qc.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChallengeListFragment.kt */
/* loaded from: classes4.dex */
public final class ChallengeListFragment$showFilterDialog$1$1 extends r implements pc.l<ChallengeFilterOptions, w> {
    final /* synthetic */ ChallengeListFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengeListFragment$showFilterDialog$1$1(ChallengeListFragment challengeListFragment) {
        super(1);
        this.this$0 = challengeListFragment;
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ w invoke(ChallengeFilterOptions challengeFilterOptions) {
        invoke2(challengeFilterOptions);
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(ChallengeFilterOptions challengeFilterOptions) {
        q.i(challengeFilterOptions, "it");
        this.this$0.changeFilter(challengeFilterOptions);
    }
}
