package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzaix implements zzaio {
    private final zzajp zza;
    private long zze;
    private String zzg;
    private zzace zzh;
    private zzaiw zzi;
    private boolean zzj;
    private boolean zzl;
    private final boolean[] zzf = new boolean[3];
    private final zzajd zzb = new zzajd(7, 128);
    private final zzajd zzc = new zzajd(8, 128);
    private final zzajd zzd = new zzajd(6, 128);
    private long zzk = -9223372036854775807L;
    private final zzfb zzm = new zzfb();

    public zzaix(zzajp zzajpVar, boolean z10, boolean z11) {
        this.zza = zzajpVar;
    }

    private final void zzf(byte[] bArr, int i10, int i11) {
        if (!this.zzj) {
            this.zzb.zza(bArr, i10, i11);
            this.zzc.zza(bArr, i10, i11);
        }
        this.zzd.zza(bArr, i10, i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0181 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzaio
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zza(com.google.android.gms.internal.ads.zzfb r20) {
        /*
            Method dump skipped, instructions count: 405
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaix.zza(com.google.android.gms.internal.ads.zzfb):void");
    }

    @Override // com.google.android.gms.internal.ads.zzaio
    public final void zzb(zzabe zzabeVar, zzaka zzakaVar) {
        zzakaVar.zzc();
        this.zzg = zzakaVar.zzb();
        zzace zzv = zzabeVar.zzv(zzakaVar.zza(), 2);
        this.zzh = zzv;
        this.zzi = new zzaiw(zzv, false, false);
        this.zza.zzb(zzabeVar, zzakaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaio
    public final void zzc(boolean z10) {
        zzdy.zzb(this.zzh);
        int i10 = zzfk.zza;
        if (z10) {
            this.zzi.zza(this.zze);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaio
    public final void zzd(long j10, int i10) {
        boolean z10;
        if (j10 != -9223372036854775807L) {
            this.zzk = j10;
        }
        boolean z11 = this.zzl;
        if ((i10 & 2) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.zzl = z11 | z10;
    }

    @Override // com.google.android.gms.internal.ads.zzaio
    public final void zze() {
        this.zze = 0L;
        this.zzl = false;
        this.zzk = -9223372036854775807L;
        zzfy.zzf(this.zzf);
        this.zzb.zzb();
        this.zzc.zzb();
        this.zzd.zzb();
        zzaiw zzaiwVar = this.zzi;
        if (zzaiwVar != null) {
            zzaiwVar.zzd();
        }
    }
}
