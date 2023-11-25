package com.habitrpg.android.habitica.helpers;

import dc.w;
import qc.r;

/* compiled from: AdHandler.kt */
/* loaded from: classes4.dex */
final class AdHandler$Companion$whenAdsInitialized$1 extends r implements pc.a<w> {
    final /* synthetic */ pc.a<w> $onComplete;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdHandler$Companion$whenAdsInitialized$1(pc.a<w> aVar) {
        super(0);
        this.$onComplete = aVar;
    }

    @Override // pc.a
    public /* bridge */ /* synthetic */ w invoke() {
        invoke2();
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$onComplete.invoke();
    }
}
