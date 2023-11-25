package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzcdo implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ int zzc;
    final /* synthetic */ int zzd;
    final /* synthetic */ zzcdu zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcdo(zzcdu zzcduVar, String str, String str2, int i10, int i11, boolean z10) {
        this.zze = zzcduVar;
        this.zza = str;
        this.zzb = str2;
        this.zzc = i10;
        this.zzd = i11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheProgress");
        hashMap.put("src", this.zza);
        hashMap.put("cachedSrc", this.zzb);
        hashMap.put("bytesLoaded", Integer.toString(this.zzc));
        hashMap.put("totalBytes", Integer.toString(this.zzd));
        hashMap.put("cacheReady", "0");
        zzcdu.zze(this.zze, "onPrecacheEvent", hashMap);
    }
}
