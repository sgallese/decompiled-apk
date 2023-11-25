package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzger extends zzgaw {
    private final zzgeq zza;

    private zzger(zzgeq zzgeqVar) {
        this.zza = zzgeqVar;
    }

    public static zzger zzb(zzgeq zzgeqVar) {
        return new zzger(zzgeqVar);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzger) || ((zzger) obj).zza != this.zza) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{zzger.class, this.zza});
    }

    public final String toString() {
        return "XChaCha20Poly1305 Parameters (variant: " + this.zza.toString() + ")";
    }

    public final zzgeq zza() {
        return this.zza;
    }
}
