package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzatv;
import com.google.android.gms.internal.ads.zzatx;
import com.google.android.gms.internal.ads.zzbko;
import com.google.android.gms.internal.ads.zzbkv;
import com.google.android.gms.internal.ads.zzbof;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.4.0 */
/* loaded from: classes.dex */
public final class zzcm extends zzatv implements zzco {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final float zze() throws RemoteException {
        Parcel zzbg = zzbg(7, zza());
        float readFloat = zzbg.readFloat();
        zzbg.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final String zzf() throws RemoteException {
        Parcel zzbg = zzbg(9, zza());
        String readString = zzbg.readString();
        zzbg.recycle();
        return readString;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final List zzg() throws RemoteException {
        Parcel zzbg = zzbg(13, zza());
        ArrayList createTypedArrayList = zzbg.createTypedArrayList(zzbko.CREATOR);
        zzbg.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzh(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzbh(10, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzi() throws RemoteException {
        zzbh(15, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzj(boolean z10) throws RemoteException {
        Parcel zza = zza();
        int i10 = zzatx.zza;
        zza.writeInt(z10 ? 1 : 0);
        zzbh(17, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzk() throws RemoteException {
        zzbh(1, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzl(String str, IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(null);
        zzatx.zzf(zza, iObjectWrapper);
        zzbh(6, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzm(zzda zzdaVar) throws RemoteException {
        Parcel zza = zza();
        zzatx.zzf(zza, zzdaVar);
        zzbh(16, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzn(IObjectWrapper iObjectWrapper, String str) throws RemoteException {
        Parcel zza = zza();
        zzatx.zzf(zza, iObjectWrapper);
        zza.writeString(str);
        zzbh(5, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzo(zzbof zzbofVar) throws RemoteException {
        Parcel zza = zza();
        zzatx.zzf(zza, zzbofVar);
        zzbh(11, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzp(boolean z10) throws RemoteException {
        Parcel zza = zza();
        int i10 = zzatx.zza;
        zza.writeInt(z10 ? 1 : 0);
        zzbh(4, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzq(float f10) throws RemoteException {
        Parcel zza = zza();
        zza.writeFloat(f10);
        zzbh(2, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzr(String str) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzs(zzbkv zzbkvVar) throws RemoteException {
        Parcel zza = zza();
        zzatx.zzf(zza, zzbkvVar);
        zzbh(12, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzt(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzbh(18, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzu(zzff zzffVar) throws RemoteException {
        Parcel zza = zza();
        zzatx.zzd(zza, zzffVar);
        zzbh(14, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final boolean zzv() throws RemoteException {
        Parcel zzbg = zzbg(8, zza());
        boolean zzg = zzatx.zzg(zzbg);
        zzbg.recycle();
        return zzg;
    }
}
