package com.habitrpg.android.habitica.ui.views.tasks.form;

import dc.w;
import j0.j1;
import qc.q;
import qc.r;

/* compiled from: TaskFormSelector.kt */
/* loaded from: classes4.dex */
final class TaskFormSelectorKt$TaskFormSelectorPreview$1$1 extends r implements pc.l<String, w> {
    final /* synthetic */ j1<String> $selected;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaskFormSelectorKt$TaskFormSelectorPreview$1$1(j1<String> j1Var) {
        super(1);
        this.$selected = j1Var;
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ w invoke(String str) {
        invoke2(str);
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        q.i(str, "it");
        this.$selected.setValue(str);
    }
}
