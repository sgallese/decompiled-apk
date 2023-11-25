package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzbfy extends zzatv implements zzbga {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbfy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbga
    public final void zze(zzbfq zzbfqVar, String str) throws RemoteException {
        Parcel zza = zza();
        zzatx.zzf(zza, zzbfqVar);
        zza.writeString(str);
        zzbh(1, zza);
    }
}
