package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzcom implements zzfya {
    final /* synthetic */ String zza;
    final /* synthetic */ zzcon zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcom(zzcon zzconVar, String str) {
        this.zzb = zzconVar;
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzfya
    public final void zza(Throwable th) {
        zzfck zzfckVar;
        zzfig zzfigVar;
        zzfbr zzfbrVar;
        zzfbe zzfbeVar;
        zzfbe zzfbeVar2;
        zzcon zzconVar = this.zzb;
        zzfckVar = zzconVar.zzh;
        zzfigVar = zzconVar.zzg;
        zzfbrVar = zzconVar.zze;
        zzfbeVar = zzconVar.zzf;
        String str = this.zza;
        zzfbeVar2 = zzconVar.zzf;
        zzfckVar.zza(zzfigVar.zzd(zzfbrVar, zzfbeVar, false, str, null, zzfbeVar2.zzd));
    }

    @Override // com.google.android.gms.internal.ads.zzfya
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfck zzfckVar;
        zzfig zzfigVar;
        zzfbr zzfbrVar;
        zzfbe zzfbeVar;
        zzfbe zzfbeVar2;
        String str = (String) obj;
        zzcon zzconVar = this.zzb;
        zzfckVar = zzconVar.zzh;
        zzfigVar = zzconVar.zzg;
        zzfbrVar = zzconVar.zze;
        zzfbeVar = zzconVar.zzf;
        String str2 = this.zza;
        zzfbeVar2 = zzconVar.zzf;
        zzfckVar.zza(zzfigVar.zzd(zzfbrVar, zzfbeVar, false, str2, str, zzfbeVar2.zzd));
    }
}
