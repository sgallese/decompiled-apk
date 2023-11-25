package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzeyk implements zzeyv {
    private zzcvp zza;

    @Override // com.google.android.gms.internal.ads.zzeyv
    /* renamed from: zza  reason: merged with bridge method [inline-methods] */
    public final synchronized zzcvp zzd() {
        return this.zza;
    }

    public final synchronized com.google.common.util.concurrent.a zzb(zzeyw zzeywVar, zzeyu zzeyuVar, zzcvp zzcvpVar) {
        zzctl zzb;
        if (zzcvpVar != null) {
            this.zza = zzcvpVar;
        } else {
            this.zza = (zzcvp) zzeyuVar.zza(zzeywVar.zzb).zzh();
        }
        zzb = this.zza.zzb();
        return zzb.zzi(zzb.zzj());
    }

    @Override // com.google.android.gms.internal.ads.zzeyv
    public final /* bridge */ /* synthetic */ com.google.common.util.concurrent.a zzc(zzeyw zzeywVar, zzeyu zzeyuVar, Object obj) {
        return zzb(zzeywVar, zzeyuVar, null);
    }
}
