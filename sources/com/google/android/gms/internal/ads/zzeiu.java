package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public class zzeiu extends zzbok {
    private final zzcwg zza;
    private final zzddu zzb;
    private final zzcxa zzc;
    private final zzcxp zzd;
    private final zzcxu zze;
    private final zzdbc zzf;
    private final zzcyo zzg;
    private final zzdem zzh;
    private final zzday zzi;
    private final zzcwv zzj;

    public zzeiu(zzcwg zzcwgVar, zzddu zzdduVar, zzcxa zzcxaVar, zzcxp zzcxpVar, zzcxu zzcxuVar, zzdbc zzdbcVar, zzcyo zzcyoVar, zzdem zzdemVar, zzday zzdayVar, zzcwv zzcwvVar) {
        this.zza = zzcwgVar;
        this.zzb = zzdduVar;
        this.zzc = zzcxaVar;
        this.zzd = zzcxpVar;
        this.zze = zzcxuVar;
        this.zzf = zzdbcVar;
        this.zzg = zzcyoVar;
        this.zzh = zzdemVar;
        this.zzi = zzdayVar;
        this.zzj = zzcwvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbol
    public final void zze() {
        this.zza.onAdClicked();
        this.zzb.zzbK();
    }

    @Override // com.google.android.gms.internal.ads.zzbol
    public final void zzf() {
        this.zzg.zzby(4);
    }

    @Override // com.google.android.gms.internal.ads.zzbol
    @Deprecated
    public final void zzj(int i10) throws RemoteException {
        zzk(new com.google.android.gms.ads.internal.client.zze(i10, "", AdError.UNDEFINED_DOMAIN, null, null));
    }

    @Override // com.google.android.gms.internal.ads.zzbol
    public final void zzk(com.google.android.gms.ads.internal.client.zze zzeVar) {
        this.zzj.zza(zzfdb.zzc(8, zzeVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbol
    public final void zzl(String str) {
        zzk(new com.google.android.gms.ads.internal.client.zze(0, str, AdError.UNDEFINED_DOMAIN, null, null));
    }

    public void zzm() {
        this.zzc.zza();
        this.zzi.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbol
    public final void zzn() {
        this.zzd.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbol
    public final void zzo() {
        this.zze.zzr();
    }

    @Override // com.google.android.gms.internal.ads.zzbol
    public final void zzp() {
        this.zzg.zzbv();
        this.zzi.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbol
    public final void zzq(String str, String str2) {
        this.zzf.zzb(str, str2);
    }

    public void zzv() {
        this.zzh.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbol
    public final void zzw() {
        this.zzh.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbol
    public final void zzx() throws RemoteException {
        this.zzh.zzc();
    }

    public void zzy() {
        this.zzh.zzd();
    }

    public void zzu() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbol
    public final void zzg(int i10) {
    }

    @Override // com.google.android.gms.internal.ads.zzbol
    public final void zzh(com.google.android.gms.ads.internal.client.zze zzeVar) {
    }

    public void zzs(zzbvp zzbvpVar) {
    }

    public void zzt(zzbvt zzbvtVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbol
    public final void zzi(int i10, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzbol
    public final void zzr(zzbfq zzbfqVar, String str) {
    }
}
