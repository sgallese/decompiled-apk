package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzfps extends zzatv implements zzfpu {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfps(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.lmd.protocol.ILmdOverlayService");
    }

    @Override // com.google.android.gms.internal.ads.zzfpu
    public final void zze(Bundle bundle, zzfpw zzfpwVar) throws RemoteException {
        Parcel zza = zza();
        zzatx.zzd(zza, bundle);
        zzatx.zzf(zza, zzfpwVar);
        zzbi(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfpu
    public final void zzf(String str, Bundle bundle, zzfpw zzfpwVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzatx.zzd(zza, bundle);
        zzatx.zzf(zza, zzfpwVar);
        zzbi(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfpu
    public final void zzg(Bundle bundle, zzfpw zzfpwVar) throws RemoteException {
        Parcel zza = zza();
        zzatx.zzd(zza, bundle);
        zzatx.zzf(zza, zzfpwVar);
        zzbi(3, zza);
    }
}
