package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public abstract class zzbkf extends zzatw implements zzbkg {
    public zzbkf() {
        super("com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzatw
    protected final boolean zzbJ(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) zzatx.zza(parcel, ParcelFileDescriptor.CREATOR);
            zzatx.zzc(parcel);
            zzb(parcelFileDescriptor);
            return true;
        }
        return false;
    }
}
