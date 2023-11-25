package com.habitrpg.android.habitica.ui.activities;

/* compiled from: TaskSummaryActivity.kt */
/* loaded from: classes4.dex */
final class TaskSummaryActivityKt$TaskSummaryView$1$1 extends qc.r implements pc.l<j0.f0, j0.e0> {
    final /* synthetic */ long $lightestColor;
    final /* synthetic */ long $statusBarColor;
    final /* synthetic */ d6.d $systemUiController;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaskSummaryActivityKt$TaskSummaryView$1$1(d6.d dVar, long j10, long j11) {
        super(1);
        this.$systemUiController = dVar;
        this.$statusBarColor = j10;
        this.$lightestColor = j11;
    }

    @Override // pc.l
    public final j0.e0 invoke(j0.f0 f0Var) {
        qc.q.i(f0Var, "$this$DisposableEffect");
        d6.c.b(this.$systemUiController, this.$statusBarColor, true, null, 4, null);
        d6.c.a(this.$systemUiController, this.$lightestColor, false, false, null, 14, null);
        return new j0.e0() { // from class: com.habitrpg.android.habitica.ui.activities.TaskSummaryActivityKt$TaskSummaryView$1$1$invoke$$inlined$onDispose$1
            @Override // j0.e0
            public void dispose() {
            }
        };
    }
}
