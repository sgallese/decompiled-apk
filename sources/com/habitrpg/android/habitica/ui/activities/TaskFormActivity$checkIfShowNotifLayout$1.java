package com.habitrpg.android.habitica.ui.activities;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TaskFormActivity.kt */
/* loaded from: classes4.dex */
public final class TaskFormActivity$checkIfShowNotifLayout$1 extends qc.r implements pc.l<Boolean, dc.w> {
    final /* synthetic */ TaskFormActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaskFormActivity$checkIfShowNotifLayout$1(TaskFormActivity taskFormActivity) {
        super(1);
        this.this$0 = taskFormActivity;
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ dc.w invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return dc.w.f13270a;
    }

    public final void invoke(boolean z10) {
        androidx.activity.result.b bVar;
        if (z10) {
            bVar = this.this$0.notificationPermissionLauncher;
            bVar.a("android.permission.POST_NOTIFICATIONS");
        }
    }
}
