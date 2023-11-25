package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzbub extends zzatv implements zzbud {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbub(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdsService");
    }

    @Override // com.google.android.gms.internal.ads.zzbud
    public final void zze(zzbtv zzbtvVar, zzbug zzbugVar) throws RemoteException {
        Parcel zza = zza();
        zzatx.zzd(zza, zzbtvVar);
        zzatx.zzf(zza, zzbugVar);
        zzbh(3, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbud
    public final void zzf(zzbtr zzbtrVar, zzbug zzbugVar) throws RemoteException {
        Parcel zza = zza();
        zzatx.zzd(zza, zzbtrVar);
        zzatx.zzf(zza, zzbugVar);
        zzbh(1, zza);
    }
}
