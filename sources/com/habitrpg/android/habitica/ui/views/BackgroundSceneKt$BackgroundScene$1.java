package com.habitrpg.android.habitica.ui.views;

import a1.f0;
import a1.l0;
import a1.n4;
import a1.o0;
import a1.t3;
import a1.v4;
import android.graphics.Bitmap;
import android.graphics.Paint;
import dc.w;
import qc.q;
import qc.r;

/* compiled from: BackgroundScene.kt */
/* loaded from: classes4.dex */
final class BackgroundSceneKt$BackgroundScene$1 extends r implements pc.l<c1.f, w> {
    final /* synthetic */ t3 $image;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackgroundSceneKt$BackgroundScene$1(t3 t3Var) {
        super(1);
        this.$image = t3Var;
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ w invoke(c1.f fVar) {
        invoke2(fVar);
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(c1.f fVar) {
        q.i(fVar, "$this$Canvas");
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(l0.b(this.$image), fVar.K0(j2.h.j(this.$image.getWidth())), fVar.K0(j2.h.j(124)), false);
        q.h(createScaledBitmap, "createScaledBitmap(...)");
        Paint l10 = o0.a().l();
        l10.setAntiAlias(true);
        t3 c10 = l0.c(createScaledBitmap);
        v4.a aVar = v4.f208a;
        l10.setShader(n4.a(c10, aVar.d(), aVar.d()));
        f0.c(fVar.y0().d()).drawPaint(l10);
        l10.reset();
    }
}
