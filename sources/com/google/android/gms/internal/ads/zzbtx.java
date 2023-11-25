package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzbtx extends zzatv implements zzbtz {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbtx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    @Override // com.google.android.gms.internal.ads.zzbtz
    public final void zze(zzbun zzbunVar, zzbuj zzbujVar) throws RemoteException {
        Parcel zza = zza();
        zzatx.zzd(zza, zzbunVar);
        zzatx.zzf(zza, zzbujVar);
        zzbh(6, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbtz
    public final void zzf(zzbun zzbunVar, zzbuj zzbujVar) throws RemoteException {
        Parcel zza = zza();
        zzatx.zzd(zza, zzbunVar);
        zzatx.zzf(zza, zzbujVar);
        zzbh(5, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbtz
    public final void zzg(zzbun zzbunVar, zzbuj zzbujVar) throws RemoteException {
        Parcel zza = zza();
        zzatx.zzd(zza, zzbunVar);
        zzatx.zzf(zza, zzbujVar);
        zzbh(4, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbtz
    public final void zzh(String str, zzbuj zzbujVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzatx.zzf(zza, zzbujVar);
        zzbh(7, zza);
    }
}
