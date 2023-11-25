package com.habitrpg.android.habitica.ui.views;

import dc.w;
import j0.n;
import pc.p;
import qc.r;

/* compiled from: HabiticaButton.kt */
/* loaded from: classes4.dex */
final class HabiticaButtonKt$HabiticaButton$2$1 extends r implements p<j0.l, Integer, w> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ p<j0.l, Integer, w> $content;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HabiticaButtonKt$HabiticaButton$2$1(p<? super j0.l, ? super Integer, w> pVar, int i10) {
        super(2);
        this.$content = pVar;
        this.$$dirty = i10;
    }

    @Override // pc.p
    public /* bridge */ /* synthetic */ w invoke(j0.l lVar, Integer num) {
        invoke(lVar, num.intValue());
        return w.f13270a;
    }

    public final void invoke(j0.l lVar, int i10) {
        if ((i10 & 11) == 2 && lVar.t()) {
            lVar.z();
            return;
        }
        if (n.K()) {
            n.V(-1858182320, i10, -1, "com.habitrpg.android.habitica.ui.views.HabiticaButton.<anonymous>.<anonymous> (HabiticaButton.kt:45)");
        }
        this.$content.invoke(lVar, Integer.valueOf((this.$$dirty >> 18) & 14));
        if (n.K()) {
            n.U();
        }
    }
}
