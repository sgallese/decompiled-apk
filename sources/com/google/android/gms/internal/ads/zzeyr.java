package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzeyr {
    private final zzfdn zza;
    private final zzcvp zzb;
    private final Executor zzc;
    private zzeyq zzd;

    public zzeyr(zzfdn zzfdnVar, zzcvp zzcvpVar, Executor executor) {
        this.zza = zzfdnVar;
        this.zzb = zzcvpVar;
        this.zzc = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Deprecated
    public final zzfdx zze() {
        zzfca zzg = this.zzb.zzg();
        return this.zza.zzc(zzg.zzd, zzg.zzf, zzg.zzj);
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [com.google.android.gms.internal.ads.zzeyp, com.google.android.gms.internal.ads.zzbun] */
    public final com.google.common.util.concurrent.a zzc() {
        com.google.common.util.concurrent.a zze;
        zzeyq zzeyqVar = this.zzd;
        if (zzeyqVar == null) {
            if (!((Boolean) zzbdq.zza.zze()).booleanValue()) {
                ?? r22 = 0;
                zzeyq zzeyqVar2 = new zzeyq(r22, zze(), r22);
                this.zzd = zzeyqVar2;
                zze = zzfye.zzh(zzeyqVar2);
            } else {
                zze = zzfye.zze(zzfye.zzm(zzfxv.zzu(this.zzb.zzb().zze(this.zza.zza())), new zzeyo(this), this.zzc), zzdxh.class, new zzeyn(this), this.zzc);
            }
            return zzfye.zzm(zze, new zzfqw() { // from class: com.google.android.gms.internal.ads.zzeym
                @Override // com.google.android.gms.internal.ads.zzfqw
                public final Object apply(Object obj) {
                    return (zzeyq) obj;
                }
            }, this.zzc);
        }
        return zzfye.zzh(zzeyqVar);
    }
}
