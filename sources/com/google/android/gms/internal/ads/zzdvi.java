package com.google.android.gms.internal.ads;

import android.os.Binder;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzdvi {
    private final zzfyo zza;
    private final zzfyo zzb;
    private final zzdwq zzc;
    private final zzgyn zzd;

    public zzdvi(zzfyo zzfyoVar, zzfyo zzfyoVar2, zzdwq zzdwqVar, zzgyn zzgynVar) {
        this.zza = zzfyoVar;
        this.zzb = zzfyoVar2;
        this.zzc = zzdwqVar;
        this.zzd = zzgynVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ com.google.common.util.concurrent.a zza(zzbun zzbunVar, int i10, zzdxh zzdxhVar) throws Exception {
        return ((zzdzo) this.zzd.zzb()).zzc(zzbunVar, i10);
    }

    public final com.google.common.util.concurrent.a zzb(final zzbun zzbunVar) {
        com.google.common.util.concurrent.a zzf;
        String str = zzbunVar.zzd;
        com.google.android.gms.ads.internal.zzt.zzp();
        if (com.google.android.gms.ads.internal.util.zzs.zzz(str)) {
            zzf = zzfye.zzg(new zzdxh(1));
        } else {
            zzf = zzfye.zzf(this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzdvf
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return zzdvi.this.zzc(zzbunVar);
                }
            }), ExecutionException.class, new zzfxl() { // from class: com.google.android.gms.internal.ads.zzdvg
                @Override // com.google.android.gms.internal.ads.zzfxl
                public final com.google.common.util.concurrent.a zza(Object obj) {
                    return zzfye.zzg(((ExecutionException) obj).getCause());
                }
            }, this.zzb);
        }
        final int callingUid = Binder.getCallingUid();
        return zzfye.zzf(zzf, zzdxh.class, new zzfxl() { // from class: com.google.android.gms.internal.ads.zzdvh
            @Override // com.google.android.gms.internal.ads.zzfxl
            public final com.google.common.util.concurrent.a zza(Object obj) {
                return zzdvi.this.zza(zzbunVar, callingUid, (zzdxh) obj);
            }
        }, this.zzb);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ InputStream zzc(zzbun zzbunVar) throws Exception {
        zzcas zzcasVar;
        final zzdwq zzdwqVar = this.zzc;
        synchronized (zzdwqVar.zzb) {
            if (zzdwqVar.zzc) {
                zzcasVar = zzdwqVar.zza;
            } else {
                zzdwqVar.zzc = true;
                zzdwqVar.zze = zzbunVar;
                zzdwqVar.zzf.checkAvailabilityAndConnect();
                zzdwqVar.zza.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdwp
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzdwq.this.zza();
                    }
                }, zzcan.zzf);
                zzcasVar = zzdwqVar.zza;
            }
        }
        return (InputStream) zzcasVar.get(((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzfr)).intValue(), TimeUnit.SECONDS);
    }
}
