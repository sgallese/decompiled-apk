package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzxc extends zzwz {
    private final boolean zze;
    private final zzwr zzf;
    private final boolean zzg;
    private final boolean zzh;
    private final int zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final boolean zzm;
    private final int zzn;
    private final boolean zzo;
    private final boolean zzp;
    private final int zzq;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:139:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0091 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public zzxc(int r5, com.google.android.gms.internal.ads.zzcy r6, int r7, com.google.android.gms.internal.ads.zzwr r8, int r9, int r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzxc.<init>(int, com.google.android.gms.internal.ads.zzcy, int, com.google.android.gms.internal.ads.zzwr, int, int, boolean):void");
    }

    public static /* synthetic */ int zza(zzxc zzxcVar, zzxc zzxcVar2) {
        zzfvm zzfvmVar;
        zzfvm zza;
        zzfvm zzfvmVar2;
        if (!zzxcVar.zze || !zzxcVar.zzh) {
            zzfvmVar = zzxd.zzc;
            zza = zzfvmVar.zza();
        } else {
            zza = zzxd.zzc;
        }
        zzfts zzj = zzfts.zzj();
        Integer valueOf = Integer.valueOf(zzxcVar.zzi);
        Integer valueOf2 = Integer.valueOf(zzxcVar2.zzi);
        boolean z10 = zzxcVar.zzf.zzA;
        zzfvmVar2 = zzxd.zzd;
        return zzj.zzc(valueOf, valueOf2, zzfvmVar2).zzc(Integer.valueOf(zzxcVar.zzj), Integer.valueOf(zzxcVar2.zzj), zza).zzc(Integer.valueOf(zzxcVar.zzi), Integer.valueOf(zzxcVar2.zzi), zza).zza();
    }

    public static /* synthetic */ int zzd(zzxc zzxcVar, zzxc zzxcVar2) {
        zzfts zzc = zzfts.zzj().zzd(zzxcVar.zzh, zzxcVar2.zzh).zzb(zzxcVar.zzl, zzxcVar2.zzl).zzd(true, true).zzd(zzxcVar.zze, zzxcVar2.zze).zzd(zzxcVar.zzg, zzxcVar2.zzg).zzc(Integer.valueOf(zzxcVar.zzk), Integer.valueOf(zzxcVar2.zzk), zzfvm.zzc().zza());
        boolean z10 = zzxcVar.zzo;
        zzfts zzd = zzc.zzd(z10, zzxcVar2.zzo);
        boolean z11 = zzxcVar.zzp;
        zzfts zzd2 = zzd.zzd(z11, zzxcVar2.zzp);
        if (z10 && z11) {
            zzd2 = zzd2.zzb(zzxcVar.zzq, zzxcVar2.zzq);
        }
        return zzd2.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzwz
    public final int zzb() {
        return this.zzn;
    }

    @Override // com.google.android.gms.internal.ads.zzwz
    public final /* bridge */ /* synthetic */ boolean zzc(zzwz zzwzVar) {
        zzxc zzxcVar = (zzxc) zzwzVar;
        if (zzfk.zzD(this.zzd.zzm, zzxcVar.zzd.zzm)) {
            boolean z10 = this.zzf.zzK;
            if (this.zzo == zzxcVar.zzo && this.zzp == zzxcVar.zzp) {
                return true;
            }
            return false;
        }
        return false;
    }
}
