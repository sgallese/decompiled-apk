package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.ExecutorService;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzaxk {
    zzaua zza;
    boolean zzb;
    private final ExecutorService zzc;

    public zzaxk() {
        this.zzc = zzbzp.zzb;
    }

    public zzaxk(final Context context) {
        ExecutorService executorService = zzbzp.zzb;
        this.zzc = executorService;
        executorService.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzaxf
            @Override // java.lang.Runnable
            public final void run() {
                zzaxk zzaxkVar = zzaxk.this;
                Context context2 = context;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzeL)).booleanValue()) {
                    try {
                        zzaxkVar.zza = (zzaua) zzcae.zzb(context2, "com.google.android.gms.ads.clearcut.DynamiteClearcutLogger", new zzcac() { // from class: com.google.android.gms.internal.ads.zzaxg
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // com.google.android.gms.internal.ads.zzcac
                            public final Object zza(Object obj) {
                                return zzatz.zzb(obj);
                            }
                        });
                        zzaxkVar.zza.zze(ObjectWrapper.wrap(context2), "GMA_SDK");
                        zzaxkVar.zzb = true;
                    } catch (RemoteException | zzcad | NullPointerException unused) {
                        zzcaa.zze("Cannot dynamite load clearcut");
                    }
                }
            }
        });
    }
}
