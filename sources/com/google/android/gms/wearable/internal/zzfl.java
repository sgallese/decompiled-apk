package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-wearable@@18.1.0 */
/* loaded from: classes3.dex */
public abstract class zzfl extends com.google.android.gms.internal.wearable.zzb implements zzfm {
    public zzfl() {
        super("com.google.android.gms.wearable.internal.IChannelStreamCallbacks");
    }

    @Override // com.google.android.gms.internal.wearable.zzb
    protected final boolean zza(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 2) {
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            com.google.android.gms.internal.wearable.zzc.zzb(parcel);
            zzb(readInt, readInt2);
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
