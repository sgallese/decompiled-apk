package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzctl {
    private final zzdwn zza;
    private final zzfca zzb;
    private final zzfge zzc;
    private final zzcmq zzd;
    private final zzehh zze;
    private final zzdbn zzf;
    private zzfbr zzg;
    private final zzdxs zzh;
    private final zzcvm zzi;
    private final Executor zzj;
    private final zzdxe zzk;
    private final zzeds zzl;
    private final zzdyi zzm;
    private final zzdyp zzn;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzctl(zzdwn zzdwnVar, zzfca zzfcaVar, zzfge zzfgeVar, zzcmq zzcmqVar, zzehh zzehhVar, zzdbn zzdbnVar, zzfbr zzfbrVar, zzdxs zzdxsVar, zzcvm zzcvmVar, Executor executor, zzdxe zzdxeVar, zzeds zzedsVar, zzdyi zzdyiVar, zzdyp zzdypVar) {
        this.zza = zzdwnVar;
        this.zzb = zzfcaVar;
        this.zzc = zzfgeVar;
        this.zzd = zzcmqVar;
        this.zze = zzehhVar;
        this.zzf = zzdbnVar;
        this.zzg = zzfbrVar;
        this.zzh = zzdxsVar;
        this.zzi = zzcvmVar;
        this.zzj = executor;
        this.zzk = zzdxeVar;
        this.zzl = zzedsVar;
        this.zzm = zzdyiVar;
        this.zzn = zzdypVar;
    }

    public final com.google.android.gms.ads.internal.client.zze zza(Throwable th) {
        return zzfdb.zzb(th, this.zzl);
    }

    public final zzdbn zzc() {
        return this.zzf;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzfbr zzd(zzfbr zzfbrVar) throws Exception {
        this.zzd.zza(zzfbrVar);
        return zzfbrVar;
    }

    public final com.google.common.util.concurrent.a zze(final zzfdu zzfduVar) {
        zzffj zza = this.zzc.zzb(zzffy.GET_CACHE_KEY, this.zzi.zzc()).zzf(new zzfxl() { // from class: com.google.android.gms.internal.ads.zzcti
            @Override // com.google.android.gms.internal.ads.zzfxl
            public final com.google.common.util.concurrent.a zza(Object obj) {
                return zzctl.this.zzf(zzfduVar, (zzbun) obj);
            }
        }).zza();
        zzfye.zzr(zza, new zzctj(this), this.zzj);
        return zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ com.google.common.util.concurrent.a zzf(zzfdu zzfduVar, zzbun zzbunVar) throws Exception {
        zzbunVar.zzi = zzfduVar;
        return this.zzh.zza(zzbunVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ com.google.common.util.concurrent.a zzg(com.google.common.util.concurrent.a aVar, com.google.common.util.concurrent.a aVar2, com.google.common.util.concurrent.a aVar3) throws Exception {
        return this.zzn.zzc((zzbun) aVar.get(), (JSONObject) aVar2.get(), (zzbuq) aVar3.get());
    }

    public final com.google.common.util.concurrent.a zzh(zzbun zzbunVar) {
        zzffj zza = this.zzc.zzb(zzffy.NOTIFY_CACHE_HIT, this.zzh.zzg(zzbunVar)).zza();
        zzfye.zzr(zza, new zzctk(this), this.zzj);
        return zza;
    }

    public final com.google.common.util.concurrent.a zzi(com.google.common.util.concurrent.a aVar) {
        zzffv zzf = this.zzc.zzb(zzffy.RENDERER, aVar).zze(new zzffh() { // from class: com.google.android.gms.internal.ads.zzcth
            @Override // com.google.android.gms.internal.ads.zzffh
            public final Object zza(Object obj) {
                zzfbr zzfbrVar = (zzfbr) obj;
                zzctl.this.zzd(zzfbrVar);
                return zzfbrVar;
            }
        }).zzf(this.zze);
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzfq)).booleanValue()) {
            zzf = zzf.zzi(((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzfr)).intValue(), TimeUnit.SECONDS);
        }
        return zzf.zza();
    }

    public final com.google.common.util.concurrent.a zzj() {
        com.google.android.gms.ads.internal.client.zzl zzlVar = this.zzb.zzd;
        if (zzlVar.zzx == null && zzlVar.zzs == null) {
            return zzk(this.zzi.zzc());
        }
        zzfge zzfgeVar = this.zzc;
        return zzffo.zzc(this.zza.zza(), zzffy.PRELOADED_LOADER, zzfgeVar).zza();
    }

    public final com.google.common.util.concurrent.a zzk(final com.google.common.util.concurrent.a aVar) {
        zzfbr zzfbrVar = this.zzg;
        if (zzfbrVar != null) {
            return zzffo.zzc(zzfye.zzh(zzfbrVar), zzffy.SERVER_TRANSACTION, this.zzc).zza();
        }
        com.google.android.gms.ads.internal.zzt.zzc().zzj();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzkn)).booleanValue() && !((Boolean) zzbdp.zzc.zze()).booleanValue()) {
            final zzdyi zzdyiVar = this.zzm;
            final com.google.common.util.concurrent.a zzn = zzfye.zzn(aVar, new zzfxl() { // from class: com.google.android.gms.internal.ads.zzctc
                @Override // com.google.android.gms.internal.ads.zzfxl
                public final com.google.common.util.concurrent.a zza(Object obj) {
                    return zzdyi.this.zza((zzbun) obj);
                }
            }, this.zzj);
            zzffv zzb = this.zzc.zzb(zzffy.BUILD_URL, zzn);
            final zzdxs zzdxsVar = this.zzh;
            final zzffj zza = zzb.zzf(new zzfxl() { // from class: com.google.android.gms.internal.ads.zzctd
                @Override // com.google.android.gms.internal.ads.zzfxl
                public final com.google.common.util.concurrent.a zza(Object obj) {
                    return zzdxs.this.zzb((JSONObject) obj);
                }
            }).zza();
            return this.zzc.zza(zzffy.SERVER_TRANSACTION, aVar, zzn, zza).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzcte
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return zzctl.this.zzg(aVar, zzn, zza);
                }
            }).zzf(new zzfxl() { // from class: com.google.android.gms.internal.ads.zzctf
                @Override // com.google.android.gms.internal.ads.zzfxl
                public final com.google.common.util.concurrent.a zza(Object obj) {
                    return (com.google.common.util.concurrent.a) obj;
                }
            }).zza();
        }
        zzffv zzb2 = this.zzc.zzb(zzffy.SERVER_TRANSACTION, aVar);
        final zzdxe zzdxeVar = this.zzk;
        return zzb2.zzf(new zzfxl() { // from class: com.google.android.gms.internal.ads.zzctg
            @Override // com.google.android.gms.internal.ads.zzfxl
            public final com.google.common.util.concurrent.a zza(Object obj) {
                return zzdxe.this.zzb((zzbun) obj);
            }
        }).zza();
    }

    public final void zzl(zzfbr zzfbrVar) {
        this.zzg = zzfbrVar;
    }
}
