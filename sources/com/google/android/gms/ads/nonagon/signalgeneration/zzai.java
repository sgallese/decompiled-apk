package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbbr;
import com.google.android.gms.internal.ads.zzcvn;
import com.google.android.gms.internal.ads.zzffy;
import com.google.android.gms.internal.ads.zzfge;
import com.google.android.gms.internal.ads.zzgyt;
import com.google.android.gms.internal.ads.zzgzg;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes.dex */
public final class zzai implements zzgyt {
    private final zzgzg zza;
    private final zzgzg zzb;
    private final zzgzg zzc;

    public zzai(zzgzg zzgzgVar, zzgzg zzgzgVar2, zzgzg zzgzgVar3) {
        this.zza = zzgzgVar;
        this.zzb = zzgzgVar2;
        this.zzc = zzgzgVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzgzg
    public final /* bridge */ /* synthetic */ Object zzb() {
        return ((zzfge) this.zza.zzb()).zzb(zzffy.GENERATE_SIGNALS, ((zzcvn) this.zzc).zzb().zzc()).zzf(((zzal) this.zzb).zzb()).zzi(((Integer) zzba.zzc().zzb(zzbbr.zzfr)).intValue(), TimeUnit.SECONDS).zza();
    }
}
