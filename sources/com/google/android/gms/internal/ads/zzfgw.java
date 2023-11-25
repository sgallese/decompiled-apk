package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzfgw {
    private final Context zza;
    private final String zzb;
    private final String zzc;

    public zzfgw(Context context, zzcag zzcagVar) {
        this.zza = context;
        this.zzb = context.getPackageName();
        this.zzc = zzcagVar.zza;
    }

    public final void zza(Map map) {
        Object obj;
        map.put("s", "gmob_sdk");
        map.put("v", "3");
        map.put("os", Build.VERSION.RELEASE);
        map.put("api_v", Build.VERSION.SDK);
        com.google.android.gms.ads.internal.zzt.zzp();
        map.put("device", com.google.android.gms.ads.internal.util.zzs.zzp());
        map.put("app", this.zzb);
        com.google.android.gms.ads.internal.zzt.zzp();
        String str = "0";
        if (true != com.google.android.gms.ads.internal.util.zzs.zzB(this.zza)) {
            obj = "0";
        } else {
            obj = "1";
        }
        map.put("is_lite_sdk", obj);
        zzbbj zzbbjVar = zzbbr.zza;
        List zzb = com.google.android.gms.ads.internal.client.zzba.zza().zzb();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzgM)).booleanValue()) {
            zzb.addAll(com.google.android.gms.ads.internal.zzt.zzo().zzh().zzh().zzd());
        }
        map.put("e", TextUtils.join(",", zzb));
        map.put("sdkVersion", this.zzc);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzkg)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzp();
            if (true == com.google.android.gms.ads.internal.util.zzs.zzy(this.zza)) {
                str = "1";
            }
            map.put("is_bstar", str);
        }
    }
}
