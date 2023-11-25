package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzbys extends zzatv implements zzbyu {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbys(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalGeneratorCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzbyu
    public final zzbyr zze(IObjectWrapper iObjectWrapper, zzbof zzbofVar, int i10) throws RemoteException {
        zzbyr zzbypVar;
        Parcel zza = zza();
        zzatx.zzf(zza, iObjectWrapper);
        zzatx.zzf(zza, zzbofVar);
        zza.writeInt(233012000);
        Parcel zzbg = zzbg(2, zza);
        IBinder readStrongBinder = zzbg.readStrongBinder();
        if (readStrongBinder == null) {
            zzbypVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGenerator");
            if (queryLocalInterface instanceof zzbyr) {
                zzbypVar = (zzbyr) queryLocalInterface;
            } else {
                zzbypVar = new zzbyp(readStrongBinder);
            }
        }
        zzbg.recycle();
        return zzbypVar;
    }
}
