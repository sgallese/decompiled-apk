package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzbyk {
    private final Map zza = new HashMap();
    private final List zzb = new ArrayList();
    private final Context zzc;
    private final zzbxh zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbyk(Context context, zzbxh zzbxhVar) {
        this.zzc = context;
        this.zzd = zzbxhVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzb(Map map, SharedPreferences sharedPreferences, String str, String str2) {
        if (!map.containsKey(str) || !((Set) map.get(str)).contains(str2)) {
            return;
        }
        this.zzd.zze();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void zzc(String str) {
        SharedPreferences defaultSharedPreferences;
        if (!this.zza.containsKey(str)) {
            if (str != "__default__" && (str == null || !str.equals("__default__"))) {
                defaultSharedPreferences = this.zzc.getSharedPreferences(str, 0);
                zzbyj zzbyjVar = new zzbyj(this, str);
                this.zza.put(str, zzbyjVar);
                defaultSharedPreferences.registerOnSharedPreferenceChangeListener(zzbyjVar);
            }
            defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.zzc);
            zzbyj zzbyjVar2 = new zzbyj(this, str);
            this.zza.put(str, zzbyjVar2);
            defaultSharedPreferences.registerOnSharedPreferenceChangeListener(zzbyjVar2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void zzd(zzbyi zzbyiVar) {
        this.zzb.add(zzbyiVar);
    }
}
