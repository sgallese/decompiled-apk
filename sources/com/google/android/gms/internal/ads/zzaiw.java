package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzaiw {
    private final zzace zza;
    private final zzfz zzd;
    private final byte[] zze;
    private int zzf;
    private long zzg;
    private long zzh;
    private final zzaiv zzi;
    private final zzaiv zzj;
    private long zzl;
    private long zzm;
    private boolean zzn;
    private final SparseArray zzb = new SparseArray();
    private final SparseArray zzc = new SparseArray();
    private boolean zzk = false;

    public zzaiw(zzace zzaceVar, boolean z10, boolean z11) {
        this.zza = zzaceVar;
        zzaiu zzaiuVar = null;
        this.zzi = new zzaiv(zzaiuVar);
        this.zzj = new zzaiv(zzaiuVar);
        byte[] bArr = new byte[128];
        this.zze = bArr;
        this.zzd = new zzfz(bArr, 0, 0);
    }

    private final void zzg(int i10) {
        long j10 = this.zzm;
        if (j10 == -9223372036854775807L) {
            return;
        }
        boolean z10 = this.zzn;
        long j11 = this.zzg - this.zzl;
        this.zza.zzs(j10, z10 ? 1 : 0, (int) j11, i10, null);
    }

    public final void zza(long j10) {
        this.zzg = j10;
        zzg(0);
        this.zzk = false;
    }

    public final void zzb(zzfw zzfwVar) {
        this.zzc.append(zzfwVar.zza, zzfwVar);
    }

    public final void zzc(zzfx zzfxVar) {
        this.zzb.append(zzfxVar.zzd, zzfxVar);
    }

    public final void zzd() {
        this.zzk = false;
    }

    public final void zze(long j10, int i10, long j11) {
        this.zzf = i10;
        this.zzh = j11;
        this.zzg = j10;
    }

    public final boolean zzf(long j10, int i10, boolean z10, boolean z11) {
        boolean z12 = false;
        if (this.zzf == 9) {
            if (z10 && this.zzk) {
                zzg(i10 + ((int) (j10 - this.zzg)));
            }
            this.zzl = this.zzg;
            this.zzm = this.zzh;
            this.zzn = false;
            this.zzk = true;
        }
        boolean z13 = this.zzn;
        int i11 = this.zzf;
        if (i11 == 5 || (z11 && i11 == 1)) {
            z12 = true;
        }
        boolean z14 = z13 | z12;
        this.zzn = z14;
        return z14;
    }
}
