package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.4.0 */
/* loaded from: classes3.dex */
public abstract class zzbyn extends zzatw implements zzbyo {
    public zzbyn() {
        super("com.google.android.gms.ads.internal.signals.ISignalCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzatw
    protected final boolean zzbJ(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    return false;
                }
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                Bundle bundle = (Bundle) zzatx.zza(parcel, Bundle.CREATOR);
                zzatx.zzc(parcel);
                zzc(readString, readString2, bundle);
            } else {
                String readString3 = parcel.readString();
                zzatx.zzc(parcel);
                zzb(readString3);
            }
        } else {
            parcel.readString();
            parcel.readString();
            zzatx.zzc(parcel);
        }
        parcel2.writeNoException();
        return true;
    }
}
