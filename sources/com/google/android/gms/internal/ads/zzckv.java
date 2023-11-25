package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzckv implements zzfay {
    private final zzciz zza;
    private final zzckv zzb = this;
    private final zzgzg zzc;
    private final zzgzg zzd;
    private final zzgzg zze;
    private final zzgzg zzf;
    private final zzgzg zzg;
    private final zzgzg zzh;
    private final zzgzg zzi;
    private final zzgzg zzj;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzckv(zzciz zzcizVar, Context context, String str, zzcku zzckuVar) {
        zzgzg zzgzgVar;
        zzgzg zzgzgVar2;
        zzgzg zzgzgVar3;
        zzgzg zzgzgVar4;
        zzgzg zzgzgVar5;
        zzgzg zzgzgVar6;
        zzgzg zzgzgVar7;
        zzgzg zzgzgVar8;
        this.zza = zzcizVar;
        zzgyt zza = zzgyu.zza(context);
        this.zzc = zza;
        zzgzgVar = zzcizVar.zzaF;
        zzgzgVar2 = zzcizVar.zzaG;
        zzeyy zzeyyVar = new zzeyy(zza, zzgzgVar, zzgzgVar2);
        this.zzd = zzeyyVar;
        zzgzgVar3 = zzcizVar.zzaF;
        zzgzg zzc = zzgys.zzc(new zzfai(zzgzgVar3));
        this.zze = zzc;
        zzgzg zzc2 = zzgys.zzc(zzfbx.zza());
        this.zzf = zzc2;
        zzgzgVar4 = zzcizVar.zzo;
        zzgzgVar5 = zzcizVar.zzU;
        zzgzg zzc3 = zzgys.zzc(new zzfas(zza, zzgzgVar4, zzgzgVar5, zzeyyVar, zzc, zzfcc.zza(), zzc2));
        this.zzg = zzc3;
        this.zzh = zzgys.zzc(new zzfbc(zzc3, zzc, zzc2));
        zzgyt zzc4 = zzgyu.zzc(str);
        this.zzi = zzc4;
        zzgzgVar6 = zzcizVar.zzh;
        zzgzgVar7 = zzcizVar.zzV;
        zzgzgVar8 = zzcizVar.zzZ;
        this.zzj = zzgys.zzc(new zzfaw(zzc4, zzc3, zza, zzc, zzc2, zzgzgVar6, zzgzgVar7, zzgzgVar8));
    }

    @Override // com.google.android.gms.internal.ads.zzfay
    public final zzfav zza() {
        return (zzfav) this.zzj.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzfay
    public final zzfbb zzb() {
        return (zzfbb) this.zzh.zzb();
    }
}
