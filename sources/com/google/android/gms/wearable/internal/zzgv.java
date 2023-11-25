package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.wearable.NodeApi;

/* compiled from: com.google.android.gms:play-services-wearable@@18.1.0 */
/* loaded from: classes3.dex */
public final class zzgv implements NodeApi {
    @Override // com.google.android.gms.wearable.NodeApi
    public final PendingResult<NodeApi.GetConnectedNodesResult> getConnectedNodes(GoogleApiClient googleApiClient) {
        return googleApiClient.enqueue(new zzgs(this, googleApiClient));
    }

    @Override // com.google.android.gms.wearable.NodeApi
    public final PendingResult<NodeApi.GetLocalNodeResult> getLocalNode(GoogleApiClient googleApiClient) {
        return googleApiClient.enqueue(new zzgr(this, googleApiClient));
    }
}
