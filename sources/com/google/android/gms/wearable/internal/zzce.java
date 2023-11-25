package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-wearable@@18.1.0 */
/* loaded from: classes3.dex */
public final class zzce extends zzfl {
    private final Object zza = new Object();
    private zzcf zzb;
    private zzbi zzc;

    @Override // com.google.android.gms.wearable.internal.zzfm
    public final void zzb(int i10, int i11) {
        zzcf zzcfVar;
        zzbi zzbiVar;
        synchronized (this.zza) {
            zzcfVar = this.zzb;
            zzbiVar = new zzbi(i10, i11);
            this.zzc = zzbiVar;
        }
        if (zzcfVar != null) {
            zzcfVar.zza(zzbiVar);
        }
    }

    public final void zzc(zzcf zzcfVar) {
        zzbi zzbiVar;
        synchronized (this.zza) {
            this.zzb = (zzcf) Preconditions.checkNotNull(zzcfVar);
            zzbiVar = this.zzc;
        }
        if (zzbiVar != null) {
            zzcfVar.zza(zzbiVar);
        }
    }
}
