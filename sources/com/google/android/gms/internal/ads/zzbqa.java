package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzbqa extends zzatv implements zzbqc {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbqa(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    @Override // com.google.android.gms.internal.ads.zzbqc
    public final com.google.android.gms.ads.internal.client.zzdq zze() throws RemoteException {
        Parcel zzbg = zzbg(5, zza());
        com.google.android.gms.ads.internal.client.zzdq zzb = com.google.android.gms.ads.internal.client.zzdp.zzb(zzbg.readStrongBinder());
        zzbg.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbqc
    public final zzbqq zzf() throws RemoteException {
        Parcel zzbg = zzbg(2, zza());
        zzbqq zzbqqVar = (zzbqq) zzatx.zza(zzbg, zzbqq.CREATOR);
        zzbg.recycle();
        return zzbqqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbqc
    public final zzbqq zzg() throws RemoteException {
        Parcel zzbg = zzbg(3, zza());
        zzbqq zzbqqVar = (zzbqq) zzatx.zza(zzbg, zzbqq.CREATOR);
        zzbg.recycle();
        return zzbqqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbqc
    public final void zzh(IObjectWrapper iObjectWrapper, String str, Bundle bundle, Bundle bundle2, com.google.android.gms.ads.internal.client.zzq zzqVar, zzbqf zzbqfVar) throws RemoteException {
        Parcel zza = zza();
        zzatx.zzf(zza, iObjectWrapper);
        zza.writeString(str);
        zzatx.zzd(zza, bundle);
        zzatx.zzd(zza, bundle2);
        zzatx.zzd(zza, zzqVar);
        zzatx.zzf(zza, zzbqfVar);
        zzbh(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbqc
    public final void zzi(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbpn zzbpnVar, zzbol zzbolVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzatx.zzd(zza, zzlVar);
        zzatx.zzf(zza, iObjectWrapper);
        zzatx.zzf(zza, zzbpnVar);
        zzatx.zzf(zza, zzbolVar);
        zzbh(23, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbqc
    public final void zzj(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbpq zzbpqVar, zzbol zzbolVar, com.google.android.gms.ads.internal.client.zzq zzqVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzatx.zzd(zza, zzlVar);
        zzatx.zzf(zza, iObjectWrapper);
        zzatx.zzf(zza, zzbpqVar);
        zzatx.zzf(zza, zzbolVar);
        zzatx.zzd(zza, zzqVar);
        zzbh(13, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbqc
    public final void zzk(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbpq zzbpqVar, zzbol zzbolVar, com.google.android.gms.ads.internal.client.zzq zzqVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzatx.zzd(zza, zzlVar);
        zzatx.zzf(zza, iObjectWrapper);
        zzatx.zzf(zza, zzbpqVar);
        zzatx.zzf(zza, zzbolVar);
        zzatx.zzd(zza, zzqVar);
        zzbh(21, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbqc
    public final void zzl(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbpt zzbptVar, zzbol zzbolVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzatx.zzd(zza, zzlVar);
        zzatx.zzf(zza, iObjectWrapper);
        zzatx.zzf(zza, zzbptVar);
        zzatx.zzf(zza, zzbolVar);
        zzbh(14, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbqc
    public final void zzm(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbpw zzbpwVar, zzbol zzbolVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzatx.zzd(zza, zzlVar);
        zzatx.zzf(zza, iObjectWrapper);
        zzatx.zzf(zza, zzbpwVar);
        zzatx.zzf(zza, zzbolVar);
        zzbh(18, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbqc
    public final void zzn(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbpw zzbpwVar, zzbol zzbolVar, zzbek zzbekVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzatx.zzd(zza, zzlVar);
        zzatx.zzf(zza, iObjectWrapper);
        zzatx.zzf(zza, zzbpwVar);
        zzatx.zzf(zza, zzbolVar);
        zzatx.zzd(zza, zzbekVar);
        zzbh(22, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbqc
    public final void zzo(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbpz zzbpzVar, zzbol zzbolVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzatx.zzd(zza, zzlVar);
        zzatx.zzf(zza, iObjectWrapper);
        zzatx.zzf(zza, zzbpzVar);
        zzatx.zzf(zza, zzbolVar);
        zzbh(20, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbqc
    public final void zzp(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbpz zzbpzVar, zzbol zzbolVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzatx.zzd(zza, zzlVar);
        zzatx.zzf(zza, iObjectWrapper);
        zzatx.zzf(zza, zzbpzVar);
        zzatx.zzf(zza, zzbolVar);
        zzbh(16, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbqc
    public final void zzq(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzbh(19, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbqc
    public final boolean zzr(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzatx.zzf(zza, iObjectWrapper);
        Parcel zzbg = zzbg(24, zza);
        boolean zzg = zzatx.zzg(zzbg);
        zzbg.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbqc
    public final boolean zzs(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzatx.zzf(zza, iObjectWrapper);
        Parcel zzbg = zzbg(15, zza);
        boolean zzg = zzatx.zzg(zzbg);
        zzbg.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbqc
    public final boolean zzt(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzatx.zzf(zza, iObjectWrapper);
        Parcel zzbg = zzbg(17, zza);
        boolean zzg = zzatx.zzg(zzbg);
        zzbg.recycle();
        return zzg;
    }
}
