package com.habitrpg.android.habitica.ui.views;

import a1.p1;
import a2.c0;
import dc.w;
import f0.f2;
import j0.j1;
import j0.n;
import pc.q;
import qc.r;
import w.a0;

/* compiled from: SegmentedControl.kt */
/* loaded from: classes4.dex */
final class SegmentedControlKt$SegmentedControl$1$1$2 extends r implements q<a0, j0.l, Integer, w> {
    final /* synthetic */ long $color;
    final /* synthetic */ int $index;
    final /* synthetic */ String $item;
    final /* synthetic */ j1<Integer> $selectedIndex;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SegmentedControlKt$SegmentedControl$1$1$2(j1<Integer> j1Var, int i10, long j10, String str) {
        super(3);
        this.$selectedIndex = j1Var;
        this.$index = i10;
        this.$color = j10;
        this.$item = str;
    }

    @Override // pc.q
    public /* bridge */ /* synthetic */ w invoke(a0 a0Var, j0.l lVar, Integer num) {
        invoke(a0Var, lVar, num.intValue());
        return w.f13270a;
    }

    public final void invoke(a0 a0Var, j0.l lVar, int i10) {
        long o10;
        qc.q.i(a0Var, "$this$OutlinedButton");
        if ((i10 & 81) == 16 && lVar.t()) {
            lVar.z();
            return;
        }
        if (n.K()) {
            n.V(621667459, i10, -1, "com.habitrpg.android.habitica.ui.views.SegmentedControl.<anonymous>.<anonymous>.<anonymous> (SegmentedControl.kt:129)");
        }
        c0 e10 = c0.f239m.e();
        if (this.$selectedIndex.getValue().intValue() == this.$index) {
            o10 = p1.f146b.f();
        } else {
            o10 = p1.o(this.$color, 0.9f, 0.0f, 0.0f, 0.0f, 14, null);
        }
        f2.b(this.$item, null, o10, 0L, null, e10, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, lVar, 196608, 0, 131034);
        if (n.K()) {
            n.U();
        }
    }
}
