package com.habitrpg.android.habitica.ui.views.tasks;

import com.habitrpg.android.habitica.models.Assignable;
import dc.w;
import pc.l;
import qc.r;

/* compiled from: AssignedView.kt */
/* loaded from: classes4.dex */
final class AssignedViewKt$AssignedView$1$2$1$1 extends r implements pc.a<w> {
    final /* synthetic */ Assignable $assignable;
    final /* synthetic */ l<String, w> $onUndoClick;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AssignedViewKt$AssignedView$1$2$1$1(Assignable assignable, l<? super String, w> lVar) {
        super(0);
        this.$assignable = assignable;
        this.$onUndoClick = lVar;
    }

    @Override // pc.a
    public /* bridge */ /* synthetic */ w invoke() {
        invoke2();
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        String id2 = this.$assignable.getId();
        if (id2 != null) {
            this.$onUndoClick.invoke(id2);
        }
    }
}
