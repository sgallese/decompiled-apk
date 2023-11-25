package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import android.net.Uri;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.wearable.MessageApi;

/* compiled from: com.google.android.gms:play-services-wearable@@18.1.0 */
/* loaded from: classes3.dex */
public final class zzgd implements MessageApi {
    private static final PendingResult zza(GoogleApiClient googleApiClient, MessageApi.MessageListener messageListener, IntentFilter[] intentFilterArr) {
        return googleApiClient.enqueue(new zzgb(googleApiClient, messageListener, googleApiClient.registerListener(messageListener), intentFilterArr, null));
    }

    @Override // com.google.android.gms.wearable.MessageApi
    public final PendingResult<Status> addListener(GoogleApiClient googleApiClient, MessageApi.MessageListener messageListener) {
        return zza(googleApiClient, messageListener, new IntentFilter[]{zzih.zza("com.google.android.gms.wearable.MESSAGE_RECEIVED")});
    }

    @Override // com.google.android.gms.wearable.MessageApi
    public final PendingResult<Status> removeListener(GoogleApiClient googleApiClient, MessageApi.MessageListener messageListener) {
        return googleApiClient.enqueue(new zzfz(this, googleApiClient, messageListener));
    }

    @Override // com.google.android.gms.wearable.MessageApi
    public final PendingResult<MessageApi.SendMessageResult> sendMessage(GoogleApiClient googleApiClient, String str, String str2, byte[] bArr) {
        return googleApiClient.enqueue(new zzfy(this, googleApiClient, str, str2, bArr));
    }

    @Override // com.google.android.gms.wearable.MessageApi
    public final PendingResult<Status> addListener(GoogleApiClient googleApiClient, MessageApi.MessageListener messageListener, Uri uri, int i10) {
        boolean z10;
        Preconditions.checkNotNull(uri, "uri must not be null");
        if (i10 != 0) {
            if (i10 != 1) {
                z10 = false;
                Preconditions.checkArgument(z10, "invalid filter type");
                return zza(googleApiClient, messageListener, new IntentFilter[]{zzih.zzb("com.google.android.gms.wearable.MESSAGE_RECEIVED", uri, i10)});
            }
            i10 = 1;
        }
        z10 = true;
        Preconditions.checkArgument(z10, "invalid filter type");
        return zza(googleApiClient, messageListener, new IntentFilter[]{zzih.zzb("com.google.android.gms.wearable.MESSAGE_RECEIVED", uri, i10)});
    }
}
