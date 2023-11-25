package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzlk extends zztg {
    private final zzcv zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzlk(zzll zzllVar, zzcw zzcwVar) {
        super(zzcwVar);
        this.zzd = new zzcv();
    }

    @Override // com.google.android.gms.internal.ads.zztg, com.google.android.gms.internal.ads.zzcw
    public final zzct zzd(int i10, zzct zzctVar, boolean z10) {
        zzct zzd = this.zzc.zzd(i10, zzctVar, z10);
        if (this.zzc.zze(zzd.zzd, this.zzd, 0L).zzb()) {
            zzd.zzl(zzctVar.zzb, zzctVar.zzc, zzctVar.zzd, zzctVar.zze, 0L, zzd.zza, true);
        } else {
            zzd.zzg = true;
        }
        return zzd;
    }
}
