package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzekb extends com.google.android.gms.ads.internal.client.zzbm {
    private final zzeli zza;

    public zzekb(Context context, zzchd zzchdVar, zzfby zzfbyVar, zzdin zzdinVar, com.google.android.gms.ads.internal.client.zzbh zzbhVar) {
        zzelk zzelkVar = new zzelk(zzdinVar, zzchdVar.zzy());
        zzelkVar.zze(zzbhVar);
        this.zza = new zzeli(new zzelu(zzchdVar, context, zzelkVar, zzfbyVar), zzfbyVar.zzI());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final synchronized String zze() {
        return this.zza.zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final synchronized String zzf() {
        return this.zza.zzb();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final void zzg(com.google.android.gms.ads.internal.client.zzl zzlVar) throws RemoteException {
        this.zza.zzd(zzlVar, 1);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final synchronized void zzh(com.google.android.gms.ads.internal.client.zzl zzlVar, int i10) throws RemoteException {
        this.zza.zzd(zzlVar, i10);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final synchronized boolean zzi() throws RemoteException {
        return this.zza.zze();
    }
}
