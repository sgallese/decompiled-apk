package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzbvm extends zzatv implements zzbvo {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbvm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbvo
    public final void zze(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzatx.zzf(zza, iObjectWrapper);
        zzbh(8, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvo
    public final void zzf(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzatx.zzf(zza, iObjectWrapper);
        zzbh(6, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvo
    public final void zzg(IObjectWrapper iObjectWrapper, int i10) throws RemoteException {
        Parcel zza = zza();
        zzatx.zzf(zza, iObjectWrapper);
        zza.writeInt(i10);
        zzbh(9, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvo
    public final void zzh(IObjectWrapper iObjectWrapper) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvo
    public final void zzi(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzatx.zzf(zza, iObjectWrapper);
        zzbh(3, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvo
    public final void zzj(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzatx.zzf(zza, iObjectWrapper);
        zzbh(4, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvo
    public final void zzk(IObjectWrapper iObjectWrapper, int i10) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvo
    public final void zzl(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzatx.zzf(zza, iObjectWrapper);
        zzbh(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvo
    public final void zzm(IObjectWrapper iObjectWrapper, zzbvp zzbvpVar) throws RemoteException {
        Parcel zza = zza();
        zzatx.zzf(zza, iObjectWrapper);
        zzatx.zzd(zza, zzbvpVar);
        zzbh(7, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvo
    public final void zzn(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzatx.zzf(zza, iObjectWrapper);
        zzbh(11, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvo
    public final void zzo(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzatx.zzf(zza, iObjectWrapper);
        zzbh(5, zza);
    }
}
