package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzcoa implements zzfya {
    final /* synthetic */ zzfik zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzcob zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcoa(zzcob zzcobVar, zzfik zzfikVar, String str) {
        this.zzc = zzcobVar;
        this.zza = zzfikVar;
        this.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzfya
    public final void zza(final Throwable th) {
        zzfyo zzfyoVar;
        zzfyoVar = this.zzc.zze;
        final zzfik zzfikVar = this.zza;
        final String str = this.zzb;
        zzfyoVar.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcny
            @Override // java.lang.Runnable
            public final void run() {
                Context context;
                zzbth zzbthVar;
                zzcoa zzcoaVar = zzcoa.this;
                Throwable th2 = th;
                zzfik zzfikVar2 = zzfikVar;
                String str2 = str;
                zzcob zzcobVar = zzcoaVar.zzc;
                context = zzcobVar.zza;
                zzcobVar.zzh = zzbtf.zza(context);
                zzbthVar = zzcoaVar.zzc.zzh;
                zzbthVar.zzf(th2, "AttributionReporting.registerSourceAndPingClickUrl");
                zzfikVar2.zzc(str2, null);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfya
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfyo zzfyoVar;
        final String str = (String) obj;
        zzfyoVar = this.zzc.zze;
        final zzfik zzfikVar = this.zza;
        zzfyoVar.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcnz
            @Override // java.lang.Runnable
            public final void run() {
                zzfik.this.zzc(str, null);
            }
        });
    }
}
