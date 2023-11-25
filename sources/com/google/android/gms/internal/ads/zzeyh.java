package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzeyh implements zzeyv {
    private final zzfdn zza;
    private final Executor zzb;
    private final zzfya zzc = new zzeyf(this);

    public zzeyh(zzfdn zzfdnVar, Executor executor) {
        this.zza = zzfdnVar;
        this.zzb = executor;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ com.google.common.util.concurrent.a zza(zzcvp zzcvpVar, zzeyq zzeyqVar) throws Exception {
        zzfdx zzfdxVar = zzeyqVar.zzb;
        zzbun zzbunVar = zzeyqVar.zza;
        zzfdw zzb = this.zza.zzb(zzfdxVar);
        if (zzb != null && zzbunVar != null) {
            zzfye.zzr(zzcvpVar.zzb().zzh(zzbunVar), this.zzc, this.zzb);
        }
        return zzfye.zzh(new zzeyg(zzfdxVar, zzbunVar, zzb));
    }

    public final com.google.common.util.concurrent.a zzb(zzeyw zzeywVar, zzeyu zzeyuVar, final zzcvp zzcvpVar) {
        return zzfye.zze(zzfye.zzn(zzfxv.zzu(new zzeyr(this.zza, zzcvpVar, this.zzb).zzc()), new zzfxl() { // from class: com.google.android.gms.internal.ads.zzeyd
            @Override // com.google.android.gms.internal.ads.zzfxl
            public final com.google.common.util.concurrent.a zza(Object obj) {
                return zzeyh.this.zza(zzcvpVar, (zzeyq) obj);
            }
        }, this.zzb), Exception.class, new zzeye(this), this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzeyv
    public final /* bridge */ /* synthetic */ com.google.common.util.concurrent.a zzc(zzeyw zzeywVar, zzeyu zzeyuVar, Object obj) {
        return zzb(zzeywVar, zzeyuVar, null);
    }

    @Override // com.google.android.gms.internal.ads.zzeyv
    public final /* bridge */ /* synthetic */ Object zzd() {
        return null;
    }
}
