package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzefu implements zzedt {
    private final Context zza;
    private final zzdfq zzb;
    private final zzcag zzc;
    private final Executor zzd;

    public zzefu(Context context, zzcag zzcagVar, zzdfq zzdfqVar, Executor executor) {
        this.zza = context;
        this.zzc = zzcagVar;
        this.zzb = zzdfqVar;
        this.zzd = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzedt
    public final /* bridge */ /* synthetic */ Object zza(zzfbr zzfbrVar, zzfbe zzfbeVar, final zzedq zzedqVar) throws zzfcf, zzehf {
        zzdeq zze = this.zzb.zze(new zzcst(zzfbrVar, zzfbeVar, zzedqVar.zza), new zzdet(new zzdfy() { // from class: com.google.android.gms.internal.ads.zzeft
            @Override // com.google.android.gms.internal.ads.zzdfy
            public final void zza(boolean z10, Context context, zzcwv zzcwvVar) {
                zzefu.this.zzc(zzedqVar, z10, context, zzcwvVar);
            }
        }, null));
        zze.zzd().zzo(new zzcns((zzfcw) zzedqVar.zzb), this.zzd);
        ((zzefj) zzedqVar.zzc).zzc(zze.zzj());
        return zze.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzedt
    public final void zzb(zzfbr zzfbrVar, zzfbe zzfbeVar, zzedq zzedqVar) throws zzfcf {
        ((zzfcw) zzedqVar.zzb).zzo(this.zza, zzfbrVar.zza.zza.zzd, zzfbeVar.zzw.toString(), com.google.android.gms.ads.internal.util.zzbu.zzl(zzfbeVar.zzt), (zzbol) zzedqVar.zzc);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzc(zzedq zzedqVar, boolean z10, Context context, zzcwv zzcwvVar) throws zzdfx {
        try {
            ((zzfcw) zzedqVar.zzb).zzv(z10);
            if (this.zzc.zzc < ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzaF)).intValue()) {
                ((zzfcw) zzedqVar.zzb).zzx();
            } else {
                ((zzfcw) zzedqVar.zzb).zzy(context);
            }
        } catch (zzfcf e10) {
            zzcaa.zzi("Cannot show interstitial.");
            throw new zzdfx(e10.getCause());
        }
    }
}
