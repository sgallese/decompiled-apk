package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzbvh extends zzatv implements zzbvj {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbvh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbvj
    public final void zze(zzbvd zzbvdVar) throws RemoteException {
        Parcel zza = zza();
        zzatx.zzf(zza, zzbvdVar);
        zzbh(5, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvj
    public final void zzf() throws RemoteException {
        zzbh(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbvj
    public final void zzg(int i10) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i10);
        zzbh(7, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvj
    public final void zzh() throws RemoteException {
        zzbh(6, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbvj
    public final void zzi() throws RemoteException {
        zzbh(1, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbvj
    public final void zzj() throws RemoteException {
        zzbh(2, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbvj
    public final void zzk() throws RemoteException {
        zzbh(8, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbvj
    public final void zzl() throws RemoteException {
        zzbh(3, zza());
    }
}
