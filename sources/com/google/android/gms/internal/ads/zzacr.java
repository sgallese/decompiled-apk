package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzacr implements zzabb {
    private int zzc;
    private zzacs zze;
    private long zzh;
    private zzacu zzi;
    private int zzm;
    private boolean zzn;
    private final zzfb zza = new zzfb(12);
    private final zzacq zzb = new zzacq(null);
    private zzabe zzd = new zzaaz();
    private zzacu[] zzg = new zzacu[0];
    private long zzk = -1;
    private long zzl = -1;
    private int zzj = -1;
    private long zzf = -9223372036854775807L;

    private final zzacu zzf(int i10) {
        for (zzacu zzacuVar : this.zzg) {
            if (zzacuVar.zzg(i10)) {
                return zzacuVar;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:134:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    @Override // com.google.android.gms.internal.ads.zzabb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zza(com.google.android.gms.internal.ads.zzabc r24, com.google.android.gms.internal.ads.zzabx r25) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 973
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzacr.zza(com.google.android.gms.internal.ads.zzabc, com.google.android.gms.internal.ads.zzabx):int");
    }

    @Override // com.google.android.gms.internal.ads.zzabb
    public final void zzb(zzabe zzabeVar) {
        this.zzc = 0;
        this.zzd = zzabeVar;
        this.zzh = -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzabb
    public final void zzc(long j10, long j11) {
        int i10;
        this.zzh = -1L;
        this.zzi = null;
        for (zzacu zzacuVar : this.zzg) {
            zzacuVar.zzf(j10);
        }
        if (j10 == 0) {
            if (this.zzg.length == 0) {
                this.zzc = 0;
                return;
            }
            i10 = 3;
        } else {
            i10 = 6;
        }
        this.zzc = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzabb
    public final boolean zzd(zzabc zzabcVar) throws IOException {
        ((zzaar) zzabcVar).zzm(this.zza.zzI(), 0, 12, false);
        this.zza.zzG(0);
        if (this.zza.zzh() != 1179011410) {
            return false;
        }
        this.zza.zzH(4);
        if (this.zza.zzh() != 541677121) {
            return false;
        }
        return true;
    }
}
