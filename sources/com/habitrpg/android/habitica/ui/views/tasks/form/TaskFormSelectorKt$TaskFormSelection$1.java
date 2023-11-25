package com.habitrpg.android.habitica.ui.views.tasks.form;

import dc.w;
import qc.r;

/* compiled from: TaskFormSelector.kt */
/* loaded from: classes4.dex */
final class TaskFormSelectorKt$TaskFormSelection$1 extends r implements pc.a<w> {
    final /* synthetic */ pc.l<V, w> $onSelect;
    final /* synthetic */ V $value;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TaskFormSelectorKt$TaskFormSelection$1(pc.l<? super V, w> lVar, V v10) {
        super(0);
        this.$onSelect = lVar;
        this.$value = v10;
    }

    @Override // pc.a
    public /* bridge */ /* synthetic */ w invoke() {
        invoke2();
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$onSelect.invoke(this.$value);
    }
}
