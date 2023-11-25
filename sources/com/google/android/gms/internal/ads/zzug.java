package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzug implements zztq, zztp {
    private final zztq zza;
    private final long zzb;
    private zztp zzc;

    public zzug(zztq zztqVar, long j10) {
        this.zza = zztqVar;
        this.zzb = j10;
    }

    @Override // com.google.android.gms.internal.ads.zztq
    public final long zza(long j10, zzlr zzlrVar) {
        return this.zza.zza(j10 - this.zzb, zzlrVar) + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zztq, com.google.android.gms.internal.ads.zzvl
    public final long zzb() {
        long zzb = this.zza.zzb();
        if (zzb == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return zzb + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zztq, com.google.android.gms.internal.ads.zzvl
    public final long zzc() {
        long zzc = this.zza.zzc();
        if (zzc == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return zzc + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zztq
    public final long zzd() {
        long zzd = this.zza.zzd();
        if (zzd == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return zzd + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zztq
    public final long zze(long j10) {
        return this.zza.zze(j10 - this.zzb) + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zztq
    public final long zzf(zzxf[] zzxfVarArr, boolean[] zArr, zzvj[] zzvjVarArr, boolean[] zArr2, long j10) {
        zzvj[] zzvjVarArr2 = new zzvj[zzvjVarArr.length];
        int i10 = 0;
        while (true) {
            zzvj zzvjVar = null;
            if (i10 >= zzvjVarArr.length) {
                break;
            }
            zzuh zzuhVar = (zzuh) zzvjVarArr[i10];
            if (zzuhVar != null) {
                zzvjVar = zzuhVar.zzc();
            }
            zzvjVarArr2[i10] = zzvjVar;
            i10++;
        }
        long zzf = this.zza.zzf(zzxfVarArr, zArr, zzvjVarArr2, zArr2, j10 - this.zzb);
        for (int i11 = 0; i11 < zzvjVarArr.length; i11++) {
            zzvj zzvjVar2 = zzvjVarArr2[i11];
            if (zzvjVar2 == null) {
                zzvjVarArr[i11] = null;
            } else {
                zzvj zzvjVar3 = zzvjVarArr[i11];
                if (zzvjVar3 == null || ((zzuh) zzvjVar3).zzc() != zzvjVar2) {
                    zzvjVarArr[i11] = new zzuh(zzvjVar2, this.zzb);
                }
            }
        }
        return zzf + this.zzb;
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
        this.zza.zzj(j10 - this.zzb, false);
    }

    @Override // com.google.android.gms.internal.ads.zztq
    public final void zzk() throws IOException {
        this.zza.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zztq
    public final void zzl(zztp zztpVar, long j10) {
        this.zzc = zztpVar;
        this.zza.zzl(this, j10 - this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zztq, com.google.android.gms.internal.ads.zzvl
    public final void zzm(long j10) {
        this.zza.zzm(j10 - this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zztq, com.google.android.gms.internal.ads.zzvl
    public final boolean zzo(long j10) {
        return this.zza.zzo(j10 - this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zztq, com.google.android.gms.internal.ads.zzvl
    public final boolean zzp() {
        return this.zza.zzp();
    }
}
