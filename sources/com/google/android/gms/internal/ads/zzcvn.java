package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzcvn implements zzgyt {
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
    private final zzgzg zzk;

    public zzcvn(zzgzg zzgzgVar, zzgzg zzgzgVar2, zzgzg zzgzgVar3, zzgzg zzgzgVar4, zzgzg zzgzgVar5, zzgzg zzgzgVar6, zzgzg zzgzgVar7, zzgzg zzgzgVar8, zzgzg zzgzgVar9, zzgzg zzgzgVar10, zzgzg zzgzgVar11) {
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
        this.zzk = zzgzgVar11;
    }

    @Override // com.google.android.gms.internal.ads.zzgzg
    /* renamed from: zza  reason: merged with bridge method [inline-methods] */
    public final zzcvm zzb() {
        zzfge zzfgeVar = (zzfge) this.zza.zzb();
        zzcag zza = ((zzchv) this.zzb).zza();
        ApplicationInfo zzb = ((zzdvq) this.zzc).zzb();
        String zzb2 = ((zzdvw) this.zzd).zzb();
        zzbbj zzbbjVar = zzbbr.zza;
        return new zzcvm(zzfgeVar, zza, zzb, zzb2, com.google.android.gms.ads.internal.client.zzba.zza().zza(), (PackageInfo) this.zzf.zzb(), zzgys.zza(this.zzg), ((zzchh) this.zzh).zzb(), (String) this.zzi.zzb(), ((zzesn) this.zzj).zzb(), ((zzcvz) this.zzk).zza());
    }
}
