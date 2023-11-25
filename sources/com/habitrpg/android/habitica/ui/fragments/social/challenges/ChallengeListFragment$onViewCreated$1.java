package com.habitrpg.android.habitica.ui.fragments.social.challenges;

import dc.w;
import qc.q;
import qc.r;

/* compiled from: ChallengeListFragment.kt */
/* loaded from: classes4.dex */
final class ChallengeListFragment$onViewCreated$1 extends r implements pc.l<String, w> {
    final /* synthetic */ ChallengeListFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengeListFragment$onViewCreated$1(ChallengeListFragment challengeListFragment) {
        super(1);
        this.this$0 = challengeListFragment;
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ w invoke(String str) {
        invoke2(str);
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        q.i(str, "it");
        this.this$0.openDetailFragment(str);
    }
}
