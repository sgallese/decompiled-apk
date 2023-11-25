package com.google.android.gms.internal.ads;

import android.os.Binder;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzdwd {
    private final ScheduledExecutorService zza;
    private final zzfyo zzb;
    private final zzfyo zzc;
    private final zzdwu zzd;
    private final zzgyn zze;

    public zzdwd(ScheduledExecutorService scheduledExecutorService, zzfyo zzfyoVar, zzfyo zzfyoVar2, zzdwu zzdwuVar, zzgyn zzgynVar) {
        this.zza = scheduledExecutorService;
        this.zzb = zzfyoVar;
        this.zzc = zzfyoVar2;
        this.zzd = zzdwuVar;
        this.zze = zzgynVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ com.google.common.util.concurrent.a zza(zzbun zzbunVar, int i10, Throwable th) throws Exception {
        return ((zzdzo) this.zze.zzb()).zzd(zzbunVar, i10);
    }

    public final com.google.common.util.concurrent.a zzb(final zzbun zzbunVar) {
        com.google.common.util.concurrent.a zzb;
        String str = zzbunVar.zzd;
        com.google.android.gms.ads.internal.zzt.zzp();
        if (com.google.android.gms.ads.internal.util.zzs.zzz(str)) {
            zzb = zzfye.zzg(new zzdxh(1));
        } else {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzhs)).booleanValue()) {
                zzb = this.zzc.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzdwb
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return zzdwd.this.zzc(zzbunVar);
                    }
                });
            } else {
                zzb = this.zzd.zzb(zzbunVar);
            }
        }
        final int callingUid = Binder.getCallingUid();
        return zzfye.zzf((zzfxv) zzfye.zzo(zzfxv.zzu(zzb), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzfr)).intValue(), TimeUnit.SECONDS, this.zza), Throwable.class, new zzfxl() { // from class: com.google.android.gms.internal.ads.zzdwc
            @Override // com.google.android.gms.internal.ads.zzfxl
            public final com.google.common.util.concurrent.a zza(Object obj) {
                return zzdwd.this.zza(zzbunVar, callingUid, (Throwable) obj);
            }
        }, this.zzb);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ InputStream zzc(zzbun zzbunVar) throws Exception {
        return (InputStream) this.zzd.zzb(zzbunVar).get(((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzfr)).intValue(), TimeUnit.SECONDS);
    }
}
