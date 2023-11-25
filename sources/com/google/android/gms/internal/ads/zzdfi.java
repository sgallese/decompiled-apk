package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzdfi implements zzgyt {
    private final zzgzg zza;

    public zzdfi(zzgzg zzgzgVar) {
        this.zza = zzgzgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgzg
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set singleton = Collections.singleton(new zzddo((zzdgb) this.zza.zzb(), zzcan.zzf));
        zzgzb.zzb(singleton);
        return singleton;
    }
}
