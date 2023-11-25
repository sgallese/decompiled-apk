package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzefz implements zzgyt {
    private final zzgzg zza;
    private final zzgzg zzb;

    public zzefz(zzgzg zzgzgVar, zzgzg zzgzgVar2) {
        this.zza = zzgzgVar;
        this.zzb = zzgzgVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgzg
    /* renamed from: zza  reason: merged with bridge method [inline-methods] */
    public final zzefy zzb() {
        return new zzefy((Context) this.zza.zzb(), (zzdfq) this.zzb.zzb());
    }
}
