package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzcdv implements zzbir {
    private static final Integer zzb(Map map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt((String) map.get(str)));
        } catch (NumberFormatException unused) {
            zzcaa.zzj("Precache invalid numeric parameter '" + str + "': " + ((String) map.get(str)));
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbir
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcdu zzcduVar;
        zzccj zzccjVar = (zzccj) obj;
        if (zzcaa.zzm(3)) {
            JSONObject jSONObject = new JSONObject(map);
            jSONObject.remove("google.afma.Notify_dt");
            zzcaa.zze("Precache GMSG: ".concat(jSONObject.toString()));
        }
        zzcdn zzy = com.google.android.gms.ads.internal.zzt.zzy();
        if (map.containsKey("abort")) {
            if (!zzy.zzd(zzccjVar)) {
                zzcaa.zzj("Precache abort but no precache task running.");
                return;
            }
            return;
        }
        String str = (String) map.get("src");
        Integer zzb = zzb(map, "periodicReportIntervalMs");
        Integer zzb2 = zzb(map, "exoPlayerRenderingIntervalMs");
        Integer zzb3 = zzb(map, "exoPlayerIdleIntervalMs");
        zzcci zzcciVar = new zzcci((String) map.get("flags"));
        boolean z10 = zzcciVar.zzl;
        if (str != null) {
            String[] strArr = {str};
            String str2 = (String) map.get("demuxed");
            zzcdm zzcdmVar = null;
            if (str2 != null) {
                try {
                    JSONArray jSONArray = new JSONArray(str2);
                    String[] strArr2 = new String[jSONArray.length()];
                    for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                        strArr2[i10] = jSONArray.getString(i10);
                    }
                    strArr = strArr2;
                } catch (JSONException unused) {
                    zzcaa.zzj("Malformed demuxed URL list for precache: ".concat(str2));
                    strArr = null;
                }
            }
            if (strArr == null) {
                strArr = new String[]{str};
            }
            if (z10) {
                Iterator it = zzy.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    zzcdm zzcdmVar2 = (zzcdm) it.next();
                    if (zzcdmVar2.zza == zzccjVar && str.equals(zzcdmVar2.zze())) {
                        zzcdmVar = zzcdmVar2;
                        break;
                    }
                }
            } else {
                zzcdmVar = zzy.zza(zzccjVar);
            }
            if (zzcdmVar != null) {
                zzcaa.zzj("Precache task is already running.");
                return;
            } else if (zzccjVar.zzj() == null) {
                zzcaa.zzj("Precache requires a dependency provider.");
                return;
            } else {
                Integer zzb4 = zzb(map, "player");
                if (zzb4 == null) {
                    zzb4 = 0;
                }
                if (zzb != null) {
                    zzccjVar.zzA(zzb.intValue());
                }
                if (zzb2 != null) {
                    zzccjVar.zzy(zzb2.intValue());
                }
                if (zzb3 != null) {
                    zzccjVar.zzx(zzb3.intValue());
                }
                int intValue = zzb4.intValue();
                zzcdg zzcdgVar = zzccjVar.zzj().zzb;
                if (intValue > 0) {
                    int zzu = zzcca.zzu();
                    if (zzu < zzcciVar.zzh) {
                        zzcduVar = new zzced(zzccjVar, zzcciVar);
                    } else if (zzu < zzcciVar.zzb) {
                        zzcduVar = new zzcea(zzccjVar, zzcciVar);
                    } else {
                        zzcduVar = new zzcdy(zzccjVar);
                    }
                } else {
                    zzcduVar = new zzcdx(zzccjVar);
                }
                new zzcdm(zzccjVar, zzcduVar, str, strArr).zzb();
            }
        } else {
            zzcdm zza = zzy.zza(zzccjVar);
            if (zza != null) {
                zzcduVar = zza.zzb;
            } else {
                zzcaa.zzj("Precache must specify a source.");
                return;
            }
        }
        Integer zzb5 = zzb(map, "minBufferMs");
        if (zzb5 != null) {
            zzcduVar.zzs(zzb5.intValue());
        }
        Integer zzb6 = zzb(map, "maxBufferMs");
        if (zzb6 != null) {
            zzcduVar.zzr(zzb6.intValue());
        }
        Integer zzb7 = zzb(map, "bufferForPlaybackMs");
        if (zzb7 != null) {
            zzcduVar.zzp(zzb7.intValue());
        }
        Integer zzb8 = zzb(map, "bufferForPlaybackAfterRebufferMs");
        if (zzb8 != null) {
            zzcduVar.zzq(zzb8.intValue());
        }
    }
}
