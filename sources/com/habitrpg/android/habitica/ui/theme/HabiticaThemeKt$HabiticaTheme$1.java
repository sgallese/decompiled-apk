package com.habitrpg.android.habitica.ui.theme;

import dc.w;
import j0.l;
import j0.z1;
import pc.p;
import qc.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: HabiticaTheme.kt */
/* loaded from: classes4.dex */
public final class HabiticaThemeKt$HabiticaTheme$1 extends r implements p<l, Integer, w> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ p<l, Integer, w> $content;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HabiticaThemeKt$HabiticaTheme$1(p<? super l, ? super Integer, w> pVar, int i10) {
        super(2);
        this.$content = pVar;
        this.$$changed = i10;
    }

    @Override // pc.p
    public /* bridge */ /* synthetic */ w invoke(l lVar, Integer num) {
        invoke(lVar, num.intValue());
        return w.f13270a;
    }

    public final void invoke(l lVar, int i10) {
        HabiticaThemeKt.HabiticaTheme(this.$content, lVar, z1.a(this.$$changed | 1));
    }
}
