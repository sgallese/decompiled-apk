package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.4.0 */
/* loaded from: classes3.dex */
public abstract class zzbon extends zzatw implements zzboo {
    public zzbon() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
    }

    public static zzboo zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
        if (queryLocalInterface instanceof zzboo) {
            return (zzboo) queryLocalInterface;
        }
        return new zzbom(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzatw
    protected final boolean zzbJ(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 != 1) {
            if (i10 != 2) {
                return false;
            }
            boolean zzf = zzf();
            parcel2.writeNoException();
            int i12 = zzatx.zza;
            parcel2.writeInt(zzf ? 1 : 0);
        } else {
            IObjectWrapper zze = zze();
            parcel2.writeNoException();
            zzatx.zzf(parcel2, zze);
        }
        return true;
    }
}
