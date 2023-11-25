package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzsx implements zztq, zztp {
    public final zztq zza;
    long zzb;
    private zztp zzc;
    private zzsw[] zzd = new zzsw[0];
    private long zze = 0;

    public zzsx(zztq zztqVar, boolean z10, long j10, long j11) {
        this.zza = zztqVar;
        this.zzb = j11;
    }

    @Override // com.google.android.gms.internal.ads.zztq
    public final long zza(long j10, zzlr zzlrVar) {
        long j11;
        if (j10 == 0) {
            return 0L;
        }
        long max = Math.max(0L, Math.min(zzlrVar.zzf, j10));
        long j12 = zzlrVar.zzg;
        long j13 = this.zzb;
        if (j13 == Long.MIN_VALUE) {
            j11 = Long.MAX_VALUE;
        } else {
            j11 = j13 - j10;
        }
        long max2 = Math.max(0L, Math.min(j12, j11));
        if (max != zzlrVar.zzf || max2 != zzlrVar.zzg) {
            zzlrVar = new zzlr(max, max2);
        }
        return this.zza.zza(j10, zzlrVar);
    }

    @Override // com.google.android.gms.internal.ads.zztq, com.google.android.gms.internal.ads.zzvl
    public final long zzb() {
        long zzb = this.zza.zzb();
        if (zzb != Long.MIN_VALUE) {
            long j10 = this.zzb;
            if (j10 == Long.MIN_VALUE || zzb < j10) {
                return zzb;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zztq, com.google.android.gms.internal.ads.zzvl
    public final long zzc() {
        long zzc = this.zza.zzc();
        if (zzc != Long.MIN_VALUE) {
            long j10 = this.zzb;
            if (j10 == Long.MIN_VALUE || zzc < j10) {
                return zzc;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zztq
    public final long zzd() {
        boolean z10;
        if (zzq()) {
            long j10 = this.zze;
            this.zze = -9223372036854775807L;
            long zzd = zzd();
            if (zzd != -9223372036854775807L) {
                return zzd;
            }
            return j10;
        }
        long zzd2 = this.zza.zzd();
        if (zzd2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        boolean z11 = false;
        if (zzd2 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        zzdy.zzf(z10);
        long j11 = this.zzb;
        if (j11 == Long.MIN_VALUE || zzd2 <= j11) {
            z11 = true;
        }
        zzdy.zzf(z11);
        return zzd2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0033, code lost:
    
        if (r0 > r8) goto L17;
     */
    @Override // com.google.android.gms.internal.ads.zztq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long zze(long r8) {
        /*
            r7 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7.zze = r0
            com.google.android.gms.internal.ads.zzsw[] r0 = r7.zzd
            int r1 = r0.length
            r2 = 0
            r3 = 0
        Lc:
            if (r3 >= r1) goto L18
            r4 = r0[r3]
            if (r4 == 0) goto L15
            r4.zzc()
        L15:
            int r3 = r3 + 1
            goto Lc
        L18:
            com.google.android.gms.internal.ads.zztq r0 = r7.zza
            long r0 = r0.zze(r8)
            r3 = 1
            int r4 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r4 == 0) goto L35
            r8 = 0
            int r4 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r4 < 0) goto L36
            long r8 = r7.zzb
            r4 = -9223372036854775808
            int r6 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r6 == 0) goto L35
            int r4 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r4 > 0) goto L36
        L35:
            r2 = 1
        L36:
            com.google.android.gms.internal.ads.zzdy.zzf(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzsx.zze(long):long");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0059, code lost:
    
        if (r4 > r7) goto L24;
     */
    @Override // com.google.android.gms.internal.ads.zztq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long zzf(com.google.android.gms.internal.ads.zzxf[] r15, boolean[] r16, com.google.android.gms.internal.ads.zzvj[] r17, boolean[] r18, long r19) {
        /*
            r14 = this;
            r0 = r14
            r1 = r17
            int r2 = r1.length
            com.google.android.gms.internal.ads.zzsw[] r3 = new com.google.android.gms.internal.ads.zzsw[r2]
            r0.zzd = r3
            com.google.android.gms.internal.ads.zzvj[] r2 = new com.google.android.gms.internal.ads.zzvj[r2]
            r3 = 0
            r4 = 0
        Lc:
            int r5 = r1.length
            r11 = 0
            if (r4 >= r5) goto L21
            com.google.android.gms.internal.ads.zzsw[] r5 = r0.zzd
            r6 = r1[r4]
            com.google.android.gms.internal.ads.zzsw r6 = (com.google.android.gms.internal.ads.zzsw) r6
            r5[r4] = r6
            if (r6 == 0) goto L1c
            com.google.android.gms.internal.ads.zzvj r11 = r6.zza
        L1c:
            r2[r4] = r11
            int r4 = r4 + 1
            goto Lc
        L21:
            com.google.android.gms.internal.ads.zztq r4 = r0.zza
            r5 = r15
            r6 = r16
            r7 = r2
            r8 = r18
            r9 = r19
            long r4 = r4.zzf(r5, r6, r7, r8, r9)
            boolean r6 = r14.zzq()
            r7 = 0
            if (r6 == 0) goto L3d
            int r6 = (r19 > r7 ? 1 : (r19 == r7 ? 0 : -1))
            if (r6 != 0) goto L3d
            r9 = r7
            goto L3f
        L3d:
            r9 = r19
        L3f:
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0.zze = r12
            r6 = 1
            int r12 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r12 == 0) goto L5d
            int r9 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r9 < 0) goto L5c
            long r7 = r0.zzb
            r9 = -9223372036854775808
            int r12 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r12 == 0) goto L5d
            int r9 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r9 > 0) goto L5c
            goto L5d
        L5c:
            r6 = 0
        L5d:
            com.google.android.gms.internal.ads.zzdy.zzf(r6)
        L60:
            int r6 = r1.length
            if (r3 >= r6) goto L86
            r6 = r2[r3]
            if (r6 != 0) goto L6c
            com.google.android.gms.internal.ads.zzsw[] r6 = r0.zzd
            r6[r3] = r11
            goto L7d
        L6c:
            com.google.android.gms.internal.ads.zzsw[] r7 = r0.zzd
            r8 = r7[r3]
            if (r8 == 0) goto L76
            com.google.android.gms.internal.ads.zzvj r8 = r8.zza
            if (r8 == r6) goto L7d
        L76:
            com.google.android.gms.internal.ads.zzsw r8 = new com.google.android.gms.internal.ads.zzsw
            r8.<init>(r14, r6)
            r7[r3] = r8
        L7d:
            com.google.android.gms.internal.ads.zzsw[] r6 = r0.zzd
            r6 = r6[r3]
            r1[r3] = r6
            int r3 = r3 + 1
            goto L60
        L86:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzsx.zzf(com.google.android.gms.internal.ads.zzxf[], boolean[], com.google.android.gms.internal.ads.zzvj[], boolean[], long):long");
    }

    @Override // com.google.android.gms.internal.ads.zzvk
    public final /* bridge */ /* synthetic */ void zzg(zzvl zzvlVar) {
        zztq zztqVar = (zztq) zzvlVar;
        zztp zztpVar = this.zzc;
        zztpVar.getClass();
        zztpVar.zzg(this);
    }

    @Override // com.google.android.gms.internal.ads.zztq
    public final zzvs zzh() {
        return this.zza.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zztp
    public final void zzi(zztq zztqVar) {
        zztp zztpVar = this.zzc;
        zztpVar.getClass();
        zztpVar.zzi(this);
    }

    @Override // com.google.android.gms.internal.ads.zztq
    public final void zzj(long j10, boolean z10) {
        this.zza.zzj(j10, false);
    }

    @Override // com.google.android.gms.internal.ads.zztq
    public final void zzk() throws IOException {
        this.zza.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zztq
    public final void zzl(zztp zztpVar, long j10) {
        this.zzc = zztpVar;
        this.zza.zzl(this, j10);
    }

    @Override // com.google.android.gms.internal.ads.zztq, com.google.android.gms.internal.ads.zzvl
    public final void zzm(long j10) {
        this.zza.zzm(j10);
    }

    public final void zzn(long j10, long j11) {
        this.zzb = j11;
    }

    @Override // com.google.android.gms.internal.ads.zztq, com.google.android.gms.internal.ads.zzvl
    public final boolean zzo(long j10) {
        return this.zza.zzo(j10);
    }

    @Override // com.google.android.gms.internal.ads.zztq, com.google.android.gms.internal.ads.zzvl
    public final boolean zzp() {
        return this.zza.zzp();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzq() {
        if (this.zze != -9223372036854775807L) {
            return true;
        }
        return false;
    }
}
