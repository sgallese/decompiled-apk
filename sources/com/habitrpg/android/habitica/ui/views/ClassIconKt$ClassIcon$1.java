package com.habitrpg.android.habitica.ui.views;

import dc.w;
import j0.z1;
import pc.p;
import qc.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ClassIcon.kt */
/* loaded from: classes4.dex */
public final class ClassIconKt$ClassIcon$1 extends r implements p<j0.l, Integer, w> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ String $className;
    final /* synthetic */ boolean $hasClass;
    final /* synthetic */ androidx.compose.ui.e $modifier;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClassIconKt$ClassIcon$1(String str, boolean z10, androidx.compose.ui.e eVar, int i10, int i11) {
        super(2);
        this.$className = str;
        this.$hasClass = z10;
        this.$modifier = eVar;
        this.$$changed = i10;
        this.$$default = i11;
    }

    @Override // pc.p
    public /* bridge */ /* synthetic */ w invoke(j0.l lVar, Integer num) {
        invoke(lVar, num.intValue());
        return w.f13270a;
    }

    public final void invoke(j0.l lVar, int i10) {
        ClassIconKt.ClassIcon(this.$className, this.$hasClass, this.$modifier, lVar, z1.a(this.$$changed | 1), this.$$default);
    }
}
