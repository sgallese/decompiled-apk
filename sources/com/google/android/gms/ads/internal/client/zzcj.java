package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzatv;
import com.google.android.gms.internal.ads.zzatx;
import com.google.android.gms.internal.ads.zzboe;
import com.google.android.gms.internal.ads.zzbof;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.4.0 */
/* loaded from: classes.dex */
public final class zzcj extends zzatv implements zzcl {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.ILiteSdkInfo");
    }

    @Override // com.google.android.gms.ads.internal.client.zzcl
    public final zzbof getAdapterCreator() throws RemoteException {
        Parcel zzbg = zzbg(2, zza());
        zzbof zzf = zzboe.zzf(zzbg.readStrongBinder());
        zzbg.recycle();
        return zzf;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcl
    public final zzen getLiteSdkVersion() throws RemoteException {
        Parcel zzbg = zzbg(1, zza());
        zzen zzenVar = (zzen) zzatx.zza(zzbg, zzen.CREATOR);
        zzbg.recycle();
        return zzenVar;
    }
}
