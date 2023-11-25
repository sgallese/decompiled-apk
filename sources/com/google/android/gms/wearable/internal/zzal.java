package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import android.net.Uri;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.wearable.CapabilityApi;

/* compiled from: com.google.android.gms:play-services-wearable@@18.1.0 */
/* loaded from: classes3.dex */
public final class zzal implements CapabilityApi {
    @Override // com.google.android.gms.wearable.CapabilityApi
    public final PendingResult<Status> addCapabilityListener(GoogleApiClient googleApiClient, CapabilityApi.CapabilityListener capabilityListener, String str) {
        Asserts.checkNotNull(str, "capability must not be null");
        zzaf zzafVar = new zzaf(capabilityListener, str);
        IntentFilter zza = zzih.zza("com.google.android.gms.wearable.CAPABILITY_CHANGED");
        if (!str.startsWith("/")) {
            str = "/".concat(str);
        }
        zza.addDataPath(str, 0);
        return zze.zza(googleApiClient, new zzad(new IntentFilter[]{zza}), zzafVar);
    }

    @Override // com.google.android.gms.wearable.CapabilityApi
    public final PendingResult<Status> addListener(GoogleApiClient googleApiClient, CapabilityApi.CapabilityListener capabilityListener, Uri uri, int i10) {
        boolean z10;
        Asserts.checkNotNull(uri, "uri must not be null");
        if (i10 != 0) {
            if (i10 == 1) {
                i10 = 1;
            } else {
                z10 = false;
                Preconditions.checkArgument(z10, "invalid filter type");
                return zze.zza(googleApiClient, new zzad(new IntentFilter[]{zzih.zzb("com.google.android.gms.wearable.CAPABILITY_CHANGED", uri, i10)}), capabilityListener);
            }
        }
        z10 = true;
        Preconditions.checkArgument(z10, "invalid filter type");
        return zze.zza(googleApiClient, new zzad(new IntentFilter[]{zzih.zzb("com.google.android.gms.wearable.CAPABILITY_CHANGED", uri, i10)}), capabilityListener);
    }

    @Override // com.google.android.gms.wearable.CapabilityApi
    public final PendingResult<CapabilityApi.AddLocalCapabilityResult> addLocalCapability(GoogleApiClient googleApiClient, String str) {
        return googleApiClient.enqueue(new zzab(this, googleApiClient, str));
    }

    @Override // com.google.android.gms.wearable.CapabilityApi
    public final PendingResult<CapabilityApi.GetAllCapabilitiesResult> getAllCapabilities(GoogleApiClient googleApiClient, int i10) {
        boolean z10 = true;
        if (i10 != 0) {
            if (i10 == 1) {
                i10 = 1;
            } else {
                z10 = false;
            }
        }
        Preconditions.checkArgument(z10);
        return googleApiClient.enqueue(new zzaa(this, googleApiClient, i10));
    }

    @Override // com.google.android.gms.wearable.CapabilityApi
    public final PendingResult<CapabilityApi.GetCapabilityResult> getCapability(GoogleApiClient googleApiClient, String str, int i10) {
        boolean z10 = true;
        if (i10 != 0) {
            if (i10 == 1) {
                i10 = 1;
            } else {
                z10 = false;
            }
        }
        Preconditions.checkArgument(z10);
        return googleApiClient.enqueue(new zzz(this, googleApiClient, str, i10));
    }

    @Override // com.google.android.gms.wearable.CapabilityApi
    public final PendingResult<Status> removeCapabilityListener(GoogleApiClient googleApiClient, CapabilityApi.CapabilityListener capabilityListener, String str) {
        return googleApiClient.enqueue(new zzak(googleApiClient, new zzaf(capabilityListener, str), null));
    }

    @Override // com.google.android.gms.wearable.CapabilityApi
    public final PendingResult<Status> removeListener(GoogleApiClient googleApiClient, CapabilityApi.CapabilityListener capabilityListener) {
        return googleApiClient.enqueue(new zzak(googleApiClient, capabilityListener, null));
    }

    @Override // com.google.android.gms.wearable.CapabilityApi
    public final PendingResult<CapabilityApi.RemoveLocalCapabilityResult> removeLocalCapability(GoogleApiClient googleApiClient, String str) {
        return googleApiClient.enqueue(new zzac(this, googleApiClient, str));
    }
}
