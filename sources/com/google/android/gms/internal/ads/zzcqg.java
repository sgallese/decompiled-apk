package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzcqg implements zzgyt {
    private final zzgzg zza;
    private final zzgzg zzb;
    private final zzgzg zzc;
    private final zzgzg zzd;
    private final zzgzg zze;
    private final zzgzg zzf;
    private final zzgzg zzg;
    private final zzgzg zzh;
    private final zzgzg zzi;
    private final zzgzg zzj;

    public zzcqg(zzgzg zzgzgVar, zzgzg zzgzgVar2, zzgzg zzgzgVar3, zzgzg zzgzgVar4, zzgzg zzgzgVar5, zzgzg zzgzgVar6, zzgzg zzgzgVar7, zzgzg zzgzgVar8, zzgzg zzgzgVar9, zzgzg zzgzgVar10) {
        this.zza = zzgzgVar;
        this.zzb = zzgzgVar2;
        this.zzc = zzgzgVar3;
        this.zzd = zzgzgVar4;
        this.zze = zzgzgVar5;
        this.zzf = zzgzgVar6;
        this.zzg = zzgzgVar7;
        this.zzh = zzgzgVar8;
        this.zzi = zzgzgVar9;
        this.zzj = zzgzgVar10;
    }

    public static zzcqf zzc(zzcsd zzcsdVar, Context context, zzfbf zzfbfVar, View view, zzcfi zzcfiVar, zzcsc zzcscVar, zzdin zzdinVar, zzddy zzddyVar, zzgyn zzgynVar, Executor executor) {
        return new zzcqf(zzcsdVar, context, zzfbfVar, view, zzcfiVar, zzcscVar, zzdinVar, zzddyVar, zzgynVar, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzgzg
    /* renamed from: zza  reason: merged with bridge method [inline-methods] */
    public final zzcqf zzb() {
        return new zzcqf(((zzcud) this.zza).zzb(), (Context) this.zzb.zzb(), ((zzcqm) this.zzc).zza(), ((zzcql) this.zzd).zza(), ((zzcqx) this.zze).zza(), ((zzcqn) this.zzf).zza(), ((zzdgk) this.zzg).zza(), (zzddy) this.zzh.zzb(), zzgys.zza(this.zzi), (Executor) this.zzj.zzb());
    }
}
