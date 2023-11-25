package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzeij implements zzedt {
    private final Context zza;
    private final Executor zzb;
    private final zzdnv zzc;

    public zzeij(Context context, Executor executor, zzdnv zzdnvVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzdnvVar;
    }

    public static /* bridge */ /* synthetic */ Executor zzc(zzeij zzeijVar) {
        return zzeijVar.zzb;
    }

    public static final void zze(zzfbr zzfbrVar, zzfbe zzfbeVar, zzedq zzedqVar) {
        try {
            ((zzfcw) zzedqVar.zzb).zzk(zzfbrVar.zza.zza.zzd, zzfbeVar.zzw.toString());
        } catch (Exception e10) {
            zzcaa.zzk("Fail to load ad from adapter ".concat(String.valueOf(zzedqVar.zza)), e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzedt
    public final /* bridge */ /* synthetic */ Object zza(zzfbr zzfbrVar, zzfbe zzfbeVar, final zzedq zzedqVar) throws zzfcf, zzehf {
        zzdnr zze = this.zzc.zze(new zzcst(zzfbrVar, zzfbeVar, zzedqVar.zza), new zzdns(new zzdfy() { // from class: com.google.android.gms.internal.ads.zzeif
            @Override // com.google.android.gms.internal.ads.zzdfy
            public final void zza(boolean z10, Context context, zzcwv zzcwvVar) {
                zzedq zzedqVar2 = zzedq.this;
                try {
                    ((zzfcw) zzedqVar2.zzb).zzv(z10);
                    ((zzfcw) zzedqVar2.zzb).zzA();
                } catch (zzfcf e10) {
                    zzcaa.zzk("Cannot show rewarded video.", e10);
                    throw new zzdfx(e10.getCause());
                }
            }
        }));
        zze.zzd().zzo(new zzcns((zzfcw) zzedqVar.zzb), this.zzb);
        zzcxp zze2 = zze.zze();
        zzcwg zzb = zze.zzb();
        ((zzefk) zzedqVar.zzc).zzc(new zzeii(this, zze.zza(), zzb, zze2, zze.zzg()));
        return zze.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzedt
    public final void zzb(zzfbr zzfbrVar, zzfbe zzfbeVar, zzedq zzedqVar) throws zzfcf {
        if (!((zzfcw) zzedqVar.zzb).zzC()) {
            ((zzefk) zzedqVar.zzc).zzd(new zzeih(this, zzfbrVar, zzfbeVar, zzedqVar));
            ((zzfcw) zzedqVar.zzb).zzh(this.zza, zzfbrVar.zza.zza.zzd, null, (zzbvo) zzedqVar.zzc, zzfbeVar.zzw.toString());
            return;
        }
        zze(zzfbrVar, zzfbeVar, zzedqVar);
    }
}
