package com.habitrpg.android.habitica.ui.views;

import dc.w;
import j0.z1;
import java.util.List;
import pc.p;
import qc.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SegmentedControl.kt */
/* loaded from: classes4.dex */
public final class SegmentedControlKt$SegmentedControl$2 extends r implements p<j0.l, Integer, w> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ int $cornerRadius;
    final /* synthetic */ int $defaultSelectedItemIndex;
    final /* synthetic */ float $itemWidth;
    final /* synthetic */ List<String> $items;
    final /* synthetic */ pc.l<Integer, w> $onItemSelection;
    final /* synthetic */ boolean $useFixedWidth;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SegmentedControlKt$SegmentedControl$2(List<String> list, int i10, boolean z10, float f10, int i11, pc.l<? super Integer, w> lVar, int i12, int i13) {
        super(2);
        this.$items = list;
        this.$defaultSelectedItemIndex = i10;
        this.$useFixedWidth = z10;
        this.$itemWidth = f10;
        this.$cornerRadius = i11;
        this.$onItemSelection = lVar;
        this.$$changed = i12;
        this.$$default = i13;
    }

    @Override // pc.p
    public /* bridge */ /* synthetic */ w invoke(j0.l lVar, Integer num) {
        invoke(lVar, num.intValue());
        return w.f13270a;
    }

    public final void invoke(j0.l lVar, int i10) {
        SegmentedControlKt.m165SegmentedControljIwJxvA(this.$items, this.$defaultSelectedItemIndex, this.$useFixedWidth, this.$itemWidth, this.$cornerRadius, this.$onItemSelection, lVar, z1.a(this.$$changed | 1), this.$$default);
    }
}
