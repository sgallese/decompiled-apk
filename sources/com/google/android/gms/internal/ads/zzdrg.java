package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzdrg {
    final /* synthetic */ zzdrh zza;
    private final Map zzb = new ConcurrentHashMap();

    public zzdrg(zzdrh zzdrhVar) {
        this.zza = zzdrhVar;
    }

    public static /* bridge */ /* synthetic */ zzdrg zza(zzdrg zzdrgVar) {
        Map map;
        Map map2 = zzdrgVar.zzb;
        map = zzdrgVar.zza.zzc;
        map2.putAll(map);
        return zzdrgVar;
    }

    public final zzdrg zzb(String str, String str2) {
        this.zzb.put(str, str2);
        return this;
    }

    public final zzdrg zzc(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            this.zzb.put(str, str2);
        }
        return this;
    }

    public final zzdrg zzd(zzfbe zzfbeVar) {
        this.zzb.put("aai", zzfbeVar.zzx);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzgS)).booleanValue()) {
            zzc("rid", zzfbeVar.zzao);
        }
        return this;
    }

    public final zzdrg zze(zzfbi zzfbiVar) {
        this.zzb.put("gqi", zzfbiVar.zzb);
        return this;
    }

    public final String zzf() {
        zzdrm zzdrmVar;
        zzdrmVar = this.zza.zza;
        return zzdrmVar.zzb(this.zzb);
    }

    public final void zzg() {
        Executor executor;
        executor = this.zza.zzb;
        executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdrf
            @Override // java.lang.Runnable
            public final void run() {
                zzdrg.this.zzi();
            }
        });
    }

    public final void zzh() {
        Executor executor;
        executor = this.zza.zzb;
        executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdre
            @Override // java.lang.Runnable
            public final void run() {
                zzdrg.this.zzj();
            }
        });
    }

    public final /* synthetic */ void zzi() {
        zzdrm zzdrmVar;
        zzdrmVar = this.zza.zza;
        zzdrmVar.zze(this.zzb);
    }

    public final /* synthetic */ void zzj() {
        zzdrm zzdrmVar;
        zzdrmVar = this.zza.zza;
        zzdrmVar.zzd(this.zzb);
    }
}
