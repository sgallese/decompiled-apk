package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzcrr implements zzcxw, zzcxc {
    private final Context zza;
    private final zzcfi zzb;
    private final zzfbe zzc;
    private final zzcag zzd;
    private zzfip zze;
    private boolean zzf;

    public zzcrr(Context context, zzcfi zzcfiVar, zzfbe zzfbeVar, zzcag zzcagVar) {
        this.zza = context;
        this.zzb = zzcfiVar;
        this.zzc = zzfbeVar;
        this.zzd = zzcagVar;
    }

    private final synchronized void zza() {
        zzedh zzedhVar;
        zzedi zzediVar;
        if (!this.zzc.zzU) {
            return;
        }
        if (this.zzb == null) {
            return;
        }
        if (!com.google.android.gms.ads.internal.zzt.zzA().zzj(this.zza)) {
            return;
        }
        zzcag zzcagVar = this.zzd;
        String str = zzcagVar.zzb + "." + zzcagVar.zzc;
        String zza = this.zzc.zzW.zza();
        if (this.zzc.zzW.zzb() == 1) {
            zzedhVar = zzedh.VIDEO;
            zzediVar = zzedi.DEFINED_BY_JAVASCRIPT;
        } else {
            zzedhVar = zzedh.HTML_DISPLAY;
            if (this.zzc.zzf == 1) {
                zzediVar = zzedi.ONE_PIXEL;
            } else {
                zzediVar = zzedi.BEGIN_TO_RENDER;
            }
        }
        zzfip zza2 = com.google.android.gms.ads.internal.zzt.zzA().zza(str, this.zzb.zzG(), "", "javascript", zza, zzediVar, zzedhVar, this.zzc.zzam);
        this.zze = zza2;
        zzcfi zzcfiVar = this.zzb;
        if (zza2 != null) {
            com.google.android.gms.ads.internal.zzt.zzA().zzh(this.zze, (View) zzcfiVar);
            this.zzb.zzap(this.zze);
            com.google.android.gms.ads.internal.zzt.zzA().zzi(this.zze);
            this.zzf = true;
            this.zzb.zzd("onSdkLoaded", new androidx.collection.a());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcxc
    public final synchronized void zzq() {
        zzcfi zzcfiVar;
        if (!this.zzf) {
            zza();
        }
        if (this.zzc.zzU && this.zze != null && (zzcfiVar = this.zzb) != null) {
            zzcfiVar.zzd("onSdkImpression", new androidx.collection.a());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcxw
    public final synchronized void zzr() {
        if (this.zzf) {
            return;
        }
        zza();
    }
}
