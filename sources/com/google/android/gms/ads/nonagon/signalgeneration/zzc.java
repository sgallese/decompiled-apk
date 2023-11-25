package com.google.android.gms.ads.nonagon.signalgeneration;

import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbbr;
import com.google.android.gms.internal.ads.zzcan;
import com.google.android.gms.internal.ads.zzdrc;
import com.google.android.gms.internal.ads.zzdrm;
import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayDeque;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes.dex */
public final class zzc {
    private final zzdrm zzh;
    private Map zzi;
    private final ArrayDeque zzf = new ArrayDeque();
    private final ArrayDeque zzg = new ArrayDeque();
    private final int zza = ((Integer) zzba.zzc().zzb(zzbbr.zzgQ)).intValue();
    private final long zzb = ((Long) zzba.zzc().zzb(zzbbr.zzgR)).longValue();
    private final boolean zzc = ((Boolean) zzba.zzc().zzb(zzbbr.zzgW)).booleanValue();
    private final boolean zzd = ((Boolean) zzba.zzc().zzb(zzbbr.zzgU)).booleanValue();
    private final Map zze = DesugarCollections.synchronizedMap(new zzb(this));

    public zzc(zzdrm zzdrmVar) {
        this.zzh = zzdrmVar;
    }

    private final synchronized void zzg(final zzdrc zzdrcVar) {
        if (!this.zzc) {
            return;
        }
        final ArrayDeque clone = this.zzg.clone();
        this.zzg.clear();
        final ArrayDeque clone2 = this.zzf.clone();
        this.zzf.clear();
        zzcan.zza.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zza
            @Override // java.lang.Runnable
            public final void run() {
                zzc.this.zze(zzdrcVar, clone, clone2);
            }
        });
    }

    private final void zzh(zzdrc zzdrcVar, ArrayDeque arrayDeque, String str) {
        Pair pair;
        while (!arrayDeque.isEmpty()) {
            Pair pair2 = (Pair) arrayDeque.poll();
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(zzdrcVar.zza());
            this.zzi = concurrentHashMap;
            concurrentHashMap.put("action", "ev");
            this.zzi.put("e_r", str);
            this.zzi.put("e_id", (String) pair2.first);
            if (this.zzd) {
                try {
                    JSONObject jSONObject = new JSONObject((String) pair2.second);
                    pair = new Pair(zzf.zza(jSONObject.getJSONObject("extras").getString("query_info_type")), jSONObject.getString("request_agent"));
                } catch (JSONException unused) {
                    pair = new Pair("", "");
                }
                zzj(this.zzi, "e_type", (String) pair.first);
                zzj(this.zzi, "e_agent", (String) pair.second);
            }
            this.zzh.zze(this.zzi);
        }
    }

    private final synchronized void zzi() {
        long currentTimeMillis = com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis();
        try {
            Iterator it = this.zze.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (currentTimeMillis - ((Long) ((Pair) entry.getValue()).first).longValue() <= this.zzb) {
                    break;
                }
                this.zzg.add(new Pair((String) entry.getKey(), (String) ((Pair) entry.getValue()).second));
                it.remove();
            }
        } catch (ConcurrentModificationException e10) {
            com.google.android.gms.ads.internal.zzt.zzo().zzu(e10, "QueryJsonMap.removeExpiredEntries");
        }
    }

    private static final void zzj(Map map, String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            map.put(str, str2);
        }
    }

    public final synchronized String zzb(String str, zzdrc zzdrcVar) {
        Pair pair = (Pair) this.zze.get(str);
        zzdrcVar.zza().put("rid", str);
        if (pair != null) {
            String str2 = (String) pair.second;
            this.zze.remove(str);
            zzdrcVar.zza().put("mhit", "true");
            return str2;
        }
        zzdrcVar.zza().put("mhit", "false");
        return null;
    }

    public final synchronized void zzd(String str, String str2, zzdrc zzdrcVar) {
        this.zze.put(str, new Pair(Long.valueOf(com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis()), str2));
        zzi();
        zzg(zzdrcVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zze(zzdrc zzdrcVar, ArrayDeque arrayDeque, ArrayDeque arrayDeque2) {
        zzh(zzdrcVar, arrayDeque, "to");
        zzh(zzdrcVar, arrayDeque2, "of");
    }

    public final synchronized void zzf(String str) {
        this.zze.remove(str);
    }
}
