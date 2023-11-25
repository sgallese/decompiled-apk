package com.habitrpg.android.habitica.ui.views.navigation;

import com.habitrpg.shared.habitica.models.tasks.TaskType;
import dc.w;
import qc.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: HabiticaBottomNavigationView.kt */
/* loaded from: classes4.dex */
public final class HabiticaBottomNavigationView$showSubmenu$1 extends r implements pc.a<w> {
    final /* synthetic */ TaskType $taskType;
    final /* synthetic */ HabiticaBottomNavigationView this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HabiticaBottomNavigationView$showSubmenu$1(HabiticaBottomNavigationView habiticaBottomNavigationView, TaskType taskType) {
        super(0);
        this.this$0 = habiticaBottomNavigationView;
        this.$taskType = taskType;
    }

    @Override // pc.a
    public /* bridge */ /* synthetic */ w invoke() {
        invoke2();
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HabiticaBottomNavigationViewListener listener = this.this$0.getListener();
        if (listener != null) {
            listener.onAdd(this.$taskType);
        }
        this.this$0.hideSubmenu();
    }
}
