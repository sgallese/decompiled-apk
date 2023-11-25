package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzeyo implements zzfqw {
    final /* synthetic */ zzeyr zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzeyo(zzeyr zzeyrVar) {
        this.zza = zzeyrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfqw
    @NullableDecl
    public final /* bridge */ /* synthetic */ Object apply(@NullableDecl Object obj) {
        zzeyq zzeyqVar;
        zzbun zzbunVar = (zzbun) obj;
        this.zza.zzd = new zzeyq(zzbunVar, new zzfdz(zzbunVar.zzj), null);
        zzeyqVar = this.zza.zzd;
        return zzeyqVar;
    }
}
