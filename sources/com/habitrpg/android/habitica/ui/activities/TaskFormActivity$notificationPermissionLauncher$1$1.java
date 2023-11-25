package com.habitrpg.android.habitica.ui.activities;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.habitrpg.android.habitica.ui.views.dialogs.HabiticaAlertDialog;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TaskFormActivity.kt */
/* loaded from: classes4.dex */
public final class TaskFormActivity$notificationPermissionLauncher$1$1 extends qc.r implements pc.p<HabiticaAlertDialog, Integer, dc.w> {
    final /* synthetic */ TaskFormActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaskFormActivity$notificationPermissionLauncher$1$1(TaskFormActivity taskFormActivity) {
        super(2);
        this.this$0 = taskFormActivity;
    }

    @Override // pc.p
    public /* bridge */ /* synthetic */ dc.w invoke(HabiticaAlertDialog habiticaAlertDialog, Integer num) {
        invoke(habiticaAlertDialog, num.intValue());
        return dc.w.f13270a;
    }

    public final void invoke(HabiticaAlertDialog habiticaAlertDialog, int i10) {
        qc.q.i(habiticaAlertDialog, "<anonymous parameter 0>");
        if (Build.VERSION.SDK_INT >= 26) {
            Intent addFlags = new Intent("android.settings.APP_NOTIFICATION_SETTINGS").addFlags(268435456);
            Context applicationContext = this.this$0.getApplicationContext();
            Intent putExtra = addFlags.putExtra("android.provider.extra.APP_PACKAGE", applicationContext != null ? applicationContext.getPackageName() : null);
            qc.q.f(putExtra);
            this.this$0.startActivity(putExtra);
        }
    }
}
