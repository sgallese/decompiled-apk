package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzeeg implements zzedt {
    private final Context zza;
    private final zzcpq zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzeeg(Context context, zzcpq zzcpqVar) {
        this.zza = context;
        this.zzb = zzcpqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzedt
    public final /* bridge */ /* synthetic */ Object zza(zzfbr zzfbrVar, zzfbe zzfbeVar, zzedq zzedqVar) throws zzfcf, zzehf {
        zzefs zzefsVar = new zzefs(zzfbeVar, (zzbqc) zzedqVar.zzb, AdFormat.APP_OPEN_AD);
        zzcpn zza = this.zzb.zza(new zzcst(zzfbrVar, zzfbeVar, zzedqVar.zza), new zzdet(zzefsVar, null), new zzcpo(zzfbeVar.zzab));
        zzefsVar.zzb(zza.zzc());
        ((zzefj) zzedqVar.zzc).zzc(zza.zzi());
        return zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzedt
    public final void zzb(zzfbr zzfbrVar, zzfbe zzfbeVar, zzedq zzedqVar) throws zzfcf {
        try {
            ((zzbqc) zzedqVar.zzb).zzq(zzfbeVar.zzaa);
            ((zzbqc) zzedqVar.zzb).zzi(zzfbeVar.zzV, zzfbeVar.zzw.toString(), zzfbrVar.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzeef(zzedqVar, null), (zzbol) zzedqVar.zzc);
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.zze.zzb("Remote exception loading an app open RTB ad", e10);
            throw new zzfcf(e10);
        }
    }
}
