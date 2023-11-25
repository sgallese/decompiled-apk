package com.habitrpg.android.habitica.ui.fragments.purchases;

import dc.w;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GiftBalanceGemsFragment.kt */
/* loaded from: classes4.dex */
public final class GiftBalanceGemsFragment$sendGift$1$1 extends qc.r implements pc.l<Throwable, w> {
    final /* synthetic */ GiftBalanceGemsFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GiftBalanceGemsFragment$sendGift$1$1(GiftBalanceGemsFragment giftBalanceGemsFragment) {
        super(1);
        this.this$0 = giftBalanceGemsFragment;
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ w invoke(Throwable th) {
        invoke2(th);
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable th) {
        qc.q.i(th, "it");
        this.this$0.setGifting(false);
    }
}
