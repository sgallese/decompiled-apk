package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzeeh implements zzgyt {
    private final zzgzg zza;
    private final zzgzg zzb;

    public zzeeh(zzgzg zzgzgVar, zzgzg zzgzgVar2) {
        this.zza = zzgzgVar;
        this.zzb = zzgzgVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgzg
    /* renamed from: zza  reason: merged with bridge method [inline-methods] */
    public final zzeeg zzb() {
        return new zzeeg((Context) this.zza.zzb(), (zzcpq) this.zzb.zzb());
    }
}
