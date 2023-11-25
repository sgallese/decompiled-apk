package com.habitrpg.android.habitica.ui.views.tasks.form;

import dc.w;
import j0.z1;
import pc.p;
import qc.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: HabitScoringButtonsView.kt */
/* loaded from: classes4.dex */
public final class HabitScoringButtonsViewKt$HabitScoringSelector$2 extends r implements p<j0.l, Integer, w> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ androidx.compose.ui.e $modifier;
    final /* synthetic */ pc.a<w> $onSelectDown;
    final /* synthetic */ pc.a<w> $onSelectUp;
    final /* synthetic */ boolean $selectedDown;
    final /* synthetic */ boolean $selectedUp;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HabitScoringButtonsViewKt$HabitScoringSelector$2(boolean z10, boolean z11, pc.a<w> aVar, pc.a<w> aVar2, androidx.compose.ui.e eVar, int i10, int i11) {
        super(2);
        this.$selectedUp = z10;
        this.$selectedDown = z11;
        this.$onSelectUp = aVar;
        this.$onSelectDown = aVar2;
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
        HabitScoringButtonsViewKt.HabitScoringSelector(this.$selectedUp, this.$selectedDown, this.$onSelectUp, this.$onSelectDown, this.$modifier, lVar, z1.a(this.$$changed | 1), this.$$default);
    }
}
