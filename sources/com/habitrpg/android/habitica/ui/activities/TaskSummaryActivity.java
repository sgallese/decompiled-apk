package com.habitrpg.android.habitica.ui.activities;

import android.os.Bundle;

/* compiled from: TaskSummaryActivity.kt */
/* loaded from: classes4.dex */
public final class TaskSummaryActivity extends Hilt_TaskSummaryActivity {
    public static final int $stable = 8;
    private final dc.f viewModel$delegate = new androidx.lifecycle.x0(qc.g0.b(TaskSummaryViewModel.class), new TaskSummaryActivity$special$$inlined$viewModels$default$2(this), new TaskSummaryActivity$special$$inlined$viewModels$default$1(this), new TaskSummaryActivity$special$$inlined$viewModels$default$3(null, this));

    /* JADX INFO: Access modifiers changed from: private */
    public final TaskSummaryViewModel getViewModel() {
        return (TaskSummaryViewModel) this.viewModel$delegate.getValue();
    }

    @Override // com.habitrpg.android.habitica.ui.activities.BaseActivity
    protected Integer getLayoutResId() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.habitrpg.android.habitica.ui.activities.BaseActivity, androidx.fragment.app.q, androidx.activity.ComponentActivity, androidx.core.app.h, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        d.b.b(this, null, q0.c.c(985813763, true, new TaskSummaryActivity$onCreate$1(this)), 1, null);
    }
}
