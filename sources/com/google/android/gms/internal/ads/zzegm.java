package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzegm extends zzbpv {
    final /* synthetic */ zzegn zza;
    private final zzedq zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzegm(zzegn zzegnVar, zzedq zzedqVar, zzegl zzeglVar) {
        this.zza = zzegnVar;
        this.zzb = zzedqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpw
    public final void zze(String str) throws RemoteException {
        ((zzefj) this.zzb.zzc).zzi(0, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbpw
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        ((zzefj) this.zzb.zzc).zzh(zzeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbpw
    public final void zzg(zzbou zzbouVar) throws RemoteException {
        zzegn.zzc(this.zza, zzbouVar);
        ((zzefj) this.zzb.zzc).zzo();
    }
}
