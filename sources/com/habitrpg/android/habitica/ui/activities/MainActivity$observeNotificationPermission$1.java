package com.habitrpg.android.habitica.ui.activities;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MainActivity.kt */
/* loaded from: classes4.dex */
public final class MainActivity$observeNotificationPermission$1 extends qc.r implements pc.l<Boolean, dc.w> {
    final /* synthetic */ MainActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainActivity$observeNotificationPermission$1(MainActivity mainActivity) {
        super(1);
        this.this$0 = mainActivity;
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ dc.w invoke(Boolean bool) {
        invoke2(bool);
        return dc.w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Boolean bool) {
        androidx.activity.result.b bVar;
        qc.q.f(bool);
        if (bool.booleanValue()) {
            bVar = this.this$0.notificationPermissionLauncher;
            bVar.a("android.permission.POST_NOTIFICATIONS");
            this.this$0.getViewModel().getRequestNotificationPermission().p(Boolean.FALSE);
        }
    }
}
