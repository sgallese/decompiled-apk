package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzeyl implements zzeyv {
    private final zzeyv zza;
    private zzcvp zzb;

    public zzeyl(zzeyv zzeyvVar) {
        this.zza = zzeyvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeyv
    /* renamed from: zza  reason: merged with bridge method [inline-methods] */
    public final synchronized zzcvp zzd() {
        return this.zzb;
    }

    public final synchronized com.google.common.util.concurrent.a zzb(zzeyw zzeywVar, zzeyu zzeyuVar, zzcvp zzcvpVar) {
        this.zzb = zzcvpVar;
        if (zzeywVar.zza != null) {
            zzctl zzb = zzcvpVar.zzb();
            return zzb.zzi(zzb.zzk(zzfye.zzh(zzeywVar.zza)));
        }
        return ((zzeyk) this.zza).zzb(zzeywVar, zzeyuVar, zzcvpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzeyv
    public final /* bridge */ /* synthetic */ com.google.common.util.concurrent.a zzc(zzeyw zzeywVar, zzeyu zzeyuVar, Object obj) {
        return zzb(zzeywVar, zzeyuVar, null);
    }
}
