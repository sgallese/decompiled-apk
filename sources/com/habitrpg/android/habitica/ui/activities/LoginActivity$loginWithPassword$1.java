package com.habitrpg.android.habitica.ui.activities;

import com.habitrpg.common.habitica.helpers.ExceptionHandler;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LoginActivity.kt */
/* loaded from: classes4.dex */
public final class LoginActivity$loginWithPassword$1 extends qc.r implements pc.l<Throwable, dc.w> {
    final /* synthetic */ LoginActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoginActivity$loginWithPassword$1(LoginActivity loginActivity) {
        super(1);
        this.this$0 = loginActivity;
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ dc.w invoke(Throwable th) {
        invoke2(th);
        return dc.w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable th) {
        qc.q.i(th, "it");
        this.this$0.hideProgress();
        ExceptionHandler.Companion.reportError(th);
    }
}
