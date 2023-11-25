package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzbee extends zzatv {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbee(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy");
    }

    public final void zze(zzbtm zzbtmVar) throws RemoteException {
        Parcel zza = zza();
        zzatx.zzf(zza, zzbtmVar);
        zzbh(1, zza);
    }
}
