package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzdzy extends zzbuc {
    private final Context zza;
    private final zzetx zzb;
    private final zzetv zzc;
    private final zzeag zzd;
    private final zzfyo zze;
    private final zzead zzf;
    private final zzbuz zzg;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdzy(Context context, zzetx zzetxVar, zzetv zzetvVar, zzead zzeadVar, zzeag zzeagVar, zzfyo zzfyoVar, zzbuz zzbuzVar) {
        this.zza = context;
        this.zzb = zzetxVar;
        this.zzc = zzetvVar;
        this.zzf = zzeadVar;
        this.zzd = zzeagVar;
        this.zze = zzfyoVar;
        this.zzg = zzbuzVar;
    }

    private final void zzc(com.google.common.util.concurrent.a aVar, zzbug zzbugVar) {
        zzfye.zzr(zzfye.zzn(zzfxv.zzu(aVar), new zzfxl() { // from class: com.google.android.gms.internal.ads.zzdzq
            @Override // com.google.android.gms.internal.ads.zzfxl
            public final com.google.common.util.concurrent.a zza(Object obj) {
                return zzfye.zzh(zzfda.zza((InputStream) obj));
            }
        }, zzcan.zza), new zzdzx(this, zzbugVar), zzcan.zzf);
    }

    public final com.google.common.util.concurrent.a zzb(zzbtv zzbtvVar, int i10) {
        com.google.common.util.concurrent.a zzh;
        String str = zzbtvVar.zza;
        int i11 = zzbtvVar.zzb;
        Bundle bundle = zzbtvVar.zzc;
        HashMap hashMap = new HashMap();
        if (bundle != null) {
            for (String str2 : bundle.keySet()) {
                String string = bundle.getString(str2);
                if (string != null) {
                    hashMap.put(str2, string);
                }
            }
        }
        final zzeaa zzeaaVar = new zzeaa(str, i11, hashMap, zzbtvVar.zzd, "", zzbtvVar.zze);
        zzetv zzetvVar = this.zzc;
        zzetvVar.zza(new zzevc(zzbtvVar));
        zzetw zzb = zzetvVar.zzb();
        if (zzeaaVar.zzf) {
            String str3 = zzbtvVar.zza;
            String str4 = (String) zzbdq.zzb.zze();
            if (!TextUtils.isEmpty(str4)) {
                String host = Uri.parse(str3).getHost();
                if (!TextUtils.isEmpty(host)) {
                    Iterator it = zzfrv.zzc(zzfqt.zzc(';')).zzd(str4).iterator();
                    while (it.hasNext()) {
                        if (host.endsWith((String) it.next())) {
                            zzh = zzfye.zzm(zzb.zza().zza(new JSONObject()), new zzfqw() { // from class: com.google.android.gms.internal.ads.zzdzw
                                @Override // com.google.android.gms.internal.ads.zzfqw
                                public final Object apply(Object obj) {
                                    zzeaa zzeaaVar2 = zzeaa.this;
                                    zzeag.zza(zzeaaVar2.zzc, (JSONObject) obj);
                                    return zzeaaVar2;
                                }
                            }, this.zze);
                            break;
                        }
                    }
                }
            }
        }
        zzh = zzfye.zzh(zzeaaVar);
        zzfge zzb2 = zzb.zzb();
        return zzfye.zzn(zzb2.zzb(zzffy.HTTP, zzh).zze(new zzeac(this.zza, "", this.zzg, i10)).zza(), new zzfxl() { // from class: com.google.android.gms.internal.ads.zzdzs
            @Override // com.google.android.gms.internal.ads.zzfxl
            public final com.google.common.util.concurrent.a zza(Object obj) {
                zzeab zzeabVar = (zzeab) obj;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("response", zzeabVar.zza);
                    JSONObject jSONObject2 = new JSONObject();
                    for (String str5 : zzeabVar.zzb.keySet()) {
                        if (str5 != null) {
                            List<String> list = (List) zzeabVar.zzb.get(str5);
                            JSONArray jSONArray = new JSONArray();
                            for (String str6 : list) {
                                if (str6 != null) {
                                    jSONArray.put(str6);
                                }
                            }
                            jSONObject2.put(str5, jSONArray);
                        }
                    }
                    jSONObject.put("headers", jSONObject2);
                    Object obj2 = zzeabVar.zzc;
                    if (obj2 != null) {
                        jSONObject.put("body", obj2);
                    }
                    jSONObject.put("latency", zzeabVar.zzd);
                    return zzfye.zzh(new ByteArrayInputStream(jSONObject.toString().getBytes(StandardCharsets.UTF_8)));
                } catch (JSONException e10) {
                    zzcaa.zzj("Error converting response to JSONObject: ".concat(String.valueOf(e10.getMessage())));
                    throw new JSONException("Parsing HTTP Response: ".concat(String.valueOf(e10.getCause())));
                }
            }
        }, this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzbud
    public final void zze(zzbtv zzbtvVar, zzbug zzbugVar) {
        zzc(zzb(zzbtvVar, Binder.getCallingUid()), zzbugVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbud
    public final void zzf(zzbtr zzbtrVar, zzbug zzbugVar) {
        int callingUid = Binder.getCallingUid();
        zzetx zzetxVar = this.zzb;
        zzetxVar.zza(new zzetm(zzbtrVar, callingUid));
        final zzety zzb = zzetxVar.zzb();
        zzfge zzb2 = zzb.zzb();
        zzffj zza = zzb2.zzb(zzffy.GMS_SIGNALS, zzfye.zzi()).zzf(new zzfxl() { // from class: com.google.android.gms.internal.ads.zzdzv
            @Override // com.google.android.gms.internal.ads.zzfxl
            public final com.google.common.util.concurrent.a zza(Object obj) {
                Void r22 = (Void) obj;
                return zzety.this.zza().zza(new JSONObject());
            }
        }).zze(new zzffh() { // from class: com.google.android.gms.internal.ads.zzdzu
            @Override // com.google.android.gms.internal.ads.zzffh
            public final Object zza(Object obj) {
                JSONObject jSONObject = (JSONObject) obj;
                com.google.android.gms.ads.internal.util.zze.zza("GMS AdRequest Signals: ");
                com.google.android.gms.ads.internal.util.zze.zza(jSONObject.toString(2));
                return jSONObject;
            }
        }).zzf(new zzfxl() { // from class: com.google.android.gms.internal.ads.zzdzt
            @Override // com.google.android.gms.internal.ads.zzfxl
            public final com.google.common.util.concurrent.a zza(Object obj) {
                return zzfye.zzh(new ByteArrayInputStream(((JSONObject) obj).toString().getBytes(StandardCharsets.UTF_8)));
            }
        }).zza();
        zzc(zza, zzbugVar);
        if (((Boolean) zzbdk.zzd.zze()).booleanValue()) {
            final zzeag zzeagVar = this.zzd;
            zzeagVar.getClass();
            zza.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdzr
                @Override // java.lang.Runnable
                public final void run() {
                    zzeag.this.zzb();
                }
            }, this.zze);
        }
    }
}
