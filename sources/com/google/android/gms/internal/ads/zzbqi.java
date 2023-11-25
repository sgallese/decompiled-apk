package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterscrollerAd;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.4.0 */
/* loaded from: classes3.dex */
final class zzbqi implements MediationAdLoadCallback {
    final /* synthetic */ zzbpq zza;
    final /* synthetic */ zzbol zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbqi(zzbqo zzbqoVar, zzbpq zzbpqVar, zzbol zzbolVar) {
        this.zza = zzbpqVar;
        this.zzb = zzbolVar;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(AdError adError) {
        try {
            this.zza.zzf(adError.zza());
        } catch (RemoteException e10) {
            zzcaa.zzh("", e10);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final /* bridge */ /* synthetic */ Object onSuccess(Object obj) {
        MediationInterscrollerAd mediationInterscrollerAd = (MediationInterscrollerAd) obj;
        if (mediationInterscrollerAd == null) {
            zzcaa.zzj("Adapter incorrectly returned a null ad. The onFailure() callback should be called if an adapter fails to load an ad.");
            try {
                this.zza.zze("Adapter returned null.");
                return null;
            } catch (RemoteException e10) {
                zzcaa.zzh("", e10);
                return null;
            }
        }
        try {
            this.zza.zzh(new zzbpg(mediationInterscrollerAd));
        } catch (RemoteException e11) {
            zzcaa.zzh("", e11);
        }
        return new zzbqp(this.zzb);
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(String str) {
        onFailure(new AdError(0, str, AdError.UNDEFINED_DOMAIN));
    }
}
