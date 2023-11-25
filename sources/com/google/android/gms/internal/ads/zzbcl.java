package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.4.0 */
/* loaded from: classes3.dex */
public abstract class zzbcl extends zzatw implements zzbcm {
    public zzbcl() {
        super("com.google.android.gms.ads.internal.customrenderedad.client.ICustomRenderedAd");
    }

    @Override // com.google.android.gms.internal.ads.zzatw
    protected final boolean zzbJ(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            return false;
                        }
                        zzf();
                        parcel2.writeNoException();
                    } else {
                        zze();
                        parcel2.writeNoException();
                    }
                } else {
                    IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    zzatx.zzc(parcel);
                    zzd(asInterface);
                    parcel2.writeNoException();
                }
            } else {
                String zzc = zzc();
                parcel2.writeNoException();
                parcel2.writeString(zzc);
            }
        } else {
            String zzb = zzb();
            parcel2.writeNoException();
            parcel2.writeString(zzb);
        }
        return true;
    }
}
