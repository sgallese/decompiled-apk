package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzcxz implements zzgyt {
    private final zzgzg zza;

    public zzcxz(zzgzg zzgzgVar) {
        this.zza = zzgzgVar;
    }

    public static zzcxy zzc(Set set) {
        return new zzcxy(set);
    }

    @Override // com.google.android.gms.internal.ads.zzgzg
    /* renamed from: zza  reason: merged with bridge method [inline-methods] */
    public final zzcxy zzb() {
        return new zzcxy(((zzgze) this.zza).zzb());
    }
}
