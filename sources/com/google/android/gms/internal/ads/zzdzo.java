package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzdzo extends zzbty {
    private final Context zza;
    private final zzfyo zzb;
    private final zzeag zzc;
    private final zzcmp zzd;
    private final ArrayDeque zze;
    private final zzfhu zzf;
    private final zzbuz zzg;
    private final zzead zzh;

    public zzdzo(Context context, zzfyo zzfyoVar, zzbuz zzbuzVar, zzcmp zzcmpVar, zzeag zzeagVar, ArrayDeque arrayDeque, zzead zzeadVar, zzfhu zzfhuVar) {
        zzbbr.zza(context);
        this.zza = context;
        this.zzb = zzfyoVar;
        this.zzg = zzbuzVar;
        this.zzc = zzeagVar;
        this.zzd = zzcmpVar;
        this.zze = arrayDeque;
        this.zzh = zzeadVar;
        this.zzf = zzfhuVar;
    }

    private final synchronized zzdzl zzk(String str) {
        Iterator it = this.zze.iterator();
        while (it.hasNext()) {
            zzdzl zzdzlVar = (zzdzl) it.next();
            if (zzdzlVar.zzc.equals(str)) {
                it.remove();
                return zzdzlVar;
            }
        }
        return null;
    }

    private static com.google.common.util.concurrent.a zzl(com.google.common.util.concurrent.a aVar, zzfge zzfgeVar, zzbni zzbniVar, zzfhr zzfhrVar, zzfhg zzfhgVar) {
        zzbmy zza = zzbniVar.zza("AFMA_getAdDictionary", zzbnf.zza, new zzbna() { // from class: com.google.android.gms.internal.ads.zzdzf
            @Override // com.google.android.gms.internal.ads.zzbna
            public final Object zza(JSONObject jSONObject) {
                return new zzbuq(jSONObject);
            }
        });
        zzfhq.zzd(aVar, zzfhgVar);
        zzffj zza2 = zzfgeVar.zzb(zzffy.BUILD_URL, aVar).zzf(zza).zza();
        zzfhq.zzc(zza2, zzfhrVar, zzfhgVar);
        return zza2;
    }

    private static com.google.common.util.concurrent.a zzm(zzbun zzbunVar, zzfge zzfgeVar, final zzeth zzethVar) {
        zzfxl zzfxlVar = new zzfxl() { // from class: com.google.android.gms.internal.ads.zzdyz
            @Override // com.google.android.gms.internal.ads.zzfxl
            public final com.google.common.util.concurrent.a zza(Object obj) {
                return zzeth.this.zzb().zza(com.google.android.gms.ads.internal.client.zzay.zzb().zzh((Bundle) obj));
            }
        };
        return zzfgeVar.zzb(zzffy.GMS_SIGNALS, zzfye.zzh(zzbunVar.zza)).zzf(zzfxlVar).zze(new zzffh() { // from class: com.google.android.gms.internal.ads.zzdza
            @Override // com.google.android.gms.internal.ads.zzffh
            public final Object zza(Object obj) {
                JSONObject jSONObject = (JSONObject) obj;
                com.google.android.gms.ads.internal.util.zze.zza("Ad request signals:");
                com.google.android.gms.ads.internal.util.zze.zza(jSONObject.toString(2));
                return jSONObject;
            }
        }).zza();
    }

    private final synchronized void zzn(zzdzl zzdzlVar) {
        zzo();
        this.zze.addLast(zzdzlVar);
    }

    private final synchronized void zzo() {
        int intValue = ((Long) zzbdq.zzc.zze()).intValue();
        while (this.zze.size() >= intValue) {
            this.zze.removeFirst();
        }
    }

    private final void zzp(com.google.common.util.concurrent.a aVar, zzbuj zzbujVar) {
        zzfye.zzr(zzfye.zzn(aVar, new zzfxl() { // from class: com.google.android.gms.internal.ads.zzdzi
            @Override // com.google.android.gms.internal.ads.zzfxl
            public final com.google.common.util.concurrent.a zza(Object obj) {
                return zzfye.zzh(zzfda.zza((InputStream) obj));
            }
        }, zzcan.zza), new zzdzk(this, zzbujVar), zzcan.zzf);
    }

    public final com.google.common.util.concurrent.a zzb(final zzbun zzbunVar, int i10) {
        if (!((Boolean) zzbdq.zza.zze()).booleanValue()) {
            return zzfye.zzg(new Exception("Split request is disabled."));
        }
        zzfdu zzfduVar = zzbunVar.zzi;
        if (zzfduVar == null) {
            return zzfye.zzg(new Exception("Pool configuration missing from request."));
        }
        if (zzfduVar.zzc != 0 && zzfduVar.zzd != 0) {
            zzbni zzb = com.google.android.gms.ads.internal.zzt.zzf().zzb(this.zza, zzcag.zza(), this.zzf);
            zzeth zzq = this.zzd.zzq(zzbunVar, i10);
            zzfge zzc = zzq.zzc();
            final com.google.common.util.concurrent.a zzm = zzm(zzbunVar, zzc, zzq);
            zzfhr zzd = zzq.zzd();
            final zzfhg zza = zzfhf.zza(this.zza, 9);
            final com.google.common.util.concurrent.a zzl = zzl(zzm, zzc, zzb, zzd, zza);
            return zzc.zza(zzffy.GET_URL_AND_CACHE_KEY, zzm, zzl).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzdze
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return zzdzo.this.zzj(zzl, zzm, zzbunVar, zza);
                }
            }).zza();
        }
        return zzfye.zzg(new Exception("Caching is disabled."));
    }

    public final com.google.common.util.concurrent.a zzc(zzbun zzbunVar, int i10) {
        zzdzl zzk;
        zzfhg zzfhgVar;
        zzffj zza;
        zzbni zzb = com.google.android.gms.ads.internal.zzt.zzf().zzb(this.zza, zzcag.zza(), this.zzf);
        zzeth zzq = this.zzd.zzq(zzbunVar, i10);
        zzbmy zza2 = zzb.zza("google.afma.response.normalize", zzdzn.zza, zzbnf.zzb);
        if (!((Boolean) zzbdq.zza.zze()).booleanValue()) {
            String str = zzbunVar.zzj;
            zzk = null;
            if (str != null && !str.isEmpty()) {
                com.google.android.gms.ads.internal.util.zze.zza("Request contained a PoolKey but split request is disabled.");
            }
        } else {
            zzk = zzk(zzbunVar.zzh);
            if (zzk == null) {
                com.google.android.gms.ads.internal.util.zze.zza("Request contained a PoolKey but no matching parameters were found.");
            }
        }
        if (zzk == null) {
            zzfhgVar = zzfhf.zza(this.zza, 9);
        } else {
            zzfhgVar = zzk.zze;
        }
        zzfhr zzd = zzq.zzd();
        zzd.zzd(zzbunVar.zza.getStringArrayList("ad_types"));
        zzeaf zzeafVar = new zzeaf(zzbunVar.zzg, zzd, zzfhgVar);
        zzeac zzeacVar = new zzeac(this.zza, zzbunVar.zzb.zza, this.zzg, i10);
        zzfge zzc = zzq.zzc();
        zzfhg zza3 = zzfhf.zza(this.zza, 11);
        if (zzk == null) {
            final com.google.common.util.concurrent.a zzm = zzm(zzbunVar, zzc, zzq);
            final com.google.common.util.concurrent.a zzl = zzl(zzm, zzc, zzb, zzd, zzfhgVar);
            zzfhg zza4 = zzfhf.zza(this.zza, 10);
            final zzffj zza5 = zzc.zza(zzffy.HTTP, zzl, zzm).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzdzc
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return new zzeae((JSONObject) com.google.common.util.concurrent.a.this.get(), (zzbuq) zzl.get());
                }
            }).zze(zzeafVar).zze(new zzfhm(zza4)).zze(zzeacVar).zza();
            zzfhq.zza(zza5, zzd, zza4);
            zzfhq.zzd(zza5, zza3);
            zza = zzc.zza(zzffy.PRE_PROCESS, zzm, zzl, zza5).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzdzd
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return new zzdzn((zzeab) com.google.common.util.concurrent.a.this.get(), (JSONObject) zzm.get(), (zzbuq) zzl.get());
                }
            }).zzf(zza2).zza();
        } else {
            zzeae zzeaeVar = new zzeae(zzk.zzb, zzk.zza);
            zzfhg zza6 = zzfhf.zza(this.zza, 10);
            final zzffj zza7 = zzc.zzb(zzffy.HTTP, zzfye.zzh(zzeaeVar)).zze(zzeafVar).zze(new zzfhm(zza6)).zze(zzeacVar).zza();
            zzfhq.zza(zza7, zzd, zza6);
            final com.google.common.util.concurrent.a zzh = zzfye.zzh(zzk);
            zzfhq.zzd(zza7, zza3);
            zza = zzc.zza(zzffy.PRE_PROCESS, zza7, zzh).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzdzh
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    com.google.common.util.concurrent.a aVar = com.google.common.util.concurrent.a.this;
                    com.google.common.util.concurrent.a aVar2 = zzh;
                    return new zzdzn((zzeab) aVar.get(), ((zzdzl) aVar2.get()).zzb, ((zzdzl) aVar2.get()).zza);
                }
            }).zzf(zza2).zza();
        }
        zzfhq.zza(zza, zzd, zza3);
        return zza;
    }

    public final com.google.common.util.concurrent.a zzd(zzbun zzbunVar, int i10) {
        zzbni zzb = com.google.android.gms.ads.internal.zzt.zzf().zzb(this.zza, zzcag.zza(), this.zzf);
        if (!((Boolean) zzbdv.zza.zze()).booleanValue()) {
            return zzfye.zzg(new Exception("Signal collection disabled."));
        }
        zzeth zzq = this.zzd.zzq(zzbunVar, i10);
        final zzesm zza = zzq.zza();
        zzbmy zza2 = zzb.zza("google.afma.request.getSignals", zzbnf.zza, zzbnf.zzb);
        zzfhg zza3 = zzfhf.zza(this.zza, 22);
        zzffj zza4 = zzq.zzc().zzb(zzffy.GET_SIGNALS, zzfye.zzh(zzbunVar.zza)).zze(new zzfhm(zza3)).zzf(new zzfxl() { // from class: com.google.android.gms.internal.ads.zzdzg
            @Override // com.google.android.gms.internal.ads.zzfxl
            public final com.google.common.util.concurrent.a zza(Object obj) {
                return zzesm.this.zza(com.google.android.gms.ads.internal.client.zzay.zzb().zzh((Bundle) obj));
            }
        }).zzb(zzffy.JS_SIGNALS).zzf(zza2).zza();
        zzfhr zzd = zzq.zzd();
        zzd.zzd(zzbunVar.zza.getStringArrayList("ad_types"));
        zzfhq.zzb(zza4, zzd, zza3);
        if (((Boolean) zzbdk.zze.zze()).booleanValue()) {
            zzeag zzeagVar = this.zzc;
            zzeagVar.getClass();
            zza4.addListener(new zzdzb(zzeagVar), this.zzb);
        }
        return zza4;
    }

    @Override // com.google.android.gms.internal.ads.zzbtz
    public final void zze(zzbun zzbunVar, zzbuj zzbujVar) {
        zzp(zzb(zzbunVar, Binder.getCallingUid()), zzbujVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbtz
    public final void zzf(zzbun zzbunVar, zzbuj zzbujVar) {
        zzp(zzd(zzbunVar, Binder.getCallingUid()), zzbujVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbtz
    public final void zzg(zzbun zzbunVar, zzbuj zzbujVar) {
        com.google.common.util.concurrent.a zzc = zzc(zzbunVar, Binder.getCallingUid());
        zzp(zzc, zzbujVar);
        if (((Boolean) zzbdk.zzc.zze()).booleanValue()) {
            zzeag zzeagVar = this.zzc;
            zzeagVar.getClass();
            zzc.addListener(new zzdzb(zzeagVar), this.zzb);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtz
    public final void zzh(String str, zzbuj zzbujVar) {
        zzp(zzi(str), zzbujVar);
    }

    public final com.google.common.util.concurrent.a zzi(String str) {
        if (!((Boolean) zzbdq.zza.zze()).booleanValue()) {
            return zzfye.zzg(new Exception("Split request is disabled."));
        }
        zzdzj zzdzjVar = new zzdzj(this);
        if (zzk(str) == null) {
            return zzfye.zzg(new Exception("URL to be removed not found for cache key: ".concat(String.valueOf(str))));
        }
        return zzfye.zzh(zzdzjVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ InputStream zzj(com.google.common.util.concurrent.a aVar, com.google.common.util.concurrent.a aVar2, zzbun zzbunVar, zzfhg zzfhgVar) throws Exception {
        String zzc = ((zzbuq) aVar.get()).zzc();
        zzn(new zzdzl((zzbuq) aVar.get(), (JSONObject) aVar2.get(), zzbunVar.zzh, zzc, zzfhgVar));
        return new ByteArrayInputStream(zzc.getBytes(zzfqu.zzc));
    }
}
