package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzcdm extends com.google.android.gms.ads.internal.util.zzb {
    final zzccj zza;
    final zzcdu zzb;
    private final String zzc;
    private final String[] zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcdm(zzccj zzccjVar, zzcdu zzcduVar, String str, String[] strArr) {
        this.zza = zzccjVar;
        this.zzb = zzcduVar;
        this.zzc = str;
        this.zzd = strArr;
        com.google.android.gms.ads.internal.zzt.zzy().zzb(this);
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final void zza() {
        try {
            this.zzb.zzu(this.zzc, this.zzd);
        } finally {
            com.google.android.gms.ads.internal.util.zzs.zza.post(new zzcdl(this));
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final com.google.common.util.concurrent.a zzb() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzbT)).booleanValue() && (this.zzb instanceof zzced)) {
            return zzcan.zze.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzcdk
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return zzcdm.this.zzd();
                }
            });
        }
        return super.zzb();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ Boolean zzd() throws Exception {
        return Boolean.valueOf(this.zzb.zzw(this.zzc, this.zzd, this));
    }

    public final String zze() {
        return this.zzc;
    }
}
