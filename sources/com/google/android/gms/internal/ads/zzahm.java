package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzahm implements zzaht {
    private final zzahs zza;
    private final long zzb;
    private final long zzc;
    private final zzahy zzd;
    private int zze;
    private long zzf;
    private long zzg;
    private long zzh;
    private long zzi;
    private long zzj;
    private long zzk;
    private long zzl;

    public zzahm(zzahy zzahyVar, long j10, long j11, long j12, long j13, boolean z10) {
        boolean z11;
        if (j10 >= 0 && j11 > j10) {
            z11 = true;
        } else {
            z11 = false;
        }
        zzdy.zzd(z11);
        this.zzd = zzahyVar;
        this.zzb = j10;
        this.zzc = j11;
        if (j12 != j11 - j10 && !z10) {
            this.zze = 0;
        } else {
            this.zzf = j13;
            this.zze = 4;
        }
        this.zza = new zzahs();
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00ae A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00af  */
    @Override // com.google.android.gms.internal.ads.zzaht
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long zzd(com.google.android.gms.internal.ads.zzabc r22) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzahm.zzd(com.google.android.gms.internal.ads.zzabc):long");
    }

    @Override // com.google.android.gms.internal.ads.zzaht
    public final /* bridge */ /* synthetic */ zzaca zze() {
        zzahk zzahkVar = null;
        if (this.zzf == 0) {
            return null;
        }
        return new zzahl(this, zzahkVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaht
    public final void zzg(long j10) {
        this.zzh = Math.max(0L, Math.min(j10, this.zzf - 1));
        this.zze = 2;
        this.zzi = this.zzb;
        this.zzj = this.zzc;
        this.zzk = 0L;
        this.zzl = this.zzf;
    }
}
