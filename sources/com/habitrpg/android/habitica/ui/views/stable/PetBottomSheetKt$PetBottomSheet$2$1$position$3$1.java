package com.habitrpg.android.habitica.ui.views.stable;

import dc.w;
import pc.l;
import qc.q;
import qc.r;
import s.d0;
import s.o0;

/* compiled from: PetBottomSheet.kt */
/* loaded from: classes4.dex */
final class PetBottomSheetKt$PetBottomSheet$2$1$position$3$1 extends r implements l<o0.b<Float>, w> {
    final /* synthetic */ float $highJump;
    final /* synthetic */ float $lowJump;
    final /* synthetic */ float $regularPosition;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PetBottomSheetKt$PetBottomSheet$2$1$position$3$1(float f10, float f11, float f12) {
        super(1);
        this.$regularPosition = f10;
        this.$highJump = f11;
        this.$lowJump = f12;
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ w invoke(o0.b<Float> bVar) {
        invoke2(bVar);
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(o0.b<Float> bVar) {
        q.i(bVar, "$this$keyframes");
        bVar.e(6000);
        bVar.f(bVar.a(Float.valueOf(this.$regularPosition), 0), d0.d());
        bVar.f(bVar.a(Float.valueOf(this.$highJump), 150), d0.d());
        bVar.f(bVar.a(Float.valueOf(this.$regularPosition), 300), d0.b());
        bVar.f(bVar.a(Float.valueOf(this.$regularPosition), 1800), d0.b());
        bVar.f(bVar.a(Float.valueOf(this.$lowJump), 1850), d0.d());
        bVar.f(bVar.a(Float.valueOf(this.$regularPosition), 1900), d0.d());
        bVar.f(bVar.a(Float.valueOf(this.$regularPosition), 2100), d0.b());
        bVar.f(bVar.a(Float.valueOf(this.$lowJump), 2200), d0.d());
        bVar.f(bVar.a(Float.valueOf(this.$regularPosition), 2350), d0.d());
        bVar.a(Float.valueOf(this.$regularPosition), 6000);
    }
}
