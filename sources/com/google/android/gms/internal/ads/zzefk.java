package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzefk extends zzbvn implements zzcxs {
    private zzbvo zza;
    private zzcxr zzb;
    private zzdeh zzc;

    @Override // com.google.android.gms.internal.ads.zzcxs
    public final synchronized void zza(zzcxr zzcxrVar) {
        this.zzb = zzcxrVar;
    }

    public final synchronized void zzc(zzbvo zzbvoVar) {
        this.zza = zzbvoVar;
    }

    public final synchronized void zzd(zzdeh zzdehVar) {
        this.zzc = zzdehVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbvo
    public final synchronized void zze(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzbvo zzbvoVar = this.zza;
        if (zzbvoVar != null) {
            ((zzeii) zzbvoVar).zzb.onAdClicked();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvo
    public final synchronized void zzf(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzbvo zzbvoVar = this.zza;
        if (zzbvoVar != null) {
            zzbvoVar.zzf(iObjectWrapper);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvo
    public final synchronized void zzg(IObjectWrapper iObjectWrapper, int i10) throws RemoteException {
        zzcxr zzcxrVar = this.zzb;
        if (zzcxrVar != null) {
            zzcxrVar.zza(i10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvo
    public final synchronized void zzh(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzbvo zzbvoVar = this.zza;
        if (zzbvoVar != null) {
            ((zzeii) zzbvoVar).zzc.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvo
    public final synchronized void zzi(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzcxr zzcxrVar = this.zzb;
        if (zzcxrVar != null) {
            zzcxrVar.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvo
    public final synchronized void zzj(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzbvo zzbvoVar = this.zza;
        if (zzbvoVar != null) {
            ((zzeii) zzbvoVar).zza.zzbv();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvo
    public final synchronized void zzk(IObjectWrapper iObjectWrapper, int i10) throws RemoteException {
        zzdeh zzdehVar = this.zzc;
        if (zzdehVar != null) {
            zzcaa.zzj("Fail to initialize adapter ".concat(String.valueOf(((zzeih) zzdehVar).zzc.zza)));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvo
    public final synchronized void zzl(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzdeh zzdehVar = this.zzc;
        if (zzdehVar != null) {
            Executor zzc = zzeij.zzc(((zzeih) zzdehVar).zzd);
            final zzfbr zzfbrVar = ((zzeih) zzdehVar).zza;
            final zzfbe zzfbeVar = ((zzeih) zzdehVar).zzb;
            final zzedq zzedqVar = ((zzeih) zzdehVar).zzc;
            final zzeih zzeihVar = (zzeih) zzdehVar;
            zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeig
                @Override // java.lang.Runnable
                public final void run() {
                    zzeih zzeihVar2 = zzeih.this;
                    zzfbr zzfbrVar2 = zzfbrVar;
                    zzfbe zzfbeVar2 = zzfbeVar;
                    zzedq zzedqVar2 = zzedqVar;
                    zzeij zzeijVar = zzeihVar2.zzd;
                    zzeij.zze(zzfbrVar2, zzfbeVar2, zzedqVar2);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvo
    public final synchronized void zzm(IObjectWrapper iObjectWrapper, zzbvp zzbvpVar) throws RemoteException {
        zzbvo zzbvoVar = this.zza;
        if (zzbvoVar != null) {
            ((zzeii) zzbvoVar).zzd.zza(zzbvpVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvo
    public final synchronized void zzn(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzbvo zzbvoVar = this.zza;
        if (zzbvoVar != null) {
            ((zzeii) zzbvoVar).zzc.zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvo
    public final synchronized void zzo(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzbvo zzbvoVar = this.zza;
        if (zzbvoVar != null) {
            ((zzeii) zzbvoVar).zzd.zzc();
        }
    }
}
