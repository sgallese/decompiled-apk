package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzbcn extends zzatv implements zzbcp {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbcn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbcp
    public final void zze(zzbcm zzbcmVar) throws RemoteException {
        Parcel zza = zza();
        zzatx.zzf(zza, zzbcmVar);
        zzbh(1, zza);
    }
}
