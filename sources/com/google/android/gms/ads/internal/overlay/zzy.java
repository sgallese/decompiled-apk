package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbbr;
import com.google.android.gms.internal.ads.zzbsb;
import com.google.android.gms.internal.ads.zzddw;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes.dex */
public final class zzy extends zzbsb {
    private final AdOverlayInfoParcel zza;
    private final Activity zzb;
    private boolean zzc = false;
    private boolean zzd = false;
    private boolean zze = false;

    public zzy(Activity activity, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.zza = adOverlayInfoParcel;
        this.zzb = activity;
    }

    private final synchronized void zzb() {
        if (!this.zzd) {
            zzo zzoVar = this.zza.zzc;
            if (zzoVar != null) {
                zzoVar.zzby(4);
            }
            this.zzd = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsc
    public final boolean zzG() throws RemoteException {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbsc
    public final void zzl(Bundle bundle) {
        zzo zzoVar;
        if (((Boolean) zzba.zzc().zzb(zzbbr.zzix)).booleanValue() && !this.zze) {
            this.zzb.requestWindowFeature(1);
        }
        boolean z10 = false;
        if (bundle != null && bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false)) {
            z10 = true;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.zza;
        if (adOverlayInfoParcel == null) {
            this.zzb.finish();
        } else if (z10) {
            this.zzb.finish();
        } else {
            if (bundle == null) {
                com.google.android.gms.ads.internal.client.zza zzaVar = adOverlayInfoParcel.zzb;
                if (zzaVar != null) {
                    zzaVar.onAdClicked();
                }
                zzddw zzddwVar = this.zza.zzu;
                if (zzddwVar != null) {
                    zzddwVar.zzbK();
                }
                if (this.zzb.getIntent() != null && this.zzb.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true) && (zzoVar = this.zza.zzc) != null) {
                    zzoVar.zzbv();
                }
            }
            com.google.android.gms.ads.internal.zzt.zzh();
            Activity activity = this.zzb;
            AdOverlayInfoParcel adOverlayInfoParcel2 = this.zza;
            zzc zzcVar = adOverlayInfoParcel2.zza;
            if (!zza.zzb(activity, zzcVar, adOverlayInfoParcel2.zzi, zzcVar.zzi)) {
                this.zzb.finish();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsc
    public final void zzm() throws RemoteException {
        if (this.zzb.isFinishing()) {
            zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsc
    public final void zzo() throws RemoteException {
        zzo zzoVar = this.zza.zzc;
        if (zzoVar != null) {
            zzoVar.zzbo();
        }
        if (this.zzb.isFinishing()) {
            zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsc
    public final void zzr() throws RemoteException {
        if (this.zzc) {
            this.zzb.finish();
            return;
        }
        this.zzc = true;
        zzo zzoVar = this.zza.zzc;
        if (zzoVar != null) {
            zzoVar.zzbL();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsc
    public final void zzs(Bundle bundle) throws RemoteException {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzbsc
    public final void zzu() throws RemoteException {
        if (this.zzb.isFinishing()) {
            zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsc
    public final void zzv() throws RemoteException {
        zzo zzoVar = this.zza.zzc;
        if (zzoVar != null) {
            zzoVar.zzbx();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsc
    public final void zzx() throws RemoteException {
        this.zze = true;
    }

    @Override // com.google.android.gms.internal.ads.zzbsc
    public final void zzi() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbsc
    public final void zzq() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbsc
    public final void zzt() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbsc
    public final void zzk(IObjectWrapper iObjectWrapper) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbsc
    public final void zzh(int i10, int i11, Intent intent) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbsc
    public final void zzp(int i10, String[] strArr, int[] iArr) {
    }
}
