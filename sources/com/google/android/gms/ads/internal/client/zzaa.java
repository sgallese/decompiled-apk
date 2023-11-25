package com.google.android.gms.ads.internal.client;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbbr;
import com.google.android.gms.internal.ads.zzbrz;
import com.google.android.gms.internal.ads.zzbsb;
import com.google.android.gms.internal.ads.zzbse;
import com.google.android.gms.internal.ads.zzbsf;
import com.google.android.gms.internal.ads.zzbtf;
import com.google.android.gms.internal.ads.zzbth;
import com.google.android.gms.internal.ads.zzcac;
import com.google.android.gms.internal.ads.zzcad;
import com.google.android.gms.internal.ads.zzcae;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.4.0 */
/* loaded from: classes.dex */
public final class zzaa extends zzax {
    final /* synthetic */ Activity zza;
    final /* synthetic */ zzaw zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaa(zzaw zzawVar, Activity activity) {
        this.zzb = zzawVar;
        this.zza = activity;
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    protected final /* bridge */ /* synthetic */ Object zza() {
        zzaw.zzt(this.zza, "ad_overlay");
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* bridge */ /* synthetic */ Object zzb(zzce zzceVar) throws RemoteException {
        return zzceVar.zzm(ObjectWrapper.wrap(this.zza));
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* bridge */ /* synthetic */ Object zzc() throws RemoteException {
        zzbth zzbthVar;
        zzbrz zzbrzVar;
        zzbbr.zza(this.zza);
        if (!((Boolean) zzba.zzc().zzb(zzbbr.zzjH)).booleanValue()) {
            zzbrzVar = this.zzb.zzf;
            return zzbrzVar.zza(this.zza);
        }
        try {
            return zzbsb.zzH(((zzbsf) zzcae.zzb(this.zza, "com.google.android.gms.ads.ChimeraAdOverlayCreatorImpl", new zzcac() { // from class: com.google.android.gms.ads.internal.client.zzz
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.android.gms.internal.ads.zzcac
                public final Object zza(Object obj) {
                    return zzbse.zzb(obj);
                }
            })).zze(ObjectWrapper.wrap(this.zza)));
        } catch (RemoteException | zzcad | NullPointerException e10) {
            this.zzb.zzh = zzbtf.zza(this.zza.getApplicationContext());
            zzbthVar = this.zzb.zzh;
            zzbthVar.zzf(e10, "ClientApiBroker.createAdOverlay");
            return null;
        }
    }
}
