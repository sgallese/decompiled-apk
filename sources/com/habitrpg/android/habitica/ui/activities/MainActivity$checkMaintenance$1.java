package com.habitrpg.android.habitica.ui.activities;

import android.content.Intent;
import android.content.pm.PackageManager;
import com.habitrpg.common.habitica.helpers.ExceptionHandler;
import com.habitrpg.shared.habitica.models.responses.MaintenanceResponse;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MainActivity.kt */
/* loaded from: classes4.dex */
public final class MainActivity$checkMaintenance$1 extends qc.r implements pc.l<MaintenanceResponse, dc.w> {
    final /* synthetic */ MainActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainActivity$checkMaintenance$1(MainActivity mainActivity) {
        super(1);
        this.this$0 = mainActivity;
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ dc.w invoke(MaintenanceResponse maintenanceResponse) {
        invoke2(maintenanceResponse);
        return dc.w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(MaintenanceResponse maintenanceResponse) {
        Intent createMaintenanceIntent;
        Intent createMaintenanceIntent2;
        qc.q.i(maintenanceResponse, "maintenanceResponse");
        if (qc.q.d(maintenanceResponse.getActiveMaintenance(), Boolean.TRUE)) {
            createMaintenanceIntent2 = this.this$0.createMaintenanceIntent(maintenanceResponse, false);
            this.this$0.startActivity(createMaintenanceIntent2);
        } else if (maintenanceResponse.getMinBuild() != null) {
            try {
                int i10 = this.this$0.getPackageManager().getPackageInfo(this.this$0.getPackageName(), 0).versionCode;
                Integer minBuild = maintenanceResponse.getMinBuild();
                if (i10 < (minBuild != null ? minBuild.intValue() : 0)) {
                    createMaintenanceIntent = this.this$0.createMaintenanceIntent(maintenanceResponse, true);
                    this.this$0.startActivity(createMaintenanceIntent);
                }
            } catch (PackageManager.NameNotFoundException e10) {
                ExceptionHandler.Companion.reportError(e10);
            }
        }
    }
}
