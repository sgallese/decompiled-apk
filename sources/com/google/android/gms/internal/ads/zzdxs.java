package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzdxs {
    private final zzfyo zza;
    private final zzdwy zzb;
    private final zzgyn zzc;
    private final zzfhu zzd;
    private final Context zze;
    private final zzcag zzf;

    public zzdxs(zzfyo zzfyoVar, zzdwy zzdwyVar, zzgyn zzgynVar, zzfhu zzfhuVar, Context context, zzcag zzcagVar) {
        this.zza = zzfyoVar;
        this.zzb = zzdwyVar;
        this.zzc = zzgynVar;
        this.zzd = zzfhuVar;
        this.zze = context;
        this.zzf = zzcagVar;
    }

    private final com.google.common.util.concurrent.a zzh(final zzbun zzbunVar, zzdxr zzdxrVar, final zzdxr zzdxrVar2, final zzfxl zzfxlVar) {
        com.google.common.util.concurrent.a zzf;
        String str = zzbunVar.zzd;
        com.google.android.gms.ads.internal.zzt.zzp();
        if (com.google.android.gms.ads.internal.util.zzs.zzz(str)) {
            zzf = zzfye.zzg(new zzdxh(1));
        } else {
            zzf = zzfye.zzf(zzdxrVar.zza(zzbunVar), ExecutionException.class, new zzfxl() { // from class: com.google.android.gms.internal.ads.zzdxi
                @Override // com.google.android.gms.internal.ads.zzfxl
                public final com.google.common.util.concurrent.a zza(Object obj) {
                    Throwable th = (ExecutionException) obj;
                    if (th.getCause() != null) {
                        th = th.getCause();
                    }
                    return zzfye.zzg(th);
                }
            }, this.zza);
        }
        return zzfye.zzf(zzfye.zzn(zzfxv.zzu(zzf), zzfxlVar, this.zza), zzdxh.class, new zzfxl() { // from class: com.google.android.gms.internal.ads.zzdxq
            @Override // com.google.android.gms.internal.ads.zzfxl
            public final com.google.common.util.concurrent.a zza(Object obj) {
                return zzdxs.this.zzc(zzdxrVar2, zzbunVar, zzfxlVar, (zzdxh) obj);
            }
        }, this.zza);
    }

    public final com.google.common.util.concurrent.a zza(final zzbun zzbunVar) {
        zzfxl zzfxlVar = new zzfxl() { // from class: com.google.android.gms.internal.ads.zzdxn
            @Override // com.google.android.gms.internal.ads.zzfxl
            public final com.google.common.util.concurrent.a zza(Object obj) {
                zzbun zzbunVar2 = zzbun.this;
                zzbunVar2.zzj = new String(zzfwg.zza((InputStream) obj), zzfqu.zzc);
                return zzfye.zzh(zzbunVar2);
            }
        };
        final zzdwy zzdwyVar = this.zzb;
        return zzh(zzbunVar, new zzdxr() { // from class: com.google.android.gms.internal.ads.zzdxo
            @Override // com.google.android.gms.internal.ads.zzdxr
            public final com.google.common.util.concurrent.a zza(zzbun zzbunVar2) {
                return zzdwy.this.zzb(zzbunVar2);
            }
        }, new zzdxr() { // from class: com.google.android.gms.internal.ads.zzdxp
            @Override // com.google.android.gms.internal.ads.zzdxr
            public final com.google.common.util.concurrent.a zza(zzbun zzbunVar2) {
                return zzdxs.this.zzd(zzbunVar2);
            }
        }, zzfxlVar);
    }

    public final com.google.common.util.concurrent.a zzb(JSONObject jSONObject) {
        return zzfye.zzn(zzfxv.zzu(zzfye.zzh(jSONObject)), com.google.android.gms.ads.internal.zzt.zzf().zza(this.zze, this.zzf, this.zzd).zza("AFMA_getAdDictionary", zzbnf.zza, new zzbna() { // from class: com.google.android.gms.internal.ads.zzdxm
            @Override // com.google.android.gms.internal.ads.zzbna
            public final Object zza(JSONObject jSONObject2) {
                return new zzbuq(jSONObject2);
            }
        }), this.zza);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ com.google.common.util.concurrent.a zzc(zzdxr zzdxrVar, zzbun zzbunVar, zzfxl zzfxlVar, zzdxh zzdxhVar) throws Exception {
        return zzfye.zzn(zzdxrVar.zza(zzbunVar), zzfxlVar, this.zza);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ com.google.common.util.concurrent.a zzd(zzbun zzbunVar) {
        return ((zzdzo) this.zzc.zzb()).zzb(zzbunVar, Binder.getCallingUid());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ com.google.common.util.concurrent.a zze(zzbun zzbunVar) {
        return this.zzb.zzc(zzbunVar.zzh);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ com.google.common.util.concurrent.a zzf(zzbun zzbunVar) {
        return ((zzdzo) this.zzc.zzb()).zzi(zzbunVar.zzh);
    }

    public final com.google.common.util.concurrent.a zzg(zzbun zzbunVar) {
        return zzh(zzbunVar, new zzdxr() { // from class: com.google.android.gms.internal.ads.zzdxk
            @Override // com.google.android.gms.internal.ads.zzdxr
            public final com.google.common.util.concurrent.a zza(zzbun zzbunVar2) {
                return zzdxs.this.zze(zzbunVar2);
            }
        }, new zzdxr() { // from class: com.google.android.gms.internal.ads.zzdxl
            @Override // com.google.android.gms.internal.ads.zzdxr
            public final com.google.common.util.concurrent.a zza(zzbun zzbunVar2) {
                return zzdxs.this.zzf(zzbunVar2);
            }
        }, new zzfxl() { // from class: com.google.android.gms.internal.ads.zzdxj
            @Override // com.google.android.gms.internal.ads.zzfxl
            public final com.google.common.util.concurrent.a zza(Object obj) {
                InputStream inputStream = (InputStream) obj;
                return zzfye.zzh(null);
            }
        });
    }
}
