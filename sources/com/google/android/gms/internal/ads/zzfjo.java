package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzfjo implements zzfji {
    private static zzfjo zza;
    private float zzb = 0.0f;
    private final zzfje zzc;
    private final zzfjc zzd;
    private zzfjd zze;
    private zzfjh zzf;

    public zzfjo(zzfje zzfjeVar, zzfjc zzfjcVar) {
        this.zzc = zzfjeVar;
        this.zzd = zzfjcVar;
    }

    public static zzfjo zzb() {
        if (zza == null) {
            zza = new zzfjo(new zzfje(), new zzfjc());
        }
        return zza;
    }

    public final float zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfji
    public final void zzc(boolean z10) {
        if (z10) {
            zzfko.zzd().zzi();
        } else {
            zzfko.zzd().zzh();
        }
    }

    public final void zzd(Context context) {
        this.zze = new zzfjd(new Handler(), context, new zzfjb(), this);
    }

    public final void zze(float f10) {
        this.zzb = f10;
        if (this.zzf == null) {
            this.zzf = zzfjh.zza();
        }
        Iterator it = this.zzf.zzb().iterator();
        while (it.hasNext()) {
            ((zzfit) it.next()).zzg().zzi(f10);
        }
    }

    public final void zzf() {
        zzfjg.zza().zze(this);
        zzfjg.zza().zzf();
        zzfko.zzd().zzi();
        this.zze.zza();
    }

    public final void zzg() {
        zzfko.zzd().zzj();
        zzfjg.zza().zzg();
        this.zze.zzb();
    }
}
