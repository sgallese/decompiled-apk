package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzcjj implements zzewf {
    private final zzciz zza;
    private final zzcjj zzb = this;
    private final zzgzg zzc;
    private final zzgzg zzd;
    private final zzgzg zze;
    private final zzgzg zzf;
    private final zzgzg zzg;
    private final zzgzg zzh;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzcjj(zzciz zzcizVar, Context context, String str, zzcji zzcjiVar) {
        zzgzg zzgzgVar;
        zzgzg zzgzgVar2;
        zzgzg zzgzgVar3;
        zzgzg zzgzgVar4;
        zzgzg zzgzgVar5;
        zzgzg zzgzgVar6;
        zzgzg zzgzgVar7;
        zzgzg zzgzgVar8;
        zzgzg zzgzgVar9;
        this.zza = zzcizVar;
        zzgyt zza = zzgyu.zza(context);
        this.zzc = zza;
        zzgyt zza2 = zzgyu.zza(str);
        this.zzd = zza2;
        zzgzgVar = zzcizVar.zzaF;
        zzgzgVar2 = zzcizVar.zzaG;
        zzeyx zzeyxVar = new zzeyx(zza, zzgzgVar, zzgzgVar2);
        this.zze = zzeyxVar;
        zzgzgVar3 = zzcizVar.zzaF;
        zzgzg zzc = zzgys.zzc(new zzexd(zzgzgVar3));
        this.zzf = zzc;
        zzgzgVar4 = zzcizVar.zzo;
        zzgzgVar5 = zzcizVar.zzU;
        zzfcc zza3 = zzfcc.zza();
        zzgzgVar6 = zzcizVar.zzh;
        zzgzg zzc2 = zzgys.zzc(new zzexf(zza, zzgzgVar4, zzgzgVar5, zzeyxVar, zzc, zza3, zzgzgVar6));
        this.zzg = zzc2;
        zzgzgVar7 = zzcizVar.zzU;
        zzgzgVar8 = zzcizVar.zzh;
        zzgzgVar9 = zzcizVar.zzZ;
        this.zzh = zzgys.zzc(new zzexl(zzgzgVar7, zza, zza2, zzc2, zzc, zzgzgVar8, zzgzgVar9));
    }

    @Override // com.google.android.gms.internal.ads.zzewf
    public final zzexk zza() {
        return (zzexk) this.zzh.zzb();
    }
}
