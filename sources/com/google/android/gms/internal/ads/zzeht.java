package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public class zzeht extends zzeiu {
    private final zzdef zza;

    public zzeht(zzcwg zzcwgVar, zzddu zzdduVar, zzcxa zzcxaVar, zzcxp zzcxpVar, zzcxu zzcxuVar, zzcwv zzcwvVar, zzdbc zzdbcVar, zzdem zzdemVar, zzcyo zzcyoVar, zzdef zzdefVar, zzday zzdayVar) {
        super(zzcwgVar, zzdduVar, zzcxaVar, zzcxpVar, zzcxuVar, zzdbcVar, zzcyoVar, zzdemVar, zzdayVar, zzcwvVar);
        this.zza = zzdefVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeiu, com.google.android.gms.internal.ads.zzbol
    public final void zzs(zzbvp zzbvpVar) {
        this.zza.zza(zzbvpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzeiu, com.google.android.gms.internal.ads.zzbol
    public final void zzt(zzbvt zzbvtVar) throws RemoteException {
        this.zza.zza(new zzbvp(zzbvtVar.zzf(), zzbvtVar.zze()));
    }

    @Override // com.google.android.gms.internal.ads.zzeiu, com.google.android.gms.internal.ads.zzbol
    public final void zzu() throws RemoteException {
        this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzeiu, com.google.android.gms.internal.ads.zzbol
    public final void zzv() {
        this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzeiu, com.google.android.gms.internal.ads.zzbol
    public final void zzy() {
        this.zza.zzc();
    }
}
