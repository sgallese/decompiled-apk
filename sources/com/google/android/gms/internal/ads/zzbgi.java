package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzbgi extends zzatv implements zzbgk {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbgi(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbgk
    public final void zze(zzbgt zzbgtVar) throws RemoteException {
        Parcel zza = zza();
        zzatx.zzf(zza, zzbgtVar);
        zzbh(1, zza);
    }
}
