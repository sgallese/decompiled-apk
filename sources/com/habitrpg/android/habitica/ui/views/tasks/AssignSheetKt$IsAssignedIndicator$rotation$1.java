package com.habitrpg.android.habitica.ui.views.tasks;

import j0.l;
import j0.n;
import pc.q;
import qc.r;
import s.e0;
import s.e1;
import s.k;
import s.z0;

/* compiled from: AssignSheet.kt */
/* loaded from: classes4.dex */
final class AssignSheetKt$IsAssignedIndicator$rotation$1 extends r implements q<e1.b<Boolean>, l, Integer, e0<Float>> {
    public static final AssignSheetKt$IsAssignedIndicator$rotation$1 INSTANCE = new AssignSheetKt$IsAssignedIndicator$rotation$1();

    AssignSheetKt$IsAssignedIndicator$rotation$1() {
        super(3);
    }

    @Override // pc.q
    public /* bridge */ /* synthetic */ e0<Float> invoke(e1.b<Boolean> bVar, l lVar, Integer num) {
        return invoke(bVar, lVar, num.intValue());
    }

    public final e0<Float> invoke(e1.b<Boolean> bVar, l lVar, int i10) {
        qc.q.i(bVar, "$this$animateFloat");
        lVar.e(-1466604286);
        if (n.K()) {
            n.V(-1466604286, i10, -1, "com.habitrpg.android.habitica.ui.views.tasks.IsAssignedIndicator.<anonymous> (AssignSheet.kt:116)");
        }
        z0 g10 = k.g(0.75f, 400.0f, null, 4, null);
        if (n.K()) {
            n.U();
        }
        lVar.N();
        return g10;
    }
}
