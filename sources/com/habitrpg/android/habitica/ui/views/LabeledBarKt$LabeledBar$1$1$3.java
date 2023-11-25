package com.habitrpg.android.habitica.ui.views;

import a1.l0;
import android.graphics.Bitmap;
import dc.w;
import j0.n;
import pc.q;
import qc.r;
import t.u;

/* compiled from: LabeledBar.kt */
/* loaded from: classes4.dex */
final class LabeledBarKt$LabeledBar$1$1$3 extends r implements q<r.j, j0.l, Integer, w> {
    final /* synthetic */ Bitmap $it;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LabeledBarKt$LabeledBar$1$1$3(Bitmap bitmap) {
        super(3);
        this.$it = bitmap;
    }

    @Override // pc.q
    public /* bridge */ /* synthetic */ w invoke(r.j jVar, j0.l lVar, Integer num) {
        invoke(jVar, lVar, num.intValue());
        return w.f13270a;
    }

    public final void invoke(r.j jVar, j0.l lVar, int i10) {
        qc.q.i(jVar, "$this$AnimatedVisibility");
        if (n.K()) {
            n.V(1984037585, i10, -1, "com.habitrpg.android.habitica.ui.views.LabeledBar.<anonymous>.<anonymous>.<anonymous> (LabeledBar.kt:96)");
        }
        u.b(l0.c(this.$it), null, androidx.compose.ui.e.f2335a, null, null, 0.0f, null, 0, lVar, 440, 248);
        if (n.K()) {
            n.U();
        }
    }
}
