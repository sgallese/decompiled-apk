package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzefy implements zzedt {
    private final Context zza;
    private final zzdfq zzb;

    public zzefy(Context context, zzdfq zzdfqVar) {
        this.zza = context;
        this.zzb = zzdfqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzedt
    public final /* bridge */ /* synthetic */ Object zza(zzfbr zzfbrVar, zzfbe zzfbeVar, zzedq zzedqVar) throws zzfcf, zzehf {
        zzefs zzefsVar = new zzefs(zzfbeVar, (zzbqc) zzedqVar.zzb, AdFormat.INTERSTITIAL);
        zzdeq zze = this.zzb.zze(new zzcst(zzfbrVar, zzfbeVar, zzedqVar.zza), new zzdet(zzefsVar, null));
        zzefsVar.zzb(zze.zzc());
        ((zzefj) zzedqVar.zzc).zzc(zze.zzi());
        return zze.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzedt
    public final void zzb(zzfbr zzfbrVar, zzfbe zzfbeVar, zzedq zzedqVar) throws zzfcf {
        try {
            ((zzbqc) zzedqVar.zzb).zzq(zzfbeVar.zzaa);
            ((zzbqc) zzedqVar.zzb).zzl(zzfbeVar.zzV, zzfbeVar.zzw.toString(), zzfbrVar.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzefx(this, zzedqVar, null), (zzbol) zzedqVar.zzc);
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.zze.zzb("Remote exception loading a interstitial RTB ad", e10);
            throw new zzfcf(e10);
        }
    }
}
