package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzcaa;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.4.0 */
/* loaded from: classes.dex */
final class zzer implements Runnable {
    final /* synthetic */ zzet zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzer(zzet zzetVar) {
        this.zza = zzetVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzeu zzeuVar = this.zza.zza;
        if (zzeu.zzb(zzeuVar) != null) {
            try {
                zzeu.zzb(zzeuVar).zze(1);
            } catch (RemoteException e10) {
                zzcaa.zzk("Could not notify onAdFailedToLoad event.", e10);
            }
        }
    }
}
