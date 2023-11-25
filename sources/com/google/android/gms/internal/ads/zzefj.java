package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzefj extends zzbok implements zzcxs {
    private zzbol zza;
    private zzcxr zzb;

    @Override // com.google.android.gms.internal.ads.zzcxs
    public final synchronized void zza(zzcxr zzcxrVar) {
        this.zzb = zzcxrVar;
    }

    public final synchronized void zzc(zzbol zzbolVar) {
        this.zza = zzbolVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbol
    public final synchronized void zze() throws RemoteException {
        zzbol zzbolVar = this.zza;
        if (zzbolVar != null) {
            zzbolVar.zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbol
    public final synchronized void zzf() throws RemoteException {
        zzbol zzbolVar = this.zza;
        if (zzbolVar != null) {
            zzbolVar.zzf();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbol
    public final synchronized void zzg(int i10) throws RemoteException {
        zzcxr zzcxrVar = this.zzb;
        if (zzcxrVar != null) {
            zzcxrVar.zza(i10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbol
    public final synchronized void zzh(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        zzcxr zzcxrVar = this.zzb;
        if (zzcxrVar != null) {
            zzcxrVar.zzb(zzeVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbol
    public final synchronized void zzi(int i10, String str) throws RemoteException {
        zzcxr zzcxrVar = this.zzb;
        if (zzcxrVar != null) {
            zzcxrVar.zzc(i10, str);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbol
    public final synchronized void zzj(int i10) throws RemoteException {
        zzbol zzbolVar = this.zza;
        if (zzbolVar != null) {
            zzbolVar.zzj(i10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbol
    public final synchronized void zzk(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        zzbol zzbolVar = this.zza;
        if (zzbolVar != null) {
            zzbolVar.zzk(zzeVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbol
    public final synchronized void zzl(String str) throws RemoteException {
        zzbol zzbolVar = this.zza;
        if (zzbolVar != null) {
            zzbolVar.zzl(str);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbol
    public final synchronized void zzm() throws RemoteException {
        zzbol zzbolVar = this.zza;
        if (zzbolVar != null) {
            zzbolVar.zzm();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbol
    public final synchronized void zzn() throws RemoteException {
        zzbol zzbolVar = this.zza;
        if (zzbolVar != null) {
            zzbolVar.zzn();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbol
    public final synchronized void zzo() throws RemoteException {
        zzbol zzbolVar = this.zza;
        if (zzbolVar != null) {
            zzbolVar.zzo();
        }
        zzcxr zzcxrVar = this.zzb;
        if (zzcxrVar != null) {
            zzcxrVar.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbol
    public final synchronized void zzp() throws RemoteException {
        zzbol zzbolVar = this.zza;
        if (zzbolVar != null) {
            zzbolVar.zzp();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbol
    public final synchronized void zzq(String str, String str2) throws RemoteException {
        zzbol zzbolVar = this.zza;
        if (zzbolVar != null) {
            zzbolVar.zzq(str, str2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbol
    public final synchronized void zzr(zzbfq zzbfqVar, String str) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbol
    public final synchronized void zzs(zzbvp zzbvpVar) throws RemoteException {
        zzbol zzbolVar = this.zza;
        if (zzbolVar != null) {
            zzbolVar.zzs(zzbvpVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbol
    public final synchronized void zzt(zzbvt zzbvtVar) throws RemoteException {
        zzbol zzbolVar = this.zza;
        if (zzbolVar != null) {
            zzbolVar.zzt(zzbvtVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbol
    public final synchronized void zzu() throws RemoteException {
        zzbol zzbolVar = this.zza;
        if (zzbolVar != null) {
            zzbolVar.zzu();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbol
    public final synchronized void zzv() throws RemoteException {
        zzbol zzbolVar = this.zza;
        if (zzbolVar != null) {
            zzbolVar.zzv();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbol
    public final synchronized void zzw() throws RemoteException {
        zzbol zzbolVar = this.zza;
        if (zzbolVar != null) {
            zzbolVar.zzw();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbol
    public final synchronized void zzx() throws RemoteException {
        zzbol zzbolVar = this.zza;
        if (zzbolVar != null) {
            zzbolVar.zzx();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbol
    public final synchronized void zzy() throws RemoteException {
        zzbol zzbolVar = this.zza;
        if (zzbolVar != null) {
            zzbolVar.zzy();
        }
    }
}
