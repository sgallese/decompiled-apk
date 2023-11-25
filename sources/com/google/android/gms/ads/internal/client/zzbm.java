package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzatw;
import com.google.android.gms.internal.ads.zzatx;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.4.0 */
/* loaded from: classes.dex */
public abstract class zzbm extends zzatw implements zzbn {
    public zzbm() {
        super("com.google.android.gms.ads.internal.client.IAdLoader");
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
                        zzl zzlVar = (zzl) zzatx.zza(parcel, zzl.CREATOR);
                        int readInt = parcel.readInt();
                        zzatx.zzc(parcel);
                        zzh(zzlVar, readInt);
                        parcel2.writeNoException();
                    } else {
                        String zzf = zzf();
                        parcel2.writeNoException();
                        parcel2.writeString(zzf);
                    }
                } else {
                    boolean zzi = zzi();
                    parcel2.writeNoException();
                    int i12 = zzatx.zza;
                    parcel2.writeInt(zzi ? 1 : 0);
                }
            } else {
                String zze = zze();
                parcel2.writeNoException();
                parcel2.writeString(zze);
            }
        } else {
            zzl zzlVar2 = (zzl) zzatx.zza(parcel, zzl.CREATOR);
            zzatx.zzc(parcel);
            zzg(zzlVar2);
            parcel2.writeNoException();
        }
        return true;
    }
}
