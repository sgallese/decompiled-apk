package com.habitrpg.android.habitica.ui.views;

import dc.w;
import j0.z1;
import pc.p;
import qc.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ClassText.kt */
/* loaded from: classes4.dex */
public final class ClassTextKt$ClassText$1 extends r implements p<j0.l, Integer, w> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ String $className;
    final /* synthetic */ long $fontSize;
    final /* synthetic */ boolean $hasClass;
    final /* synthetic */ j2.h $iconSize;
    final /* synthetic */ androidx.compose.ui.e $modifier;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClassTextKt$ClassText$1(String str, boolean z10, long j10, androidx.compose.ui.e eVar, j2.h hVar, int i10, int i11) {
        super(2);
        this.$className = str;
        this.$hasClass = z10;
        this.$fontSize = j10;
        this.$modifier = eVar;
        this.$iconSize = hVar;
        this.$$changed = i10;
        this.$$default = i11;
    }

    @Override // pc.p
    public /* bridge */ /* synthetic */ w invoke(j0.l lVar, Integer num) {
        invoke(lVar, num.intValue());
        return w.f13270a;
    }

    public final void invoke(j0.l lVar, int i10) {
        ClassTextKt.m147ClassTextVao21CM(this.$className, this.$hasClass, this.$fontSize, this.$modifier, this.$iconSize, lVar, z1.a(this.$$changed | 1), this.$$default);
    }
}
