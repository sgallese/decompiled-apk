package com.habitrpg.android.habitica.interactors;

import ad.k0;
import android.app.Activity;
import android.view.View;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.ui.views.dialogs.HabiticaAlertDialog;
import dc.n;
import dc.w;
import ic.d;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import pc.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ShowNotificationInteractor.kt */
@f(c = "com.habitrpg.android.habitica.interactors.ShowNotificationInteractor$showCheckinDialog$1", f = "ShowNotificationInteractor.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class ShowNotificationInteractor$showCheckinDialog$1 extends l implements p<k0, Continuation<? super w>, Object> {
    final /* synthetic */ String $title;
    final /* synthetic */ View $view;
    int label;
    final /* synthetic */ ShowNotificationInteractor this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShowNotificationInteractor$showCheckinDialog$1(ShowNotificationInteractor showNotificationInteractor, View view, String str, Continuation<? super ShowNotificationInteractor$showCheckinDialog$1> continuation) {
        super(2, continuation);
        this.this$0 = showNotificationInteractor;
        this.$view = view;
        this.$title = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new ShowNotificationInteractor$showCheckinDialog$1(this.this$0, this.$view, this.$title, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((ShowNotificationInteractor$showCheckinDialog$1) create(k0Var, continuation)).invokeSuspend(w.f13270a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Activity activity;
        Activity activity2;
        d.d();
        if (this.label == 0) {
            n.b(obj);
            activity = this.this$0.activity;
            if (!activity.isFinishing()) {
                activity2 = this.this$0.activity;
                HabiticaAlertDialog habiticaAlertDialog = new HabiticaAlertDialog(activity2);
                habiticaAlertDialog.setAdditionalContentView(this.$view);
                habiticaAlertDialog.setTitle(this.$title);
                HabiticaAlertDialog.addButton$default(habiticaAlertDialog, (int) R.string.see_you_tomorrow, true, false, false, (p) null, 28, (Object) null);
                habiticaAlertDialog.show();
                return w.f13270a;
            }
            return w.f13270a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
