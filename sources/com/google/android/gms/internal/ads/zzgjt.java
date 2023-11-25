package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzgjt {
    public static final zzgjt zza = new zzgjr().zza();
    private final Map zzb;

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgjt)) {
            return false;
        }
        return this.zzb.equals(((zzgjt) obj).zzb);
    }

    public final int hashCode() {
        return this.zzb.hashCode();
    }

    public final String toString() {
        return this.zzb.toString();
    }

    public final Map zza() {
        return this.zzb;
    }
}
