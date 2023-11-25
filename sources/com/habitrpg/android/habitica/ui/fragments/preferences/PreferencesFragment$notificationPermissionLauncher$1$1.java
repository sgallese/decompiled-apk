package com.habitrpg.android.habitica.ui.fragments.preferences;

import android.content.Context;
import android.content.Intent;
import com.habitrpg.android.habitica.ui.views.dialogs.HabiticaAlertDialog;
import dc.w;
import pc.p;
import qc.q;
import qc.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PreferencesFragment.kt */
/* loaded from: classes4.dex */
public final class PreferencesFragment$notificationPermissionLauncher$1$1 extends r implements p<HabiticaAlertDialog, Integer, w> {
    final /* synthetic */ PreferencesFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreferencesFragment$notificationPermissionLauncher$1$1(PreferencesFragment preferencesFragment) {
        super(2);
        this.this$0 = preferencesFragment;
    }

    @Override // pc.p
    public /* bridge */ /* synthetic */ w invoke(HabiticaAlertDialog habiticaAlertDialog, Integer num) {
        invoke(habiticaAlertDialog, num.intValue());
        return w.f13270a;
    }

    public final void invoke(HabiticaAlertDialog habiticaAlertDialog, int i10) {
        Context applicationContext;
        q.i(habiticaAlertDialog, "<anonymous parameter 0>");
        Intent addFlags = new Intent("android.settings.APP_NOTIFICATION_SETTINGS").addFlags(268435456);
        Context context = this.this$0.getContext();
        Intent putExtra = addFlags.putExtra("android.provider.extra.APP_PACKAGE", (context == null || (applicationContext = context.getApplicationContext()) == null) ? null : applicationContext.getPackageName());
        q.h(putExtra, "putExtra(...)");
        this.this$0.startActivity(putExtra);
    }
}
