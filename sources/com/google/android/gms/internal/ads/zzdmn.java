package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzdmn implements zzbir {
    private final zzbga zza;
    private final zzdnb zzb;
    private final zzgyn zzc;

    public zzdmn(zzdin zzdinVar, zzdic zzdicVar, zzdnb zzdnbVar, zzgyn zzgynVar) {
        this.zza = zzdinVar.zzc(zzdicVar.zzA());
        this.zzb = zzdnbVar;
        this.zzc = zzgynVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbir
    public final void zza(Object obj, Map map) {
        String str = (String) map.get("asset");
        try {
            this.zza.zze((zzbfq) this.zzc.zzb(), str);
        } catch (RemoteException e10) {
            zzcaa.zzk("Failed to call onCustomClick for asset " + str + ".", e10);
        }
    }

    public final void zzb() {
        if (this.zza == null) {
            return;
        }
        this.zzb.zzi("/nativeAdCustomClick", this);
    }
}
