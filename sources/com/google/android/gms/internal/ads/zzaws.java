package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzaws extends zzatv {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaws(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.cache.ICacheService");
    }

    public final long zze(zzawq zzawqVar) throws RemoteException {
        Parcel zza = zza();
        zzatx.zzd(zza, zzawqVar);
        Parcel zzbg = zzbg(3, zza);
        long readLong = zzbg.readLong();
        zzbg.recycle();
        return readLong;
    }

    public final zzawn zzf(zzawq zzawqVar) throws RemoteException {
        Parcel zza = zza();
        zzatx.zzd(zza, zzawqVar);
        Parcel zzbg = zzbg(1, zza);
        zzawn zzawnVar = (zzawn) zzatx.zza(zzbg, zzawn.CREATOR);
        zzbg.recycle();
        return zzawnVar;
    }

    public final zzawn zzg(zzawq zzawqVar) throws RemoteException {
        Parcel zza = zza();
        zzatx.zzd(zza, zzawqVar);
        Parcel zzbg = zzbg(2, zza);
        zzawn zzawnVar = (zzawn) zzatx.zza(zzbg, zzawn.CREATOR);
        zzbg.recycle();
        return zzawnVar;
    }
}
