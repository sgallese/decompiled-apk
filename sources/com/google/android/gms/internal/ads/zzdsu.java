package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzdsu extends zzbwc {
    final /* synthetic */ zzdsw zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdsu(zzdsw zzdswVar) {
        this.zza = zzdswVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbwd
    public final void zze(int i10) throws RemoteException {
        zzdsl zzdslVar;
        long j10;
        zzdsw zzdswVar = this.zza;
        zzdslVar = zzdswVar.zzb;
        j10 = zzdswVar.zza;
        zzdslVar.zzm(j10, i10);
    }

    @Override // com.google.android.gms.internal.ads.zzbwd
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        zzdsl zzdslVar;
        long j10;
        zzdsw zzdswVar = this.zza;
        zzdslVar = zzdswVar.zzb;
        j10 = zzdswVar.zza;
        zzdslVar.zzm(j10, zzeVar.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwd
    public final void zzg() throws RemoteException {
        zzdsl zzdslVar;
        long j10;
        zzdsw zzdswVar = this.zza;
        zzdslVar = zzdswVar.zzb;
        j10 = zzdswVar.zza;
        zzdslVar.zzp(j10);
    }
}
