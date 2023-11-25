package com.habitrpg.android.habitica.ui.viewmodels;

import android.app.Activity;
import android.content.Intent;
import androidx.activity.result.b;
import com.google.android.gms.auth.GoogleAuthException;
import dc.w;
import pc.l;
import qc.q;
import qc.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AuthenticationViewModel.kt */
/* loaded from: classes4.dex */
public final class AuthenticationViewModel$handleGoogleLoginResult$1 extends r implements l<Throwable, w> {
    final /* synthetic */ Activity $activity;
    final /* synthetic */ b<Intent> $recoverFromPlayServicesErrorResult;
    final /* synthetic */ AuthenticationViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuthenticationViewModel$handleGoogleLoginResult$1(b<Intent> bVar, AuthenticationViewModel authenticationViewModel, Activity activity) {
        super(1);
        this.$recoverFromPlayServicesErrorResult = bVar;
        this.this$0 = authenticationViewModel;
        this.$activity = activity;
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ w invoke(Throwable th) {
        invoke2(th);
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable th) {
        q.i(th, "throwable");
        b<Intent> bVar = this.$recoverFromPlayServicesErrorResult;
        if (bVar != null && (th instanceof GoogleAuthException)) {
            this.this$0.handleGoogleAuthException((Exception) th, this.$activity, bVar);
        }
    }
}
