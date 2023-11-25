package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzffv {
    final /* synthetic */ zzffw zza;
    private final Object zzb;
    private final String zzc;
    private final com.google.common.util.concurrent.a zzd;
    private final List zze;
    private final com.google.common.util.concurrent.a zzf;

    private zzffv(zzffw zzffwVar, Object obj, String str, com.google.common.util.concurrent.a aVar, List list, com.google.common.util.concurrent.a aVar2) {
        this.zza = zzffwVar;
        this.zzb = obj;
        this.zzc = str;
        this.zzd = aVar;
        this.zze = list;
        this.zzf = aVar2;
    }

    public final zzffj zza() {
        zzffx zzffxVar;
        Object obj = this.zzb;
        String str = this.zzc;
        if (str == null) {
            str = this.zza.zzf(obj);
        }
        final zzffj zzffjVar = new zzffj(obj, str, this.zzf);
        zzffxVar = this.zza.zzd;
        zzffxVar.zza(zzffjVar);
        com.google.common.util.concurrent.a aVar = this.zzd;
        Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzffp
            @Override // java.lang.Runnable
            public final void run() {
                zzffx zzffxVar2;
                zzffv zzffvVar = zzffv.this;
                zzffj zzffjVar2 = zzffjVar;
                zzffxVar2 = zzffvVar.zza.zzd;
                zzffxVar2.zzc(zzffjVar2);
            }
        };
        zzfyo zzfyoVar = zzcan.zzf;
        aVar.addListener(runnable, zzfyoVar);
        zzfye.zzr(zzffjVar, new zzfft(this, zzffjVar), zzfyoVar);
        return zzffjVar;
    }

    public final zzffv zzb(Object obj) {
        return this.zza.zzb(obj, zza());
    }

    public final zzffv zzc(Class cls, zzfxl zzfxlVar) {
        zzfyo zzfyoVar;
        zzffw zzffwVar = this.zza;
        Object obj = this.zzb;
        String str = this.zzc;
        com.google.common.util.concurrent.a aVar = this.zzd;
        List list = this.zze;
        com.google.common.util.concurrent.a aVar2 = this.zzf;
        zzfyoVar = zzffwVar.zzb;
        return new zzffv(zzffwVar, obj, str, aVar, list, zzfye.zzf(aVar2, cls, zzfxlVar, zzfyoVar));
    }

    public final zzffv zzd(final com.google.common.util.concurrent.a aVar) {
        return zzg(new zzfxl() { // from class: com.google.android.gms.internal.ads.zzffq
            @Override // com.google.android.gms.internal.ads.zzfxl
            public final com.google.common.util.concurrent.a zza(Object obj) {
                return com.google.common.util.concurrent.a.this;
            }
        }, zzcan.zzf);
    }

    public final zzffv zze(final zzffh zzffhVar) {
        return zzf(new zzfxl() { // from class: com.google.android.gms.internal.ads.zzffs
            @Override // com.google.android.gms.internal.ads.zzfxl
            public final com.google.common.util.concurrent.a zza(Object obj) {
                return zzfye.zzh(zzffh.this.zza(obj));
            }
        });
    }

    public final zzffv zzf(zzfxl zzfxlVar) {
        zzfyo zzfyoVar;
        zzfyoVar = this.zza.zzb;
        return zzg(zzfxlVar, zzfyoVar);
    }

    public final zzffv zzg(zzfxl zzfxlVar, Executor executor) {
        return new zzffv(this.zza, this.zzb, this.zzc, this.zzd, this.zze, zzfye.zzn(this.zzf, zzfxlVar, executor));
    }

    public final zzffv zzh(String str) {
        return new zzffv(this.zza, this.zzb, str, this.zzd, this.zze, this.zzf);
    }

    public final zzffv zzi(long j10, TimeUnit timeUnit) {
        ScheduledExecutorService scheduledExecutorService;
        zzffw zzffwVar = this.zza;
        Object obj = this.zzb;
        String str = this.zzc;
        com.google.common.util.concurrent.a aVar = this.zzd;
        List list = this.zze;
        com.google.common.util.concurrent.a aVar2 = this.zzf;
        scheduledExecutorService = zzffwVar.zzc;
        return new zzffv(zzffwVar, obj, str, aVar, list, zzfye.zzo(aVar2, j10, timeUnit, scheduledExecutorService));
    }
}
