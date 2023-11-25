package com.habitrpg.android.habitica.ui.activities;

import a2.c0;
import com.habitrpg.android.habitica.models.tasks.Task;
import j0.g3;
import java.util.Iterator;
import java.util.List;
import v1.d;

/* compiled from: TaskSummaryActivity.kt */
/* loaded from: classes4.dex */
public final class TaskSummaryActivityKt {
    /* JADX WARN: Removed duplicated region for block: B:102:0x05da  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x076c  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0791  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x089e  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x04bb  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x053a  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x053f  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0544  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x05be  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x05cf  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x05d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void TaskSummaryView(com.habitrpg.android.habitica.ui.activities.TaskSummaryViewModel r48, j0.l r49, int r50) {
        /*
            Method dump skipped, instructions count: 2833
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.activities.TaskSummaryActivityKt.TaskSummaryView(com.habitrpg.android.habitica.ui.activities.TaskSummaryViewModel, j0.l, int):void");
    }

    private static final Task TaskSummaryView$lambda$0(g3<? extends Task> g3Var) {
        return g3Var.getValue();
    }

    private static final v1.d makeBoldComposable(String str) {
        List x02;
        a2.c0 e10;
        int i10 = 0;
        d.a aVar = new d.a(i10, 1, null);
        x02 = yc.w.x0(str, new String[]{"**"}, false, 0, 6, null);
        Iterator it = x02.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            long j10 = 0;
            long j11 = 0;
            c0.a aVar2 = a2.c0.f239m;
            if (i10 != 0) {
                e10 = aVar2.f();
            } else {
                e10 = aVar2.e();
            }
            Iterator it2 = it;
            int k10 = aVar.k(new v1.b0(j10, j11, e10, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65531, null));
            try {
                aVar.f(str2);
                dc.w wVar = dc.w.f13270a;
                aVar.j(k10);
                i10 ^= 1;
                it = it2;
            } catch (Throwable th) {
                aVar.j(k10);
                throw th;
            }
        }
        return aVar.l();
    }
}
