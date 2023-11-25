package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzfdz implements zzfdx {
    private final String zza;

    public zzfdz(String str) {
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzfdx
    public final boolean equals(Object obj) {
        if (!(obj instanceof zzfdz)) {
            return false;
        }
        return this.zza.equals(((zzfdz) obj).zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfdx
    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final String toString() {
        return this.zza;
    }
}
