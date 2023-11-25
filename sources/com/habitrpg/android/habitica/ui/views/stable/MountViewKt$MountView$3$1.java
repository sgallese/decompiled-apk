package com.habitrpg.android.habitica.ui.views.stable;

import dc.w;
import pc.l;
import qc.q;
import qc.r;

/* compiled from: MountView.kt */
/* loaded from: classes4.dex */
final class MountViewKt$MountView$3$1 extends r implements l<MountView, w> {
    final /* synthetic */ String $mountKey;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MountViewKt$MountView$3$1(String str) {
        super(1);
        this.$mountKey = str;
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ w invoke(MountView mountView) {
        invoke2(mountView);
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(MountView mountView) {
        q.i(mountView, "view");
        mountView.setMount(this.$mountKey);
    }
}
