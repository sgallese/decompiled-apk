package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.PlatformVersion;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzegh implements zzegb {
    private final zzdgm zza;
    private final zzfyo zzb;
    private final zzdks zzc;
    private final zzfcx zzd;
    private final zzdnh zze;

    public zzegh(zzdgm zzdgmVar, zzfyo zzfyoVar, zzdks zzdksVar, zzfcx zzfcxVar, zzdnh zzdnhVar) {
        this.zza = zzdgmVar;
        this.zzb = zzfyoVar;
        this.zzc = zzdksVar;
        this.zzd = zzfcxVar;
        this.zze = zzdnhVar;
    }

    private final com.google.common.util.concurrent.a zzg(final zzfbr zzfbrVar, final zzfbe zzfbeVar, final JSONObject jSONObject) {
        final com.google.common.util.concurrent.a zza = this.zzd.zza();
        final com.google.common.util.concurrent.a zza2 = this.zzc.zza(zzfbrVar, zzfbeVar, jSONObject);
        return zzfye.zzc(zza, zza2).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzegc
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzegh.this.zzc(zza2, zza, zzfbrVar, zzfbeVar, jSONObject);
            }
        }, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzedn
    public final com.google.common.util.concurrent.a zza(final zzfbr zzfbrVar, final zzfbe zzfbeVar) {
        return zzfye.zzn(zzfye.zzn(this.zzd.zza(), new zzfxl() { // from class: com.google.android.gms.internal.ads.zzege
            @Override // com.google.android.gms.internal.ads.zzfxl
            public final com.google.common.util.concurrent.a zza(Object obj) {
                return zzegh.this.zze(zzfbeVar, (zzdnb) obj);
            }
        }, this.zzb), new zzfxl() { // from class: com.google.android.gms.internal.ads.zzegf
            @Override // com.google.android.gms.internal.ads.zzfxl
            public final com.google.common.util.concurrent.a zza(Object obj) {
                return zzegh.this.zzf(zzfbrVar, zzfbeVar, (JSONArray) obj);
            }
        }, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzedn
    public final boolean zzb(zzfbr zzfbrVar, zzfbe zzfbeVar) {
        zzfbk zzfbkVar = zzfbeVar.zzt;
        if (zzfbkVar != null && zzfbkVar.zzc != null) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzdhx zzc(com.google.common.util.concurrent.a aVar, com.google.common.util.concurrent.a aVar2, zzfbr zzfbrVar, zzfbe zzfbeVar, JSONObject jSONObject) throws Exception {
        zzdic zzdicVar = (zzdic) aVar.get();
        zzdnb zzdnbVar = (zzdnb) aVar2.get();
        zzdid zzd = this.zza.zzd(new zzcst(zzfbrVar, zzfbeVar, null), new zzdio(zzdicVar), new zzdhb(jSONObject, zzdnbVar));
        zzd.zzh().zzb();
        zzd.zzk().zza(zzdnbVar);
        zzd.zzg().zza(zzdicVar.zzs());
        zzd.zzl().zza(this.zze);
        return zzd.zza();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ com.google.common.util.concurrent.a zzd(zzdnb zzdnbVar, JSONObject jSONObject) throws Exception {
        this.zzd.zzb(zzfye.zzh(zzdnbVar));
        if (jSONObject.optBoolean("success")) {
            return zzfye.zzh(jSONObject.getJSONObject("json").getJSONArray("ads"));
        }
        throw new zzbmx("process json failed");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ com.google.common.util.concurrent.a zze(zzfbe zzfbeVar, final zzdnb zzdnbVar) throws Exception {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("isNonagon", true);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzii)).booleanValue() && PlatformVersion.isAtLeastR()) {
            jSONObject.put("skipDeepLinkValidation", true);
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("response", zzfbeVar.zzt.zzc);
        jSONObject2.put("sdk_params", jSONObject);
        return zzfye.zzn(zzdnbVar.zzd("google.afma.nativeAds.preProcessJson", jSONObject2), new zzfxl() { // from class: com.google.android.gms.internal.ads.zzegd
            @Override // com.google.android.gms.internal.ads.zzfxl
            public final com.google.common.util.concurrent.a zza(Object obj) {
                return zzegh.this.zzd(zzdnbVar, (JSONObject) obj);
            }
        }, this.zzb);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ com.google.common.util.concurrent.a zzf(zzfbr zzfbrVar, zzfbe zzfbeVar, JSONArray jSONArray) throws Exception {
        if (jSONArray.length() == 0) {
            return zzfye.zzg(new zzdve(3));
        }
        if (zzfbrVar.zza.zza.zzk > 1) {
            int length = jSONArray.length();
            this.zzd.zzc(Math.min(length, zzfbrVar.zza.zza.zzk));
            ArrayList arrayList = new ArrayList(zzfbrVar.zza.zza.zzk);
            for (int i10 = 0; i10 < zzfbrVar.zza.zza.zzk; i10++) {
                if (i10 < length) {
                    arrayList.add(zzg(zzfbrVar, zzfbeVar, jSONArray.getJSONObject(i10)));
                } else {
                    arrayList.add(zzfye.zzg(new zzdve(3)));
                }
            }
            return zzfye.zzh(arrayList);
        }
        return zzfye.zzm(zzg(zzfbrVar, zzfbeVar, jSONArray.getJSONObject(0)), new zzfqw() { // from class: com.google.android.gms.internal.ads.zzegg
            @Override // com.google.android.gms.internal.ads.zzfqw
            public final Object apply(Object obj) {
                return Collections.singletonList(zzfye.zzh((zzdhx) obj));
            }
        }, this.zzb);
    }
}
