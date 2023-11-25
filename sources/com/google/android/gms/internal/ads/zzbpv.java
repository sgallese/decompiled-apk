package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.4.0 */
/* loaded from: classes3.dex */
public abstract class zzbpv extends zzatw implements zzbpw {
    public zzbpv() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzatw
    protected final boolean zzbJ(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    return false;
                }
                com.google.android.gms.ads.internal.client.zze zzeVar = (com.google.android.gms.ads.internal.client.zze) zzatx.zza(parcel, com.google.android.gms.ads.internal.client.zze.CREATOR);
                zzatx.zzc(parcel);
                zzf(zzeVar);
            } else {
                String readString = parcel.readString();
                zzatx.zzc(parcel);
                zze(readString);
            }
        } else {
            zzbou zzb = zzbot.zzb(parcel.readStrongBinder());
            zzatx.zzc(parcel);
            zzg(zzb);
        }
        parcel2.writeNoException();
        return true;
    }
}
