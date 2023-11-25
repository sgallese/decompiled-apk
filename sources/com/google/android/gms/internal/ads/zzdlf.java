package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.wearable.WearableStatusCodes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzdlf {
    private final Context zza;
    private final zzdko zzb;
    private final zzaqx zzc;
    private final zzcag zzd;
    private final com.google.android.gms.ads.internal.zza zze;
    private final zzaxe zzf;
    private final Executor zzg;
    private final zzbek zzh;
    private final zzdlx zzi;
    private final zzdom zzj;
    private final ScheduledExecutorService zzk;
    private final zzdnh zzl;
    private final zzdrh zzm;
    private final zzfgo zzn;
    private final zzfik zzo;
    private final zzech zzp;
    private final zzecs zzq;

    public zzdlf(Context context, zzdko zzdkoVar, zzaqx zzaqxVar, zzcag zzcagVar, com.google.android.gms.ads.internal.zza zzaVar, zzaxe zzaxeVar, Executor executor, zzfca zzfcaVar, zzdlx zzdlxVar, zzdom zzdomVar, ScheduledExecutorService scheduledExecutorService, zzdrh zzdrhVar, zzfgo zzfgoVar, zzfik zzfikVar, zzech zzechVar, zzdnh zzdnhVar, zzecs zzecsVar) {
        this.zza = context;
        this.zzb = zzdkoVar;
        this.zzc = zzaqxVar;
        this.zzd = zzcagVar;
        this.zze = zzaVar;
        this.zzf = zzaxeVar;
        this.zzg = executor;
        this.zzh = zzfcaVar.zzi;
        this.zzi = zzdlxVar;
        this.zzj = zzdomVar;
        this.zzk = scheduledExecutorService;
        this.zzm = zzdrhVar;
        this.zzn = zzfgoVar;
        this.zzo = zzfikVar;
        this.zzp = zzechVar;
        this.zzl = zzdnhVar;
        this.zzq = zzecsVar;
    }

    public static final com.google.android.gms.ads.internal.client.zzel zzi(JSONObject jSONObject) {
        JSONObject optJSONObject;
        JSONObject optJSONObject2 = jSONObject.optJSONObject("mute");
        if (optJSONObject2 == null || (optJSONObject = optJSONObject2.optJSONObject("default_reason")) == null) {
            return null;
        }
        return zzr(optJSONObject);
    }

    public static final List zzj(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("mute");
        if (optJSONObject == null) {
            return zzfud.zzl();
        }
        JSONArray optJSONArray = optJSONObject.optJSONArray("reasons");
        if (optJSONArray != null && optJSONArray.length() > 0) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                com.google.android.gms.ads.internal.client.zzel zzr = zzr(optJSONArray.optJSONObject(i10));
                if (zzr != null) {
                    arrayList.add(zzr);
                }
            }
            return zzfud.zzj(arrayList);
        }
        return zzfud.zzl();
    }

    private final com.google.android.gms.ads.internal.client.zzq zzk(int i10, int i11) {
        if (i10 == 0) {
            if (i11 != 0) {
                i10 = 0;
            } else {
                return com.google.android.gms.ads.internal.client.zzq.zzc();
            }
        }
        return new com.google.android.gms.ads.internal.client.zzq(this.zza, new AdSize(i10, i11));
    }

    private static com.google.common.util.concurrent.a zzl(com.google.common.util.concurrent.a aVar, Object obj) {
        final Object obj2 = null;
        return zzfye.zzf(aVar, Exception.class, new zzfxl(obj2) { // from class: com.google.android.gms.internal.ads.zzdlc
            @Override // com.google.android.gms.internal.ads.zzfxl
            public final com.google.common.util.concurrent.a zza(Object obj3) {
                com.google.android.gms.ads.internal.util.zze.zzb("Error during loading assets.", (Exception) obj3);
                return zzfye.zzh(null);
            }
        }, zzcan.zzf);
    }

    private static com.google.common.util.concurrent.a zzm(boolean z10, final com.google.common.util.concurrent.a aVar, Object obj) {
        if (z10) {
            return zzfye.zzn(aVar, new zzfxl() { // from class: com.google.android.gms.internal.ads.zzdla
                @Override // com.google.android.gms.internal.ads.zzfxl
                public final com.google.common.util.concurrent.a zza(Object obj2) {
                    com.google.common.util.concurrent.a aVar2 = com.google.common.util.concurrent.a.this;
                    if (obj2 != null) {
                        return aVar2;
                    }
                    return zzfye.zzg(new zzehf(1, "Retrieve required value in native ad response failed."));
                }
            }, zzcan.zzf);
        }
        return zzl(aVar, null);
    }

    private final com.google.common.util.concurrent.a zzn(JSONObject jSONObject, boolean z10) {
        if (jSONObject == null) {
            return zzfye.zzh(null);
        }
        final String optString = jSONObject.optString(ImagesContract.URL);
        if (TextUtils.isEmpty(optString)) {
            return zzfye.zzh(null);
        }
        final double optDouble = jSONObject.optDouble("scale", 1.0d);
        boolean optBoolean = jSONObject.optBoolean("is_transparent", true);
        final int optInt = jSONObject.optInt("width", -1);
        final int optInt2 = jSONObject.optInt("height", -1);
        if (z10) {
            return zzfye.zzh(new zzbei(null, Uri.parse(optString), optDouble, optInt, optInt2));
        }
        return zzm(jSONObject.optBoolean("require"), zzfye.zzm(this.zzb.zzb(optString, optDouble, optBoolean), new zzfqw() { // from class: com.google.android.gms.internal.ads.zzdld
            @Override // com.google.android.gms.internal.ads.zzfqw
            public final Object apply(Object obj) {
                String str = optString;
                return new zzbei(new BitmapDrawable(Resources.getSystem(), (Bitmap) obj), Uri.parse(str), optDouble, optInt, optInt2);
            }
        }, this.zzg), null);
    }

    private final com.google.common.util.concurrent.a zzo(JSONArray jSONArray, boolean z10, boolean z11) {
        int i10;
        if (jSONArray != null && jSONArray.length() > 0) {
            ArrayList arrayList = new ArrayList();
            if (z11) {
                i10 = jSONArray.length();
            } else {
                i10 = 1;
            }
            for (int i11 = 0; i11 < i10; i11++) {
                arrayList.add(zzn(jSONArray.optJSONObject(i11), z10));
            }
            return zzfye.zzm(zzfye.zzd(arrayList), new zzfqw() { // from class: com.google.android.gms.internal.ads.zzdlb
                @Override // com.google.android.gms.internal.ads.zzfqw
                public final Object apply(Object obj) {
                    ArrayList arrayList2 = new ArrayList();
                    for (zzbei zzbeiVar : (List) obj) {
                        if (zzbeiVar != null) {
                            arrayList2.add(zzbeiVar);
                        }
                    }
                    return arrayList2;
                }
            }, this.zzg);
        }
        return zzfye.zzh(Collections.emptyList());
    }

    private final com.google.common.util.concurrent.a zzp(JSONObject jSONObject, zzfbe zzfbeVar, zzfbi zzfbiVar) {
        final com.google.common.util.concurrent.a zzb = this.zzi.zzb(jSONObject.optString("base_url"), jSONObject.optString("html"), zzfbeVar, zzfbiVar, zzk(jSONObject.optInt("width", 0), jSONObject.optInt("height", 0)));
        return zzfye.zzn(zzb, new zzfxl() { // from class: com.google.android.gms.internal.ads.zzdle
            @Override // com.google.android.gms.internal.ads.zzfxl
            public final com.google.common.util.concurrent.a zza(Object obj) {
                com.google.common.util.concurrent.a aVar = com.google.common.util.concurrent.a.this;
                zzcfi zzcfiVar = (zzcfi) obj;
                if (zzcfiVar != null && zzcfiVar.zzq() != null) {
                    return aVar;
                }
                throw new zzehf(1, "Retrieve video view in html5 ad response failed.");
            }
        }, zzcan.zzf);
    }

    private static Integer zzq(JSONObject jSONObject, String str) {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            return Integer.valueOf(Color.rgb(jSONObject2.getInt("r"), jSONObject2.getInt("g"), jSONObject2.getInt("b")));
        } catch (JSONException unused) {
            return null;
        }
    }

    private static final com.google.android.gms.ads.internal.client.zzel zzr(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String optString = jSONObject.optString("reason");
        String optString2 = jSONObject.optString("ping_url");
        if (TextUtils.isEmpty(optString) || TextUtils.isEmpty(optString2)) {
            return null;
        }
        return new com.google.android.gms.ads.internal.client.zzel(optString, optString2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzbef zza(JSONObject jSONObject, List list) {
        Integer num = null;
        if (list == null || list.isEmpty()) {
            return null;
        }
        String optString = jSONObject.optString("text");
        Integer zzq = zzq(jSONObject, "bg_color");
        Integer zzq2 = zzq(jSONObject, "text_color");
        int optInt = jSONObject.optInt("text_size", -1);
        boolean optBoolean = jSONObject.optBoolean("allow_pub_rendering");
        int optInt2 = jSONObject.optInt("animation_ms", 1000);
        int optInt3 = jSONObject.optInt("presentation_ms", WearableStatusCodes.TARGET_NODE_NOT_CONNECTED);
        if (optInt > 0) {
            num = Integer.valueOf(optInt);
        }
        return new zzbef(optString, list, zzq, zzq2, num, optInt3 + optInt2, this.zzh.zze, optBoolean);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ com.google.common.util.concurrent.a zzb(com.google.android.gms.ads.internal.client.zzq zzqVar, zzfbe zzfbeVar, zzfbi zzfbiVar, String str, String str2, Object obj) throws Exception {
        zzcfi zza = this.zzj.zza(zzqVar, zzfbeVar, zzfbiVar);
        final zzcar zza2 = zzcar.zza(zza);
        zzdne zzb = this.zzl.zzb();
        zza.zzN().zzM(zzb, zzb, zzb, zzb, zzb, false, null, new com.google.android.gms.ads.internal.zzb(this.zza, null, null), null, null, this.zzp, this.zzo, this.zzm, this.zzn, null, zzb, null, null, null);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzdB)).booleanValue()) {
            zza.zzad("/getNativeAdViewSignals", zzbiq.zzs);
        }
        zza.zzad("/getNativeClickMeta", zzbiq.zzt);
        zza.zzN().zzA(new zzcgt() { // from class: com.google.android.gms.internal.ads.zzdkz
            @Override // com.google.android.gms.internal.ads.zzcgt
            public final void zza(boolean z10, int i10, String str3, String str4) {
                zzcar zzcarVar = zzcar.this;
                if (z10) {
                    zzcarVar.zzb();
                    return;
                }
                zzcarVar.zzd(new zzehf(1, "Image Web View failed to load. Error code: " + i10 + ", Description: " + str3 + ", Failing URL: " + str4));
            }
        });
        zza.zzab(str, str2, null);
        return zza2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ com.google.common.util.concurrent.a zzc(String str, Object obj) throws Exception {
        com.google.android.gms.ads.internal.zzt.zzz();
        zzcfi zza = zzcfu.zza(this.zza, zzcgx.zza(), "native-omid", false, false, this.zzc, null, this.zzd, null, null, this.zze, this.zzf, null, null, this.zzq);
        final zzcar zza2 = zzcar.zza(zza);
        zza.zzN().zzA(new zzcgt() { // from class: com.google.android.gms.internal.ads.zzdkv
            @Override // com.google.android.gms.internal.ads.zzcgt
            public final void zza(boolean z10, int i10, String str2, String str3) {
                zzcar.this.zzb();
            }
        });
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzeU)).booleanValue()) {
            zza.loadData(Base64.encodeToString(str.getBytes(), 1), "text/html", "base64");
        } else {
            zza.loadData(str, "text/html", "UTF-8");
        }
        return zza2;
    }

    public final com.google.common.util.concurrent.a zzd(JSONObject jSONObject, String str) {
        final JSONObject optJSONObject = jSONObject.optJSONObject("attribution");
        if (optJSONObject == null) {
            return zzfye.zzh(null);
        }
        JSONArray optJSONArray = optJSONObject.optJSONArray("images");
        JSONObject optJSONObject2 = optJSONObject.optJSONObject("image");
        if (optJSONArray == null && optJSONObject2 != null) {
            optJSONArray = new JSONArray();
            optJSONArray.put(optJSONObject2);
        }
        return zzm(optJSONObject.optBoolean("require"), zzfye.zzm(zzo(optJSONArray, false, true), new zzfqw() { // from class: com.google.android.gms.internal.ads.zzdkw
            @Override // com.google.android.gms.internal.ads.zzfqw
            public final Object apply(Object obj) {
                return zzdlf.this.zza(optJSONObject, (List) obj);
            }
        }, this.zzg), null);
    }

    public final com.google.common.util.concurrent.a zze(JSONObject jSONObject, String str) {
        return zzn(jSONObject.optJSONObject(str), this.zzh.zzb);
    }

    public final com.google.common.util.concurrent.a zzf(JSONObject jSONObject, String str) {
        JSONArray optJSONArray = jSONObject.optJSONArray("images");
        zzbek zzbekVar = this.zzh;
        return zzo(optJSONArray, zzbekVar.zzb, zzbekVar.zzd);
    }

    public final com.google.common.util.concurrent.a zzg(JSONObject jSONObject, String str, final zzfbe zzfbeVar, final zzfbi zzfbiVar) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzjn)).booleanValue()) {
            return zzfye.zzh(null);
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("images");
        if (optJSONArray != null && optJSONArray.length() > 0) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(0);
            if (optJSONObject == null) {
                return zzfye.zzh(null);
            }
            final String optString = optJSONObject.optString("base_url");
            final String optString2 = optJSONObject.optString("html");
            final com.google.android.gms.ads.internal.client.zzq zzk = zzk(optJSONObject.optInt("width", 0), optJSONObject.optInt("height", 0));
            if (TextUtils.isEmpty(optString2)) {
                return zzfye.zzh(null);
            }
            final com.google.common.util.concurrent.a zzn = zzfye.zzn(zzfye.zzh(null), new zzfxl() { // from class: com.google.android.gms.internal.ads.zzdkx
                @Override // com.google.android.gms.internal.ads.zzfxl
                public final com.google.common.util.concurrent.a zza(Object obj) {
                    return zzdlf.this.zzb(zzk, zzfbeVar, zzfbiVar, optString, optString2, obj);
                }
            }, zzcan.zze);
            return zzfye.zzn(zzn, new zzfxl() { // from class: com.google.android.gms.internal.ads.zzdky
                @Override // com.google.android.gms.internal.ads.zzfxl
                public final com.google.common.util.concurrent.a zza(Object obj) {
                    com.google.common.util.concurrent.a aVar = com.google.common.util.concurrent.a.this;
                    if (((zzcfi) obj) != null) {
                        return aVar;
                    }
                    throw new zzehf(1, "Retrieve Web View from image ad response failed.");
                }
            }, zzcan.zzf);
        }
        return zzfye.zzh(null);
    }

    public final com.google.common.util.concurrent.a zzh(JSONObject jSONObject, zzfbe zzfbeVar, zzfbi zzfbiVar) {
        com.google.common.util.concurrent.a zza;
        JSONObject zzg = com.google.android.gms.ads.internal.util.zzbu.zzg(jSONObject, "html_containers", "instream");
        if (zzg == null) {
            JSONObject optJSONObject = jSONObject.optJSONObject("video");
            if (optJSONObject == null) {
                return zzfye.zzh(null);
            }
            String optString = optJSONObject.optString("vast_xml");
            boolean z10 = false;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzjm)).booleanValue() && optJSONObject.has("html")) {
                z10 = true;
            }
            if (TextUtils.isEmpty(optString)) {
                if (!z10) {
                    zzcaa.zzj("Required field 'vast_xml' or 'html' is missing");
                    return zzfye.zzh(null);
                }
            } else if (!z10) {
                zza = this.zzi.zza(optJSONObject);
                return zzl(zzfye.zzo(zza, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzdC)).intValue(), TimeUnit.SECONDS, this.zzk), null);
            }
            zza = zzp(optJSONObject, zzfbeVar, zzfbiVar);
            return zzl(zzfye.zzo(zza, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzdC)).intValue(), TimeUnit.SECONDS, this.zzk), null);
        }
        return zzp(zzg, zzfbeVar, zzfbiVar);
    }
}
