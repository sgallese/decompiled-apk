package com.habitrpg.android.habitica.ui.fragments;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ReportBottomSheetFragment.kt */
/* loaded from: classes4.dex */
public final class ReportBottomSheetFragment$reportMessage$1$1 extends qc.r implements pc.l<Throwable, dc.w> {
    final /* synthetic */ ReportBottomSheetFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReportBottomSheetFragment$reportMessage$1$1(ReportBottomSheetFragment reportBottomSheetFragment) {
        super(1);
        this.this$0 = reportBottomSheetFragment;
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ dc.w invoke(Throwable th) {
        invoke2(th);
        return dc.w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable th) {
        qc.q.i(th, "it");
        this.this$0.isReporting = false;
    }
}
