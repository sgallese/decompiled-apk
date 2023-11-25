package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzaiz implements zzaio {
    private final zzajp zza;
    private String zzb;
    private zzace zzc;
    private zzaiy zzd;
    private boolean zze;
    private long zzl;
    private final boolean[] zzf = new boolean[3];
    private final zzajd zzg = new zzajd(32, 128);
    private final zzajd zzh = new zzajd(33, 128);
    private final zzajd zzi = new zzajd(34, 128);
    private final zzajd zzj = new zzajd(39, 128);
    private final zzajd zzk = new zzajd(40, 128);
    private long zzm = -9223372036854775807L;
    private final zzfb zzn = new zzfb();

    public zzaiz(zzajp zzajpVar) {
        this.zza = zzajpVar;
    }

    private final void zzf(byte[] bArr, int i10, int i11) {
        this.zzd.zzc(bArr, i10, i11);
        if (!this.zze) {
            this.zzg.zza(bArr, i10, i11);
            this.zzh.zza(bArr, i10, i11);
            this.zzi.zza(bArr, i10, i11);
        }
        this.zzj.zza(bArr, i10, i11);
        this.zzk.zza(bArr, i10, i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0181  */
    @Override // com.google.android.gms.internal.ads.zzaio
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zza(com.google.android.gms.internal.ads.zzfb r32) {
        /*
            Method dump skipped, instructions count: 424
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaiz.zza(com.google.android.gms.internal.ads.zzfb):void");
    }

    @Override // com.google.android.gms.internal.ads.zzaio
    public final void zzb(zzabe zzabeVar, zzaka zzakaVar) {
        zzakaVar.zzc();
        this.zzb = zzakaVar.zzb();
        zzace zzv = zzabeVar.zzv(zzakaVar.zza(), 2);
        this.zzc = zzv;
        this.zzd = new zzaiy(zzv);
        this.zza.zzb(zzabeVar, zzakaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaio
    public final void zzc(boolean z10) {
        zzdy.zzb(this.zzc);
        int i10 = zzfk.zza;
        if (z10) {
            this.zzd.zza(this.zzl);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaio
    public final void zzd(long j10, int i10) {
        if (j10 != -9223372036854775807L) {
            this.zzm = j10;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaio
    public final void zze() {
        this.zzl = 0L;
        this.zzm = -9223372036854775807L;
        zzfy.zzf(this.zzf);
        this.zzg.zzb();
        this.zzh.zzb();
        this.zzi.zzb();
        this.zzj.zzb();
        this.zzk.zzb();
        zzaiy zzaiyVar = this.zzd;
        if (zzaiyVar != null) {
            zzaiyVar.zzd();
        }
    }
}
