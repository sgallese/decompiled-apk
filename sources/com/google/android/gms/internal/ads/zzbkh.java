package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzbkh extends zzatv {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbkh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
    }

    public final void zze(zzbkb zzbkbVar, zzbkg zzbkgVar) throws RemoteException {
        Parcel zza = zza();
        zzatx.zzd(zza, zzbkbVar);
        zzatx.zzf(zza, zzbkgVar);
        zzbi(2, zza);
    }
}
