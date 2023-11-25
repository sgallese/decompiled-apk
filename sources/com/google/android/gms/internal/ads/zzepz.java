package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzepz implements zzesj {
    private final zzfbd zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzepz(zzfbd zzfbdVar) {
        this.zza = zzfbdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzesj
    public final int zza() {
        return 25;
    }

    @Override // com.google.android.gms.internal.ads.zzesj
    public final com.google.common.util.concurrent.a zzb() {
        return zzfye.zzh(new zzeqa(this.zza));
    }
}
