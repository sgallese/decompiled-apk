package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzckr implements zzezk {
    private final zzciz zza;
    private final zzckr zzb = this;
    private final zzgzg zzc;
    private final zzgzg zzd;
    private final zzgzg zze;
    private final zzgzg zzf;
    private final zzgzg zzg;
    private final zzgzg zzh;
    private final zzgzg zzi;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzckr(zzciz zzcizVar, Context context, String str, com.google.android.gms.ads.internal.client.zzq zzqVar, zzckq zzckqVar) {
        zzgzg zzgzgVar;
        zzgzg zzgzgVar2;
        zzgzg zzgzgVar3;
        zzgzg zzgzgVar4;
        zzgzg zzgzgVar5;
        zzgzg zzgzgVar6;
        zzgzg zzgzgVar7;
        this.zza = zzcizVar;
        zzgyt zza = zzgyu.zza(context);
        this.zzc = zza;
        zzgyt zza2 = zzgyu.zza(zzqVar);
        this.zzd = zza2;
        zzgyt zza3 = zzgyu.zza(str);
        this.zze = zza3;
        zzgzgVar = zzcizVar.zzn;
        zzgzg zzc = zzgys.zzc(new zzeky(zzgzgVar));
        this.zzf = zzc;
        zzgzgVar2 = zzcizVar.zzaF;
        zzgzg zzc2 = zzgys.zzc(new zzfai(zzgzgVar2));
        this.zzg = zzc2;
        zzgzgVar3 = zzcizVar.zzo;
        zzgzgVar4 = zzcizVar.zzU;
        zzgzg zzc3 = zzgys.zzc(new zzezi(zza, zzgzgVar3, zzgzgVar4, zzc, zzc2, zzfcc.zza()));
        this.zzh = zzc3;
        zzgzgVar5 = zzcizVar.zzh;
        zzgzgVar6 = zzcizVar.zzV;
        zzgzgVar7 = zzcizVar.zzZ;
        this.zzi = zzgys.zzc(new zzelg(zza, zza2, zza3, zzc3, zzc, zzc2, zzgzgVar5, zzgzgVar6, zzgzgVar7));
    }

    @Override // com.google.android.gms.internal.ads.zzezk
    public final zzelf zza() {
        return (zzelf) this.zzi.zzb();
    }
}
