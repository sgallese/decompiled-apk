package com.habitrpg.android.habitica.ui.views.stats;

import com.habitrpg.android.habitica.databinding.DialogBulkAllocateBinding;
import dc.w;
import pc.l;
import qc.q;
import qc.r;

/* compiled from: BulkAllocateStatsDialog.kt */
/* loaded from: classes4.dex */
final class BulkAllocateStatsDialog$onCreate$3 extends r implements l<Integer, w> {
    final /* synthetic */ BulkAllocateStatsDialog this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BulkAllocateStatsDialog$onCreate$3(BulkAllocateStatsDialog bulkAllocateStatsDialog) {
        super(1);
        this.this$0 = bulkAllocateStatsDialog;
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ w invoke(Integer num) {
        invoke(num.intValue());
        return w.f13270a;
    }

    public final void invoke(int i10) {
        DialogBulkAllocateBinding dialogBulkAllocateBinding;
        BulkAllocateStatsDialog bulkAllocateStatsDialog = this.this$0;
        dialogBulkAllocateBinding = bulkAllocateStatsDialog.binding;
        StatsSliderView statsSliderView = dialogBulkAllocateBinding.intelligenceSliderView;
        q.h(statsSliderView, "intelligenceSliderView");
        bulkAllocateStatsDialog.checkRedistribution(statsSliderView);
        this.this$0.updateTitle();
    }
}
