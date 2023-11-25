package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzagk {
    public final int zza;
    public int zzb;
    public int zzc;
    public long zzd;
    private final boolean zze;
    private final zzfb zzf;
    private final zzfb zzg;
    private int zzh;
    private int zzi;

    public zzagk(zzfb zzfbVar, zzfb zzfbVar2, boolean z10) throws zzcd {
        this.zzg = zzfbVar;
        this.zzf = zzfbVar2;
        this.zze = z10;
        zzfbVar2.zzG(12);
        this.zza = zzfbVar2.zzo();
        zzfbVar.zzG(12);
        this.zzi = zzfbVar.zzo();
        zzabf.zzb(zzfbVar.zzf() == 1, "first_chunk must be 1");
        this.zzb = -1;
    }

    public final boolean zza() {
        long zzt;
        int i10 = this.zzb + 1;
        this.zzb = i10;
        if (i10 == this.zza) {
            return false;
        }
        if (this.zze) {
            zzt = this.zzf.zzu();
        } else {
            zzt = this.zzf.zzt();
        }
        this.zzd = zzt;
        if (this.zzb == this.zzh) {
            this.zzc = this.zzg.zzo();
            this.zzg.zzH(4);
            int i11 = -1;
            int i12 = this.zzi - 1;
            this.zzi = i12;
            if (i12 > 0) {
                i11 = (-1) + this.zzg.zzo();
            }
            this.zzh = i11;
        }
        return true;
    }
}
