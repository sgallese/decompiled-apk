package com.google.android.gms.internal.ads;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzawz implements BaseGmsClient.BaseOnConnectionFailedListener {
    final /* synthetic */ zzcas zza;
    final /* synthetic */ zzaxa zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzawz(zzaxa zzaxaVar, zzcas zzcasVar) {
        this.zzb = zzaxaVar;
        this.zza = zzcasVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        Object obj;
        obj = this.zzb.zzd;
        synchronized (obj) {
            this.zza.zzd(new RuntimeException("Connection failed."));
        }
    }
}
