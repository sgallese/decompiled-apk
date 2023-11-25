package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
@Deprecated
/* loaded from: classes3.dex */
public final class zzdrc {
    private final ConcurrentHashMap zza;
    private final zzbzn zzb;
    private final zzfca zzc;
    private final String zzd;
    private final String zze;

    public zzdrc(zzdrm zzdrmVar, zzbzn zzbznVar, zzfca zzfcaVar, String str, String str2) {
        ConcurrentHashMap zzc = zzdrmVar.zzc();
        this.zza = zzc;
        this.zzb = zzbznVar;
        this.zzc = zzfcaVar;
        this.zzd = str;
        this.zze = str2;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzgS)).booleanValue()) {
            return;
        }
        int zze = com.google.android.gms.ads.nonagon.signalgeneration.zzf.zze(zzfcaVar);
        int i10 = zze - 1;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        zzc.put("se", "r_both");
                    } else {
                        zzc.put("se", "r_adstring");
                    }
                } else {
                    zzc.put("se", "r_adinfo");
                }
            } else {
                zzc.put("se", "query_g");
            }
            zzc.put("scar", "true");
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzhr)).booleanValue()) {
                zzc.put("ad_format", str2);
            }
            if (zze == 2) {
                zzc.put("rid", str);
            }
            zzd("ragent", zzfcaVar.zzd.zzp);
            zzd("rtype", com.google.android.gms.ads.nonagon.signalgeneration.zzf.zza(com.google.android.gms.ads.nonagon.signalgeneration.zzf.zzb(zzfcaVar.zzd)));
            return;
        }
        zzc.put("scar", "false");
    }

    private final void zzd(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            this.zza.put(str, str2);
        }
    }

    public final Map zza() {
        return this.zza;
    }

    public final void zzb(zzfbr zzfbrVar) {
        String str;
        if (!zzfbrVar.zzb.zza.isEmpty()) {
            switch (((zzfbe) zzfbrVar.zzb.zza.get(0)).zzb) {
                case 1:
                    this.zza.put("ad_format", "banner");
                    break;
                case 2:
                    this.zza.put("ad_format", "interstitial");
                    break;
                case 3:
                    this.zza.put("ad_format", "native_express");
                    break;
                case 4:
                    this.zza.put("ad_format", "native_advanced");
                    break;
                case 5:
                    this.zza.put("ad_format", "rewarded");
                    break;
                case 6:
                    this.zza.put("ad_format", "app_open_ad");
                    ConcurrentHashMap concurrentHashMap = this.zza;
                    if (true != this.zzb.zzm()) {
                        str = "0";
                    } else {
                        str = "1";
                    }
                    concurrentHashMap.put("as", str);
                    break;
                default:
                    this.zza.put("ad_format", "unknown");
                    break;
            }
        }
        zzd("gqi", zzfbrVar.zzb.zzb.zzb);
    }

    public final void zzc(Bundle bundle) {
        if (bundle.containsKey("cnt")) {
            this.zza.put("network_coarse", Integer.toString(bundle.getInt("cnt")));
        }
        if (bundle.containsKey("gnt")) {
            this.zza.put("network_fine", Integer.toString(bundle.getInt("gnt")));
        }
    }
}
