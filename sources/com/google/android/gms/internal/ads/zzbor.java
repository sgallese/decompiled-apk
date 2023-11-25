package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzbor extends zzatv {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbor(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
    }

    public final Bundle zze() throws RemoteException {
        Parcel zzbg = zzbg(13, zza());
        Bundle bundle = (Bundle) zzatx.zza(zzbg, Bundle.CREATOR);
        zzbg.recycle();
        return bundle;
    }

    public final com.google.android.gms.ads.internal.client.zzdq zzf() throws RemoteException {
        Parcel zzbg = zzbg(16, zza());
        com.google.android.gms.ads.internal.client.zzdq zzb = com.google.android.gms.ads.internal.client.zzdp.zzb(zzbg.readStrongBinder());
        zzbg.recycle();
        return zzb;
    }

    public final zzbeo zzg() throws RemoteException {
        Parcel zzbg = zzbg(19, zza());
        zzbeo zzj = zzben.zzj(zzbg.readStrongBinder());
        zzbg.recycle();
        return zzj;
    }

    public final zzbew zzh() throws RemoteException {
        Parcel zzbg = zzbg(5, zza());
        zzbew zzg = zzbev.zzg(zzbg.readStrongBinder());
        zzbg.recycle();
        return zzg;
    }

    public final IObjectWrapper zzi() throws RemoteException {
        Parcel zzbg = zzbg(15, zza());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzbg.readStrongBinder());
        zzbg.recycle();
        return asInterface;
    }

    public final IObjectWrapper zzj() throws RemoteException {
        Parcel zzbg = zzbg(20, zza());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzbg.readStrongBinder());
        zzbg.recycle();
        return asInterface;
    }

    public final IObjectWrapper zzk() throws RemoteException {
        Parcel zzbg = zzbg(21, zza());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzbg.readStrongBinder());
        zzbg.recycle();
        return asInterface;
    }

    public final String zzl() throws RemoteException {
        Parcel zzbg = zzbg(7, zza());
        String readString = zzbg.readString();
        zzbg.recycle();
        return readString;
    }

    public final String zzm() throws RemoteException {
        Parcel zzbg = zzbg(4, zza());
        String readString = zzbg.readString();
        zzbg.recycle();
        return readString;
    }

    public final String zzn() throws RemoteException {
        Parcel zzbg = zzbg(6, zza());
        String readString = zzbg.readString();
        zzbg.recycle();
        return readString;
    }

    public final String zzo() throws RemoteException {
        Parcel zzbg = zzbg(2, zza());
        String readString = zzbg.readString();
        zzbg.recycle();
        return readString;
    }

    public final List zzp() throws RemoteException {
        Parcel zzbg = zzbg(3, zza());
        ArrayList zzb = zzatx.zzb(zzbg);
        zzbg.recycle();
        return zzb;
    }

    public final void zzq(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzatx.zzf(zza, iObjectWrapper);
        zzbh(9, zza);
    }

    public final void zzr() throws RemoteException {
        zzbh(8, zza());
    }

    public final void zzs(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzatx.zzf(zza, iObjectWrapper);
        zzbh(10, zza);
    }

    public final void zzt(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) throws RemoteException {
        Parcel zza = zza();
        zzatx.zzf(zza, iObjectWrapper);
        zzatx.zzf(zza, iObjectWrapper2);
        zzatx.zzf(zza, iObjectWrapper3);
        zzbh(22, zza);
    }

    public final void zzu(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzatx.zzf(zza, iObjectWrapper);
        zzbh(14, zza);
    }

    public final boolean zzv() throws RemoteException {
        Parcel zzbg = zzbg(12, zza());
        boolean zzg = zzatx.zzg(zzbg);
        zzbg.recycle();
        return zzg;
    }

    public final boolean zzw() throws RemoteException {
        Parcel zzbg = zzbg(11, zza());
        boolean zzg = zzatx.zzg(zzbg);
        zzbg.recycle();
        return zzg;
    }
}
