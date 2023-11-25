package com.habitrpg.android.habitica.ui.views.tasks;

import a1.p1;
import j0.l;
import j0.n;
import pc.q;
import qc.r;
import s.d0;
import s.e0;
import s.e1;
import s.h1;
import s.k;

/* compiled from: AssignSheet.kt */
/* loaded from: classes4.dex */
final class AssignSheetKt$IsAssignedIndicator$borderColor$1 extends r implements q<e1.b<Boolean>, l, Integer, e0<p1>> {
    public static final AssignSheetKt$IsAssignedIndicator$borderColor$1 INSTANCE = new AssignSheetKt$IsAssignedIndicator$borderColor$1();

    AssignSheetKt$IsAssignedIndicator$borderColor$1() {
        super(3);
    }

    @Override // pc.q
    public /* bridge */ /* synthetic */ e0<p1> invoke(e1.b<Boolean> bVar, l lVar, Integer num) {
        return invoke(bVar, lVar, num.intValue());
    }

    public final e0<p1> invoke(e1.b<Boolean> bVar, l lVar, int i10) {
        qc.q.i(bVar, "$this$animateColor");
        lVar.e(1817197556);
        if (n.K()) {
            n.V(1817197556, i10, -1, "com.habitrpg.android.habitica.ui.views.tasks.IsAssignedIndicator.<anonymous> (AssignSheet.kt:134)");
        }
        h1 i11 = k.i(450, 0, d0.a(), 2, null);
        if (n.K()) {
            n.U();
        }
        lVar.N();
        return i11;
    }
}
