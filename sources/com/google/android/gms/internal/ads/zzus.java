package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzus implements zzvj {
    final /* synthetic */ zzuv zza;
    private final int zzb;

    public zzus(zzuv zzuvVar, int i10) {
        this.zza = zzuvVar;
        this.zzb = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzvj
    public final int zza(zzkn zzknVar, zzht zzhtVar, int i10) {
        return this.zza.zzg(this.zzb, zzknVar, zzhtVar, i10);
    }

    @Override // com.google.android.gms.internal.ads.zzvj
    public final int zzb(long j10) {
        return this.zza.zzi(this.zzb, j10);
    }

    @Override // com.google.android.gms.internal.ads.zzvj
    public final void zzd() throws IOException {
        this.zza.zzH(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzvj
    public final boolean zze() {
        return this.zza.zzO(this.zzb);
    }
}
