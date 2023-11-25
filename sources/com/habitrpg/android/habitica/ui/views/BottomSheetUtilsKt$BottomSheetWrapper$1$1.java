package com.habitrpg.android.habitica.ui.views;

import a1.p1;
import j0.e0;
import j0.f0;
import qc.q;
import qc.r;

/* compiled from: BottomSheetUtils.kt */
/* loaded from: classes4.dex */
final class BottomSheetUtilsKt$BottomSheetWrapper$1$1 extends r implements pc.l<f0, e0> {
    final /* synthetic */ long $statusBarColor;
    final /* synthetic */ d6.d $systemUiController;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomSheetUtilsKt$BottomSheetWrapper$1$1(d6.d dVar, long j10) {
        super(1);
        this.$systemUiController = dVar;
        this.$statusBarColor = j10;
    }

    @Override // pc.l
    public final e0 invoke(f0 f0Var) {
        q.i(f0Var, "$this$DisposableEffect");
        d6.c.b(this.$systemUiController, p1.o(this.$statusBarColor, 0.3f, 0.0f, 0.0f, 0.0f, 14, null), true, null, 4, null);
        return new e0() { // from class: com.habitrpg.android.habitica.ui.views.BottomSheetUtilsKt$BottomSheetWrapper$1$1$invoke$$inlined$onDispose$1
            @Override // j0.e0
            public void dispose() {
            }
        };
    }
}
