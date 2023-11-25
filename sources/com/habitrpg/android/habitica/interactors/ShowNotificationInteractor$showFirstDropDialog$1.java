package com.habitrpg.android.habitica.interactors;

import ad.k0;
import android.app.Activity;
import com.habitrpg.android.habitica.ui.views.dialogs.FirstDropDialog;
import com.habitrpg.common.habitica.models.notifications.FirstDropData;
import dc.n;
import dc.w;
import ic.d;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import pc.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ShowNotificationInteractor.kt */
@f(c = "com.habitrpg.android.habitica.interactors.ShowNotificationInteractor$showFirstDropDialog$1", f = "ShowNotificationInteractor.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class ShowNotificationInteractor$showFirstDropDialog$1 extends l implements p<k0, Continuation<? super w>, Object> {
    final /* synthetic */ FirstDropData $data;
    int label;
    final /* synthetic */ ShowNotificationInteractor this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShowNotificationInteractor$showFirstDropDialog$1(ShowNotificationInteractor showNotificationInteractor, FirstDropData firstDropData, Continuation<? super ShowNotificationInteractor$showFirstDropDialog$1> continuation) {
        super(2, continuation);
        this.this$0 = showNotificationInteractor;
        this.$data = firstDropData;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new ShowNotificationInteractor$showFirstDropDialog$1(this.this$0, this.$data, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((ShowNotificationInteractor$showFirstDropDialog$1) create(k0Var, continuation)).invokeSuspend(w.f13270a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Activity activity;
        d.d();
        if (this.label == 0) {
            n.b(obj);
            activity = this.this$0.activity;
            FirstDropDialog firstDropDialog = new FirstDropDialog(activity);
            String egg = this.$data.getEgg();
            String str = "";
            if (egg == null) {
                egg = "";
            }
            String hatchingPotion = this.$data.getHatchingPotion();
            if (hatchingPotion != null) {
                str = hatchingPotion;
            }
            firstDropDialog.configure(egg, str);
            firstDropDialog.enqueue();
            return w.f13270a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
