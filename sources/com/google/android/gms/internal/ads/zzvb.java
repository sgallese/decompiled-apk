package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzvb implements zzxo {
    public long zza;
    public long zzb;
    public zzxn zzc;
    public zzvb zzd;

    public zzvb(long j10, int i10) {
        zze(j10, 65536);
    }

    public final int zza(long j10) {
        long j11 = j10 - this.zza;
        int i10 = this.zzc.zzb;
        return (int) j11;
    }

    public final zzvb zzb() {
        this.zzc = null;
        zzvb zzvbVar = this.zzd;
        this.zzd = null;
        return zzvbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzxo
    public final zzxn zzc() {
        zzxn zzxnVar = this.zzc;
        zzxnVar.getClass();
        return zzxnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzxo
    public final zzxo zzd() {
        zzvb zzvbVar = this.zzd;
        if (zzvbVar != null && zzvbVar.zzc != null) {
            return zzvbVar;
        }
        return null;
    }

    public final void zze(long j10, int i10) {
        boolean z10;
        if (this.zzc == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        zzdy.zzf(z10);
        this.zza = j10;
        this.zzb = j10 + 65536;
    }
}
