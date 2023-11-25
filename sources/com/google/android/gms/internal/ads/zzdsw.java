package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzdsw implements zzdsg {
    private final long zza;
    private final zzdsl zzb;
    private final zzfav zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdsw(long j10, Context context, zzdsl zzdslVar, zzchd zzchdVar, String str) {
        this.zza = j10;
        this.zzb = zzdslVar;
        zzfax zzv = zzchdVar.zzv();
        zzv.zzb(context);
        zzv.zza(str);
        this.zzc = zzv.zzc().zza();
    }

    @Override // com.google.android.gms.internal.ads.zzdsg
    public final void zzb(com.google.android.gms.ads.internal.client.zzl zzlVar) {
        try {
            this.zzc.zzf(zzlVar, new zzdsu(this));
        } catch (RemoteException e10) {
            zzcaa.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdsg
    public final void zzc() {
        try {
            this.zzc.zzk(new zzdsv(this));
            this.zzc.zzm(ObjectWrapper.wrap(null));
        } catch (RemoteException e10) {
            zzcaa.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdsg
    public final void zza() {
    }
}
