package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzchk implements zzgyt {
    private final zzchg zza;

    public zzchk(zzchg zzchgVar) {
        this.zza = zzchgVar;
    }

    public final WeakReference zza() {
        WeakReference zzf = this.zza.zzf();
        zzgzb.zzb(zzf);
        return zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzgzg
    public final /* synthetic */ Object zzb() {
        WeakReference zzf = this.zza.zzf();
        zzgzb.zzb(zzf);
        return zzf;
    }
}
