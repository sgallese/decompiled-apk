package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzeaf implements zzffh {
    private static final Pattern zza = Pattern.compile("([^;]+=[^;]+)(;\\s|$)", 2);
    private final String zzb;
    private final zzfhg zzc;
    private final zzfhr zzd;

    public zzeaf(String str, zzfhr zzfhrVar, zzfhg zzfhgVar) {
        this.zzb = str;
        this.zzd = zzfhrVar;
        this.zzc = zzfhgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzffh
    public final /* bridge */ /* synthetic */ Object zza(Object obj) throws Exception {
        JSONObject jSONObject;
        zzbuq zzbuqVar;
        zzdve zzdveVar;
        zzbuq zzbuqVar2;
        zzbuq zzbuqVar3;
        zzbuq zzbuqVar4;
        zzbuq zzbuqVar5;
        zzbuq zzbuqVar6;
        zzbuq zzbuqVar7;
        zzbuq zzbuqVar8;
        JSONObject jSONObject2;
        String str;
        zzeae zzeaeVar = (zzeae) obj;
        jSONObject = zzeaeVar.zza;
        int optInt = jSONObject.optInt("http_timeout_millis", 60000);
        zzbuqVar = zzeaeVar.zzb;
        String str2 = "";
        if (zzbuqVar.zza() == -2) {
            HashMap hashMap = new HashMap();
            zzbuqVar2 = zzeaeVar.zzb;
            if (zzbuqVar2.zzh() && !TextUtils.isEmpty(this.zzb)) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzaM)).booleanValue()) {
                    String str3 = this.zzb;
                    if (TextUtils.isEmpty(str3)) {
                        str = "";
                    } else {
                        Matcher matcher = zza.matcher(str3);
                        str = "";
                        while (matcher.find()) {
                            String group = matcher.group(1);
                            if (group != null) {
                                Locale locale = Locale.ROOT;
                                if (group.toLowerCase(locale).startsWith("id=") || group.toLowerCase(locale).startsWith("ide=")) {
                                    if (!TextUtils.isEmpty(str)) {
                                        str = str.concat("; ");
                                    }
                                    str = str.concat(group);
                                }
                            }
                        }
                    }
                    if (!TextUtils.isEmpty(str)) {
                        hashMap.put("Cookie", str);
                    }
                } else {
                    hashMap.put("Cookie", this.zzb);
                }
            }
            zzbuqVar3 = zzeaeVar.zzb;
            if (zzbuqVar3.zzi()) {
                jSONObject2 = zzeaeVar.zza;
                zzeag.zza(hashMap, jSONObject2);
            }
            zzbuqVar4 = zzeaeVar.zzb;
            if (zzbuqVar4 != null) {
                zzbuqVar7 = zzeaeVar.zzb;
                if (!TextUtils.isEmpty(zzbuqVar7.zzd())) {
                    zzbuqVar8 = zzeaeVar.zzb;
                    str2 = zzbuqVar8.zzd();
                }
            }
            zzfhr zzfhrVar = this.zzd;
            zzfhg zzfhgVar = this.zzc;
            zzfhgVar.zzf(true);
            zzfhrVar.zza(zzfhgVar);
            zzbuqVar5 = zzeaeVar.zzb;
            String zze = zzbuqVar5.zze();
            byte[] bytes = str2.getBytes(zzfqu.zzc);
            zzbuqVar6 = zzeaeVar.zzb;
            return new zzeaa(zze, optInt, hashMap, bytes, "", zzbuqVar6.zzi());
        }
        if (zzbuqVar.zza() == 1) {
            if (zzbuqVar.zzf() != null) {
                str2 = TextUtils.join(", ", zzbuqVar.zzf());
                zzcaa.zzg(str2);
            }
            zzdveVar = new zzdve(2, "Error building request URL: ".concat(String.valueOf(str2)));
        } else {
            zzdveVar = new zzdve(1);
        }
        zzfhr zzfhrVar2 = this.zzd;
        zzfhg zzfhgVar2 = this.zzc;
        zzfhgVar2.zzg(zzdveVar);
        zzfhgVar2.zzf(false);
        zzfhrVar2.zza(zzfhgVar2);
        throw zzdveVar;
    }
}
