package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.mediation.InitializationCompleteCallback;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.4.0 */
/* loaded from: classes3.dex */
final class zzboz implements InitializationCompleteCallback {
    final /* synthetic */ zzbks zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzboz(zzbpf zzbpfVar, zzbks zzbksVar) {
        this.zza = zzbksVar;
    }

    @Override // com.google.android.gms.ads.mediation.InitializationCompleteCallback
    public final void onInitializationFailed(String str) {
        try {
            this.zza.zze(str);
        } catch (RemoteException e10) {
            zzcaa.zzh("", e10);
        }
    }

    @Override // com.google.android.gms.ads.mediation.InitializationCompleteCallback
    public final void onInitializationSucceeded() {
        try {
            this.zza.zzf();
        } catch (RemoteException e10) {
            zzcaa.zzh("", e10);
        }
    }
}
