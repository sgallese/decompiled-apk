package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.Preconditions;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzbjk implements zzbir {
    private final zzdue zza;

    public zzbjk(zzdue zzdueVar) {
        Preconditions.checkNotNull(zzdueVar, "The Inspector Manager must not be null");
        this.zza = zzdueVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbir
    public final void zza(Object obj, Map map) {
        if (map != null && map.containsKey("extras")) {
            long j10 = Long.MAX_VALUE;
            if (map.containsKey("expires")) {
                try {
                    j10 = Long.parseLong((String) map.get("expires"));
                } catch (NumberFormatException unused) {
                }
            }
            this.zza.zzi((String) map.get("extras"), j10);
        }
    }
}
