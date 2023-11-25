package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzcan;
import com.google.android.gms.internal.ads.zzdwe;
import com.google.android.gms.internal.ads.zzfyo;
import com.google.android.gms.internal.ads.zzgyt;
import com.google.android.gms.internal.ads.zzgzb;
import com.google.android.gms.internal.ads.zzgzg;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes.dex */
public final class zzal implements zzgyt {
    private final zzgzg zza;
    private final zzgzg zzb;

    public zzal(zzgzg zzgzgVar, zzgzg zzgzgVar2) {
        this.zza = zzgzgVar;
        this.zzb = zzgzgVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgzg
    /* renamed from: zza  reason: merged with bridge method [inline-methods] */
    public final zzak zzb() {
        zzfyo zzfyoVar = zzcan.zza;
        zzgzb.zzb(zzfyoVar);
        return new zzak(zzfyoVar, ((zzdwe) this.zzb).zzb());
    }
}
