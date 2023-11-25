package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzuh implements zzvj {
    private final zzvj zza;
    private final long zzb;

    public zzuh(zzvj zzvjVar, long j10) {
        this.zza = zzvjVar;
        this.zzb = j10;
    }

    @Override // com.google.android.gms.internal.ads.zzvj
    public final int zza(zzkn zzknVar, zzht zzhtVar, int i10) {
        int zza = this.zza.zza(zzknVar, zzhtVar, i10);
        if (zza == -4) {
            zzhtVar.zzd += this.zzb;
            return -4;
        }
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzvj
    public final int zzb(long j10) {
        return this.zza.zzb(j10 - this.zzb);
    }

    public final zzvj zzc() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzvj
    public final void zzd() throws IOException {
        this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzvj
    public final boolean zze() {
        return this.zza.zze();
    }
}
