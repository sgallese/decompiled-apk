package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzbkq extends zzatv implements zzbks {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbkq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbks
    public final void zze(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzbh(3, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbks
    public final void zzf() throws RemoteException {
        zzbh(2, zza());
    }
}
