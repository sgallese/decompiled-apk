package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzavw extends zzatv implements zzavy {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzavw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
    }

    @Override // com.google.android.gms.internal.ads.zzavy
    public final com.google.android.gms.ads.internal.client.zzbu zze() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzavy
    public final com.google.android.gms.ads.internal.client.zzdn zzf() throws RemoteException {
        Parcel zzbg = zzbg(5, zza());
        com.google.android.gms.ads.internal.client.zzdn zzb = com.google.android.gms.ads.internal.client.zzdm.zzb(zzbg.readStrongBinder());
        zzbg.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzavy
    public final void zzg(boolean z10) throws RemoteException {
        Parcel zza = zza();
        int i10 = zzatx.zza;
        zza.writeInt(z10 ? 1 : 0);
        zzbh(6, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzavy
    public final void zzh(com.google.android.gms.ads.internal.client.zzdg zzdgVar) throws RemoteException {
        Parcel zza = zza();
        zzatx.zzf(zza, zzdgVar);
        zzbh(7, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzavy
    public final void zzi(IObjectWrapper iObjectWrapper, zzawf zzawfVar) throws RemoteException {
        Parcel zza = zza();
        zzatx.zzf(zza, iObjectWrapper);
        zzatx.zzf(zza, zzawfVar);
        zzbh(4, zza);
    }
}
