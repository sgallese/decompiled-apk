package com.google.android.gms.ads.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.ads.zzbbj;
import com.google.android.gms.internal.ads.zzbbr;
import com.google.android.gms.internal.ads.zzbmy;
import com.google.android.gms.internal.ads.zzbnc;
import com.google.android.gms.internal.ads.zzbnf;
import com.google.android.gms.internal.ads.zzbni;
import com.google.android.gms.internal.ads.zzbzd;
import com.google.android.gms.internal.ads.zzcaa;
import com.google.android.gms.internal.ads.zzcag;
import com.google.android.gms.internal.ads.zzcan;
import com.google.android.gms.internal.ads.zzcaq;
import com.google.android.gms.internal.ads.zzfhf;
import com.google.android.gms.internal.ads.zzfhg;
import com.google.android.gms.internal.ads.zzfhu;
import com.google.android.gms.internal.ads.zzfxl;
import com.google.android.gms.internal.ads.zzfye;
import com.google.android.gms.internal.ads.zzfyo;
import com.google.common.util.concurrent.a;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes.dex */
public final class zze {
    private Context zza;
    private long zzb = 0;

    public final void zza(Context context, zzcag zzcagVar, String str, Runnable runnable, zzfhu zzfhuVar) {
        zzb(context, zzcagVar, true, null, str, null, runnable, zzfhuVar);
    }

    final void zzb(Context context, zzcag zzcagVar, boolean z10, zzbzd zzbzdVar, String str, String str2, Runnable runnable, final zzfhu zzfhuVar) {
        PackageInfo packageInfo;
        if (zzt.zzB().elapsedRealtime() - this.zzb < 5000) {
            zzcaa.zzj("Not retrying to fetch app settings");
            return;
        }
        this.zzb = zzt.zzB().elapsedRealtime();
        if (zzbzdVar != null && !TextUtils.isEmpty(zzbzdVar.zzc())) {
            if (zzt.zzB().currentTimeMillis() - zzbzdVar.zza() <= ((Long) zzba.zzc().zzb(zzbbr.zzdT)).longValue() && zzbzdVar.zzi()) {
                return;
            }
        }
        if (context == null) {
            zzcaa.zzj("Context not provided to fetch application settings");
        } else if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            zzcaa.zzj("App settings could not be fetched. Required parameters missing");
        } else {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext == null) {
                applicationContext = context;
            }
            this.zza = applicationContext;
            final zzfhg zza = zzfhf.zza(context, 4);
            zza.zzh();
            zzbni zza2 = zzt.zzf().zza(this.zza, zzcagVar, zzfhuVar);
            zzbnc zzbncVar = zzbnf.zza;
            zzbmy zza3 = zza2.zza("google.afma.config.fetchAppSettings", zzbncVar, zzbncVar);
            try {
                JSONObject jSONObject = new JSONObject();
                if (!TextUtils.isEmpty(str)) {
                    jSONObject.put("app_id", str);
                } else if (!TextUtils.isEmpty(str2)) {
                    jSONObject.put("ad_unit_id", str2);
                }
                jSONObject.put("is_init", z10);
                jSONObject.put("pn", context.getPackageName());
                zzbbj zzbbjVar = zzbbr.zza;
                jSONObject.put("experiment_ids", TextUtils.join(",", zzba.zza().zza()));
                jSONObject.put("js", zzcagVar.zza);
                try {
                    ApplicationInfo applicationInfo = this.zza.getApplicationInfo();
                    if (applicationInfo != null && (packageInfo = Wrappers.packageManager(context).getPackageInfo(applicationInfo.packageName, 0)) != null) {
                        jSONObject.put("version", packageInfo.versionCode);
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    com.google.android.gms.ads.internal.util.zze.zza("Error fetching PackageInfo.");
                }
                a zzb = zza3.zzb(jSONObject);
                zzfxl zzfxlVar = new zzfxl() { // from class: com.google.android.gms.ads.internal.zzd
                    @Override // com.google.android.gms.internal.ads.zzfxl
                    public final a zza(Object obj) {
                        zzfhu zzfhuVar2 = zzfhu.this;
                        zzfhg zzfhgVar = zza;
                        JSONObject jSONObject2 = (JSONObject) obj;
                        boolean optBoolean = jSONObject2.optBoolean("isSuccessful", false);
                        if (optBoolean) {
                            zzt.zzo().zzh().zzu(jSONObject2.getString("appSettingsJson"));
                        }
                        zzfhgVar.zzf(optBoolean);
                        zzfhuVar2.zzb(zzfhgVar.zzl());
                        return zzfye.zzh(null);
                    }
                };
                zzfyo zzfyoVar = zzcan.zzf;
                a zzn = zzfye.zzn(zzb, zzfxlVar, zzfyoVar);
                if (runnable != null) {
                    zzb.addListener(runnable, zzfyoVar);
                }
                zzcaq.zza(zzn, "ConfigLoader.maybeFetchNewAppSettings");
            } catch (Exception e10) {
                zzcaa.zzh("Error requesting application settings", e10);
                zza.zzg(e10);
                zza.zzf(false);
                zzfhuVar.zzb(zza.zzl());
            }
        }
    }

    public final void zzc(Context context, zzcag zzcagVar, String str, zzbzd zzbzdVar, zzfhu zzfhuVar) {
        String str2;
        if (zzbzdVar != null) {
            str2 = zzbzdVar.zzb();
        } else {
            str2 = null;
        }
        zzb(context, zzcagVar, false, zzbzdVar, str2, str, null, zzfhuVar);
    }
}
