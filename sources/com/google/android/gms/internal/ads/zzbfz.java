package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.4.0 */
/* loaded from: classes3.dex */
public abstract class zzbfz extends zzatw implements zzbga {
    public zzbfz() {
        super("com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
    }

    public static zzbga zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
        if (queryLocalInterface instanceof zzbga) {
            return (zzbga) queryLocalInterface;
        }
        return new zzbfy(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzatw
    protected final boolean zzbJ(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        zzbfq zzbfoVar;
        if (i10 == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                zzbfoVar = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
                if (queryLocalInterface instanceof zzbfq) {
                    zzbfoVar = (zzbfq) queryLocalInterface;
                } else {
                    zzbfoVar = new zzbfo(readStrongBinder);
                }
            }
            String readString = parcel.readString();
            zzatx.zzc(parcel);
            zze(zzbfoVar, readString);
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
