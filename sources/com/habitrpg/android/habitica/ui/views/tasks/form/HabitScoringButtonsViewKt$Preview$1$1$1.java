package com.habitrpg.android.habitica.ui.views.tasks.form;

import dc.w;
import j0.j1;
import qc.r;

/* compiled from: HabitScoringButtonsView.kt */
/* loaded from: classes4.dex */
final class HabitScoringButtonsViewKt$Preview$1$1$1 extends r implements pc.a<w> {
    final /* synthetic */ j1<Boolean> $selectedUp;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HabitScoringButtonsViewKt$Preview$1$1$1(j1<Boolean> j1Var) {
        super(0);
        this.$selectedUp = j1Var;
    }

    @Override // pc.a
    public /* bridge */ /* synthetic */ w invoke() {
        invoke2();
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$selectedUp.setValue(Boolean.valueOf(!r0.getValue().booleanValue()));
    }
}
