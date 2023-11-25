package com.habitrpg.android.habitica.ui.views;

import dc.w;
import qc.r;

/* compiled from: LoadingButton.kt */
/* loaded from: classes4.dex */
final class LoadingButtonKt$LoadingButton$1$1 extends r implements pc.a<w> {
    final /* synthetic */ pc.a<w> $onClick;
    final /* synthetic */ LoadingButtonState $state;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoadingButtonKt$LoadingButton$1$1(LoadingButtonState loadingButtonState, pc.a<w> aVar) {
        super(0);
        this.$state = loadingButtonState;
        this.$onClick = aVar;
    }

    @Override // pc.a
    public /* bridge */ /* synthetic */ w invoke() {
        invoke2();
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        LoadingButtonState loadingButtonState = this.$state;
        if (loadingButtonState == LoadingButtonState.CONTENT || loadingButtonState == LoadingButtonState.FAILED) {
            this.$onClick.invoke();
        }
    }
}
