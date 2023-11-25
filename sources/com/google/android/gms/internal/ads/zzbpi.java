package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzbpi extends zzbok {
    private final Adapter zza;
    private final zzbvo zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbpi(Adapter adapter, zzbvo zzbvoVar) {
        this.zza = adapter;
        this.zzb = zzbvoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbol
    public final void zze() throws RemoteException {
        zzbvo zzbvoVar = this.zzb;
        if (zzbvoVar != null) {
            zzbvoVar.zze(ObjectWrapper.wrap(this.zza));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbol
    public final void zzf() throws RemoteException {
        zzbvo zzbvoVar = this.zzb;
        if (zzbvoVar != null) {
            zzbvoVar.zzf(ObjectWrapper.wrap(this.zza));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbol
    public final void zzg(int i10) throws RemoteException {
        zzbvo zzbvoVar = this.zzb;
        if (zzbvoVar != null) {
            zzbvoVar.zzg(ObjectWrapper.wrap(this.zza), i10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbol
    public final void zzo() throws RemoteException {
        zzbvo zzbvoVar = this.zzb;
        if (zzbvoVar != null) {
            zzbvoVar.zzi(ObjectWrapper.wrap(this.zza));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbol
    public final void zzp() throws RemoteException {
        zzbvo zzbvoVar = this.zzb;
        if (zzbvoVar != null) {
            zzbvoVar.zzj(ObjectWrapper.wrap(this.zza));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbol
    public final void zzt(zzbvt zzbvtVar) throws RemoteException {
        zzbvo zzbvoVar = this.zzb;
        if (zzbvoVar != null) {
            zzbvoVar.zzm(ObjectWrapper.wrap(this.zza), new zzbvp(zzbvtVar.zzf(), zzbvtVar.zze()));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbol
    public final void zzu() throws RemoteException {
        zzbvo zzbvoVar = this.zzb;
        if (zzbvoVar != null) {
            zzbvoVar.zzn(ObjectWrapper.wrap(this.zza));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbol
    public final void zzy() throws RemoteException {
        zzbvo zzbvoVar = this.zzb;
        if (zzbvoVar != null) {
            zzbvoVar.zzo(ObjectWrapper.wrap(this.zza));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbol
    public final void zzm() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbol
    public final void zzn() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbol
    public final void zzv() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbol
    public final void zzw() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbol
    public final void zzx() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbol
    public final void zzh(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbol
    public final void zzj(int i10) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbol
    public final void zzk(com.google.android.gms.ads.internal.client.zze zzeVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbol
    public final void zzl(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzbol
    public final void zzs(zzbvp zzbvpVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbol
    public final void zzi(int i10, String str) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbol
    public final void zzq(String str, String str2) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbol
    public final void zzr(zzbfq zzbfqVar, String str) throws RemoteException {
    }
}
