package com.google.android.gms.wearable.internal;

import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.MessageOptions;
import com.google.android.gms.wearable.PutDataRequest;

/* compiled from: com.google.android.gms:play-services-wearable@@18.1.0 */
/* loaded from: classes3.dex */
public final class zzft extends com.google.android.gms.internal.wearable.zza {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzft(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.wearable.internal.IWearableService");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzA(zzfp zzfpVar, String str, String str2, byte[] bArr, MessageOptions messageOptions) throws RemoteException {
        Parcel zza = zza();
        int i10 = com.google.android.gms.internal.wearable.zzc.zza;
        zza.writeStrongBinder(zzfpVar);
        zza.writeString(str);
        zza.writeString(str2);
        zza.writeByteArray(bArr);
        com.google.android.gms.internal.wearable.zzc.zzc(zza, messageOptions);
        zzP(59, zza);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzB(zzfp zzfpVar, String str, String str2, byte[] bArr) throws RemoteException {
        Parcel zza = zza();
        int i10 = com.google.android.gms.internal.wearable.zzc.zza;
        zza.writeStrongBinder(zzfpVar);
        zza.writeString(str);
        zza.writeString(str2);
        zza.writeByteArray(bArr);
        zzP(58, zza);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzC(zzfp zzfpVar, String str, ParcelFileDescriptor parcelFileDescriptor) throws RemoteException {
        Parcel zza = zza();
        int i10 = com.google.android.gms.internal.wearable.zzc.zza;
        zza.writeStrongBinder(zzfpVar);
        zza.writeString(str);
        com.google.android.gms.internal.wearable.zzc.zzc(zza, parcelFileDescriptor);
        zzP(38, zza);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzd(zzfp zzfpVar, zzf zzfVar) throws RemoteException {
        Parcel zza = zza();
        int i10 = com.google.android.gms.internal.wearable.zzc.zza;
        zza.writeStrongBinder(zzfpVar);
        com.google.android.gms.internal.wearable.zzc.zzc(zza, zzfVar);
        zzP(16, zza);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zze(zzfp zzfpVar, String str) throws RemoteException {
        Parcel zza = zza();
        int i10 = com.google.android.gms.internal.wearable.zzc.zza;
        zza.writeStrongBinder(zzfpVar);
        zza.writeString(str);
        zzP(46, zza);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzf(zzfp zzfpVar, String str) throws RemoteException {
        Parcel zza = zza();
        int i10 = com.google.android.gms.internal.wearable.zzc.zza;
        zza.writeStrongBinder(zzfpVar);
        zza.writeString(str);
        zzP(32, zza);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzg(zzfp zzfpVar, String str, int i10) throws RemoteException {
        Parcel zza = zza();
        int i11 = com.google.android.gms.internal.wearable.zzc.zza;
        zza.writeStrongBinder(zzfpVar);
        zza.writeString(str);
        zza.writeInt(i10);
        zzP(33, zza);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzh(zzfp zzfpVar, Uri uri, int i10) throws RemoteException {
        Parcel zza = zza();
        int i11 = com.google.android.gms.internal.wearable.zzc.zza;
        zza.writeStrongBinder(zzfpVar);
        com.google.android.gms.internal.wearable.zzc.zzc(zza, uri);
        zza.writeInt(i10);
        zzP(41, zza);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzi(zzfp zzfpVar, int i10) throws RemoteException {
        Parcel zza = zza();
        int i11 = com.google.android.gms.internal.wearable.zzc.zza;
        zza.writeStrongBinder(zzfpVar);
        zza.writeInt(i10);
        zzP(43, zza);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzj(zzfp zzfpVar, String str, int i10) throws RemoteException {
        Parcel zza = zza();
        int i11 = com.google.android.gms.internal.wearable.zzc.zza;
        zza.writeStrongBinder(zzfpVar);
        zza.writeString(str);
        zza.writeInt(i10);
        zzP(42, zza);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzk(zzfp zzfpVar, zzfm zzfmVar, String str) throws RemoteException {
        Parcel zza = zza();
        int i10 = com.google.android.gms.internal.wearable.zzc.zza;
        zza.writeStrongBinder(zzfpVar);
        zza.writeStrongBinder(zzfmVar);
        zza.writeString(str);
        zzP(34, zza);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzl(zzfp zzfpVar, zzfm zzfmVar, String str) throws RemoteException {
        Parcel zza = zza();
        int i10 = com.google.android.gms.internal.wearable.zzc.zza;
        zza.writeStrongBinder(zzfpVar);
        zza.writeStrongBinder(zzfmVar);
        zza.writeString(str);
        zzP(35, zza);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzm(zzfp zzfpVar, String str) throws RemoteException {
        Parcel zza = zza();
        int i10 = com.google.android.gms.internal.wearable.zzc.zza;
        zza.writeStrongBinder(zzfpVar);
        zza.writeString(str);
        zzP(63, zza);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzn(zzfp zzfpVar) throws RemoteException {
        Parcel zza = zza();
        int i10 = com.google.android.gms.internal.wearable.zzc.zza;
        zza.writeStrongBinder(zzfpVar);
        zzP(15, zza);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzo(zzfp zzfpVar, Uri uri) throws RemoteException {
        Parcel zza = zza();
        int i10 = com.google.android.gms.internal.wearable.zzc.zza;
        zza.writeStrongBinder(zzfpVar);
        com.google.android.gms.internal.wearable.zzc.zzc(zza, uri);
        zzP(7, zza);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzp(zzfp zzfpVar) throws RemoteException {
        Parcel zza = zza();
        int i10 = com.google.android.gms.internal.wearable.zzc.zza;
        zza.writeStrongBinder(zzfpVar);
        zzP(8, zza);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzq(zzfp zzfpVar, Uri uri, int i10) throws RemoteException {
        Parcel zza = zza();
        int i11 = com.google.android.gms.internal.wearable.zzc.zza;
        zza.writeStrongBinder(zzfpVar);
        com.google.android.gms.internal.wearable.zzc.zzc(zza, uri);
        zza.writeInt(i10);
        zzP(40, zza);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzr(zzfp zzfpVar, Asset asset) throws RemoteException {
        Parcel zza = zza();
        int i10 = com.google.android.gms.internal.wearable.zzc.zza;
        zza.writeStrongBinder(zzfpVar);
        com.google.android.gms.internal.wearable.zzc.zzc(zza, asset);
        zzP(13, zza);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzs(zzfp zzfpVar) throws RemoteException {
        Parcel zza = zza();
        int i10 = com.google.android.gms.internal.wearable.zzc.zza;
        zza.writeStrongBinder(zzfpVar);
        zzP(14, zza);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzt(zzfp zzfpVar, String str) throws RemoteException {
        Parcel zza = zza();
        int i10 = com.google.android.gms.internal.wearable.zzc.zza;
        zza.writeStrongBinder(zzfpVar);
        zza.writeString(str);
        zzP(67, zza);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzu(zzfp zzfpVar, String str, String str2) throws RemoteException {
        Parcel zza = zza();
        int i10 = com.google.android.gms.internal.wearable.zzc.zza;
        zza.writeStrongBinder(zzfpVar);
        zza.writeString(str);
        zza.writeString(str2);
        zzP(31, zza);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzv(zzfp zzfpVar, PutDataRequest putDataRequest) throws RemoteException {
        Parcel zza = zza();
        int i10 = com.google.android.gms.internal.wearable.zzc.zza;
        zza.writeStrongBinder(zzfpVar);
        com.google.android.gms.internal.wearable.zzc.zzc(zza, putDataRequest);
        zzP(6, zza);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzw(zzfp zzfpVar, String str, ParcelFileDescriptor parcelFileDescriptor, long j10, long j11) throws RemoteException {
        Parcel zza = zza();
        int i10 = com.google.android.gms.internal.wearable.zzc.zza;
        zza.writeStrongBinder(zzfpVar);
        zza.writeString(str);
        com.google.android.gms.internal.wearable.zzc.zzc(zza, parcelFileDescriptor);
        zza.writeLong(j10);
        zza.writeLong(j11);
        zzP(39, zza);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzx(zzfp zzfpVar, zzhq zzhqVar) throws RemoteException {
        Parcel zza = zza();
        int i10 = com.google.android.gms.internal.wearable.zzc.zza;
        zza.writeStrongBinder(zzfpVar);
        com.google.android.gms.internal.wearable.zzc.zzc(zza, zzhqVar);
        zzP(17, zza);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzy(zzfp zzfpVar, String str) throws RemoteException {
        Parcel zza = zza();
        int i10 = com.google.android.gms.internal.wearable.zzc.zza;
        zza.writeStrongBinder(zzfpVar);
        zza.writeString(str);
        zzP(47, zza);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzz(zzfp zzfpVar, String str, String str2, byte[] bArr) throws RemoteException {
        Parcel zza = zza();
        int i10 = com.google.android.gms.internal.wearable.zzc.zza;
        zza.writeStrongBinder(zzfpVar);
        zza.writeString(str);
        zza.writeString(str2);
        zza.writeByteArray(bArr);
        zzP(12, zza);
    }
}
