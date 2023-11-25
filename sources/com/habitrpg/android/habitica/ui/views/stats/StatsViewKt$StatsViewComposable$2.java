package com.habitrpg.android.habitica.ui.views.stats;

import dc.w;
import j0.l;
import j0.z1;
import pc.p;
import qc.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: StatsView.kt */
/* loaded from: classes4.dex */
public final class StatsViewKt$StatsViewComposable$2 extends r implements p<l, Integer, w> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ pc.a<w> $allocateAction;
    final /* synthetic */ int $allocatedValue;
    final /* synthetic */ int $buffValue;
    final /* synthetic */ boolean $canAllocate;
    final /* synthetic */ int $equipmentValue;
    final /* synthetic */ int $levelValue;
    final /* synthetic */ long $statColor;
    final /* synthetic */ String $statText;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StatsViewKt$StatsViewComposable$2(String str, long j10, int i10, int i11, int i12, int i13, boolean z10, pc.a<w> aVar, int i14) {
        super(2);
        this.$statText = str;
        this.$statColor = j10;
        this.$levelValue = i10;
        this.$equipmentValue = i11;
        this.$buffValue = i12;
        this.$allocatedValue = i13;
        this.$canAllocate = z10;
        this.$allocateAction = aVar;
        this.$$changed = i14;
    }

    @Override // pc.p
    public /* bridge */ /* synthetic */ w invoke(l lVar, Integer num) {
        invoke(lVar, num.intValue());
        return w.f13270a;
    }

    public final void invoke(l lVar, int i10) {
        StatsViewKt.m178StatsViewComposableoC9nPe0(this.$statText, this.$statColor, this.$levelValue, this.$equipmentValue, this.$buffValue, this.$allocatedValue, this.$canAllocate, this.$allocateAction, lVar, z1.a(this.$$changed | 1));
    }
}
