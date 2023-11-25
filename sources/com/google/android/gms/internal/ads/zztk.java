package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zztk implements zztq, zztp {
    public final zzts zza;
    private final long zzb;
    private zztu zzc;
    private zztq zzd;
    private zztp zze;
    private long zzf = -9223372036854775807L;
    private final zzxu zzg;

    public zztk(zzts zztsVar, zzxu zzxuVar, long j10) {
        this.zza = zztsVar;
        this.zzg = zzxuVar;
        this.zzb = j10;
    }

    private final long zzv(long j10) {
        long j11 = this.zzf;
        if (j11 != -9223372036854775807L) {
            return j11;
        }
        return j10;
    }

    @Override // com.google.android.gms.internal.ads.zztq
    public final long zza(long j10, zzlr zzlrVar) {
        zztq zztqVar = this.zzd;
        int i10 = zzfk.zza;
        return zztqVar.zza(j10, zzlrVar);
    }

    @Override // com.google.android.gms.internal.ads.zztq, com.google.android.gms.internal.ads.zzvl
    public final long zzb() {
        zztq zztqVar = this.zzd;
        int i10 = zzfk.zza;
        return zztqVar.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zztq, com.google.android.gms.internal.ads.zzvl
    public final long zzc() {
        zztq zztqVar = this.zzd;
        int i10 = zzfk.zza;
        return zztqVar.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zztq
    public final long zzd() {
        zztq zztqVar = this.zzd;
        int i10 = zzfk.zza;
        return zztqVar.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zztq
    public final long zze(long j10) {
        zztq zztqVar = this.zzd;
        int i10 = zzfk.zza;
        return zztqVar.zze(j10);
    }

    @Override // com.google.android.gms.internal.ads.zztq
    public final long zzf(zzxf[] zzxfVarArr, boolean[] zArr, zzvj[] zzvjVarArr, boolean[] zArr2, long j10) {
        long j11;
        long j12 = this.zzf;
        if (j12 != -9223372036854775807L && j10 == this.zzb) {
            this.zzf = -9223372036854775807L;
            j11 = j12;
        } else {
            j11 = j10;
        }
        zztq zztqVar = this.zzd;
        int i10 = zzfk.zza;
        return zztqVar.zzf(zzxfVarArr, zArr, zzvjVarArr, zArr2, j11);
    }

    @Override // com.google.android.gms.internal.ads.zzvk
    public final /* bridge */ /* synthetic */ void zzg(zzvl zzvlVar) {
        zztq zztqVar = (zztq) zzvlVar;
        zztp zztpVar = this.zze;
        int i10 = zzfk.zza;
        zztpVar.zzg(this);
    }

    @Override // com.google.android.gms.internal.ads.zztq
    public final zzvs zzh() {
        zztq zztqVar = this.zzd;
        int i10 = zzfk.zza;
        return zztqVar.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zztp
    public final void zzi(zztq zztqVar) {
        zztp zztpVar = this.zze;
        int i10 = zzfk.zza;
        zztpVar.zzi(this);
    }

    @Override // com.google.android.gms.internal.ads.zztq
    public final void zzj(long j10, boolean z10) {
        zztq zztqVar = this.zzd;
        int i10 = zzfk.zza;
        zztqVar.zzj(j10, false);
    }

    @Override // com.google.android.gms.internal.ads.zztq
    public final void zzk() throws IOException {
        zztq zztqVar = this.zzd;
        if (zztqVar != null) {
            zztqVar.zzk();
            return;
        }
        zztu zztuVar = this.zzc;
        if (zztuVar != null) {
            zztuVar.zzz();
        }
    }

    @Override // com.google.android.gms.internal.ads.zztq
    public final void zzl(zztp zztpVar, long j10) {
        this.zze = zztpVar;
        zztq zztqVar = this.zzd;
        if (zztqVar != null) {
            zztqVar.zzl(this, zzv(this.zzb));
        }
    }

    @Override // com.google.android.gms.internal.ads.zztq, com.google.android.gms.internal.ads.zzvl
    public final void zzm(long j10) {
        zztq zztqVar = this.zzd;
        int i10 = zzfk.zza;
        zztqVar.zzm(j10);
    }

    public final long zzn() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zztq, com.google.android.gms.internal.ads.zzvl
    public final boolean zzo(long j10) {
        zztq zztqVar = this.zzd;
        if (zztqVar != null && zztqVar.zzo(j10)) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zztq, com.google.android.gms.internal.ads.zzvl
    public final boolean zzp() {
        zztq zztqVar = this.zzd;
        if (zztqVar != null && zztqVar.zzp()) {
            return true;
        }
        return false;
    }

    public final long zzq() {
        return this.zzb;
    }

    public final void zzr(zzts zztsVar) {
        long zzv = zzv(this.zzb);
        zztu zztuVar = this.zzc;
        zztuVar.getClass();
        zztq zzI = zztuVar.zzI(zztsVar, this.zzg, zzv);
        this.zzd = zzI;
        if (this.zze != null) {
            zzI.zzl(this, zzv);
        }
    }

    public final void zzs(long j10) {
        this.zzf = j10;
    }

    public final void zzt() {
        zztq zztqVar = this.zzd;
        if (zztqVar != null) {
            zztu zztuVar = this.zzc;
            zztuVar.getClass();
            zztuVar.zzG(zztqVar);
        }
    }

    public final void zzu(zztu zztuVar) {
        boolean z10;
        if (this.zzc == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        zzdy.zzf(z10);
        this.zzc = zztuVar;
    }
}
