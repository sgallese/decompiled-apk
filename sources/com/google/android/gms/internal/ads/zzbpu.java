package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzbpu extends zzatv implements zzbpw {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbpu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbpw
    public final void zze(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString("Adapter returned null.");
        zzbh(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpw
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        Parcel zza = zza();
        zzatx.zzd(zza, zzeVar);
        zzbh(3, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpw
    public final void zzg(zzbou zzbouVar) throws RemoteException {
        Parcel zza = zza();
        zzatx.zzf(zza, zzbouVar);
        zzbh(1, zza);
    }
}
