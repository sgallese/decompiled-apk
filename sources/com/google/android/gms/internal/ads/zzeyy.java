package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzeyy implements zzgyt {
    private final zzgzg zza;
    private final zzgzg zzb;
    private final zzgzg zzc;

    public zzeyy(zzgzg zzgzgVar, zzgzg zzgzgVar2, zzgzg zzgzgVar3) {
        this.zza = zzgzgVar;
        this.zzb = zzgzgVar2;
        this.zzc = zzgzgVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzgzg
    /* renamed from: zza  reason: merged with bridge method [inline-methods] */
    public final zzeyv zzb() {
        zzbzd zzi;
        Context context = (Context) this.zza.zzb();
        zzfdj zzfdjVar = (zzfdj) this.zzb.zzb();
        zzfeb zzfebVar = (zzfeb) this.zzc.zzb();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzgj)).booleanValue()) {
            zzi = com.google.android.gms.ads.internal.zzt.zzo().zzh().zzh();
        } else {
            zzi = com.google.android.gms.ads.internal.zzt.zzo().zzh().zzi();
        }
        boolean z10 = false;
        if (zzi != null && zzi.zzh()) {
            z10 = true;
        }
        if (((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzgl)).intValue() > 0) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzgi)).booleanValue() || z10) {
                zzfea zza = zzfebVar.zza(zzfdr.Rewarded, context, zzfdjVar, new zzexz(new zzexw()));
                zzeyl zzeylVar = new zzeyl(new zzeyk());
                zzfdn zzfdnVar = zza.zza;
                zzfyo zzfyoVar = zzcan.zza;
                return new zzeyb(zzeylVar, new zzeyh(zzfdnVar, zzfyoVar), zza.zzb, zza.zza.zza().zzf, zzfyoVar);
            }
        }
        return new zzeyk();
    }
}
