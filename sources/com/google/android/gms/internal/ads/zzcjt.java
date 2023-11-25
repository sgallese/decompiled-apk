package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzcjt implements zzext {
    private final Context zza;
    private final com.google.android.gms.ads.internal.client.zzq zzb;
    private final String zzc;
    private final zzciz zzd;
    private final zzcjt zze = this;
    private final zzgzg zzf;
    private final zzgzg zzg;
    private final zzgzg zzh;
    private final zzgzg zzi;
    private final zzgzg zzj;
    private final zzgzg zzk;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzcjt(zzciz zzcizVar, Context context, String str, com.google.android.gms.ads.internal.client.zzq zzqVar, zzcjs zzcjsVar) {
        zzgzg zzgzgVar;
        zzgzg zzgzgVar2;
        zzgzg zzgzgVar3;
        this.zzd = zzcizVar;
        this.zza = context;
        this.zzb = zzqVar;
        this.zzc = str;
        zzgyt zza = zzgyu.zza(context);
        this.zzf = zza;
        zzgyt zza2 = zzgyu.zza(zzqVar);
        this.zzg = zza2;
        zzgzgVar = zzcizVar.zzn;
        zzgzg zzc = zzgys.zzc(new zzeky(zzgzgVar));
        this.zzh = zzc;
        zzgzg zzc2 = zzgys.zzc(zzeld.zza());
        this.zzi = zzc2;
        zzgzg zzc3 = zzgys.zzc(zzdbg.zza());
        this.zzj = zzc3;
        zzgzgVar2 = zzcizVar.zzo;
        zzgzgVar3 = zzcizVar.zzU;
        this.zzk = zzgys.zzc(new zzexr(zza, zzgzgVar2, zza2, zzgzgVar3, zzc, zzc2, zzfcc.zza(), zzc3));
    }

    @Override // com.google.android.gms.internal.ads.zzext
    public final zzekd zza() {
        zzchg zzchgVar;
        zzgzg zzgzgVar;
        Context context = this.zza;
        com.google.android.gms.ads.internal.client.zzq zzqVar = this.zzb;
        String str = this.zzc;
        zzexq zzexqVar = (zzexq) this.zzk.zzb();
        zzekx zzekxVar = (zzekx) this.zzh.zzb();
        zzchgVar = this.zzd.zza;
        zzcag zzd = zzchgVar.zzd();
        zzgzb.zzb(zzd);
        zzgzgVar = this.zzd.zzZ;
        return new zzekd(context, zzqVar, str, zzexqVar, zzekxVar, zzd, (zzdrh) zzgzgVar.zzb());
    }
}
