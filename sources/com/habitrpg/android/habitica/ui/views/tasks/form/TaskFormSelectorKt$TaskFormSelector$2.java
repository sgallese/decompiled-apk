package com.habitrpg.android.habitica.ui.views.tasks.form;

import dc.w;
import j0.z1;
import java.util.List;
import pc.p;
import qc.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TaskFormSelector.kt */
/* loaded from: classes4.dex */
public final class TaskFormSelectorKt$TaskFormSelector$2 extends r implements p<j0.l, Integer, w> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ int $columnSize;
    final /* synthetic */ androidx.compose.ui.e $modifier;
    final /* synthetic */ pc.l<V, w> $onSelect;
    final /* synthetic */ V $selected;
    final /* synthetic */ float $spacing;
    final /* synthetic */ List<LabeledValue<V>> $values;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TaskFormSelectorKt$TaskFormSelector$2(V v10, List<LabeledValue<V>> list, pc.l<? super V, w> lVar, androidx.compose.ui.e eVar, int i10, float f10, int i11, int i12) {
        super(2);
        this.$selected = v10;
        this.$values = list;
        this.$onSelect = lVar;
        this.$modifier = eVar;
        this.$columnSize = i10;
        this.$spacing = f10;
        this.$$changed = i11;
        this.$$default = i12;
    }

    @Override // pc.p
    public /* bridge */ /* synthetic */ w invoke(j0.l lVar, Integer num) {
        invoke(lVar, num.intValue());
        return w.f13270a;
    }

    public final void invoke(j0.l lVar, int i10) {
        TaskFormSelectorKt.m183TaskFormSelectorHYR8e34(this.$selected, this.$values, this.$onSelect, this.$modifier, this.$columnSize, this.$spacing, lVar, z1.a(this.$$changed | 1), this.$$default);
    }
}
