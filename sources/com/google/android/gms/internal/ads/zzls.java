package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
@Deprecated
/* loaded from: classes3.dex */
public final class zzls {
    private final zziv zza;

    @Deprecated
    public zzls(Context context, zzcer zzcerVar) {
        this.zza = new zziv(context, zzcerVar);
    }

    @Deprecated
    public final zzls zza(final zzko zzkoVar) {
        zziv zzivVar = this.zza;
        zzdy.zzf(!zzivVar.zzq);
        zzkoVar.getClass();
        zzivVar.zzf = new zzfry() { // from class: com.google.android.gms.internal.ads.zzin
            @Override // com.google.android.gms.internal.ads.zzfry
            public final Object zza() {
                return zzko.this;
            }
        };
        return this;
    }

    @Deprecated
    public final zzls zzb(final zzxl zzxlVar) {
        zziv zzivVar = this.zza;
        zzdy.zzf(!zzivVar.zzq);
        zzxlVar.getClass();
        zzivVar.zze = new zzfry() { // from class: com.google.android.gms.internal.ads.zzio
            @Override // com.google.android.gms.internal.ads.zzfry
            public final Object zza() {
                return zzxl.this;
            }
        };
        return this;
    }

    @Deprecated
    public final zzlt zzc() {
        zziv zzivVar = this.zza;
        zzdy.zzf(!zzivVar.zzq);
        zzivVar.zzq = true;
        return new zzlt(zzivVar);
    }
}
