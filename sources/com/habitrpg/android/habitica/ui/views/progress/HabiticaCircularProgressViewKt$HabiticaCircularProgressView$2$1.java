package com.habitrpg.android.habitica.ui.views.progress;

import a1.e1;
import a1.s4;
import a1.t4;
import c1.d;
import c1.e;
import c1.f;
import dc.w;
import j0.g3;
import pc.l;
import qc.q;
import qc.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: HabiticaCircularProgressView.kt */
/* loaded from: classes4.dex */
public final class HabiticaCircularProgressViewKt$HabiticaCircularProgressView$2$1 extends r implements l<f, w> {
    final /* synthetic */ long $backgroundColor;
    final /* synthetic */ e1 $brush;
    final /* synthetic */ float $partialDisplay;
    final /* synthetic */ g3<Float> $rotateAnimation;
    final /* synthetic */ float $strokeWidth;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HabiticaCircularProgressViewKt$HabiticaCircularProgressView$2$1(g3<Float> g3Var, float f10, long j10, float f11, e1 e1Var) {
        super(1);
        this.$rotateAnimation = g3Var;
        this.$partialDisplay = f10;
        this.$backgroundColor = j10;
        this.$strokeWidth = f11;
        this.$brush = e1Var;
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ w invoke(f fVar) {
        invoke2(fVar);
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(f fVar) {
        q.i(fVar, "$this$Canvas");
        float floatValue = this.$rotateAnimation.getValue().floatValue();
        e1 e1Var = this.$brush;
        float f10 = this.$strokeWidth;
        long O0 = fVar.O0();
        d y02 = fVar.y0();
        long b10 = y02.b();
        y02.d().k();
        y02.a().g(floatValue, O0);
        s4.a aVar = s4.f186b;
        e.e(fVar, e1Var, 0.0f, 0L, 0.0f, new c1.l(fVar.v0(f10), 0.0f, aVar.b(), 0, null, 26, null), null, 0, 110, null);
        y02.d().p();
        y02.c(b10);
        float f11 = this.$partialDisplay;
        if (f11 < 1.0f) {
            e.d(fVar, this.$backgroundColor, f11 * 360.0f, 360.0f - (f11 * 360.0f), true, 0L, 0L, 0.0f, new c1.l(fVar.v0(this.$strokeWidth) * 1.4f, 2.0f, aVar.c(), t4.f193b.b(), null, 16, null), null, 0, 880, null);
        }
    }
}
