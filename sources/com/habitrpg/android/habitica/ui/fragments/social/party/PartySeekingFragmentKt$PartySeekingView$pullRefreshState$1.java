package com.habitrpg.android.habitica.ui.fragments.social.party;

import com.habitrpg.android.habitica.models.members.Member;
import dc.w;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PartySeekingFragment.kt */
/* loaded from: classes4.dex */
public final class PartySeekingFragmentKt$PartySeekingView$pullRefreshState$1 extends qc.r implements pc.a<w> {
    final /* synthetic */ n3.a<Member> $pageData;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PartySeekingFragmentKt$PartySeekingView$pullRefreshState$1(n3.a<Member> aVar) {
        super(0);
        this.$pageData = aVar;
    }

    @Override // pc.a
    public /* bridge */ /* synthetic */ w invoke() {
        invoke2();
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$pageData.j();
    }
}
