package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzgzd {
    private final List zza;
    private final List zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzgzd(int i10, int i11, zzgzc zzgzcVar) {
        this.zza = zzgyq.zzc(i10);
        this.zzb = zzgyq.zzc(i11);
    }

    public final zzgzd zza(zzgzg zzgzgVar) {
        this.zzb.add(zzgzgVar);
        return this;
    }

    public final zzgzd zzb(zzgzg zzgzgVar) {
        this.zza.add(zzgzgVar);
        return this;
    }

    public final zzgze zzc() {
        return new zzgze(this.zza, this.zzb, null);
    }
}
