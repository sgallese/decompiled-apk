package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzboj extends zzatv implements zzbol {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzboj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbol
    public final void zze() throws RemoteException {
        zzbh(1, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbol
    public final void zzf() throws RemoteException {
        zzbh(2, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbol
    public final void zzg(int i10) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i10);
        zzbh(3, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbol
    public final void zzh(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        Parcel zza = zza();
        zzatx.zzd(zza, zzeVar);
        zzbh(23, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbol
    public final void zzi(int i10, String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i10);
        zza.writeString(str);
        zzbh(22, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbol
    public final void zzj(int i10) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbol
    public final void zzk(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        Parcel zza = zza();
        zzatx.zzd(zza, zzeVar);
        zzbh(24, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbol
    public final void zzl(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzbh(21, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbol
    public final void zzm() throws RemoteException {
        zzbh(8, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbol
    public final void zzn() throws RemoteException {
        zzbh(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbol
    public final void zzo() throws RemoteException {
        zzbh(6, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbol
    public final void zzp() throws RemoteException {
        zzbh(5, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbol
    public final void zzq(String str, String str2) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzbh(9, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbol
    public final void zzr(zzbfq zzbfqVar, String str) throws RemoteException {
        Parcel zza = zza();
        zzatx.zzf(zza, zzbfqVar);
        zza.writeString(str);
        zzbh(10, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbol
    public final void zzs(zzbvp zzbvpVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbol
    public final void zzt(zzbvt zzbvtVar) throws RemoteException {
        Parcel zza = zza();
        zzatx.zzf(zza, zzbvtVar);
        zzbh(16, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbol
    public final void zzu() throws RemoteException {
        zzbh(18, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbol
    public final void zzv() throws RemoteException {
        zzbh(11, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbol
    public final void zzw() throws RemoteException {
        zzbh(15, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbol
    public final void zzx() throws RemoteException {
        zzbh(20, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbol
    public final void zzy() throws RemoteException {
        zzbh(13, zza());
    }
}
