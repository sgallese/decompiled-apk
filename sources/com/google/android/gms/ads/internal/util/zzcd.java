package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.google.android.gms.internal.ads.zzbbr;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes.dex */
public final class zzcd {
    private final Map zza = new HashMap();
    private final List zzb = new ArrayList();
    private final Context zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcd(Context context) {
        this.zzc = context;
    }

    final synchronized void zzb(String str) {
        SharedPreferences defaultSharedPreferences;
        if (!this.zza.containsKey(str)) {
            if (str != "__default__" && (str == null || !str.equals("__default__"))) {
                defaultSharedPreferences = this.zzc.getSharedPreferences(str, 0);
                zzcc zzccVar = new zzcc(this, str);
                this.zza.put(str, zzccVar);
                defaultSharedPreferences.registerOnSharedPreferenceChangeListener(zzccVar);
            }
            defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.zzc);
            zzcc zzccVar2 = new zzcc(this, str);
            this.zza.put(str, zzccVar2);
            defaultSharedPreferences.registerOnSharedPreferenceChangeListener(zzccVar2);
        }
    }

    public final void zzc() {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzjw)).booleanValue()) {
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzp();
        Map zzs = zzs.zzs((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzjz));
        Iterator it = zzs.keySet().iterator();
        while (it.hasNext()) {
            zzb((String) it.next());
        }
        zzd(new zzcb(zzs));
    }

    final synchronized void zzd(zzcb zzcbVar) {
        this.zzb.add(zzcbVar);
    }
}
