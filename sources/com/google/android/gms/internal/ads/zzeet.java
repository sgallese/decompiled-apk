package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzeet implements zzgyt {
    private final zzgzg zza;
    private final zzgzg zzb;
    private final zzgzg zzc;

    public zzeet(zzgzg zzgzgVar, zzgzg zzgzgVar2, zzgzg zzgzgVar3) {
        this.zza = zzgzgVar;
        this.zzb = zzgzgVar2;
        this.zzc = zzgzgVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzgzg
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzees((Context) this.zza.zzb(), (zzcqz) this.zzb.zzb(), (Executor) this.zzc.zzb());
    }
}