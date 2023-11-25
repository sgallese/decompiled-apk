package com.google.android.gms.internal.ads;

import java.util.UUID;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzdvz implements zzgyt {
    public static zzdvz zza() {
        zzdvz zzdvzVar;
        zzdvzVar = zzdvy.zza;
        return zzdvzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgzg
    public final /* synthetic */ Object zzb() {
        com.google.android.gms.ads.internal.zzt.zzp();
        String uuid = UUID.randomUUID().toString();
        zzgzb.zzb(uuid);
        return uuid;
    }
}
