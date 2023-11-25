package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzaje implements zzajn {
    private zzam zza;
    private zzfi zzb;
    private zzace zzc;

    public zzaje(String str) {
        zzak zzakVar = new zzak();
        zzakVar.zzS(str);
        this.zza = zzakVar.zzY();
    }

    @Override // com.google.android.gms.internal.ads.zzajn
    public final void zza(zzfb zzfbVar) {
        zzdy.zzb(this.zzb);
        int i10 = zzfk.zza;
        long zzd = this.zzb.zzd();
        long zze = this.zzb.zze();
        if (zzd != -9223372036854775807L && zze != -9223372036854775807L) {
            zzam zzamVar = this.zza;
            if (zze != zzamVar.zzq) {
                zzak zzb = zzamVar.zzb();
                zzb.zzW(zze);
                zzam zzY = zzb.zzY();
                this.zza = zzY;
                this.zzc.zzk(zzY);
            }
            int zza = zzfbVar.zza();
            this.zzc.zzq(zzfbVar, zza);
            this.zzc.zzs(zzd, 1, zza, 0, null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzajn
    public final void zzb(zzfi zzfiVar, zzabe zzabeVar, zzaka zzakaVar) {
        this.zzb = zzfiVar;
        zzakaVar.zzc();
        zzace zzv = zzabeVar.zzv(zzakaVar.zza(), 5);
        this.zzc = zzv;
        zzv.zzk(this.zza);
    }
}
