package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzdsr extends com.google.android.gms.ads.internal.client.zzbg {
    final /* synthetic */ zzdsl zza;
    final /* synthetic */ zzdss zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdsr(zzdss zzdssVar, zzdsl zzdslVar) {
        this.zzb = zzdssVar;
        this.zza = zzdslVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzc() throws RemoteException {
        long j10;
        zzdsl zzdslVar = this.zza;
        j10 = this.zzb.zza;
        zzdslVar.zzb(j10);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzd() throws RemoteException {
        long j10;
        zzdsl zzdslVar = this.zza;
        j10 = this.zzb.zza;
        zzdslVar.zzc(j10);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zze(int i10) throws RemoteException {
        long j10;
        zzdsl zzdslVar = this.zza;
        j10 = this.zzb.zza;
        zzdslVar.zzd(j10, i10);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        long j10;
        zzdsl zzdslVar = this.zza;
        j10 = this.zzb.zza;
        zzdslVar.zzd(j10, zzeVar.zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzi() throws RemoteException {
        long j10;
        zzdsl zzdslVar = this.zza;
        j10 = this.zzb.zza;
        zzdslVar.zze(j10);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzj() throws RemoteException {
        long j10;
        zzdsl zzdslVar = this.zza;
        j10 = this.zzb.zza;
        zzdslVar.zzg(j10);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzg() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzh() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzk() {
    }
}
