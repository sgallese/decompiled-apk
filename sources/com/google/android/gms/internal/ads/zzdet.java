package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public class zzdet {
    private final zzdfy zza;
    private final zzcfi zzb;

    public zzdet(zzdfy zzdfyVar, zzcfi zzcfiVar) {
        this.zza = zzdfyVar;
        this.zzb = zzcfiVar;
    }

    public static final zzddo zzh(zzfhd zzfhdVar) {
        return new zzddo(zzfhdVar, zzcan.zzf);
    }

    public static final zzddo zzi(zzdgd zzdgdVar) {
        return new zzddo(zzdgdVar, zzcan.zzf);
    }

    public final View zza() {
        zzcfi zzcfiVar = this.zzb;
        if (zzcfiVar == null) {
            return null;
        }
        return zzcfiVar.zzG();
    }

    public final View zzb() {
        zzcfi zzcfiVar = this.zzb;
        if (zzcfiVar != null) {
            return zzcfiVar.zzG();
        }
        return null;
    }

    public final zzcfi zzc() {
        return this.zzb;
    }

    public final zzddo zzd(Executor executor) {
        final zzcfi zzcfiVar = this.zzb;
        return new zzddo(new zzdav() { // from class: com.google.android.gms.internal.ads.zzder
            @Override // com.google.android.gms.internal.ads.zzdav
            public final void zza() {
                com.google.android.gms.ads.internal.overlay.zzl zzL;
                zzcfi zzcfiVar2 = zzcfi.this;
                if (zzcfiVar2 != null && (zzL = zzcfiVar2.zzL()) != null) {
                    zzL.zzb();
                }
            }
        }, executor);
    }

    public final zzdfy zze() {
        return this.zza;
    }

    public Set zzf(zzcvf zzcvfVar) {
        return Collections.singleton(new zzddo(zzcvfVar, zzcan.zzf));
    }

    public Set zzg(zzcvf zzcvfVar) {
        return Collections.singleton(new zzddo(zzcvfVar, zzcan.zzf));
    }
}
