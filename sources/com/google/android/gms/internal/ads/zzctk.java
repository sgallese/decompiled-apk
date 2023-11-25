package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzctk implements zzfya {
    final /* synthetic */ zzctl zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzctk(zzctl zzctlVar) {
        this.zza = zzctlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfya
    public final void zza(Throwable th) {
        zzdbn zzdbnVar;
        zzdbnVar = this.zza.zzf;
        zzdbnVar.zzl(false);
    }

    @Override // com.google.android.gms.internal.ads.zzfya
    public final /* bridge */ /* synthetic */ void zzb(@NullableDecl Object obj) {
        zzdbn zzdbnVar;
        Void r22 = (Void) obj;
        zzdbnVar = this.zza.zzf;
        zzdbnVar.zzl(true);
    }
}
