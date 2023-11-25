package com.google.android.gms.ads.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.ads.zzbcy;
import com.google.android.gms.internal.ads.zzcaa;
import com.google.android.gms.internal.ads.zzcag;
import com.google.android.gms.internal.ads.zzesg;
import java.util.Map;
import java.util.TreeMap;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes.dex */
public final class zzr {
    private final Context zza;
    private final String zzb;
    private final Map zzc = new TreeMap();
    private String zzd;
    private String zze;
    private final String zzf;

    public zzr(Context context, String str) {
        String concat;
        this.zza = context.getApplicationContext();
        this.zzb = str;
        String packageName = context.getPackageName();
        try {
            concat = packageName + "-" + Wrappers.packageManager(context).getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e10) {
            zzcaa.zzh("Unable to get package version name for reporting", e10);
            concat = String.valueOf(packageName).concat("-missing");
        }
        this.zzf = concat;
    }

    public final String zza() {
        return this.zzf;
    }

    public final String zzb() {
        return this.zze;
    }

    public final String zzc() {
        return this.zzb;
    }

    public final String zzd() {
        return this.zzd;
    }

    public final Map zze() {
        return this.zzc;
    }

    public final void zzf(com.google.android.gms.ads.internal.client.zzl zzlVar, zzcag zzcagVar) {
        Bundle bundle;
        this.zzd = zzlVar.zzj.zza;
        Bundle bundle2 = zzlVar.zzm;
        if (bundle2 != null) {
            bundle = bundle2.getBundle(AdMobAdapter.class.getName());
        } else {
            bundle = null;
        }
        if (bundle == null) {
            return;
        }
        String str = (String) zzbcy.zzc.zze();
        for (String str2 : bundle.keySet()) {
            if (str.equals(str2)) {
                this.zze = bundle.getString(str2);
            } else if (str2.startsWith("csa_")) {
                this.zzc.put(str2.substring(4), bundle.getString(str2));
            }
        }
        this.zzc.put("SDKVersion", zzcagVar.zza);
        if (((Boolean) zzbcy.zza.zze()).booleanValue()) {
            try {
                Bundle zzc = zzesg.zzc(this.zza, new JSONArray((String) zzbcy.zzb.zze()));
                for (String str3 : zzc.keySet()) {
                    this.zzc.put(str3, zzc.get(str3).toString());
                }
            } catch (JSONException e10) {
                zzcaa.zzh("Flag gads:afs:csa_tcf_data_to_collect not a valid JSON array", e10);
            }
        }
    }
}
