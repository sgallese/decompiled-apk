package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.4.0 */
/* loaded from: classes3.dex */
public abstract class zzbru extends zzatw implements zzbrv {
    public zzbru() {
        super("com.google.android.gms.ads.internal.offline.IOfflineUtils");
    }

    public static zzbrv zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtils");
        if (queryLocalInterface instanceof zzbrv) {
            return (zzbrv) queryLocalInterface;
        }
        return new zzbrt(iBinder);
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
                        String[] createStringArray = parcel.createStringArray();
                        int[] createIntArray = parcel.createIntArray();
                        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                        zzatx.zzc(parcel);
                        zzf(createStringArray, createIntArray, asInterface);
                    } else {
                        IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                        zzatx.zzc(parcel);
                        zzg(asInterface2);
                    }
                } else {
                    zzh();
                }
            } else {
                IObjectWrapper asInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                zzatx.zzc(parcel);
                zzi(asInterface3, readString, readString2);
            }
        } else {
            Intent intent = (Intent) zzatx.zza(parcel, Intent.CREATOR);
            zzatx.zzc(parcel);
            zze(intent);
        }
        parcel2.writeNoException();
        return true;
    }
}
