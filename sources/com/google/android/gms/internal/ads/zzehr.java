package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzehr implements zzedt {
    private final Context zza;
    private final zzdnv zzb;

    public zzehr(Context context, zzdnv zzdnvVar) {
        this.zza = context;
        this.zzb = zzdnvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzedt
    public final /* bridge */ /* synthetic */ Object zza(zzfbr zzfbrVar, zzfbe zzfbeVar, zzedq zzedqVar) throws zzfcf, zzehf {
        zzefs zzefsVar = new zzefs(zzfbeVar, (zzbqc) zzedqVar.zzb, AdFormat.REWARDED);
        zzdnr zze = this.zzb.zze(new zzcst(zzfbrVar, zzfbeVar, zzedqVar.zza), new zzdns(zzefsVar));
        zzefsVar.zzb(zze.zzc());
        ((zzefj) zzedqVar.zzc).zzc(zze.zzn());
        return zze.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzedt
    public final void zzb(zzfbr zzfbrVar, zzfbe zzfbeVar, zzedq zzedqVar) throws zzfcf {
        try {
            ((zzbqc) zzedqVar.zzb).zzq(zzfbeVar.zzaa);
            zzehp zzehpVar = null;
            if (zzfbrVar.zza.zza.zzo.zza == 3) {
                ((zzbqc) zzedqVar.zzb).zzo(zzfbeVar.zzV, zzfbeVar.zzw.toString(), zzfbrVar.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzehq(this, zzedqVar, zzehpVar), (zzbol) zzedqVar.zzc);
            } else {
                ((zzbqc) zzedqVar.zzb).zzp(zzfbeVar.zzV, zzfbeVar.zzw.toString(), zzfbrVar.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzehq(this, zzedqVar, zzehpVar), (zzbol) zzedqVar.zzc);
            }
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.zze.zzb("Remote exception loading a rewarded RTB ad", e10);
        }
    }
}
