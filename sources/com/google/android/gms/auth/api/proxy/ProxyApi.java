package com.google.android.gms.auth.api.proxy;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.internal.ShowFirstParty;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.4 */
@ShowFirstParty
@KeepForSdk
/* loaded from: classes.dex */
public interface ProxyApi {

    /* compiled from: com.google.android.gms:play-services-auth-base@@18.0.4 */
    @ShowFirstParty
    @KeepForSdk
    /* loaded from: classes.dex */
    public interface ProxyResult extends Result {
        @KeepForSdk
        ProxyResponse getResponse();
    }

    /* compiled from: com.google.android.gms:play-services-auth-base@@18.0.4 */
    @ShowFirstParty
    @KeepForSdk
    /* loaded from: classes.dex */
    public interface SpatulaHeaderResult extends Result {
        @ShowFirstParty
        @KeepForSdk
        String getSpatulaHeader();
    }

    @ShowFirstParty
    @KeepForSdk
    @Deprecated
    PendingResult<SpatulaHeaderResult> getSpatulaHeader(GoogleApiClient googleApiClient);

    @KeepForSdk
    @Deprecated
    PendingResult<ProxyResult> performProxyRequest(GoogleApiClient googleApiClient, ProxyRequest proxyRequest);
}
