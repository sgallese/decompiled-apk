package com.habitrpg.android.habitica.ui.views.tasks.form;

import dc.w;
import j0.z1;
import pc.p;
import qc.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TaskFormSelector.kt */
/* loaded from: classes4.dex */
public final class TaskFormSelectorKt$TaskFormSelection$3 extends r implements p<j0.l, Integer, w> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ androidx.compose.ui.e $modifier;
    final /* synthetic */ pc.l<V, w> $onSelect;
    final /* synthetic */ boolean $selected;
    final /* synthetic */ String $text;
    final /* synthetic */ V $value;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TaskFormSelectorKt$TaskFormSelection$3(V v10, boolean z10, String str, pc.l<? super V, w> lVar, androidx.compose.ui.e eVar, int i10, int i11) {
        super(2);
        this.$value = v10;
        this.$selected = z10;
        this.$text = str;
        this.$onSelect = lVar;
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
        TaskFormSelectorKt.TaskFormSelection(this.$value, this.$selected, this.$text, this.$onSelect, this.$modifier, lVar, z1.a(this.$$changed | 1), this.$$default);
    }
}
