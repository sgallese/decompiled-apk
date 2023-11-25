package com.habitrpg.android.habitica.ui.views.stats;

import androidx.compose.foundation.layout.m;
import androidx.compose.ui.e;
import com.habitrpg.android.habitica.R;
import dc.w;
import f0.i;
import j0.l;
import j0.n;
import j2.h;
import pc.q;
import qc.r;
import r.j;

/* compiled from: StatsView.kt */
/* loaded from: classes4.dex */
final class StatsViewKt$StatsViewComposable$1$2$5 extends r implements q<j, l, Integer, w> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ pc.a<w> $allocateAction;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StatsViewKt$StatsViewComposable$1$2$5(pc.a<w> aVar, int i10) {
        super(3);
        this.$allocateAction = aVar;
        this.$$dirty = i10;
    }

    @Override // pc.q
    public /* bridge */ /* synthetic */ w invoke(j jVar, l lVar, Integer num) {
        invoke(jVar, lVar, num.intValue());
        return w.f13270a;
    }

    public final void invoke(j jVar, l lVar, int i10) {
        qc.q.i(jVar, "$this$AnimatedVisibility");
        if (n.K()) {
            n.V(987756357, i10, -1, "com.habitrpg.android.habitica.ui.views.stats.StatsViewComposable.<anonymous>.<anonymous>.<anonymous> (StatsView.kt:98)");
        }
        i.d(this.$allocateAction, androidx.compose.foundation.c.d(m.d(m.s(e.f2335a, h.j(48)), 0.0f, 1, null), s1.c.a(R.color.offset_background_30, lVar, 6), null, 2, null), false, null, null, null, null, null, null, ComposableSingletons$StatsViewKt.INSTANCE.m177getLambda1$Habitica_2311256681_prodRelease(), lVar, ((this.$$dirty >> 21) & 14) | 805306368, 508);
        if (n.K()) {
            n.U();
        }
    }
}
