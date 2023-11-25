package com.habitrpg.android.habitica.ui.views.tasks.form;

import com.habitrpg.android.habitica.ui.theme.HabiticaTheme;
import dc.w;
import f0.s0;
import j0.n;
import pc.q;
import qc.r;

/* compiled from: TaskFormSelector.kt */
/* loaded from: classes4.dex */
final class TaskFormSelectorKt$TaskFormSelection$2$1 extends r implements q<r.j, j0.l, Integer, w> {
    final /* synthetic */ w.d $this_Box;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaskFormSelectorKt$TaskFormSelection$2$1(w.d dVar) {
        super(3);
        this.$this_Box = dVar;
    }

    @Override // pc.q
    public /* bridge */ /* synthetic */ w invoke(r.j jVar, j0.l lVar, Integer num) {
        invoke(jVar, lVar, num.intValue());
        return w.f13270a;
    }

    public final void invoke(r.j jVar, j0.l lVar, int i10) {
        qc.q.i(jVar, "$this$AnimatedVisibility");
        if (n.K()) {
            n.V(1454015224, i10, -1, "com.habitrpg.android.habitica.ui.views.tasks.form.TaskFormSelection.<anonymous>.<anonymous> (TaskFormSelector.kt:101)");
        }
        androidx.compose.foundation.layout.d.a(this.$this_Box.a(androidx.compose.foundation.c.c(androidx.compose.ui.e.f2335a, HabiticaTheme.INSTANCE.getColors(lVar, 6).m139getTintedUiMain0d7_KjU(), s0.f15068a.b(lVar, s0.f15069b).b())), lVar, 0);
        if (n.K()) {
            n.U();
        }
    }
}
