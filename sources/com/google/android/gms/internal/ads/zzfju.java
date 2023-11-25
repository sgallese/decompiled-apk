package com.google.android.gms.internal.ads;

import android.os.Build;
import android.webkit.WebView;
import java.util.Date;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public class zzfju {
    private zzfkw zza;
    private long zzb;
    private int zzc;

    public zzfju() {
        zzb();
        this.zza = new zzfkw(null);
    }

    public final WebView zza() {
        return (WebView) this.zza.get();
    }

    public final void zzb() {
        this.zzb = System.nanoTime();
        this.zzc = 1;
    }

    public void zzc() {
        this.zza.clear();
    }

    public final void zzd(String str, long j10) {
        if (j10 >= this.zzb && this.zzc != 3) {
            this.zzc = 3;
            zzfjn.zza().zzg(zza(), str);
        }
    }

    public final void zze(Date date) {
        if (date == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        zzfjz.zze(jSONObject, "timestamp", Long.valueOf(date.getTime()));
        zzfjn.zza().zzf(zza(), jSONObject);
    }

    public final void zzf(String str, long j10) {
        if (j10 >= this.zzb) {
            this.zzc = 2;
            zzfjn.zza().zzg(zza(), str);
        }
    }

    public void zzg(zzfit zzfitVar, zzfir zzfirVar) {
        zzh(zzfitVar, zzfirVar, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzh(zzfit zzfitVar, zzfir zzfirVar, JSONObject jSONObject) {
        String zzh = zzfitVar.zzh();
        JSONObject jSONObject2 = new JSONObject();
        zzfjz.zze(jSONObject2, "environment", "app");
        zzfjz.zze(jSONObject2, "adSessionType", zzfirVar.zzd());
        JSONObject jSONObject3 = new JSONObject();
        zzfjz.zze(jSONObject3, "deviceType", Build.MANUFACTURER + "; " + Build.MODEL);
        zzfjz.zze(jSONObject3, "osVersion", Integer.toString(Build.VERSION.SDK_INT));
        zzfjz.zze(jSONObject3, "os", "Android");
        zzfjz.zze(jSONObject2, "deviceInfo", jSONObject3);
        zzfjz.zze(jSONObject2, "deviceCategory", zzfjy.zza().toString());
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        zzfjz.zze(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject4 = new JSONObject();
        zzfjz.zze(jSONObject4, "partnerName", zzfirVar.zze().zzb());
        zzfjz.zze(jSONObject4, "partnerVersion", zzfirVar.zze().zzc());
        zzfjz.zze(jSONObject2, "omidNativeInfo", jSONObject4);
        JSONObject jSONObject5 = new JSONObject();
        zzfjz.zze(jSONObject5, "libraryVersion", "1.4.6-google_20230720");
        zzfjz.zze(jSONObject5, "appId", zzfjl.zzb().zza().getApplicationContext().getPackageName());
        zzfjz.zze(jSONObject2, "app", jSONObject5);
        if (zzfirVar.zzf() != null) {
            zzfjz.zze(jSONObject2, "contentUrl", zzfirVar.zzf());
        }
        zzfjz.zze(jSONObject2, "customReferenceData", zzfirVar.zzg());
        JSONObject jSONObject6 = new JSONObject();
        Iterator it = zzfirVar.zzh().iterator();
        if (!it.hasNext()) {
            zzfjn.zza().zzh(zza(), zzh, jSONObject2, jSONObject6, jSONObject);
        } else {
            zzfja zzfjaVar = (zzfja) it.next();
            throw null;
        }
    }

    public final void zzi(float f10) {
        zzfjn.zza().zze(zza(), f10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzj(WebView webView) {
        this.zza = new zzfkw(webView);
    }

    public final boolean zzl() {
        if (this.zza.get() != 0) {
            return true;
        }
        return false;
    }

    public void zzk() {
    }
}
