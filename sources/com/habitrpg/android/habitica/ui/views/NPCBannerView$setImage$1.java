package com.habitrpg.android.habitica.ui.views;

import android.graphics.drawable.Drawable;
import com.habitrpg.android.habitica.databinding.NpcBannerBinding;
import dc.w;
import qc.q;
import qc.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NPCBannerView.kt */
/* loaded from: classes4.dex */
public final class NPCBannerView$setImage$1 extends r implements pc.l<Drawable, w> {
    final /* synthetic */ NPCBannerView this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NPCBannerView$setImage$1(NPCBannerView nPCBannerView) {
        super(1);
        this.this$0 = nPCBannerView;
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ w invoke(Drawable drawable) {
        invoke2(drawable);
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Drawable drawable) {
        NpcBannerBinding npcBannerBinding;
        q.i(drawable, "it");
        npcBannerBinding = this.this$0.binding;
        npcBannerBinding.sceneView.setImageDrawable(drawable);
    }
}
