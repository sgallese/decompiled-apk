package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzdbe implements zzczd {
    private int zza = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzbe)).intValue();

    @Override // com.google.android.gms.internal.ads.zzczd
    public final synchronized void zzbs(zzfbr zzfbrVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzbf)).booleanValue()) {
            try {
                this.zza = zzfbrVar.zzb.zzb.zzc;
            } catch (NullPointerException unused) {
            }
        }
    }

    public final synchronized int zzc() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzczd
    public final void zzbr(zzbun zzbunVar) {
    }
}
