package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzdhl extends zzbes {
    private final zzdic zza;
    private IObjectWrapper zzb;

    public zzdhl(zzdic zzdicVar) {
        this.zza = zzdicVar;
    }

    private static float zzb(IObjectWrapper iObjectWrapper) {
        Drawable drawable;
        if (iObjectWrapper == null || (drawable = (Drawable) ObjectWrapper.unwrap(iObjectWrapper)) == null || drawable.getIntrinsicWidth() == -1 || drawable.getIntrinsicHeight() == -1) {
            return 0.0f;
        }
        return drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight();
    }

    @Override // com.google.android.gms.internal.ads.zzbet
    public final float zze() throws RemoteException {
        float f10;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzge)).booleanValue()) {
            return 0.0f;
        }
        if (this.zza.zzb() != 0.0f) {
            return this.zza.zzb();
        }
        if (this.zza.zzj() != null) {
            try {
                return this.zza.zzj().zze();
            } catch (RemoteException e10) {
                zzcaa.zzh("Remote exception getting video controller aspect ratio.", e10);
                return 0.0f;
            }
        }
        IObjectWrapper iObjectWrapper = this.zzb;
        if (iObjectWrapper != null) {
            return zzb(iObjectWrapper);
        }
        zzbew zzm = this.zza.zzm();
        if (zzm == null) {
            return 0.0f;
        }
        if (zzm.zzd() != -1 && zzm.zzc() != -1) {
            f10 = zzm.zzd() / zzm.zzc();
        } else {
            f10 = 0.0f;
        }
        if (f10 == 0.0f) {
            return zzb(zzm.zzf());
        }
        return f10;
    }

    @Override // com.google.android.gms.internal.ads.zzbet
    public final float zzf() throws RemoteException {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzgf)).booleanValue() || this.zza.zzj() == null) {
            return 0.0f;
        }
        return this.zza.zzj().zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzbet
    public final float zzg() throws RemoteException {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzgf)).booleanValue() || this.zza.zzj() == null) {
            return 0.0f;
        }
        return this.zza.zzj().zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzbet
    public final com.google.android.gms.ads.internal.client.zzdq zzh() throws RemoteException {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzgf)).booleanValue()) {
            return null;
        }
        return this.zza.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzbet
    public final IObjectWrapper zzi() throws RemoteException {
        IObjectWrapper iObjectWrapper = this.zzb;
        if (iObjectWrapper != null) {
            return iObjectWrapper;
        }
        zzbew zzm = this.zza.zzm();
        if (zzm == null) {
            return null;
        }
        return zzm.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzbet
    public final void zzj(IObjectWrapper iObjectWrapper) {
        this.zzb = iObjectWrapper;
    }

    @Override // com.google.android.gms.internal.ads.zzbet
    public final boolean zzk() throws RemoteException {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzgf)).booleanValue()) {
            return false;
        }
        return this.zza.zzaf();
    }

    @Override // com.google.android.gms.internal.ads.zzbet
    public final boolean zzl() throws RemoteException {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzgf)).booleanValue() || this.zza.zzj() == null) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzbet
    public final void zzm(zzbge zzbgeVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzgf)).booleanValue() && (this.zza.zzj() instanceof zzcge)) {
            ((zzcge) this.zza.zzj()).zzv(zzbgeVar);
        }
    }
}
