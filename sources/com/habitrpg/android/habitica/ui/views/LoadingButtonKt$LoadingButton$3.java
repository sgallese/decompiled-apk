package com.habitrpg.android.habitica.ui.views;

import a1.q4;
import dc.w;
import j0.z1;
import pc.p;
import pc.q;
import qc.r;
import w.a0;
import w.s;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LoadingButton.kt */
/* loaded from: classes4.dex */
public final class LoadingButtonKt$LoadingButton$3 extends r implements p<j0.l, Integer, w> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ int $$default;
    final /* synthetic */ t.g $border;
    final /* synthetic */ f0.f $colors;
    final /* synthetic */ q<a0, j0.l, Integer, w> $content;
    final /* synthetic */ s $contentPadding;
    final /* synthetic */ f0.h $elevation;
    final /* synthetic */ q<a0, j0.l, Integer, w> $failedContent;
    final /* synthetic */ androidx.compose.ui.e $modifier;
    final /* synthetic */ pc.a<w> $onClick;
    final /* synthetic */ q4 $shape;
    final /* synthetic */ LoadingButtonState $state;
    final /* synthetic */ q<a0, j0.l, Integer, w> $successContent;
    final /* synthetic */ LoadingButtonType $type;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LoadingButtonKt$LoadingButton$3(LoadingButtonState loadingButtonState, pc.a<w> aVar, androidx.compose.ui.e eVar, LoadingButtonType loadingButtonType, f0.h hVar, q4 q4Var, t.g gVar, f0.f fVar, s sVar, q<? super a0, ? super j0.l, ? super Integer, w> qVar, q<? super a0, ? super j0.l, ? super Integer, w> qVar2, q<? super a0, ? super j0.l, ? super Integer, w> qVar3, int i10, int i11, int i12) {
        super(2);
        this.$state = loadingButtonState;
        this.$onClick = aVar;
        this.$modifier = eVar;
        this.$type = loadingButtonType;
        this.$elevation = hVar;
        this.$shape = q4Var;
        this.$border = gVar;
        this.$colors = fVar;
        this.$contentPadding = sVar;
        this.$successContent = qVar;
        this.$failedContent = qVar2;
        this.$content = qVar3;
        this.$$changed = i10;
        this.$$changed1 = i11;
        this.$$default = i12;
    }

    @Override // pc.p
    public /* bridge */ /* synthetic */ w invoke(j0.l lVar, Integer num) {
        invoke(lVar, num.intValue());
        return w.f13270a;
    }

    public final void invoke(j0.l lVar, int i10) {
        LoadingButtonKt.LoadingButton(this.$state, this.$onClick, this.$modifier, this.$type, this.$elevation, this.$shape, this.$border, this.$colors, this.$contentPadding, this.$successContent, this.$failedContent, this.$content, lVar, z1.a(this.$$changed | 1), z1.a(this.$$changed1), this.$$default);
    }
}
