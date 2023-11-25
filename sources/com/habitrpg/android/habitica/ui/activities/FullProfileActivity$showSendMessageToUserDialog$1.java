package com.habitrpg.android.habitica.ui.activities;

import com.habitrpg.android.habitica.R;
import com.habitrpg.common.habitica.helpers.MainNavigationController;
import kotlin.coroutines.Continuation;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FullProfileActivity.kt */
@kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.activities.FullProfileActivity$showSendMessageToUserDialog$1", f = "FullProfileActivity.kt", l = {407}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class FullProfileActivity$showSendMessageToUserDialog$1 extends kotlin.coroutines.jvm.internal.l implements pc.p<ad.k0, Continuation<? super dc.w>, Object> {
    int label;
    final /* synthetic */ FullProfileActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FullProfileActivity$showSendMessageToUserDialog$1(FullProfileActivity fullProfileActivity, Continuation<? super FullProfileActivity$showSendMessageToUserDialog$1> continuation) {
        super(2, continuation);
        this.this$0 = fullProfileActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
        return new FullProfileActivity$showSendMessageToUserDialog$1(this.this$0, continuation);
    }

    @Override // pc.p
    public final Object invoke(ad.k0 k0Var, Continuation<? super dc.w> continuation) {
        return ((FullProfileActivity$showSendMessageToUserDialog$1) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d10;
        String str;
        String str2;
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
            this.label = 1;
            if (ad.u0.a(500L, this) == d10) {
                return d10;
            }
        }
        MainNavigationController mainNavigationController = MainNavigationController.INSTANCE;
        str = this.this$0.username;
        str2 = this.this$0.userID;
        mainNavigationController.navigate(R.id.inboxMessageListFragment, androidx.core.os.e.a(new dc.l("username", str), new dc.l("userID", str2)));
        return dc.w.f13270a;
    }
}
