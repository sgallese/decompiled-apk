package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzavz extends zzatv implements zzawb {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzavz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzawb
    public final void zzb(int i10) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i10);
        zzbh(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzawb
    public final void zzc(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        Parcel zza = zza();
        zzatx.zzd(zza, zzeVar);
        zzbh(3, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzawb
    public final void zzd(zzavy zzavyVar) throws RemoteException {
        Parcel zza = zza();
        zzatx.zzf(zza, zzavyVar);
        zzbh(1, zza);
    }
}
