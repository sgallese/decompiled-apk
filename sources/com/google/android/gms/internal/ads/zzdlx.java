package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzdlx {
    private final zzfca zza;
    private final Executor zzb;
    private final zzdom zzc;
    private final zzdnh zzd;
    private final Context zze;
    private final zzdrh zzf;
    private final zzfgo zzg;
    private final zzfik zzh;
    private final zzech zzi;

    public zzdlx(zzfca zzfcaVar, Executor executor, zzdom zzdomVar, Context context, zzdrh zzdrhVar, zzfgo zzfgoVar, zzfik zzfikVar, zzech zzechVar, zzdnh zzdnhVar) {
        this.zza = zzfcaVar;
        this.zzb = executor;
        this.zzc = zzdomVar;
        this.zze = context;
        this.zzf = zzdrhVar;
        this.zzg = zzfgoVar;
        this.zzh = zzfikVar;
        this.zzi = zzechVar;
        this.zzd = zzdnhVar;
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [com.google.android.gms.internal.ads.zzcob, com.google.android.gms.internal.ads.zzddw] */
    private final void zzh(zzcfi zzcfiVar) {
        zzi(zzcfiVar);
        zzcfiVar.zzad("/video", zzbiq.zzl);
        zzcfiVar.zzad("/videoMeta", zzbiq.zzm);
        zzcfiVar.zzad("/precache", new zzcdv());
        zzcfiVar.zzad("/delayPageLoaded", zzbiq.zzp);
        zzcfiVar.zzad("/instrument", zzbiq.zzn);
        zzcfiVar.zzad("/log", zzbiq.zzg);
        ?? r12 = 0;
        zzcfiVar.zzad("/click", new zzbhr(r12, r12));
        if (this.zza.zzb != null) {
            zzcfiVar.zzN().zzD(true);
            zzcfiVar.zzad("/open", new zzbjc(null, null, null, null, null, null));
        } else {
            zzcfiVar.zzN().zzD(false);
        }
        if (com.google.android.gms.ads.internal.zzt.zzn().zzu(zzcfiVar.getContext())) {
            zzcfiVar.zzad("/logScionEvent", new zzbiw(zzcfiVar.getContext()));
        }
    }

    private static final void zzi(zzcfi zzcfiVar) {
        zzcfiVar.zzad("/videoClicked", zzbiq.zzh);
        zzcfiVar.zzN().zzF(true);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzdB)).booleanValue()) {
            zzcfiVar.zzad("/getNativeAdViewSignals", zzbiq.zzs);
        }
        zzcfiVar.zzad("/getNativeClickMeta", zzbiq.zzt);
    }

    public final com.google.common.util.concurrent.a zza(final JSONObject jSONObject) {
        return zzfye.zzn(zzfye.zzn(zzfye.zzh(null), new zzfxl() { // from class: com.google.android.gms.internal.ads.zzdln
            @Override // com.google.android.gms.internal.ads.zzfxl
            public final com.google.common.util.concurrent.a zza(Object obj) {
                return zzdlx.this.zze(obj);
            }
        }, this.zzb), new zzfxl() { // from class: com.google.android.gms.internal.ads.zzdlo
            @Override // com.google.android.gms.internal.ads.zzfxl
            public final com.google.common.util.concurrent.a zza(Object obj) {
                return zzdlx.this.zzc(jSONObject, (zzcfi) obj);
            }
        }, this.zzb);
    }

    public final com.google.common.util.concurrent.a zzb(final String str, final String str2, final zzfbe zzfbeVar, final zzfbi zzfbiVar, final com.google.android.gms.ads.internal.client.zzq zzqVar) {
        return zzfye.zzn(zzfye.zzh(null), new zzfxl() { // from class: com.google.android.gms.internal.ads.zzdlq
            @Override // com.google.android.gms.internal.ads.zzfxl
            public final com.google.common.util.concurrent.a zza(Object obj) {
                return zzdlx.this.zzd(zzqVar, zzfbeVar, zzfbiVar, str, str2, obj);
            }
        }, this.zzb);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ com.google.common.util.concurrent.a zzc(JSONObject jSONObject, final zzcfi zzcfiVar) throws Exception {
        final zzcar zza = zzcar.zza(zzcfiVar);
        if (this.zza.zzb != null) {
            zzcfiVar.zzag(zzcgx.zzd());
        } else {
            zzcfiVar.zzag(zzcgx.zze());
        }
        zzcfiVar.zzN().zzA(new zzcgt() { // from class: com.google.android.gms.internal.ads.zzdlm
            @Override // com.google.android.gms.internal.ads.zzcgt
            public final void zza(boolean z10, int i10, String str, String str2) {
                zzdlx.this.zzf(zzcfiVar, zza, z10, i10, str, str2);
            }
        });
        zzcfiVar.zzl("google.afma.nativeAds.renderVideo", jSONObject);
        return zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ com.google.common.util.concurrent.a zzd(com.google.android.gms.ads.internal.client.zzq zzqVar, zzfbe zzfbeVar, zzfbi zzfbiVar, String str, String str2, Object obj) throws Exception {
        final zzcfi zza = this.zzc.zza(zzqVar, zzfbeVar, zzfbiVar);
        final zzcar zza2 = zzcar.zza(zza);
        if (this.zza.zzb != null) {
            zzh(zza);
            zza.zzag(zzcgx.zzd());
        } else {
            zzdne zzb = this.zzd.zzb();
            zza.zzN().zzM(zzb, zzb, zzb, zzb, zzb, false, null, new com.google.android.gms.ads.internal.zzb(this.zze, null, null), null, null, this.zzi, this.zzh, this.zzf, this.zzg, null, zzb, null, null, null);
            zzi(zza);
        }
        zza.zzN().zzA(new zzcgt() { // from class: com.google.android.gms.internal.ads.zzdlr
            @Override // com.google.android.gms.internal.ads.zzcgt
            public final void zza(boolean z10, int i10, String str3, String str4) {
                zzdlx.this.zzg(zza, zza2, z10, i10, str3, str4);
            }
        });
        zza.zzab(str, str2, null);
        return zza2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ com.google.common.util.concurrent.a zze(Object obj) throws Exception {
        zzcfi zza = this.zzc.zza(com.google.android.gms.ads.internal.client.zzq.zzc(), null, null);
        final zzcar zza2 = zzcar.zza(zza);
        zzh(zza);
        zza.zzN().zzG(new zzcgu() { // from class: com.google.android.gms.internal.ads.zzdlp
            @Override // com.google.android.gms.internal.ads.zzcgu
            public final void zza() {
                zzcar.this.zzb();
            }
        });
        zza.loadUrl((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzdA));
        return zza2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzf(zzcfi zzcfiVar, zzcar zzcarVar, boolean z10, int i10, String str, String str2) {
        if (this.zza.zza != null && zzcfiVar.zzq() != null) {
            zzcfiVar.zzq().zzs(this.zza.zza);
        }
        zzcarVar.zzb();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzg(zzcfi zzcfiVar, zzcar zzcarVar, boolean z10, int i10, String str, String str2) {
        if (z10) {
            if (this.zza.zza != null && zzcfiVar.zzq() != null) {
                zzcfiVar.zzq().zzs(this.zza.zza);
            }
            zzcarVar.zzb();
            return;
        }
        zzcarVar.zzd(new zzehf(1, "Html video Web View failed to load. Error code: " + i10 + ", Description: " + str + ", Failing URL: " + str2));
    }
}
