package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzdfj implements zzgyt {
    private final zzdet zza;
    private final zzgzg zzb;

    public zzdfj(zzdet zzdetVar, zzgzg zzgzgVar) {
        this.zza = zzdetVar;
        this.zzb = zzgzgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgzg
    public final /* bridge */ /* synthetic */ Object zzb() {
        return this.zza.zzd((Executor) this.zzb.zzb());
    }
}
