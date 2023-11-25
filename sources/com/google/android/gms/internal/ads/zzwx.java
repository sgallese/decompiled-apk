package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzwx extends zzwz implements Comparable {
    private final int zze;
    private final boolean zzf;
    private final boolean zzg;
    private final boolean zzh;
    private final int zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final boolean zzm;

    public zzwx(int i10, zzcy zzcyVar, int i11, zzwr zzwrVar, int i12, String str) {
        super(i10, zzcyVar, i11);
        boolean z10;
        boolean z11;
        zzfud zzfudVar;
        int i13;
        boolean z12;
        boolean z13;
        int i14 = 0;
        this.zzf = zzxd.zzn(i12, false);
        int i15 = this.zzd.zze;
        int i16 = zzwrVar.zzy;
        if (1 != (i15 & 1)) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.zzg = z10;
        if ((i15 & 2) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.zzh = z11;
        if (zzwrVar.zzw.isEmpty()) {
            zzfudVar = zzfud.zzm("");
        } else {
            zzfudVar = zzwrVar.zzw;
        }
        int i17 = 0;
        while (true) {
            if (i17 < zzfudVar.size()) {
                i13 = zzxd.zza(this.zzd, (String) zzfudVar.get(i17), false);
                if (i13 > 0) {
                    break;
                }
                i17++;
            } else {
                i17 = Integer.MAX_VALUE;
                i13 = 0;
                break;
            }
        }
        this.zzi = i17;
        this.zzj = i13;
        int i18 = this.zzd.zzf;
        int bitCount = Integer.bitCount(0);
        this.zzk = bitCount;
        int i19 = this.zzd.zzf;
        this.zzm = false;
        if (zzxd.zzg(str) == null) {
            z12 = true;
        } else {
            z12 = false;
        }
        int zza = zzxd.zza(this.zzd, str, z12);
        this.zzl = zza;
        if (i13 <= 0 && ((!zzwrVar.zzw.isEmpty() || bitCount <= 0) && !this.zzg && (!this.zzh || zza <= 0))) {
            z13 = false;
        } else {
            z13 = true;
        }
        if (zzxd.zzn(i12, zzwrVar.zzR) && z13) {
            i14 = 1;
        }
        this.zze = i14;
    }

    @Override // java.lang.Comparable
    /* renamed from: zza  reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzwx zzwxVar) {
        zzfvm zza;
        zzfts zzd = zzfts.zzj().zzd(this.zzf, zzwxVar.zzf).zzc(Integer.valueOf(this.zzi), Integer.valueOf(zzwxVar.zzi), zzfvm.zzc().zza()).zzb(this.zzj, zzwxVar.zzj).zzb(this.zzk, zzwxVar.zzk).zzd(this.zzg, zzwxVar.zzg);
        Boolean valueOf = Boolean.valueOf(this.zzh);
        Boolean valueOf2 = Boolean.valueOf(zzwxVar.zzh);
        if (this.zzj == 0) {
            zza = zzfvm.zzc();
        } else {
            zza = zzfvm.zzc().zza();
        }
        zzfts zzb = zzd.zzc(valueOf, valueOf2, zza).zzb(this.zzl, zzwxVar.zzl);
        if (this.zzk == 0) {
            zzb = zzb.zze(false, false);
        }
        return zzb.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzwz
    public final int zzb() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzwz
    public final /* bridge */ /* synthetic */ boolean zzc(zzwz zzwzVar) {
        zzwx zzwxVar = (zzwx) zzwzVar;
        return false;
    }
}
