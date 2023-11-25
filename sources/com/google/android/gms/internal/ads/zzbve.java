package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzbve extends zzatv {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbve(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");
    }

    public final void zze(zzbvd zzbvdVar, String str, String str2) throws RemoteException {
        Parcel zza = zza();
        zzatx.zzf(zza, zzbvdVar);
        zza.writeString(str);
        zza.writeString(str2);
        zzbh(2, zza);
    }
}
