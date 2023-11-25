package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzfmo extends zzatv {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfmo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.IGassService");
    }

    public final zzfmm zze(zzfmk zzfmkVar) throws RemoteException {
        Parcel zza = zza();
        zzatx.zzd(zza, zzfmkVar);
        Parcel zzbg = zzbg(1, zza);
        zzfmm zzfmmVar = (zzfmm) zzatx.zza(zzbg, zzfmm.CREATOR);
        zzbg.recycle();
        return zzfmmVar;
    }

    public final zzfmv zzf(zzfmt zzfmtVar) throws RemoteException {
        Parcel zza = zza();
        zzatx.zzd(zza, zzfmtVar);
        Parcel zzbg = zzbg(3, zza);
        zzfmv zzfmvVar = (zzfmv) zzatx.zza(zzbg, zzfmv.CREATOR);
        zzbg.recycle();
        return zzfmvVar;
    }

    public final void zzg(zzfmh zzfmhVar) throws RemoteException {
        Parcel zza = zza();
        zzatx.zzd(zza, zzfmhVar);
        zzbh(2, zza);
    }
}
