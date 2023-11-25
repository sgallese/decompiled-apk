package com.habitrpg.android.habitica.ui.views;

import dc.w;
import j0.j1;
import qc.r;

/* compiled from: SegmentedControl.kt */
/* loaded from: classes4.dex */
final class SegmentedControlKt$SegmentedControl$1$1$1$1 extends r implements pc.a<w> {
    final /* synthetic */ int $index;
    final /* synthetic */ pc.l<Integer, w> $onItemSelection;
    final /* synthetic */ j1<Integer> $selectedIndex;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SegmentedControlKt$SegmentedControl$1$1$1$1(j1<Integer> j1Var, int i10, pc.l<? super Integer, w> lVar) {
        super(0);
        this.$selectedIndex = j1Var;
        this.$index = i10;
        this.$onItemSelection = lVar;
    }

    @Override // pc.a
    public /* bridge */ /* synthetic */ w invoke() {
        invoke2();
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$selectedIndex.setValue(Integer.valueOf(this.$index));
        this.$onItemSelection.invoke(this.$selectedIndex.getValue());
    }
}
