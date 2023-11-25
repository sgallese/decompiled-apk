package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzdea {
    private final List zza;
    private final zzfik zzb;
    private boolean zzc;

    public zzdea(zzfbe zzfbeVar, zzfik zzfikVar) {
        this.zza = zzfbeVar.zzq;
        this.zzb = zzfikVar;
    }

    public final void zza() {
        if (!this.zzc) {
            this.zzb.zzd(this.zza);
            this.zzc = true;
        }
    }
}
