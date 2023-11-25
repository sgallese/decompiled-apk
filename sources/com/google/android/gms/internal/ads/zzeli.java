package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzeli {
    private final zzeln zza;
    private final String zzb;
    private com.google.android.gms.ads.internal.client.zzdn zzc;

    public zzeli(zzeln zzelnVar, String str) {
        this.zza = zzelnVar;
        this.zzb = str;
    }

    public final synchronized String zza() {
        String str;
        str = null;
        try {
            com.google.android.gms.ads.internal.client.zzdn zzdnVar = this.zzc;
            if (zzdnVar != null) {
                str = zzdnVar.zzg();
            }
        } catch (RemoteException e10) {
            zzcaa.zzl("#007 Could not call remote method.", e10);
            return null;
        }
        return str;
    }

    public final synchronized String zzb() {
        String str;
        str = null;
        try {
            com.google.android.gms.ads.internal.client.zzdn zzdnVar = this.zzc;
            if (zzdnVar != null) {
                str = zzdnVar.zzg();
            }
        } catch (RemoteException e10) {
            zzcaa.zzl("#007 Could not call remote method.", e10);
            return null;
        }
        return str;
    }

    public final synchronized void zzd(com.google.android.gms.ads.internal.client.zzl zzlVar, int i10) throws RemoteException {
        this.zzc = null;
        this.zza.zzb(zzlVar, this.zzb, new zzelo(i10), new zzelh(this));
    }

    public final synchronized boolean zze() throws RemoteException {
        return this.zza.zza();
    }
}
