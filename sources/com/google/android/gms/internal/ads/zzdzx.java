package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzdzx implements zzfya {
    final /* synthetic */ zzbug zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdzx(zzdzy zzdzyVar, zzbug zzbugVar) {
        this.zza = zzbugVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfya
    public final void zza(Throwable th) {
        try {
            this.zza.zze(com.google.android.gms.ads.internal.util.zzaz.zzb(th));
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.zze.zzb("Ad service can't call client", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfya
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        try {
            this.zza.zzf((ParcelFileDescriptor) obj);
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.zze.zzb("Ad service can't call client", e10);
        }
    }
}
