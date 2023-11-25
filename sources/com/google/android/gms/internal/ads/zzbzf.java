package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzbzf extends com.google.android.gms.ads.internal.util.zzb {
    final /* synthetic */ zzbzj zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbzf(zzbzj zzbzjVar) {
        this.zza = zzbzjVar;
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final void zza() {
        Context context;
        zzcag zzcagVar;
        Object obj;
        zzbbz zzbbzVar;
        zzbzj zzbzjVar = this.zza;
        context = zzbzjVar.zze;
        zzcagVar = zzbzjVar.zzf;
        zzbbx zzbbxVar = new zzbbx(context, zzcagVar.zza);
        obj = this.zza.zza;
        synchronized (obj) {
            try {
                com.google.android.gms.ads.internal.zzt.zze();
                zzbbzVar = this.zza.zzh;
                zzbca.zza(zzbbzVar, zzbbxVar);
            } catch (IllegalArgumentException e10) {
                zzcaa.zzk("Cannot config CSI reporter.", e10);
            }
        }
    }
}
