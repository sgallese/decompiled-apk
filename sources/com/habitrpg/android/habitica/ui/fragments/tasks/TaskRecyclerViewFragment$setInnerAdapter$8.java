package com.habitrpg.android.habitica.ui.fragments.tasks;

import com.habitrpg.android.habitica.R;
import com.habitrpg.common.habitica.helpers.MainNavigationController;
import dc.w;
import pc.l;
import qc.r;

/* compiled from: TaskRecyclerViewFragment.kt */
/* loaded from: classes4.dex */
final class TaskRecyclerViewFragment$setInnerAdapter$8 extends r implements l<Boolean, w> {
    public static final TaskRecyclerViewFragment$setInnerAdapter$8 INSTANCE = new TaskRecyclerViewFragment$setInnerAdapter$8();

    TaskRecyclerViewFragment$setInnerAdapter$8() {
        super(1);
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ w invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return w.f13270a;
    }

    public final void invoke(boolean z10) {
        MainNavigationController.navigate$default(MainNavigationController.INSTANCE, R.id.adventureGuideActivity, null, 2, null);
    }
}
