package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public abstract class zzbuc extends zzatw implements zzbud {
    public zzbuc() {
        super("com.google.android.gms.ads.internal.request.IAdsService");
    }

    @Override // com.google.android.gms.internal.ads.zzatw
    protected final boolean zzbJ(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        zzbug zzbugVar = null;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    return false;
                }
                zzbtv zzbtvVar = (zzbtv) zzatx.zza(parcel, zzbtv.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdsServiceResponseListener");
                    if (queryLocalInterface instanceof zzbug) {
                        zzbugVar = (zzbug) queryLocalInterface;
                    } else {
                        zzbugVar = new zzbue(readStrongBinder);
                    }
                }
                zzatx.zzc(parcel);
                zze(zzbtvVar, zzbugVar);
            } else {
                zzbtr zzbtrVar = (zzbtr) zzatx.zza(parcel, zzbtr.CREATOR);
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdsServiceResponseListener");
                    if (queryLocalInterface2 instanceof zzbug) {
                        zzbug zzbugVar2 = (zzbug) queryLocalInterface2;
                    }
                }
                zzatx.zzc(parcel);
            }
        } else {
            zzbtr zzbtrVar2 = (zzbtr) zzatx.zza(parcel, zzbtr.CREATOR);
            IBinder readStrongBinder3 = parcel.readStrongBinder();
            if (readStrongBinder3 != null) {
                IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdsServiceResponseListener");
                if (queryLocalInterface3 instanceof zzbug) {
                    zzbugVar = (zzbug) queryLocalInterface3;
                } else {
                    zzbugVar = new zzbue(readStrongBinder3);
                }
            }
            zzatx.zzc(parcel);
            zzf(zzbtrVar2, zzbugVar);
        }
        parcel2.writeNoException();
        return true;
    }
}
