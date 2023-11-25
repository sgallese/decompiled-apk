package com.google.android.gms.ads.nonagon.signalgeneration;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbbr;
import com.google.android.gms.internal.ads.zzcan;
import com.google.android.gms.internal.ads.zzdrc;
import com.google.android.gms.internal.ads.zzdrm;
import com.google.android.gms.internal.ads.zzfca;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes.dex */
public final class zzf {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static String zza(String str) {
        char c10;
        if (TextUtils.isEmpty(str)) {
            return "unspecified";
        }
        switch (str.hashCode()) {
            case 1743582862:
                if (str.equals("requester_type_0")) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case 1743582863:
                if (str.equals("requester_type_1")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case 1743582864:
                if (str.equals("requester_type_2")) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case 1743582865:
                if (str.equals("requester_type_3")) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case 1743582866:
                if (str.equals("requester_type_4")) {
                    c10 = 4;
                    break;
                }
                c10 = 65535;
                break;
            case 1743582867:
                if (str.equals("requester_type_5")) {
                    c10 = 5;
                    break;
                }
                c10 = 65535;
                break;
            case 1743582868:
                if (str.equals("requester_type_6")) {
                    c10 = 6;
                    break;
                }
                c10 = 65535;
                break;
            case 1743582869:
                if (str.equals("requester_type_7")) {
                    c10 = 7;
                    break;
                }
                c10 = 65535;
                break;
            case 1743582870:
                if (str.equals("requester_type_8")) {
                    c10 = '\b';
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        switch (c10) {
            case 0:
                return "0";
            case 1:
                return "1";
            case 2:
                return "2";
            case 3:
                return "3";
            case 4:
                return "4";
            case 5:
                return "5";
            case 6:
                return "6";
            case 7:
                return "7";
            case '\b':
                return "8";
            default:
                return str;
        }
    }

    public static String zzb(com.google.android.gms.ads.internal.client.zzl zzlVar) {
        Bundle bundle = zzlVar.zzc;
        if (bundle == null) {
            return "unspecified";
        }
        return bundle.getString("query_info_type");
    }

    public static void zzc(final zzdrm zzdrmVar, final zzdrc zzdrcVar, final String str, final Pair... pairArr) {
        if (!((Boolean) zzba.zzc().zzb(zzbbr.zzgS)).booleanValue()) {
            return;
        }
        zzcan.zza.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zze
            @Override // java.lang.Runnable
            public final void run() {
                zzf.zzd(zzdrm.this, zzdrcVar, str, pairArr);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zzd(zzdrm zzdrmVar, zzdrc zzdrcVar, String str, Pair... pairArr) {
        Map zza;
        if (zzdrcVar == null) {
            zza = zzdrmVar.zzc();
        } else {
            zza = zzdrcVar.zza();
        }
        zzf(zza, "action", str);
        for (Pair pair : pairArr) {
            zzf(zza, (String) pair.first, (String) pair.second);
        }
        zzdrmVar.zze(zza);
    }

    public static int zze(zzfca zzfcaVar) {
        if (zzfcaVar.zzq) {
            return 2;
        }
        com.google.android.gms.ads.internal.client.zzl zzlVar = zzfcaVar.zzd;
        com.google.android.gms.ads.internal.client.zzc zzcVar = zzlVar.zzs;
        if (zzcVar == null && zzlVar.zzx == null) {
            return 1;
        }
        if (zzcVar != null && zzlVar.zzx != null) {
            return 5;
        }
        if (zzcVar != null) {
            return 3;
        }
        return 4;
    }

    private static void zzf(Map map, String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            map.put(str, str2);
        }
    }
}
