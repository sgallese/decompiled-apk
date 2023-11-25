package com.habitrpg.android.habitica.ui.activities;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LoginActivity.kt */
/* loaded from: classes4.dex */
public final class LoginActivity$recoverFromPlayServicesErrorResult$1$1 extends qc.r implements pc.l<Boolean, dc.w> {
    final /* synthetic */ LoginActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoginActivity$recoverFromPlayServicesErrorResult$1$1(LoginActivity loginActivity) {
        super(1);
        this.this$0 = loginActivity;
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ dc.w invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return dc.w.f13270a;
    }

    public final void invoke(boolean z10) {
        this.this$0.handleAuthResponse(z10);
    }
}
