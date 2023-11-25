package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzbut implements Callable {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzbuv zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbut(zzbuv zzbuvVar, Context context) {
        this.zzb = zzbuvVar;
        this.zza = context;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        WeakHashMap weakHashMap;
        zzbus zza;
        WeakHashMap weakHashMap2;
        weakHashMap = this.zzb.zza;
        zzbuu zzbuuVar = (zzbuu) weakHashMap.get(this.zza);
        if (zzbuuVar != null && zzbuuVar.zza + ((Long) zzbda.zza.zze()).longValue() >= com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis()) {
            zza = new zzbur(this.zza, zzbuuVar.zzb).zza();
        } else {
            zza = new zzbur(this.zza).zza();
        }
        zzbuv zzbuvVar = this.zzb;
        weakHashMap2 = zzbuvVar.zza;
        weakHashMap2.put(this.zza, new zzbuu(zzbuvVar, zza));
        return zza;
    }
}
