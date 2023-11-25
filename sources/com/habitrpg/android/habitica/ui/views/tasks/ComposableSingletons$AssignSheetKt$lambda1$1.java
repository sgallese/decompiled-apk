package com.habitrpg.android.habitica.ui.views.tasks;

import com.habitrpg.android.habitica.R;
import dc.w;
import f0.f2;
import j0.l;
import j0.n;
import pc.q;
import qc.r;
import w.a0;

/* compiled from: AssignSheet.kt */
/* renamed from: com.habitrpg.android.habitica.ui.views.tasks.ComposableSingletons$AssignSheetKt$lambda-1$1  reason: invalid class name */
/* loaded from: classes4.dex */
final class ComposableSingletons$AssignSheetKt$lambda1$1 extends r implements q<a0, l, Integer, w> {
    public static final ComposableSingletons$AssignSheetKt$lambda1$1 INSTANCE = new ComposableSingletons$AssignSheetKt$lambda1$1();

    ComposableSingletons$AssignSheetKt$lambda1$1() {
        super(3);
    }

    @Override // pc.q
    public /* bridge */ /* synthetic */ w invoke(a0 a0Var, l lVar, Integer num) {
        invoke(a0Var, lVar, num.intValue());
        return w.f13270a;
    }

    public final void invoke(a0 a0Var, l lVar, int i10) {
        qc.q.i(a0Var, "$this$TextButton");
        if ((i10 & 81) == 16 && lVar.t()) {
            lVar.z();
            return;
        }
        if (n.K()) {
            n.V(1962157083, i10, -1, "com.habitrpg.android.habitica.ui.views.tasks.ComposableSingletons$AssignSheetKt.lambda-1.<anonymous> (AssignSheet.kt:68)");
        }
        f2.b(s1.h.a(R.string.done, lVar, 6), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, lVar, 0, 0, 131070);
        if (n.K()) {
            n.U();
        }
    }
}
