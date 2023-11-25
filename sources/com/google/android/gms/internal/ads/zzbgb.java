package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzbgb extends zzatv implements zzbgd {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbgb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbgd
    public final void zze(zzbfq zzbfqVar) throws RemoteException {
        Parcel zza = zza();
        zzatx.zzf(zza, zzbfqVar);
        zzbh(1, zza);
    }
}
