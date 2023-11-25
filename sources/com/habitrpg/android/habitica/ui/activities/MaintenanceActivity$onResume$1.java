package com.habitrpg.android.habitica.ui.activities;

import com.habitrpg.android.habitica.api.MaintenanceApiService;
import com.habitrpg.shared.habitica.models.responses.MaintenanceResponse;
import kotlin.coroutines.Continuation;

/* compiled from: MaintenanceActivity.kt */
@kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.activities.MaintenanceActivity$onResume$1", f = "MaintenanceActivity.kt", l = {66}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class MaintenanceActivity$onResume$1 extends kotlin.coroutines.jvm.internal.l implements pc.p<ad.k0, Continuation<? super dc.w>, Object> {
    int label;
    final /* synthetic */ MaintenanceActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MaintenanceActivity$onResume$1(MaintenanceActivity maintenanceActivity, Continuation<? super MaintenanceActivity$onResume$1> continuation) {
        super(2, continuation);
        this.this$0 = maintenanceActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
        return new MaintenanceActivity$onResume$1(this.this$0, continuation);
    }

    @Override // pc.p
    public final Object invoke(ad.k0 k0Var, Continuation<? super dc.w> continuation) {
        return ((MaintenanceActivity$onResume$1) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d10;
        d10 = ic.d.d();
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                dc.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            dc.n.b(obj);
            MaintenanceApiService maintenanceService = this.this$0.getMaintenanceService();
            this.label = 1;
            obj = maintenanceService.getMaintenanceStatus(this);
            if (obj == d10) {
                return d10;
            }
        }
        MaintenanceResponse maintenanceResponse = (MaintenanceResponse) obj;
        boolean z10 = false;
        if (maintenanceResponse != null) {
            z10 = qc.q.d(maintenanceResponse.getActiveMaintenance(), kotlin.coroutines.jvm.internal.b.a(false));
        }
        if (z10) {
            this.this$0.finish();
        }
        return dc.w.f13270a;
    }
}
