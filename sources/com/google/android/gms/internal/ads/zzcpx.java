package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzcpx extends zzavx {
    private final zzcpw zza;
    private final com.google.android.gms.ads.internal.client.zzbu zzb;
    private final zzexc zzc;
    private boolean zzd = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzaE)).booleanValue();
    private final zzdrh zze;

    public zzcpx(zzcpw zzcpwVar, com.google.android.gms.ads.internal.client.zzbu zzbuVar, zzexc zzexcVar, zzdrh zzdrhVar) {
        this.zza = zzcpwVar;
        this.zzb = zzbuVar;
        this.zzc = zzexcVar;
        this.zze = zzdrhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzavy
    public final com.google.android.gms.ads.internal.client.zzbu zze() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzavy
    public final com.google.android.gms.ads.internal.client.zzdn zzf() {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzgF)).booleanValue()) {
            return null;
        }
        return this.zza.zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzavy
    public final void zzg(boolean z10) {
        this.zzd = z10;
    }

    @Override // com.google.android.gms.internal.ads.zzavy
    public final void zzh(com.google.android.gms.ads.internal.client.zzdg zzdgVar) {
        Preconditions.checkMainThread("setOnPaidEventListener must be called on the main UI thread.");
        if (this.zzc != null) {
            try {
                if (!zzdgVar.zzf()) {
                    this.zze.zze();
                }
            } catch (RemoteException e10) {
                zzcaa.zzf("Error in making CSI ping for reporting paid event callback", e10);
            }
            this.zzc.zzn(zzdgVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzavy
    public final void zzi(IObjectWrapper iObjectWrapper, zzawf zzawfVar) {
        try {
            this.zzc.zzq(zzawfVar);
            this.zza.zzd((Activity) ObjectWrapper.unwrap(iObjectWrapper), zzawfVar, this.zzd);
        } catch (RemoteException e10) {
            zzcaa.zzl("#007 Could not call remote method.", e10);
        }
    }
}
