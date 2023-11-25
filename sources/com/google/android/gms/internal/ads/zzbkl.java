package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.internal.BaseGmsClient;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzbkl implements BaseGmsClient.BaseConnectionCallbacks {
    final /* synthetic */ zzcas zza;
    final /* synthetic */ zzbkn zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbkl(zzbkn zzbknVar, zzcas zzcasVar) {
        this.zzb = zzbknVar;
        this.zza = zzcasVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        zzbka zzbkaVar;
        try {
            zzcas zzcasVar = this.zza;
            zzbkaVar = this.zzb.zza;
            zzcasVar.zzc(zzbkaVar.zzp());
        } catch (DeadObjectException e10) {
            this.zza.zzd(e10);
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i10) {
        this.zza.zzd(new RuntimeException("onConnectionSuspended: " + i10));
    }
}
