package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzcds implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ zzcdu zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcds(zzcdu zzcduVar, String str, String str2, long j10) {
        this.zzd = zzcduVar;
        this.zza = str;
        this.zzb = str2;
        this.zzc = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheComplete");
        hashMap.put("src", this.zza);
        hashMap.put("cachedSrc", this.zzb);
        hashMap.put("totalDuration", Long.toString(this.zzc));
        zzcdu.zze(this.zzd, "onPrecacheEvent", hashMap);
    }
}
