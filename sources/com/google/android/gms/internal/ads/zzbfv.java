package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzbfv extends zzatv implements zzbfx {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbfv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbfx
    public final void zze(zzbfn zzbfnVar) throws RemoteException {
        Parcel zza = zza();
        zzatx.zzf(zza, zzbfnVar);
        zzbh(1, zza);
    }
}
