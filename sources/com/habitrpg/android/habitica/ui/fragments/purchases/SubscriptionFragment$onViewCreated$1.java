package com.habitrpg.android.habitica.ui.fragments.purchases;

import dc.w;

/* compiled from: SubscriptionFragment.kt */
/* loaded from: classes4.dex */
final class SubscriptionFragment$onViewCreated$1 extends qc.r implements pc.a<w> {
    final /* synthetic */ SubscriptionFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubscriptionFragment$onViewCreated$1(SubscriptionFragment subscriptionFragment) {
        super(0);
        this.this$0 = subscriptionFragment;
    }

    @Override // pc.a
    public /* bridge */ /* synthetic */ w invoke() {
        invoke2();
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.this$0.showSubscriptionOptions();
    }
}
