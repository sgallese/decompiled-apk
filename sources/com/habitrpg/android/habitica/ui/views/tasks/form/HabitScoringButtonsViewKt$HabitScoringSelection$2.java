package com.habitrpg.android.habitica.ui.views.tasks.form;

import dc.w;
import j0.z1;
import pc.p;
import qc.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: HabitScoringButtonsView.kt */
/* loaded from: classes4.dex */
public final class HabitScoringButtonsViewKt$HabitScoringSelection$2 extends r implements p<j0.l, Integer, w> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ d1.c $icon;
    final /* synthetic */ androidx.compose.ui.e $modifier;
    final /* synthetic */ pc.a<w> $onSelect;
    final /* synthetic */ boolean $selected;
    final /* synthetic */ String $text;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HabitScoringButtonsViewKt$HabitScoringSelection$2(boolean z10, d1.c cVar, String str, pc.a<w> aVar, androidx.compose.ui.e eVar, int i10, int i11) {
        super(2);
        this.$selected = z10;
        this.$icon = cVar;
        this.$text = str;
        this.$onSelect = aVar;
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
        HabitScoringButtonsViewKt.HabitScoringSelection(this.$selected, this.$icon, this.$text, this.$onSelect, this.$modifier, lVar, z1.a(this.$$changed | 1), this.$$default);
    }
}
