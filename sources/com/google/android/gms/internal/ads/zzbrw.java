package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzbrw extends zzatv implements zzbry {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbrw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.offline.IOfflineUtilsCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzbry
    public final zzbrv zze(IObjectWrapper iObjectWrapper, zzbof zzbofVar, int i10) throws RemoteException {
        zzbrv zzbrtVar;
        Parcel zza = zza();
        zzatx.zzf(zza, iObjectWrapper);
        zzatx.zzf(zza, zzbofVar);
        zza.writeInt(233012000);
        Parcel zzbg = zzbg(1, zza);
        IBinder readStrongBinder = zzbg.readStrongBinder();
        if (readStrongBinder == null) {
            zzbrtVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtils");
            if (queryLocalInterface instanceof zzbrv) {
                zzbrtVar = (zzbrv) queryLocalInterface;
            } else {
                zzbrtVar = new zzbrt(readStrongBinder);
            }
        }
        zzbg.recycle();
        return zzbrtVar;
    }
}
