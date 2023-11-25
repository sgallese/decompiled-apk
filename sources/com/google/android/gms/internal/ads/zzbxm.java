package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.Clock;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzbxm extends zzbyg {
    private final Clock zzb;
    private final zzbxm zzc = this;
    private final zzgzg zzd;
    private final zzgzg zze;
    private final zzgzg zzf;
    private final zzgzg zzg;
    private final zzgzg zzh;
    private final zzgzg zzi;
    private final zzgzg zzj;
    private final zzgzg zzk;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzbxm(Context context, Clock clock, com.google.android.gms.ads.internal.util.zzg zzgVar, zzbyf zzbyfVar, zzbxl zzbxlVar) {
        this.zzb = clock;
        zzgyt zza = zzgyu.zza(context);
        this.zzd = zza;
        zzgyt zza2 = zzgyu.zza(zzgVar);
        this.zze = zza2;
        zzgyt zza3 = zzgyu.zza(zzbyfVar);
        this.zzf = zza3;
        this.zzg = zzgys.zzc(new zzbxe(zza, zza2, zza3));
        zzgyt zza4 = zzgyu.zza(clock);
        this.zzh = zza4;
        zzgzg zzc = zzgys.zzc(new zzbxg(zza4, zza2, zza3));
        this.zzi = zzc;
        zzbxi zzbxiVar = new zzbxi(zza4, zzc);
        this.zzj = zzbxiVar;
        this.zzk = zzgys.zzc(new zzbyl(zza, zzbxiVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbyg
    final zzbxd zza() {
        return (zzbxd) this.zzg.zzb();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzbyg
    public final zzbxh zzb() {
        return new zzbxh(this.zzb, (zzbxf) this.zzi.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzbyg
    final zzbyk zzc() {
        return (zzbyk) this.zzk.zzb();
    }
}
