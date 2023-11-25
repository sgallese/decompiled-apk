package com.habitrpg.android.habitica.ui.viewmodels;

import ad.k0;
import com.habitrpg.android.habitica.api.MaintenanceApiService;
import com.habitrpg.shared.habitica.models.responses.MaintenanceResponse;
import dc.n;
import dc.w;
import ic.d;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import pc.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MainActivityViewModel.kt */
@f(c = "com.habitrpg.android.habitica.ui.viewmodels.MainActivityViewModel$ifNeedsMaintenance$1", f = "MainActivityViewModel.kt", l = {159}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class MainActivityViewModel$ifNeedsMaintenance$1 extends l implements p<k0, Continuation<? super w>, Object> {
    final /* synthetic */ pc.l<MaintenanceResponse, w> $onResult;
    int label;
    final /* synthetic */ MainActivityViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MainActivityViewModel$ifNeedsMaintenance$1(MainActivityViewModel mainActivityViewModel, pc.l<? super MaintenanceResponse, w> lVar, Continuation<? super MainActivityViewModel$ifNeedsMaintenance$1> continuation) {
        super(2, continuation);
        this.this$0 = mainActivityViewModel;
        this.$onResult = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new MainActivityViewModel$ifNeedsMaintenance$1(this.this$0, this.$onResult, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((MainActivityViewModel$ifNeedsMaintenance$1) create(k0Var, continuation)).invokeSuspend(w.f13270a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d10;
        Boolean bool;
        d10 = d.d();
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            n.b(obj);
            MaintenanceApiService maintenanceService = this.this$0.getMaintenanceService();
            this.label = 1;
            obj = maintenanceService.getMaintenanceStatus(this);
            if (obj == d10) {
                return d10;
            }
        }
        MaintenanceResponse maintenanceResponse = (MaintenanceResponse) obj;
        if (maintenanceResponse != null) {
            bool = maintenanceResponse.getActiveMaintenance();
        } else {
            bool = null;
        }
        if (bool == null) {
            return w.f13270a;
        }
        this.$onResult.invoke(maintenanceResponse);
        return w.f13270a;
    }
}
