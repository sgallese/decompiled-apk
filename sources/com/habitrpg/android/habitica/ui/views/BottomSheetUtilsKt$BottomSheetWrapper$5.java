package com.habitrpg.android.habitica.ui.views;

import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import dc.w;
import j0.z1;
import pc.p;
import pc.q;
import qc.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BottomSheetUtils.kt */
/* loaded from: classes4.dex */
public final class BottomSheetUtilsKt$BottomSheetWrapper$5 extends r implements p<j0.l, Integer, w> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ ComposeView $composeView;
    final /* synthetic */ q<pc.a<w>, j0.l, Integer, w> $content;
    final /* synthetic */ ViewGroup $parent;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BottomSheetUtilsKt$BottomSheetWrapper$5(ViewGroup viewGroup, ComposeView composeView, q<? super pc.a<w>, ? super j0.l, ? super Integer, w> qVar, int i10) {
        super(2);
        this.$parent = viewGroup;
        this.$composeView = composeView;
        this.$content = qVar;
        this.$$changed = i10;
    }

    @Override // pc.p
    public /* bridge */ /* synthetic */ w invoke(j0.l lVar, Integer num) {
        invoke(lVar, num.intValue());
        return w.f13270a;
    }

    public final void invoke(j0.l lVar, int i10) {
        BottomSheetUtilsKt.BottomSheetWrapper(this.$parent, this.$composeView, this.$content, lVar, z1.a(this.$$changed | 1));
    }
}
