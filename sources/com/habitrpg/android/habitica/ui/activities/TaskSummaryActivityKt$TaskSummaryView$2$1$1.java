package com.habitrpg.android.habitica.ui.activities;

import android.app.Activity;
import com.habitrpg.common.habitica.helpers.MainNavigationController;

/* compiled from: TaskSummaryActivity.kt */
/* loaded from: classes4.dex */
final class TaskSummaryActivityKt$TaskSummaryView$2$1$1 extends qc.r implements pc.a<dc.w> {
    final /* synthetic */ Activity $activity;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaskSummaryActivityKt$TaskSummaryView$2$1$1(Activity activity) {
        super(0);
        this.$activity = activity;
    }

    @Override // pc.a
    public /* bridge */ /* synthetic */ dc.w invoke() {
        invoke2();
        return dc.w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        Activity activity = this.$activity;
        if (activity != null) {
            activity.finish();
        } else {
            MainNavigationController.INSTANCE.navigateBack();
        }
    }
}
