package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzesc implements zzesj {
    private final boolean zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzesc(zzeyz zzeyzVar) {
        boolean z10;
        if (zzeyzVar != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.zza = z10;
    }

    @Override // com.google.android.gms.internal.ads.zzesj
    public final int zza() {
        return 36;
    }

    @Override // com.google.android.gms.internal.ads.zzesj
    public final com.google.common.util.concurrent.a zzb() {
        zzesb zzesbVar;
        if (this.zza) {
            zzesbVar = new zzesi() { // from class: com.google.android.gms.internal.ads.zzesb
                @Override // com.google.android.gms.internal.ads.zzesi
                public final void zzj(Object obj) {
                    ((Bundle) obj).putBoolean("sdk_prefetch", true);
                }
            };
        } else {
            zzesbVar = null;
        }
        return zzfye.zzh(zzesbVar);
    }
}
