package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzeyb implements zzeyv {
    private final zzeyv zza;
    private final zzeyv zzb;
    private final zzfej zzc;
    private final String zzd;
    private zzcvp zze;
    private final Executor zzf;

    public zzeyb(zzeyv zzeyvVar, zzeyv zzeyvVar2, zzfej zzfejVar, String str, Executor executor) {
        this.zza = zzeyvVar;
        this.zzb = zzeyvVar2;
        this.zzc = zzfejVar;
        this.zzd = str;
        this.zzf = executor;
    }

    private final com.google.common.util.concurrent.a zzg(zzfdw zzfdwVar, zzeyw zzeywVar) {
        zzcvp zzcvpVar = zzfdwVar.zza;
        this.zze = zzcvpVar;
        if (zzfdwVar.zzc != null) {
            if (zzcvpVar.zzf() != null) {
                zzfdwVar.zzc.zzo().zzl(zzfdwVar.zza.zzf());
            }
            return zzfye.zzh(zzfdwVar.zzc);
        }
        zzcvpVar.zzb().zzl(zzfdwVar.zzb);
        return ((zzeyl) this.zza).zzb(zzeywVar, null, zzfdwVar.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzeyv
    /* renamed from: zza  reason: merged with bridge method [inline-methods] */
    public final synchronized zzcvp zzd() {
        return this.zze;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ com.google.common.util.concurrent.a zzb(zzeyw zzeywVar, zzeya zzeyaVar, zzeyu zzeyuVar, zzcvp zzcvpVar, zzeyg zzeygVar) throws Exception {
        if (zzeygVar != null) {
            zzeya zzeyaVar2 = new zzeya(zzeyaVar.zza, zzeyaVar.zzb, zzeyaVar.zzc, zzeyaVar.zzd, zzeyaVar.zze, zzeyaVar.zzf, zzeygVar.zza);
            if (zzeygVar.zzc != null) {
                this.zze = null;
                this.zzc.zze(zzeyaVar2);
                return zzg(zzeygVar.zzc, zzeywVar);
            }
            com.google.common.util.concurrent.a zza = this.zzc.zza(zzeyaVar2);
            if (zza != null) {
                this.zze = null;
                return zzfye.zzn(zza, new zzfxl() { // from class: com.google.android.gms.internal.ads.zzexx
                    @Override // com.google.android.gms.internal.ads.zzfxl
                    public final com.google.common.util.concurrent.a zza(Object obj) {
                        return zzeyb.this.zze((zzfeg) obj);
                    }
                }, this.zzf);
            }
            this.zzc.zze(zzeyaVar2);
            zzeywVar = new zzeyw(zzeywVar.zzb, zzeygVar.zzb);
        }
        com.google.common.util.concurrent.a zzb = ((zzeyl) this.zza).zzb(zzeywVar, zzeyuVar, zzcvpVar);
        this.zze = zzcvpVar;
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzeyv
    public final /* bridge */ /* synthetic */ com.google.common.util.concurrent.a zzc(zzeyw zzeywVar, zzeyu zzeyuVar, Object obj) {
        return zzf(zzeywVar, zzeyuVar, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ com.google.common.util.concurrent.a zze(zzfeg zzfegVar) throws Exception {
        zzfei zzfeiVar;
        if (zzfegVar != null && zzfegVar.zza != null && (zzfeiVar = zzfegVar.zzb) != null) {
            zzaxt zza = zzaxz.zza();
            zzaxr zza2 = zzaxs.zza();
            zza2.zzd(2);
            zza2.zzb(zzaxw.zzd());
            zza.zza(zza2);
            zzfegVar.zza.zza.zzb().zzc().zzm((zzaxz) zza.zzal());
            return zzg(zzfegVar.zza, ((zzeya) zzfeiVar).zzb);
        }
        throw new zzdve(1, "Empty prefetch");
    }

    public final synchronized com.google.common.util.concurrent.a zzf(final zzeyw zzeywVar, final zzeyu zzeyuVar, zzcvp zzcvpVar) {
        zzcvo zza = zzeyuVar.zza(zzeywVar.zzb);
        zza.zza(new zzeyc(this.zzd));
        final zzcvp zzcvpVar2 = (zzcvp) zza.zzh();
        zzcvpVar2.zzg();
        zzcvpVar2.zzg();
        com.google.android.gms.ads.internal.client.zzl zzlVar = zzcvpVar2.zzg().zzd;
        if (zzlVar.zzs == null && zzlVar.zzx == null) {
            zzfca zzg = zzcvpVar2.zzg();
            final zzeya zzeyaVar = new zzeya(zzeyuVar, zzeywVar, zzg.zzd, zzg.zzf, this.zzf, zzg.zzj, null);
            return zzfye.zzn(zzfxv.zzu(((zzeyh) this.zzb).zzb(zzeywVar, zzeyuVar, zzcvpVar2)), new zzfxl() { // from class: com.google.android.gms.internal.ads.zzexy
                @Override // com.google.android.gms.internal.ads.zzfxl
                public final com.google.common.util.concurrent.a zza(Object obj) {
                    return zzeyb.this.zzb(zzeywVar, zzeyaVar, zzeyuVar, zzcvpVar2, (zzeyg) obj);
                }
            }, this.zzf);
        }
        this.zze = zzcvpVar2;
        return ((zzeyl) this.zza).zzb(zzeywVar, zzeyuVar, zzcvpVar2);
    }
}
