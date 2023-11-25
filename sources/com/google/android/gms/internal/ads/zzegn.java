package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzegn implements zzedt {
    private final Context zza;
    private final zzdgm zzb;
    private zzbou zzc;
    private final zzcag zzd;

    public zzegn(Context context, zzdgm zzdgmVar, zzcag zzcagVar) {
        this.zza = context;
        this.zzb = zzdgmVar;
        this.zzd = zzcagVar;
    }

    @Override // com.google.android.gms.internal.ads.zzedt
    public final /* bridge */ /* synthetic */ Object zza(zzfbr zzfbrVar, zzfbe zzfbeVar, zzedq zzedqVar) throws zzfcf, zzehf {
        if (zzfbrVar.zza.zza.zzg.contains(Integer.toString(6))) {
            zzdic zzt = zzdic.zzt(this.zzc);
            if (zzfbrVar.zza.zza.zzg.contains(Integer.toString(zzt.zzc()))) {
                zzdie zze = this.zzb.zze(new zzcst(zzfbrVar, zzfbeVar, zzedqVar.zza), new zzdio(zzt), new zzdkf(null, null, this.zzc));
                ((zzefj) zzedqVar.zzc).zzc(zze.zzi());
                return zze.zza();
            }
            throw new zzehf(1, "No corresponding native ad listener");
        }
        throw new zzehf(2, "Unified must be used for RTB.");
    }

    @Override // com.google.android.gms.internal.ads.zzedt
    public final void zzb(zzfbr zzfbrVar, zzfbe zzfbeVar, zzedq zzedqVar) throws zzfcf {
        try {
            ((zzbqc) zzedqVar.zzb).zzq(zzfbeVar.zzaa);
            zzegl zzeglVar = null;
            if (this.zzd.zzc < ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzbE)).intValue()) {
                ((zzbqc) zzedqVar.zzb).zzm(zzfbeVar.zzV, zzfbeVar.zzw.toString(), zzfbrVar.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzegm(this, zzedqVar, zzeglVar), (zzbol) zzedqVar.zzc);
            } else {
                ((zzbqc) zzedqVar.zzb).zzn(zzfbeVar.zzV, zzfbeVar.zzw.toString(), zzfbrVar.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzegm(this, zzedqVar, zzeglVar), (zzbol) zzedqVar.zzc, zzfbrVar.zza.zza.zzi);
            }
        } catch (RemoteException e10) {
            throw new zzfcf(e10);
        }
    }
}
