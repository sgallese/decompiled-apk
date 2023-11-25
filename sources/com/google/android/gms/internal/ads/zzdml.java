package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzdml extends zzbgs {
    private final String zza;
    private final zzdhx zzb;
    private final zzdic zzc;
    private final zzdrh zzd;

    public zzdml(String str, zzdhx zzdhxVar, zzdic zzdicVar, zzdrh zzdrhVar) {
        this.zza = str;
        this.zzb = zzdhxVar;
        this.zzc = zzdicVar;
        this.zzd = zzdrhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbgt
    public final void zzA() {
        this.zzb.zzF();
    }

    @Override // com.google.android.gms.internal.ads.zzbgt
    public final void zzB(Bundle bundle) throws RemoteException {
        this.zzb.zzJ(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzbgt
    public final void zzC() {
        this.zzb.zzL();
    }

    @Override // com.google.android.gms.internal.ads.zzbgt
    public final void zzD(com.google.android.gms.ads.internal.client.zzcs zzcsVar) throws RemoteException {
        this.zzb.zzM(zzcsVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbgt
    public final void zzE(com.google.android.gms.ads.internal.client.zzdg zzdgVar) throws RemoteException {
        try {
            if (!zzdgVar.zzf()) {
                this.zzd.zze();
            }
        } catch (RemoteException e10) {
            zzcaa.zzf("Error in making CSI ping for reporting paid event callback", e10);
        }
        this.zzb.zzN(zzdgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbgt
    public final void zzF(zzbgq zzbgqVar) throws RemoteException {
        this.zzb.zzO(zzbgqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbgt
    public final boolean zzG() {
        return this.zzb.zzT();
    }

    @Override // com.google.android.gms.internal.ads.zzbgt
    public final boolean zzH() throws RemoteException {
        if (!this.zzc.zzH().isEmpty() && this.zzc.zzk() != null) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbgt
    public final boolean zzI(Bundle bundle) throws RemoteException {
        return this.zzb.zzW(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzbgt
    public final double zze() throws RemoteException {
        return this.zzc.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbgt
    public final Bundle zzf() throws RemoteException {
        return this.zzc.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzbgt
    public final com.google.android.gms.ads.internal.client.zzdn zzg() throws RemoteException {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzgF)).booleanValue()) {
            return null;
        }
        return this.zzb.zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzbgt
    public final com.google.android.gms.ads.internal.client.zzdq zzh() throws RemoteException {
        return this.zzc.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzbgt
    public final zzbeo zzi() throws RemoteException {
        return this.zzc.zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzbgt
    public final zzbet zzj() throws RemoteException {
        return this.zzb.zzc().zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbgt
    public final zzbew zzk() throws RemoteException {
        return this.zzc.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzbgt
    public final IObjectWrapper zzl() throws RemoteException {
        return this.zzc.zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzbgt
    public final IObjectWrapper zzm() throws RemoteException {
        return ObjectWrapper.wrap(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzbgt
    public final String zzn() throws RemoteException {
        return this.zzc.zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzbgt
    public final String zzo() throws RemoteException {
        return this.zzc.zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzbgt
    public final String zzp() throws RemoteException {
        return this.zzc.zzz();
    }

    @Override // com.google.android.gms.internal.ads.zzbgt
    public final String zzq() throws RemoteException {
        return this.zzc.zzB();
    }

    @Override // com.google.android.gms.internal.ads.zzbgt
    public final String zzr() throws RemoteException {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbgt
    public final String zzs() throws RemoteException {
        return this.zzc.zzD();
    }

    @Override // com.google.android.gms.internal.ads.zzbgt
    public final String zzt() throws RemoteException {
        return this.zzc.zzE();
    }

    @Override // com.google.android.gms.internal.ads.zzbgt
    public final List zzu() throws RemoteException {
        return this.zzc.zzG();
    }

    @Override // com.google.android.gms.internal.ads.zzbgt
    public final List zzv() throws RemoteException {
        if (zzH()) {
            return this.zzc.zzH();
        }
        return Collections.emptyList();
    }

    @Override // com.google.android.gms.internal.ads.zzbgt
    public final void zzw() throws RemoteException {
        this.zzb.zzt();
    }

    @Override // com.google.android.gms.internal.ads.zzbgt
    public final void zzx() throws RemoteException {
        this.zzb.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbgt
    public final void zzy(com.google.android.gms.ads.internal.client.zzcw zzcwVar) throws RemoteException {
        this.zzb.zzA(zzcwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbgt
    public final void zzz(Bundle bundle) throws RemoteException {
        this.zzb.zzE(bundle);
    }
}
