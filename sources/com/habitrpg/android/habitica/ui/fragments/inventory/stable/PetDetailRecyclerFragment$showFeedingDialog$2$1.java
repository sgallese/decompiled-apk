package com.habitrpg.android.habitica.ui.fragments.inventory.stable;

import com.habitrpg.shared.habitica.models.responses.FeedResponse;
import dc.m;
import dc.w;
import kotlin.coroutines.Continuation;
import pc.l;
import qc.r;

/* compiled from: PetDetailRecyclerFragment.kt */
/* loaded from: classes4.dex */
final class PetDetailRecyclerFragment$showFeedingDialog$2$1 extends r implements l<FeedResponse, w> {
    final /* synthetic */ Continuation<FeedResponse> $cont;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PetDetailRecyclerFragment$showFeedingDialog$2$1(Continuation<? super FeedResponse> continuation) {
        super(1);
        this.$cont = continuation;
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ w invoke(FeedResponse feedResponse) {
        invoke2(feedResponse);
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(FeedResponse feedResponse) {
        this.$cont.resumeWith(m.a(feedResponse));
    }
}
