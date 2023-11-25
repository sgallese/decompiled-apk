package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzcaa;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.4.0 */
/* loaded from: classes.dex */
final class zzev implements Runnable {
    final /* synthetic */ zzew zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzev(zzew zzewVar) {
        this.zza = zzewVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbh zzbhVar;
        zzbh zzbhVar2;
        zzew zzewVar = this.zza;
        zzbhVar = zzewVar.zza;
        if (zzbhVar != null) {
            try {
                zzbhVar2 = zzewVar.zza;
                zzbhVar2.zze(1);
            } catch (RemoteException e10) {
                zzcaa.zzk("Could not notify onAdFailedToLoad event.", e10);
            }
        }
    }
}
