package com.google.android.gms.auth.api.signin.internal;

import android.os.Bundle;
import androidx.loader.app.a;
import androidx.loader.content.b;
import com.google.android.gms.common.api.GoogleApiClient;

/* compiled from: com.google.android.gms:play-services-auth@@20.7.0 */
/* loaded from: classes.dex */
final class zbw implements a.InterfaceC0104a {
    final /* synthetic */ SignInHubActivity zba;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zbw(SignInHubActivity signInHubActivity, zbv zbvVar) {
        this.zba = signInHubActivity;
    }

    @Override // androidx.loader.app.a.InterfaceC0104a
    public final b onCreateLoader(int i10, Bundle bundle) {
        return new zbc(this.zba, GoogleApiClient.getAllClients());
    }

    @Override // androidx.loader.app.a.InterfaceC0104a
    public final /* bridge */ /* synthetic */ void onLoadFinished(b bVar, Object obj) {
        Void r32 = (Void) obj;
        SignInHubActivity signInHubActivity = this.zba;
        signInHubActivity.setResult(SignInHubActivity.zba(signInHubActivity), SignInHubActivity.zbb(signInHubActivity));
        this.zba.finish();
    }

    @Override // androidx.loader.app.a.InterfaceC0104a
    public final void onLoaderReset(b bVar) {
    }
}
