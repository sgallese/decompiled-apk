package com.habitrpg.android.habitica.ui.views;

import dc.w;
import qc.r;

/* compiled from: AppHeaderView.kt */
/* loaded from: classes4.dex */
final class AppHeaderViewKt$AppHeaderView$1$1$1$1 extends r implements pc.a<w> {
    final /* synthetic */ pc.a<w> $onAvatarClicked;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppHeaderViewKt$AppHeaderView$1$1$1$1(pc.a<w> aVar) {
        super(0);
        this.$onAvatarClicked = aVar;
    }

    @Override // pc.a
    public /* bridge */ /* synthetic */ w invoke() {
        invoke2();
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        pc.a<w> aVar = this.$onAvatarClicked;
        if (aVar != null) {
            aVar.invoke();
        }
    }
}
