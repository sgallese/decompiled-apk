package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzbog extends zzatv implements zzboi {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbog(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    @Override // com.google.android.gms.internal.ads.zzboi
    public final void zzA(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzbol zzbolVar) throws RemoteException {
        Parcel zza = zza();
        zzatx.zzf(zza, iObjectWrapper);
        zzatx.zzd(zza, zzlVar);
        zza.writeString(str);
        zzatx.zzf(zza, zzbolVar);
        zzbh(28, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzboi
    public final void zzB(com.google.android.gms.ads.internal.client.zzl zzlVar, String str, String str2) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzboi
    public final void zzC(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzbol zzbolVar) throws RemoteException {
        Parcel zza = zza();
        zzatx.zzf(zza, iObjectWrapper);
        zzatx.zzd(zza, zzlVar);
        zza.writeString(str);
        zzatx.zzf(zza, zzbolVar);
        zzbh(32, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzboi
    public final void zzD(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzatx.zzf(zza, iObjectWrapper);
        zzbh(21, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzboi
    public final void zzE() throws RemoteException {
        zzbh(8, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzboi
    public final void zzF() throws RemoteException {
        zzbh(9, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzboi
    public final void zzG(boolean z10) throws RemoteException {
        Parcel zza = zza();
        int i10 = zzatx.zza;
        zza.writeInt(z10 ? 1 : 0);
        zzbh(25, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzboi
    public final void zzH(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzatx.zzf(zza, iObjectWrapper);
        zzbh(39, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzboi
    public final void zzI() throws RemoteException {
        zzbh(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzboi
    public final void zzJ(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzatx.zzf(zza, iObjectWrapper);
        zzbh(37, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzboi
    public final void zzK(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzatx.zzf(zza, iObjectWrapper);
        zzbh(30, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzboi
    public final void zzL() throws RemoteException {
        zzbh(12, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzboi
    public final boolean zzM() throws RemoteException {
        Parcel zzbg = zzbg(22, zza());
        boolean zzg = zzatx.zzg(zzbg);
        zzbg.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzboi
    public final boolean zzN() throws RemoteException {
        Parcel zzbg = zzbg(13, zza());
        boolean zzg = zzatx.zzg(zzbg);
        zzbg.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzboi
    public final zzboq zzO() throws RemoteException {
        zzboq zzboqVar;
        Parcel zzbg = zzbg(15, zza());
        IBinder readStrongBinder = zzbg.readStrongBinder();
        if (readStrongBinder == null) {
            zzboqVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
            if (queryLocalInterface instanceof zzboq) {
                zzboqVar = (zzboq) queryLocalInterface;
            } else {
                zzboqVar = new zzboq(readStrongBinder);
            }
        }
        zzbg.recycle();
        return zzboqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzboi
    public final zzbor zzP() throws RemoteException {
        zzbor zzborVar;
        Parcel zzbg = zzbg(16, zza());
        IBinder readStrongBinder = zzbg.readStrongBinder();
        if (readStrongBinder == null) {
            zzborVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
            if (queryLocalInterface instanceof zzbor) {
                zzborVar = (zzbor) queryLocalInterface;
            } else {
                zzborVar = new zzbor(readStrongBinder);
            }
        }
        zzbg.recycle();
        return zzborVar;
    }

    @Override // com.google.android.gms.internal.ads.zzboi
    public final Bundle zze() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzboi
    public final Bundle zzf() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzboi
    public final Bundle zzg() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzboi
    public final com.google.android.gms.ads.internal.client.zzdq zzh() throws RemoteException {
        Parcel zzbg = zzbg(26, zza());
        com.google.android.gms.ads.internal.client.zzdq zzb = com.google.android.gms.ads.internal.client.zzdp.zzb(zzbg.readStrongBinder());
        zzbg.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzboi
    public final zzbfq zzi() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzboi
    public final zzboo zzj() throws RemoteException {
        zzboo zzbomVar;
        Parcel zzbg = zzbg(36, zza());
        IBinder readStrongBinder = zzbg.readStrongBinder();
        if (readStrongBinder == null) {
            zzbomVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
            if (queryLocalInterface instanceof zzboo) {
                zzbomVar = (zzboo) queryLocalInterface;
            } else {
                zzbomVar = new zzbom(readStrongBinder);
            }
        }
        zzbg.recycle();
        return zzbomVar;
    }

    @Override // com.google.android.gms.internal.ads.zzboi
    public final zzbou zzk() throws RemoteException {
        zzbou zzbosVar;
        Parcel zzbg = zzbg(27, zza());
        IBinder readStrongBinder = zzbg.readStrongBinder();
        if (readStrongBinder == null) {
            zzbosVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
            if (queryLocalInterface instanceof zzbou) {
                zzbosVar = (zzbou) queryLocalInterface;
            } else {
                zzbosVar = new zzbos(readStrongBinder);
            }
        }
        zzbg.recycle();
        return zzbosVar;
    }

    @Override // com.google.android.gms.internal.ads.zzboi
    public final zzbqq zzl() throws RemoteException {
        Parcel zzbg = zzbg(33, zza());
        zzbqq zzbqqVar = (zzbqq) zzatx.zza(zzbg, zzbqq.CREATOR);
        zzbg.recycle();
        return zzbqqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzboi
    public final zzbqq zzm() throws RemoteException {
        Parcel zzbg = zzbg(34, zza());
        zzbqq zzbqqVar = (zzbqq) zzatx.zza(zzbg, zzbqq.CREATOR);
        zzbg.recycle();
        return zzbqqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzboi
    public final IObjectWrapper zzn() throws RemoteException {
        Parcel zzbg = zzbg(2, zza());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzbg.readStrongBinder());
        zzbg.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.internal.ads.zzboi
    public final void zzo() throws RemoteException {
        zzbh(5, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzboi
    public final void zzp(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzbvo zzbvoVar, String str2) throws RemoteException {
        Parcel zza = zza();
        zzatx.zzf(zza, iObjectWrapper);
        zzatx.zzd(zza, zzlVar);
        zza.writeString(null);
        zzatx.zzf(zza, zzbvoVar);
        zza.writeString(str2);
        zzbh(10, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzboi
    public final void zzq(IObjectWrapper iObjectWrapper, zzbks zzbksVar, List list) throws RemoteException {
        Parcel zza = zza();
        zzatx.zzf(zza, iObjectWrapper);
        zzatx.zzf(zza, zzbksVar);
        zza.writeTypedList(list);
        zzbh(31, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzboi
    public final void zzr(IObjectWrapper iObjectWrapper, zzbvo zzbvoVar, List list) throws RemoteException {
        Parcel zza = zza();
        zzatx.zzf(zza, iObjectWrapper);
        zzatx.zzf(zza, zzbvoVar);
        zza.writeStringList(list);
        zzbh(23, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzboi
    public final void zzs(com.google.android.gms.ads.internal.client.zzl zzlVar, String str) throws RemoteException {
        Parcel zza = zza();
        zzatx.zzd(zza, zzlVar);
        zza.writeString(str);
        zzbh(11, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzboi
    public final void zzt(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzbol zzbolVar) throws RemoteException {
        Parcel zza = zza();
        zzatx.zzf(zza, iObjectWrapper);
        zzatx.zzd(zza, zzlVar);
        zza.writeString(str);
        zzatx.zzf(zza, zzbolVar);
        zzbh(38, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzboi
    public final void zzu(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzq zzqVar, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzbol zzbolVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzboi
    public final void zzv(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzq zzqVar, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, String str2, zzbol zzbolVar) throws RemoteException {
        Parcel zza = zza();
        zzatx.zzf(zza, iObjectWrapper);
        zzatx.zzd(zza, zzqVar);
        zzatx.zzd(zza, zzlVar);
        zza.writeString(str);
        zza.writeString(str2);
        zzatx.zzf(zza, zzbolVar);
        zzbh(6, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzboi
    public final void zzw(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzq zzqVar, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, String str2, zzbol zzbolVar) throws RemoteException {
        Parcel zza = zza();
        zzatx.zzf(zza, iObjectWrapper);
        zzatx.zzd(zza, zzqVar);
        zzatx.zzd(zza, zzlVar);
        zza.writeString(str);
        zza.writeString(str2);
        zzatx.zzf(zza, zzbolVar);
        zzbh(35, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzboi
    public final void zzx(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzbol zzbolVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzboi
    public final void zzy(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, String str2, zzbol zzbolVar) throws RemoteException {
        Parcel zza = zza();
        zzatx.zzf(zza, iObjectWrapper);
        zzatx.zzd(zza, zzlVar);
        zza.writeString(str);
        zza.writeString(str2);
        zzatx.zzf(zza, zzbolVar);
        zzbh(7, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzboi
    public final void zzz(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, String str2, zzbol zzbolVar, zzbek zzbekVar, List list) throws RemoteException {
        Parcel zza = zza();
        zzatx.zzf(zza, iObjectWrapper);
        zzatx.zzd(zza, zzlVar);
        zza.writeString(str);
        zza.writeString(str2);
        zzatx.zzf(zza, zzbolVar);
        zzatx.zzd(zza, zzbekVar);
        zza.writeStringList(list);
        zzbh(14, zza);
    }
}
