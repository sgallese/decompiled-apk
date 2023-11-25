package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzgjr {
    private HashMap zza = new HashMap();

    public final zzgjt zza() {
        if (this.zza != null) {
            zzgjt zzgjtVar = new zzgjt(Collections.unmodifiableMap(this.zza), null);
            this.zza = null;
            return zzgjtVar;
        }
        throw new IllegalStateException("cannot call build() twice");
    }
}
