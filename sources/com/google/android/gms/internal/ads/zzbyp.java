package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzbyp extends zzatv implements zzbyr {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbyp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    @Override // com.google.android.gms.internal.ads.zzbyr
    public final void zze(IObjectWrapper iObjectWrapper, zzbyv zzbyvVar, zzbyo zzbyoVar) throws RemoteException {
        Parcel zza = zza();
        zzatx.zzf(zza, iObjectWrapper);
        zzatx.zzd(zza, zzbyvVar);
        zzatx.zzf(zza, zzbyoVar);
        zzbh(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbyr
    public final void zzf(zzbta zzbtaVar) throws RemoteException {
        Parcel zza = zza();
        zzatx.zzd(zza, zzbtaVar);
        zzbh(7, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbyr
    public final void zzg(List list, IObjectWrapper iObjectWrapper, zzbsr zzbsrVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeTypedList(list);
        zzatx.zzf(zza, iObjectWrapper);
        zzatx.zzf(zza, zzbsrVar);
        zzbh(10, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbyr
    public final void zzh(List list, IObjectWrapper iObjectWrapper, zzbsr zzbsrVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeTypedList(list);
        zzatx.zzf(zza, iObjectWrapper);
        zzatx.zzf(zza, zzbsrVar);
        zzbh(9, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbyr
    public final void zzi(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzatx.zzf(zza, iObjectWrapper);
        zzbh(8, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbyr
    public final void zzj(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzatx.zzf(zza, iObjectWrapper);
        zzbh(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbyr
    public final void zzk(List list, IObjectWrapper iObjectWrapper, zzbsr zzbsrVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeTypedList(list);
        zzatx.zzf(zza, iObjectWrapper);
        zzatx.zzf(zza, zzbsrVar);
        zzbh(6, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbyr
    public final void zzl(List list, IObjectWrapper iObjectWrapper, zzbsr zzbsrVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeTypedList(list);
        zzatx.zzf(zza, iObjectWrapper);
        zzatx.zzf(zza, zzbsrVar);
        zzbh(5, zza);
    }
}
