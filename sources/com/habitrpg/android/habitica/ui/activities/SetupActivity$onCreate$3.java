package com.habitrpg.android.habitica.ui.activities;

import com.habitrpg.android.habitica.data.ApiClient;
import kotlin.coroutines.Continuation;

/* compiled from: SetupActivity.kt */
@kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.activities.SetupActivity$onCreate$3", f = "SetupActivity.kt", l = {98}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class SetupActivity$onCreate$3 extends kotlin.coroutines.jvm.internal.l implements pc.p<ad.k0, Continuation<? super dc.w>, Object> {
    final /* synthetic */ String $currentDeviceLanguage;
    int label;
    final /* synthetic */ SetupActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetupActivity$onCreate$3(SetupActivity setupActivity, String str, Continuation<? super SetupActivity$onCreate$3> continuation) {
        super(2, continuation);
        this.this$0 = setupActivity;
        this.$currentDeviceLanguage = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
        return new SetupActivity$onCreate$3(this.this$0, this.$currentDeviceLanguage, continuation);
    }

    @Override // pc.p
    public final Object invoke(ad.k0 k0Var, Continuation<? super dc.w> continuation) {
        return ((SetupActivity$onCreate$3) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
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
            ApiClient apiClient = this.this$0.getApiClient();
            String str = this.$currentDeviceLanguage;
            qc.q.h(str, "$currentDeviceLanguage");
            this.label = 1;
            if (apiClient.registrationLanguage(str, this) == d10) {
                return d10;
            }
        }
        return dc.w.f13270a;
    }
}
