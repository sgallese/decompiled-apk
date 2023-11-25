package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzadq implements zzabe {
    private final long zzb;
    private final zzabe zzc;

    public zzadq(long j10, zzabe zzabeVar) {
        this.zzb = j10;
        this.zzc = zzabeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzabe
    public final void zzC() {
        this.zzc.zzC();
    }

    @Override // com.google.android.gms.internal.ads.zzabe
    public final void zzN(zzaca zzacaVar) {
        this.zzc.zzN(new zzadp(this, zzacaVar));
    }

    @Override // com.google.android.gms.internal.ads.zzabe
    public final zzace zzv(int i10, int i11) {
        return this.zzc.zzv(i10, i11);
    }
}
