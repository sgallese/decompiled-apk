package com.habitrpg.android.habitica.helpers;

import dc.w;
import qc.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AdHandler.kt */
/* loaded from: classes4.dex */
public final class AdHandler$show$1 extends r implements pc.a<w> {
    final /* synthetic */ AdHandler this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdHandler$show$1(AdHandler adHandler) {
        super(0);
        this.this$0 = adHandler;
    }

    @Override // pc.a
    public /* bridge */ /* synthetic */ w invoke() {
        invoke2();
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.this$0.showRewardedAd();
    }
}
