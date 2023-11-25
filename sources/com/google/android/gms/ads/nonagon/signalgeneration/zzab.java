package com.google.android.gms.ads.nonagon.signalgeneration;

import android.content.Context;
import com.google.android.gms.internal.ads.zzaqx;
import com.google.android.gms.internal.ads.zzcan;
import com.google.android.gms.internal.ads.zzchd;
import com.google.android.gms.internal.ads.zzchj;
import com.google.android.gms.internal.ads.zzchv;
import com.google.android.gms.internal.ads.zzdrm;
import com.google.android.gms.internal.ads.zzfcx;
import com.google.android.gms.internal.ads.zzfik;
import com.google.android.gms.internal.ads.zzfyo;
import com.google.android.gms.internal.ads.zzgyt;
import com.google.android.gms.internal.ads.zzgzb;
import com.google.android.gms.internal.ads.zzgzg;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes.dex */
public final class zzab implements zzgyt {
    private final zzgzg zza;
    private final zzgzg zzb;
    private final zzgzg zzc;
    private final zzgzg zzd;
    private final zzgzg zze;
    private final zzgzg zzf;
    private final zzgzg zzg;
    private final zzgzg zzh;
    private final zzgzg zzi;

    public zzab(zzgzg zzgzgVar, zzgzg zzgzgVar2, zzgzg zzgzgVar3, zzgzg zzgzgVar4, zzgzg zzgzgVar5, zzgzg zzgzgVar6, zzgzg zzgzgVar7, zzgzg zzgzgVar8, zzgzg zzgzgVar9) {
        this.zza = zzgzgVar;
        this.zzb = zzgzgVar2;
        this.zzc = zzgzgVar3;
        this.zzd = zzgzgVar4;
        this.zze = zzgzgVar5;
        this.zzf = zzgzgVar6;
        this.zzg = zzgzgVar7;
        this.zzh = zzgzgVar8;
        this.zzi = zzgzgVar9;
    }

    @Override // com.google.android.gms.internal.ads.zzgzg
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzchd zzchdVar = (zzchd) this.zza.zzb();
        Context zza = ((zzchj) this.zzb).zza();
        zzaqx zzaqxVar = (zzaqx) this.zzc.zzb();
        zzfcx zzfcxVar = (zzfcx) this.zzd.zzb();
        zzfyo zzfyoVar = zzcan.zza;
        zzgzb.zzb(zzfyoVar);
        return new zzaa(zzchdVar, zza, zzaqxVar, zzfcxVar, zzfyoVar, (ScheduledExecutorService) this.zzf.zzb(), (zzdrm) this.zzg.zzb(), (zzfik) this.zzh.zzb(), ((zzchv) this.zzi).zza());
    }
}
