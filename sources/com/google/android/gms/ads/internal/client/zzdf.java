package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzatw;
import com.google.android.gms.internal.ads.zzatx;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.4.0 */
/* loaded from: classes.dex */
public abstract class zzdf extends zzatw implements zzdg {
    public zzdf() {
        super("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
    }

    public static zzdg zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
        if (queryLocalInterface instanceof zzdg) {
            return (zzdg) queryLocalInterface;
        }
        return new zzde(iBinder);
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
            zzs zzsVar = (zzs) zzatx.zza(parcel, zzs.CREATOR);
            zzatx.zzc(parcel);
            zze(zzsVar);
            parcel2.writeNoException();
        }
        return true;
    }
}
