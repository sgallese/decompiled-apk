package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzehb implements zzfya {
    final /* synthetic */ long zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzfbe zzc;
    final /* synthetic */ zzfbi zzd;
    final /* synthetic */ zzfig zze;
    final /* synthetic */ zzfbr zzf;
    final /* synthetic */ zzehc zzg;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzehb(zzehc zzehcVar, long j10, String str, zzfbe zzfbeVar, zzfbi zzfbiVar, zzfig zzfigVar, zzfbr zzfbrVar) {
        this.zzg = zzehcVar;
        this.zza = j10;
        this.zzb = str;
        this.zzc = zzfbeVar;
        this.zzd = zzfbiVar;
        this.zze = zzfigVar;
        this.zzf = zzfbrVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a1  */
    @Override // com.google.android.gms.internal.ads.zzfya
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zza(java.lang.Throwable r13) {
        /*
            Method dump skipped, instructions count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzehb.zza(java.lang.Throwable):void");
    }

    @Override // com.google.android.gms.internal.ads.zzfya
    public final void zzb(Object obj) {
        Clock clock;
        boolean z10;
        zzeds zzedsVar;
        zzehd zzehdVar;
        clock = this.zzg.zza;
        long elapsedRealtime = clock.elapsedRealtime() - this.zza;
        zzehc.zzg(this.zzg, this.zzb, 0, elapsedRealtime, this.zzc.zzag, null);
        zzehc zzehcVar = this.zzg;
        z10 = zzehcVar.zze;
        if (z10) {
            zzehdVar = zzehcVar.zzb;
            zzehdVar.zza(this.zzd, this.zzc, 0, null, elapsedRealtime);
        }
        zzedsVar = this.zzg.zzf;
        zzedsVar.zzf(this.zzc, elapsedRealtime, null);
    }
}
