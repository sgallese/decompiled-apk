package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzeyn implements zzfqw {
    final /* synthetic */ zzeyr zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzeyn(zzeyr zzeyrVar) {
        this.zza = zzeyrVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.google.android.gms.internal.ads.zzeyp, com.google.android.gms.internal.ads.zzbun] */
    @Override // com.google.android.gms.internal.ads.zzfqw
    @NullableDecl
    public final /* bridge */ /* synthetic */ Object apply(@NullableDecl Object obj) {
        zzfdx zze;
        zzeyq zzeyqVar;
        zzcaa.zzh("", (zzdxh) obj);
        com.google.android.gms.ads.internal.util.zze.zza("Failed to get a cache key, reverting to legacy flow.");
        zzeyr zzeyrVar = this.zza;
        ?? r12 = 0;
        zze = zzeyrVar.zze();
        zzeyrVar.zzd = new zzeyq(r12, zze, r12);
        zzeyqVar = this.zza.zzd;
        return zzeyqVar;
    }
}
