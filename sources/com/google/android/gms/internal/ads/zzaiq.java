package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzaiq implements zzaio {
    private static final double[] zza = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    private String zzb;
    private zzace zzc;
    private final zzakd zzd;
    private final zzfb zze;
    private final zzajd zzf;
    private final boolean[] zzg;
    private final zzaip zzh;
    private long zzi;
    private boolean zzj;
    private boolean zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private boolean zzp;
    private boolean zzq;

    public zzaiq() {
        this(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01e2  */
    @Override // com.google.android.gms.internal.ads.zzaio
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zza(com.google.android.gms.internal.ads.zzfb r21) {
        /*
            Method dump skipped, instructions count: 492
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaiq.zza(com.google.android.gms.internal.ads.zzfb):void");
    }

    @Override // com.google.android.gms.internal.ads.zzaio
    public final void zzb(zzabe zzabeVar, zzaka zzakaVar) {
        zzakaVar.zzc();
        this.zzb = zzakaVar.zzb();
        this.zzc = zzabeVar.zzv(zzakaVar.zza(), 2);
        zzakd zzakdVar = this.zzd;
        if (zzakdVar != null) {
            zzakdVar.zzb(zzabeVar, zzakaVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaio
    public final void zzc(boolean z10) {
        zzdy.zzb(this.zzc);
        if (z10) {
            boolean z11 = this.zzp;
            long j10 = this.zzi - this.zzn;
            this.zzc.zzs(this.zzo, z11 ? 1 : 0, (int) j10, 0, null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaio
    public final void zzd(long j10, int i10) {
        this.zzm = j10;
    }

    @Override // com.google.android.gms.internal.ads.zzaio
    public final void zze() {
        zzfy.zzf(this.zzg);
        this.zzh.zzb();
        zzajd zzajdVar = this.zzf;
        if (zzajdVar != null) {
            zzajdVar.zzb();
        }
        this.zzi = 0L;
        this.zzj = false;
        this.zzm = -9223372036854775807L;
        this.zzo = -9223372036854775807L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaiq(zzakd zzakdVar) {
        zzfb zzfbVar;
        this.zzd = zzakdVar;
        this.zzg = new boolean[4];
        this.zzh = new zzaip(128);
        if (zzakdVar != null) {
            this.zzf = new zzajd(178, 128);
            zzfbVar = new zzfb();
        } else {
            zzfbVar = null;
            this.zzf = null;
        }
        this.zze = zzfbVar;
        this.zzm = -9223372036854775807L;
        this.zzo = -9223372036854775807L;
    }
}
