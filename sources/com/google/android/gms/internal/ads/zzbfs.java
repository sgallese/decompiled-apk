package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzbfs extends zzatv implements zzbfu {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbfs(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbfu
    public final void zze(zzbfl zzbflVar) throws RemoteException {
        Parcel zza = zza();
        zzatx.zzf(zza, zzbflVar);
        zzbh(1, zza);
    }
}
