package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzbjt extends zzatv implements zzbjv {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbjt(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.h5.client.IH5AdsManagerCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzbjv
    public final zzbjs zze(IObjectWrapper iObjectWrapper, zzbof zzbofVar, int i10, zzbjp zzbjpVar) throws RemoteException {
        zzbjs zzbjqVar;
        Parcel zza = zza();
        zzatx.zzf(zza, iObjectWrapper);
        zzatx.zzf(zza, zzbofVar);
        zza.writeInt(233012000);
        zzatx.zzf(zza, zzbjpVar);
        Parcel zzbg = zzbg(1, zza);
        IBinder readStrongBinder = zzbg.readStrongBinder();
        if (readStrongBinder == null) {
            zzbjqVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.h5.client.IH5AdsManager");
            if (queryLocalInterface instanceof zzbjs) {
                zzbjqVar = (zzbjs) queryLocalInterface;
            } else {
                zzbjqVar = new zzbjq(readStrongBinder);
            }
        }
        zzbg.recycle();
        return zzbjqVar;
    }
}
