package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzdks {
    private final zzfyo zza;
    private final zzdlf zzb;
    private final zzdlk zzc;

    public zzdks(zzfyo zzfyoVar, zzdlf zzdlfVar, zzdlk zzdlkVar) {
        this.zza = zzfyoVar;
        this.zzb = zzdlfVar;
        this.zzc = zzdlkVar;
    }

    public final com.google.common.util.concurrent.a zza(final zzfbr zzfbrVar, final zzfbe zzfbeVar, final JSONObject jSONObject) {
        com.google.common.util.concurrent.a zzn;
        final com.google.common.util.concurrent.a zzb = this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzdkq
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String str;
                zzfbr zzfbrVar2 = zzfbrVar;
                zzfbe zzfbeVar2 = zzfbeVar;
                JSONObject jSONObject2 = jSONObject;
                zzdic zzdicVar = new zzdic();
                zzdicVar.zzaa(jSONObject2.optInt("template_id", -1));
                zzdicVar.zzK(jSONObject2.optString("custom_template_id"));
                JSONObject optJSONObject = jSONObject2.optJSONObject("omid_settings");
                if (optJSONObject != null) {
                    str = optJSONObject.optString("omid_partner_name");
                } else {
                    str = null;
                }
                zzdicVar.zzV(str);
                zzfca zzfcaVar = zzfbrVar2.zza.zza;
                if (zzfcaVar.zzg.contains(Integer.toString(zzdicVar.zzc()))) {
                    if (zzdicVar.zzc() == 3) {
                        if (zzdicVar.zzA() != null) {
                            if (!zzfcaVar.zzh.contains(zzdicVar.zzA())) {
                                throw new zzehf(1, "Unexpected custom template id in the response.");
                            }
                        } else {
                            throw new zzehf(1, "No custom template id for custom template ad response.");
                        }
                    }
                    zzdicVar.zzY(jSONObject2.optDouble("rating", -1.0d));
                    String optString = jSONObject2.optString("headline", null);
                    if (zzfbeVar2.zzN) {
                        com.google.android.gms.ads.internal.zzt.zzp();
                        optString = com.google.android.gms.ads.internal.util.zzs.zzv() + " : " + optString;
                    }
                    zzdicVar.zzZ("headline", optString);
                    zzdicVar.zzZ("body", jSONObject2.optString("body", null));
                    zzdicVar.zzZ("call_to_action", jSONObject2.optString("call_to_action", null));
                    zzdicVar.zzZ("store", jSONObject2.optString("store", null));
                    zzdicVar.zzZ("price", jSONObject2.optString("price", null));
                    zzdicVar.zzZ("advertiser", jSONObject2.optString("advertiser", null));
                    return zzdicVar;
                }
                throw new zzehf(1, "Invalid template ID: " + zzdicVar.zzc());
            }
        });
        final com.google.common.util.concurrent.a zzf = this.zzb.zzf(jSONObject, "images");
        final com.google.common.util.concurrent.a zzg = this.zzb.zzg(jSONObject, "images", zzfbeVar, zzfbrVar.zzb.zzb);
        final com.google.common.util.concurrent.a zze = this.zzb.zze(jSONObject, "secondary_image");
        final com.google.common.util.concurrent.a zze2 = this.zzb.zze(jSONObject, "app_icon");
        final com.google.common.util.concurrent.a zzd = this.zzb.zzd(jSONObject, "attribution");
        final com.google.common.util.concurrent.a zzh = this.zzb.zzh(jSONObject, zzfbeVar, zzfbrVar.zzb.zzb);
        final com.google.common.util.concurrent.a zza = this.zzc.zza(jSONObject, "custom_assets");
        final zzdlf zzdlfVar = this.zzb;
        if (!jSONObject.optBoolean("enable_omid")) {
            zzn = zzfye.zzh(null);
        } else {
            JSONObject optJSONObject = jSONObject.optJSONObject("omid_settings");
            if (optJSONObject == null) {
                zzn = zzfye.zzh(null);
            } else {
                final String optString = optJSONObject.optString("omid_html");
                if (TextUtils.isEmpty(optString)) {
                    zzn = zzfye.zzh(null);
                } else {
                    zzn = zzfye.zzn(zzfye.zzh(null), new zzfxl() { // from class: com.google.android.gms.internal.ads.zzdku
                        @Override // com.google.android.gms.internal.ads.zzfxl
                        public final com.google.common.util.concurrent.a zza(Object obj) {
                            return zzdlf.this.zzc(optString, obj);
                        }
                    }, zzcan.zze);
                }
            }
        }
        final com.google.common.util.concurrent.a aVar = zzn;
        ArrayList arrayList = new ArrayList();
        arrayList.add(zzb);
        arrayList.add(zzf);
        arrayList.add(zzg);
        arrayList.add(zze);
        arrayList.add(zze2);
        arrayList.add(zzd);
        arrayList.add(zzh);
        arrayList.add(zza);
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzeX)).booleanValue()) {
            arrayList.add(aVar);
        }
        return zzfye.zza(arrayList).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzdkr
            @Override // java.util.concurrent.Callable
            public final Object call() {
                com.google.common.util.concurrent.a aVar2 = zzb;
                com.google.common.util.concurrent.a aVar3 = zzf;
                com.google.common.util.concurrent.a aVar4 = zze2;
                com.google.common.util.concurrent.a aVar5 = zze;
                com.google.common.util.concurrent.a aVar6 = zzd;
                JSONObject jSONObject2 = jSONObject;
                com.google.common.util.concurrent.a aVar7 = zzh;
                com.google.common.util.concurrent.a aVar8 = zzg;
                com.google.common.util.concurrent.a aVar9 = aVar;
                com.google.common.util.concurrent.a aVar10 = zza;
                zzdic zzdicVar = (zzdic) aVar2.get();
                zzdicVar.zzP((List) aVar3.get());
                zzdicVar.zzM((zzbew) aVar4.get());
                zzdicVar.zzQ((zzbew) aVar5.get());
                zzdicVar.zzJ((zzbeo) aVar6.get());
                zzdicVar.zzS(zzdlf.zzj(jSONObject2));
                zzdicVar.zzL(zzdlf.zzi(jSONObject2));
                zzcfi zzcfiVar = (zzcfi) aVar7.get();
                if (zzcfiVar != null) {
                    zzdicVar.zzad(zzcfiVar);
                    zzdicVar.zzac(zzcfiVar.zzF());
                    zzdicVar.zzab(zzcfiVar.zzq());
                }
                zzcfi zzcfiVar2 = (zzcfi) aVar8.get();
                if (zzcfiVar2 != null) {
                    zzdicVar.zzO(zzcfiVar2);
                    zzdicVar.zzae(zzcfiVar2.zzF());
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzeX)).booleanValue()) {
                    zzdicVar.zzU(aVar9);
                    zzdicVar.zzX(new zzcas());
                } else {
                    zzcfi zzcfiVar3 = (zzcfi) aVar9.get();
                    if (zzcfiVar3 != null) {
                        zzdicVar.zzT(zzcfiVar3);
                    }
                }
                for (zzdlj zzdljVar : (List) aVar10.get()) {
                    if (zzdljVar.zza != 1) {
                        zzdicVar.zzN(zzdljVar.zzb, zzdljVar.zzd);
                    } else {
                        zzdicVar.zzZ(zzdljVar.zzb, zzdljVar.zzc);
                    }
                }
                return zzdicVar;
            }
        }, this.zza);
    }
}
