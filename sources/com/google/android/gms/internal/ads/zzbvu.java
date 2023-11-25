package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzbvu extends zzatv implements zzbvw {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbvu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbvw
    public final Bundle zzb() throws RemoteException {
        Parcel zzbg = zzbg(9, zza());
        Bundle bundle = (Bundle) zzatx.zza(zzbg, Bundle.CREATOR);
        zzbg.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzbvw
    public final com.google.android.gms.ads.internal.client.zzdn zzc() throws RemoteException {
        Parcel zzbg = zzbg(12, zza());
        com.google.android.gms.ads.internal.client.zzdn zzb = com.google.android.gms.ads.internal.client.zzdm.zzb(zzbg.readStrongBinder());
        zzbg.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbvw
    public final zzbvt zzd() throws RemoteException {
        zzbvt zzbvrVar;
        Parcel zzbg = zzbg(11, zza());
        IBinder readStrongBinder = zzbg.readStrongBinder();
        if (readStrongBinder == null) {
            zzbvrVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
            if (queryLocalInterface instanceof zzbvt) {
                zzbvrVar = (zzbvt) queryLocalInterface;
            } else {
                zzbvrVar = new zzbvr(readStrongBinder);
            }
        }
        zzbg.recycle();
        return zzbvrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbvw
    public final String zze() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvw
    public final void zzf(com.google.android.gms.ads.internal.client.zzl zzlVar, zzbwd zzbwdVar) throws RemoteException {
        Parcel zza = zza();
        zzatx.zzd(zza, zzlVar);
        zzatx.zzf(zza, zzbwdVar);
        zzbh(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvw
    public final void zzg(com.google.android.gms.ads.internal.client.zzl zzlVar, zzbwd zzbwdVar) throws RemoteException {
        Parcel zza = zza();
        zzatx.zzd(zza, zzlVar);
        zzatx.zzf(zza, zzbwdVar);
        zzbh(14, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvw
    public final void zzh(boolean z10) throws RemoteException {
        Parcel zza = zza();
        int i10 = zzatx.zza;
        zza.writeInt(z10 ? 1 : 0);
        zzbh(15, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvw
    public final void zzi(com.google.android.gms.ads.internal.client.zzdd zzddVar) throws RemoteException {
        Parcel zza = zza();
        zzatx.zzf(zza, zzddVar);
        zzbh(8, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvw
    public final void zzj(com.google.android.gms.ads.internal.client.zzdg zzdgVar) throws RemoteException {
        Parcel zza = zza();
        zzatx.zzf(zza, zzdgVar);
        zzbh(13, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvw
    public final void zzk(zzbvz zzbvzVar) throws RemoteException {
        Parcel zza = zza();
        zzatx.zzf(zza, zzbvzVar);
        zzbh(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvw
    public final void zzl(zzbwk zzbwkVar) throws RemoteException {
        Parcel zza = zza();
        zzatx.zzd(zza, zzbwkVar);
        zzbh(7, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvw
    public final void zzm(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzatx.zzf(zza, iObjectWrapper);
        zzbh(5, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvw
    public final void zzn(IObjectWrapper iObjectWrapper, boolean z10) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvw
    public final boolean zzo() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvw
    public final void zzp(zzbwe zzbweVar) throws RemoteException {
        throw null;
    }
}
